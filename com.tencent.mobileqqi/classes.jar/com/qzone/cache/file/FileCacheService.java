package com.qzone.cache.file;

import android.content.Context;
import android.os.StatFs;
import android.text.TextUtils;
import com.qzone.cache.CacheManager;
import com.qzone.common.logging.QDLog;
import com.qzone.download.DownloaderFactory;
import com.qzone.utils.FileUtil;
import com.qzone.utils.thread.ThreadPool;
import com.qzone.utils.thread.ThreadPool.Job;
import com.qzone.utils.thread.ThreadPool.JobContext;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

public class FileCacheService
{
  private static final String DIR_NAME = "file";
  private static final long MEGABYTES = 1048576L;
  private static final int STORAGE_CHECK_INTERVAL = 3;
  private static final long STORAGE_LOW_BOUNDS = 10485760L;
  private static Comparator<FileEntry> sFileComparator = new Comparator()
  {
    public int compare(FileCacheService.FileEntry paramAnonymousFileEntry1, FileCacheService.FileEntry paramAnonymousFileEntry2)
    {
      if (paramAnonymousFileEntry1.lastModified < paramAnonymousFileEntry2.lastModified) {
        return -1;
      }
      if (paramAnonymousFileEntry1.lastModified == paramAnonymousFileEntry2.lastModified) {
        return 0;
      }
      return 1;
    }
  };
  private final Context mContext;
  private final FileCache<String> mExternalCache;
  private final FileCache<String> mInternalCache;
  private final String mName;
  private final boolean mPersist;
  private AtomicInteger mStorageCounter = new AtomicInteger(0);
  private StorageHandler mStorageHandler;
  
  public FileCacheService(Context paramContext, String paramString, int paramInt)
  {
    this(paramContext, paramString, paramInt, false);
  }
  
  public FileCacheService(Context paramContext, String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new NullPointerException("file cache: name can NOT be empty!");
    }
    this.mContext = paramContext.getApplicationContext();
    this.mName = ("file" + File.separator + paramString);
    this.mPersist = paramBoolean;
    int i = paramInt2;
    if (paramInt2 < 0) {
      i = 0;
    }
    if (paramInt1 > 0) {}
    for (;;)
    {
      this.mExternalCache = new FileCache(paramInt1);
      this.mInternalCache = new FileCache(i);
      init();
      return;
      paramInt1 = 2147483647;
    }
  }
  
  public FileCacheService(Context paramContext, String paramString, int paramInt, boolean paramBoolean)
  {
    this(paramContext, paramString, paramInt, 0, paramBoolean);
  }
  
  private File createFile(String paramString, boolean paramBoolean)
  {
    paramString = getPath(paramString, paramBoolean);
    if (paramString == null) {
      return null;
    }
    paramString = new File(paramString);
    if (!isFileValid(paramString)) {
      FileUtil.delete(paramString);
    }
    try
    {
      paramString.createNewFile();
      return paramString;
    }
    catch (IOException localIOException)
    {
      QDLog.e("FileCacheService", "", localIOException);
    }
    return paramString;
  }
  
  private void ensureCache(boolean paramBoolean)
  {
    label157:
    label178:
    for (;;)
    {
      String str;
      FileEntry[] arrayOfFileEntry;
      int i;
      int j;
      try
      {
        str = getDir(paramBoolean);
        FileCache localFileCache = getCache(paramBoolean);
        paramBoolean = TextUtils.isEmpty(str);
        if (paramBoolean) {
          return;
        }
        String[] arrayOfString = new File(str).list();
        if ((arrayOfString == null) || (arrayOfString.length == 0)) {
          continue;
        }
        arrayOfFileEntry = new FileEntry[arrayOfString.length];
        i = 0;
        if (i >= arrayOfFileEntry.length)
        {
          Arrays.sort(arrayOfFileEntry, sFileComparator);
          j = arrayOfFileEntry.length;
          i = 0;
          break label157;
        }
        arrayOfFileEntry[i] = new FileEntry(str, arrayOfString[i]);
        i += 1;
        continue;
        if (!str.isFile) {
          FileUtil.delete(str.path);
        }
      }
      finally {}
      localObject.put(str.name, str.path);
      for (;;)
      {
        if (i >= j) {
          break label178;
        }
        str = arrayOfFileEntry[i];
        if (str != null) {
          break;
        }
        i += 1;
      }
    }
  }
  
  private void ensureStorage(boolean paramBoolean)
  {
    if (this.mStorageCounter.getAndIncrement() < 3) {
      return;
    }
    this.mStorageCounter.set(0);
    for (Object localObject = new File(getDir(paramBoolean));; localObject = ((File)localObject).getParentFile()) {
      if (((File)localObject).exists())
      {
        localObject = new StatFs(((File)localObject).getAbsolutePath());
        long l1 = ((StatFs)localObject).getBlockCount();
        long l2 = ((StatFs)localObject).getBlockSize();
        long l3 = ((StatFs)localObject).getAvailableBlocks() * ((StatFs)localObject).getBlockSize();
        localObject = this.mStorageHandler;
        if ((l3 >= 10485760L) || (localObject == null)) {
          break;
        }
        ((StorageHandler)localObject).onLowStorage(this, l1 * l2, l3, paramBoolean);
        return;
      }
    }
  }
  
  private FileCache<String> getCache(boolean paramBoolean)
  {
    if (paramBoolean) {
      return this.mExternalCache;
    }
    return this.mInternalCache;
  }
  
  private String getDir(boolean paramBoolean)
  {
    if (paramBoolean) {
      return CacheManager.getExternalCacheDir(this.mContext, this.mName, this.mPersist);
    }
    return CacheManager.getInternalCacheDir(this.mContext, this.mName, this.mPersist);
  }
  
  private void init()
  {
    DownloaderFactory.getGlobalThreadPool().submit(new ThreadPool.Job()
    {
      public Object run(ThreadPool.JobContext paramAnonymousJobContext)
      {
        FileCacheService.this.ensureCache(false);
        FileCacheService.this.ensureCache(true);
        return null;
      }
    });
  }
  
  private static boolean isFileValid(File paramFile)
  {
    return (paramFile != null) && (paramFile.exists()) && (paramFile.isFile());
  }
  
  private boolean putFile(String paramString, boolean paramBoolean)
  {
    FileCache localFileCache = getCache(paramBoolean);
    Object localObject = getPath(paramString, paramBoolean);
    if (localObject == null) {}
    do
    {
      return false;
      localObject = new File((String)localObject);
      if (((File)localObject).isDirectory()) {
        FileUtil.delete((File)localObject);
      }
    } while (!isFileValid((File)localObject));
    localFileCache.put(paramString, ((File)localObject).getAbsolutePath());
    ensureStorage(paramBoolean);
    return true;
  }
  
  public void clear()
  {
    try
    {
      getCache(false).evictAll();
      getCache(true).evictAll();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void clear(boolean paramBoolean)
  {
    try
    {
      getCache(paramBoolean).evictAll();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void clear(boolean paramBoolean, int paramInt)
  {
    try
    {
      getCache(paramBoolean).trimToSize(paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void deleteFile(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    getCache(false).remove(paramString);
    getCache(true).remove(paramString);
    String str = getPath(paramString, false);
    paramString = getPath(paramString, true);
    FileUtil.delete(str);
    FileUtil.delete(paramString);
  }
  
  public int getCapacity(boolean paramBoolean)
  {
    if (paramBoolean) {
      return this.mExternalCache.maxSize();
    }
    return this.mInternalCache.maxSize();
  }
  
  public Context getContext()
  {
    return this.mContext;
  }
  
  public File getFile(String paramString)
  {
    return getFile(paramString, false);
  }
  
  public File getFile(String paramString, boolean paramBoolean)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    boolean bool = CacheManager.isExternalAvailable();
    Object localObject1 = (String)getCache(bool).get(paramString);
    Object localObject2;
    if (localObject1 == null)
    {
      localObject2 = null;
      localObject1 = localObject2;
      if (!isFileValid((File)localObject2))
      {
        localObject1 = localObject2;
        if (bool)
        {
          localObject1 = (String)getCache(false).get(paramString);
          if (localObject1 != null) {
            break label172;
          }
          localObject1 = null;
        }
      }
      label77:
      localObject2 = localObject1;
      if (paramBoolean)
      {
        localObject2 = localObject1;
        if (!isFileValid((File)localObject1))
        {
          localObject2 = createFile(paramString, bool);
          localObject1 = localObject2;
          if (!isFileValid((File)localObject2)) {
            localObject1 = createFile(paramString, false);
          }
          localObject2 = localObject1;
          if (isFileValid((File)localObject1))
          {
            putFile(paramString);
            localObject2 = localObject1;
          }
        }
      }
      if (!isFileValid((File)localObject2)) {
        break label186;
      }
    }
    for (;;)
    {
      return localObject2;
      localObject2 = new File((String)localObject1);
      break;
      label172:
      localObject1 = new File((String)localObject1);
      break label77;
      label186:
      localObject2 = null;
    }
  }
  
  public String getPath(String paramString)
  {
    return getPath(paramString, CacheManager.isExternalAvailable());
  }
  
  public String getPath(String paramString, boolean paramBoolean)
  {
    if (TextUtils.isEmpty(paramString)) {}
    String str;
    do
    {
      return null;
      str = getDir(paramBoolean);
    } while (str == null);
    return str + File.separator + paramString;
  }
  
  public int getSize(boolean paramBoolean)
  {
    if (paramBoolean) {
      return this.mExternalCache.size();
    }
    return this.mInternalCache.size();
  }
  
  public boolean isPersist()
  {
    return this.mPersist;
  }
  
  public boolean putFile(String paramString)
  {
    boolean bool1;
    if (TextUtils.isEmpty(paramString)) {
      bool1 = false;
    }
    boolean bool3;
    do
    {
      boolean bool2;
      do
      {
        return bool1;
        bool3 = CacheManager.isExternalAvailable();
        bool2 = putFile(paramString, bool3);
        bool1 = bool2;
      } while (bool2);
      bool1 = bool2;
    } while (!bool3);
    return putFile(paramString, false);
  }
  
  public void setStorageHandler(StorageHandler paramStorageHandler)
  {
    this.mStorageHandler = paramStorageHandler;
  }
  
  public String toString()
  {
    return "AlbumUtil#" + this.mName + "#capacity=" + getCapacity(true) + "," + getCapacity(false) + "#size=" + getSize(true) + "," + getSize(false);
  }
  
  private static class FileEntry
  {
    public final boolean isFile;
    public final long lastModified;
    public final String name;
    public final String path;
    
    public FileEntry(String paramString1, String paramString2)
    {
      paramString1 = new File(paramString1, paramString2);
      this.path = paramString1.getPath();
      this.name = paramString2;
      this.lastModified = paramString1.lastModified();
      this.isFile = true;
    }
  }
  
  public static abstract interface StorageHandler
  {
    public abstract void onLowStorage(FileCacheService paramFileCacheService, long paramLong1, long paramLong2, boolean paramBoolean);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     com.qzone.cache.file.FileCacheService
 * JD-Core Version:    0.7.0.1
 */
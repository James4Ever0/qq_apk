package com.tencent.mobileqq.activity.photo;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore.Images.Media;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import cif;
import cig;
import cih;
import cii;
import cij;
import com.tencent.image.URLDrawable;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.data.QQAlbumInfo;
import com.tencent.mobileqq.utils.AlbumUtil;
import com.tencent.mobileqq.utils.LogTag;
import com.tencent.qphone.base.util.QLog;
import com.tencent.util.VersionUtils;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AlbumListAdapter
  extends BaseAdapter
{
  private static final ColorDrawable jdField_a_of_type_AndroidGraphicsDrawableColorDrawable = new ColorDrawable(-2141891243);
  private static final String jdField_a_of_type_JavaLangString = "AlbumListAdapter";
  static String[] jdField_a_of_type_ArrayOfJavaLangString;
  private static final String jdField_b_of_type_JavaLangString = "_size>0 and (mime_type='image/jpeg' or mime_type='image/gif' or mime_type='image/bmp' or mime_type='image/png')) GROUP BY (1";
  private static final String[] jdField_b_of_type_ArrayOfJavaLangString = { "bucket_id", "bucket_display_name", "MAX(_id) as _id", "date_modified", "_data", "orientation", "mime_type", "COUNT(_data) as count" };
  private static final int jdField_c_of_type_Int = -1;
  private static final String jdField_c_of_type_JavaLangString = "date_modified DESC";
  private static final String[] jdField_c_of_type_ArrayOfJavaLangString;
  private static final int jdField_d_of_type_Int = 200;
  private static final String jdField_d_of_type_JavaLangString = "_id DESC";
  private static final int jdField_e_of_type_Int = 100;
  private static final String jdField_e_of_type_JavaLangString = "_size>0 and mime_type='video/mp4') GROUP BY (1";
  private static final String f = "date_modified DESC";
  private int jdField_a_of_type_Int;
  private Activity jdField_a_of_type_AndroidAppActivity;
  private Resources jdField_a_of_type_AndroidContentResResources;
  private Drawable.ConstantState jdField_a_of_type_AndroidGraphicsDrawableDrawable$ConstantState;
  private Handler jdField_a_of_type_AndroidOsHandler = new Handler();
  private IMediaFilter jdField_a_of_type_ComTencentMobileqqActivityPhotoIMediaFilter;
  private List jdField_a_of_type_JavaUtilList = new ArrayList();
  private int jdField_b_of_type_Int;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16) {}
    for (jdField_a_of_type_ArrayOfJavaLangString = new String[] { "_id", "_data", "mime_type", "date_modified", "orientation", "_size", "width" };; jdField_a_of_type_ArrayOfJavaLangString = new String[] { "_id", "_data", "mime_type", "date_modified", "orientation", "_size" })
    {
      c = new String[] { "bucket_id", "bucket_display_name", "MAX(_id) as _id", "date_modified", "_data", "mime_type", "COUNT(_data) as count" };
      return;
    }
  }
  
  public AlbumListAdapter(Activity paramActivity, IMediaFilter paramIMediaFilter)
  {
    this.jdField_a_of_type_AndroidAppActivity = paramActivity;
    this.jdField_a_of_type_AndroidContentResResources = paramActivity.getResources();
    this.jdField_a_of_type_ComTencentMobileqqActivityPhotoIMediaFilter = paramIMediaFilter;
    this.jdField_a_of_type_AndroidGraphicsDrawableDrawable$ConstantState = this.jdField_a_of_type_AndroidContentResResources.getDrawable(2130837716).getConstantState();
    this.jdField_a_of_type_Int = this.jdField_a_of_type_AndroidContentResResources.getDimensionPixelSize(2131492953);
    this.jdField_b_of_type_Int = this.jdField_a_of_type_Int;
    ThreadManager.a().post(new cif(this));
  }
  
  private static Cursor a(Context paramContext, String paramString, String[] paramArrayOfString, int paramInt)
  {
    if (paramInt > 0)
    {
      localObject = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.buildUpon();
      ((Uri.Builder)localObject).appendQueryParameter("limit", String.valueOf(paramInt));
    }
    for (Object localObject = ((Uri.Builder)localObject).build();; localObject = MediaStore.Images.Media.EXTERNAL_CONTENT_URI) {
      return paramContext.getContentResolver().query((Uri)localObject, jdField_a_of_type_ArrayOfJavaLangString, paramString, paramArrayOfString, "_id DESC");
    }
  }
  
  private LocalMediaInfo a(Cursor paramCursor, int paramInt)
  {
    LocalMediaInfo localLocalMediaInfo = new LocalMediaInfo();
    int i = paramCursor.getColumnIndexOrThrow("_data");
    int j = paramCursor.getColumnIndexOrThrow("_id");
    int k = paramCursor.getColumnIndexOrThrow("date_modified");
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    int[] arrayOfInt = new int[2];
    for (;;)
    {
      String str;
      long l;
      if (paramCursor.moveToNext())
      {
        str = paramCursor.getString(i);
        l = paramCursor.getLong(j);
        if ((str == null) || (str.length() <= 0)) {
          continue;
        }
        File localFile = new File(str);
        if ((!localFile.exists()) || (!localFile.isFile())) {
          break label210;
        }
        if (paramInt <= 0) {
          break label180;
        }
        a(str, localOptions, arrayOfInt);
        if ((arrayOfInt[0] >= paramInt) || (arrayOfInt[1] >= paramInt))
        {
          localLocalMediaInfo.jdField_a_of_type_Long = l;
          localLocalMediaInfo.jdField_a_of_type_JavaLangString = str;
          localLocalMediaInfo.d = paramCursor.getLong(k);
        }
      }
      return localLocalMediaInfo;
      label180:
      localLocalMediaInfo.jdField_a_of_type_Long = l;
      localLocalMediaInfo.jdField_a_of_type_JavaLangString = str;
      localLocalMediaInfo.d = paramCursor.getLong(k);
      return localLocalMediaInfo;
      label210:
      if (QLog.isColorLevel()) {
        QLog.d("AlbumListAdapter", 2, "image does not exist,imagePath is:" + str);
      }
    }
  }
  
  private List a(List paramList1, List paramList2, int paramInt)
  {
    Object localObject;
    if ((paramList1 == null) && (paramList2 == null)) {
      localObject = null;
    }
    int i;
    do
    {
      for (;;)
      {
        LogTag.a();
        if ((localObject == null) || (((List)localObject).isEmpty())) {
          break label346;
        }
        int j = ((List)localObject).size();
        i = 0;
        while (i < j)
        {
          paramList1 = (QQAlbumInfo)((List)localObject).get(i);
          if ((i != 0) && (a(paramList1.name)))
          {
            ((List)localObject).remove(paramList1);
            ((List)localObject).add(0, paramList1);
          }
          i += 1;
        }
        if ((paramList1 != null) || (paramList2 == null)) {
          break;
        }
        localObject = paramList2;
      }
      if (paramList1 == null) {
        break;
      }
      localObject = paramList1;
    } while (paramList2 == null);
    paramList2 = paramList2.iterator();
    label398:
    label404:
    for (;;)
    {
      localObject = paramList1;
      if (!paramList2.hasNext()) {
        break;
      }
      localObject = (QQAlbumInfo)paramList2.next();
      Iterator localIterator = paramList1.iterator();
      QQAlbumInfo localQQAlbumInfo;
      while (localIterator.hasNext())
      {
        localQQAlbumInfo = (QQAlbumInfo)localIterator.next();
        if (localQQAlbumInfo._id.equals(((QQAlbumInfo)localObject)._id)) {
          localQQAlbumInfo.mMediaFileCount += ((QQAlbumInfo)localObject).mMediaFileCount;
        }
      }
      for (i = 1;; i = 0)
      {
        if (i != 0) {
          break label404;
        }
        localIterator = paramList1.iterator();
        i = 0;
        label239:
        if (localIterator.hasNext())
        {
          localQQAlbumInfo = (QQAlbumInfo)localIterator.next();
          if (((QQAlbumInfo)localObject).coverDate > localQQAlbumInfo.coverDate) {
            paramList1.add(i, localObject);
          }
        }
        for (i = 1;; i = 0)
        {
          if (i != 0) {
            break label398;
          }
          paramList1.add(localObject);
          break;
          i += 1;
          break label239;
          if (paramInt == -1) {
            paramList1 = a(this.jdField_a_of_type_AndroidAppActivity, 200, 100, this.jdField_a_of_type_ComTencentMobileqqActivityPhotoIMediaFilter);
          }
          for (;;)
          {
            ((List)localObject).add(0, paramList1);
            label346:
            LogTag.a("PEAK", "compact.queryRecentBucket");
            return localObject;
            paramList1 = new QQAlbumInfo();
            paramList1._id = "$RecentAlbumId";
            paramList1.name = "最近照片";
            paramList1.mCoverInfo = new LocalMediaInfo();
          }
        }
        break;
      }
    }
  }
  
  private void a()
  {
    a(-1);
  }
  
  private void a(int paramInt)
  {
    int m = 1;
    int i1 = 0;
    int n = 0;
    Object localObject = this.jdField_a_of_type_ComTencentMobileqqActivityPhotoIMediaFilter;
    List localList;
    int i;
    if ((localObject != null) && (((IMediaFilter)localObject).showImage()))
    {
      LogTag.a();
      localList = a(this.jdField_a_of_type_AndroidAppActivity, paramInt, this.jdField_a_of_type_ComTencentMobileqqActivityPhotoIMediaFilter);
      if ((paramInt != -1) && (localList != null) && (localList.size() == paramInt))
      {
        i = 1;
        LogTag.a("PEAK", "queryImageBuckets");
      }
    }
    for (;;)
    {
      int j;
      if ((localObject != null) && (((IMediaFilter)localObject).showVideo()))
      {
        LogTag.a();
        localObject = b(this.jdField_a_of_type_AndroidAppActivity, paramInt, (IMediaFilter)localObject);
        j = i;
        if (paramInt != -1)
        {
          j = i;
          if (localObject != null)
          {
            j = i;
            if (((List)localObject).size() == paramInt) {
              j = 1;
            }
          }
        }
        LogTag.a("PEAK", "queryVideoBuckets");
      }
      for (;;)
      {
        LogTag.a();
        localList = a(localList, (List)localObject, paramInt);
        if (localList != null) {
          for (i = 0;; i = k + i)
          {
            k = i;
            if (m >= localList.size()) {
              break;
            }
            k = ((QQAlbumInfo)localList.get(m)).mMediaFileCount;
            m += 1;
          }
        }
        int k = 0;
        localObject = new StringBuilder().append("compact(");
        if (localList == null) {}
        for (i = 0;; i = localList.size() - 1)
        {
          LogTag.a("PEAK", i + "," + k + ")");
          b(localList);
          if (paramInt == -1) {
            break label355;
          }
          if (j == 0) {
            break;
          }
          ThreadManager.a().post(new cii(this));
          return;
        }
        paramInt = n;
        if (localList != null) {
          paramInt = localList.size();
        }
        StatisticConstants.a(paramInt, k);
        ThreadManager.a().post(new cij(this));
        return;
        label355:
        paramInt = i1;
        if (localList != null) {
          paramInt = localList.size();
        }
        StatisticConstants.a(paramInt, k);
        return;
        localObject = null;
        j = i;
      }
      i = 0;
      break;
      localList = null;
      i = 0;
    }
  }
  
  private void a(Cursor paramCursor, List paramList, int paramInt1, int paramInt2, boolean paramBoolean, IMediaFilter paramIMediaFilter)
  {
    if (paramCursor.getCount() <= 0) {}
    int i1;
    int i2;
    int i4;
    int j;
    BitmapFactory.Options localOptions;
    int[] arrayOfInt;
    int k;
    label101:
    String str1;
    String str2;
    do
    {
      int n;
      do
      {
        return;
        break label101;
        break label101;
        int i3;
        while (!paramCursor.moveToNext())
        {
          n = paramCursor.getColumnIndexOrThrow("_data");
          i1 = paramCursor.getColumnIndexOrThrow("orientation");
          i2 = paramCursor.getColumnIndexOrThrow("date_modified");
          i3 = paramCursor.getColumnIndexOrThrow("mime_type");
          i4 = paramCursor.getColumnIndexOrThrow("_size");
          j = 0;
          if (paramBoolean) {
            j = paramCursor.getColumnIndexOrThrow("width");
          }
          localOptions = new BitmapFactory.Options();
          localOptions.inJustDecodeBounds = true;
          arrayOfInt = new int[2];
          k = 0;
        }
        str1 = paramCursor.getString(i3);
      } while ((paramIMediaFilter != null) && (paramIMediaFilter.filter(str1)));
      str2 = paramCursor.getString(n);
    } while ((TextUtils.isEmpty(str2)) || (!new File(str2).exists()));
    long l = paramCursor.getLong(i2);
    int m = 0;
    int i = m;
    if (paramBoolean)
    {
      i = m;
      if (paramCursor.getInt(j) == 0) {
        i = 1;
      }
    }
    LocalMediaInfo localLocalMediaInfo;
    if ((paramInt1 > 0) && ((!paramBoolean) || (i != 0)))
    {
      a(str2, localOptions, arrayOfInt);
      if (arrayOfInt[0] < paramInt1)
      {
        i = k;
        if (arrayOfInt[1] < paramInt1) {}
      }
      else
      {
        localLocalMediaInfo = new LocalMediaInfo();
        localLocalMediaInfo.jdField_a_of_type_JavaLangString = str2;
        localLocalMediaInfo.d = l;
        localLocalMediaInfo.jdField_a_of_type_Int = paramCursor.getInt(i1);
        localLocalMediaInfo.jdField_b_of_type_JavaLangString = str1;
        localLocalMediaInfo.jdField_b_of_type_Long = paramCursor.getLong(i4);
        paramList.add(localLocalMediaInfo);
      }
    }
    for (i = k + 1;; i = k + 1)
    {
      k = i;
      if (paramInt2 <= 0) {
        break;
      }
      k = i;
      if (i < paramInt2) {
        break;
      }
      return;
      localLocalMediaInfo = new LocalMediaInfo();
      localLocalMediaInfo.jdField_a_of_type_JavaLangString = str2;
      localLocalMediaInfo.d = l;
      localLocalMediaInfo.jdField_a_of_type_Int = paramCursor.getInt(i1);
      localLocalMediaInfo.jdField_b_of_type_JavaLangString = str1;
      localLocalMediaInfo.jdField_b_of_type_Long = paramCursor.getLong(i4);
      paramList.add(localLocalMediaInfo);
    }
  }
  
  private void a(QQAlbumInfo paramQQAlbumInfo)
  {
    if (this.jdField_a_of_type_JavaUtilList == null) {
      return;
    }
    if (this.jdField_a_of_type_JavaUtilList.isEmpty()) {
      this.jdField_a_of_type_JavaUtilList.add(paramQQAlbumInfo);
    }
    for (;;)
    {
      notifyDataSetChanged();
      return;
      if (((QQAlbumInfo)this.jdField_a_of_type_JavaUtilList.get(0))._id.equals("$RecentAlbumId")) {
        this.jdField_a_of_type_JavaUtilList.set(0, paramQQAlbumInfo);
      } else {
        this.jdField_a_of_type_JavaUtilList.add(0, paramQQAlbumInfo);
      }
    }
  }
  
  private void a(String paramString, BitmapFactory.Options paramOptions, int[] paramArrayOfInt)
  {
    HashMap localHashMap = new HashMap();
    Integer localInteger = (Integer)localHashMap.get(paramString);
    int m;
    int j;
    if (localInteger == null)
    {
      BitmapFactory.decodeFile(paramString, paramOptions);
      int k = paramOptions.outWidth;
      m = paramOptions.outHeight;
      i = m;
      j = k;
      if (paramOptions.outWidth <= 65535)
      {
        i = m;
        j = k;
        if (paramOptions.outHeight <= 65535)
        {
          localHashMap.put(paramString, Integer.valueOf(paramOptions.outWidth << 16 & 0xFFFF0000 | paramOptions.outHeight & 0xFFFF));
          j = k;
        }
      }
    }
    for (int i = m;; i = localInteger.intValue() & 0xFFFF)
    {
      paramArrayOfInt[0] = j;
      paramArrayOfInt[1] = i;
      return;
      j = localInteger.intValue() >> 16 & 0xFFFF;
    }
  }
  
  private void a(List paramList)
  {
    this.jdField_a_of_type_JavaUtilList.clear();
    if (paramList != null) {
      this.jdField_a_of_type_JavaUtilList.addAll(paramList);
    }
    notifyDataSetChanged();
  }
  
  private static boolean a(String paramString)
  {
    if (paramString == null) {}
    do
    {
      return false;
      paramString = paramString.toLowerCase();
      if (paramString.equalsIgnoreCase("camera")) {
        return true;
      }
    } while (!paramString.equalsIgnoreCase("100media"));
    return true;
  }
  
  private void b(QQAlbumInfo paramQQAlbumInfo)
  {
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      a(paramQQAlbumInfo);
      return;
    }
    this.jdField_a_of_type_AndroidOsHandler.post(new cih(this, paramQQAlbumInfo));
  }
  
  private void b(List paramList)
  {
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      a(paramList);
      return;
    }
    this.jdField_a_of_type_AndroidOsHandler.post(new cig(this, paramList));
  }
  
  public QQAlbumInfo a(int paramInt)
  {
    return (QQAlbumInfo)this.jdField_a_of_type_JavaUtilList.get(paramInt);
  }
  
  public QQAlbumInfo a(Context paramContext, int paramInt1, int paramInt2, IMediaFilter paramIMediaFilter)
  {
    Object localObject2 = null;
    ArrayList localArrayList1 = null;
    Object localObject3 = null;
    Object localObject1 = null;
    if (paramInt2 <= 0) {
      throw new IllegalArgumentException("limit must be great than 0");
    }
    QQAlbumInfo localQQAlbumInfo = new QQAlbumInfo();
    localQQAlbumInfo._id = "$RecentAlbumId";
    localQQAlbumInfo.name = "最近照片";
    boolean bool = false;
    if (Build.VERSION.SDK_INT >= 16) {
      bool = true;
    }
    if (bool) {}
    for (;;)
    {
      try
      {
        paramContext = a(paramContext, "_size>? and (width>=? or height>=? )) GROUP BY (_data", new String[] { String.valueOf(0), String.valueOf(paramInt1), String.valueOf(paramInt1) }, paramInt2);
        localObject1 = paramContext;
        localObject2 = paramContext;
        i = paramContext.getCount();
        localArrayList1 = null;
        if (paramIMediaFilter != null)
        {
          localObject1 = paramContext;
          localObject2 = paramContext;
          localArrayList1 = new ArrayList();
          localObject1 = paramContext;
          localObject2 = paramContext;
          a(paramContext, localArrayList1, paramInt1, paramInt2, bool, paramIMediaFilter);
          localObject1 = paramContext;
          localObject2 = paramContext;
          i = localArrayList1.size();
        }
        localObject1 = paramContext;
        localObject2 = paramContext;
        localQQAlbumInfo.mMediaFileCount = i;
        if (i > 0)
        {
          if (paramIMediaFilter == null) {
            continue;
          }
          localObject1 = paramContext;
          localObject2 = paramContext;
          paramIMediaFilter = (LocalMediaInfo)localArrayList1.get(0);
          localObject1 = paramContext;
          localObject2 = paramContext;
          localQQAlbumInfo.mCoverInfo = paramIMediaFilter;
        }
        if (paramContext != null) {
          paramContext.close();
        }
      }
      catch (Exception paramContext)
      {
        localObject2 = localObject1;
        if (!QLog.isColorLevel()) {
          continue;
        }
        localObject2 = localObject1;
        QLog.e("AlbumListAdapter", 2, paramContext.getMessage(), paramContext);
        return localQQAlbumInfo;
      }
      finally
      {
        if (localObject2 == null) {
          continue;
        }
        ((Cursor)localObject2).close();
      }
      return localQQAlbumInfo;
      localObject1 = paramContext;
      localObject2 = paramContext;
      paramIMediaFilter = a(paramContext, -1);
      continue;
      int i = paramInt2 * 6;
      if (QLog.isColorLevel()) {
        QLog.d("SelectPhotoTrace", 2, "realLimit is:" + i);
      }
      ArrayList localArrayList2 = new ArrayList();
      localObject2 = localArrayList1;
      localObject1 = localObject3;
      try
      {
        Object localObject4 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.buildUpon();
        localObject2 = localArrayList1;
        localObject1 = localObject3;
        ((Uri.Builder)localObject4).appendQueryParameter("limit", String.valueOf(i));
        localObject2 = localArrayList1;
        localObject1 = localObject3;
        localObject4 = ((Uri.Builder)localObject4).build();
        localObject2 = localArrayList1;
        localObject1 = localObject3;
        paramContext = paramContext.getContentResolver().query((Uri)localObject4, jdField_a_of_type_ArrayOfJavaLangString, "_size>0) GROUP BY (_data", null, "_id DESC");
        localObject2 = paramContext;
        localObject1 = paramContext;
        a(paramContext, localArrayList2, paramInt1, paramInt2, bool, paramIMediaFilter);
        localObject2 = paramContext;
        localObject1 = paramContext;
        localQQAlbumInfo.mMediaFileCount = localArrayList2.size();
        localObject2 = paramContext;
        localObject1 = paramContext;
        if (localArrayList2.size() > 0)
        {
          localObject2 = paramContext;
          localObject1 = paramContext;
          paramIMediaFilter = (LocalMediaInfo)localArrayList2.get(0);
          localObject2 = paramContext;
          localObject1 = paramContext;
          localQQAlbumInfo.mCoverInfo = paramIMediaFilter;
          localObject2 = paramContext;
          localObject1 = paramContext;
          localQQAlbumInfo.coverDate = paramIMediaFilter.d;
        }
        if (paramContext == null) {
          continue;
        }
        paramContext.close();
        return localQQAlbumInfo;
      }
      catch (Exception paramContext)
      {
        localObject1 = localObject2;
        if (QLog.isColorLevel())
        {
          localObject1 = localObject2;
          QLog.d("AlbumListAdapter", 2, paramContext.getMessage(), paramContext);
        }
        return localQQAlbumInfo;
      }
      finally
      {
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
      }
    }
  }
  
  /* Error */
  public List a(Context paramContext, int paramInt, IMediaFilter paramIMediaFilter)
  {
    // Byte code:
    //   0: iload_2
    //   1: ifge +44 -> 45
    //   4: getstatic 151	android/provider/MediaStore$Images$Media:EXTERNAL_CONTENT_URI	Landroid/net/Uri;
    //   7: astore_3
    //   8: aload_1
    //   9: invokevirtual 179	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   12: aload_3
    //   13: getstatic 64	com/tencent/mobileqq/activity/photo/AlbumListAdapter:jdField_b_of_type_ArrayOfJavaLangString	[Ljava/lang/String;
    //   16: ldc 13
    //   18: aconst_null
    //   19: ldc 18
    //   21: invokevirtual 185	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   24: astore_3
    //   25: aload_3
    //   26: ifnonnull +45 -> 71
    //   29: aload_3
    //   30: ifnull +9 -> 39
    //   33: aload_3
    //   34: invokeinterface 505 1 0
    //   39: aconst_null
    //   40: astore 13
    //   42: aload 13
    //   44: areturn
    //   45: getstatic 151	android/provider/MediaStore$Images$Media:EXTERNAL_CONTENT_URI	Landroid/net/Uri;
    //   48: invokevirtual 157	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   51: astore_3
    //   52: aload_3
    //   53: ldc 159
    //   55: iload_2
    //   56: invokestatic 163	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   59: invokevirtual 169	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   62: pop
    //   63: aload_3
    //   64: invokevirtual 173	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   67: astore_3
    //   68: goto -60 -> 8
    //   71: aload_3
    //   72: astore 13
    //   74: new 523	java/util/LinkedList
    //   77: dup
    //   78: invokespecial 524	java/util/LinkedList:<init>	()V
    //   81: astore_1
    //   82: aload_3
    //   83: astore 13
    //   85: aload_3
    //   86: ldc 48
    //   88: invokeinterface 527 2 0
    //   93: istore_2
    //   94: aload_3
    //   95: astore 13
    //   97: aload_3
    //   98: ldc 50
    //   100: invokeinterface 527 2 0
    //   105: istore 4
    //   107: aload_3
    //   108: astore 13
    //   110: aload_3
    //   111: ldc 56
    //   113: invokeinterface 527 2 0
    //   118: istore 5
    //   120: aload_3
    //   121: astore 13
    //   123: aload_3
    //   124: ldc 54
    //   126: invokeinterface 527 2 0
    //   131: istore 6
    //   133: aload_3
    //   134: astore 13
    //   136: aload_3
    //   137: ldc 71
    //   139: invokeinterface 527 2 0
    //   144: istore 7
    //   146: aload_3
    //   147: astore 13
    //   149: aload_3
    //   150: ldc 58
    //   152: invokeinterface 527 2 0
    //   157: istore 8
    //   159: aload_3
    //   160: astore 13
    //   162: aload_3
    //   163: ldc 60
    //   165: invokeinterface 527 2 0
    //   170: istore 9
    //   172: aload_3
    //   173: astore 13
    //   175: aload_3
    //   176: ldc_w 529
    //   179: invokeinterface 527 2 0
    //   184: istore 10
    //   186: aload_3
    //   187: astore 13
    //   189: aload_3
    //   190: invokeinterface 203 1 0
    //   195: ifeq +268 -> 463
    //   198: aload_3
    //   199: astore 13
    //   201: aload_3
    //   202: iload_2
    //   203: invokeinterface 206 2 0
    //   208: astore 16
    //   210: aload_3
    //   211: astore 13
    //   213: aload_3
    //   214: iload 4
    //   216: invokeinterface 206 2 0
    //   221: astore 17
    //   223: aload_3
    //   224: astore 13
    //   226: aload 16
    //   228: invokestatic 394	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   231: ifne -45 -> 186
    //   234: aload_3
    //   235: astore 13
    //   237: aload 17
    //   239: invokestatic 394	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   242: ifne -56 -> 186
    //   245: aload_3
    //   246: astore 13
    //   248: aload_3
    //   249: iload 5
    //   251: invokeinterface 206 2 0
    //   256: astore 14
    //   258: aload_3
    //   259: astore 13
    //   261: aload_3
    //   262: iload 6
    //   264: invokeinterface 210 2 0
    //   269: lstore 11
    //   271: aload_3
    //   272: astore 13
    //   274: new 275	com/tencent/mobileqq/data/QQAlbumInfo
    //   277: dup
    //   278: invokespecial 326	com/tencent/mobileqq/data/QQAlbumInfo:<init>	()V
    //   281: astore 15
    //   283: aload_3
    //   284: astore 13
    //   286: aload 15
    //   288: aload 17
    //   290: putfield 278	com/tencent/mobileqq/data/QQAlbumInfo:name	Ljava/lang/String;
    //   293: aload_3
    //   294: astore 13
    //   296: aload 15
    //   298: aload 16
    //   300: putfield 304	com/tencent/mobileqq/data/QQAlbumInfo:_id	Ljava/lang/String;
    //   303: aload_3
    //   304: astore 13
    //   306: aload 15
    //   308: lload 11
    //   310: putfield 313	com/tencent/mobileqq/data/QQAlbumInfo:coverDate	J
    //   313: aload_3
    //   314: astore 13
    //   316: aload 15
    //   318: getfield 334	com/tencent/mobileqq/data/QQAlbumInfo:mCoverInfo	Lcom/tencent/mobileqq/activity/photo/LocalMediaInfo;
    //   321: astore 16
    //   323: aload_3
    //   324: astore 13
    //   326: aload 16
    //   328: aload 14
    //   330: putfield 233	com/tencent/mobileqq/activity/photo/LocalMediaInfo:jdField_a_of_type_JavaLangString	Ljava/lang/String;
    //   333: aload_3
    //   334: astore 13
    //   336: aload 16
    //   338: aload_3
    //   339: iload 7
    //   341: invokeinterface 210 2 0
    //   346: putfield 231	com/tencent/mobileqq/activity/photo/LocalMediaInfo:jdField_a_of_type_Long	J
    //   349: aload_3
    //   350: astore 13
    //   352: aload 16
    //   354: lload 11
    //   356: putfield 235	com/tencent/mobileqq/activity/photo/LocalMediaInfo:d	J
    //   359: aload_3
    //   360: astore 13
    //   362: aload 16
    //   364: aload_3
    //   365: iload 8
    //   367: invokeinterface 397 2 0
    //   372: putfield 398	com/tencent/mobileqq/activity/photo/LocalMediaInfo:jdField_a_of_type_Int	I
    //   375: aload_3
    //   376: astore 13
    //   378: aload 16
    //   380: aload_3
    //   381: iload 9
    //   383: invokeinterface 206 2 0
    //   388: putfield 400	com/tencent/mobileqq/activity/photo/LocalMediaInfo:jdField_b_of_type_JavaLangString	Ljava/lang/String;
    //   391: aload_3
    //   392: astore 13
    //   394: aload 15
    //   396: aload_3
    //   397: iload 10
    //   399: invokeinterface 397 2 0
    //   404: putfield 310	com/tencent/mobileqq/data/QQAlbumInfo:mMediaFileCount	I
    //   407: aload_3
    //   408: astore 13
    //   410: aload_1
    //   411: aload 15
    //   413: invokeinterface 315 2 0
    //   418: pop
    //   419: goto -233 -> 186
    //   422: astore 14
    //   424: aload_3
    //   425: astore 13
    //   427: invokestatic 240	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   430: ifeq +18 -> 448
    //   433: aload_3
    //   434: astore 13
    //   436: ldc_w 515
    //   439: iconst_2
    //   440: ldc_w 531
    //   443: aload 14
    //   445: invokestatic 521	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   448: aload_1
    //   449: astore 13
    //   451: aload_3
    //   452: ifnull -410 -> 42
    //   455: aload_3
    //   456: invokeinterface 505 1 0
    //   461: aload_1
    //   462: areturn
    //   463: aload_1
    //   464: astore 13
    //   466: aload_3
    //   467: ifnull -425 -> 42
    //   470: aload_3
    //   471: invokeinterface 505 1 0
    //   476: aload_1
    //   477: areturn
    //   478: astore_1
    //   479: aconst_null
    //   480: astore 13
    //   482: aload 13
    //   484: ifnull +10 -> 494
    //   487: aload 13
    //   489: invokeinterface 505 1 0
    //   494: aload_1
    //   495: athrow
    //   496: astore_1
    //   497: goto -15 -> 482
    //   500: astore 14
    //   502: aconst_null
    //   503: astore_3
    //   504: aconst_null
    //   505: astore_1
    //   506: goto -82 -> 424
    //   509: astore 14
    //   511: aconst_null
    //   512: astore_1
    //   513: goto -89 -> 424
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	516	0	this	AlbumListAdapter
    //   0	516	1	paramContext	Context
    //   0	516	2	paramInt	int
    //   0	516	3	paramIMediaFilter	IMediaFilter
    //   105	110	4	i	int
    //   118	132	5	j	int
    //   131	132	6	k	int
    //   144	196	7	m	int
    //   157	209	8	n	int
    //   170	212	9	i1	int
    //   184	214	10	i2	int
    //   269	86	11	l	long
    //   40	448	13	localObject1	Object
    //   256	73	14	str1	String
    //   422	22	14	localException1	Exception
    //   500	1	14	localException2	Exception
    //   509	1	14	localException3	Exception
    //   281	131	15	localQQAlbumInfo	QQAlbumInfo
    //   208	171	16	localObject2	Object
    //   221	68	17	str2	String
    // Exception table:
    //   from	to	target	type
    //   85	94	422	java/lang/Exception
    //   97	107	422	java/lang/Exception
    //   110	120	422	java/lang/Exception
    //   123	133	422	java/lang/Exception
    //   136	146	422	java/lang/Exception
    //   149	159	422	java/lang/Exception
    //   162	172	422	java/lang/Exception
    //   175	186	422	java/lang/Exception
    //   189	198	422	java/lang/Exception
    //   201	210	422	java/lang/Exception
    //   213	223	422	java/lang/Exception
    //   226	234	422	java/lang/Exception
    //   237	245	422	java/lang/Exception
    //   248	258	422	java/lang/Exception
    //   261	271	422	java/lang/Exception
    //   274	283	422	java/lang/Exception
    //   286	293	422	java/lang/Exception
    //   296	303	422	java/lang/Exception
    //   306	313	422	java/lang/Exception
    //   316	323	422	java/lang/Exception
    //   326	333	422	java/lang/Exception
    //   336	349	422	java/lang/Exception
    //   352	359	422	java/lang/Exception
    //   362	375	422	java/lang/Exception
    //   378	391	422	java/lang/Exception
    //   394	407	422	java/lang/Exception
    //   410	419	422	java/lang/Exception
    //   4	8	478	finally
    //   8	25	478	finally
    //   45	68	478	finally
    //   74	82	496	finally
    //   85	94	496	finally
    //   97	107	496	finally
    //   110	120	496	finally
    //   123	133	496	finally
    //   136	146	496	finally
    //   149	159	496	finally
    //   162	172	496	finally
    //   175	186	496	finally
    //   189	198	496	finally
    //   201	210	496	finally
    //   213	223	496	finally
    //   226	234	496	finally
    //   237	245	496	finally
    //   248	258	496	finally
    //   261	271	496	finally
    //   274	283	496	finally
    //   286	293	496	finally
    //   296	303	496	finally
    //   306	313	496	finally
    //   316	323	496	finally
    //   326	333	496	finally
    //   336	349	496	finally
    //   352	359	496	finally
    //   362	375	496	finally
    //   378	391	496	finally
    //   394	407	496	finally
    //   410	419	496	finally
    //   427	433	496	finally
    //   436	448	496	finally
    //   4	8	500	java/lang/Exception
    //   8	25	500	java/lang/Exception
    //   45	68	500	java/lang/Exception
    //   74	82	509	java/lang/Exception
  }
  
  /* Error */
  public List b(Context paramContext, int paramInt, IMediaFilter paramIMediaFilter)
  {
    // Byte code:
    //   0: iload_2
    //   1: ifge +44 -> 45
    //   4: getstatic 534	android/provider/MediaStore$Video$Media:EXTERNAL_CONTENT_URI	Landroid/net/Uri;
    //   7: astore_3
    //   8: aload_1
    //   9: invokevirtual 179	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   12: aload_3
    //   13: getstatic 79	com/tencent/mobileqq/activity/photo/AlbumListAdapter:c	[Ljava/lang/String;
    //   16: ldc 26
    //   18: aconst_null
    //   19: ldc 18
    //   21: invokevirtual 185	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   24: astore_3
    //   25: aload_3
    //   26: ifnonnull +45 -> 71
    //   29: aload_3
    //   30: ifnull +9 -> 39
    //   33: aload_3
    //   34: invokeinterface 505 1 0
    //   39: aconst_null
    //   40: astore 12
    //   42: aload 12
    //   44: areturn
    //   45: getstatic 534	android/provider/MediaStore$Video$Media:EXTERNAL_CONTENT_URI	Landroid/net/Uri;
    //   48: invokevirtual 157	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   51: astore_3
    //   52: aload_3
    //   53: ldc 159
    //   55: iload_2
    //   56: invokestatic 163	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   59: invokevirtual 169	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   62: pop
    //   63: aload_3
    //   64: invokevirtual 173	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   67: astore_3
    //   68: goto -60 -> 8
    //   71: aload_3
    //   72: astore 12
    //   74: new 523	java/util/LinkedList
    //   77: dup
    //   78: invokespecial 524	java/util/LinkedList:<init>	()V
    //   81: astore_1
    //   82: aload_3
    //   83: astore 12
    //   85: aload_3
    //   86: ldc 48
    //   88: invokeinterface 527 2 0
    //   93: istore_2
    //   94: aload_3
    //   95: astore 12
    //   97: aload_3
    //   98: ldc 71
    //   100: invokeinterface 527 2 0
    //   105: istore 4
    //   107: aload_3
    //   108: astore 12
    //   110: aload_3
    //   111: ldc 50
    //   113: invokeinterface 527 2 0
    //   118: istore 5
    //   120: aload_3
    //   121: astore 12
    //   123: aload_3
    //   124: ldc 56
    //   126: invokeinterface 527 2 0
    //   131: istore 6
    //   133: aload_3
    //   134: astore 12
    //   136: aload_3
    //   137: ldc 54
    //   139: invokeinterface 527 2 0
    //   144: istore 7
    //   146: aload_3
    //   147: astore 12
    //   149: aload_3
    //   150: ldc 60
    //   152: invokeinterface 527 2 0
    //   157: istore 8
    //   159: aload_3
    //   160: astore 12
    //   162: aload_3
    //   163: ldc_w 529
    //   166: invokeinterface 527 2 0
    //   171: istore 9
    //   173: aload_3
    //   174: astore 12
    //   176: aload_3
    //   177: invokeinterface 203 1 0
    //   182: ifeq +245 -> 427
    //   185: aload_3
    //   186: astore 12
    //   188: aload_3
    //   189: iload_2
    //   190: invokeinterface 206 2 0
    //   195: astore 14
    //   197: aload_3
    //   198: astore 12
    //   200: aload_3
    //   201: iload 5
    //   203: invokeinterface 206 2 0
    //   208: astore 15
    //   210: aload_3
    //   211: astore 12
    //   213: aload 14
    //   215: invokestatic 394	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   218: ifne -45 -> 173
    //   221: aload_3
    //   222: astore 12
    //   224: aload 15
    //   226: invokestatic 394	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   229: ifne -56 -> 173
    //   232: aload_3
    //   233: astore 12
    //   235: aload_3
    //   236: iload 7
    //   238: invokeinterface 210 2 0
    //   243: lstore 10
    //   245: aload_3
    //   246: astore 12
    //   248: new 275	com/tencent/mobileqq/data/QQAlbumInfo
    //   251: dup
    //   252: invokespecial 326	com/tencent/mobileqq/data/QQAlbumInfo:<init>	()V
    //   255: astore 13
    //   257: aload_3
    //   258: astore 12
    //   260: aload 13
    //   262: aload 15
    //   264: putfield 278	com/tencent/mobileqq/data/QQAlbumInfo:name	Ljava/lang/String;
    //   267: aload_3
    //   268: astore 12
    //   270: aload 13
    //   272: aload 14
    //   274: putfield 304	com/tencent/mobileqq/data/QQAlbumInfo:_id	Ljava/lang/String;
    //   277: aload_3
    //   278: astore 12
    //   280: aload 13
    //   282: lload 10
    //   284: putfield 313	com/tencent/mobileqq/data/QQAlbumInfo:coverDate	J
    //   287: aload_3
    //   288: astore 12
    //   290: aload 13
    //   292: getfield 334	com/tencent/mobileqq/data/QQAlbumInfo:mCoverInfo	Lcom/tencent/mobileqq/activity/photo/LocalMediaInfo;
    //   295: astore 14
    //   297: aload_3
    //   298: astore 12
    //   300: aload 14
    //   302: aload_3
    //   303: iload 6
    //   305: invokeinterface 206 2 0
    //   310: putfield 233	com/tencent/mobileqq/activity/photo/LocalMediaInfo:jdField_a_of_type_JavaLangString	Ljava/lang/String;
    //   313: aload_3
    //   314: astore 12
    //   316: aload 14
    //   318: aload_3
    //   319: iload 4
    //   321: invokeinterface 210 2 0
    //   326: putfield 231	com/tencent/mobileqq/activity/photo/LocalMediaInfo:jdField_a_of_type_Long	J
    //   329: aload_3
    //   330: astore 12
    //   332: aload 14
    //   334: lload 10
    //   336: putfield 235	com/tencent/mobileqq/activity/photo/LocalMediaInfo:d	J
    //   339: aload_3
    //   340: astore 12
    //   342: aload 14
    //   344: aload_3
    //   345: iload 8
    //   347: invokeinterface 206 2 0
    //   352: putfield 400	com/tencent/mobileqq/activity/photo/LocalMediaInfo:jdField_b_of_type_JavaLangString	Ljava/lang/String;
    //   355: aload_3
    //   356: astore 12
    //   358: aload 13
    //   360: aload_3
    //   361: iload 9
    //   363: invokeinterface 397 2 0
    //   368: putfield 310	com/tencent/mobileqq/data/QQAlbumInfo:mMediaFileCount	I
    //   371: aload_3
    //   372: astore 12
    //   374: aload_1
    //   375: aload 13
    //   377: invokeinterface 315 2 0
    //   382: pop
    //   383: goto -210 -> 173
    //   386: astore 13
    //   388: aload_3
    //   389: astore 12
    //   391: invokestatic 240	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   394: ifeq +18 -> 412
    //   397: aload_3
    //   398: astore 12
    //   400: ldc_w 515
    //   403: iconst_2
    //   404: ldc_w 536
    //   407: aload 13
    //   409: invokestatic 521	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   412: aload_1
    //   413: astore 12
    //   415: aload_3
    //   416: ifnull -374 -> 42
    //   419: aload_3
    //   420: invokeinterface 505 1 0
    //   425: aload_1
    //   426: areturn
    //   427: aload_1
    //   428: astore 12
    //   430: aload_3
    //   431: ifnull -389 -> 42
    //   434: aload_3
    //   435: invokeinterface 505 1 0
    //   440: aload_1
    //   441: areturn
    //   442: astore_1
    //   443: aconst_null
    //   444: astore 12
    //   446: aload 12
    //   448: ifnull +10 -> 458
    //   451: aload 12
    //   453: invokeinterface 505 1 0
    //   458: aload_1
    //   459: athrow
    //   460: astore_1
    //   461: goto -15 -> 446
    //   464: astore 13
    //   466: aconst_null
    //   467: astore_3
    //   468: aconst_null
    //   469: astore_1
    //   470: goto -82 -> 388
    //   473: astore 13
    //   475: aconst_null
    //   476: astore_1
    //   477: goto -89 -> 388
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	480	0	this	AlbumListAdapter
    //   0	480	1	paramContext	Context
    //   0	480	2	paramInt	int
    //   0	480	3	paramIMediaFilter	IMediaFilter
    //   105	215	4	i	int
    //   118	84	5	j	int
    //   131	173	6	k	int
    //   144	93	7	m	int
    //   157	189	8	n	int
    //   171	191	9	i1	int
    //   243	92	10	l	long
    //   40	412	12	localObject1	Object
    //   255	121	13	localQQAlbumInfo	QQAlbumInfo
    //   386	22	13	localException1	Exception
    //   464	1	13	localException2	Exception
    //   473	1	13	localException3	Exception
    //   195	148	14	localObject2	Object
    //   208	55	15	str	String
    // Exception table:
    //   from	to	target	type
    //   85	94	386	java/lang/Exception
    //   97	107	386	java/lang/Exception
    //   110	120	386	java/lang/Exception
    //   123	133	386	java/lang/Exception
    //   136	146	386	java/lang/Exception
    //   149	159	386	java/lang/Exception
    //   162	173	386	java/lang/Exception
    //   176	185	386	java/lang/Exception
    //   188	197	386	java/lang/Exception
    //   200	210	386	java/lang/Exception
    //   213	221	386	java/lang/Exception
    //   224	232	386	java/lang/Exception
    //   235	245	386	java/lang/Exception
    //   248	257	386	java/lang/Exception
    //   260	267	386	java/lang/Exception
    //   270	277	386	java/lang/Exception
    //   280	287	386	java/lang/Exception
    //   290	297	386	java/lang/Exception
    //   300	313	386	java/lang/Exception
    //   316	329	386	java/lang/Exception
    //   332	339	386	java/lang/Exception
    //   342	355	386	java/lang/Exception
    //   358	371	386	java/lang/Exception
    //   374	383	386	java/lang/Exception
    //   4	8	442	finally
    //   8	25	442	finally
    //   45	68	442	finally
    //   74	82	460	finally
    //   85	94	460	finally
    //   97	107	460	finally
    //   110	120	460	finally
    //   123	133	460	finally
    //   136	146	460	finally
    //   149	159	460	finally
    //   162	173	460	finally
    //   176	185	460	finally
    //   188	197	460	finally
    //   200	210	460	finally
    //   213	221	460	finally
    //   224	232	460	finally
    //   235	245	460	finally
    //   248	257	460	finally
    //   260	267	460	finally
    //   270	277	460	finally
    //   280	287	460	finally
    //   290	297	460	finally
    //   300	313	460	finally
    //   316	329	460	finally
    //   332	339	460	finally
    //   342	355	460	finally
    //   358	371	460	finally
    //   374	383	460	finally
    //   391	397	460	finally
    //   400	412	460	finally
    //   4	8	464	java/lang/Exception
    //   8	25	464	java/lang/Exception
    //   45	68	464	java/lang/Exception
    //   74	82	473	java/lang/Exception
  }
  
  public int getCount()
  {
    return this.jdField_a_of_type_JavaUtilList.size();
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    QQAlbumInfo localQQAlbumInfo;
    URL localURL;
    Object localObject;
    if (paramView == null)
    {
      localView = this.jdField_a_of_type_AndroidAppActivity.getLayoutInflater().inflate(2130903467, null);
      paramViewGroup = (TextView)localView;
      localQQAlbumInfo = a(paramInt);
      localView.setContentDescription(localQQAlbumInfo.name + "，" + localQQAlbumInfo.mMediaFileCount + "张照片");
      paramView = localQQAlbumInfo.name;
      if (localQQAlbumInfo.mMediaFileCount > 0) {
        paramView = localQQAlbumInfo.name + String.format(" (%d)", new Object[] { Integer.valueOf(localQQAlbumInfo.mMediaFileCount) });
      }
      paramViewGroup.setText(paramView);
      paramView = paramViewGroup.getCompoundDrawables()[0];
      localURL = AlbumUtil.a(localQQAlbumInfo.mCoverInfo, 200);
      if ((paramView == null) || (!URLDrawable.class.isInstance(paramView))) {
        break label353;
      }
      localObject = (URLDrawable)paramView;
      paramView = (View)localObject;
      if (!localURL.equals(((URLDrawable)localObject).getURL())) {
        ((URLDrawable)localObject).cancelDownload(true);
      }
    }
    label331:
    label353:
    for (paramView = null;; paramView = null)
    {
      if (paramView == null) {
        if (!VersionUtils.d()) {
          break label331;
        }
      }
      for (paramView = URLDrawable.getDrawable(localURL, jdField_a_of_type_AndroidGraphicsDrawableColorDrawable, jdField_a_of_type_AndroidGraphicsDrawableColorDrawable);; paramView = URLDrawable.getDrawable(localURL, paramView, paramView))
      {
        localObject = MimeHelper.a(localQQAlbumInfo.mCoverInfo.jdField_b_of_type_JavaLangString);
        if ((localObject != null) && ("video".equals(localObject[0]))) {
          paramView.setTag(localQQAlbumInfo.mCoverInfo);
        }
        paramView.setBounds(0, 0, this.jdField_a_of_type_Int, this.jdField_b_of_type_Int);
        localObject = this.jdField_a_of_type_AndroidGraphicsDrawableDrawable$ConstantState.newDrawable(this.jdField_a_of_type_AndroidContentResResources);
        ((Drawable)localObject).setBounds(0, 0, ((Drawable)localObject).getIntrinsicWidth(), ((Drawable)localObject).getIntrinsicHeight());
        paramViewGroup.setCompoundDrawables(paramView, null, (Drawable)localObject, null);
        return localView;
        paramViewGroup = (TextView)paramView;
        localView = paramView;
        break;
        paramView = this.jdField_a_of_type_AndroidContentResResources.getDrawable(2130838367);
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     com.tencent.mobileqq.activity.photo.AlbumListAdapter
 * JD-Core Version:    0.7.0.1
 */
package com.tencent.image;

import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.mobileqq.app.ThreadManagerV2;
import com.tencent.qphone.base.util.QLog;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;

public final class RegionBitmap
{
  private static final int MSG_RECYCLE_REGION_BITMAP = 2;
  private static final int MSG_UPDATE_DECODE_REGION = 1;
  private static final String TAG = "RegionBitmap";
  private WeakReference<OnUpdateCallback> mCallback;
  private long mCurrentTaskTime;
  private RegionDrawDataList mDataList = new RegionDrawDataList();
  private Object mDataLock = new Object();
  private Rect mDecodeRect = new Rect();
  private RegionBitmapBlockHelper mHelper;
  private String mImagePath;
  private BitmapRegionDecoder mRegionDecoder;
  private int mSample;
  private Rect mTmp = new Rect();
  private WorkHandler mWorkHandler;
  
  public RegionBitmap(String paramString)
  {
    if (this.mWorkHandler == null) {
      this.mWorkHandler = new WorkHandler(ThreadManagerV2.getFileThreadLooper());
    }
    this.mImagePath = paramString;
  }
  
  public static Rect decodeToRegion(int paramInt1, int paramInt2, Rect paramRect)
  {
    if (paramRect == null) {
      return null;
    }
    return new Rect(paramRect.left * paramInt2 / paramInt1, paramRect.top * paramInt2 / paramInt1, paramRect.right * paramInt2 / paramInt1, paramRect.bottom * paramInt2 / paramInt1);
  }
  
  public static Rect regionToDecode(int paramInt1, int paramInt2, Rect paramRect)
  {
    if (paramRect == null) {
      return null;
    }
    return new Rect(paramRect.left * paramInt1 / paramInt2, paramRect.top * paramInt1 / paramInt2, paramRect.right * paramInt1 / paramInt2, paramRect.bottom * paramInt1 / paramInt2);
  }
  
  void draw(Canvas paramCanvas, Paint paramPaint)
  {
    synchronized (this.mDataLock)
    {
      if ((this.mDataList != null) && (!this.mDataList.isEmpty()))
      {
        Iterator localIterator = this.mDataList.iterator();
        while (localIterator.hasNext())
        {
          DrawData localDrawData = (DrawData)localIterator.next();
          if (localDrawData.mBitmap != null) {
            paramCanvas.drawBitmap(localDrawData.mBitmap, null, localDrawData.mDrawRect, paramPaint);
          }
        }
      }
    }
  }
  
  public void recycle()
  {
    if (!this.mWorkHandler.hasMessages(2)) {
      this.mWorkHandler.sendEmptyMessage(2);
    }
  }
  
  public void setOnUpdateCallback(OnUpdateCallback paramOnUpdateCallback)
  {
    this.mCallback = new WeakReference(paramOnUpdateCallback);
  }
  
  public void updateRegionBitmap(RegionDrawableData paramRegionDrawableData)
  {
    if (this.mWorkHandler.hasMessages(1)) {
      this.mWorkHandler.removeMessages(1);
    }
    this.mCurrentTaskTime = SystemClock.uptimeMillis();
    paramRegionDrawableData.mTaskTime = this.mCurrentTaskTime;
    this.mWorkHandler.sendMessage(this.mWorkHandler.obtainMessage(1, paramRegionDrawableData));
  }
  
  public static class DrawData
  {
    public Bitmap mBitmap;
    public int mDecodeSample = 0;
    public Rect mDrawRect;
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      return ((DrawData)paramObject).mDrawRect.equals(this.mDrawRect);
    }
  }
  
  public static abstract interface OnUpdateCallback
  {
    public abstract void regionRefreshed();
  }
  
  final class WorkHandler
    extends Handler
  {
    public WorkHandler() {}
    
    public WorkHandler(Looper paramLooper)
    {
      super();
    }
    
    /* Error */
    private void decode(RegionDrawableData paramRegionDrawableData, RegionBitmap.DrawData paramDrawData, int paramInt)
    {
      // Byte code:
      //   0: invokestatic 37	android/os/SystemClock:uptimeMillis	()J
      //   3: lstore 4
      //   5: new 39	android/graphics/Rect
      //   8: dup
      //   9: invokespecial 40	android/graphics/Rect:<init>	()V
      //   12: astore 8
      //   14: aload 8
      //   16: aload_1
      //   17: getfield 46	com/tencent/image/RegionDrawableData:mSourceDensity	I
      //   20: aload_1
      //   21: getfield 49	com/tencent/image/RegionDrawableData:mTargetDensity	I
      //   24: aload_2
      //   25: getfield 55	com/tencent/image/RegionBitmap$DrawData:mDrawRect	Landroid/graphics/Rect;
      //   28: invokestatic 59	com/tencent/image/RegionBitmap:regionToDecode	(IILandroid/graphics/Rect;)Landroid/graphics/Rect;
      //   31: invokevirtual 63	android/graphics/Rect:set	(Landroid/graphics/Rect;)V
      //   34: new 65	android/graphics/BitmapFactory$Options
      //   37: dup
      //   38: invokespecial 66	android/graphics/BitmapFactory$Options:<init>	()V
      //   41: astore_1
      //   42: aload_1
      //   43: iload_3
      //   44: putfield 69	android/graphics/BitmapFactory$Options:inSampleSize	I
      //   47: aload_2
      //   48: aload_0
      //   49: getfield 13	com/tencent/image/RegionBitmap$WorkHandler:this$0	Lcom/tencent/image/RegionBitmap;
      //   52: invokestatic 73	com/tencent/image/RegionBitmap:access$000	(Lcom/tencent/image/RegionBitmap;)Landroid/graphics/BitmapRegionDecoder;
      //   55: aload 8
      //   57: aload_1
      //   58: invokevirtual 79	android/graphics/BitmapRegionDecoder:decodeRegion	(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
      //   61: putfield 83	com/tencent/image/RegionBitmap$DrawData:mBitmap	Landroid/graphics/Bitmap;
      //   64: aload_2
      //   65: getfield 83	com/tencent/image/RegionBitmap$DrawData:mBitmap	Landroid/graphics/Bitmap;
      //   68: astore 9
      //   70: aload_2
      //   71: aload_1
      //   72: getfield 69	android/graphics/BitmapFactory$Options:inSampleSize	I
      //   75: putfield 86	com/tencent/image/RegionBitmap$DrawData:mDecodeSample	I
      //   78: aload 9
      //   80: ifnull +35 -> 115
      //   83: aload 9
      //   85: invokevirtual 92	android/graphics/Bitmap:isRecycled	()Z
      //   88: ifne +27 -> 115
      //   91: aload_0
      //   92: getfield 13	com/tencent/image/RegionBitmap$WorkHandler:this$0	Lcom/tencent/image/RegionBitmap;
      //   95: invokestatic 96	com/tencent/image/RegionBitmap:access$200	(Lcom/tencent/image/RegionBitmap;)Ljava/lang/ref/WeakReference;
      //   98: invokevirtual 102	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
      //   101: checkcast 104	com/tencent/image/RegionBitmap$OnUpdateCallback
      //   104: astore_1
      //   105: aload_1
      //   106: ifnull +9 -> 115
      //   109: aload_1
      //   110: invokeinterface 107 1 0
      //   115: invokestatic 112	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
      //   118: ifeq +16 -> 134
      //   121: aload 9
      //   123: ifnonnull +12 -> 135
      //   126: ldc 114
      //   128: iconst_2
      //   129: ldc 116
      //   131: invokestatic 120	com/tencent/qphone/base/util/QLog:i	(Ljava/lang/String;ILjava/lang/String;)V
      //   134: return
      //   135: invokestatic 37	android/os/SystemClock:uptimeMillis	()J
      //   138: lstore 6
      //   140: new 122	java/lang/StringBuilder
      //   143: dup
      //   144: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   147: astore_1
      //   148: aload_1
      //   149: new 122	java/lang/StringBuilder
      //   152: dup
      //   153: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   156: ldc 125
      //   158: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   161: lload 6
      //   163: lload 4
      //   165: lsub
      //   166: invokevirtual 132	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
      //   169: ldc 134
      //   171: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   174: iload_3
      //   175: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   178: ldc 139
      //   180: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   183: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   186: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   189: pop
      //   190: aload_1
      //   191: new 122	java/lang/StringBuilder
      //   194: dup
      //   195: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   198: ldc 145
      //   200: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   203: aload 8
      //   205: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   208: ldc 139
      //   210: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   213: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   216: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   219: pop
      //   220: aload_1
      //   221: new 122	java/lang/StringBuilder
      //   224: dup
      //   225: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   228: ldc 150
      //   230: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   233: aload_2
      //   234: getfield 86	com/tencent/image/RegionBitmap$DrawData:mDecodeSample	I
      //   237: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   240: ldc 152
      //   242: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   245: aload_2
      //   246: getfield 55	com/tencent/image/RegionBitmap$DrawData:mDrawRect	Landroid/graphics/Rect;
      //   249: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   252: ldc 139
      //   254: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   257: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   260: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   263: pop
      //   264: aload_1
      //   265: new 122	java/lang/StringBuilder
      //   268: dup
      //   269: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   272: ldc 154
      //   274: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   277: aload 8
      //   279: invokevirtual 158	android/graphics/Rect:width	()I
      //   282: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   285: ldc 160
      //   287: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   290: aload 8
      //   292: invokevirtual 163	android/graphics/Rect:height	()I
      //   295: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   298: ldc 139
      //   300: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   303: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   306: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   309: pop
      //   310: ldc 114
      //   312: iconst_2
      //   313: aload_1
      //   314: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   317: invokestatic 120	com/tencent/qphone/base/util/QLog:i	(Ljava/lang/String;ILjava/lang/String;)V
      //   320: return
      //   321: astore 9
      //   323: aload_2
      //   324: aconst_null
      //   325: putfield 83	com/tencent/image/RegionBitmap$DrawData:mBitmap	Landroid/graphics/Bitmap;
      //   328: new 122	java/lang/StringBuilder
      //   331: dup
      //   332: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   335: astore 10
      //   337: aload 10
      //   339: new 122	java/lang/StringBuilder
      //   342: dup
      //   343: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   346: aload_0
      //   347: getfield 13	com/tencent/image/RegionBitmap$WorkHandler:this$0	Lcom/tencent/image/RegionBitmap;
      //   350: invokestatic 73	com/tencent/image/RegionBitmap:access$000	(Lcom/tencent/image/RegionBitmap;)Landroid/graphics/BitmapRegionDecoder;
      //   353: invokevirtual 166	android/graphics/BitmapRegionDecoder:getWidth	()I
      //   356: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   359: ldc 168
      //   361: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   364: aload_0
      //   365: getfield 13	com/tencent/image/RegionBitmap$WorkHandler:this$0	Lcom/tencent/image/RegionBitmap;
      //   368: invokestatic 73	com/tencent/image/RegionBitmap:access$000	(Lcom/tencent/image/RegionBitmap;)Landroid/graphics/BitmapRegionDecoder;
      //   371: invokevirtual 171	android/graphics/BitmapRegionDecoder:getHeight	()I
      //   374: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   377: ldc 139
      //   379: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   382: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   385: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   388: pop
      //   389: invokestatic 112	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
      //   392: ifeq +16 -> 408
      //   395: ldc 114
      //   397: iconst_1
      //   398: aload 10
      //   400: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   403: aload 9
      //   405: invokestatic 175	com/tencent/qphone/base/util/QLog:w	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
      //   408: aload_2
      //   409: getfield 83	com/tencent/image/RegionBitmap$DrawData:mBitmap	Landroid/graphics/Bitmap;
      //   412: astore 9
      //   414: aload_2
      //   415: aload_1
      //   416: getfield 69	android/graphics/BitmapFactory$Options:inSampleSize	I
      //   419: putfield 86	com/tencent/image/RegionBitmap$DrawData:mDecodeSample	I
      //   422: aload 9
      //   424: ifnull +35 -> 459
      //   427: aload 9
      //   429: invokevirtual 92	android/graphics/Bitmap:isRecycled	()Z
      //   432: ifne +27 -> 459
      //   435: aload_0
      //   436: getfield 13	com/tencent/image/RegionBitmap$WorkHandler:this$0	Lcom/tencent/image/RegionBitmap;
      //   439: invokestatic 96	com/tencent/image/RegionBitmap:access$200	(Lcom/tencent/image/RegionBitmap;)Ljava/lang/ref/WeakReference;
      //   442: invokevirtual 102	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
      //   445: checkcast 104	com/tencent/image/RegionBitmap$OnUpdateCallback
      //   448: astore_1
      //   449: aload_1
      //   450: ifnull +9 -> 459
      //   453: aload_1
      //   454: invokeinterface 107 1 0
      //   459: invokestatic 112	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
      //   462: ifeq -328 -> 134
      //   465: aload 9
      //   467: ifnonnull +12 -> 479
      //   470: ldc 114
      //   472: iconst_2
      //   473: ldc 116
      //   475: invokestatic 120	com/tencent/qphone/base/util/QLog:i	(Ljava/lang/String;ILjava/lang/String;)V
      //   478: return
      //   479: invokestatic 37	android/os/SystemClock:uptimeMillis	()J
      //   482: lstore 6
      //   484: new 122	java/lang/StringBuilder
      //   487: dup
      //   488: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   491: astore_1
      //   492: aload_1
      //   493: new 122	java/lang/StringBuilder
      //   496: dup
      //   497: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   500: ldc 125
      //   502: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   505: lload 6
      //   507: lload 4
      //   509: lsub
      //   510: invokevirtual 132	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
      //   513: ldc 134
      //   515: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   518: iload_3
      //   519: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   522: ldc 139
      //   524: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   527: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   530: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   533: pop
      //   534: aload_1
      //   535: new 122	java/lang/StringBuilder
      //   538: dup
      //   539: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   542: ldc 145
      //   544: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   547: aload 8
      //   549: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   552: ldc 139
      //   554: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   557: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   560: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   563: pop
      //   564: aload_1
      //   565: new 122	java/lang/StringBuilder
      //   568: dup
      //   569: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   572: ldc 150
      //   574: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   577: aload_2
      //   578: getfield 86	com/tencent/image/RegionBitmap$DrawData:mDecodeSample	I
      //   581: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   584: ldc 152
      //   586: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   589: aload_2
      //   590: getfield 55	com/tencent/image/RegionBitmap$DrawData:mDrawRect	Landroid/graphics/Rect;
      //   593: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   596: ldc 139
      //   598: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   601: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   604: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   607: pop
      //   608: aload_1
      //   609: new 122	java/lang/StringBuilder
      //   612: dup
      //   613: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   616: ldc 154
      //   618: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   621: aload 8
      //   623: invokevirtual 158	android/graphics/Rect:width	()I
      //   626: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   629: ldc 160
      //   631: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   634: aload 8
      //   636: invokevirtual 163	android/graphics/Rect:height	()I
      //   639: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   642: ldc 139
      //   644: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   647: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   650: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   653: pop
      //   654: ldc 114
      //   656: iconst_2
      //   657: aload_1
      //   658: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   661: invokestatic 120	com/tencent/qphone/base/util/QLog:i	(Ljava/lang/String;ILjava/lang/String;)V
      //   664: return
      //   665: astore 9
      //   667: invokestatic 112	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
      //   670: ifeq +31 -> 701
      //   673: ldc 114
      //   675: iconst_2
      //   676: new 122	java/lang/StringBuilder
      //   679: dup
      //   680: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   683: ldc 177
      //   685: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   688: aload_1
      //   689: getfield 69	android/graphics/BitmapFactory$Options:inSampleSize	I
      //   692: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   695: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   698: invokestatic 120	com/tencent/qphone/base/util/QLog:i	(Ljava/lang/String;ILjava/lang/String;)V
      //   701: invokestatic 182	java/lang/System:gc	()V
      //   704: aload_1
      //   705: aload_1
      //   706: getfield 69	android/graphics/BitmapFactory$Options:inSampleSize	I
      //   709: iconst_1
      //   710: ishl
      //   711: putfield 69	android/graphics/BitmapFactory$Options:inSampleSize	I
      //   714: aload_2
      //   715: aload_0
      //   716: getfield 13	com/tencent/image/RegionBitmap$WorkHandler:this$0	Lcom/tencent/image/RegionBitmap;
      //   719: invokestatic 73	com/tencent/image/RegionBitmap:access$000	(Lcom/tencent/image/RegionBitmap;)Landroid/graphics/BitmapRegionDecoder;
      //   722: aload 8
      //   724: aload_1
      //   725: invokevirtual 79	android/graphics/BitmapRegionDecoder:decodeRegion	(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
      //   728: putfield 83	com/tencent/image/RegionBitmap$DrawData:mBitmap	Landroid/graphics/Bitmap;
      //   731: aload_2
      //   732: getfield 83	com/tencent/image/RegionBitmap$DrawData:mBitmap	Landroid/graphics/Bitmap;
      //   735: astore 9
      //   737: aload_2
      //   738: aload_1
      //   739: getfield 69	android/graphics/BitmapFactory$Options:inSampleSize	I
      //   742: putfield 86	com/tencent/image/RegionBitmap$DrawData:mDecodeSample	I
      //   745: aload 9
      //   747: ifnull +35 -> 782
      //   750: aload 9
      //   752: invokevirtual 92	android/graphics/Bitmap:isRecycled	()Z
      //   755: ifne +27 -> 782
      //   758: aload_0
      //   759: getfield 13	com/tencent/image/RegionBitmap$WorkHandler:this$0	Lcom/tencent/image/RegionBitmap;
      //   762: invokestatic 96	com/tencent/image/RegionBitmap:access$200	(Lcom/tencent/image/RegionBitmap;)Ljava/lang/ref/WeakReference;
      //   765: invokevirtual 102	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
      //   768: checkcast 104	com/tencent/image/RegionBitmap$OnUpdateCallback
      //   771: astore_1
      //   772: aload_1
      //   773: ifnull +9 -> 782
      //   776: aload_1
      //   777: invokeinterface 107 1 0
      //   782: invokestatic 112	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
      //   785: ifeq -651 -> 134
      //   788: aload 9
      //   790: ifnonnull +128 -> 918
      //   793: ldc 114
      //   795: iconst_2
      //   796: ldc 116
      //   798: invokestatic 120	com/tencent/qphone/base/util/QLog:i	(Ljava/lang/String;ILjava/lang/String;)V
      //   801: return
      //   802: astore 9
      //   804: invokestatic 112	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
      //   807: ifeq -76 -> 731
      //   810: ldc 114
      //   812: iconst_1
      //   813: new 122	java/lang/StringBuilder
      //   816: dup
      //   817: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   820: ldc 184
      //   822: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   825: aload_1
      //   826: getfield 69	android/graphics/BitmapFactory$Options:inSampleSize	I
      //   829: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   832: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   835: aload 9
      //   837: invokestatic 175	com/tencent/qphone/base/util/QLog:w	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
      //   840: goto -109 -> 731
      //   843: astore 9
      //   845: aload_2
      //   846: getfield 83	com/tencent/image/RegionBitmap$DrawData:mBitmap	Landroid/graphics/Bitmap;
      //   849: astore 10
      //   851: aload_2
      //   852: aload_1
      //   853: getfield 69	android/graphics/BitmapFactory$Options:inSampleSize	I
      //   856: putfield 86	com/tencent/image/RegionBitmap$DrawData:mDecodeSample	I
      //   859: aload 10
      //   861: ifnull +35 -> 896
      //   864: aload 10
      //   866: invokevirtual 92	android/graphics/Bitmap:isRecycled	()Z
      //   869: ifne +27 -> 896
      //   872: aload_0
      //   873: getfield 13	com/tencent/image/RegionBitmap$WorkHandler:this$0	Lcom/tencent/image/RegionBitmap;
      //   876: invokestatic 96	com/tencent/image/RegionBitmap:access$200	(Lcom/tencent/image/RegionBitmap;)Ljava/lang/ref/WeakReference;
      //   879: invokevirtual 102	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
      //   882: checkcast 104	com/tencent/image/RegionBitmap$OnUpdateCallback
      //   885: astore_1
      //   886: aload_1
      //   887: ifnull +9 -> 896
      //   890: aload_1
      //   891: invokeinterface 107 1 0
      //   896: invokestatic 112	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
      //   899: ifeq +16 -> 915
      //   902: aload 10
      //   904: ifnonnull +544 -> 1448
      //   907: ldc 114
      //   909: iconst_2
      //   910: ldc 116
      //   912: invokestatic 120	com/tencent/qphone/base/util/QLog:i	(Ljava/lang/String;ILjava/lang/String;)V
      //   915: aload 9
      //   917: athrow
      //   918: invokestatic 37	android/os/SystemClock:uptimeMillis	()J
      //   921: lstore 6
      //   923: new 122	java/lang/StringBuilder
      //   926: dup
      //   927: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   930: astore_1
      //   931: aload_1
      //   932: new 122	java/lang/StringBuilder
      //   935: dup
      //   936: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   939: ldc 125
      //   941: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   944: lload 6
      //   946: lload 4
      //   948: lsub
      //   949: invokevirtual 132	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
      //   952: ldc 134
      //   954: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   957: iload_3
      //   958: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   961: ldc 139
      //   963: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   966: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   969: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   972: pop
      //   973: aload_1
      //   974: new 122	java/lang/StringBuilder
      //   977: dup
      //   978: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   981: ldc 145
      //   983: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   986: aload 8
      //   988: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   991: ldc 139
      //   993: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   996: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   999: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1002: pop
      //   1003: aload_1
      //   1004: new 122	java/lang/StringBuilder
      //   1007: dup
      //   1008: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   1011: ldc 150
      //   1013: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1016: aload_2
      //   1017: getfield 86	com/tencent/image/RegionBitmap$DrawData:mDecodeSample	I
      //   1020: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   1023: ldc 152
      //   1025: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1028: aload_2
      //   1029: getfield 55	com/tencent/image/RegionBitmap$DrawData:mDrawRect	Landroid/graphics/Rect;
      //   1032: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   1035: ldc 139
      //   1037: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1040: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   1043: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1046: pop
      //   1047: aload_1
      //   1048: new 122	java/lang/StringBuilder
      //   1051: dup
      //   1052: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   1055: ldc 154
      //   1057: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1060: aload 8
      //   1062: invokevirtual 158	android/graphics/Rect:width	()I
      //   1065: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   1068: ldc 160
      //   1070: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1073: aload 8
      //   1075: invokevirtual 163	android/graphics/Rect:height	()I
      //   1078: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   1081: ldc 139
      //   1083: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1086: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   1089: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1092: pop
      //   1093: ldc 114
      //   1095: iconst_2
      //   1096: aload_1
      //   1097: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   1100: invokestatic 120	com/tencent/qphone/base/util/QLog:i	(Ljava/lang/String;ILjava/lang/String;)V
      //   1103: return
      //   1104: astore 9
      //   1106: aload_2
      //   1107: aconst_null
      //   1108: putfield 83	com/tencent/image/RegionBitmap$DrawData:mBitmap	Landroid/graphics/Bitmap;
      //   1111: new 122	java/lang/StringBuilder
      //   1114: dup
      //   1115: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   1118: astore 10
      //   1120: aload 10
      //   1122: new 122	java/lang/StringBuilder
      //   1125: dup
      //   1126: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   1129: aload_0
      //   1130: getfield 13	com/tencent/image/RegionBitmap$WorkHandler:this$0	Lcom/tencent/image/RegionBitmap;
      //   1133: invokestatic 73	com/tencent/image/RegionBitmap:access$000	(Lcom/tencent/image/RegionBitmap;)Landroid/graphics/BitmapRegionDecoder;
      //   1136: invokevirtual 166	android/graphics/BitmapRegionDecoder:getWidth	()I
      //   1139: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   1142: ldc 168
      //   1144: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1147: aload_0
      //   1148: getfield 13	com/tencent/image/RegionBitmap$WorkHandler:this$0	Lcom/tencent/image/RegionBitmap;
      //   1151: invokestatic 73	com/tencent/image/RegionBitmap:access$000	(Lcom/tencent/image/RegionBitmap;)Landroid/graphics/BitmapRegionDecoder;
      //   1154: invokevirtual 171	android/graphics/BitmapRegionDecoder:getHeight	()I
      //   1157: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   1160: ldc 139
      //   1162: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1165: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   1168: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1171: pop
      //   1172: invokestatic 112	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
      //   1175: ifeq +16 -> 1191
      //   1178: ldc 114
      //   1180: iconst_1
      //   1181: aload 10
      //   1183: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   1186: aload 9
      //   1188: invokestatic 175	com/tencent/qphone/base/util/QLog:w	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
      //   1191: aload_2
      //   1192: getfield 83	com/tencent/image/RegionBitmap$DrawData:mBitmap	Landroid/graphics/Bitmap;
      //   1195: astore 9
      //   1197: aload_2
      //   1198: aload_1
      //   1199: getfield 69	android/graphics/BitmapFactory$Options:inSampleSize	I
      //   1202: putfield 86	com/tencent/image/RegionBitmap$DrawData:mDecodeSample	I
      //   1205: aload 9
      //   1207: ifnull +35 -> 1242
      //   1210: aload 9
      //   1212: invokevirtual 92	android/graphics/Bitmap:isRecycled	()Z
      //   1215: ifne +27 -> 1242
      //   1218: aload_0
      //   1219: getfield 13	com/tencent/image/RegionBitmap$WorkHandler:this$0	Lcom/tencent/image/RegionBitmap;
      //   1222: invokestatic 96	com/tencent/image/RegionBitmap:access$200	(Lcom/tencent/image/RegionBitmap;)Ljava/lang/ref/WeakReference;
      //   1225: invokevirtual 102	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
      //   1228: checkcast 104	com/tencent/image/RegionBitmap$OnUpdateCallback
      //   1231: astore_1
      //   1232: aload_1
      //   1233: ifnull +9 -> 1242
      //   1236: aload_1
      //   1237: invokeinterface 107 1 0
      //   1242: invokestatic 112	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
      //   1245: ifeq -1111 -> 134
      //   1248: aload 9
      //   1250: ifnonnull +12 -> 1262
      //   1253: ldc 114
      //   1255: iconst_2
      //   1256: ldc 116
      //   1258: invokestatic 120	com/tencent/qphone/base/util/QLog:i	(Ljava/lang/String;ILjava/lang/String;)V
      //   1261: return
      //   1262: invokestatic 37	android/os/SystemClock:uptimeMillis	()J
      //   1265: lstore 6
      //   1267: new 122	java/lang/StringBuilder
      //   1270: dup
      //   1271: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   1274: astore_1
      //   1275: aload_1
      //   1276: new 122	java/lang/StringBuilder
      //   1279: dup
      //   1280: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   1283: ldc 125
      //   1285: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1288: lload 6
      //   1290: lload 4
      //   1292: lsub
      //   1293: invokevirtual 132	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
      //   1296: ldc 134
      //   1298: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1301: iload_3
      //   1302: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   1305: ldc 139
      //   1307: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1310: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   1313: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1316: pop
      //   1317: aload_1
      //   1318: new 122	java/lang/StringBuilder
      //   1321: dup
      //   1322: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   1325: ldc 145
      //   1327: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1330: aload 8
      //   1332: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   1335: ldc 139
      //   1337: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1340: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   1343: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1346: pop
      //   1347: aload_1
      //   1348: new 122	java/lang/StringBuilder
      //   1351: dup
      //   1352: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   1355: ldc 150
      //   1357: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1360: aload_2
      //   1361: getfield 86	com/tencent/image/RegionBitmap$DrawData:mDecodeSample	I
      //   1364: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   1367: ldc 152
      //   1369: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1372: aload_2
      //   1373: getfield 55	com/tencent/image/RegionBitmap$DrawData:mDrawRect	Landroid/graphics/Rect;
      //   1376: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   1379: ldc 139
      //   1381: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1384: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   1387: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1390: pop
      //   1391: aload_1
      //   1392: new 122	java/lang/StringBuilder
      //   1395: dup
      //   1396: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   1399: ldc 154
      //   1401: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1404: aload 8
      //   1406: invokevirtual 158	android/graphics/Rect:width	()I
      //   1409: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   1412: ldc 160
      //   1414: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1417: aload 8
      //   1419: invokevirtual 163	android/graphics/Rect:height	()I
      //   1422: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   1425: ldc 139
      //   1427: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1430: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   1433: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1436: pop
      //   1437: ldc 114
      //   1439: iconst_2
      //   1440: aload_1
      //   1441: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   1444: invokestatic 120	com/tencent/qphone/base/util/QLog:i	(Ljava/lang/String;ILjava/lang/String;)V
      //   1447: return
      //   1448: invokestatic 37	android/os/SystemClock:uptimeMillis	()J
      //   1451: lstore 6
      //   1453: new 122	java/lang/StringBuilder
      //   1456: dup
      //   1457: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   1460: astore_1
      //   1461: aload_1
      //   1462: new 122	java/lang/StringBuilder
      //   1465: dup
      //   1466: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   1469: ldc 125
      //   1471: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1474: lload 6
      //   1476: lload 4
      //   1478: lsub
      //   1479: invokevirtual 132	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
      //   1482: ldc 134
      //   1484: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1487: iload_3
      //   1488: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   1491: ldc 139
      //   1493: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1496: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   1499: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1502: pop
      //   1503: aload_1
      //   1504: new 122	java/lang/StringBuilder
      //   1507: dup
      //   1508: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   1511: ldc 145
      //   1513: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1516: aload 8
      //   1518: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   1521: ldc 139
      //   1523: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1526: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   1529: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1532: pop
      //   1533: aload_1
      //   1534: new 122	java/lang/StringBuilder
      //   1537: dup
      //   1538: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   1541: ldc 150
      //   1543: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1546: aload_2
      //   1547: getfield 86	com/tencent/image/RegionBitmap$DrawData:mDecodeSample	I
      //   1550: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   1553: ldc 152
      //   1555: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1558: aload_2
      //   1559: getfield 55	com/tencent/image/RegionBitmap$DrawData:mDrawRect	Landroid/graphics/Rect;
      //   1562: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   1565: ldc 139
      //   1567: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1570: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   1573: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1576: pop
      //   1577: aload_1
      //   1578: new 122	java/lang/StringBuilder
      //   1581: dup
      //   1582: invokespecial 123	java/lang/StringBuilder:<init>	()V
      //   1585: ldc 154
      //   1587: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1590: aload 8
      //   1592: invokevirtual 158	android/graphics/Rect:width	()I
      //   1595: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   1598: ldc 160
      //   1600: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1603: aload 8
      //   1605: invokevirtual 163	android/graphics/Rect:height	()I
      //   1608: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   1611: ldc 139
      //   1613: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1616: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   1619: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1622: pop
      //   1623: ldc 114
      //   1625: iconst_2
      //   1626: aload_1
      //   1627: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   1630: invokestatic 120	com/tencent/qphone/base/util/QLog:i	(Ljava/lang/String;ILjava/lang/String;)V
      //   1633: goto -718 -> 915
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	1636	0	this	WorkHandler
      //   0	1636	1	paramRegionDrawableData	RegionDrawableData
      //   0	1636	2	paramDrawData	RegionBitmap.DrawData
      //   0	1636	3	paramInt	int
      //   3	1474	4	l1	long
      //   138	1337	6	l2	long
      //   12	1592	8	localRect	Rect
      //   68	54	9	localBitmap1	Bitmap
      //   321	83	9	localIllegalArgumentException	java.lang.IllegalArgumentException
      //   412	54	9	localBitmap2	Bitmap
      //   665	1	9	localOutOfMemoryError	java.lang.OutOfMemoryError
      //   735	54	9	localBitmap3	Bitmap
      //   802	34	9	localException	Exception
      //   843	73	9	localObject1	Object
      //   1104	83	9	localRuntimeException	RuntimeException
      //   1195	54	9	localBitmap4	Bitmap
      //   335	847	10	localObject2	Object
      // Exception table:
      //   from	to	target	type
      //   47	64	321	java/lang/IllegalArgumentException
      //   47	64	665	java/lang/OutOfMemoryError
      //   701	731	802	java/lang/Exception
      //   47	64	843	finally
      //   323	408	843	finally
      //   667	701	843	finally
      //   701	731	843	finally
      //   804	840	843	finally
      //   1106	1191	843	finally
      //   47	64	1104	java/lang/RuntimeException
    }
    
    private void initRegionDecoder()
    {
      if ((RegionBitmap.this.mRegionDecoder == null) || (RegionBitmap.this.mRegionDecoder.isRecycled())) {
        if (TextUtils.isEmpty(RegionBitmap.this.mImagePath)) {
          throw new RuntimeException("Image path is null");
        }
      }
      try
      {
        RegionBitmap.access$002(RegionBitmap.this, BitmapRegionDecoder.newInstance(RegionBitmap.this.mImagePath, true));
        if ((QLog.isColorLevel()) && (RegionBitmap.this.mRegionDecoder != null)) {
          QLog.i("RegionDrawable", 2, "origin size " + RegionBitmap.this.mRegionDecoder.getWidth() + "x" + RegionBitmap.this.mRegionDecoder.getHeight());
        }
        if ((RegionBitmap.this.mRegionDecoder == null) && (QLog.isColorLevel())) {
          QLog.e("RegionBitmap", 2, "BitmapRegionDecoder object is null");
        }
        return;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        for (;;)
        {
          try
          {
            Uri localUri = Uri.parse(RegionBitmap.this.mImagePath);
            RegionBitmap.access$002(RegionBitmap.this, BitmapRegionDecoder.newInstance(localUri.getPath(), true));
          }
          catch (Exception localException1)
          {
            if (QLog.isColorLevel()) {
              QLog.e("RegionBitmap", 2, "Init BitmapRegionDecoder failure", localException1);
            }
            RegionBitmap.access$002(RegionBitmap.this, null);
          }
        }
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          if (QLog.isColorLevel()) {
            QLog.e("RegionBitmap", 2, "Init BitmapRegionDecoder failure", localException2);
          }
          RegionBitmap.access$002(RegionBitmap.this, null);
        }
      }
    }
    
    public void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      }
      label670:
      do
      {
        int n;
        do
        {
          do
          {
            return;
            initRegionDecoder();
          } while ((RegionBitmap.this.mRegionDecoder == null) || (!RegionDrawableData.class.isInstance(paramMessage.obj)));
          paramMessage = (RegionDrawableData)paramMessage.obj;
          n = paramMessage.calcSample();
        } while (n == 0);
        if (RegionBitmap.this.mHelper == null) {
          RegionBitmap.access$302(RegionBitmap.this, new RegionBitmapBlockHelper(new Rect(0, 0, RegionBitmap.this.mRegionDecoder.getWidth(), RegionBitmap.this.mRegionDecoder.getHeight()), paramMessage.mSourceDensity, paramMessage.mTargetDensity));
        }
        long l1 = SystemClock.uptimeMillis();
        Rect localRect = RegionBitmap.regionToDecode(paramMessage.mSourceDensity, paramMessage.mTargetDensity, paramMessage.mShowArea);
        ??? = RegionBitmap.this.mHelper.getDrawDatas(paramMessage, n);
        Object localObject1 = new RegionDrawDataList();
        ??? = ((LinkedList)???).iterator();
        int i = 0;
        int j = 0;
        int k = 0;
        if (((Iterator)???).hasNext())
        {
          RegionBitmap.DrawData localDrawData1 = (RegionBitmap.DrawData)((Iterator)???).next();
          RegionBitmap.DrawData localDrawData2 = RegionBitmap.this.mDataList.getRegionData(localDrawData1);
          int m;
          if (localDrawData2 == null)
          {
            ((RegionDrawDataList)localObject1).add(localDrawData1);
            m = k;
            k = i + 1;
            i = m;
          }
          for (;;)
          {
            m = k;
            k = i;
            i = m;
            break;
            ((RegionDrawDataList)localObject1).add(localDrawData2);
            if (localDrawData2.mBitmap == null)
            {
              j += 1;
              m = i;
              i = k;
              k = m;
            }
            else
            {
              m = k + 1;
              k = i;
              i = m;
            }
          }
        }
        long l2 = SystemClock.uptimeMillis();
        for (;;)
        {
          synchronized (RegionBitmap.this.mDataLock)
          {
            RegionBitmap.access$402(RegionBitmap.this, (RegionDrawDataList)localObject1);
            long l3 = SystemClock.uptimeMillis();
            localObject1 = RegionBitmap.this.mDataList.iterator();
            j = 0;
            if (((Iterator)localObject1).hasNext())
            {
              ??? = (RegionBitmap.DrawData)((Iterator)localObject1).next();
              if ((n == ((RegionBitmap.DrawData)???).mDecodeSample) && (((RegionBitmap.DrawData)???).mBitmap != null) && (((RegionBitmap.DrawData)???).mDrawRect != null) && (!((RegionBitmap.DrawData)???).mDrawRect.isEmpty())) {
                continue;
              }
              if (RegionBitmap.this.mCurrentTaskTime == paramMessage.mTaskTime) {
                break label670;
              }
              if (QLog.isColorLevel()) {
                QLog.e("RegionBitmap", 2, "decode cancel");
              }
            }
            RegionBitmap.access$702(RegionBitmap.this, n);
            RegionBitmap.this.mDecodeRect.set(localRect);
            if (!QLog.isColorLevel()) {
              break;
            }
            QLog.i("RegionDrawable", 2, "选取有效块:cost " + (l2 - l1));
            QLog.i("RegionDrawable", 2, "解析有效块:cost " + (SystemClock.uptimeMillis() - l3));
            QLog.i("RegionDrawable", 2, "分块：" + RegionBitmap.this.mDataList.size());
            QLog.i("RegionDrawable", 2, "new block " + i + ", old block not decode " + i + ",old block decode " + i);
            QLog.i("RegionDrawable", 2, "decode rect " + localRect + " sample " + n);
            return;
          }
          decode(paramMessage, (RegionBitmap.DrawData)???, n);
          j += 1;
        }
      } while ((RegionBitmap.this.mRegionDecoder == null) || (RegionBitmap.this.mRegionDecoder.isRecycled()));
      RegionBitmap.this.mRegionDecoder.recycle();
      RegionBitmap.access$002(RegionBitmap.this, null);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.tim\classes.jar
 * Qualified Name:     com.tencent.image.RegionBitmap
 * JD-Core Version:    0.7.0.1
 */
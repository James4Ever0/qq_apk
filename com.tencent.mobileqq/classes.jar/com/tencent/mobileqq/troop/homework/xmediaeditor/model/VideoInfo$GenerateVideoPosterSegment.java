package com.tencent.mobileqq.troop.homework.xmediaeditor.model;

import aiwh;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import com.tencent.image.URLDrawable;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.troop.homework.xmediaeditor.XMediaEditor;
import com.tencent.mobileqq.troop.homework.xmediaeditor.ui.ImageItem;
import com.tencent.mobileqq.utils.ImageUtil;
import com.tencent.qphone.base.util.QLog;
import com.tribe.async.async.JobContext;
import com.tribe.async.async.JobSegment;
import java.io.File;
import java.lang.ref.WeakReference;
import mqq.os.MqqHandler;

public class VideoInfo$GenerateVideoPosterSegment
  extends JobSegment
{
  private int jdField_a_of_type_Int;
  private WeakReference jdField_a_of_type_JavaLangRefWeakReference;
  private boolean jdField_a_of_type_Boolean;
  
  public VideoInfo$GenerateVideoPosterSegment(XMediaEditor paramXMediaEditor, int paramInt)
  {
    this.jdField_a_of_type_JavaLangRefWeakReference = new WeakReference(paramXMediaEditor);
    this.jdField_a_of_type_Int = paramInt;
  }
  
  protected void a(JobContext paramJobContext, VideoInfo paramVideoInfo)
  {
    if (QLog.isColorLevel()) {
      QLog.d("GenerateVideoPosterSegment", 2, new Object[] { "GenerateVideoPosterSegment start. info status=", Integer.valueOf(paramVideoInfo.g) });
    }
    String str2 = ImageInfo.b();
    MediaMetadataRetriever localMediaMetadataRetriever = new MediaMetadataRetriever();
    Object localObject5 = null;
    Bitmap localBitmap1 = null;
    String str1 = null;
    Object localObject3 = str1;
    Object localObject4 = localObject5;
    Object localObject1 = localBitmap1;
    for (;;)
    {
      try
      {
        localMediaMetadataRetriever.setDataSource(paramVideoInfo.f);
        localObject3 = str1;
        localObject4 = localObject5;
        localObject1 = localBitmap1;
        localBitmap2 = localMediaMetadataRetriever.getFrameAtTime(-1L);
        if (localBitmap2 == null)
        {
          localObject3 = str1;
          localObject4 = localObject5;
          localObject1 = localBitmap1;
          notifyError(new Error("-201"));
        }
      }
      catch (Exception paramJobContext)
      {
        Bitmap localBitmap2;
        int[] arrayOfInt;
        localObject1 = localObject3;
        QLog.e("GenerateVideoPosterSegment", 1, "error retrieve video info" + paramJobContext.getMessage());
        localObject1 = localObject3;
        notifyError(new Error("-201"));
        try
        {
          localMediaMetadataRetriever.release();
          if (localObject3 == null) {
            continue;
          }
          ((Bitmap)localObject3).recycle();
          return;
        }
        catch (RuntimeException paramJobContext)
        {
          return;
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        localObject2 = localObject4;
        QLog.e("GenerateVideoPosterSegment", 1, "GenerateVideoPosterSegment error. OutOfMemoryError");
        localObject2 = localObject4;
        URLDrawable.clearMemoryCache();
        localObject2 = localObject4;
        System.gc();
        localObject2 = localObject4;
        if (!this.jdField_a_of_type_Boolean)
        {
          localObject2 = localObject4;
          this.jdField_a_of_type_Boolean = true;
          localObject2 = localObject4;
          a(paramJobContext, paramVideoInfo);
          try
          {
            localMediaMetadataRetriever.release();
            if (localObject4 == null) {
              continue;
            }
            ((Bitmap)localObject4).recycle();
            return;
          }
          catch (RuntimeException paramJobContext)
          {
            return;
          }
        }
        localObject2 = localObject4;
        notifyError(new Error("-1"));
        continue;
      }
      finally
      {
        try
        {
          Object localObject2;
          localMediaMetadataRetriever.release();
          if (localObject2 != null) {
            localObject2.recycle();
          }
        }
        catch (RuntimeException paramVideoInfo)
        {
          continue;
        }
      }
      try
      {
        localMediaMetadataRetriever.release();
        if (0 != 0) {
          throw new NullPointerException();
        }
        return;
      }
      catch (RuntimeException paramJobContext) {}
      localObject3 = str1;
      localObject4 = localObject5;
      localObject1 = localBitmap1;
      arrayOfInt = ImageItem.a(this.jdField_a_of_type_Int, 200, 300, paramVideoInfo.jdField_a_of_type_Int, paramVideoInfo.b);
      localObject3 = str1;
      localObject4 = localObject5;
      localObject1 = localBitmap1;
      localBitmap1 = ThumbnailUtils.extractThumbnail(localBitmap2, arrayOfInt[0], arrayOfInt[1]);
      if (localBitmap1 == null)
      {
        localObject3 = localBitmap1;
        localObject4 = localBitmap1;
        localObject1 = localBitmap1;
        notifyError(new Error("-201"));
        try
        {
          localMediaMetadataRetriever.release();
          if (localBitmap1 == null) {
            continue;
          }
          localBitmap1.recycle();
          return;
        }
        catch (RuntimeException paramJobContext) {}
      }
      else
      {
        localObject3 = localBitmap1;
        localObject4 = localBitmap1;
        localObject1 = localBitmap1;
        str1 = str2 + "videoThumb_" + System.currentTimeMillis() + ".jpg";
        localObject3 = localBitmap1;
        localObject4 = localBitmap1;
        localObject1 = localBitmap1;
        ImageUtil.a(localBitmap1, new File(str1));
        localObject3 = localBitmap1;
        localObject4 = localBitmap1;
        localObject1 = localBitmap1;
        paramVideoInfo.c = str1;
        localObject3 = localBitmap1;
        localObject4 = localBitmap1;
        localObject1 = localBitmap1;
        ThreadManager.getUIHandler().post(new aiwh(this, paramVideoInfo, str1));
        localObject3 = localBitmap1;
        localObject4 = localBitmap1;
        localObject1 = localBitmap1;
        if (!isCanceled())
        {
          localObject3 = localBitmap1;
          localObject4 = localBitmap1;
          localObject1 = localBitmap1;
          if (QLog.isColorLevel())
          {
            localObject3 = localBitmap1;
            localObject4 = localBitmap1;
            localObject1 = localBitmap1;
            QLog.d("GenerateVideoPosterSegment", 2, new Object[] { "GenerateVideoPosterSegment notifyResult. info status=", Integer.valueOf(paramVideoInfo.g) });
          }
          localObject3 = localBitmap1;
          localObject4 = localBitmap1;
          localObject1 = localBitmap1;
          notifyResult(paramVideoInfo);
        }
        try
        {
          localMediaMetadataRetriever.release();
          if (localBitmap1 != null)
          {
            localBitmap1.recycle();
            return;
          }
        }
        catch (RuntimeException paramJobContext) {}
      }
    }
  }
  
  protected void onCancel()
  {
    notifyError(new Error("c_2000"));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\tmp2\com34.jar
 * Qualified Name:     com.tencent.mobileqq.troop.homework.xmediaeditor.model.VideoInfo.GenerateVideoPosterSegment
 * JD-Core Version:    0.7.0.1
 */
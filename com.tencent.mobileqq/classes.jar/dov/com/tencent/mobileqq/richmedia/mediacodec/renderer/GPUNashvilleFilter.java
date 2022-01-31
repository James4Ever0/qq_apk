package dov.com.tencent.mobileqq.richmedia.mediacodec.renderer;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import com.tencent.biz.qqstory.support.logging.SLog;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.richmedia.mediacodec.utils.GlUtil;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import java.io.IOException;
import java.io.InputStream;

public class GPUNashvilleFilter
  extends GPUDrawPartFilter
{
  private static String jdField_a_of_type_JavaLangString = GlUtil.a(BaseApplicationImpl.getContext(), 2131230754);
  private Bitmap jdField_a_of_type_AndroidGraphicsBitmap;
  private int e = -1;
  private int f;
  
  public GPUNashvilleFilter()
  {
    super("uniform mat4 uMVPMatrix;\nuniform mat4 uTextureMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTextureMatrix * aTextureCoord).xy;\n}\n", jdField_a_of_type_JavaLangString);
    this.d = 6;
  }
  
  protected void c()
  {
    super.c();
    Object localObject3 = null;
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        localInputStream = BaseApplicationImpl.getContext().getResources().openRawResource(2130843367);
        localObject1 = localInputStream;
        localObject3 = localInputStream;
        this.jdField_a_of_type_AndroidGraphicsBitmap = BitmapFactory.decodeStream(localInputStream);
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        InputStream localInputStream;
        localObject3 = localIOException1;
        SLog.e("Q.qqstory.publish.edit GPUNashvilleFilter", "OutOfMemoryError:%s", new Object[] { localOutOfMemoryError.getMessage() });
        if (localIOException1 == null) {
          continue;
        }
        try
        {
          localIOException1.close();
        }
        catch (IOException localIOException2)
        {
          localIOException2.printStackTrace();
        }
        continue;
      }
      finally
      {
        if (localObject3 == null) {
          break label111;
        }
      }
      try
      {
        localInputStream.close();
        this.f = GLES20.glGetUniformLocation(a(), "sTexture2");
        return;
      }
      catch (IOException localIOException1)
      {
        localIOException1.printStackTrace();
      }
    }
    try
    {
      localObject3.close();
      label111:
      throw localObject2;
    }
    catch (IOException localIOException3)
    {
      for (;;)
      {
        localIOException3.printStackTrace();
      }
    }
  }
  
  protected void e()
  {
    if (this.e != -1) {
      GlUtil.a(this.e);
    }
    if ((this.jdField_a_of_type_AndroidGraphicsBitmap != null) && (!this.jdField_a_of_type_AndroidGraphicsBitmap.isRecycled()))
    {
      this.jdField_a_of_type_AndroidGraphicsBitmap.recycle();
      this.jdField_a_of_type_AndroidGraphicsBitmap = null;
      SLog.b("Q.qqstory.publish.edit GPUNashvilleFilter", "mosaic bitmap recycle");
    }
  }
  
  protected void f()
  {
    super.f();
    GLES20.glActiveTexture(33985);
    if (this.e == -1)
    {
      if ((this.jdField_a_of_type_AndroidGraphicsBitmap == null) || (this.jdField_a_of_type_AndroidGraphicsBitmap.isRecycled()))
      {
        QLog.w("Q.qqstory.publish.edit GPUNashvilleFilter", 1, "bitmap error");
        return;
      }
      this.e = GlUtil.a(3553, this.jdField_a_of_type_AndroidGraphicsBitmap);
      this.jdField_a_of_type_AndroidGraphicsBitmap.recycle();
      this.jdField_a_of_type_AndroidGraphicsBitmap = null;
    }
    GLES20.glBindTexture(3553, this.e);
    GLES20.glUniform1i(this.f, 1);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     dov.com.tencent.mobileqq.richmedia.mediacodec.renderer.GPUNashvilleFilter
 * JD-Core Version:    0.7.0.1
 */
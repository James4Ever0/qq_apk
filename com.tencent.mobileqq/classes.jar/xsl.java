import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.tencent.mobileqq.activity.richmedia.subtitles.ItemBase;
import com.tencent.mobileqq.richmedia.mediacodec.renderer.RenderBuffer;
import com.tencent.mobileqq.richmedia.mediacodec.utils.GlUtil;
import com.tencent.qphone.base.util.QLog;

class xsl
{
  public float a;
  public int a;
  public Bitmap a;
  public xsk a;
  private xsm a;
  public boolean a;
  
  public xsl(String paramString, xsm paramxsm, Typeface paramTypeface)
  {
    this.jdField_a_of_type_Int = -1;
    this.jdField_a_of_type_Xsm = paramxsm;
    this.jdField_a_of_type_Xsk = new xsk(paramString, this.jdField_a_of_type_Xsm.c, this.jdField_a_of_type_Xsm.b, this.jdField_a_of_type_Xsm.e, this.jdField_a_of_type_Xsm.f, 0.0F, (this.jdField_a_of_type_Xsm.jdField_a_of_type_Float - this.jdField_a_of_type_Xsm.b) / 2.0F, paramTypeface);
    if (!TextUtils.isEmpty(paramString)) {}
    for (boolean bool = true;; bool = false)
    {
      this.jdField_a_of_type_Boolean = bool;
      b(paramString);
      return;
    }
  }
  
  private boolean a(String paramString1, String paramString2)
  {
    if ((paramString1 == null) && (paramString2 == null)) {}
    do
    {
      return true;
      if ((paramString1 == null) || (paramString2 == null)) {
        return false;
      }
    } while (paramString1.equals(paramString2));
    return false;
  }
  
  private void b(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      this.jdField_a_of_type_AndroidGraphicsBitmap = null;
      if (this.jdField_a_of_type_Int != -1)
      {
        GlUtil.a(this.jdField_a_of_type_Int);
        this.jdField_a_of_type_Int = -1;
      }
      return;
    }
    if (this.jdField_a_of_type_AndroidGraphicsBitmap != null) {
      this.jdField_a_of_type_AndroidGraphicsBitmap.recycle();
    }
    if (this.jdField_a_of_type_Int != -1)
    {
      GlUtil.a(this.jdField_a_of_type_Int);
      this.jdField_a_of_type_Int = -1;
    }
    this.jdField_a_of_type_AndroidGraphicsBitmap = ItemBase.a(this.jdField_a_of_type_Xsk.c, this.jdField_a_of_type_Xsm.jdField_a_of_type_Float);
    if (this.jdField_a_of_type_AndroidGraphicsBitmap != null)
    {
      paramString = new Canvas(this.jdField_a_of_type_AndroidGraphicsBitmap);
      this.jdField_a_of_type_Xsk.jdField_a_of_type_Float = 0.0F;
      this.jdField_a_of_type_Xsk.a(paramString);
    }
    for (;;)
    {
      this.jdField_a_of_type_Int = -1;
      return;
      QLog.d("BeanItemWrapper", 2, "createcache error:" + this.jdField_a_of_type_Xsk.c + "-" + this.jdField_a_of_type_Xsm.jdField_a_of_type_Float);
    }
  }
  
  public void a(Canvas paramCanvas, float paramFloat1, float paramFloat2)
  {
    if (!this.jdField_a_of_type_Boolean) {
      return;
    }
    if (this.jdField_a_of_type_AndroidGraphicsBitmap == null)
    {
      this.jdField_a_of_type_Xsk.jdField_a_of_type_Float = paramFloat1;
      paramFloat1 = this.jdField_a_of_type_Xsk.b;
      xsk localxsk = this.jdField_a_of_type_Xsk;
      localxsk.b += paramFloat2;
      this.jdField_a_of_type_Xsk.a(paramCanvas);
      this.jdField_a_of_type_Xsk.b = paramFloat1;
      return;
    }
    paramCanvas.drawBitmap(this.jdField_a_of_type_AndroidGraphicsBitmap, paramFloat1, paramFloat2, null);
  }
  
  public void a(RenderBuffer paramRenderBuffer, RectF paramRectF, float paramFloat1, float paramFloat2)
  {
    if ((paramRenderBuffer == null) || (!this.jdField_a_of_type_Boolean)) {}
    do
    {
      return;
      if ((this.jdField_a_of_type_Int < 0) && (this.jdField_a_of_type_AndroidGraphicsBitmap != null)) {
        this.jdField_a_of_type_Int = GlUtil.a(3553, this.jdField_a_of_type_AndroidGraphicsBitmap);
      }
    } while (this.jdField_a_of_type_Int < 0);
    ItemBase.a(paramRenderBuffer, this.jdField_a_of_type_Int, this.jdField_a_of_type_Xsk.c, this.jdField_a_of_type_Xsm.jdField_a_of_type_Float, paramRectF, paramFloat1, paramFloat2);
  }
  
  public void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {}
    for (boolean bool = true;; bool = false)
    {
      this.jdField_a_of_type_Boolean = bool;
      if (!a(paramString, this.jdField_a_of_type_Xsk.jdField_a_of_type_JavaLangString))
      {
        this.jdField_a_of_type_Xsk.a(paramString);
        b(paramString);
      }
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xsl
 * JD-Core Version:    0.7.0.1
 */
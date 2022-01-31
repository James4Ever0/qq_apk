package dov.com.tencent.mobileqq.richmedia.mediacodec.renderer;

import android.opengl.GLES20;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.richmedia.mediacodec.utils.GlUtil;

public class GPUImageBrightnessFilter
  extends GPUDrawPartFilter
{
  private static String jdField_a_of_type_JavaLangString = GlUtil.a(BaseApplicationImpl.getContext(), 2131230751);
  private float jdField_a_of_type_Float;
  private int e;
  
  public GPUImageBrightnessFilter()
  {
    this(0.5F);
  }
  
  public GPUImageBrightnessFilter(float paramFloat)
  {
    super("uniform mat4 uMVPMatrix;\nuniform mat4 uTextureMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTextureMatrix * aTextureCoord).xy;\n}\n", jdField_a_of_type_JavaLangString);
    this.jdField_a_of_type_Float = paramFloat;
  }
  
  public void a(float paramFloat)
  {
    this.jdField_a_of_type_Float = paramFloat;
  }
  
  public void c()
  {
    super.c();
    this.e = GLES20.glGetUniformLocation(a(), "brightness");
    a(this.jdField_a_of_type_Float);
  }
  
  protected void f()
  {
    super.f();
    GLES20.glUniform1f(this.e, this.jdField_a_of_type_Float);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     dov.com.tencent.mobileqq.richmedia.mediacodec.renderer.GPUImageBrightnessFilter
 * JD-Core Version:    0.7.0.1
 */
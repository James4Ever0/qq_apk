import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.tencent.mobileqq.widget.ShaderAnimLayout;

public class eze
  extends Animation
{
  public eze(ShaderAnimLayout paramShaderAnimLayout) {}
  
  protected void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if (this.a.jdField_a_of_type_Boolean == true) {}
    for (this.a.jdField_a_of_type_Float = (1.0F - paramFloat);; this.a.jdField_a_of_type_Float = paramFloat)
    {
      this.a.invalidate();
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     eze
 * JD-Core Version:    0.7.0.1
 */
import com.tencent.mobileqq.ar.ARRenderModel.ARRenderMangerInnerCallback;
import com.tencent.mobileqq.ar.ARRenderModel.GreetingCardRender;
import com.tencent.mobileqq.armap.sensor.SimpleSensorChangeListener;

public class aahj
  extends SimpleSensorChangeListener
{
  public aahj(GreetingCardRender paramGreetingCardRender) {}
  
  public void onRotationUpdateQuaternion(float[] paramArrayOfFloat)
  {
    GreetingCardRender.a(this.a).a(new aahk(this, paramArrayOfFloat));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aahj
 * JD-Core Version:    0.7.0.1
 */
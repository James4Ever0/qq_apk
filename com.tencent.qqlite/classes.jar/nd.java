import android.media.SoundPool;
import com.tencent.biz.game.SensorAPIJavaScript;
import com.tencent.qphone.base.util.QLog;

public class nd
  implements Runnable
{
  public nd(SensorAPIJavaScript paramSensorAPIJavaScript, int paramInt, String paramString) {}
  
  public void run()
  {
    if ((this.jdField_a_of_type_ComTencentBizGameSensorAPIJavaScript.a != null) && (this.jdField_a_of_type_ComTencentBizGameSensorAPIJavaScript.a.play(this.jdField_a_of_type_Int, 1.0F, 1.0F, 0, 0, 1.0F) == 0) && (QLog.isColorLevel())) {
      QLog.d("SensorApi", 2, "play failure url=" + this.jdField_a_of_type_JavaLangString);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     nd
 * JD-Core Version:    0.7.0.1
 */
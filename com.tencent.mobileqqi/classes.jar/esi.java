import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.widget.ImageView;
import com.tencent.mobileqq.activity.qquserguide.UserguideVideoFragment;
import com.tencent.qphone.base.util.QLog;

public class esi
  implements MediaPlayer.OnPreparedListener
{
  public esi(UserguideVideoFragment paramUserguideVideoFragment) {}
  
  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    this.a.jdField_a_of_type_AndroidWidgetImageView.postDelayed(new esj(this), 200L);
    if (QLog.isDevelopLevel()) {
      QLog.d(this.a.jdField_a_of_type_JavaLangString, 4, "fight............onPrepared .== ...........");
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     esi
 * JD-Core Version:    0.7.0.1
 */
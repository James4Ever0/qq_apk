import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import com.tencent.mobileqq.qzonealbumreddot.QzoneAlbumRedTouchManager;

public class aghp
  implements Runnable
{
  public aghp(QzoneAlbumRedTouchManager paramQzoneAlbumRedTouchManager) {}
  
  public void run()
  {
    SharedPreferences.Editor localEditor = QzoneAlbumRedTouchManager.a(this.a).edit().putLong("key_photo_guide_has_red_date", System.currentTimeMillis());
    if (Build.VERSION.SDK_INT < 9)
    {
      localEditor.commit();
      return;
    }
    localEditor.apply();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     aghp
 * JD-Core Version:    0.7.0.1
 */
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import cooperation.qzone.music.QzoneWebMusicJsPlugin;

public class iho
  implements DialogInterface.OnClickListener
{
  public iho(QzoneWebMusicJsPlugin paramQzoneWebMusicJsPlugin) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    QzoneWebMusicJsPlugin.access$102(this.a, false);
    QzoneWebMusicJsPlugin.access$200(this.a, "cancel");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     iho
 * JD-Core Version:    0.7.0.1
 */
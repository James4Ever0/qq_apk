import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.aio.photo.AIOGalleryScene;
import com.tencent.mobileqq.statistics.ReportController;

public class bxx
  implements View.OnClickListener
{
  public bxx(AIOGalleryScene paramAIOGalleryScene) {}
  
  public void onClick(View paramView)
  {
    ReportController.b(null, "CliOper", "", "", "View_pic", "View_pic_menu", 0, 0, "1", "", "", "");
    AIOGalleryScene.a(this.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     bxx
 * JD-Core Version:    0.7.0.1
 */
import com.tencent.common.galleryactivity.AbstractImageAdapter;
import com.tencent.mobileqq.activity.aio.photo.AIOImageListScene;
import com.tencent.mobileqq.activity.aio.photo.AIOPhotoListAdapter;

public class vld
  implements Runnable
{
  public vld(AIOImageListScene paramAIOImageListScene) {}
  
  public void run()
  {
    if ((this.a.a != null) && (!((AIOPhotoListAdapter)this.a.a).a(false))) {
      this.a.a.notifyDataSetChanged();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     vld
 * JD-Core Version:    0.7.0.1
 */
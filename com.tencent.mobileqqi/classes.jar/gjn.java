import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.mobileqq.profile.view.ProfilePhotoView;
import java.util.HashMap;

class gjn
  implements Runnable
{
  gjn(gjm paramgjm, Bitmap paramBitmap) {}
  
  public void run()
  {
    ImageView localImageView = (ImageView)this.jdField_a_of_type_Gjm.a.a.get("map_key_face");
    if (localImageView != null) {
      localImageView.setImageBitmap(this.jdField_a_of_type_AndroidGraphicsBitmap);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes3.jar
 * Qualified Name:     gjn
 * JD-Core Version:    0.7.0.1
 */
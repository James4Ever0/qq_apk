import android.view.View;
import com.tencent.mobileqq.app.TroopQZoneUploadAlbumHandler;
import com.tencent.mobileqq.app.TroopQZoneUploadAlbumHandler.Callback;
import java.lang.ref.WeakReference;

public class zvp
{
  WeakReference jdField_a_of_type_JavaLangRefWeakReference;
  public WeakReference b;
  
  public zvp(TroopQZoneUploadAlbumHandler paramTroopQZoneUploadAlbumHandler, View paramView, TroopQZoneUploadAlbumHandler.Callback paramCallback)
  {
    this.jdField_a_of_type_JavaLangRefWeakReference = new WeakReference(paramView);
    this.b = new WeakReference(paramCallback);
  }
  
  public View a()
  {
    return (View)this.jdField_a_of_type_JavaLangRefWeakReference.get();
  }
  
  public TroopQZoneUploadAlbumHandler.Callback a()
  {
    return (TroopQZoneUploadAlbumHandler.Callback)this.b.get();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     zvp
 * JD-Core Version:    0.7.0.1
 */
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.util.SparseArray;
import com.tencent.mobileqq.app.TroopQZoneUploadAlbumHandler;
import com.tencent.qphone.base.util.QLog;

public class flu
  implements ServiceConnection
{
  public flu(TroopQZoneUploadAlbumHandler paramTroopQZoneUploadAlbumHandler) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    QLog.d("UploadPhoto", 2, "onServiceConnected()...");
    this.a.jdField_a_of_type_AndroidOsMessenger = new Messenger(paramIBinder);
    this.a.jdField_b_of_type_AndroidOsMessenger = new Messenger(this.a.jdField_a_of_type_AndroidOsHandler);
    TroopQZoneUploadAlbumHandler.a(this.a, this.a.jdField_b_of_type_Int);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    QLog.d("UploadPhoto", 2, "onServiceDisconnected()...");
    this.a.jdField_a_of_type_AndroidOsMessenger = null;
    TroopQZoneUploadAlbumHandler.a(this.a, false);
    this.a.jdField_a_of_type_AndroidUtilSparseArray.clear();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     flu
 * JD-Core Version:    0.7.0.1
 */
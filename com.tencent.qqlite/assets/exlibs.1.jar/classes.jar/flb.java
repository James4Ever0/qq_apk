import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import cooperation.qqfav.ipc.IQfavRemoteProxyInterface.Stub;
import cooperation.qqfav.ipc.QfavRemoteProxyForQQ;

public class flb
  implements ServiceConnection
{
  public flb(QfavRemoteProxyForQQ paramQfavRemoteProxyForQQ) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.a.jdField_a_of_type_CooperationQqfavIpcIQfavRemoteProxyInterface = IQfavRemoteProxyInterface.Stub.a(paramIBinder);
    if (this.a.jdField_a_of_type_CooperationQqfavIpcIQfavRemoteProxyInterface != null)
    {
      paramComponentName = new flc(this);
      paramComponentName.setName("QfavRemoteProxyForQQ.remoteProxyCallThread");
      paramComponentName.start();
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.a.jdField_a_of_type_CooperationQqfavIpcIQfavRemoteProxyInterface = null;
    this.a.jdField_a_of_type_Boolean = false;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     flb
 * JD-Core Version:    0.7.0.1
 */
import android.view.View;
import com.tencent.device.file.DeviceAVFileMsgObserver;
import com.tencent.device.file.DeviceAVFileMsgObserver.DevMsgViewCallback;
import java.lang.ref.WeakReference;

public class pvv
{
  WeakReference jdField_a_of_type_JavaLangRefWeakReference;
  public WeakReference b;
  
  public pvv(DeviceAVFileMsgObserver paramDeviceAVFileMsgObserver, View paramView, DeviceAVFileMsgObserver.DevMsgViewCallback paramDevMsgViewCallback)
  {
    this.jdField_a_of_type_JavaLangRefWeakReference = new WeakReference(paramView);
    this.b = new WeakReference(paramDevMsgViewCallback);
  }
  
  public View a()
  {
    return (View)this.jdField_a_of_type_JavaLangRefWeakReference.get();
  }
  
  public DeviceAVFileMsgObserver.DevMsgViewCallback a()
  {
    return (DeviceAVFileMsgObserver.DevMsgViewCallback)this.b.get();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     pvv
 * JD-Core Version:    0.7.0.1
 */
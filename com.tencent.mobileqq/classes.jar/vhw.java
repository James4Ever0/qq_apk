import android.app.Dialog;
import com.tencent.mobileqq.activity.aio.item.StructingMsgItemBuilder;

public class vhw
  implements Runnable
{
  public vhw(StructingMsgItemBuilder paramStructingMsgItemBuilder, Dialog paramDialog) {}
  
  public void run()
  {
    if (this.jdField_a_of_type_AndroidAppDialog.isShowing()) {
      this.jdField_a_of_type_AndroidAppDialog.dismiss();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     vhw
 * JD-Core Version:    0.7.0.1
 */
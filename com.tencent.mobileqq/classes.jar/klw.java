import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.biz.PoiMapActivity;

public class klw
  implements View.OnClickListener
{
  public klw(PoiMapActivity paramPoiMapActivity, Dialog paramDialog) {}
  
  public void onClick(View paramView)
  {
    this.jdField_a_of_type_AndroidAppDialog.cancel();
    String str = this.jdField_a_of_type_ComTencentBizPoiMapActivity.a.getText().toString();
    paramView = str;
    if (str == null) {
      paramView = "";
    }
    this.jdField_a_of_type_ComTencentBizPoiMapActivity.a("share_locate", "click_sch_cancel", paramView, "", "", "");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     klw
 * JD-Core Version:    0.7.0.1
 */
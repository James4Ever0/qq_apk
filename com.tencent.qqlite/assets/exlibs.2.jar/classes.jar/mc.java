import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.tencent.biz.eqq.EnterpriseDetailActivity;

public class mc
  implements DialogInterface.OnClickListener
{
  public mc(EnterpriseDetailActivity paramEnterpriseDetailActivity, String paramString) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == 0) {}
    while (paramInt != 1) {
      return;
    }
    paramDialogInterface = new Intent("android.intent.action.CALL", Uri.parse("tel:" + this.jdField_a_of_type_JavaLangString));
    this.jdField_a_of_type_ComTencentBizEqqEnterpriseDetailActivity.startActivity(paramDialogInterface);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.2.jar\classes.jar
 * Qualified Name:     mc
 * JD-Core Version:    0.7.0.1
 */
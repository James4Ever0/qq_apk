import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.ark.API.ArkAppModuleReg.ModuleQQ;
import com.tencent.mobileqq.ark.ArkAppCenter;
import com.tencent.mobileqq.utils.QQCustomDialog;

class aavc
  implements Runnable
{
  aavc(aauq paramaauq, String paramString1, String paramString2, long paramLong, String paramString3) {}
  
  public void run()
  {
    QQCustomDialog localQQCustomDialog = new QQCustomDialog(BaseActivity.sTopActivity, 2131624516);
    localQQCustomDialog.setContentView(2130968847);
    localQQCustomDialog.setTitle(BaseActivity.sTopActivity.getString(2131438264, new Object[] { this.jdField_a_of_type_JavaLangString }));
    ((ImageView)localQQCustomDialog.findViewById(2131364066)).setImageDrawable(BaseActivity.sTopActivity.getResources().getDrawable(2130838205));
    ((TextView)localQQCustomDialog.findViewById(2131364067)).setText(this.jdField_a_of_type_JavaLangString);
    ((TextView)localQQCustomDialog.findViewById(2131362781)).setText(BaseActivity.sTopActivity.getString(2131438850));
    localQQCustomDialog.setCanceledOnTouchOutside(false);
    ArkAppCenter.a(this.b, new aavd(this, localQQCustomDialog));
    localQQCustomDialog.setNegativeButton(2131434690, new aave(this, localQQCustomDialog));
    localQQCustomDialog.setPositiveButton(2131434688, new aavg(this, localQQCustomDialog));
    try
    {
      localQQCustomDialog.show();
      label159:
      if (ArkAppModuleReg.ModuleQQ.a(this.jdField_a_of_type_JavaLangString, "ark_authority_api_location", this.c) == 0) {
        ArkAppModuleReg.ModuleQQ.a(this.jdField_a_of_type_JavaLangString, "ark_authority_api_location", this.c, 2);
      }
      return;
    }
    catch (Exception localException)
    {
      break label159;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aavc
 * JD-Core Version:    0.7.0.1
 */
import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.filemanager.activity.MPFileVerifyPwdView;
import com.tencent.mobileqq.filemanager.util.FMToastUtil;
import com.tencent.qphone.base.util.BaseApplication;

public class acnr
  implements TextWatcher
{
  public acnr(MPFileVerifyPwdView paramMPFileVerifyPwdView) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    paramEditable = MPFileVerifyPwdView.a(this.a).getText().toString();
    if ((!TextUtils.isEmpty(paramEditable)) && (paramEditable.length() >= 16)) {
      FMToastUtil.a(BaseApplicationImpl.getContext().getString(2131427655));
    }
    while (TextUtils.isEmpty(paramEditable)) {
      return;
    }
    MPFileVerifyPwdView.b(this.a).setEnabled(true);
    MPFileVerifyPwdView.b(this.a).setTextColor(Color.parseColor("#00a5e0"));
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     acnr
 * JD-Core Version:    0.7.0.1
 */
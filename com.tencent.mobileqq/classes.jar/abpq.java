import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mobileqq.util.DisplayUtil;
import com.tencent.mobileqq.utils.DialogUtil;
import com.tencent.mobileqq.utils.QQCustomDialog;

public final class abpq
  implements Runnable
{
  public abpq(Activity paramActivity, String paramString) {}
  
  public void run()
  {
    Object localObject = new abpr(this);
    localObject = DialogUtil.b(this.jdField_a_of_type_AndroidAppActivity, 230, null, this.jdField_a_of_type_JavaLangString, 0, 2131435179, (DialogInterface.OnClickListener)localObject, null);
    if (localObject != null)
    {
      ((TextView)((QQCustomDialog)localObject).findViewById(2131364027)).setVisibility(8);
      TextView localTextView = (TextView)((QQCustomDialog)localObject).findViewById(2131362758);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
      localLayoutParams.gravity = 17;
      localTextView.setLayoutParams(localLayoutParams);
      localTextView.setMinHeight(DisplayUtil.a(this.jdField_a_of_type_AndroidAppActivity, 35.0F));
      localTextView.setGravity(17);
      ((QQCustomDialog)localObject).show();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     abpq
 * JD-Core Version:    0.7.0.1
 */
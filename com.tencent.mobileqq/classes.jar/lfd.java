import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tencent.biz.pubaccount.readinjoy.activity.ReadInJoySettingActivity;

public class lfd
  implements CompoundButton.OnCheckedChangeListener
{
  public lfd(ReadInJoySettingActivity paramReadInJoySettingActivity) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    ReadInJoySettingActivity.b(this.a, paramBoolean);
    ReadInJoySettingActivity.a(this.a, ReadInJoySettingActivity.b(this.a));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     lfd
 * JD-Core Version:    0.7.0.1
 */
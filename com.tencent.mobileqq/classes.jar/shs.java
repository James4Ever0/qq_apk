import android.content.Intent;
import android.os.Message;
import android.widget.TextView;
import com.tencent.common.config.AppSetting;
import com.tencent.mobileqq.activity.DiscussionInfoCardActivity;
import com.tencent.mobileqq.troop.widget.FollowImageTextView;
import com.tencent.mobileqq.widget.MyGridView;
import com.tencent.mobileqq.widget.QQProgressDialog;
import java.util.ArrayList;
import mqq.os.MqqHandler;

public class shs
  extends MqqHandler
{
  public shs(DiscussionInfoCardActivity paramDiscussionInfoCardActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    label412:
    do
    {
      do
      {
        do
        {
          return;
          if ((DiscussionInfoCardActivity.a(this.a) != null) && (DiscussionInfoCardActivity.a(this.a).isShowing())) {
            DiscussionInfoCardActivity.a(this.a).dismiss();
          }
          paramMessage = new Intent();
          paramMessage.putExtra("isNeedFinish", true);
          this.a.setResult(-1, paramMessage);
          this.a.finish();
          return;
        } while ((DiscussionInfoCardActivity.a(this.a) == null) || (!DiscussionInfoCardActivity.a(this.a).isShowing()) || (this.a.isFinishing()));
        DiscussionInfoCardActivity.a(this.a).dismiss();
        return;
        if (DiscussionInfoCardActivity.a(this.a) == 3000)
        {
          if (this.a.jdField_a_of_type_ComTencentMobileqqDataDiscussionInfo != null) {
            DiscussionInfoCardActivity.a(this.a, DiscussionInfoCardActivity.b(this.a));
          }
        }
        else
        {
          paramMessage = (ArrayList)paramMessage.obj;
          int i = paramMessage.size();
          DiscussionInfoCardActivity.a(this.a).setText("共" + i + "人");
          DiscussionInfoCardActivity.a(this.a).setPadding(DiscussionInfoCardActivity.b(this.a), DiscussionInfoCardActivity.c(this.a), DiscussionInfoCardActivity.d(this.a), DiscussionInfoCardActivity.e(this.a));
          DiscussionInfoCardActivity.a(this.a, paramMessage);
          if (DiscussionInfoCardActivity.a(this.a) != null) {
            break label412;
          }
          DiscussionInfoCardActivity.a(this.a, new shu(this.a));
          DiscussionInfoCardActivity.a(this.a).setAdapter(DiscussionInfoCardActivity.a(this.a));
        }
        for (;;)
        {
          removeMessages(0);
          return;
          this.a.jdField_a_of_type_ComTencentMobileqqTroopWidgetFollowImageTextView.setText(this.a.getString(2131435935));
          if (!AppSetting.b) {
            break;
          }
          this.a.jdField_a_of_type_ComTencentMobileqqTroopWidgetFollowImageTextView.setContentDescription("群聊名称 " + this.a.getString(2131435935) + "， 编辑资料 按钮");
          break;
          DiscussionInfoCardActivity.a(this.a).notifyDataSetChanged();
        }
      } while (DiscussionInfoCardActivity.a(this.a) != 0);
      paramMessage = (String)paramMessage.obj;
    } while ((DiscussionInfoCardActivity.a(this.a) == null) || (paramMessage == null) || (!DiscussionInfoCardActivity.a(this.a).equals(paramMessage)));
    this.a.finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     shs
 * JD-Core Version:    0.7.0.1
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.QQBrowserActivity;
import com.tencent.mobileqq.activity.aio.SessionInfo;
import com.tencent.mobileqq.activity.aio.item.ReplyTextItemBuilder;
import com.tencent.mobileqq.statistics.ReportController;

public class vbk
  implements View.OnClickListener
{
  public vbk(ReplyTextItemBuilder paramReplyTextItemBuilder) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    paramView = (String)paramView.getTag();
    if (!TextUtils.isEmpty(paramView))
    {
      Intent localIntent = new Intent(this.a.jdField_a_of_type_AndroidContentContext, QQBrowserActivity.class);
      localIntent.putExtra("hide_more_button", true);
      localIntent.putExtra("hide_operation_bar", true);
      localIntent.putExtra("url", paramView);
      this.a.jdField_a_of_type_AndroidContentContext.startActivity(localIntent);
      ((Activity)this.a.jdField_a_of_type_AndroidContentContext).overridePendingTransition(2131034134, 0);
    }
    ReportController.b(this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "dc00899", "Grp_talk", "", "obj", "link_msg", 0, 0, this.a.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.a, "", "", "");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     vbk
 * JD-Core Version:    0.7.0.1
 */
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.tencent.mobileqq.app.MessageHandler;
import com.tencent.mobileqq.app.MessageObserver;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.newfriend.TroopSystemMessage;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt64Field;
import com.tencent.mobileqq.systemmsg.MessageForSystemMsg;
import com.tencent.mobileqq.widget.QQToast;
import tencent.mobileim.structmsg.structmsg.StructMsg;
import tencent.mobileim.structmsg.structmsg.SystemMsg;

public class dzc
  extends MessageObserver
{
  public dzc(TroopSystemMessage paramTroopSystemMessage) {}
  
  protected void a(String paramString)
  {
    TroopSystemMessage.a(this.a).c(this.a.jdField_a_of_type_ComTencentMobileqqAppMessageObserver);
    paramString = this.a.jdField_a_of_type_AndroidContentContext.getResources().getString(2131362896);
    int i = this.a.jdField_a_of_type_AndroidContentContext.getResources().getDimensionPixelSize(2131492887);
    QQToast.a(this.a.jdField_a_of_type_AndroidContentContext, 1, paramString, 0).b(i);
  }
  
  protected void a(boolean paramBoolean, String paramString1, int paramInt1, String paramString2, int paramInt2, int paramInt3, String paramString3, String paramString4, int paramInt4)
  {
    TroopSystemMessage.a(this.a).c(this.a.jdField_a_of_type_ComTencentMobileqqAppMessageObserver);
    if (TroopSystemMessage.a(this.a) == null) {
      return;
    }
    if (!paramBoolean)
    {
      paramInt1 = this.a.jdField_a_of_type_AndroidContentContext.getResources().getDimensionPixelSize(2131492887);
      paramString1 = this.a.jdField_a_of_type_AndroidContentContext.getResources().getString(2131363388);
      if (TextUtils.isEmpty(paramString3)) {
        break label192;
      }
    }
    for (;;)
    {
      QQToast.a(this.a.jdField_a_of_type_AndroidContentContext, 1, paramString3, 0).b(paramInt1);
      return;
      if ((!paramBoolean) || (!this.a.b)) {
        break;
      }
      paramString1 = "" + TroopSystemMessage.a(this.a).structMsg.msg.group_code.get();
      paramString2 = TroopSystemMessage.a(this.a).structMsg.msg.group_name.get();
      TroopSystemMessage.a(this.a).a().c(paramString1, paramString2);
      TroopSystemMessage.a(this.a, paramString1, paramString2);
      return;
      label192:
      paramString3 = paramString1;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     dzc
 * JD-Core Version:    0.7.0.1
 */
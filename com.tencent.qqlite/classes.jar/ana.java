import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.dataline.activities.LiteActivity;
import com.tencent.biz.thridappshare.ThridAppShareHelper;
import com.tencent.mobileqq.activity.ChatActivity;
import com.tencent.mobileqq.activity.ForwardOperations;
import com.tencent.mobileqq.app.AppConstants;
import com.tencent.mobileqq.app.PublicAccountHandler;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.structmsg.StructMsgFactory;
import com.tencent.mobileqq.utils.ForwardSendPicUtil;
import com.tencent.mobileqq.utils.QQCustomDialog;
import com.tencent.mobileqq.utils.ShareMsgHelper;

public class ana
  implements DialogInterface.OnClickListener
{
  public ana(ForwardOperations paramForwardOperations, String paramString1, String paramString2, int paramInt, String paramString3) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    boolean bool2 = true;
    boolean bool1 = true;
    paramDialogInterface = this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_AndroidContentIntent.getAction();
    this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.G = this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.getInputValue();
    if (this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.v == 11) {
      ForwardOperations.a(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations, this.jdField_a_of_type_JavaLangString, this.b, this.jdField_a_of_type_Int, this.c);
    }
    for (;;)
    {
      ThridAppShareHelper.a(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.H, "app_share_send", "", "", "");
      return;
      if ("com.tencent.intent.QQLite_FORWARD".equals(paramDialogInterface))
      {
        if (this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.v == 2)
        {
          ForwardOperations.a(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations, this.jdField_a_of_type_JavaLangString, this.b, this.jdField_a_of_type_Int, this.c);
          return;
        }
        Bundle localBundle;
        if ((this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.v == 1001) || (this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.v == -4))
        {
          paramDialogInterface = new Intent(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_AndroidAppActivity, ChatActivity.class);
          paramDialogInterface.setFlags(67108864);
          localBundle = ForwardOperations.a(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations).getExtras();
          localBundle.putString("uin", this.b);
          localBundle.putInt("uintype", this.jdField_a_of_type_Int);
          localBundle.putString("uinname", this.c);
          localBundle.putString("share_comment_message", "");
          paramDialogInterface.putExtras(localBundle);
          ForwardOperations.a(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations, paramDialogInterface, localBundle);
          if (paramDialogInterface.getBooleanExtra("k_back", false))
          {
            paramDialogInterface = StructMsgFactory.a(paramDialogInterface.getByteArrayExtra("stuctmsg_bytes"));
            ShareMsgHelper.a(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.b, this.jdField_a_of_type_Int, paramDialogInterface, null);
            label291:
            this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_AndroidAppActivity.setResult(-1);
            if (!"public_account".equals(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.D)) {
              break label364;
            }
            PublicAccountHandler.a(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.b, "Pb_account_lifeservice", "mp_msg_sys_11", "pbshare_success");
          }
        }
        label572:
        for (;;)
        {
          this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_AndroidAppActivity.finish();
          break;
          this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_AndroidAppActivity.startActivity(paramDialogInterface);
          break label291;
          label364:
          if ("struct_msg_from_h5".equals(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.D))
          {
            paramDialogInterface = "";
            if (localBundle != null) {
              paramDialogInterface = localBundle.getString("pubUin");
            }
            if (!TextUtils.isEmpty(paramDialogInterface)) {
              PublicAccountHandler.a(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, paramDialogInterface, "Pb_account_lifeservice", "mp_msg_sys_31", "share_succ");
            }
          }
          else if ("Music_gene_aio".equals(ForwardOperations.a(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations).getStringExtra("report")))
          {
            ReportController.b(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "CliOper", "", this.b, "Music_gene", "Music_gene_send", 0, 1, 0, "", "", "", "");
            continue;
            if (AppConstants.T.equals(this.b)) {
              LiteActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.x, this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_AndroidAppActivity);
            }
            for (;;)
            {
              if (!bool1) {
                break label572;
              }
              this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_AndroidAppActivity.setResult(-1);
              break;
              bool1 = ForwardSendPicUtil.a(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.x, this.b, this.jdField_a_of_type_Int, this.jdField_a_of_type_JavaLangString, true, this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_AndroidAppActivity);
            }
          }
        }
      }
      if (this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.b)
      {
        if (this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.v == 1)
        {
          if (AppConstants.T.equals(this.b)) {
            LiteActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.x, this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_AndroidAppActivity);
          }
          for (bool1 = bool2;; bool1 = ForwardSendPicUtil.a(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.x, this.b, this.jdField_a_of_type_Int, this.jdField_a_of_type_JavaLangString, false, this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_AndroidAppActivity))
          {
            if (bool1) {
              this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_AndroidAppActivity.setResult(-1);
            }
            this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_AndroidAppActivity.finish();
            break;
          }
        }
        if (this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.v == 0) {
          if (AppConstants.T.equals(this.b))
          {
            ForwardOperations.a(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations);
          }
          else
          {
            paramDialogInterface = new Intent(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_AndroidAppActivity, ChatActivity.class);
            paramDialogInterface.putExtra("isFromShare", true);
            this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_AndroidAppActivity.startActivity(paramDialogInterface);
            this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations.jdField_a_of_type_AndroidAppActivity.finish();
          }
        }
      }
      else
      {
        ForwardOperations.a(this.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations, this.jdField_a_of_type_JavaLangString, this.b, this.jdField_a_of_type_Int, this.c);
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     ana
 * JD-Core Version:    0.7.0.1
 */
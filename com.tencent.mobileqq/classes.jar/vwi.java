import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.activity.aio.rebuild.BusinessCmrTmpChatPie;
import com.tencent.mobileqq.app.PublicAccountDataManager;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.PublicAccountInfo;

public class vwi
  implements DialogInterface.OnClickListener
{
  public vwi(BusinessCmrTmpChatPie paramBusinessCmrTmpChatPie, PublicAccountInfo paramPublicAccountInfo, PublicAccountDataManager paramPublicAccountDataManager) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.jdField_a_of_type_ComTencentMobileqqDataPublicAccountInfo.mIsAgreeSyncLbs = true;
    this.jdField_a_of_type_ComTencentMobileqqDataPublicAccountInfo.mIsSyncLbsSelected = true;
    this.jdField_a_of_type_ComTencentMobileqqAppPublicAccountDataManager.a(this.jdField_a_of_type_ComTencentMobileqqDataPublicAccountInfo);
    this.jdField_a_of_type_ComTencentMobileqqActivityAioRebuildBusinessCmrTmpChatPie.a(1, null);
    paramDialogInterface = new vwj(this);
    this.jdField_a_of_type_ComTencentMobileqqActivityAioRebuildBusinessCmrTmpChatPie.a.a(paramDialogInterface);
    this.jdField_a_of_type_ComTencentMobileqqActivityAioRebuildBusinessCmrTmpChatPie.bf();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     vwi
 * JD-Core Version:    0.7.0.1
 */
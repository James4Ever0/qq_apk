import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.troop.data.TroopFileInfo;
import com.tencent.mobileqq.troop.data.TroopFileItemOperation;
import com.tencent.mobileqq.troop.utils.TroopFileTransferManager;

class aiqq
  implements DialogInterface.OnClickListener
{
  aiqq(aiqp paramaiqp) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    }
    do
    {
      return;
    } while (TroopFileItemOperation.a(this.a.a.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileItemOperation) == 0);
    TroopFileTransferManager.a(this.a.a.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileItemOperation.a, this.a.a.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileItemOperation.b).b(this.a.a.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileInfo.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     aiqq
 * JD-Core Version:    0.7.0.1
 */
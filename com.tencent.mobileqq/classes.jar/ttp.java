import android.os.Bundle;
import com.tencent.biz.ProtoUtils.TroopProtocolObserver;
import com.tencent.mobileqq.activity.TroopAssistantActivity;
import com.tencent.mobileqq.adapter.TroopMessageSettingSingleAdapter;
import com.tencent.mobileqq.managers.TroopAssistantManager;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;
import java.util.List;
import tencent.im.oidb.cmd0x72d.cmd0x72d.RspBody;

public class ttp
  extends ProtoUtils.TroopProtocolObserver
{
  public ttp(TroopAssistantActivity paramTroopAssistantActivity, TroopAssistantManager paramTroopAssistantManager) {}
  
  public void a(int paramInt, byte[] paramArrayOfByte, Bundle paramBundle)
  {
    if ((paramInt != 0) || (paramArrayOfByte == null)) {}
    try
    {
      this.jdField_a_of_type_ComTencentMobileqqManagersTroopAssistantManager.b(this.jdField_a_of_type_ComTencentMobileqqActivityTroopAssistantActivity.app, 0L);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      return;
    }
    paramBundle = new cmd0x72d.RspBody();
    paramBundle.mergeFrom(paramArrayOfByte);
    paramArrayOfByte = paramBundle.rpt_uint64_groupcode.get();
    if (paramBundle.opt_uint32_ret_code.get() == 0)
    {
      this.jdField_a_of_type_ComTencentMobileqqManagersTroopAssistantManager.b(this.jdField_a_of_type_ComTencentMobileqqActivityTroopAssistantActivity.app, paramBundle.opt_uint64_timestamp.get());
      if ((paramArrayOfByte.size() > 0) && (this.jdField_a_of_type_ComTencentMobileqqActivityTroopAssistantActivity.jdField_a_of_type_ComTencentMobileqqAdapterTroopMessageSettingSingleAdapter != null))
      {
        this.jdField_a_of_type_ComTencentMobileqqActivityTroopAssistantActivity.jdField_a_of_type_JavaUtilList = paramArrayOfByte;
        this.jdField_a_of_type_ComTencentMobileqqActivityTroopAssistantActivity.jdField_a_of_type_ComTencentMobileqqAdapterTroopMessageSettingSingleAdapter.a(paramArrayOfByte);
        return;
      }
      TroopAssistantActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityTroopAssistantActivity);
      return;
    }
    this.jdField_a_of_type_ComTencentMobileqqManagersTroopAssistantManager.b(this.jdField_a_of_type_ComTencentMobileqqActivityTroopAssistantActivity.app, 0L);
    TroopAssistantActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityTroopAssistantActivity);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     ttp
 * JD-Core Version:    0.7.0.1
 */
import android.widget.TextView;
import com.tencent.mobileqq.activity.TroopGagActivity;
import com.tencent.mobileqq.activity.TroopGagActivity.GagMemInfo;
import com.tencent.mobileqq.app.BizTroopObserver;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.TroopManager.MemberGagInfo;
import com.tencent.mobileqq.troop.utils.TroopGagMgr;
import com.tencent.mobileqq.troop.utils.TroopGagMgr.GagStatus;
import com.tencent.mobileqq.troop.utils.TroopGagMgr.GagTroopMemberResult;
import com.tencent.mobileqq.troop.utils.TroopGagMgr.GagTroopResult;
import com.tencent.mobileqq.troop.utils.TroopGagMgr.TroopGagInfo;
import com.tencent.widget.Switch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bmo
  extends BizTroopObserver
{
  public bmo(TroopGagActivity paramTroopGagActivity) {}
  
  protected void a(TroopGagMgr.GagStatus paramGagStatus)
  {
    if ((paramGagStatus == null) || (!paramGagStatus.jdField_a_of_type_JavaLangString.equals(this.a.jdField_a_of_type_JavaLangString))) {
      return;
    }
    TroopManager.MemberGagInfo localMemberGagInfo;
    TroopGagActivity.GagMemInfo localGagMemInfo;
    if (paramGagStatus.jdField_a_of_type_Int == 3)
    {
      this.a.jdField_a_of_type_JavaUtilList.clear();
      if (paramGagStatus.jdField_a_of_type_JavaUtilArrayList != null)
      {
        paramGagStatus = paramGagStatus.jdField_a_of_type_JavaUtilArrayList.iterator();
        while (paramGagStatus.hasNext())
        {
          localMemberGagInfo = (TroopManager.MemberGagInfo)paramGagStatus.next();
          localGagMemInfo = new TroopGagActivity.GagMemInfo();
          localGagMemInfo.jdField_a_of_type_JavaLangString = localMemberGagInfo.jdField_a_of_type_JavaLangString;
          localGagMemInfo.jdField_a_of_type_Long = localMemberGagInfo.jdField_a_of_type_Long;
          this.a.jdField_a_of_type_JavaUtilList.add(localGagMemInfo);
        }
      }
      this.a.jdField_a_of_type_Bmq.notifyDataSetChanged();
    }
    while (this.a.jdField_a_of_type_JavaUtilList.size() == 0)
    {
      this.a.jdField_a_of_type_AndroidWidgetTextView.setVisibility(0);
      return;
      if (paramGagStatus.jdField_a_of_type_Int == 1)
      {
        paramGagStatus = paramGagStatus.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopGagMgr$TroopGagInfo;
        this.a.jdField_a_of_type_ComTencentWidgetSwitch.setOnCheckedChangeListener(null);
        if (paramGagStatus.jdField_a_of_type_Long != 0L) {
          this.a.jdField_a_of_type_ComTencentWidgetSwitch.setChecked(true);
        }
        for (;;)
        {
          this.a.jdField_a_of_type_ComTencentWidgetSwitch.setOnCheckedChangeListener(this.a);
          break;
          this.a.jdField_a_of_type_ComTencentWidgetSwitch.setChecked(false);
        }
      }
      if (paramGagStatus.jdField_a_of_type_Int == 5)
      {
        if (!paramGagStatus.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopGagMgr$GagTroopMemberResult.jdField_a_of_type_Boolean)
        {
          paramGagStatus = ((TroopGagMgr)this.a.app.getManager(42)).a(this.a.jdField_a_of_type_JavaLangString, false);
          if ((paramGagStatus != null) && (!paramGagStatus.isEmpty()))
          {
            paramGagStatus = paramGagStatus.iterator();
            while (paramGagStatus.hasNext())
            {
              localMemberGagInfo = (TroopManager.MemberGagInfo)paramGagStatus.next();
              localGagMemInfo = new TroopGagActivity.GagMemInfo();
              localGagMemInfo.jdField_a_of_type_JavaLangString = localMemberGagInfo.jdField_a_of_type_JavaLangString;
              localGagMemInfo.jdField_a_of_type_Long = localMemberGagInfo.jdField_a_of_type_Long;
              this.a.jdField_a_of_type_JavaUtilList.add(localGagMemInfo);
            }
            this.a.jdField_a_of_type_Bmq.notifyDataSetChanged();
          }
        }
      }
      else if (paramGagStatus.jdField_a_of_type_Int == 4)
      {
        paramGagStatus = paramGagStatus.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopGagMgr$GagTroopResult;
        if (!paramGagStatus.jdField_a_of_type_Boolean)
        {
          this.a.jdField_a_of_type_ComTencentWidgetSwitch.setOnCheckedChangeListener(null);
          if (paramGagStatus.jdField_a_of_type_Long != 0L) {
            this.a.jdField_a_of_type_ComTencentWidgetSwitch.setChecked(false);
          }
          for (;;)
          {
            this.a.jdField_a_of_type_ComTencentWidgetSwitch.setOnCheckedChangeListener(this.a);
            break;
            this.a.jdField_a_of_type_ComTencentWidgetSwitch.setChecked(true);
          }
        }
      }
    }
    this.a.jdField_a_of_type_AndroidWidgetTextView.setVisibility(8);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     bmo
 * JD-Core Version:    0.7.0.1
 */
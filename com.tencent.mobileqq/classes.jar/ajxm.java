import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.app.TroopObserver;
import com.tencent.mobileqq.troop.activity.TroopCreateLogicActivity;
import com.tencent.mobileqq.troop.utils.AvatarTroopUtil;
import com.tencent.mobileqq.troopinfo.TroopInfoData;
import com.tencent.mobileqq.troopshare.TroopShareResp;
import com.tencent.mobileqq.troopshare.TroopShareUtility;
import com.tencent.mobileqq.troopshare.TroopShareUtility.OnShareListener;
import com.tencent.mobileqq.widget.QQProgressDialog;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.QLog;

public class ajxm
  extends TroopObserver
{
  public ajxm(TroopShareUtility paramTroopShareUtility) {}
  
  public void a(boolean paramBoolean, TroopShareResp paramTroopShareResp)
  {
    if (QLog.isColorLevel()) {
      QLog.d("TroopShareUtility", 2, "onTroopShareLink start");
    }
    if ((this.a.jdField_a_of_type_ComTencentMobileqqTroopinfoTroopInfoData == null) || (this.a.jdField_a_of_type_ComTencentMobileqqTroopinfoTroopInfoData.troopUin == null) || (paramTroopShareResp == null) || (!this.a.jdField_a_of_type_ComTencentMobileqqTroopinfoTroopInfoData.troopUin.equals(paramTroopShareResp.jdField_a_of_type_JavaLangString))) {
      if ((this.a.jdField_a_of_type_ComTencentMobileqqAppBaseActivity instanceof TroopCreateLogicActivity)) {
        ((TroopCreateLogicActivity)this.a.jdField_a_of_type_ComTencentMobileqqAppBaseActivity).finish();
      }
    }
    label423:
    label604:
    for (;;)
    {
      return;
      if ((this.a.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog != null) && (this.a.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.isShowing()) && (this.a.jdField_a_of_type_Int != -1) && (this.a.jdField_b_of_type_Int != -1))
      {
        if ((!paramBoolean) || (paramTroopShareResp.jdField_a_of_type_Int != 0)) {
          break label423;
        }
        if (paramTroopShareResp.jdField_a_of_type_Boolean)
        {
          this.a.jdField_a_of_type_JavaLangString = paramTroopShareResp.jdField_b_of_type_JavaLangString;
          if (this.a.jdField_b_of_type_Int != 0)
          {
            if (!(this.a.jdField_a_of_type_ComTencentMobileqqAppBaseActivity instanceof TroopCreateLogicActivity)) {
              continue;
            }
            ((TroopCreateLogicActivity)this.a.jdField_a_of_type_ComTencentMobileqqAppBaseActivity).finish();
          }
        }
        else
        {
          this.a.jdField_b_of_type_JavaLangString = paramTroopShareResp.jdField_b_of_type_JavaLangString;
          if (this.a.jdField_b_of_type_Int != 1)
          {
            if (!(this.a.jdField_a_of_type_ComTencentMobileqqAppBaseActivity instanceof TroopCreateLogicActivity)) {
              continue;
            }
            ((TroopCreateLogicActivity)this.a.jdField_a_of_type_ComTencentMobileqqAppBaseActivity).finish();
            return;
          }
        }
        switch (this.a.jdField_a_of_type_Int)
        {
        }
      }
      for (;;)
      {
        if (!(this.a.jdField_a_of_type_ComTencentMobileqqAppBaseActivity instanceof TroopCreateLogicActivity)) {
          break label604;
        }
        ((TroopCreateLogicActivity)this.a.jdField_a_of_type_ComTencentMobileqqAppBaseActivity).finish();
        return;
        this.a.b();
        TroopShareUtility.b(this.a);
        continue;
        this.a.b();
        TroopShareUtility.c(this.a);
        continue;
        this.a.c = AvatarTroopUtil.a("", this.a.jdField_a_of_type_ComTencentMobileqqTroopinfoTroopInfoData.troopUin, 0);
        this.a.b();
        TroopShareUtility.d(this.a);
        continue;
        this.a.b();
        TroopShareUtility.e(this.a);
        continue;
        this.a.b();
        TroopShareUtility.f(this.a);
        continue;
        if ((paramTroopShareResp.jdField_a_of_type_Boolean) && (this.a.jdField_b_of_type_Int != 0))
        {
          if (!(this.a.jdField_a_of_type_ComTencentMobileqqAppBaseActivity instanceof TroopCreateLogicActivity)) {
            break;
          }
          ((TroopCreateLogicActivity)this.a.jdField_a_of_type_ComTencentMobileqqAppBaseActivity).finish();
          return;
        }
        if ((!paramTroopShareResp.jdField_a_of_type_Boolean) && (this.a.jdField_b_of_type_Int != 1))
        {
          if (!(this.a.jdField_a_of_type_ComTencentMobileqqAppBaseActivity instanceof TroopCreateLogicActivity)) {
            break;
          }
          ((TroopCreateLogicActivity)this.a.jdField_a_of_type_ComTencentMobileqqAppBaseActivity).finish();
          return;
        }
        if (this.a.jdField_a_of_type_ComTencentMobileqqTroopshareTroopShareUtility$OnShareListener != null) {
          this.a.jdField_a_of_type_ComTencentMobileqqTroopshareTroopShareUtility$OnShareListener.a(this.a.jdField_a_of_type_Int, false);
        }
        this.a.b();
        QQToast.a(this.a.jdField_a_of_type_ComTencentMobileqqAppBaseActivity, 1, this.a.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getString(2131435327), 0).b(this.a.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getTitleBarHeight());
        this.a.jdField_a_of_type_Int = -1;
        this.a.jdField_b_of_type_Int = -1;
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     ajxm
 * JD-Core Version:    0.7.0.1
 */
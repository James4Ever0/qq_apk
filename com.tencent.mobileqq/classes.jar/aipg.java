import android.os.Handler;
import android.os.Looper;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.troop.data.TroopCreateLogic;
import com.tencent.mobileqq.troop.data.TroopCreateLogic.TroopCreateCallback;
import com.tencent.mobileqq.troop.logic.TroopSearchLogic.TroopSearchCallback;
import com.tencent.mobileqq.troop.utils.TroopNameHelper;
import java.util.ArrayList;
import java.util.Iterator;
import mqq.os.MqqHandler;

public class aipg
  implements TroopSearchLogic.TroopSearchCallback
{
  public aipg(TroopCreateLogic paramTroopCreateLogic, ArrayList paramArrayList1, BaseActivity paramBaseActivity, TroopCreateLogic.TroopCreateCallback paramTroopCreateCallback, ArrayList paramArrayList2) {}
  
  public void a(ArrayList paramArrayList)
  {
    this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopCreateLogic.jdField_a_of_type_JavaUtilArrayList = paramArrayList;
    if (paramArrayList.size() > 0)
    {
      paramArrayList = new ArrayList();
      Iterator localIterator = this.jdField_a_of_type_JavaUtilArrayList.iterator();
      while (localIterator.hasNext()) {
        paramArrayList.add(((aipo)localIterator.next()).a);
      }
      this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopCreateLogic.jdField_a_of_type_ComTencentMobileqqTroopDataTroopCreateLogic$TroopCreateInfo.c = TroopNameHelper.a(paramArrayList);
      new Handler(Looper.getMainLooper()).post(new aiph(this));
      return;
    }
    this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopCreateLogic.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getHandler(TroopCreateLogic.class).post(new aipi(this));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     aipg
 * JD-Core Version:    0.7.0.1
 */
import android.os.Bundle;
import com.tencent.mobileqq.troop.activity.RecommendTroopAdapter;
import com.tencent.qphone.base.util.QLog;
import mqq.observer.BusinessObserver;

public class aigt
  implements BusinessObserver
{
  public aigt(RecommendTroopAdapter paramRecommendTroopAdapter) {}
  
  public void onReceive(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    if (QLog.isDevelopLevel()) {
      QLog.d("RecommendTroopAdapter", 4, "delRecommendTroop");
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     aigt
 * JD-Core Version:    0.7.0.1
 */
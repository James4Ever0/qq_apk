import com.tencent.mobileqq.nearby.profilecard.moment.NearbyMomentManager;
import com.tencent.mobileqq.nearby.profilecard.moment.NearbyMomentManager.MomentDataChangeObserver;
import java.util.Iterator;
import java.util.List;

public class afpi
  implements Runnable
{
  public afpi(NearbyMomentManager paramNearbyMomentManager, String paramString) {}
  
  public void run()
  {
    Iterator localIterator = NearbyMomentManager.a(this.jdField_a_of_type_ComTencentMobileqqNearbyProfilecardMomentNearbyMomentManager).iterator();
    while (localIterator.hasNext()) {
      ((NearbyMomentManager.MomentDataChangeObserver)localIterator.next()).d(this.jdField_a_of_type_JavaLangString);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     afpi
 * JD-Core Version:    0.7.0.1
 */
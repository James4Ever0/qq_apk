import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.app.UniteSearchHandler;
import com.tencent.mobileqq.search.fragment.HotWordsForSubBussFragment;
import mqq.os.MqqHandler;

public class ahtg
  implements Runnable
{
  public ahtg(HotWordsForSubBussFragment paramHotWordsForSubBussFragment, boolean paramBoolean) {}
  
  public void run()
  {
    byte[] arrayOfByte = this.jdField_a_of_type_ComTencentMobileqqSearchFragmentHotWordsForSubBussFragment.a.a(UniteSearchHandler.a);
    ThreadManager.getUIHandler().post(new ahth(this, arrayOfByte));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     ahtg
 * JD-Core Version:    0.7.0.1
 */
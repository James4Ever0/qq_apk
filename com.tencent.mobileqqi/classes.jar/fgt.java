import com.tencent.mobileqq.app.Frame;
import com.tencent.mobileqq.app.FrameActivity;
import java.util.Collection;
import java.util.Iterator;

public class fgt
  implements Runnable
{
  public fgt(FrameActivity paramFrameActivity, Collection paramCollection) {}
  
  public void run()
  {
    Iterator localIterator = this.jdField_a_of_type_JavaUtilCollection.iterator();
    while (localIterator.hasNext()) {
      ((Frame)localIterator.next()).b();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     fgt
 * JD-Core Version:    0.7.0.1
 */
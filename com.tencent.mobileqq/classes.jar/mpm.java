import com.tencent.biz.pubaccount.readinjoy.view.imageloader.IBitmapCallback;
import com.tencent.biz.pubaccount.readinjoy.view.imageloader.ImageRequest;
import com.tencent.biz.pubaccount.readinjoy.view.imageloader.RunningJob;
import java.lang.ref.WeakReference;

public class mpm
  implements Runnable
{
  public mpm(RunningJob paramRunningJob, WeakReference paramWeakReference, Throwable paramThrowable) {}
  
  public void run()
  {
    if (this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewImageloaderRunningJob.a.a) {}
    while (this.jdField_a_of_type_JavaLangRefWeakReference.get() == null) {
      return;
    }
    ((IBitmapCallback)this.jdField_a_of_type_JavaLangRefWeakReference.get()).a(this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewImageloaderRunningJob.a, this.jdField_a_of_type_JavaLangThrowable);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     mpm
 * JD-Core Version:    0.7.0.1
 */
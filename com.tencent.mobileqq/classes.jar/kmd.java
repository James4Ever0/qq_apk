import com.tencent.biz.common.offline.BidDownloader;
import com.tencent.biz.common.offline.OfflineEnvHelper;
import com.tencent.biz.common.offline.OfflineExpire;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.transfile.predownload.PreDownloadController;
import com.tencent.qphone.base.util.QLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class kmd
  implements Runnable
{
  public kmd(WeakReference paramWeakReference, ArrayList paramArrayList) {}
  
  public void run()
  {
    Object localObject = (QQAppInterface)this.jdField_a_of_type_JavaLangRefWeakReference.get();
    if (localObject == null)
    {
      QLog.i(OfflineExpire.a, 1, "app == null, download wont start");
      return;
    }
    localObject = (PreDownloadController)((QQAppInterface)localObject).getManager(192);
    int k = this.jdField_a_of_type_JavaUtilArrayList.size();
    int i = 0;
    label50:
    kmf localkmf;
    String str1;
    String str2;
    String str3;
    if (i < k)
    {
      localkmf = (kmf)this.jdField_a_of_type_JavaUtilArrayList.get(i);
      str1 = localkmf.a.a;
      str2 = localkmf.a.c;
      str3 = localkmf.a.b;
      if (!localkmf.a.f) {
        break label197;
      }
    }
    label197:
    for (int j = 1;; j = 2)
    {
      boolean bool = ((PreDownloadController)localObject).a(10066, "app", str1, k - i, str2, str3, j, 0, OfflineEnvHelper.a(localkmf.a.a), localkmf);
      QLog.i(OfflineExpire.a, 1, "requestPreDownload bid=" + localkmf.a.a + " re=" + bool);
      i += 1;
      break label50;
      break;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     kmd
 * JD-Core Version:    0.7.0.1
 */
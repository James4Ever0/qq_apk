import android.app.Activity;
import com.tencent.biz.pubaccount.util.GalleryShareHelper;
import com.tencent.mobileqq.transfile.AbsDownloader;
import com.tencent.mobileqq.vip.DownloadListener;
import com.tencent.mobileqq.vip.DownloadTask;
import com.tencent.qphone.base.util.QLog;
import java.io.File;

public class mte
  extends DownloadListener
{
  public mte(GalleryShareHelper paramGalleryShareHelper, Activity paramActivity, String paramString) {}
  
  public void onDone(DownloadTask paramDownloadTask)
  {
    if ((this.jdField_a_of_type_AndroidAppActivity == null) || (this.jdField_a_of_type_AndroidAppActivity.isFinishing())) {
      return;
    }
    if (paramDownloadTask.a == 0)
    {
      paramDownloadTask = new File(AbsDownloader.d(this.jdField_a_of_type_JavaLangString));
      if (paramDownloadTask.exists())
      {
        if (QLog.isColorLevel()) {
          QLog.d("GalleryShareHelper", 2, "shareImageToAIO->downloadFile success: " + this.jdField_a_of_type_JavaLangString);
        }
        this.jdField_a_of_type_AndroidAppActivity.runOnUiThread(new mtf(this, paramDownloadTask));
        return;
      }
    }
    if (QLog.isColorLevel()) {
      QLog.d("GalleryShareHelper", 2, "shareImageToAIO->downloadFile failed: " + this.jdField_a_of_type_JavaLangString);
    }
    this.jdField_a_of_type_AndroidAppActivity.runOnUiThread(new mtg(this));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     mte
 * JD-Core Version:    0.7.0.1
 */
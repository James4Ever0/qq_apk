import android.os.Bundle;
import com.tencent.mobileqq.activity.qwallet.preload.PreloadManager;
import com.tencent.mobileqq.activity.qwallet.preload.PreloadManager.DownloadCallback;
import com.tencent.mobileqq.activity.qwallet.preload.PreloadModule;
import com.tencent.mobileqq.activity.qwallet.preload.PreloadResource;
import com.tencent.mobileqq.activity.qwallet.preload.ResourceInfo;
import com.tencent.mobileqq.vip.DownloadListener;
import com.tencent.mobileqq.vip.DownloadTask;
import com.tencent.qphone.base.util.QLog;
import java.io.File;
import java.util.Map;

public class xco
  extends DownloadListener
{
  public xco(PreloadManager paramPreloadManager, PreloadManager.DownloadCallback paramDownloadCallback) {}
  
  public void onDoneFile(DownloadTask paramDownloadTask)
  {
    int i = -5;
    super.onDoneFile(paramDownloadTask);
    if (QLog.isColorLevel()) {
      QLog.d("PreloadManager", 2, "downloadRes|done" + paramDownloadTask.jdField_a_of_type_JavaLangString + "|" + paramDownloadTask.jdField_a_of_type_Int);
    }
    Object localObject = paramDownloadTask.a();
    PreloadModule localPreloadModule = (PreloadModule)((Bundle)localObject).getSerializable("module");
    localObject = (PreloadResource)((Bundle)localObject).getSerializable("resource");
    if (paramDownloadTask.jdField_a_of_type_Int == 0)
    {
      i = 0;
      if (localObject != null) {
        break label146;
      }
    }
    label146:
    for (localObject = null;; localObject = ((PreloadResource)localObject).getResInfo(localPreloadModule, this.jdField_a_of_type_ComTencentMobileqqActivityQwalletPreloadPreloadManager))
    {
      this.jdField_a_of_type_ComTencentMobileqqActivityQwalletPreloadPreloadManager$DownloadCallback.onDownloadResFinished(localPreloadModule.mid, i, ((File)paramDownloadTask.jdField_a_of_type_JavaUtilMap.get(paramDownloadTask.jdField_a_of_type_JavaLangString)).getAbsolutePath(), (ResourceInfo)localObject);
      return;
      if (paramDownloadTask.jdField_a_of_type_Int == -5) {
        break;
      }
      i = -6;
      break;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xco
 * JD-Core Version:    0.7.0.1
 */
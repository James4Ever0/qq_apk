import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.biz.common.offline.AsyncBack;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.qphone.base.util.QLog;
import mqq.app.MobileQQ;

class amyl
  implements AsyncBack
{
  amyl(amyk paramamyk) {}
  
  public void loaded(String paramString, int paramInt)
  {
    int j = 0;
    if (QLog.isColorLevel()) {
      QLog.e("QReaderHelper", 2, "Load offline package finish, code = " + paramInt);
    }
    switch (paramInt)
    {
    }
    for (int i = 0;; i = 1)
    {
      paramString = this.a.a.getApplication().getSharedPreferences("qr_offline_fail", 0);
      int k = paramString.getInt("offlinePkgDownloadFailCount", 0);
      if (i != 0) {
        j = k + 1;
      }
      if (j != k) {
        paramString.edit().putInt("offlinePkgDownloadFailCount", j).commit();
      }
      if ((i != 0) && (QLog.isColorLevel())) {
        QLog.e("QReaderHelper", 2, "offline package update failed:" + paramInt);
      }
      return;
    }
  }
  
  public void progress(int paramInt) {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     amyl
 * JD-Core Version:    0.7.0.1
 */
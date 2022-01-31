import com.tencent.biz.common.offline.AsyncBack;
import com.tencent.mobileqq.ar.arengine.ARResourceDownload.DownloadInfo;
import com.tencent.mobileqq.ar.arengine.ARResourceManagerTools;
import com.tencent.mobileqq.ar.arengine.ARResourceManagerTools.ARResourceCallback;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class aapi
  implements AsyncBack
{
  public aapi(ARResourceManagerTools paramARResourceManagerTools, ARResourceManagerTools.ARResourceCallback paramARResourceCallback, ArrayList paramArrayList, ARResourceDownload.DownloadInfo paramDownloadInfo) {}
  
  public void loaded(String paramString, int paramInt)
  {
    QLog.d("AREngine_ARResourceManagerTools", 2, "Load offline package finish, code = " + paramInt + "param1" + paramString);
    if (paramInt == 0) {
      if (paramString == null) {
        if (this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools$ARResourceCallback != null)
        {
          this.jdField_a_of_type_JavaUtilArrayList.remove(this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceDownload$DownloadInfo);
          if (this.jdField_a_of_type_JavaUtilArrayList.size() == 0)
          {
            this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools$ARResourceCallback.a(true);
            this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools$ARResourceCallback.a(4, true);
            this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools.a();
          }
        }
      }
    }
    label245:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              for (;;)
              {
                return;
                try
                {
                  paramString = new JSONObject(paramString);
                  if (!paramString.has("data")) {
                    break label245;
                  }
                  paramString = paramString.getJSONArray("data");
                  if (paramString.length() != 0)
                  {
                    if (!paramString.getJSONObject(0).has("bid")) {}
                  }
                  else if (this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools$ARResourceCallback != null)
                  {
                    this.jdField_a_of_type_JavaUtilArrayList.remove(this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceDownload$DownloadInfo);
                    if (this.jdField_a_of_type_JavaUtilArrayList.size() == 0)
                    {
                      this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools$ARResourceCallback.a(true);
                      this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools$ARResourceCallback.a(4, true);
                      this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools.a();
                      return;
                    }
                  }
                }
                catch (JSONException paramString)
                {
                  paramString.printStackTrace();
                }
              }
            } while (this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools$ARResourceCallback == null);
            this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools$ARResourceCallback.a(false);
            this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools$ARResourceCallback.a(4, false);
            this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools.a();
            return;
            paramString = this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools$ARResourceCallback;
          } while (paramString == null);
          return;
          if (paramInt != 7) {
            break;
          }
        } while (this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools$ARResourceCallback == null);
        this.jdField_a_of_type_JavaUtilArrayList.remove(this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceDownload$DownloadInfo);
      } while (this.jdField_a_of_type_JavaUtilArrayList.size() != 0);
      this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools$ARResourceCallback.a(true);
      this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools$ARResourceCallback.a(4, true);
      this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools.a();
      return;
    } while (this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools$ARResourceCallback == null);
    this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools$ARResourceCallback.a(false);
    this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools$ARResourceCallback.a(4, false);
    this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools.a();
  }
  
  public void progress(int paramInt)
  {
    QLog.d("AREngine_ARResourceManagerTools", 2, "Load offline progress  = " + paramInt);
    if (this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools$ARResourceCallback != null) {
      this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools$ARResourceCallback.a(ARResourceManagerTools.a(this.jdField_a_of_type_ComTencentMobileqqArArengineARResourceManagerTools, 0L, paramInt));
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aapi
 * JD-Core Version:    0.7.0.1
 */
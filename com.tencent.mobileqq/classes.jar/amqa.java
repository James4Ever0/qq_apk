import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.tencent.mobileqq.activity.aio.audiopanel.CommonRecordSoundPanel;
import com.tencent.mobileqq.troop.data.AudioInfo;
import cooperation.troop_homework.outer.TroopHWRecordArrangeActivity;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public class amqa
  extends Handler
{
  public amqa(TroopHWRecordArrangeActivity paramTroopHWRecordArrangeActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 3: 
      this.a.jdField_a_of_type_Boolean = true;
      return;
    case 101: 
      this.a.setResult(0);
      this.a.finish();
      return;
    }
    paramMessage = paramMessage.obj.toString();
    Object localObject = new File(paramMessage);
    long l;
    if (((File)localObject).exists()) {
      l = ((File)localObject).length();
    }
    for (;;)
    {
      this.a.jdField_a_of_type_ComTencentMobileqqTroopDataAudioInfo = new AudioInfo(paramMessage, (int)this.a.jdField_a_of_type_ComTencentMobileqqActivityAioAudiopanelCommonRecordSoundPanel.a(), l);
      this.a.jdField_a_of_type_ComTencentMobileqqActivityAioAudiopanelCommonRecordSoundPanel.setVisibility(8);
      paramMessage = new JSONObject();
      try
      {
        paramMessage.put("webid", TroopHWRecordArrangeActivity.a(this.a));
        paramMessage.put("type", "record");
        paramMessage.put("state", "stop");
        paramMessage.put("time", Math.round(this.a.jdField_a_of_type_ComTencentMobileqqTroopDataAudioInfo.duration / 1000.0F));
        paramMessage.put("size", this.a.jdField_a_of_type_ComTencentMobileqqTroopDataAudioInfo.size);
        localObject = new Intent();
        ((Intent)localObject).putExtra("jscallback", paramMessage.toString());
        ((Intent)localObject).putExtra("localPath", this.a.jdField_a_of_type_ComTencentMobileqqTroopDataAudioInfo.path);
        this.a.setResult(-1, (Intent)localObject);
        this.a.finish();
        return;
        l = 0L;
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          localJSONException.printStackTrace();
        }
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     amqa
 * JD-Core Version:    0.7.0.1
 */
import com.tencent.ark.ArkDebugger.DebuggerCallback;
import com.tencent.ark.ArkDispatchTask;
import com.tencent.mobileqq.activity.aio.rebuild.ArkDebugChatPie;
import com.tencent.mobileqq.ark.ArkAppCenter;
import com.tencent.qphone.base.util.QLog;

class vnl
  implements ArkDebugger.DebuggerCallback
{
  vnl(vnk paramvnk) {}
  
  public void Accepted()
  {
    ArkDispatchTask.getInstance().postToMainThread(new vnm(this));
    QLog.d("ArkDebugChatPie", 1, "ArkDebugger Accepted");
  }
  
  public boolean ReadyToRun(String paramString1, String paramString2, String paramString3)
  {
    ArkAppCenter.a().postToMainThread(new vnq(this, paramString3, paramString2, paramString1));
    QLog.d("ArkDebugChatPie", 1, String.format("ArkDebugger ReadyToRun viewId: %s, metaData: %s, mode: %s", new Object[] { paramString1, paramString2, paramString3 }));
    return true;
  }
  
  public void ReceivedPackage(String paramString1, String paramString2)
  {
    ArkDebugChatPie.a(this.a.a, paramString1);
    ArkDebugChatPie.b(this.a.a, paramString2);
    ArkDispatchTask.getInstance().postToMainThread(new vnp(this, paramString1, paramString2));
    QLog.d("ArkDebugChatPie", 1, String.format("ArkDebugger ReceivedPackage appid: %s, appview: %s", new Object[] { paramString1, paramString2 }));
  }
  
  public void Stopped(int paramInt)
  {
    ArkDispatchTask.getInstance().postToMainThread(new vnn(this, paramInt));
    QLog.d("ArkDebugChatPie", 1, "ArkDebugger Stopped");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     vnl
 * JD-Core Version:    0.7.0.1
 */
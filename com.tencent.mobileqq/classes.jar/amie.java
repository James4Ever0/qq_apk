import cooperation.qzone.remote.RecvMsg;
import cooperation.qzone.remote.RemoteServiceProxy;
import cooperation.qzone.remote.SendMsg;
import java.util.concurrent.ConcurrentLinkedQueue;

public class amie
  extends Thread
{
  public amie(RemoteServiceProxy paramRemoteServiceProxy) {}
  
  public void run()
  {
    while (!this.a.sendMsgQueue.isEmpty())
    {
      SendMsg localSendMsg = (SendMsg)this.a.sendMsgQueue.poll();
      if (localSendMsg != null) {
        try
        {
          this.a.sendMsgToService(localSendMsg);
        }
        catch (Exception localException)
        {
          RecvMsg localRecvMsg = this.a.createWaiteRespTimeout(localSendMsg, "sendMsgToServiceFailed，" + localException.toString());
          this.a.sendFailedRespToApp(localSendMsg, localRecvMsg);
        }
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     amie
 * JD-Core Version:    0.7.0.1
 */
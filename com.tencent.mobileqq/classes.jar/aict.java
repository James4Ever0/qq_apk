import com.tencent.mobileqq.app.MessageObserver;
import com.tencent.mobileqq.app.MessageObserver.StatictisInfo;
import com.tencent.mobileqq.transfile.ScribblePicUploadProcessor;

public class aict
  extends MessageObserver
{
  public aict(ScribblePicUploadProcessor paramScribblePicUploadProcessor) {}
  
  protected void a(boolean paramBoolean, MessageObserver.StatictisInfo paramStatictisInfo)
  {
    this.a.b("sendMsgFinish", "success:" + paramBoolean);
    this.a.a(this.a.c, false, paramBoolean, paramStatictisInfo);
    if (paramBoolean)
    {
      this.a.e();
      return;
    }
    if (paramStatictisInfo != null) {
      this.a.u = paramStatictisInfo.d;
    }
    this.a.a(-1, "MessageForScribble SEND FAIL", "", this.a.b);
    this.a.d();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     aict
 * JD-Core Version:    0.7.0.1
 */
import com.tencent.mobileqq.app.MessageObserver;
import com.tencent.mobileqq.app.MessageObserver.StatictisInfo;
import com.tencent.mobileqq.transfile.GroupPicUploadProcessor;

public class ehc
  extends MessageObserver
{
  public ehc(GroupPicUploadProcessor paramGroupPicUploadProcessor) {}
  
  protected void a(boolean paramBoolean, MessageObserver.StatictisInfo paramStatictisInfo)
  {
    this.a.a("sendMsgFinish", "success:" + paramBoolean);
    this.a.a(this.a.c, false, paramBoolean, paramStatictisInfo);
    if (paramBoolean)
    {
      this.a.e();
      return;
    }
    this.a.d();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     ehc
 * JD-Core Version:    0.7.0.1
 */
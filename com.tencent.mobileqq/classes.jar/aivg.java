import com.tencent.mobileqq.highway.api.ITransCallbackForReport;
import com.tencent.mobileqq.transfile.GroupPicUploadProcessor;

public class aivg
  implements ITransCallbackForReport
{
  public aivg(GroupPicUploadProcessor paramGroupPicUploadProcessor) {}
  
  public void onFailed(int paramInt, String paramString1, String paramString2)
  {
    this.a.a(false, this.a.j, paramString1, paramString2);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     aivg
 * JD-Core Version:    0.7.0.1
 */
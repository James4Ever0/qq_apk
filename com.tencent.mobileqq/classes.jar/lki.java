import com.tencent.biz.pubaccount.readinjoy.capture.ReadInJoyCameraTemplateAdapter;
import com.tencent.mobileqq.shortvideo.PtvTemplateManager.IPtvTemplateDownloadListener;
import com.tencent.mobileqq.shortvideo.PtvTemplateManager.PtvTemplateInfo;
import com.tencent.widget.HorizontalListView;

public class lki
  implements PtvTemplateManager.IPtvTemplateDownloadListener
{
  public lki(ReadInJoyCameraTemplateAdapter paramReadInJoyCameraTemplateAdapter) {}
  
  public void a(PtvTemplateManager.PtvTemplateInfo paramPtvTemplateInfo, int paramInt)
  {
    ReadInJoyCameraTemplateAdapter.a(this.a).post(new lkk(this, paramPtvTemplateInfo, paramInt));
  }
  
  public void a(PtvTemplateManager.PtvTemplateInfo paramPtvTemplateInfo, boolean paramBoolean)
  {
    ReadInJoyCameraTemplateAdapter.a(this.a).post(new lkj(this, paramPtvTemplateInfo, paramBoolean));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     lki
 * JD-Core Version:    0.7.0.1
 */
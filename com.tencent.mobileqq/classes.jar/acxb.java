import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.filemanager.util.FMToastUtil;
import com.tencent.mobileqq.widget.QQToast;

public final class acxb
  implements Runnable
{
  public acxb(String paramString) {}
  
  public void run()
  {
    QQToast.a(BaseApplicationImpl.getContext(), 2, this.a, 0).b(FMToastUtil.a());
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     acxb
 * JD-Core Version:    0.7.0.1
 */
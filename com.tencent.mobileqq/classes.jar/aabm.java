import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.widget.QQToast;

class aabm
  implements Runnable
{
  aabm(aabl paramaabl) {}
  
  public void run()
  {
    QQToast.a(BaseApplicationImpl.getContext(), 1, "下载资源失败,请重试！", 1).a();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aabm
 * JD-Core Version:    0.7.0.1
 */
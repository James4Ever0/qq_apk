import android.content.res.Resources;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.widget.QQToast;

class ajwi
  implements Runnable
{
  ajwi(ajwh paramajwh) {}
  
  public void run()
  {
    int i = BaseApplicationImpl.sApplication.getResources().getDimensionPixelSize(2131558448);
    QQToast.a(BaseApplicationImpl.sApplication, "转发成功", 0).b(i);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     ajwi
 * JD-Core Version:    0.7.0.1
 */
import com.tencent.mobileqq.apollo.ApolloRenderInterfaceImpl;
import com.tencent.mobileqq.apollo.ApolloTextureView;
import com.tencent.mobileqq.apollo.IRenderCallback;
import com.tencent.mobileqq.apollo.store.ApolloGuestsStateActivity;
import com.tencent.qphone.base.util.QLog;

public class yto
  implements IRenderCallback
{
  public yto(ApolloGuestsStateActivity paramApolloGuestsStateActivity) {}
  
  public void a(int paramInt1, int paramInt2, String paramString)
  {
    if (this.a.a != null)
    {
      if (QLog.isColorLevel()) {
        QLog.d("ApolloGuestsStateActivity", 2, "apolloguestActivity stop loop");
      }
      this.a.a.getRenderImpl().a(0L);
    }
  }
  
  public void a(int paramInt, String paramString) {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     yto
 * JD-Core Version:    0.7.0.1
 */
import android.os.Handler;
import com.tencent.mobileqq.activity.TroopGagActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.troop.utils.TroopGagMgr;
import java.util.ArrayList;

class txi
  implements Runnable
{
  txi(txh paramtxh, Handler paramHandler) {}
  
  public void run()
  {
    ArrayList localArrayList = ((TroopGagMgr)this.jdField_a_of_type_Txh.a.app.getManager(47)).a(this.jdField_a_of_type_Txh.a.a, false);
    this.jdField_a_of_type_AndroidOsHandler.post(new txj(this, localArrayList));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     txi
 * JD-Core Version:    0.7.0.1
 */
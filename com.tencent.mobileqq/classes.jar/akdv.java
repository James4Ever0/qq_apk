import com.tencent.mobileqq.troop.utils.TroopGiftCallback;
import com.tencent.qphone.base.util.QLog;
import tencent.im.oidb.cmd0x962.oidb_0x962.RspBody;

class akdv
  extends TroopGiftCallback
{
  akdv(akdj paramakdj) {}
  
  public void a(int paramInt, oidb_0x962.RspBody paramRspBody)
  {
    if (QLog.isColorLevel()) {
      QLog.d("TroopInteractGiftAnimationController", 2, "startInteract: errorCode = " + paramInt);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     akdv
 * JD-Core Version:    0.7.0.1
 */
import com.tencent.mobileqq.binhai.BinHaiMsgDialog;
import com.tencent.mobileqq.binhai.BinHaiMsgDialog.Listener;
import com.tencent.mobileqq.olympic.activity.ScanTorchActivity;

public class afui
  implements BinHaiMsgDialog.Listener
{
  public afui(ScanTorchActivity paramScanTorchActivity) {}
  
  public void a(BinHaiMsgDialog paramBinHaiMsgDialog)
  {
    paramBinHaiMsgDialog.dismiss();
    ScanTorchActivity.m(this.a);
  }
  
  public void b(BinHaiMsgDialog paramBinHaiMsgDialog)
  {
    paramBinHaiMsgDialog.dismiss();
    ScanTorchActivity.m(this.a);
  }
  
  public void c(BinHaiMsgDialog paramBinHaiMsgDialog)
  {
    this.a.finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     afui
 * JD-Core Version:    0.7.0.1
 */
import android.os.Bundle;
import android.os.Handler;
import com.tencent.mobileqq.receipt.ReceiptMessageDetailFragment;
import com.tencent.qphone.base.util.QLog;

public class agqj
  extends agrh
{
  public agqj(ReceiptMessageDetailFragment paramReceiptMessageDetailFragment)
  {
    super(paramReceiptMessageDetailFragment);
  }
  
  void b(int paramInt, byte[] paramArrayOfByte, Bundle paramBundle)
  {
    if (QLog.isDebugVersion()) {
      QLog.d("ReceiptMessageDetailFragment", 4, "mTroopSendReadReportCallback onRes: " + paramInt);
    }
    if (paramInt == 0)
    {
      if (QLog.isColorLevel()) {
        QLog.d("ReceiptMessageDetailFragment", 2, "mTroopSendReadReportCallback succ");
      }
      ReceiptMessageDetailFragment.a((ReceiptMessageDetailFragment)this.a, 0, 0, false);
      ReceiptMessageDetailFragment.a((ReceiptMessageDetailFragment)this.a).sendEmptyMessage(4);
      return;
    }
    if (paramInt != 1281)
    {
      QLog.d("ReceiptMessageDetailFragment", 1, "mTroopSendReadReportCallback fatal error: " + paramInt);
      ReceiptMessageDetailFragment.a((ReceiptMessageDetailFragment)this.a).sendEmptyMessage(5);
      return;
    }
    ReceiptMessageDetailFragment.n((ReceiptMessageDetailFragment)this.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     agqj
 * JD-Core Version:    0.7.0.1
 */
import android.os.SystemClock;
import com.tencent.mobileqq.troop.utils.TroopFileTransferManager;

public class epb
  implements Runnable
{
  public epb(TroopFileTransferManager paramTroopFileTransferManager) {}
  
  public void run()
  {
    for (;;)
    {
      synchronized (this.a)
      {
        if (this.a.e == 0L) {
          return;
        }
        if (SystemClock.uptimeMillis() > this.a.e + 10000L)
        {
          this.a.e = 0L;
          this.a.a();
          return;
        }
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     epb
 * JD-Core Version:    0.7.0.1
 */
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import com.tencent.av.utils.SignalStrengthReport;

public class khp
  extends PhoneStateListener
{
  public khp(SignalStrengthReport paramSignalStrengthReport) {}
  
  public void onSignalStrengthsChanged(SignalStrength paramSignalStrength)
  {
    super.onSignalStrengthsChanged(paramSignalStrength);
    this.a.c = this.a.a(paramSignalStrength);
    this.a.d = this.a.b(paramSignalStrength);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     khp
 * JD-Core Version:    0.7.0.1
 */
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import cooperation.qzone.QZoneStatisticsSettingActivity;
import cooperation.qzone.widget.RadioPreference;

public class igq
  implements Preference.OnPreferenceClickListener
{
  public igq(QZoneStatisticsSettingActivity paramQZoneStatisticsSettingActivity) {}
  
  public boolean onPreferenceClick(Preference paramPreference)
  {
    QZoneStatisticsSettingActivity.a(this.a, 0);
    ((RadioPreference)paramPreference).a(true);
    paramPreference = ((RadioPreference)paramPreference).getKey();
    QZoneStatisticsSettingActivity.a(this.a, paramPreference, 0);
    return false;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     igq
 * JD-Core Version:    0.7.0.1
 */
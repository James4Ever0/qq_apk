import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public final class eao
  implements Runnable
{
  public eao(SharedPreferences paramSharedPreferences) {}
  
  public void run()
  {
    this.a.edit().putBoolean("new_red_point_received", true).commit();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     eao
 * JD-Core Version:    0.7.0.1
 */
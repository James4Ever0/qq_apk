import com.tencent.mobileqq.app.automator.step.CleanCache;
import java.io.File;
import java.io.FilenameFilter;

public class zwv
  implements FilenameFilter
{
  public zwv(CleanCache paramCleanCache) {}
  
  public boolean accept(File paramFile, String paramString)
  {
    return !paramString.contains("CrashInfoSummary.txt");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     zwv
 * JD-Core Version:    0.7.0.1
 */
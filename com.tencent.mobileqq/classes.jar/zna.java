import java.io.File;
import java.util.Comparator;

class zna
  implements Comparator
{
  zna(zmz paramzmz) {}
  
  public int a(File paramFile1, File paramFile2)
  {
    if (paramFile2.lastModified() - paramFile1.lastModified() > 0L) {
      return 1;
    }
    return 0;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     zna
 * JD-Core Version:    0.7.0.1
 */
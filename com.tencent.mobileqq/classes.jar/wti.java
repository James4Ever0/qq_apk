import com.tencent.mobileqq.activity.photo.MediaFileFilter;
import com.tencent.mobileqq.activity.photo.MimeHelper;

public final class wti
  extends MediaFileFilter
{
  public boolean a()
  {
    return true;
  }
  
  public boolean a(String paramString)
  {
    String[] arrayOfString = MimeHelper.a(paramString);
    if (arrayOfString != null)
    {
      if (("image".equals(arrayOfString[0])) && (MimeHelper.a(arrayOfString[1])) && (!arrayOfString[1].equals("gif"))) {}
      while (("video".equals(arrayOfString[0])) && ("video/mp4".equals(paramString))) {
        return false;
      }
    }
    return true;
  }
  
  public boolean b()
  {
    return true;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     wti
 * JD-Core Version:    0.7.0.1
 */
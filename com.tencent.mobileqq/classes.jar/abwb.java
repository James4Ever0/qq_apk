import com.tencent.mobileqq.app.FavEmoRoamingObserver;
import com.tencent.mobileqq.emoticon.EmojiManager;
import java.util.List;

public class abwb
  extends FavEmoRoamingObserver
{
  public abwb(EmojiManager paramEmojiManager, Object paramObject) {}
  
  protected void a(List arg1)
  {
    synchronized (this.jdField_a_of_type_JavaLangObject)
    {
      this.jdField_a_of_type_JavaLangObject.notify();
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     abwb
 * JD-Core Version:    0.7.0.1
 */
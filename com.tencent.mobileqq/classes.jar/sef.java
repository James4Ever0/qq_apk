import com.tencent.mobileqq.activity.Conversation;
import com.tencent.mobileqq.app.TroopQZoneUploadAlbumObserver;

public class sef
  extends TroopQZoneUploadAlbumObserver
{
  public sef(Conversation paramConversation) {}
  
  public void a(boolean paramBoolean, Object paramObject)
  {
    if (!(paramObject instanceof String)) {
      return;
    }
    paramObject = (String)paramObject;
    this.a.a(8, paramObject, -2147483648);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     sef
 * JD-Core Version:    0.7.0.1
 */
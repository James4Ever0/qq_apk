import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.activity.ChatHistoryImageView;

public class ryr
  implements DialogInterface.OnClickListener
{
  public ryr(ChatHistoryImageView paramChatHistoryImageView) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.a.a != null)
    {
      this.a.a.b = false;
      this.a.a.a(false);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     ryr
 * JD-Core Version:    0.7.0.1
 */
import com.tencent.mobileqq.activity.BaseChatPie;
import com.tencent.mobileqq.data.ChatMessage;
import java.util.Comparator;

public class aar
  implements Comparator
{
  public aar(BaseChatPie paramBaseChatPie) {}
  
  public int a(ChatMessage paramChatMessage1, ChatMessage paramChatMessage2)
  {
    if (paramChatMessage1.shmsgseq == paramChatMessage2.shmsgseq) {
      if (paramChatMessage1.getId() <= paramChatMessage2.getId()) {}
    }
    while (paramChatMessage1.shmsgseq > paramChatMessage2.shmsgseq)
    {
      return 1;
      if (paramChatMessage1.getId() < paramChatMessage2.getId()) {
        return -1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     aar
 * JD-Core Version:    0.7.0.1
 */
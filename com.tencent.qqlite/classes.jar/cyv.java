import com.tencent.mobileqq.data.MessageRecord;
import java.util.Comparator;

public final class cyv
  implements Comparator
{
  public int a(MessageRecord paramMessageRecord1, MessageRecord paramMessageRecord2)
  {
    if (paramMessageRecord1.longMsgIndex > paramMessageRecord2.longMsgIndex) {
      return 1;
    }
    return -1;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     cyv
 * JD-Core Version:    0.7.0.1
 */
import com.tencent.mobileqq.data.MessageForGrayTips.HightlightItem;
import com.tencent.mobileqq.graytip.MessageForUniteGrayTip;
import java.util.Comparator;

public class adxc
  implements Comparator
{
  public adxc(MessageForUniteGrayTip paramMessageForUniteGrayTip) {}
  
  public int a(MessageForGrayTips.HightlightItem paramHightlightItem1, MessageForGrayTips.HightlightItem paramHightlightItem2)
  {
    return paramHightlightItem1.start - paramHightlightItem2.start;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     adxc
 * JD-Core Version:    0.7.0.1
 */
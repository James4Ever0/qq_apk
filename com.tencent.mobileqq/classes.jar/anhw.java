import cooperation.qzone.statistic.access.concept.Assembler;
import cooperation.qzone.statistic.access.concept.Key;
import cooperation.qzone.statistic.access.concept.Statistic;
import java.util.List;

public final class anhw
  extends Assembler
{
  public String a(List paramList)
  {
    Key[] arrayOfKey = ((Statistic)paramList.get(0)).getKeys();
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < paramList.size())
    {
      Statistic localStatistic = (Statistic)paramList.get(i);
      int k = arrayOfKey.length;
      int j = 0;
      while (j < k)
      {
        Key localKey = arrayOfKey[j];
        localStringBuilder.append(localKey).append("→").append(localStatistic.getValue(localKey)).append(",");
        j += 1;
      }
      localStringBuilder.append("\n");
      i += 1;
    }
    return localStringBuilder.toString();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     anhw
 * JD-Core Version:    0.7.0.1
 */
import com.tencent.component.network.NetworkManager;

public class pkq
{
  public boolean a = false;
  public boolean b = false;
  
  public pkq()
  {
    if (NetworkManager.isWap())
    {
      this.a = true;
      this.b = true;
      return;
    }
    this.a = false;
    this.b = false;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (!(paramObject instanceof pkq))) {
        return false;
      }
      paramObject = (pkq)paramObject;
    } while ((this.a == paramObject.a) && (this.b) && (paramObject.b));
    return false;
  }
  
  public int hashCode()
  {
    int j = 1;
    int i;
    if (this.a)
    {
      i = 1;
      if (!this.b) {
        break label34;
      }
    }
    for (;;)
    {
      return (i + 527) * 31 + j;
      i = 0;
      break;
      label34:
      j = 0;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     pkq
 * JD-Core Version:    0.7.0.1
 */
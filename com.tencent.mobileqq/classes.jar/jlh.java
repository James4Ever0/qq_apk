import com.tencent.av.random.RandomWebProtocol;
import org.json.JSONObject;

public class jlh
  extends jlf
{
  boolean jdField_b_of_type_Boolean;
  int c;
  
  public jlh(RandomWebProtocol paramRandomWebProtocol, jlf paramjlf, String paramString, boolean paramBoolean, int paramInt)
  {
    super(paramRandomWebProtocol, paramjlf);
    this.a = 2;
    this.c = paramString;
    this.jdField_b_of_type_Boolean = paramBoolean;
    this.c = paramInt;
    this.d = "[m] RequestMulti";
  }
  
  String a()
  {
    this.a = null;
    try
    {
      this.a = new JSONObject().put("session_type", this.c);
      return super.a();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     jlh
 * JD-Core Version:    0.7.0.1
 */
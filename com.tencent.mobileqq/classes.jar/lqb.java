import com.tencent.biz.pubaccount.readinjoy.engine.ReadInJoyLogicEngineEventDispatcher;
import com.tencent.biz.pubaccount.readinjoy.model.ArticleInfoModule;

public class lqb
  implements Runnable
{
  public lqb(ArticleInfoModule paramArticleInfoModule, int paramInt1, int paramInt2) {}
  
  public void run()
  {
    boolean bool = true;
    ReadInJoyLogicEngineEventDispatcher localReadInJoyLogicEngineEventDispatcher = ReadInJoyLogicEngineEventDispatcher.a();
    long l = this.jdField_a_of_type_Int;
    if (this.b == 1) {}
    for (;;)
    {
      localReadInJoyLogicEngineEventDispatcher.a(l, bool);
      return;
      bool = false;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     lqb
 * JD-Core Version:    0.7.0.1
 */
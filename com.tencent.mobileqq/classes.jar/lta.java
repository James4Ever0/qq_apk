import com.tencent.biz.pubaccount.readinjoy.engine.ReadInJoyLogicEngineEventDispatcher;
import com.tencent.biz.pubaccount.readinjoy.model.ArticleInfoModule;
import com.tencent.qphone.base.util.QLog;

public class lta
  implements Runnable
{
  public lta(ArticleInfoModule paramArticleInfoModule) {}
  
  public void run()
  {
    ReadInJoyLogicEngineEventDispatcher.a().b();
    if (QLog.isColorLevel()) {
      QLog.d("ArticleInfoModule", 2, "8c8 response refresh ui ");
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     lta
 * JD-Core Version:    0.7.0.1
 */
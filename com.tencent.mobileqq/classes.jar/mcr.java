import com.tencent.biz.pubaccount.readinjoy.engine.ReadInJoyLogicEngineEventDispatcher;
import com.tencent.biz.pubaccount.readinjoy.engine.ReadInJoyObserver;
import com.tencent.biz.pubaccount.readinjoy.ugc.ReadInJoyVideoTagSelectionFragment;
import java.util.List;

public class mcr
  extends ReadInJoyObserver
{
  public mcr(ReadInJoyVideoTagSelectionFragment paramReadInJoyVideoTagSelectionFragment) {}
  
  public void c(List paramList)
  {
    ReadInJoyVideoTagSelectionFragment.a(this.a).addAll(paramList);
    ReadInJoyLogicEngineEventDispatcher.a().b(this);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     mcr
 * JD-Core Version:    0.7.0.1
 */
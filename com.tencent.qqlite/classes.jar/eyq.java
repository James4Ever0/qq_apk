import com.tencent.mobileqq.widget.AnimationTextView;
import com.tencent.mobileqq.widget.MixedMsgLinearLayout;
import java.util.Stack;

public class eyq
{
  private Stack jdField_a_of_type_JavaUtilStack = new Stack();
  
  public eyq(MixedMsgLinearLayout paramMixedMsgLinearLayout) {}
  
  public AnimationTextView a()
  {
    if (this.jdField_a_of_type_JavaUtilStack.isEmpty()) {
      return null;
    }
    return (AnimationTextView)this.jdField_a_of_type_JavaUtilStack.pop();
  }
  
  public void a(AnimationTextView paramAnimationTextView)
  {
    this.jdField_a_of_type_JavaUtilStack.push(paramAnimationTextView);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     eyq
 * JD-Core Version:    0.7.0.1
 */
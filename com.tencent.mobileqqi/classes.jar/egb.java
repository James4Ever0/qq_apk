import android.view.View;
import com.tencent.mobileqq.activity.ChatActivity;
import com.tencent.mobileqq.activity.ChatActivityUtils;
import com.tencent.mobileqq.activity.aio.item.TextItemBuilder;
import com.tencent.mobileqq.widget.AnimationTextView.OnDoubleClick;

public class egb
  implements AnimationTextView.OnDoubleClick
{
  public egb(TextItemBuilder paramTextItemBuilder) {}
  
  public void a(View paramView)
  {
    ChatActivityUtils.a(TextItemBuilder.b(this.a), paramView, (ChatActivity)TextItemBuilder.a(this.a));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     egb
 * JD-Core Version:    0.7.0.1
 */
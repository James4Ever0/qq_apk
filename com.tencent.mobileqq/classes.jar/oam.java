import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.biz.qqstory.storyHome.tag.TagAdapter;
import com.tencent.biz.qqstory.storyHome.tag.TagAdapter.OnItemClickListener;

public class oam
  implements View.OnClickListener
{
  public oam(TagAdapter paramTagAdapter) {}
  
  public void onClick(View paramView)
  {
    if (TagAdapter.a(this.a) != null) {
      TagAdapter.a(this.a).h();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     oam
 * JD-Core Version:    0.7.0.1
 */
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;
import com.tencent.mobileqq.activity.aio.AIOUtils;
import com.tencent.mobileqq.extendfriend.fragment.ExtendFriendGroupFragment;

public class acql
  extends RecyclerView.ItemDecoration
{
  private final int jdField_a_of_type_Int = AIOUtils.a(3.0F, this.jdField_a_of_type_ComTencentMobileqqExtendfriendFragmentExtendFriendGroupFragment.getResources());
  
  private acql(ExtendFriendGroupFragment paramExtendFriendGroupFragment) {}
  
  public void getItemOffsets(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.State paramState)
  {
    paramRect.right = this.jdField_a_of_type_Int;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     acql
 * JD-Core Version:    0.7.0.1
 */
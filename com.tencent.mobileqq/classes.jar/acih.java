import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.tencent.image.URLImageView;
import com.tencent.mobileqq.extendfriend.fragment.ExtendFriendGroupFragment;
import com.tencent.mobileqq.extendfriend.fragment.GroupItemClickListeneer;
import com.tencent.widget.SingleLineTextView;

public class acih
  extends RecyclerView.ViewHolder
  implements View.OnClickListener
{
  RecyclerView jdField_a_of_type_AndroidSupportV7WidgetRecyclerView;
  View jdField_a_of_type_AndroidViewView;
  URLImageView jdField_a_of_type_ComTencentImageURLImageView;
  private GroupItemClickListeneer jdField_a_of_type_ComTencentMobileqqExtendfriendFragmentGroupItemClickListeneer;
  SingleLineTextView jdField_a_of_type_ComTencentWidgetSingleLineTextView;
  SingleLineTextView b;
  
  public acih(ExtendFriendGroupFragment paramExtendFriendGroupFragment, ViewGroup paramViewGroup, GroupItemClickListeneer paramGroupItemClickListeneer)
  {
    super(paramViewGroup);
    this.jdField_a_of_type_ComTencentMobileqqExtendfriendFragmentGroupItemClickListeneer = paramGroupItemClickListeneer;
    this.jdField_a_of_type_AndroidViewView = paramViewGroup;
    this.jdField_a_of_type_ComTencentImageURLImageView = ((URLImageView)paramViewGroup.findViewById(2131363063));
    this.jdField_a_of_type_ComTencentWidgetSingleLineTextView = ((SingleLineTextView)paramViewGroup.findViewById(2131363378));
    this.jdField_a_of_type_AndroidSupportV7WidgetRecyclerView = ((RecyclerView)paramViewGroup.findViewById(2131370090));
    this.b = ((SingleLineTextView)paramViewGroup.findViewById(2131363579));
    paramViewGroup = new acig(paramExtendFriendGroupFragment, null);
    this.jdField_a_of_type_AndroidSupportV7WidgetRecyclerView.addItemDecoration(paramViewGroup);
    paramViewGroup = new StaggeredGridLayoutManager(1, 0);
    this.jdField_a_of_type_AndroidSupportV7WidgetRecyclerView.setLayoutManager(paramViewGroup);
    this.jdField_a_of_type_AndroidSupportV7WidgetRecyclerView.setOnTouchListener(new acii(this, paramExtendFriendGroupFragment));
    this.jdField_a_of_type_AndroidViewView.setOnClickListener(new acij(this, paramExtendFriendGroupFragment));
  }
  
  public void onClick(View paramView) {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     acih
 * JD-Core Version:    0.7.0.1
 */
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mobileqq.activity.DiscussionMemberActivity;
import com.tencent.mobileqq.adapter.FacePreloadBaseAdapter;
import com.tencent.mobileqq.adapter.FacePreloadBaseAdapter.FaceInfo;
import java.util.List;

public class ajr
  extends FacePreloadBaseAdapter
{
  private List jdField_a_of_type_JavaUtilList;
  
  public ajr(DiscussionMemberActivity paramDiscussionMemberActivity, List paramList)
  {
    super(paramDiscussionMemberActivity, paramDiscussionMemberActivity.app, paramDiscussionMemberActivity.a, 1, true);
    this.jdField_a_of_type_JavaUtilList = paramList;
  }
  
  protected Object a(int paramInt)
  {
    ajo localajo = (ajo)getItem(paramInt);
    FacePreloadBaseAdapter.FaceInfo localFaceInfo = new FacePreloadBaseAdapter.FaceInfo(this);
    if (localajo != null)
    {
      localFaceInfo.jdField_a_of_type_JavaLangString = localajo.jdField_a_of_type_JavaLangString;
      localFaceInfo.jdField_a_of_type_Int = 1;
    }
    return localFaceInfo;
  }
  
  public int getCount()
  {
    if (this.jdField_a_of_type_JavaUtilList == null) {
      return 0;
    }
    return this.jdField_a_of_type_JavaUtilList.size();
  }
  
  public Object getItem(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.jdField_a_of_type_JavaUtilList.size())) {
      return this.jdField_a_of_type_JavaUtilList.get(paramInt);
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ajo localajo;
    if (paramView == null)
    {
      paramView = this.jdField_a_of_type_ComTencentMobileqqActivityDiscussionMemberActivity.getLayoutInflater().inflate(2130903177, paramViewGroup, false);
      paramViewGroup = new ajt(null);
      paramViewGroup.b = ((ImageView)paramView.findViewById(2131297011));
      paramViewGroup.jdField_a_of_type_AndroidWidgetTextView = ((TextView)paramView.findViewById(2131296875));
      paramView.setTag(paramViewGroup);
      localajo = (ajo)getItem(paramInt);
      if ((localajo.b != null) && (!"".equals(localajo.b.trim()))) {
        break label144;
      }
      paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setText(localajo.jdField_a_of_type_JavaLangString);
    }
    for (;;)
    {
      paramViewGroup.jdField_a_of_type_JavaLangString = localajo.jdField_a_of_type_JavaLangString;
      paramViewGroup.b.setImageBitmap(a(1, localajo.jdField_a_of_type_JavaLangString));
      return paramView;
      paramViewGroup = (ajt)paramView.getTag();
      break;
      label144:
      paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setText(localajo.b);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     ajr
 * JD-Core Version:    0.7.0.1
 */
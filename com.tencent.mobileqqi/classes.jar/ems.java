import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mobileqq.activity.language.SelectTransLangActivity;
import java.util.List;
import java.util.Map;

public class ems
  extends BaseAdapter
{
  LayoutInflater jdField_a_of_type_AndroidViewLayoutInflater;
  
  public ems(SelectTransLangActivity paramSelectTransLangActivity, Context paramContext)
  {
    this.jdField_a_of_type_AndroidViewLayoutInflater = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }
  
  public int getCount()
  {
    return SelectTransLangActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityLanguageSelectTransLangActivity).size();
  }
  
  public Object getItem(int paramInt)
  {
    return Integer.valueOf(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  @SuppressLint({"NewApi"})
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = this.jdField_a_of_type_AndroidViewLayoutInflater.inflate(2130903256, paramViewGroup, false);
      paramViewGroup = new emt(this);
      paramViewGroup.jdField_a_of_type_AndroidWidgetTextView = ((TextView)paramView.findViewById(2131231857));
      paramViewGroup.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)paramView.findViewById(2131231858));
      paramView.setTag(paramViewGroup);
      if (paramInt != 0) {
        break label172;
      }
      paramView.setBackgroundResource(2130837880);
      label66:
      if (SelectTransLangActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityLanguageSelectTransLangActivity).equalsIgnoreCase((String)SelectTransLangActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityLanguageSelectTransLangActivity).get(paramInt))) {
        break label200;
      }
      paramViewGroup.jdField_a_of_type_AndroidWidgetImageView.setImageResource(2130840216);
    }
    for (;;)
    {
      paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setText((CharSequence)SelectTransLangActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityLanguageSelectTransLangActivity).get(SelectTransLangActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityLanguageSelectTransLangActivity).get(paramInt)));
      paramViewGroup.jdField_a_of_type_JavaLangString = ((String)SelectTransLangActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityLanguageSelectTransLangActivity).get(paramInt));
      return paramView;
      paramViewGroup = (emt)paramView.getTag();
      break;
      label172:
      if (paramInt == getCount() - 1)
      {
        paramView.setBackgroundResource(2130837877);
        break label66;
      }
      paramView.setBackgroundResource(2130837879);
      break label66;
      label200:
      paramViewGroup.jdField_a_of_type_AndroidWidgetImageView.setImageResource(2130840215);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     ems
 * JD-Core Version:    0.7.0.1
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.mobileqq.utils.QQCustomSplitDialog;

public class evd
  extends BaseAdapter
{
  public evd(QQCustomSplitDialog paramQQCustomSplitDialog) {}
  
  public int getCount()
  {
    if (this.a.jdField_a_of_type_ArrayOfJavaLangString != null) {
      return this.a.jdField_a_of_type_ArrayOfJavaLangString.length;
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.a.jdField_a_of_type_AndroidViewLayoutInflater == null) {
      this.a.jdField_a_of_type_AndroidViewLayoutInflater = ((LayoutInflater)this.a.getContext().getSystemService("layout_inflater"));
    }
    paramViewGroup = paramView;
    if (paramView == null)
    {
      paramViewGroup = this.a.jdField_a_of_type_AndroidViewLayoutInflater.inflate(2130903147, null);
      paramView = new evj(this.a, null);
      paramView.a = ((TextView)paramViewGroup.findViewById(2131296940));
      paramView.b = ((TextView)paramViewGroup.findViewById(2131296920));
      paramViewGroup.setTag(paramView);
    }
    paramView = (evj)paramViewGroup.getTag();
    int i;
    int j;
    int k;
    int m;
    if (paramView.b != null)
    {
      if ((this.a.jdField_a_of_type_ArrayOfJavaLangString.length <= 1) || (paramInt != this.a.jdField_a_of_type_ArrayOfJavaLangString.length - 1)) {
        break label266;
      }
      paramView.a.setVisibility(0);
      paramView.b.setText(this.a.jdField_a_of_type_ArrayOfJavaLangString[paramInt]);
      paramView.b.setOnClickListener(new evi(this.a, paramInt));
      i = paramView.b.getPaddingTop();
      j = paramView.b.getPaddingLeft();
      k = paramView.b.getPaddingRight();
      m = paramView.b.getPaddingBottom();
      if ((this.a.jdField_a_of_type_ArrayOfJavaLangString.length != 1) && (this.a.jdField_a_of_type_ArrayOfJavaLangString.length != 2)) {
        break label278;
      }
      paramView.b.setBackgroundResource(2130837962);
    }
    for (;;)
    {
      paramView.b.setPadding(j, i, k, m);
      return paramViewGroup;
      label266:
      paramView.a.setVisibility(8);
      break;
      label278:
      if (this.a.jdField_a_of_type_ArrayOfJavaLangString.length == 3) {
        switch (paramInt)
        {
        default: 
          break;
        case 0: 
          paramView.b.setBackgroundResource(2130837963);
          break;
        case 1: 
          paramView.b.setBackgroundResource(2130837961);
          break;
        case 2: 
          paramView.b.setBackgroundResource(2130837962);
        }
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     evd
 * JD-Core Version:    0.7.0.1
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mobileqq.activity.LoginActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.widget.DropdownView;
import com.tencent.qphone.base.remote.SimpleAccount;
import java.util.List;

public class atv
  extends ArrayAdapter
  implements View.OnClickListener
{
  Filter jdField_a_of_type_AndroidWidgetFilter;
  
  public atv(LoginActivity paramLoginActivity, Context paramContext)
  {
    super(paramContext, 2130903042, 2131296447, paramLoginActivity.jdField_a_of_type_JavaUtilList);
  }
  
  public String a(int paramInt)
  {
    return this.jdField_a_of_type_ComTencentMobileqqActivityLoginActivity.app.b(((SimpleAccount)this.jdField_a_of_type_ComTencentMobileqqActivityLoginActivity.jdField_a_of_type_JavaUtilList.get(paramInt)).getUin());
  }
  
  public String b(int paramInt)
  {
    return ((SimpleAccount)this.jdField_a_of_type_ComTencentMobileqqActivityLoginActivity.jdField_a_of_type_JavaUtilList.get(paramInt)).getUin();
  }
  
  public int getCount()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqActivityLoginActivity.jdField_a_of_type_JavaUtilList.size() == 0) {
      this.jdField_a_of_type_ComTencentMobileqqActivityLoginActivity.jdField_a_of_type_ComTencentMobileqqWidgetDropdownView.b().setVisibility(8);
    }
    for (;;)
    {
      return super.getCount();
      this.jdField_a_of_type_ComTencentMobileqqActivityLoginActivity.jdField_a_of_type_ComTencentMobileqqWidgetDropdownView.b().setVisibility(0);
    }
  }
  
  public Filter getFilter()
  {
    if (this.jdField_a_of_type_AndroidWidgetFilter == null) {
      this.jdField_a_of_type_AndroidWidgetFilter = new atw(this);
    }
    return this.jdField_a_of_type_AndroidWidgetFilter;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramView = super.getView(paramInt, paramView, paramViewGroup);
    paramViewGroup = (LinearLayout)paramView.findViewById(2131296445);
    ImageView localImageView = (ImageView)paramView.findViewById(2131296446);
    Bitmap localBitmap = this.jdField_a_of_type_ComTencentMobileqqActivityLoginActivity.a(((SimpleAccount)this.jdField_a_of_type_ComTencentMobileqqActivityLoginActivity.jdField_a_of_type_JavaUtilList.get(paramInt)).getUin(), false);
    if (localBitmap != null) {
      localImageView.setImageBitmap(localBitmap);
    }
    for (;;)
    {
      localImageView = (ImageView)paramView.findViewById(2131296448);
      localImageView.setTag(Integer.valueOf(paramInt));
      localImageView.setOnClickListener(this);
      localImageView.setContentDescription(this.jdField_a_of_type_ComTencentMobileqqActivityLoginActivity.getString(2131362913));
      paramView.setContentDescription(String.format(this.jdField_a_of_type_ComTencentMobileqqActivityLoginActivity.getString(2131362899) + "%s", new Object[] { ((SimpleAccount)this.jdField_a_of_type_ComTencentMobileqqActivityLoginActivity.jdField_a_of_type_JavaUtilList.get(paramInt)).getUin() }));
      paramViewGroup.setOnClickListener(new atx(this, paramInt));
      return paramView;
      localImageView.setImageResource(2130838120);
    }
  }
  
  public void onClick(View paramView)
  {
    this.jdField_a_of_type_ComTencentMobileqqActivityLoginActivity.e = ((Integer)paramView.getTag()).intValue();
    this.jdField_a_of_type_ComTencentMobileqqActivityLoginActivity.showDialog(1);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     atv
 * JD-Core Version:    0.7.0.1
 */
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.mobileqq.activity.phone.CountryActivity;
import com.tencent.mobileqq.utils.ChnToSpell;
import java.util.ArrayList;
import java.util.Iterator;

public class chd
  extends BaseAdapter
{
  private static final int jdField_a_of_type_Int = 0;
  private static final int b = 1;
  private static final int c = 2;
  private static final int d = 3;
  private String jdField_a_of_type_JavaLangString = "";
  private ArrayList jdField_a_of_type_JavaUtilArrayList = this.jdField_a_of_type_ComTencentMobileqqActivityPhoneCountryActivity.jdField_a_of_type_JavaUtilArrayList;
  
  private chd(CountryActivity paramCountryActivity) {}
  
  private int a(chb paramchb)
  {
    if (paramchb.a) {}
    String str1;
    String str2;
    String str3;
    do
    {
      do
      {
        return 0;
      } while ((this.jdField_a_of_type_JavaLangString == null) || (this.jdField_a_of_type_JavaLangString.equals("")));
      str1 = paramchb.c;
      paramchb = paramchb.b;
      str2 = ChnToSpell.a(paramchb, 1);
      str3 = ChnToSpell.a(paramchb, 2);
      if ((str1.equals(this.jdField_a_of_type_JavaLangString)) || (paramchb.equals(this.jdField_a_of_type_JavaLangString)) || (str2.equals(this.jdField_a_of_type_JavaLangString)) || (str3.equals(this.jdField_a_of_type_JavaLangString))) {
        return 3;
      }
      if ((str1.indexOf(this.jdField_a_of_type_JavaLangString) == 0) || (paramchb.indexOf(this.jdField_a_of_type_JavaLangString) == 0) || (str2.indexOf(this.jdField_a_of_type_JavaLangString) == 0) || (str3.indexOf(this.jdField_a_of_type_JavaLangString) == 0)) {
        return 2;
      }
    } while ((str1.indexOf(this.jdField_a_of_type_JavaLangString) <= 0) && (paramchb.indexOf(this.jdField_a_of_type_JavaLangString) <= 0) && (str2.indexOf(this.jdField_a_of_type_JavaLangString) <= 0) && (str3.indexOf(this.jdField_a_of_type_JavaLangString) <= 0));
    return 1;
  }
  
  public void a(String paramString)
  {
    int j = 0;
    Object localObject = paramString.toLowerCase();
    int i;
    label49:
    chb localchb;
    int k;
    if (((String)localObject).startsWith(this.jdField_a_of_type_JavaLangString))
    {
      paramString = this.jdField_a_of_type_JavaUtilArrayList;
      this.jdField_a_of_type_JavaLangString = ((String)localObject);
      localObject = new ArrayList(8);
      paramString = paramString.iterator();
      i = 0;
      if (!paramString.hasNext()) {
        break label177;
      }
      localchb = (chb)paramString.next();
      k = a(localchb);
      if (k != 3) {
        break label123;
      }
      ((ArrayList)localObject).add(i, localchb);
      k = j;
      j = i + 1;
      i = k;
    }
    for (;;)
    {
      k = j;
      j = i;
      i = k;
      break label49;
      paramString = this.jdField_a_of_type_ComTencentMobileqqActivityPhoneCountryActivity.jdField_a_of_type_JavaUtilArrayList;
      break;
      label123:
      if (k == 2)
      {
        ((ArrayList)localObject).add(j + i, localchb);
        k = j + 1;
        j = i;
        i = k;
      }
      else
      {
        if (k == 1) {
          ((ArrayList)localObject).add(localchb);
        }
        k = i;
        i = j;
        j = k;
      }
    }
    label177:
    this.jdField_a_of_type_JavaUtilArrayList = ((ArrayList)localObject);
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    return this.jdField_a_of_type_JavaUtilArrayList.size();
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
    paramViewGroup = paramView;
    if (paramView == null)
    {
      paramViewGroup = CountryActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityPhoneCountryActivity.getLayoutInflater(), true);
      paramViewGroup.setOnClickListener(this.jdField_a_of_type_ComTencentMobileqqActivityPhoneCountryActivity);
    }
    CountryActivity.a(paramViewGroup, (chb)this.jdField_a_of_type_JavaUtilArrayList.get(paramInt));
    return paramViewGroup;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     chd
 * JD-Core Version:    0.7.0.1
 */
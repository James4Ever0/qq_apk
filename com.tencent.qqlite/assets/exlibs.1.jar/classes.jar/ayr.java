import com.tencent.mobileqq.activity.NearbyPeopleProfileActivity;
import com.tencent.mobileqq.conditionsearch.widget.IphonePickerView.PickerViewAdapter;

public class ayr
  implements IphonePickerView.PickerViewAdapter
{
  public ayr(NearbyPeopleProfileActivity paramNearbyPeopleProfileActivity) {}
  
  public int a()
  {
    return 1;
  }
  
  public int a(int paramInt)
  {
    return 2;
  }
  
  public String a(int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 0)
    {
      paramInt1 = paramInt2;
      if (paramInt2 <= 1) {}
    }
    else
    {
      paramInt1 = 0;
    }
    if (paramInt1 == 0) {
      return "男";
    }
    return "女";
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     ayr
 * JD-Core Version:    0.7.0.1
 */
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.biz.qqstory.support.logging.SLog;
import com.tencent.biz.qqstory.takevideo.filter.FilterData.FilterPageItem;
import com.tencent.biz.qqstory.takevideo.filter.SpeedFilterData;

public class opc
  extends FilterData.FilterPageItem
{
  private Context jdField_a_of_type_AndroidContentContext;
  private LinearLayout jdField_a_of_type_AndroidWidgetLinearLayout;
  
  public opc(SpeedFilterData paramSpeedFilterData, @NonNull Context paramContext, ViewGroup paramViewGroup)
  {
    super(paramContext, paramViewGroup);
    this.jdField_a_of_type_AndroidContentContext = paramContext;
    this.jdField_a_of_type_AndroidWidgetLinearLayout = ((LinearLayout)this.jdField_a_of_type_AndroidViewView.findViewById(2131372006));
  }
  
  private void a(int paramInt)
  {
    int i = 0;
    if (paramInt < 0) {
      SLog.e("SpeedFilterData", "speed < 0. speed:%s .", new Object[] { Integer.valueOf(paramInt) });
    }
    for (;;)
    {
      return;
      SLog.a("SpeedFilterData", "updateSpeed: %s", Integer.valueOf(paramInt));
      if (paramInt == 0) {}
      char[] arrayOfChar;
      Object localObject1;
      for (boolean bool = true;; bool = false)
      {
        arrayOfChar = String.valueOf(paramInt).toCharArray();
        paramInt = i;
        while (paramInt < arrayOfChar.length)
        {
          Object localObject2 = (ImageView)this.jdField_a_of_type_AndroidWidgetLinearLayout.getChildAt(paramInt);
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            localObject1 = new ImageView(this.jdField_a_of_type_AndroidContentContext);
            localObject2 = new LinearLayout.LayoutParams(-2, -2);
            ((ImageView)localObject1).setScaleType(ImageView.ScaleType.FIT_CENTER);
            ((ImageView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
            this.jdField_a_of_type_AndroidWidgetLinearLayout.addView((View)localObject1);
          }
          a((ImageView)localObject1, arrayOfChar[paramInt], bool);
          paramInt += 1;
        }
      }
      paramInt = arrayOfChar.length;
      while (paramInt < this.jdField_a_of_type_AndroidWidgetLinearLayout.getChildCount())
      {
        localObject1 = this.jdField_a_of_type_AndroidWidgetLinearLayout.getChildAt(paramInt);
        this.jdField_a_of_type_AndroidWidgetLinearLayout.removeView((View)localObject1);
        paramInt += 1;
      }
    }
  }
  
  private void a(ImageView paramImageView, char paramChar, boolean paramBoolean)
  {
    if (paramImageView == null) {
      return;
    }
    switch (paramChar)
    {
    default: 
      return;
    case '0': 
      if (paramBoolean)
      {
        paramImageView.setImageResource(2130843799);
        return;
      }
      paramImageView.setImageResource(2130843800);
      return;
    case '1': 
      paramImageView.setImageResource(2130843801);
      return;
    case '2': 
      paramImageView.setImageResource(2130843802);
      return;
    case '3': 
      paramImageView.setImageResource(2130843803);
      return;
    case '4': 
      paramImageView.setImageResource(2130843804);
      return;
    case '5': 
      paramImageView.setImageResource(2130843805);
      return;
    case '6': 
      paramImageView.setImageResource(2130843806);
      return;
    case '7': 
      paramImageView.setImageResource(2130843807);
      return;
    case '8': 
      paramImageView.setImageResource(2130843808);
      return;
    }
    paramImageView.setImageResource(2130843809);
  }
  
  protected View a(@NonNull Context paramContext, ViewGroup paramViewGroup)
  {
    return LayoutInflater.from(paramContext).inflate(2130970854, paramViewGroup, false);
  }
  
  public void a()
  {
    super.a();
  }
  
  public void a(SpeedFilterData paramSpeedFilterData, int paramInt)
  {
    super.a(paramSpeedFilterData, paramInt);
    a(SpeedFilterData.a(this.jdField_a_of_type_ComTencentBizQqstoryTakevideoFilterSpeedFilterData));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     opc
 * JD-Core Version:    0.7.0.1
 */
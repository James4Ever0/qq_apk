import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.biz.qqstory.support.logging.SLog;
import com.tencent.image.URLDrawable;
import com.tencent.image.URLDrawable.URLDrawableOptions;
import com.tencent.image.URLDrawableDownListener;
import com.tencent.image.URLImageView;
import com.tencent.mobileqq.transfile.URLDrawableHelper;
import dov.com.tencent.biz.qqstory.takevideo.doodle.ui.face.LocationFacePackage;
import dov.com.tencent.biz.qqstory.takevideo.doodle.util.DisplayUtil;

public class aojs
  extends LinearLayout
{
  private float jdField_a_of_type_Float;
  private int jdField_a_of_type_Int;
  private View.OnClickListener jdField_a_of_type_AndroidViewView$OnClickListener;
  private int b;
  private int c;
  private final int d = 5;
  
  public aojs(Context paramContext, int paramInt1, int paramInt2, float paramFloat, View.OnClickListener paramOnClickListener)
  {
    super(paramContext);
    this.jdField_a_of_type_AndroidViewView$OnClickListener = paramOnClickListener;
    this.jdField_a_of_type_Int = paramInt1;
    this.b = paramInt2;
    this.jdField_a_of_type_Float = paramFloat;
    paramInt1 = DisplayUtil.a(getContext(), 6.0F);
    this.c = ((this.jdField_a_of_type_Int - paramInt1 * ((this.b - 1) * 2)) / this.b);
    a();
  }
  
  private void a()
  {
    setOrientation(0);
    setGravity(17);
    int j = DisplayUtil.a(getContext(), 12.0F);
    int k = (int)((this.c - j * 2) * this.jdField_a_of_type_Float);
    int i = 0;
    if (i < this.b)
    {
      View localView = LayoutInflater.from(getContext()).inflate(2130968956, null);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(this.c, this.c);
      if (i == 0) {
        localLayoutParams.setMargins(0, j, j / 2, 0);
      }
      for (;;)
      {
        localView.setLayoutParams(localLayoutParams);
        ((ImageView)localView.findViewById(2131364412)).setPadding(k, k, k, k);
        addView(localView);
        i += 1;
        break;
        if (this.b - 1 == i) {
          localLayoutParams.setMargins(j / 2, j, 0, 0);
        } else {
          localLayoutParams.setMargins(j / 2, j, j / 2, 0);
        }
      }
    }
  }
  
  private void a(int paramInt)
  {
    int i = 0;
    int j;
    for (;;)
    {
      j = paramInt;
      if (i >= paramInt) {
        break;
      }
      j = paramInt;
      if (i >= getChildCount()) {
        break;
      }
      getChildAt(i).setVisibility(0);
      i += 1;
    }
    while ((j < this.b) && (j < getChildCount()))
    {
      getChildAt(j).setVisibility(4);
      j += 1;
    }
  }
  
  public void a(LocationFacePackage paramLocationFacePackage, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = paramInt1 * this.b;
    label31:
    URLImageView localURLImageView;
    ProgressBar localProgressBar;
    String str;
    if (paramInt1 == paramInt2 - 1)
    {
      paramInt1 = paramLocationFacePackage.b();
      a(paramInt1 - i);
      paramInt2 = i;
      if (paramInt2 >= paramInt1) {
        return;
      }
      localObject1 = getChildAt(paramInt2 - i);
      localObject2 = ((View)localObject1).findViewById(2131364410);
      localURLImageView = (URLImageView)((View)localObject1).findViewById(2131364412);
      localObject3 = (TextView)((View)localObject1).findViewById(2131364411);
      localProgressBar = (ProgressBar)((View)localObject1).findViewById(2131364413);
      str = paramLocationFacePackage.b(paramInt2);
      localObject1 = paramLocationFacePackage.a(paramInt2);
      if (localObject1 != null) {
        break label146;
      }
      SLog.e("LocationFaceAdapter", "FacePackage's thumbUri is empty , pkg : %s", new Object[] { paramLocationFacePackage.toString() });
    }
    for (;;)
    {
      paramInt2 += 1;
      break label31;
      paramInt1 = this.b + i;
      break;
      label146:
      ((TextView)localObject3).setText(str);
      ((View)localObject2).setOnClickListener(this.jdField_a_of_type_AndroidViewView$OnClickListener);
      localURLImageView.setTag(2131362362, Integer.valueOf(paramInt2));
      if (paramBoolean) {
        break label193;
      }
      localProgressBar.setVisibility(4);
      localURLImageView.setImageDrawable(null);
    }
    label193:
    localURLImageView.setTag(2131362363, localObject1);
    localURLImageView.setTag(2131362364, Boolean.valueOf(false));
    localProgressBar.setVisibility(0);
    Object localObject2 = new aojt((String)localObject1, localURLImageView, localProgressBar);
    localURLImageView.setURLDrawableDownListener((URLDrawableDownListener)localObject2);
    Object localObject3 = URLDrawable.URLDrawableOptions.obtain();
    ((URLDrawable.URLDrawableOptions)localObject3).mFailedDrawable = URLDrawableHelper.a;
    ((URLDrawable.URLDrawableOptions)localObject3).mLoadingDrawable = URLDrawableHelper.a;
    ((URLDrawable.URLDrawableOptions)localObject3).mUseAutoScaleParams = false;
    Object localObject1 = URLDrawable.getDrawable((String)localObject1, (URLDrawable.URLDrawableOptions)localObject3);
    if (((URLDrawable)localObject1).getStatus() == 1) {
      ((aojt)localObject2).onLoadSuccessed(localURLImageView, (URLDrawable)localObject1);
    }
    if (paramBoolean) {}
    for (;;)
    {
      localURLImageView.setImageDrawable((Drawable)localObject1);
      break;
      localObject1 = null;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     aojs
 * JD-Core Version:    0.7.0.1
 */
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tencent.biz.qqstory.shareGroup.icon.IconLog;

class nqd
  extends Drawable
{
  private Drawable jdField_a_of_type_AndroidGraphicsDrawableDrawable;
  private String jdField_a_of_type_JavaLangString = "story.icon.ShareGroupIconDrawable";
  private npy jdField_a_of_type_Npy;
  private nqa jdField_a_of_type_Nqa = new nqe(this);
  private Drawable b;
  
  nqd(@NonNull npy paramnpy, @NonNull Drawable paramDrawable)
  {
    this.jdField_a_of_type_Npy = paramnpy;
    this.jdField_a_of_type_Npy.a(this.jdField_a_of_type_Nqa);
    this.jdField_a_of_type_AndroidGraphicsDrawableDrawable = paramDrawable;
    this.b = paramDrawable;
    paramnpy = this.jdField_a_of_type_Npy.a();
    if (paramnpy != null) {
      a(paramnpy);
    }
  }
  
  private void a(@NonNull Drawable paramDrawable)
  {
    IconLog.a(this.jdField_a_of_type_JavaLangString, "updateCurrentDrawable view:%s drawable: %s", getCallback(), paramDrawable);
    if (paramDrawable != this.b)
    {
      paramDrawable.setBounds(getBounds());
      paramDrawable.setVisible(isVisible(), true);
      paramDrawable.setState(getState());
      paramDrawable.setLevel(getLevel());
      paramDrawable.setCallback(getCallback());
      if (Build.VERSION.SDK_INT >= 19) {
        paramDrawable.setAlpha(getAlpha());
      }
      Drawable localDrawable = this.b;
      this.b = paramDrawable;
      if (localDrawable != null) {
        localDrawable.setCallback(null);
      }
      invalidateSelf();
    }
  }
  
  public void draw(@NonNull Canvas paramCanvas)
  {
    this.b.draw(paramCanvas);
    this.jdField_a_of_type_Npy.b();
  }
  
  public int getOpacity()
  {
    return this.b.getOpacity();
  }
  
  public boolean getPadding(@NonNull Rect paramRect)
  {
    return this.b.getPadding(paramRect);
  }
  
  @NonNull
  public Drawable mutate()
  {
    this.b.mutate();
    return super.mutate();
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.b.setBounds(paramRect);
  }
  
  protected boolean onLevelChange(int paramInt)
  {
    this.b.setLevel(paramInt);
    return true;
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    this.b.setState(paramArrayOfInt);
    return true;
  }
  
  public void setAlpha(int paramInt)
  {
    this.b.setAlpha(paramInt);
  }
  
  public void setColorFilter(int paramInt, @NonNull PorterDuff.Mode paramMode)
  {
    super.setColorFilter(paramInt, paramMode);
    this.b.setColorFilter(paramInt, paramMode);
  }
  
  public void setColorFilter(@Nullable ColorFilter paramColorFilter)
  {
    this.b.setColorFilter(paramColorFilter);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    this.b.setVisible(paramBoolean1, paramBoolean2);
    return bool;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     nqd
 * JD-Core Version:    0.7.0.1
 */
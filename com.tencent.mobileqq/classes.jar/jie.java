import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.tencent.av.AVLog;
import com.tencent.av.business.manager.pendant.EffectPendantTips;

public class jie
  implements Runnable
{
  public jie(EffectPendantTips paramEffectPendantTips, String paramString, int paramInt, Drawable paramDrawable) {}
  
  public void run()
  {
    try
    {
      String str = this.jdField_a_of_type_JavaLangString;
      if (!TextUtils.isEmpty(str))
      {
        AVLog.c("EffectPendantTips", "processTips showDrableTips");
        this.jdField_a_of_type_ComTencentAvBusinessManagerPendantEffectPendantTips.b(this.jdField_a_of_type_Int, this.jdField_a_of_type_AndroidGraphicsDrawableDrawable, str);
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     jie
 * JD-Core Version:    0.7.0.1
 */
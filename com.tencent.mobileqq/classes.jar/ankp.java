import android.view.View;
import android.widget.ImageView;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.image.URLDrawable;
import com.tencent.mobileqq.transfile.URLDrawableHelper;
import com.tencent.mobileqq.vas.VasApngUtil;
import dov.com.qq.im.capture.view.QIMCommonLoadingView;
import java.lang.ref.WeakReference;

class ankp
  implements Runnable
{
  ankp(anko paramanko, boolean paramBoolean) {}
  
  public void run()
  {
    ((QIMCommonLoadingView)this.jdField_a_of_type_Anko.jdField_a_of_type_JavaLangRefWeakReference.get()).setVisibility(8);
    ((ImageView)this.jdField_a_of_type_Anko.b.get()).setVisibility(0);
    if (this.jdField_a_of_type_Boolean)
    {
      URLDrawable localURLDrawable = VasApngUtil.a(BaseApplicationImpl.sApplication.getRuntime(), this.jdField_a_of_type_Anko.jdField_a_of_type_JavaLangString, "-Dynamic-", null, new int[] { 13 }, "-Dynamic-", null);
      if (localURLDrawable != null)
      {
        ((ImageView)this.jdField_a_of_type_Anko.b.get()).setImageDrawable(localURLDrawable);
        ((ImageView)this.jdField_a_of_type_Anko.b.get()).setTag(2131362361, Boolean.valueOf(true));
        if (localURLDrawable != null)
        {
          if (localURLDrawable.getStatus() != 1) {
            localURLDrawable.restartDownload();
          }
          if (localURLDrawable.getStatus() == 1) {
            this.jdField_a_of_type_Anko.jdField_a_of_type_Ankr.onLoadSuccessed((View)this.jdField_a_of_type_Anko.b.get(), localURLDrawable);
          }
          ((ImageView)this.jdField_a_of_type_Anko.b.get()).setImageDrawable(localURLDrawable);
        }
      }
      return;
    }
    ((ImageView)this.jdField_a_of_type_Anko.b.get()).setImageDrawable(URLDrawableHelper.a());
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     ankp
 * JD-Core Version:    0.7.0.1
 */
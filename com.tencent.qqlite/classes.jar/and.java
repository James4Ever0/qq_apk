import com.tencent.image.URLDrawable;
import com.tencent.image.URLDrawable.URLDrawableListener;
import com.tencent.mobileqq.activity.ForwardOperations;
import com.tencent.mobileqq.utils.ImageUtil;
import com.tencent.mobileqq.utils.QQCustomDialog;

class and
  implements URLDrawable.URLDrawableListener
{
  and(anc paramanc) {}
  
  public void onLoadCanceled(URLDrawable paramURLDrawable) {}
  
  public void onLoadFialed(URLDrawable paramURLDrawable, Throwable paramThrowable) {}
  
  public void onLoadProgressed(URLDrawable paramURLDrawable, int paramInt) {}
  
  public void onLoadSuccessed(URLDrawable paramURLDrawable)
  {
    paramURLDrawable.setBounds(ImageUtil.a(this.a.jdField_a_of_type_ComTencentImageURLDrawable, 36, 100, ForwardOperations.a(this.a.jdField_a_of_type_Ana.jdField_a_of_type_ComTencentMobileqqActivityForwardOperations)));
    this.a.jdField_a_of_type_Ana.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.setPreviewImage(paramURLDrawable);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     and
 * JD-Core Version:    0.7.0.1
 */
import com.tencent.biz.qqstory.storyHome.qqstorylist.autoplay.AutoPlayImageView;
import com.tencent.image.QQLiveDrawable;
import com.tencent.image.URLDrawable;
import com.tencent.image.URLDrawable.URLDrawableListener;

public class nzg
  implements URLDrawable.URLDrawableListener
{
  public nzg(AutoPlayImageView paramAutoPlayImageView) {}
  
  public void onLoadCanceled(URLDrawable paramURLDrawable) {}
  
  public void onLoadFialed(URLDrawable paramURLDrawable, Throwable paramThrowable) {}
  
  public void onLoadProgressed(URLDrawable paramURLDrawable, int paramInt) {}
  
  public void onLoadSuccessed(URLDrawable paramURLDrawable)
  {
    if (AutoPlayImageView.a(this.a) == 2) {
      if ((paramURLDrawable != null) && ((paramURLDrawable.getCurrDrawable() instanceof QQLiveDrawable))) {
        ((QQLiveDrawable)paramURLDrawable.getCurrDrawable()).pause();
      }
    }
    while ((AutoPlayImageView.a(this.a) != 3) || (paramURLDrawable == null) || (!(paramURLDrawable.getCurrDrawable() instanceof QQLiveDrawable))) {
      return;
    }
    ((QQLiveDrawable)paramURLDrawable.getCurrDrawable()).recyleAndKeepPostion();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     nzg
 * JD-Core Version:    0.7.0.1
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.biz.qqstory.storyHome.QQStoryMainController.QQStoryMainView;
import com.tencent.biz.qqstory.utils.AssertUtils;
import com.tencent.mobileqq.activity.Now;

public class tei
  implements QQStoryMainController.QQStoryMainView
{
  public tei(Now paramNow) {}
  
  public View a()
  {
    return this.a.jdField_b_of_type_AndroidWidgetRelativeLayout;
  }
  
  public ImageView a()
  {
    if (this.a.jdField_a_of_type_AndroidWidgetImageView != null) {}
    for (boolean bool = true;; bool = false)
    {
      AssertUtils.a(bool);
      return this.a.jdField_a_of_type_AndroidWidgetImageView;
    }
  }
  
  public TextView a()
  {
    if (this.a.c != null) {}
    for (boolean bool = true;; bool = false)
    {
      AssertUtils.a(bool);
      return this.a.c;
    }
  }
  
  public void a()
  {
    this.a.a();
  }
  
  public void a(String paramString)
  {
    this.a.jdField_a_of_type_AndroidWidgetTextView.setText(paramString);
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      Now.a(this.a);
      return;
    }
    Now.b(this.a);
  }
  
  public void b()
  {
    this.a.b(false);
  }
  
  public void b(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      this.a.jdField_b_of_type_AndroidWidgetTextView.setVisibility(i);
      return;
    }
  }
  
  public void c()
  {
    this.a.b(true);
  }
  
  public void d() {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     tei
 * JD-Core Version:    0.7.0.1
 */
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.biz.ui.CustomMenuBar.OnMenuItemClickListener;
import com.tencent.biz.ui.PopupMenu;

public class rm
  implements View.OnClickListener
{
  public rm(PopupMenu paramPopupMenu, String paramString, int paramInt) {}
  
  public void onClick(View paramView)
  {
    if (this.jdField_a_of_type_ComTencentBizUiPopupMenu.a != null) {
      this.jdField_a_of_type_ComTencentBizUiPopupMenu.a.a(this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_Int, 2);
    }
    paramView.post(new rn(this));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.2.jar\classes.jar
 * Qualified Name:     rm
 * JD-Core Version:    0.7.0.1
 */
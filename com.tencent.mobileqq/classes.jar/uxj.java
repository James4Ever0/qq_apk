import android.os.Handler;
import android.view.View;
import com.tencent.mobileqq.activity.aio.SessionInfo;
import com.tencent.mobileqq.activity.aio.item.FileVideoItemBuilder;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.MessageForFile;
import com.tencent.mobileqq.filemanager.core.FileManagerRSCenter;
import com.tencent.mobileqq.filemanager.data.FileManagerEntity;
import com.tencent.mobileqq.filemanager.util.FMToastUtil;
import com.tencent.mobileqq.filemanager.util.FileManagerUtil;
import com.tencent.widget.ActionSheet;
import com.tencent.widget.ActionSheet.OnButtonClickListener;

public class uxj
  implements ActionSheet.OnButtonClickListener
{
  public uxj(FileVideoItemBuilder paramFileVideoItemBuilder, MessageForFile paramMessageForFile, ActionSheet paramActionSheet) {}
  
  public void OnClick(View paramView, int paramInt)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqActivityAioItemFileVideoItemBuilder.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(this.jdField_a_of_type_ComTencentMobileqqDataMessageForFile.uniseq, this.jdField_a_of_type_ComTencentMobileqqActivityAioItemFileVideoItemBuilder.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_ComTencentMobileqqActivityAioItemFileVideoItemBuilder.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_Int, -1L) != -1) {
      this.jdField_a_of_type_ComTencentMobileqqActivityAioItemFileVideoItemBuilder.b.post(new uxk(this));
    }
    for (;;)
    {
      this.jdField_a_of_type_ComTencentWidgetActionSheet.cancel();
      return;
      paramView = FileManagerUtil.a(this.jdField_a_of_type_ComTencentMobileqqActivityAioItemFileVideoItemBuilder.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.jdField_a_of_type_ComTencentMobileqqDataMessageForFile);
      if (paramView.status == 16)
      {
        FMToastUtil.a(2131428188);
        this.jdField_a_of_type_ComTencentWidgetActionSheet.cancel();
        return;
      }
      this.jdField_a_of_type_ComTencentMobileqqDataMessageForFile.status = 1002;
      FileManagerUtil.a(this.jdField_a_of_type_ComTencentMobileqqActivityAioItemFileVideoItemBuilder.jdField_a_of_type_AndroidContentContext, paramView, this.jdField_a_of_type_ComTencentMobileqqActivityAioItemFileVideoItemBuilder.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, true);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     uxj
 * JD-Core Version:    0.7.0.1
 */
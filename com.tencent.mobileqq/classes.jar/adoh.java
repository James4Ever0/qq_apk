import android.view.View;
import com.tencent.mobileqq.filemanager.fileviewer.viewer.VideoFileViewer;
import com.tencent.widget.ActionSheet;
import com.tencent.widget.ActionSheet.OnButtonClickListener;
import java.util.List;

public class adoh
  implements ActionSheet.OnButtonClickListener
{
  public adoh(VideoFileViewer paramVideoFileViewer, List paramList) {}
  
  public void OnClick(View paramView, int paramInt)
  {
    VideoFileViewer.a(this.jdField_a_of_type_ComTencentMobileqqFilemanagerFileviewerViewerVideoFileViewer, this.jdField_a_of_type_JavaUtilList, paramInt, paramView);
    if (this.jdField_a_of_type_ComTencentMobileqqFilemanagerFileviewerViewerVideoFileViewer.a.isShowing()) {
      this.jdField_a_of_type_ComTencentMobileqqFilemanagerFileviewerViewerVideoFileViewer.a.dismiss();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     adoh
 * JD-Core Version:    0.7.0.1
 */
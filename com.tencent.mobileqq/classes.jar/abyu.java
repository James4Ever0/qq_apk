import com.tencent.mobileqq.emoticonview.BaseEmotionAdapter;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.ListView;
import java.util.List;

class abyu
  implements Runnable
{
  abyu(abyt paramabyt, List paramList) {}
  
  public void run()
  {
    int i = 1;
    QLog.d("EmotionPanelViewPagerAdapter", 1, "instantiateItem get data callback, panelType = " + this.jdField_a_of_type_Abyt.jdField_a_of_type_Int + ", panelInfo = " + this.jdField_a_of_type_Abyt.jdField_a_of_type_ComTencentMobileqqEmoticonviewEmotionPanelInfo);
    this.jdField_a_of_type_Abyt.jdField_a_of_type_ComTencentWidgetListView.setOnScrollListener(new abyv(this));
    if (this.jdField_a_of_type_Abyt.jdField_a_of_type_Int == 5) {}
    for (;;)
    {
      if ((this.jdField_a_of_type_JavaUtilList != null) && (this.jdField_a_of_type_JavaUtilList.size() > i)) {
        this.jdField_a_of_type_Abyt.jdField_a_of_type_ComTencentMobileqqEmoticonviewBaseEmotionAdapter.a(this.jdField_a_of_type_JavaUtilList);
      }
      return;
      i = 0;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     abyu
 * JD-Core Version:    0.7.0.1
 */
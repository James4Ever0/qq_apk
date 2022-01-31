import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.tencent.biz.qqstory.support.logging.SLog;
import com.tencent.biz.qqstory.support.report.VideoEditReport;
import com.tencent.biz.qqstory.takevideo.EditVideoFilter;
import com.tencent.biz.qqstory.takevideo.EditVideoFilter.FilterPagerAdapter;
import com.tencent.biz.qqstory.takevideo.EditVideoPartManager;
import com.tencent.biz.qqstory.takevideo.EditVideoPlayerExport;
import com.tencent.biz.qqstory.takevideo.filter.FilterData;
import com.tencent.biz.qqstory.takevideo.filter.FilterData.FilterPageItem;

public class ojb
  implements ViewPager.OnPageChangeListener
{
  private ojb(EditVideoFilter paramEditVideoFilter) {}
  
  public void onPageScrollStateChanged(int paramInt) {}
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    paramInt2 = 0;
    int i = paramInt1 % this.a.jdField_a_of_type_ComTencentBizQqstoryTakevideoEditVideoFilter$FilterPagerAdapter.a();
    Object localObject = this.a.jdField_a_of_type_ComTencentBizQqstoryTakevideoEditVideoFilter$FilterPagerAdapter.a(i);
    if (localObject != null) {}
    for (paramInt1 = ((FilterData)localObject).jdField_a_of_type_Int;; paramInt1 = 0)
    {
      localObject = this.a.jdField_a_of_type_ComTencentBizQqstoryTakevideoEditVideoFilter$FilterPagerAdapter.a((i + 1) % this.a.jdField_a_of_type_ComTencentBizQqstoryTakevideoEditVideoFilter$FilterPagerAdapter.a());
      if (localObject != null) {
        paramInt2 = ((FilterData)localObject).jdField_a_of_type_Int;
      }
      localObject = (EditVideoPlayerExport)this.a.a(EditVideoPlayerExport.class);
      if (localObject != null) {
        ((EditVideoPlayerExport)localObject).a(paramInt1, paramInt2, paramFloat);
      }
      return;
    }
  }
  
  public void onPageSelected(int paramInt)
  {
    Object localObject = this.a.jdField_a_of_type_ComTencentBizQqstoryTakevideoEditVideoFilter$FilterPagerAdapter.a(paramInt);
    if (localObject != null) {}
    for (int i = ((FilterData)localObject).jdField_a_of_type_Int;; i = 0)
    {
      this.a.jdField_a_of_type_AndroidUtilSparseArray.put(this.a.jdField_a_of_type_ComTencentBizQqstoryTakevideoEditVideoPartManager.a(), localObject);
      if ((i == 2) || (i == 1) || (i == 3))
      {
        localObject = this.a.jdField_a_of_type_ComTencentBizQqstoryTakevideoEditVideoFilter$FilterPagerAdapter.a(paramInt);
        if ((localObject != null) && (TextUtils.isEmpty(((FilterData.FilterPageItem)localObject).jdField_a_of_type_ComTencentBizQqstoryTakevideoFilterFilterData.b))) {
          EditVideoFilter.a((FilterData.FilterPageItem)localObject);
        }
      }
      localObject = this.a.jdField_a_of_type_ComTencentBizQqstoryTakevideoEditVideoFilter$FilterPagerAdapter.a(paramInt - 1);
      FilterData.FilterPageItem localFilterPageItem = this.a.jdField_a_of_type_ComTencentBizQqstoryTakevideoEditVideoFilter$FilterPagerAdapter.a(paramInt + 1);
      if (localObject != null) {
        ((FilterData.FilterPageItem)localObject).jdField_a_of_type_AndroidViewView.clearAnimation();
      }
      if (localFilterPageItem != null) {
        localFilterPageItem.jdField_a_of_type_AndroidViewView.clearAnimation();
      }
      this.a.jdField_a_of_type_Long = System.currentTimeMillis();
      this.a.jdField_a_of_type_Int = i;
      EditVideoFilter.a(this.a).put(this.a.jdField_a_of_type_ComTencentBizQqstoryTakevideoEditVideoPartManager.a(), paramInt);
      localObject = (EditVideoPlayerExport)this.a.a(EditVideoPlayerExport.class);
      if (localObject != null) {
        ((EditVideoPlayerExport)localObject).b(i);
      }
      if (i != 0)
      {
        this.a.jdField_a_of_type_ComTencentBizQqstoryTakevideoEditVideoPartManager.a("608", "9", "0", true);
        VideoEditReport.a("0X80076DE");
      }
      SLog.a("Q.qqstory.publish.edit.EditVideoFilter", "LastSelectVideoFilterTime : %s , LastSelectVideoPlayMode : %s .", Long.valueOf(this.a.jdField_a_of_type_Long), Integer.valueOf(this.a.jdField_a_of_type_Int));
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     ojb
 * JD-Core Version:    0.7.0.1
 */
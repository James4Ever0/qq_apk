import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.biz.pubaccount.readinjoy.model.IReadInJoyModel;
import com.tencent.biz.pubaccount.readinjoy.rebuild.FeedItemCellTypeTopicRecommendSmall;
import com.tencent.biz.pubaccount.readinjoy.view.ReadInJoyBaseAdapter;
import com.tencent.biz.pubaccount.readinjoy.view.ReadInJoyBaseAdapter.OnSubRegionClickListener;

public class lun
  implements View.OnClickListener
{
  public lun(FeedItemCellTypeTopicRecommendSmall paramFeedItemCellTypeTopicRecommendSmall) {}
  
  public void onClick(View paramView)
  {
    paramView = this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewReadInJoyBaseAdapter.a();
    if (paramView != null) {
      paramView.a(null, ((IReadInJoyModel)this.a.jdField_a_of_type_JavaLangObject).a(), 2);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     lun
 * JD-Core Version:    0.7.0.1
 */
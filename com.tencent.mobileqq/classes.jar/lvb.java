import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.biz.pubaccount.readinjoy.model.IReadInJoyModel;
import com.tencent.biz.pubaccount.readinjoy.rebuild.FeedItemCellTypeUgcVideo;
import com.tencent.biz.pubaccount.readinjoy.view.ReadInJoyBaseAdapter;
import com.tencent.biz.pubaccount.readinjoy.view.ReadInJoyBaseAdapter.OnSubRegionClickListener;

public class lvb
  implements View.OnClickListener
{
  public lvb(FeedItemCellTypeUgcVideo paramFeedItemCellTypeUgcVideo) {}
  
  public void onClick(View paramView)
  {
    ReadInJoyBaseAdapter.OnSubRegionClickListener localOnSubRegionClickListener = this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewReadInJoyBaseAdapter.a();
    if (localOnSubRegionClickListener != null) {
      localOnSubRegionClickListener.a(paramView, ((IReadInJoyModel)this.a.jdField_a_of_type_JavaLangObject).a(), 2);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     lvb
 * JD-Core Version:    0.7.0.1
 */
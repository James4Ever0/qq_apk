import android.view.View;
import com.tencent.mobileqq.nearby.now.utils.NowVideoReporter;
import com.tencent.mobileqq.nearby.profilecard.moment.BaseMomentItemBuilder;
import com.tencent.mobileqq.nearby.profilecard.moment.BaseMomentItemBuilder.MomentViewHolder;
import com.tencent.mobileqq.nearby.profilecard.moment.data.MomentFeedInfo;
import com.tencent.widget.ActionSheet;
import com.tencent.widget.ActionSheet.OnButtonClickListener;

public class afjp
  implements ActionSheet.OnButtonClickListener
{
  public afjp(BaseMomentItemBuilder paramBaseMomentItemBuilder, BaseMomentItemBuilder.MomentViewHolder paramMomentViewHolder, MomentFeedInfo paramMomentFeedInfo, ActionSheet paramActionSheet) {}
  
  public void OnClick(View paramView, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    }
    NowVideoReporter localNowVideoReporter = new NowVideoReporter().h("data_card").i("feed_delete").d("2").a(this.jdField_a_of_type_ComTencentMobileqqNearbyProfilecardMomentBaseMomentItemBuilder.a(this.jdField_a_of_type_ComTencentMobileqqNearbyProfilecardMomentBaseMomentItemBuilder$MomentViewHolder)).b(this.jdField_a_of_type_ComTencentMobileqqNearbyProfilecardMomentDataMomentFeedInfo.c).c(String.valueOf(this.jdField_a_of_type_ComTencentMobileqqNearbyProfilecardMomentBaseMomentItemBuilder.a(this.jdField_a_of_type_ComTencentMobileqqNearbyProfilecardMomentBaseMomentItemBuilder$MomentViewHolder)));
    if (this.jdField_a_of_type_ComTencentMobileqqNearbyProfilecardMomentBaseMomentItemBuilder.jdField_a_of_type_Boolean) {}
    for (paramView = "1";; paramView = "2")
    {
      localNowVideoReporter.e(paramView).b(this.jdField_a_of_type_ComTencentMobileqqNearbyProfilecardMomentBaseMomentItemBuilder.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface);
      BaseMomentItemBuilder.a(this.jdField_a_of_type_ComTencentMobileqqNearbyProfilecardMomentBaseMomentItemBuilder, this.jdField_a_of_type_ComTencentMobileqqNearbyProfilecardMomentBaseMomentItemBuilder$MomentViewHolder);
      this.jdField_a_of_type_ComTencentWidgetActionSheet.dismiss();
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     afjp
 * JD-Core Version:    0.7.0.1
 */
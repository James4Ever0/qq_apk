import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.QQBrowserActivity;
import com.tencent.mobileqq.search.ContentRecommendModel;
import com.tencent.mobileqq.search.ContentRecommendModel.ContentRecommendListAdapter;
import com.tencent.mobileqq.search.model.ContentRecommendDataModel.ContentRecommendItem;
import com.tencent.mobileqq.search.util.SearchUtils;

public class ahcp
  implements View.OnClickListener
{
  public ahcp(ContentRecommendModel.ContentRecommendListAdapter paramContentRecommendListAdapter, ahcq paramahcq) {}
  
  public void onClick(View paramView)
  {
    if (!TextUtils.isEmpty(this.jdField_a_of_type_Ahcq.a.h))
    {
      SearchUtils.a("home_page", "clk_rec_content", new String[] { this.jdField_a_of_type_Ahcq.a.a, String.valueOf(this.jdField_a_of_type_ComTencentMobileqqSearchContentRecommendModel$ContentRecommendListAdapter.a.jdField_a_of_type_Int) });
      paramView = new Intent(this.jdField_a_of_type_ComTencentMobileqqSearchContentRecommendModel$ContentRecommendListAdapter.a.jdField_a_of_type_AndroidContentContext, QQBrowserActivity.class);
      paramView.putExtra("url", this.jdField_a_of_type_Ahcq.a.h);
      this.jdField_a_of_type_ComTencentMobileqqSearchContentRecommendModel$ContentRecommendListAdapter.a.jdField_a_of_type_AndroidContentContext.startActivity(paramView);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     ahcp
 * JD-Core Version:    0.7.0.1
 */
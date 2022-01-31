package com.tencent.mobileqq.activity;

import SummaryCard.RespSearch;
import SummaryCard.SearchInfo;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import bim;
import bin;
import bio;
import com.qq.taf.jce.JceInputStream;
import com.tencent.biz.eqq.EnterpriseDetailActivity;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.widget.XListView;
import java.util.ArrayList;

public class SearchFriendListActivity
  extends IphoneTitleBarActivity
  implements View.OnClickListener
{
  public static final String a = "param_search_resp";
  private bin jdField_a_of_type_Bin;
  private FriendListObserver jdField_a_of_type_ComTencentMobileqqAppFriendListObserver = new bim(this);
  private XListView jdField_a_of_type_ComTencentWidgetXListView;
  private ArrayList jdField_a_of_type_JavaUtilArrayList;
  private byte[] jdField_a_of_type_ArrayOfByte;
  
  public void a(View paramView, int paramInt)
  {
    SearchInfo localSearchInfo = (SearchInfo)this.jdField_a_of_type_JavaUtilArrayList.get(paramInt);
    bio localbio = (bio)paramView.getTag();
    if (!TextUtils.isEmpty(localSearchInfo.strNick))
    {
      localbio.jdField_a_of_type_AndroidWidgetTextView.setText(localSearchInfo.strNick);
      if (localSearchInfo.eSource != 1) {
        break label186;
      }
      localbio.jdField_a_of_type_AndroidWidgetImageView.setImageDrawable(this.app.b(String.valueOf(localSearchInfo.lUIN)));
      localbio.b.setText("QQ号码: " + localSearchInfo.lUIN);
    }
    for (;;)
    {
      localbio.jdField_a_of_type_Int = paramInt;
      paramView.setContentDescription(localbio.jdField_a_of_type_AndroidWidgetTextView.getText());
      return;
      TextView localTextView = localbio.jdField_a_of_type_AndroidWidgetTextView;
      if (localSearchInfo.eSource == 1) {}
      for (String str = localSearchInfo.lUIN + "";; str = localSearchInfo.strMobile)
      {
        localTextView.setText(str);
        break;
      }
      label186:
      localbio.jdField_a_of_type_AndroidWidgetImageView.setImageDrawable(this.app.a(localSearchInfo.strMobile, (byte)3));
      localbio.b.setText("手机号码: " + localSearchInfo.strMobile);
    }
  }
  
  public boolean doOnCreate(Bundle paramBundle)
  {
    super.doOnCreate(paramBundle);
    setContentView(2130903603);
    d(2130837635);
    setTitle("搜索结果");
    this.jdField_a_of_type_ComTencentWidgetXListView = ((XListView)findViewById(2131298703));
    this.jdField_a_of_type_ComTencentWidgetXListView.setContentBackground(2130837635);
    addObserver(this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver);
    paramBundle = new JceInputStream(getIntent().getByteArrayExtra("param_search_resp"));
    RespSearch localRespSearch = new RespSearch();
    localRespSearch.readFrom(paramBundle);
    this.jdField_a_of_type_JavaUtilArrayList = localRespSearch.vRecords;
    this.jdField_a_of_type_ArrayOfByte = localRespSearch.vSecureSig;
    this.jdField_a_of_type_Bin = new bin(this, null);
    this.jdField_a_of_type_ComTencentWidgetXListView.setAdapter(this.jdField_a_of_type_Bin);
    return true;
  }
  
  protected void doOnDestroy()
  {
    removeObserver(this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver);
    super.doOnDestroy();
  }
  
  public void onClick(View paramView)
  {
    Object localObject = paramView.getTag();
    if (localObject != null)
    {
      if (!(localObject instanceof SearchInfo)) {
        break label123;
      }
      paramView = (SearchInfo)localObject;
      if (paramView.eSource != 1) {
        break label77;
      }
      paramView = AddFriendLogicActivity.a(this, 1, paramView.lUIN + "", null, 3001, 10004, paramView.strNick, null, null, null);
      startActivity(paramView);
    }
    label77:
    label123:
    while (!(localObject instanceof bio))
    {
      return;
      localObject = paramView.strMobile;
      if (paramView.bInContact == 1) {}
      for (int i = 3006;; i = 3014)
      {
        paramView = AddFriendLogicActivity.a(this, 2, (String)localObject, null, i, 10004, paramView.strNick, null, null, null);
        break;
      }
    }
    localObject = (bio)paramView.getTag();
    paramView = (SearchInfo)this.jdField_a_of_type_JavaUtilArrayList.get(((bio)localObject).jdField_a_of_type_Int);
    if (paramView.bIsEnterpriseQQ == 0)
    {
      AddFriendActivity.a(this, (SearchInfo)this.jdField_a_of_type_JavaUtilArrayList.get(((bio)localObject).jdField_a_of_type_Int), this.app.a(), this.jdField_a_of_type_ArrayOfByte, false);
      return;
    }
    localObject = new Intent(this, EnterpriseDetailActivity.class);
    ((Intent)localObject).putExtra("uin", String.valueOf(paramView.lUIN));
    startActivity((Intent)localObject);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     com.tencent.mobileqq.activity.SearchFriendListActivity
 * JD-Core Version:    0.7.0.1
 */
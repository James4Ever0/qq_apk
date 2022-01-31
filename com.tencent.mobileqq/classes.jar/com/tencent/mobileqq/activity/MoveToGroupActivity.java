package com.tencent.mobileqq.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.mobileqq.app.BabyQIPCModule;
import com.tencent.mobileqq.app.FriendListHandler;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.FriendsManager;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.Groups;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.mobileqq.widget.QQProgressDialog;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.XListView;
import java.util.List;
import tgp;
import tgq;
import tgr;

public class MoveToGroupActivity
  extends IphoneTitleBarActivity
  implements View.OnClickListener
{
  public byte a;
  private FriendListObserver jdField_a_of_type_ComTencentMobileqqAppFriendListObserver = new tgp(this);
  private QQProgressDialog jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog;
  private XListView jdField_a_of_type_ComTencentWidgetXListView;
  private String jdField_a_of_type_JavaLangString;
  public List a;
  private tgr jdField_a_of_type_Tgr;
  private boolean jdField_a_of_type_Boolean;
  private byte b;
  
  public MoveToGroupActivity()
  {
    this.jdField_a_of_type_JavaUtilList = null;
  }
  
  private void a()
  {
    QQProgressDialog localQQProgressDialog = new QQProgressDialog(this);
    this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog = localQQProgressDialog;
    localQQProgressDialog.b(getTitleBarHeight());
    localQQProgressDialog.show();
  }
  
  private void b()
  {
    if ((this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog != null) && (this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.isShowing()))
    {
      this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.dismiss();
      this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog = null;
    }
  }
  
  private void c()
  {
    Intent localIntent = getIntent();
    localIntent.putExtra("result", this.jdField_a_of_type_Byte);
    setResult(-1, localIntent);
    if (QLog.isColorLevel()) {
      QLog.d("IphoneTitleBarActivity", 2, "AIO_edit_category_move");
    }
    ReportController.b(this.app, "CliOper", "", "", "AIO", "AIO_edit_category_move", 0, 0, "", "", "", "");
    finish();
  }
  
  protected boolean doOnCreate(Bundle paramBundle)
  {
    super.doOnCreate(paramBundle);
    super.setContentView(2130969107);
    setTitle(getString(2131434557));
    paramBundle = (TextView)findViewById(2131363262);
    paramBundle.setContentDescription("返回好友管理");
    this.jdField_a_of_type_JavaLangString = getIntent().getExtras().getString("friendUin");
    this.jdField_a_of_type_Boolean = getIntent().getExtras().getBoolean("key_from_babyq_web_plugin", false);
    this.b = getIntent().getExtras().getByte("mgid");
    this.jdField_a_of_type_Byte = this.b;
    this.jdField_a_of_type_JavaUtilList = ((FriendsManager)this.app.getManager(50)).d();
    this.jdField_a_of_type_ComTencentWidgetXListView = ((XListView)findViewById(2131365200));
    this.jdField_a_of_type_Tgr = new tgr(this, null);
    this.jdField_a_of_type_ComTencentWidgetXListView.setAdapter(this.jdField_a_of_type_Tgr);
    paramBundle.setOnClickListener(new tgq(this));
    return true;
  }
  
  protected void doOnDestroy()
  {
    super.doOnDestroy();
    removeObserver(this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver);
    b();
    if (this.jdField_a_of_type_Boolean) {
      BabyQIPCModule.a().a();
    }
  }
  
  protected boolean onBackEvent()
  {
    c();
    return super.onBackEvent();
  }
  
  public void onClick(View paramView)
  {
    int i = ((Integer)paramView.getTag()).intValue();
    this.jdField_a_of_type_Byte = ((byte)((Groups)this.jdField_a_of_type_JavaUtilList.get(i)).group_id);
    if (this.jdField_a_of_type_Tgr != null) {
      this.jdField_a_of_type_Tgr.notifyDataSetChanged();
    }
    if (getIntent().getBooleanExtra("PARAM_EXECUTE_IMMEDIATELY", true))
    {
      if ((this.jdField_a_of_type_Byte >= 0) && (this.jdField_a_of_type_Byte != this.b))
      {
        if (NetworkUtil.d(this))
        {
          paramView = (FriendListHandler)this.app.a(1);
          addObserver(this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver);
          paramView.b(this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_Byte, this.b);
          a();
          return;
        }
        QQToast.a(this.app.getApp(), getString(2131434628), 1).b(getTitleBarHeight());
        finish();
        return;
      }
      if (this.jdField_a_of_type_Byte == this.b) {
        QQToast.a(this, getString(2131434532), 0).b(getTitleBarHeight());
      }
    }
    c();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     com.tencent.mobileqq.activity.MoveToGroupActivity
 * JD-Core Version:    0.7.0.1
 */
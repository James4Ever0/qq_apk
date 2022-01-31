package com.tencent.mobileqq.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import bod;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.troop.utils.TroopGagMgr;
import com.tencent.mobileqq.troop.utils.TroopGagMgr.GagCustomConfig;
import com.tencent.mobileqq.troop.utils.TroopGagMgr.GagItem;
import java.util.ArrayList;

public class TroopMemberGagActivity
  extends IphoneTitleBarActivity
  implements View.OnClickListener
{
  public static final String a = "TroopMemberGagActivity";
  public static final String b = "param_key_troopUin";
  public static final String c = "param_key_memberUin";
  public int a;
  Button jdField_a_of_type_AndroidWidgetButton;
  ListView jdField_a_of_type_AndroidWidgetListView;
  bod jdField_a_of_type_Bod;
  TroopMemberGagActivity.TroopGagDurationSettingDialog jdField_a_of_type_ComTencentMobileqqActivityTroopMemberGagActivity$TroopGagDurationSettingDialog;
  TroopMemberGagActivity.TroopGagListAdapter jdField_a_of_type_ComTencentMobileqqActivityTroopMemberGagActivity$TroopGagListAdapter;
  int b;
  int c;
  int jdField_d_of_type_Int;
  String jdField_d_of_type_JavaLangString;
  int jdField_e_of_type_Int;
  String jdField_e_of_type_JavaLangString;
  int f;
  int g;
  int h;
  
  private void c()
  {
    this.f = this.b;
    this.g = this.c;
    this.h = this.jdField_d_of_type_Int;
  }
  
  public boolean doOnCreate(Bundle paramBundle)
  {
    super.doOnCreate(paramBundle);
    setContentView(2130903687);
    setTitle(getString(2131362534));
    paramBundle = (TroopGagMgr)this.app.getManager(42);
    TroopGagMgr.GagCustomConfig localGagCustomConfig = paramBundle.a();
    if (localGagCustomConfig != null)
    {
      this.b = localGagCustomConfig.jdField_a_of_type_Int;
      this.c = localGagCustomConfig.b;
      this.jdField_d_of_type_Int = localGagCustomConfig.c;
      this.jdField_e_of_type_Int = localGagCustomConfig.jdField_d_of_type_Int;
    }
    paramBundle = paramBundle.a();
    this.jdField_a_of_type_Int = ((TroopGagMgr.GagItem)paramBundle.get(0)).jdField_a_of_type_Int;
    this.jdField_a_of_type_Bod = new bod(this);
    this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberGagActivity$TroopGagListAdapter = new TroopMemberGagActivity.TroopGagListAdapter(this, paramBundle, this.jdField_a_of_type_Bod);
    this.jdField_a_of_type_AndroidWidgetListView = ((ListView)findViewById(2131298908));
    this.jdField_a_of_type_AndroidWidgetListView.setAdapter(this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberGagActivity$TroopGagListAdapter);
    this.jdField_a_of_type_AndroidWidgetButton = ((Button)findViewById(2131298909));
    this.jdField_a_of_type_AndroidWidgetButton.setOnClickListener(this);
    paramBundle = getIntent();
    this.jdField_d_of_type_JavaLangString = paramBundle.getStringExtra("param_key_troopUin");
    this.jdField_e_of_type_JavaLangString = paramBundle.getStringExtra("param_key_memberUin");
    c();
    return true;
  }
  
  protected void doOnDestroy()
  {
    if ((this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberGagActivity$TroopGagDurationSettingDialog != null) && (this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberGagActivity$TroopGagDurationSettingDialog.isShowing())) {
      this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberGagActivity$TroopGagDurationSettingDialog.dismiss();
    }
    super.doOnDestroy();
  }
  
  public void onClick(View paramView)
  {
    paramView = (TroopGagMgr)this.app.getManager(42);
    ReportController.b(this.app, "P_CliOper", "Grp_manage", "", "silent_card", "Clk_complete", 0, 0, this.jdField_d_of_type_JavaLangString, this.jdField_a_of_type_Int + "", paramView.a(this.jdField_d_of_type_JavaLangString), "");
    paramView.a(this.jdField_d_of_type_JavaLangString, this.jdField_e_of_type_JavaLangString, this.jdField_a_of_type_Int);
    finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     com.tencent.mobileqq.activity.TroopMemberGagActivity
 * JD-Core Version:    0.7.0.1
 */
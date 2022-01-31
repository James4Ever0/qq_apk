package com.tencent.mobileqq.ark.setting;

import abfv;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.ark.API.ArkAppModuleReg.ModuleQQ;
import com.tencent.mobileqq.widget.FormSwitchItem;

public class ArkAuthorityInfoActivity
  extends IphoneTitleBarActivity
{
  private static final String[] jdField_a_of_type_ArrayOfJavaLangString = { "ark_authority_api_user_info", "ark_authority_api_location", "ark_authority_api_relationship", "ark_authority_api_login" };
  private String jdField_a_of_type_JavaLangString;
  
  protected boolean doOnCreate(Bundle paramBundle)
  {
    super.doOnCreate(paramBundle);
    setContentView(2130968706);
    super.setTitle(2131438842);
    this.jdField_a_of_type_JavaLangString = getIntent().getStringExtra("intent_extra_authority_app_name");
    ((TextView)super.findViewById(2131363320)).setText(getString(2131438844, new Object[] { this.jdField_a_of_type_JavaLangString }));
    int i = 0;
    while (i < jdField_a_of_type_ArrayOfJavaLangString.length)
    {
      paramBundle = (FormSwitchItem)super.findViewById(new int[] { 2131363321, 2131363322, 2131363323, 2131363324 }[i]);
      int j = ArkAppModuleReg.ModuleQQ.a(this.jdField_a_of_type_JavaLangString, jdField_a_of_type_ArrayOfJavaLangString[i], this.app.getCurrentAccountUin());
      if (j == 0)
      {
        paramBundle.setVisibility(8);
        i += 1;
      }
      else
      {
        paramBundle.setVisibility(0);
        if (1 == j) {}
        for (boolean bool = true;; bool = false)
        {
          paramBundle.setChecked(bool);
          paramBundle.setOnCheckedChangeListener(new abfv(this, i));
          break;
        }
      }
    }
    return true;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     com.tencent.mobileqq.ark.setting.ArkAuthorityInfoActivity
 * JD-Core Version:    0.7.0.1
 */
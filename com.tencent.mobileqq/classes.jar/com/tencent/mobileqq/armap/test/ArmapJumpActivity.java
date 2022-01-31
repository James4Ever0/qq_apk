package com.tencent.mobileqq.armap.test;

import abou;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import com.tencent.mobileqq.armap.ARMapBaseActivity;
import com.tencent.widget.immersive.SystemBarCompact;

public class ArmapJumpActivity
  extends ARMapBaseActivity
{
  View.OnClickListener jdField_a_of_type_AndroidViewView$OnClickListener = new abou(this);
  Button jdField_a_of_type_AndroidWidgetButton;
  public EditText a;
  public EditText b;
  public EditText c;
  
  protected boolean doOnCreate(Bundle paramBundle)
  {
    super.doOnCreate(paramBundle);
    if (this.mSystemBarComp != null)
    {
      int i = getResources().getColor(2131492924);
      this.mSystemBarComp.setStatusColor(i);
      this.mSystemBarComp.setStatusBarColor(i);
    }
    setContentView(2130970227);
    this.jdField_a_of_type_AndroidWidgetEditText = ((EditText)findViewById(2131369630));
    this.b = ((EditText)findViewById(2131369632));
    this.c = ((EditText)findViewById(2131369634));
    this.jdField_a_of_type_AndroidWidgetButton = ((Button)findViewById(2131369635));
    this.jdField_a_of_type_AndroidWidgetButton.setOnClickListener(this.jdField_a_of_type_AndroidViewView$OnClickListener);
    return true;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     com.tencent.mobileqq.armap.test.ArmapJumpActivity
 * JD-Core Version:    0.7.0.1
 */
package com.tencent.mobileqq.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import bay;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.pic.BaseStrategy;
import com.tencent.mobileqq.pic.PicPreDownloader;

public class PredownloadTest
  extends BaseActivity
{
  public static boolean a;
  Button a;
  public EditText a;
  public EditText b;
  public EditText c;
  public EditText d;
  public EditText e;
  public EditText f;
  
  static
  {
    jdField_a_of_type_Boolean = false;
  }
  
  private void c()
  {
    this.jdField_a_of_type_AndroidWidgetEditText = ((EditText)findViewById(2131298375));
    this.b = ((EditText)findViewById(2131298376));
    this.c = ((EditText)findViewById(2131298377));
    this.d = ((EditText)findViewById(2131298378));
    this.e = ((EditText)findViewById(2131298379));
    this.f = ((EditText)findViewById(2131298380));
    this.jdField_a_of_type_AndroidWidgetButton = ((Button)findViewById(2131298381));
    PredownloadTest.ConfigInfo localConfigInfo = this.app.a().a.a();
    this.jdField_a_of_type_AndroidWidgetEditText.setText(String.valueOf(localConfigInfo.a));
    this.b.setText(String.valueOf(localConfigInfo.b));
    this.c.setText(String.valueOf(localConfigInfo.c));
    this.d.setText(String.valueOf(localConfigInfo.d));
    this.e.setText(String.valueOf(localConfigInfo.e));
    this.f.setText(String.valueOf(localConfigInfo.f));
    this.jdField_a_of_type_AndroidWidgetButton.setOnClickListener(new bay(this));
  }
  
  public long a(EditText paramEditText)
  {
    try
    {
      long l = Long.valueOf(paramEditText.getText().toString()).longValue();
      return l;
    }
    catch (Exception paramEditText) {}
    return -1L;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903528);
    c();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     com.tencent.mobileqq.activity.PredownloadTest
 * JD-Core Version:    0.7.0.1
 */
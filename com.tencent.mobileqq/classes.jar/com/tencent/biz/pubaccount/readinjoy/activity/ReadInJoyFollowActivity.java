package com.tencent.biz.pubaccount.readinjoy.activity;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import bhvh;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import nth;
import nwd;
import qvn;

public class ReadInJoyFollowActivity
  extends IphoneTitleBarActivity
{
  public nth a;
  
  private void a()
  {
    ViewGroup localViewGroup = (ViewGroup)findViewById(2131374831);
    this.a = new nth(this);
    this.a.a(70);
    this.a.b(0);
    this.a.a(localViewGroup);
  }
  
  public void doOnActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (this.a != null) {
      this.a.a(paramInt1, paramInt2, paramIntent);
    }
    super.doOnActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public boolean doOnCreate(Bundle paramBundle)
  {
    super.doOnCreate(paramBundle);
    qvn.a().a(this);
    if (Build.VERSION.SDK_INT >= 11) {
      getWindow().setFlags(16777216, 16777216);
    }
    setContentView(2131559931);
    getWindow().setBackgroundDrawable(null);
    setClickableTitle("BB圈", new nwd(this));
    a();
    this.a.a();
    return true;
  }
  
  public void doOnDestroy()
  {
    super.doOnDestroy();
    this.a.d();
    qvn.a().b(this);
  }
  
  public void doOnPause()
  {
    super.doOnPause();
    this.a.g();
  }
  
  public void doOnResume()
  {
    super.doOnResume();
    this.a.h();
  }
  
  public void doOnStart()
  {
    super.doOnStart();
    bhvh.a(getAppRuntime());
    this.a.e();
  }
  
  public void doOnStop()
  {
    super.doOnStop();
    this.a.f();
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.a.c();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.biz.pubaccount.readinjoy.activity.ReadInJoyFollowActivity
 * JD-Core Version:    0.7.0.1
 */
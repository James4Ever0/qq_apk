package com.tencent.mobileqq.activity.qwallet;

import android.content.Intent;
import com.tencent.mobileqq.activity.QQTranslucentBrowserActivity;

public class QWalletFullWindowActivity
  extends QQTranslucentBrowserActivity
{
  public QWalletFullWindowActivity()
  {
    this.a = QWalletFullWindowActivity.QWalletFullWindowFragment.class;
  }
  
  protected void doOnPause()
  {
    super.doOnPause();
    sendBroadcast(new Intent("action_onpause"));
  }
  
  protected void doOnResume()
  {
    super.doOnResume();
    sendBroadcast(new Intent("action_onresume"));
  }
  
  public void onBackPressed()
  {
    sendBroadcast(new Intent("action_close_camera"));
  }
  
  public boolean showPreview()
  {
    boolean bool = super.showPreview();
    if (findViewById(2131363473) != null) {}
    return bool;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     com.tencent.mobileqq.activity.qwallet.QWalletFullWindowActivity
 * JD-Core Version:    0.7.0.1
 */
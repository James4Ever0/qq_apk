package com.tencent.token.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.token.global.e;

final class aax
  implements View.OnClickListener
{
  aax(SmsContentTipActivity paramSmsContentTipActivity) {}
  
  public final void onClick(View paramView)
  {
    e.c("removeTimeTask showProgressDialog");
    this.a.removeTimeTask(5);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.token\classes.jar
 * Qualified Name:     com.tencent.token.ui.aax
 * JD-Core Version:    0.7.0.1
 */
package com.tencent.token.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class fw
  implements View.OnClickListener
{
  fw(FaceRecognitionCameraActivity paramFaceRecognitionCameraActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = new Intent(this.a, StartPwdGestureForgetActivity.class);
    paramView.putExtra("startpwd_forget_source", 5);
    this.a.startActivity(paramView);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.token\classes.jar
 * Qualified Name:     com.tencent.token.ui.fw
 * JD-Core Version:    0.7.0.1
 */
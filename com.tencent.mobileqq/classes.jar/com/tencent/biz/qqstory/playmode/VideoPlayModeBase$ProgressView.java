package com.tencent.biz.qqstory.playmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class VideoPlayModeBase$ProgressView
  extends FrameLayout
{
  private ProgressBar jdField_a_of_type_AndroidWidgetProgressBar;
  private TextView jdField_a_of_type_AndroidWidgetTextView;
  
  public VideoPlayModeBase$ProgressView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public VideoPlayModeBase$ProgressView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    LayoutInflater.from(paramContext).inflate(2130970924, this);
    this.jdField_a_of_type_AndroidWidgetProgressBar = ((ProgressBar)findViewById(2131363010));
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131363651));
  }
  
  public void a(CharSequence paramCharSequence)
  {
    if ((paramCharSequence == null) || (paramCharSequence.length() <= 0))
    {
      this.jdField_a_of_type_AndroidWidgetTextView.setVisibility(8);
      return;
    }
    this.jdField_a_of_type_AndroidWidgetTextView.setVisibility(0);
    this.jdField_a_of_type_AndroidWidgetTextView.setText(paramCharSequence);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.biz.qqstory.playmode.VideoPlayModeBase.ProgressView
 * JD-Core Version:    0.7.0.1
 */
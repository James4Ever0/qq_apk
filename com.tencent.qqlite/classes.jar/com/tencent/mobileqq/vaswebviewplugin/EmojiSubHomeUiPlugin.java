package com.tencent.mobileqq.vaswebviewplugin;

import com.tencent.mobileqq.activity.QQBrowserActivity;

public class EmojiSubHomeUiPlugin
  extends EmojiUiPlugin
{
  public void OnActivityCreate()
  {
    this.mActivityType = 3;
    super.OnActivityCreate();
    if (!checkOncreateParam(getInfoIntent())) {
      this.activity.finish();
    }
  }
  
  protected long getPluginBusiness()
  {
    return 4L;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     com.tencent.mobileqq.vaswebviewplugin.EmojiSubHomeUiPlugin
 * JD-Core Version:    0.7.0.1
 */
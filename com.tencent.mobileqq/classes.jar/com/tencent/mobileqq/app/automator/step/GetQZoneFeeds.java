package com.tencent.mobileqq.app.automator.step;

import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.automator.AsyncStep;
import com.tencent.mobileqq.app.automator.Automator;
import com.tencent.mobileqq.qzonestatus.QzoneContactsFeedManager;
import com.tencent.mobileqq.startup.step.InstallPlugins;
import cooperation.qzone.plugin.QZonePluginManager;

public class GetQZoneFeeds
  extends AsyncStep
{
  public static boolean a;
  
  protected int a()
  {
    jdField_a_of_type_Boolean = true;
    ((QzoneContactsFeedManager)this.jdField_a_of_type_ComTencentMobileqqAppAutomatorAutomator.b.getManager(90)).a();
    ((QZonePluginManager)this.jdField_a_of_type_ComTencentMobileqqAppAutomatorAutomator.b.getManager(174)).b();
    InstallPlugins.a(1);
    InstallPlugins.a();
    return super.a();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     com.tencent.mobileqq.app.automator.step.GetQZoneFeeds
 * JD-Core Version:    0.7.0.1
 */
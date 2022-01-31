package com.tencent.av.app;

import android.content.Context;
import android.content.IntentFilter;
import jfi;
import mqq.app.MobileQQ;

public class GScreenActionMonitor
{
  private VideoAppInterface jdField_a_of_type_ComTencentAvAppVideoAppInterface;
  private jfi jdField_a_of_type_Jfi;
  
  public GScreenActionMonitor(VideoAppInterface paramVideoAppInterface)
  {
    this.jdField_a_of_type_ComTencentAvAppVideoAppInterface = paramVideoAppInterface;
  }
  
  public void a()
  {
    try
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
      localIntentFilter.addAction("android.intent.action.SCREEN_ON");
      localIntentFilter.addAction("android.intent.action.USER_PRESENT");
      localIntentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
      this.jdField_a_of_type_Jfi = new jfi();
      if (this.jdField_a_of_type_ComTencentAvAppVideoAppInterface != null) {
        this.jdField_a_of_type_ComTencentAvAppVideoAppInterface.getApplication().getApplicationContext().registerReceiver(this.jdField_a_of_type_Jfi, localIntentFilter);
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
  }
  
  public void b()
  {
    try
    {
      if ((this.jdField_a_of_type_ComTencentAvAppVideoAppInterface != null) && (this.jdField_a_of_type_Jfi != null)) {
        this.jdField_a_of_type_ComTencentAvAppVideoAppInterface.getApplication().getApplicationContext().unregisterReceiver(this.jdField_a_of_type_Jfi);
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.av.app.GScreenActionMonitor
 * JD-Core Version:    0.7.0.1
 */
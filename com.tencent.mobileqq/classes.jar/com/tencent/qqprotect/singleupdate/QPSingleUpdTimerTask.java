package com.tencent.qqprotect.singleupdate;

import alye;
import com.tencent.mobileqq.app.ThreadManager;
import java.util.TimerTask;

public class QPSingleUpdTimerTask
  extends TimerTask
{
  public void run()
  {
    ThreadManager.post(new alye(this), 5, null, true);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     com.tencent.qqprotect.singleupdate.QPSingleUpdTimerTask
 * JD-Core Version:    0.7.0.1
 */
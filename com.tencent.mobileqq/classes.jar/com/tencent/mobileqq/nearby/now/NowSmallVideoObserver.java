package com.tencent.mobileqq.nearby.now;

import com.tencent.mobileqq.app.BusinessObserver;

public class NowSmallVideoObserver
  implements BusinessObserver
{
  public void a(boolean paramBoolean, String paramString) {}
  
  public void onUpdate(int paramInt, boolean paramBoolean, Object paramObject)
  {
    switch (paramInt)
    {
    }
    do
    {
      return;
    } while (!paramBoolean);
    paramObject = (Object[])paramObject;
    a(((Boolean)paramObject[0]).booleanValue(), (String)paramObject[1]);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     com.tencent.mobileqq.nearby.now.NowSmallVideoObserver
 * JD-Core Version:    0.7.0.1
 */
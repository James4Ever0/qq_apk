package com.tencent.biz.pubaccount.subscript;

import com.tencent.mobileqq.app.BusinessObserver;
import java.util.ArrayList;
import java.util.List;

public class SubscriptObserver
  implements BusinessObserver
{
  public void a(boolean paramBoolean, ArrayList paramArrayList) {}
  
  public void a(boolean paramBoolean, List paramList) {}
  
  public void onUpdate(int paramInt, boolean paramBoolean, Object paramObject)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 1: 
      if (paramObject != null) {
        try
        {
          a(paramBoolean, (ArrayList)paramObject);
          return;
        }
        catch (Exception paramObject)
        {
          return;
        }
      }
      a(false, new ArrayList(0));
      return;
    }
    if (paramObject != null) {
      try
      {
        a(paramBoolean, (ArrayList)paramObject);
        return;
      }
      catch (Exception paramObject)
      {
        return;
      }
    }
    a(false, new ArrayList(0));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.biz.pubaccount.subscript.SubscriptObserver
 * JD-Core Version:    0.7.0.1
 */
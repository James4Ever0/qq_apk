package com.tencent.biz.pubaccount.readinjoy.video;

import android.app.Activity;
import android.os.Handler;
import android.view.OrientationEventListener;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.qphone.base.util.QLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import lyq;
import lyr;
import lys;
import lyt;

public class OrientationDetector
{
  public static final String a;
  private int jdField_a_of_type_Int = 1;
  private Activity jdField_a_of_type_AndroidAppActivity;
  private volatile OrientationEventListener jdField_a_of_type_AndroidViewOrientationEventListener;
  private Object jdField_a_of_type_JavaLangObject = new Object();
  private HashMap jdField_a_of_type_JavaUtilHashMap;
  private lyt jdField_a_of_type_Lyt;
  private boolean jdField_a_of_type_Boolean;
  
  static
  {
    jdField_a_of_type_JavaLangString = "Q.readinjoy.video." + OrientationDetector.class.getSimpleName();
  }
  
  public OrientationDetector(Activity paramActivity, OrientationDetector.OnOrientationChangedListener paramOnOrientationChangedListener)
  {
    this.jdField_a_of_type_AndroidAppActivity = paramActivity;
    ThreadManager.executeOnSubThread(new lyq(this, paramActivity));
    this.jdField_a_of_type_JavaUtilHashMap = new HashMap();
    synchronized (this.jdField_a_of_type_JavaLangObject)
    {
      this.jdField_a_of_type_AndroidViewOrientationEventListener = new lyr(this, paramActivity, paramOnOrientationChangedListener);
      this.jdField_a_of_type_Lyt = new lyt(this, new Handler());
      this.jdField_a_of_type_Lyt.a();
      this.jdField_a_of_type_Boolean = VideoFeedsHelper.a(this.jdField_a_of_type_AndroidAppActivity);
      a(this.jdField_a_of_type_Boolean);
      return;
    }
  }
  
  private void a(boolean paramBoolean)
  {
    ThreadManager.executeOnSubThread(new lys(this, paramBoolean));
  }
  
  private boolean a(int paramInt)
  {
    if ((paramInt >= 70) && (paramInt <= 110)) {
      paramInt = 1;
    }
    for (;;)
    {
      long l = System.currentTimeMillis();
      this.jdField_a_of_type_JavaUtilHashMap.put(Integer.valueOf(paramInt), Long.valueOf(l));
      Iterator localIterator = this.jdField_a_of_type_JavaUtilHashMap.entrySet().iterator();
      Map.Entry localEntry;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localEntry = (Map.Entry)localIterator.next();
      } while ((((Integer)localEntry.getKey()).intValue() == paramInt) || (l - ((Long)localEntry.getValue()).longValue() >= 200L));
      return false;
      if ((paramInt >= 250) && (paramInt <= 290)) {
        paramInt = 2;
      } else {
        paramInt = 0;
      }
    }
    return true;
  }
  
  public void a()
  {
    a(false);
    synchronized (this.jdField_a_of_type_JavaLangObject)
    {
      this.jdField_a_of_type_AndroidViewOrientationEventListener = null;
      this.jdField_a_of_type_Lyt.b();
      this.jdField_a_of_type_Lyt = null;
      return;
    }
  }
  
  public boolean a(boolean paramBoolean)
  {
    if (this.jdField_a_of_type_AndroidViewOrientationEventListener == null) {}
    do
    {
      return false;
      if (!paramBoolean) {
        break;
      }
      if (this.jdField_a_of_type_Boolean)
      {
        a(true);
        return true;
      }
    } while (!QLog.isColorLevel());
    QLog.w(jdField_a_of_type_JavaLangString, 2, "mRotateSettingSwitch is false : enable failure");
    return false;
    a(false);
    return true;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.biz.pubaccount.readinjoy.video.OrientationDetector
 * JD-Core Version:    0.7.0.1
 */
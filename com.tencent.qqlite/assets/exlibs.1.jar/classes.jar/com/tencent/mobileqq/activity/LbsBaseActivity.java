package com.tencent.mobileqq.activity;

import android.app.Dialog;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import arr;
import ars;
import art;
import aru;
import arv;
import arw;
import arx;
import ary;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import java.lang.reflect.Field;

public class LbsBaseActivity
  extends IphoneTitleBarActivity
{
  protected static final int a = 10;
  private Dialog a;
  private Dialog b;
  private Dialog c;
  
  private boolean c()
  {
    LocationManager localLocationManager = (LocationManager)this.app.a().getSystemService("location");
    try
    {
      bool = localLocationManager.isProviderEnabled("gps");
      if (QLog.isColorLevel()) {
        QLog.i("LBS", 2, "GPS Open " + bool);
      }
      return bool;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        boolean bool = false;
      }
    }
  }
  
  private void e(Runnable paramRunnable)
  {
    if (!c())
    {
      g(paramRunnable);
      return;
    }
    paramRunnable.run();
  }
  
  private void f(Runnable paramRunnable)
  {
    paramRunnable.run();
  }
  
  private boolean f()
  {
    return this.app.n();
  }
  
  private void g(Runnable paramRunnable)
  {
    if (this.a == null)
    {
      this.a = a(17039380, 2131363202, 2131364497, 2131363209, new art(this), new aru(this));
      this.a.setOnDismissListener(new arv(this, paramRunnable));
    }
    c();
    this.a.show();
  }
  
  private void h(Runnable paramRunnable)
  {
    paramRunnable = new arw(this, paramRunnable);
    this.b = a(2131363205, a(), 2131363210, 2131363209, new arx(this), new ary(this));
    this.b.setOnDismissListener(paramRunnable);
    this.b.show();
  }
  
  protected int a()
  {
    return 2131363206;
  }
  
  protected Dialog a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View.OnClickListener paramOnClickListener1, View.OnClickListener paramOnClickListener2)
  {
    Object localObject2 = getResources().getString(paramInt1);
    Object localObject1 = getResources().getString(paramInt2);
    String str2 = getResources().getString(paramInt3);
    String str1 = getResources().getString(paramInt4);
    Dialog localDialog = new Dialog(this, 2131624119);
    localDialog.setContentView(2130903135);
    TextView localTextView = (TextView)localDialog.findViewById(2131296911);
    if (localTextView != null)
    {
      localTextView.setText((CharSequence)localObject2);
      localTextView.setContentDescription((CharSequence)localObject2);
    }
    localObject2 = (TextView)localDialog.findViewById(2131296470);
    if (localObject2 != null)
    {
      ((TextView)localObject2).setText((CharSequence)localObject1);
      ((TextView)localObject2).setContentDescription((CharSequence)localObject1);
    }
    localObject1 = (TextView)localDialog.findViewById(2131296914);
    if (localObject1 != null)
    {
      ((TextView)localObject1).setText(str2);
      ((TextView)localObject1).setContentDescription(str2);
      ((TextView)localObject1).setOnClickListener(paramOnClickListener1);
    }
    paramOnClickListener1 = (TextView)localDialog.findViewById(2131296915);
    if (paramOnClickListener1 != null)
    {
      paramOnClickListener1.setText(str1);
      paramOnClickListener1.setContentDescription(str1);
      paramOnClickListener1.setOnClickListener(paramOnClickListener2);
    }
    return localDialog;
  }
  
  public void a() {}
  
  public void a(int paramInt1, int paramInt2)
  {
    if (isResume()) {
      QQToast.a(this, paramInt1, getResources().getString(paramInt2), 0).b(getTitleBarHeight());
    }
  }
  
  protected void a(int paramInt, String paramString)
  {
    if (isResume()) {
      QQToast.a(this, paramInt, paramString, 0).b(getTitleBarHeight());
    }
  }
  
  protected void a(Runnable paramRunnable)
  {
    f(paramRunnable);
  }
  
  protected int b()
  {
    try
    {
      int i = ((Integer)Class.forName("com.android.internal.R$id").getField("title_container").get(null)).intValue();
      i = ((ViewGroup)getWindow().findViewById(i)).getBottom();
      return i;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return 0;
  }
  
  public void b() {}
  
  protected void b(Runnable paramRunnable)
  {
    if (f())
    {
      f(paramRunnable);
      return;
    }
    h(paramRunnable);
  }
  
  protected void c() {}
  
  protected void c(Runnable paramRunnable)
  {
    if (f()) {
      f(paramRunnable);
    }
  }
  
  public void d()
  {
    finish();
  }
  
  protected void d(Runnable paramRunnable)
  {
    this.c = a(2131363203, 2131363204, 2131362794, 2131363211, new arr(this), new ars(this, paramRunnable));
    this.c.show();
  }
  
  public boolean doOnCreate(Bundle paramBundle)
  {
    super.doOnCreate(paramBundle);
    return true;
  }
  
  public void doOnDestroy()
  {
    if ((this.a != null) && (this.a.isShowing())) {
      this.a.dismiss();
    }
    if ((this.b != null) && (this.b.isShowing())) {
      this.b.dismiss();
    }
    if ((this.c != null) && (this.c.isShowing())) {
      this.c.dismiss();
    }
    super.doOnDestroy();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     com.tencent.mobileqq.activity.LbsBaseActivity
 * JD-Core Version:    0.7.0.1
 */
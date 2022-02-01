import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.mobileqq.search.rich.ArkAppView;
import com.tencent.qphone.base.util.QLog;

public class bbrp
  extends bbry
  implements bbrq
{
  private static bbrg jdField_a_of_type_Bbrg = new bbrg();
  private int jdField_a_of_type_Int = 0;
  private bbrk jdField_a_of_type_Bbrk;
  private bbrl jdField_a_of_type_Bbrl;
  
  public bbrp(bbrk parambbrk)
  {
    this.jdField_a_of_type_Bbrk = parambbrk;
    if ((this.jdField_a_of_type_Bbrk != null) && (QLog.isColorLevel())) {
      QLog.d("ArkRichNode", 2, "id:" + this.jdField_a_of_type_Bbrk.a() + " appname:" + this.jdField_a_of_type_Bbrk.b() + " viewname:" + this.jdField_a_of_type_Bbrk.d() + " miniversion:" + this.jdField_a_of_type_Bbrk.c() + " path：" + this.jdField_a_of_type_Bbrk.a());
    }
  }
  
  public int a()
  {
    return this.jdField_a_of_type_Int;
  }
  
  public bbrl a()
  {
    return this.jdField_a_of_type_Bbrl;
  }
  
  public bbrt a(Context paramContext)
  {
    if (this.jdField_a_of_type_Bbrk == null)
    {
      if (QLog.isColorLevel()) {
        QLog.d("ArkRichNode", 2, "onCreate config = null");
      }
      return null;
    }
    bbrn localbbrn = new bbrn(this, paramContext);
    localbbrn.a(this);
    localbbrn.a(paramContext);
    jdField_a_of_type_Bbrg.a(this);
    this.jdField_a_of_type_Bbrl = new bbrl(jdField_a_of_type_Bbrg);
    String str = a();
    this.jdField_a_of_type_Bbrl.a(this.jdField_a_of_type_Bbrk, str, paramContext.getResources().getDisplayMetrics().scaledDensity);
    this.jdField_a_of_type_Bbrl.setFixSize(-1, -1);
    int i = paramContext.getResources().getDisplayMetrics().widthPixels;
    this.jdField_a_of_type_Bbrl.setMaxSize(i, -1);
    this.jdField_a_of_type_Bbrl.setMinSize(i, -1);
    localbbrn.a(this.jdField_a_of_type_Bbrl);
    this.jdField_a_of_type_Bbrl.activateView(true);
    return localbbrn;
  }
  
  public void a()
  {
    if (QLog.isColorLevel()) {
      QLog.d("ArkRichNode", 2, "onDestroy");
    }
    if (jdField_a_of_type_Bbrg != null) {
      jdField_a_of_type_Bbrg.b(this);
    }
    if (this.jdField_a_of_type_Bbrl != null)
    {
      this.jdField_a_of_type_Bbrl.doOnEvent(2);
      this.jdField_a_of_type_Bbrl.a();
      this.jdField_a_of_type_Bbrl = null;
    }
    this.jdField_a_of_type_Bbrk = null;
  }
  
  public void a(int paramInt)
  {
    this.jdField_a_of_type_Int = paramInt;
    e();
  }
  
  public void a(String paramString)
  {
    if (QLog.isColorLevel()) {
      QLog.d("ArkRichNode", 2, "onSetTalkBackText:" + paramString);
    }
    if (TextUtils.isEmpty(paramString)) {}
    StringBuilder localStringBuilder;
    do
    {
      bbrt localbbrt;
      do
      {
        do
        {
          return;
          localbbrt = a();
        } while (localbbrt == null);
        localStringBuilder = new StringBuilder();
        localStringBuilder.append(paramString);
        paramString = localbbrt.a();
        if (paramString != null) {
          paramString.setContentDescription(localStringBuilder);
        }
      } while (!(localbbrt instanceof bbrn));
      paramString = ((bbrn)localbbrt).b();
    } while (!(paramString instanceof ArkAppView));
    ((ArkAppView)paramString).setContentDescription(localStringBuilder);
  }
  
  public void a(String paramString1, String paramString2)
  {
    if (QLog.isColorLevel()) {
      QLog.d("ArkRichNode", 2, "onNotifyEvent, key:" + paramString1 + " value:" + paramString2);
    }
    b(paramString1, paramString2);
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    super.a(paramString1, paramString2, paramString3);
    if (this.jdField_a_of_type_Bbrl != null) {
      this.jdField_a_of_type_Bbrl.updateMetaData(a());
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.jdField_a_of_type_Bbrl != null) {
      this.jdField_a_of_type_Bbrl.activateView(paramBoolean);
    }
  }
  
  public int b()
  {
    return 2;
  }
  
  public void b()
  {
    super.b();
    if (this.jdField_a_of_type_Bbrl != null) {
      this.jdField_a_of_type_Bbrl.doOnEvent(0);
    }
  }
  
  public void c()
  {
    super.c();
    if (this.jdField_a_of_type_Bbrl != null) {
      this.jdField_a_of_type_Bbrl.doOnEvent(1);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     bbrp
 * JD-Core Version:    0.7.0.1
 */
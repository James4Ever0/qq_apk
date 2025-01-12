package com.tencent.mobileqq.search.ftsentity;

import acdu;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import aqgv;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.persistence.fts.FTSEntity;
import com.tencent.qphone.base.util.QLog;
import java.util.List;
import wja;

public class FTSEntitySearchDetailActivity
  extends IphoneTitleBarActivity
{
  private static List<FTSEntity> FQ;
  private List<FTSEntity> FP;
  public int dCD;
  
  public static void a(Context paramContext, String paramString1, String paramString2, CharSequence paramCharSequence, List<? extends FTSEntity> paramList, int paramInt1, String paramString3, int paramInt2)
  {
    FQ = paramList;
    paramList = new Intent(paramContext, FTSEntitySearchDetailActivity.class);
    paramList.putExtra("original_keyword", paramString1);
    paramList.putExtra("segment_keyword", paramString2);
    paramList.putExtra("title", paramCharSequence);
    paramList.putExtra("extra_key_fts_type", paramInt1);
    paramList.putExtra("uin", paramString3);
    paramList.putExtra("uinType", paramInt2);
    paramContext.startActivity(paramList);
  }
  
  void b(String paramString1, String paramString2, TextView paramTextView)
  {
    if (paramString1 == null)
    {
      if (QLog.isColorLevel()) {
        QLog.d("IphoneTitleBarActivity", 2, "genDiscussTitle, name == null");
      }
      return;
    }
    int i = ((acdu)this.app.getManager(53)).cn(paramString2);
    if (i <= 0)
    {
      paramTextView.setText(paramString1);
      return;
    }
    int j = getResources().getDisplayMetrics().widthPixels;
    paramString2 = (RelativeLayout.LayoutParams)((View)paramTextView.getParent()).getLayoutParams();
    int k = wja.dp2px(207.0F, getResources());
    TextPaint localTextPaint = paramTextView.getPaint();
    float f2 = j - k - localTextPaint.measureText(String.format("(%d人)", new Object[] { Integer.valueOf(i) })) - 4.0F * getResources().getDisplayMetrics().density;
    String str = paramString1;
    float f1;
    float f3;
    if (f2 > 0.0F)
    {
      f1 = localTextPaint.measureText(paramString1);
      str = paramString1;
      if (f1 > f2)
      {
        f3 = f2 - localTextPaint.measureText("…");
        paramString2 = paramString1;
      }
    }
    for (;;)
    {
      if ((f3 > 0.0F) && (f1 > f3) && (paramString2.length() > 0))
      {
        paramString2 = paramString2.substring(0, paramString2.length() - 1);
        f2 = localTextPaint.measureText(paramString2);
        f1 = f2;
        if (f2 == 0.0F)
        {
          f1 = f2;
          if (paramString2.length() > 0) {
            f1 = 1.0F + f3;
          }
        }
        if (QLog.isColorLevel()) {
          QLog.d("IphoneTitleBarActivity", 2, "genDiscussTitle : name widht = " + f1);
        }
      }
      else
      {
        str = paramString1;
        if (f3 > 0.0F)
        {
          str = paramString1;
          if (paramString2.length() > 0) {
            str = paramString2 + "…";
          }
        }
        paramTextView.setText(String.format("%s(%d人)", new Object[] { str, Integer.valueOf(i) }));
        return;
      }
    }
  }
  
  public boolean doOnCreate(Bundle paramBundle)
  {
    super.doOnCreate(paramBundle);
    this.FP = FQ;
    this.dCD = getIntent().getIntExtra("extra_key_fts_type", 0);
    setContentView(2131559029);
    paramBundle = getIntent().getStringExtra("uin");
    int i = getIntent().getIntExtra("uinType", -1);
    if (i == 3000) {
      b(aqgv.d(this.app, paramBundle, i), paramBundle, this.centerView);
    }
    for (;;)
    {
      Object localObject = super.getSupportFragmentManager();
      paramBundle = FTSEntitySearchDetailFragment.a(getIntent().getStringExtra("original_keyword"), getIntent().getStringExtra("segment_keyword"), this.FP);
      localObject = ((FragmentManager)localObject).beginTransaction();
      ((FragmentTransaction)localObject).replace(2131365379, paramBundle);
      ((FragmentTransaction)localObject).commit();
      return true;
      super.setTitle(aqgv.d(this.app, paramBundle, i));
    }
  }
  
  public void doOnDestroy()
  {
    super.doOnDestroy();
    FQ = null;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.tim\classes9.jar
 * Qualified Name:     com.tencent.mobileqq.search.ftsentity.FTSEntitySearchDetailActivity
 * JD-Core Version:    0.7.0.1
 */
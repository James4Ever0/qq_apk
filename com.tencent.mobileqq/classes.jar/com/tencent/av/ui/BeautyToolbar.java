package com.tencent.av.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.tencent.av.SessionMgr;
import com.tencent.av.VideoController;
import com.tencent.av.app.SessionInfo;
import com.tencent.av.app.VideoAppInterface;
import com.tencent.av.gaudio.AVNotifyCenter;
import com.tencent.av.opengl.effects.EffectController;
import com.tencent.av.utils.TipsManager;
import com.tencent.av.widget.BidirectionSeekBar;
import com.tencent.mobileqq.utils.AudioHelper;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import java.lang.ref.WeakReference;
import jrh;
import jri;

public class BeautyToolbar
  extends BaseToolbar
{
  static final String TAG = "BeautyToolbar";
  RelativeLayout mBeautySeekBar = null;
  public int mBeautyValue = 0;
  int mBeautyValueInit = 0;
  public Context mContext = null;
  private VideoControlUI mControlUI;
  public boolean mIs1stShow = false;
  boolean mIsShown = false;
  SeekBar.OnSeekBarChangeListener mOnSeekBarChangeListener = new jrh(this);
  public BidirectionSeekBar mSeek = null;
  int mThumbWidth;
  public Drawable mThumb_0;
  public Drawable mThumb_100;
  public Drawable mThumb_30;
  public Drawable mThumb_60;
  TextView mTip;
  int mTipLayoutMargin;
  LinearLayout.LayoutParams mTipLayoutParams;
  BaseToolbar.UIInfo mUIInfo = null;
  
  public BeautyToolbar(VideoAppInterface paramVideoAppInterface, AVActivity paramAVActivity)
  {
    super(paramVideoAppInterface, paramAVActivity);
  }
  
  public void applyBeautyValue(int paramInt)
  {
    this.mApp.a().a(this.mContext.getApplicationContext()).a(paramInt);
  }
  
  protected BaseToolbar.UIInfo getUIInfo()
  {
    if (this.mUIInfo == null)
    {
      this.mUIInfo = new BaseToolbar.UIInfo();
      this.mUIInfo.d = 4;
      this.mUIInfo.g = 2130969359;
      this.mUIInfo.e = 103415;
      this.mUIInfo.f = 2130840120;
      this.mUIInfo.a = this.mApp.getApp().getResources().getString(2131428724);
    }
    return this.mUIInfo;
  }
  
  public String getUnableInfo()
  {
    if (this.mActivity.get() != null) {
      return ((AVActivity)this.mActivity.get()).getResources().getString(2131428731);
    }
    return "";
  }
  
  public boolean isEffectBtnEnable()
  {
    return AVNotifyCenter.e(this.mApp.getCurrentAccountUin());
  }
  
  protected void onCreate(AVActivity paramAVActivity)
  {
    this.mBeautySeekBar = ((RelativeLayout)this.toolbarView.findViewById(2131366250));
    this.mSeek = ((BidirectionSeekBar)this.toolbarView.findViewById(2131366253));
    this.mTip = ((TextView)this.toolbarView.findViewById(2131366252));
    this.mTipLayoutParams = null;
    this.mContext = paramAVActivity;
    this.mThumb_0 = this.mContext.getResources().getDrawable(2130840087);
    this.mThumb_30 = this.mContext.getResources().getDrawable(2130840089);
    this.mThumb_60 = this.mContext.getResources().getDrawable(2130840090);
    this.mThumb_100 = this.mContext.getResources().getDrawable(2130840088);
    this.mSeek.setMax(100);
    this.mSeek.setOnSeekBarChangeListener(this.mOnSeekBarChangeListener);
    this.mSeek.getViewTreeObserver().addOnGlobalLayoutListener(new jri(this));
    if ((paramAVActivity instanceof AVActivity)) {
      this.mControlUI = paramAVActivity.jdField_a_of_type_ComTencentAvUiVideoControlUI;
    }
    if (AudioHelper.a(0) == 1)
    {
      this.toolbarView.setBackgroundColor(-16711936);
      this.toolbarView.findViewById(2131366250).setBackgroundColor(-256);
      this.toolbarView.findViewById(2131366251).setBackgroundColor(-16711681);
      this.toolbarView.findViewById(2131366253).setBackgroundColor(-65281);
    }
  }
  
  protected void onDestroy(VideoAppInterface paramVideoAppInterface)
  {
    super.onDestroy(paramVideoAppInterface);
    AVNotifyCenter.a(this.mApp.getCurrentAccountUin(), this.mBeautyValue);
  }
  
  public void onHide()
  {
    this.mBeautySeekBar.setVisibility(8);
    this.mIsShown = false;
    AVNotifyCenter.a(this.mApp.getCurrentAccountUin(), this.mBeautyValue);
    if (this.mBeautyValue > 0)
    {
      SessionInfo localSessionInfo = SessionMgr.a().a();
      if (localSessionInfo != null) {
        localSessionInfo.s = true;
      }
    }
    this.mControlUI.ad();
  }
  
  public void onShow(int paramInt, boolean paramBoolean)
  {
    AVNotifyCenter.f(this.mApp.getCurrentAccountUin());
    this.mBeautySeekBar.setVisibility(0);
    this.mIsShown = true;
    this.mIs1stShow = true;
    paramInt = AVNotifyCenter.b(this.mApp.getCurrentAccountUin());
    this.mBeautyValueInit = paramInt;
    this.mBeautyValue = paramInt;
    if (this.mBeautyValue == -1)
    {
      this.mBeautyValue = AVNotifyCenter.e;
      this.mBeautyValueInit = 0;
    }
    applyBeautyValue(this.mBeautyValue);
    this.mSeek.setProgress(this.mBeautyValue);
    this.mSeek.setContentDescription(this.mContext.getResources().getString(2131429254));
    this.mControlUI.z();
    Object localObject = VideoController.a().a(((AVActivity)this.mActivity.get()).getApplicationContext());
    if (localObject != null)
    {
      if (QLog.isDevelopLevel()) {
        QLog.d("EffectSettingUi", 1, "onShow clear state");
      }
      ((EffectController)localObject).b();
      if ((this.mContext instanceof AVActivity))
      {
        localObject = (AVActivity)this.mContext;
        ((AVActivity)localObject).jdField_a_of_type_ComTencentAvUtilsTipsManager.i();
        ((AVActivity)localObject).jdField_a_of_type_ComTencentAvUtilsTipsManager.f();
      }
    }
  }
  
  int process2beautyLevel(int paramInt)
  {
    return (paramInt + 9) / 10;
  }
  
  public void updateTip(int paramInt)
  {
    if (this.mTipLayoutParams == null)
    {
      this.mTipLayoutParams = ((LinearLayout.LayoutParams)this.mTip.getLayoutParams());
      this.mThumbWidth = this.mThumb_60.getIntrinsicWidth();
      this.mTipLayoutMargin = (((LinearLayout.LayoutParams)this.mSeek.getLayoutParams()).leftMargin + this.mThumbWidth / 2);
    }
    int i = this.mTip.getWidth();
    int j = this.mSeek.getWidth();
    this.mTipLayoutParams.leftMargin = (this.mTipLayoutMargin - i / 2 + (j - this.mThumbWidth) * paramInt / 100);
    this.mTip.requestLayout();
    this.mTip.setText(this.mContext.getResources().getString(2131429254) + paramInt + "%");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.av.ui.BeautyToolbar
 * JD-Core Version:    0.7.0.1
 */
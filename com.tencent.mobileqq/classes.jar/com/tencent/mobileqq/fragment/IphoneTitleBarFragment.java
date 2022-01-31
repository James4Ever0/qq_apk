package com.tencent.mobileqq.fragment;

import advc;
import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.common.config.AppSetting;
import com.tencent.mobileqq.utils.DeviceInfoUtil;
import com.tencent.mobileqq.widget.navbar.NavBarCommon;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.immersive.ImmersiveUtils;

@TargetApi(11)
public abstract class IphoneTitleBarFragment
  extends PublicBaseFragment
{
  public static final String HIDE_TITLE_LEFT_ARROW = "hide_title_left_arrow";
  public static final int LAYER_TYPE_SOFTWARE = 1;
  protected static final String TAG = "IphoneTitleBarFragment";
  private Drawable ad;
  public TextView centerView;
  private boolean isRightHighlightButton;
  public TextView leftView;
  public TextView leftViewNotBack;
  public View mContentView;
  public float mDensity;
  public ImageView mLeftBackIcon;
  public TextView mLeftBackText;
  private RelativeLayout mLoadingParent;
  private ImageView mLoadingView;
  private Drawable[] mOldDrawables;
  private int mOldPadding;
  public View mTitleContainer;
  protected boolean mUseOptimizMode;
  protected View.OnClickListener onBackListener = new advc(this);
  public TextView rightHighLView;
  public ImageView rightViewImg;
  public TextView rightViewText;
  public RelativeLayout titleRoot;
  public NavBarCommon vg;
  
  public static void setLayerType(View paramView)
  {
    if (paramView == null) {
      return;
    }
    paramView.setLayerType(0, null);
  }
  
  public void doOnCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, Bundle paramBundle) {}
  
  protected void enableRightHighlight(boolean paramBoolean)
  {
    if ((this.rightHighLView == null) || (!this.isRightHighlightButton)) {
      return;
    }
    if (paramBoolean)
    {
      this.rightViewText.setVisibility(8);
      this.rightHighLView.setVisibility(0);
      return;
    }
    this.rightViewText.setVisibility(0);
    this.rightHighLView.setVisibility(8);
  }
  
  public abstract int getContentLayoutId();
  
  public View getRightTextView()
  {
    this.rightViewText = ((TextView)this.titleRoot.findViewById(2131363447));
    setLayerType(this.rightViewText);
    return this.rightViewText;
  }
  
  public View getTitleBarView()
  {
    return this.titleRoot.findViewById(2131363261);
  }
  
  public void hideTitleBar()
  {
    try
    {
      this.mTitleContainer = this.titleRoot.findViewById(2131363261);
      this.mTitleContainer.setVisibility(8);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (!QLog.isColorLevel()) {}
      QLog.e("IphoneTitleBarFragment", 2, localThrowable, new Object[0]);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    if (getActivity() == null) {}
    do
    {
      return;
      ((FrameLayout)getActivity().findViewById(16908290)).setForeground(getResources().getDrawable(2130845954));
      if ((isTransparent()) && (needImmersive()) && (needStatusTrans()))
      {
        ViewParent localViewParent = getActivity().findViewById(16908310).getParent();
        if ((localViewParent != null) && ((localViewParent instanceof FrameLayout))) {
          ((FrameLayout)localViewParent).setVisibility(8);
        }
      }
    } while (this.leftView != null);
    this.vg = ((NavBarCommon)this.titleRoot.findViewById(2131363261));
    onCreateLeftView();
    try
    {
      if ((paramBundle.getBoolean("hide_title_left_arrow", false)) && (this.leftView != null)) {
        this.leftView.setBackgroundDrawable(null);
      }
      onCreateCenterView();
      onCreateRightView();
      setLeftViewName(paramBundle);
      return;
    }
    catch (Exception paramBundle)
    {
      QLog.d("IphoneTitleBarFragment", 1, "", paramBundle);
    }
  }
  
  public boolean isTitleProgressShowing()
  {
    if ((this.mUseOptimizMode) && (this.mLoadingParent != null))
    {
      if ((this.mLoadingView == null) || (this.mLoadingView.getVisibility() == 8)) {}
    }
    else {
      while (this.ad != null) {
        return true;
      }
    }
    return false;
  }
  
  protected boolean isTransparent()
  {
    return false;
  }
  
  public boolean onBackEvent()
  {
    if (getActivity() != null) {
      getActivity().finish();
    }
    return false;
  }
  
  protected View onCreateCenterView()
  {
    this.centerView = ((TextView)this.titleRoot.findViewById(2131363400));
    return this.centerView;
  }
  
  protected View onCreateLeftView()
  {
    this.leftView = ((TextView)this.titleRoot.findViewById(2131363262));
    this.leftView.setOnClickListener(this.onBackListener);
    this.mLeftBackText = ((TextView)this.titleRoot.findViewById(2131364020));
    this.mLeftBackIcon = ((ImageView)this.titleRoot.findViewById(2131364019));
    if ((this.mLeftBackText != null) && (this.mLeftBackIcon != null))
    {
      this.mLeftBackText.setOnClickListener(this.onBackListener);
      this.mLeftBackIcon.setOnClickListener(this.onBackListener);
    }
    return this.leftView;
  }
  
  protected View onCreateRightView()
  {
    this.rightViewText = ((TextView)this.titleRoot.findViewById(2131363447));
    this.rightViewImg = ((ImageView)this.titleRoot.findViewById(2131363493));
    setLayerType(this.rightViewText);
    setLayerType(this.rightViewImg);
    return this.rightViewText;
  }
  
  @TargetApi(14)
  @Nullable
  public final View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView1 = paramLayoutInflater.inflate(2130968841, paramViewGroup, false);
    try
    {
      View localView2 = paramLayoutInflater.inflate(getContentLayoutId(), (ViewGroup)localView1, false);
      this.titleRoot = ((RelativeLayout)localView1.findViewById(2131364044));
      if (ImmersiveUtils.isSupporImmersive() == 1)
      {
        this.titleRoot.setFitsSystemWindows(true);
        this.titleRoot.setPadding(0, ImmersiveUtils.a(paramLayoutInflater.getContext()), 0, 0);
      }
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
      localLayoutParams.addRule(3, 2131363261);
      this.titleRoot.addView(localView2, localLayoutParams);
      this.mContentView = localView2;
    }
    catch (InflateException localInflateException)
    {
      for (;;)
      {
        if (QLog.isColorLevel()) {
          QLog.w("IphoneTitleBarFragment", 2, "create view error ", localInflateException);
        }
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        localRuntimeException.printStackTrace();
      }
    }
    if (this.mTitleContainer != null) {
      this.mTitleContainer.setVisibility(0);
    }
    this.mDensity = getResources().getDisplayMetrics().density;
    init(getArguments());
    doOnCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    return localView1;
  }
  
  @TargetApi(11)
  public void removeWebViewLayerType()
  {
    if (Build.VERSION.SDK_INT == 16) {
      this.vg.setLayerType(0, null);
    }
  }
  
  public void resetLeftButton()
  {
    if (this.leftViewNotBack != null) {
      this.leftViewNotBack.setVisibility(8);
    }
    setLayerType(this.leftView);
    this.leftView.setVisibility(0);
  }
  
  public void setLeftButton(int paramInt, View.OnClickListener paramOnClickListener)
  {
    this.leftView.setVisibility(8);
    this.leftViewNotBack = ((TextView)this.titleRoot.findViewById(2131363492));
    setLayerType(this.leftViewNotBack);
    this.leftViewNotBack.setVisibility(0);
    this.leftViewNotBack.setText(paramInt);
    if (paramOnClickListener == null)
    {
      this.leftViewNotBack.setOnClickListener(this.onBackListener);
      return;
    }
    this.leftViewNotBack.setOnClickListener(paramOnClickListener);
  }
  
  public void setLeftButton(String paramString, View.OnClickListener paramOnClickListener)
  {
    this.leftView.setVisibility(8);
    this.leftViewNotBack = ((TextView)this.titleRoot.findViewById(2131363492));
    setLayerType(this.leftViewNotBack);
    this.leftViewNotBack.setVisibility(0);
    this.leftViewNotBack.setText(paramString);
    if (paramOnClickListener == null)
    {
      this.leftViewNotBack.setOnClickListener(this.onBackListener);
      return;
    }
    this.leftViewNotBack.setOnClickListener(paramOnClickListener);
  }
  
  public void setLeftViewName(int paramInt)
  {
    this.vg.setLeftViewName(paramInt);
  }
  
  public void setLeftViewName(Bundle paramBundle)
  {
    this.vg.setLeftViewName(paramBundle);
  }
  
  public void setRightButton(int paramInt, View.OnClickListener paramOnClickListener)
  {
    this.isRightHighlightButton = false;
    this.rightViewText.setVisibility(0);
    this.rightViewText.setText(paramInt);
    this.rightViewText.setEnabled(true);
    if (paramOnClickListener != null) {
      this.rightViewText.setOnClickListener(paramOnClickListener);
    }
    if (AppSetting.b) {
      this.rightViewText.setContentDescription(this.rightViewText.getText() + "按钮");
    }
  }
  
  protected void setRightHighlightButton(int paramInt, View.OnClickListener paramOnClickListener)
  {
    this.isRightHighlightButton = true;
    if (this.rightViewText != null)
    {
      this.rightViewText.setVisibility(0);
      this.rightViewText.setText(paramInt);
      this.rightViewText.setEnabled(false);
      this.rightHighLView = ((TextView)LayoutInflater.from(getActivity()).inflate(2130968844, null));
      setLayerType(this.rightHighLView);
      this.rightHighLView.setText(paramInt);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams.addRule(11, 1);
      localLayoutParams.addRule(15, 1);
      localLayoutParams.rightMargin = ((int)(8.0F * this.mDensity));
      this.vg.addView(this.rightHighLView, localLayoutParams);
      this.rightHighLView.setVisibility(8);
      if (paramOnClickListener != null) {
        this.rightHighLView.setOnClickListener(paramOnClickListener);
      }
    }
  }
  
  @TargetApi(11)
  public void setRightViewTextDisable(int paramInt)
  {
    if (paramInt == 0)
    {
      this.rightViewText.setEnabled(false);
      this.rightViewText.setAlpha(0.5F);
      return;
    }
    this.rightViewText.setEnabled(true);
    this.rightViewText.setAlpha(1.0F);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.vg.setTitle(paramCharSequence);
  }
  
  public void setTitle(CharSequence paramCharSequence, String paramString)
  {
    this.vg.setTitle(paramCharSequence, paramString);
  }
  
  public boolean startTitleProgress()
  {
    if ((this.centerView == null) || (getActivity() == null)) {
      return false;
    }
    Object localObject1;
    if (this.mUseOptimizMode)
    {
      localObject1 = (RelativeLayout)this.titleRoot.findViewById(2131363399);
      if (this.centerView.getVisibility() == 0)
      {
        localObject1 = this.centerView;
        localObject2 = this.centerView.getParent();
        if ((this.mLoadingParent != null) && (this.mLoadingParent != localObject2))
        {
          if ((this.mLoadingView != null) && (this.mLoadingView.getParent() == this.mLoadingParent))
          {
            this.mLoadingParent.removeView(this.mLoadingView);
            this.mLoadingView = null;
          }
          this.mLoadingParent = null;
        }
        if ((this.mLoadingParent == null) && ((localObject2 instanceof RelativeLayout))) {
          this.mLoadingParent = ((RelativeLayout)localObject2);
        }
        localObject2 = localObject1;
        if (localObject1 != null)
        {
          localObject2 = localObject1;
          if (this.mLoadingView != null)
          {
            int i = ((View)localObject1).getId();
            RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.mLoadingView.getLayoutParams();
            localObject2 = localObject1;
            if (localLayoutParams.getRules()[0] != i)
            {
              localObject2 = (RelativeLayout.LayoutParams)((View)localObject1).getLayoutParams();
              ((RelativeLayout.LayoutParams)localObject2).rightMargin = 0;
              ((RelativeLayout.LayoutParams)localObject2).leftMargin = 0;
              ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
              localLayoutParams.addRule(0, i);
              this.mLoadingView.setLayoutParams(localLayoutParams);
            }
          }
        }
      }
    }
    for (Object localObject2 = localObject1;; localObject2 = null)
    {
      if ((this.mUseOptimizMode) && (this.mLoadingParent != null))
      {
        if ((this.mLoadingView != null) && (this.mLoadingView.getVisibility() == 0)) {
          break label534;
        }
        if (this.mLoadingView == null)
        {
          localObject1 = (RelativeLayout.LayoutParams)((View)localObject2).getLayoutParams();
          ((RelativeLayout.LayoutParams)localObject1).rightMargin = 0;
          ((RelativeLayout.LayoutParams)localObject1).leftMargin = 0;
          ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
          this.mLoadingView = new ImageView(getActivity());
          this.mLoadingView.setId(2131365713);
          localObject1 = new RelativeLayout.LayoutParams(-2, -2);
          ((RelativeLayout.LayoutParams)localObject1).addRule(0, ((View)localObject2).getId());
          ((RelativeLayout.LayoutParams)localObject1).addRule(15);
          ((RelativeLayout.LayoutParams)localObject1).rightMargin = ((int)(7.0F * DeviceInfoUtil.a()));
          this.mLoadingParent.addView(this.mLoadingView, (ViewGroup.LayoutParams)localObject1);
          localObject1 = getActivity().getResources().getDrawable(2130838604);
          this.mLoadingView.setImageDrawable((Drawable)localObject1);
          if ((localObject1 instanceof Animatable)) {
            ((Animatable)localObject1).start();
          }
        }
        if (this.mLoadingView.getVisibility() != 0) {
          this.mLoadingView.setVisibility(0);
        }
        return true;
        if ((localObject1 == null) || (((RelativeLayout)localObject1).getVisibility() != 0)) {
          break label536;
        }
        localObject2 = ((RelativeLayout)localObject1).getParent();
        break;
      }
      if (this.ad == null)
      {
        this.ad = getResources().getDrawable(2130838604);
        this.mOldDrawables = this.centerView.getCompoundDrawables();
        this.mOldPadding = this.centerView.getCompoundDrawablePadding();
        this.centerView.setCompoundDrawablePadding(10);
        this.centerView.setCompoundDrawablesWithIntrinsicBounds(this.ad, this.mOldDrawables[1], this.mOldDrawables[2], this.mOldDrawables[3]);
        ((Animatable)this.ad).start();
        return true;
      }
      label534:
      return false;
      label536:
      localObject2 = null;
      localObject1 = null;
      break;
    }
  }
  
  public boolean stopTitleProgress()
  {
    if ((this.mUseOptimizMode) && (this.mLoadingParent != null))
    {
      if ((this.mLoadingView != null) && (this.mLoadingView.getVisibility() != 8))
      {
        this.mLoadingView.setVisibility(8);
        return true;
      }
    }
    else if (this.ad != null)
    {
      ((Animatable)this.ad).stop();
      this.ad = null;
      this.centerView.setCompoundDrawablePadding(this.mOldPadding);
      this.centerView.setCompoundDrawablesWithIntrinsicBounds(this.mOldDrawables[0], this.mOldDrawables[1], this.mOldDrawables[2], this.mOldDrawables[3]);
      return true;
    }
    return false;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     com.tencent.mobileqq.fragment.IphoneTitleBarFragment
 * JD-Core Version:    0.7.0.1
 */
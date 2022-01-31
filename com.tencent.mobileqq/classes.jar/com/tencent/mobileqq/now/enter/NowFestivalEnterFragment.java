package com.tencent.mobileqq.now.enter;

import agem;
import agen;
import ageo;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.tencent.mobileqq.activity.QQBrowserActivity;
import com.tencent.mobileqq.activity.qwallet.widget.ImmersionBar;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManagerV2;
import com.tencent.mobileqq.fragment.PublicBaseFragment;
import com.tencent.mobileqq.now.enter.widget.NowAnswerPreloadManager;
import com.tencent.mobileqq.statistics.ReportTask;
import com.tencent.mobileqq.webprocess.WebProcessManager;
import com.tencent.qphone.base.util.QLog;

public class NowFestivalEnterFragment
  extends PublicBaseFragment
  implements View.OnClickListener
{
  private long jdField_a_of_type_Long;
  private FragmentActivity jdField_a_of_type_AndroidSupportV4AppFragmentActivity;
  private View jdField_a_of_type_AndroidViewView;
  private TextView jdField_a_of_type_AndroidWidgetTextView;
  private QQAppInterface jdField_a_of_type_ComTencentMobileqqAppQQAppInterface;
  private NowEnterManager.WebProcessBindCallback jdField_a_of_type_ComTencentMobileqqNowEnterNowEnterManager$WebProcessBindCallback = new agen(this);
  private String jdField_a_of_type_JavaLangString;
  private boolean jdField_a_of_type_Boolean;
  private boolean b;
  private boolean c;
  private boolean d;
  
  private void a()
  {
    if (this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity.isFinishing()) {
      return;
    }
    ThreadManagerV2.excute(new ageo(this), 16, null, true);
  }
  
  public boolean needImmersive()
  {
    return false;
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity = ((FragmentActivity)paramActivity);
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity.app;
  }
  
  public boolean onBackEvent()
  {
    new ReportTask(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface).a("dc00899").b("Grp_AIO").c("year_icon").d("middle_click").a(new String[] { "2" }).a();
    return super.onBackEvent();
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    paramView = new Intent();
    paramView.putExtra("url", this.jdField_a_of_type_JavaLangString);
    paramView.putExtra("is_need_zoom_in_anim", false);
    paramView.setClass(this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity, QQBrowserActivity.class);
    paramView.putExtra("fragment_class", NowFestivalWebViewFragment.class.getCanonicalName());
    this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity.startActivity(paramView);
    this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity.overridePendingTransition(0, 0);
    this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity.finish();
    new ReportTask(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface).a("dc00899").b("Grp_AIO").c("year_icon").d("middle_click").a(new String[] { "1" }).a();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130969142, paramViewGroup, false);
    paramViewGroup = paramLayoutInflater.findViewById(2131362859);
    if (paramViewGroup != null) {
      new ImmersionBar(this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity, 0, paramViewGroup);
    }
    this.jdField_a_of_type_AndroidViewView = paramLayoutInflater.findViewById(2131362860);
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)paramLayoutInflater.findViewById(2131362861));
    this.jdField_a_of_type_AndroidWidgetTextView.setOnClickListener(this);
    paramViewGroup = ObjectAnimator.ofFloat(this.jdField_a_of_type_AndroidViewView, "scaleX", new float[] { 0.7F, 1.0F });
    paramBundle = ObjectAnimator.ofFloat(this.jdField_a_of_type_AndroidViewView, "scaleY", new float[] { 0.7F, 1.0F });
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.setInterpolator(new DecelerateInterpolator());
    localAnimatorSet.setDuration(400L);
    localAnimatorSet.play(paramViewGroup).with(paramBundle);
    localAnimatorSet.start();
    this.jdField_a_of_type_JavaLangString = this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity.getIntent().getStringExtra("url");
    NowAnswerPreloadManager.a(new agem(this));
    NowAnswerPreloadManager.a(true);
    ((NowEnterManager)this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity.app.getManager(264)).a(this.jdField_a_of_type_ComTencentMobileqqNowEnterNowEnterManager$WebProcessBindCallback);
    new ReportTask(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface).a("dc00899").b("Grp_AIO").c("year_icon").d("middle_view").a();
    return paramLayoutInflater;
  }
  
  public void onDestroyView()
  {
    ((NowEnterManager)this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity.app.getManager(264)).b(this.jdField_a_of_type_ComTencentMobileqqNowEnterNowEnterManager$WebProcessBindCallback);
    super.onDestroyView();
  }
  
  public void onResume()
  {
    super.onResume();
    if (!this.jdField_a_of_type_Boolean)
    {
      this.jdField_a_of_type_Boolean = true;
      ((WebProcessManager)this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity.app.getManager(12)).e();
      this.jdField_a_of_type_Long = System.currentTimeMillis();
      if (QLog.isColorLevel()) {
        QLog.i("NowFestivalEnterFragment", 2, "preStartWebProcess, startTime=" + this.jdField_a_of_type_Long);
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     com.tencent.mobileqq.now.enter.NowFestivalEnterFragment
 * JD-Core Version:    0.7.0.1
 */
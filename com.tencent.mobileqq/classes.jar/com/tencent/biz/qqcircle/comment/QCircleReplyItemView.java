package com.tencent.biz.qqcircle.comment;

import aaak;
import aaam;
import aajo;
import aakb;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.TextView;
import anzj;
import com.tencent.biz.qqcircle.events.QCircleCommentPraiseUpdateEvent;
import com.tencent.biz.qqcircle.launchbean.QCircleInitBean;
import com.tencent.biz.qqcircle.report.QCircleReportBean;
import com.tencent.biz.qqcircle.widgets.QCircleAsyncTextView;
import com.tencent.biz.qqcircle.widgets.QCircleAvatarView;
import com.tencent.biz.qqcircle.widgets.QCircleBaseWidgetView;
import com.tencent.biz.qqcircle.widgets.QCircleCommentPraiseLayout;
import com.tencent.biz.richframework.eventbus.SimpleBaseEvent;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;
import com.tencent.qqlive.module.videoreport.collect.EventCollector;
import com.tencent.widget.immersive.ImmersiveUtils;
import feedcloud.FeedCloudMeta.StComment;
import feedcloud.FeedCloudMeta.StFeed;
import feedcloud.FeedCloudMeta.StLike;
import feedcloud.FeedCloudMeta.StReply;
import feedcloud.FeedCloudMeta.StUser;
import java.util.ArrayList;
import uyx;
import uzg;
import vbc;
import vkt;
import vku;
import vkv;

public class QCircleReplyItemView
  extends QCircleBaseWidgetView<vbc>
  implements aaam, View.OnClickListener, View.OnLongClickListener
{
  private int jdField_a_of_type_Int;
  private aakb jdField_a_of_type_Aakb;
  private Drawable jdField_a_of_type_AndroidGraphicsDrawableDrawable;
  private TextView jdField_a_of_type_AndroidWidgetTextView;
  private QCircleAsyncTextView jdField_a_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView;
  private QCircleAvatarView jdField_a_of_type_ComTencentBizQqcircleWidgetsQCircleAvatarView;
  private QCircleCommentPraiseLayout jdField_a_of_type_ComTencentBizQqcircleWidgetsQCircleCommentPraiseLayout;
  private FeedCloudMeta.StComment jdField_a_of_type_FeedcloudFeedCloudMeta$StComment;
  private FeedCloudMeta.StFeed jdField_a_of_type_FeedcloudFeedCloudMeta$StFeed;
  private FeedCloudMeta.StReply jdField_a_of_type_FeedcloudFeedCloudMeta$StReply;
  private final String jdField_a_of_type_JavaLangString = anzj.a(2131712292);
  private vbc jdField_a_of_type_Vbc;
  private int jdField_b_of_type_Int;
  private Drawable jdField_b_of_type_AndroidGraphicsDrawableDrawable;
  private QCircleAsyncTextView jdField_b_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView;
  private Drawable c;
  
  public QCircleReplyItemView(@NonNull Context paramContext)
  {
    super(paramContext);
  }
  
  private void a()
  {
    this.jdField_a_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView.setOnClickListener(this);
    this.jdField_b_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView.setOnClickListener(this);
    this.jdField_a_of_type_ComTencentBizQqcircleWidgetsQCircleAvatarView.setOnClickListener(this);
    setOnClickListener(this);
    this.jdField_b_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView.setOnLongClickListener(this);
    setOnLongClickListener(this);
  }
  
  private void a(FeedCloudMeta.StComment paramStComment, FeedCloudMeta.StReply paramStReply)
  {
    if (this.jdField_a_of_type_FeedcloudFeedCloudMeta$StFeed == null) {
      return;
    }
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    if ((paramStComment != null) && (paramStReply.targetUser != null) && (!TextUtils.isEmpty(paramStReply.targetUser.id.get())))
    {
      localSpannableStringBuilder.append(this.jdField_a_of_type_JavaLangString).append(paramStReply.targetUser.nick.get());
      this.jdField_b_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView.a(localSpannableStringBuilder, this.jdField_a_of_type_JavaLangString.length(), this.jdField_a_of_type_JavaLangString.length() + paramStReply.targetUser.nick.get().length(), new vku(this, paramStReply));
      if (paramStReply.targetUser.id.get().equals(this.jdField_a_of_type_FeedcloudFeedCloudMeta$StFeed.poster.id.get()))
      {
        if (this.jdField_a_of_type_AndroidGraphicsDrawableDrawable == null)
        {
          this.jdField_a_of_type_AndroidGraphicsDrawableDrawable = getResources().getDrawable(2130843925);
          this.jdField_a_of_type_AndroidGraphicsDrawableDrawable.setBounds(ImmersiveUtils.a(2.0F), ImmersiveUtils.a(1.5F), ImmersiveUtils.a(28.0F), ImmersiveUtils.a(15.5F));
        }
        this.jdField_b_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView.a(localSpannableStringBuilder, localSpannableStringBuilder.length(), this.jdField_a_of_type_AndroidGraphicsDrawableDrawable);
      }
      localSpannableStringBuilder.append("：");
    }
    localSpannableStringBuilder.append(paramStReply.content.get());
    if (paramStReply.typeFlag.get() == 1)
    {
      if (this.c == null)
      {
        this.c = getResources().getDrawable(2130843927);
        this.c.setBounds(ImmersiveUtils.a(2.0F), ImmersiveUtils.a(1.5F), ImmersiveUtils.a(28.0F), ImmersiveUtils.a(15.5F));
      }
      this.jdField_b_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView.a(localSpannableStringBuilder, localSpannableStringBuilder.length(), this.c);
      this.jdField_b_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView.a(true);
    }
    for (;;)
    {
      this.jdField_b_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView.c();
      this.jdField_b_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView.setRichText(localSpannableStringBuilder, new vkv(this));
      return;
      if (paramStReply.likeInfo.ownerStatus.get() == 1)
      {
        if (this.jdField_b_of_type_AndroidGraphicsDrawableDrawable == null)
        {
          this.jdField_b_of_type_AndroidGraphicsDrawableDrawable = getResources().getDrawable(2130843926);
          this.jdField_b_of_type_AndroidGraphicsDrawableDrawable.setBounds(ImmersiveUtils.a(2.0F), ImmersiveUtils.a(1.5F), ImmersiveUtils.a(46.0F), ImmersiveUtils.a(15.5F));
        }
        this.jdField_b_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView.a(localSpannableStringBuilder, localSpannableStringBuilder.length(), this.jdField_b_of_type_AndroidGraphicsDrawableDrawable);
        this.jdField_b_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView.a(true);
      }
      else
      {
        this.jdField_b_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView.a(false);
      }
    }
  }
  
  private void a(String paramString)
  {
    QCircleInitBean localQCircleInitBean = new QCircleInitBean();
    localQCircleInitBean.setUin(paramString);
    localQCircleInitBean.setFromReportBean(a().clone().setElementIdStr("portrait"));
    uyx.b(getContext(), localQCircleInitBean);
  }
  
  public int a()
  {
    return 2131560804;
  }
  
  public String a()
  {
    return "QCircleReplyItemView";
  }
  
  public void a(Context paramContext, View paramView)
  {
    this.jdField_a_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView = ((QCircleAsyncTextView)paramView.findViewById(2131376529));
    this.jdField_b_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView = ((QCircleAsyncTextView)paramView.findViewById(2131376527));
    this.jdField_b_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView.setNeedParseColor(true);
    this.jdField_a_of_type_ComTencentBizQqcircleWidgetsQCircleCommentPraiseLayout = ((QCircleCommentPraiseLayout)paramView.findViewById(2131372927));
    this.jdField_a_of_type_ComTencentBizQqcircleWidgetsQCircleAvatarView = ((QCircleAvatarView)paramView.findViewById(2131363109));
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)paramView.findViewById(2131380050));
    a();
  }
  
  protected void a(vbc paramvbc) {}
  
  public void a(vbc paramvbc, int paramInt)
  {
    if ((this.jdField_a_of_type_FeedcloudFeedCloudMeta$StFeed == null) || (this.jdField_a_of_type_FeedcloudFeedCloudMeta$StComment == null) || (paramvbc == null) || (paramvbc.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply == null)) {
      return;
    }
    this.jdField_b_of_type_Int = paramInt;
    this.jdField_a_of_type_Vbc = paramvbc;
    this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply = paramvbc.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply;
    if ((this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply.postUser != null) && (this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply.postUser.nick.get() != null))
    {
      if ((getContext() instanceof BaseActivity)) {
        this.jdField_a_of_type_ComTencentBizQqcircleWidgetsQCircleAvatarView.setUser(((BaseActivity)getContext()).app, this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply.postUser);
      }
      paramvbc = new SpannableStringBuilder(this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply.postUser.nick.get());
      if (!this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply.postUser.id.get().equals(this.jdField_a_of_type_FeedcloudFeedCloudMeta$StFeed.poster.id.get())) {
        break label311;
      }
      if (this.jdField_a_of_type_AndroidGraphicsDrawableDrawable == null)
      {
        this.jdField_a_of_type_AndroidGraphicsDrawableDrawable = getResources().getDrawable(2130843925);
        this.jdField_a_of_type_AndroidGraphicsDrawableDrawable.setBounds(ImmersiveUtils.a(2.0F), ImmersiveUtils.a(1.5F), ImmersiveUtils.a(28.0F), ImmersiveUtils.a(15.5F));
      }
      this.jdField_a_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView.a(paramvbc, paramvbc.length(), this.jdField_a_of_type_AndroidGraphicsDrawableDrawable);
      this.jdField_a_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView.a(true);
    }
    for (;;)
    {
      this.jdField_a_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView.setText(paramvbc);
      this.jdField_a_of_type_AndroidWidgetTextView.setText(aajo.a(this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply.createTime.get() * 1000L));
      a(this.jdField_a_of_type_FeedcloudFeedCloudMeta$StComment, this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply);
      this.jdField_a_of_type_ComTencentBizQqcircleWidgetsQCircleCommentPraiseLayout.setData(2, this.jdField_a_of_type_FeedcloudFeedCloudMeta$StFeed, this.jdField_a_of_type_FeedcloudFeedCloudMeta$StComment, this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply, true);
      this.jdField_a_of_type_ComTencentBizQqcircleWidgetsQCircleCommentPraiseLayout.setOnClickHookListener(new vkt(this));
      return;
      label311:
      this.jdField_a_of_type_ComTencentBizQqcircleWidgetsQCircleAsyncTextView.a(false);
    }
  }
  
  public ArrayList<Class> getEventClass()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(QCircleCommentPraiseUpdateEvent.class);
    return localArrayList;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    aaak.a().a(this);
  }
  
  public void onClick(View paramView)
  {
    FeedCloudMeta.StComment localStComment;
    FeedCloudMeta.StReply localStReply;
    switch (paramView.getId())
    {
    default: 
      if (((paramView instanceof QCircleReplyItemView)) && (this.jdField_a_of_type_Aakb != null))
      {
        localStComment = this.jdField_a_of_type_FeedcloudFeedCloudMeta$StComment;
        localStReply = this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply;
        this.jdField_a_of_type_Aakb.a(paramView, 7, this.jdField_a_of_type_Int, new Object[] { localStComment, localStReply });
      }
      break;
    }
    for (;;)
    {
      EventCollector.getInstance().onViewClicked(paramView);
      return;
      if ((this.jdField_a_of_type_Aakb != null) && (this.jdField_a_of_type_FeedcloudFeedCloudMeta$StComment != null))
      {
        this.jdField_a_of_type_Aakb.a(paramView, 1, this.jdField_b_of_type_Int, this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply.postUser);
        continue;
        if ((this.jdField_a_of_type_Aakb != null) && (this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply != null))
        {
          this.jdField_a_of_type_Aakb.a(paramView, 2, this.jdField_a_of_type_Int, this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply.postUser);
          continue;
          if (this.jdField_a_of_type_Aakb != null)
          {
            localStComment = this.jdField_a_of_type_FeedcloudFeedCloudMeta$StComment;
            localStReply = this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply;
            this.jdField_a_of_type_Aakb.a(paramView, 7, this.jdField_a_of_type_Int, new Object[] { localStComment, localStReply });
          }
        }
      }
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    aaak.a().b(this);
  }
  
  public boolean onLongClick(View paramView)
  {
    boolean bool = true;
    switch (paramView.getId())
    {
    default: 
      bool = false;
    }
    do
    {
      return bool;
    } while (this.jdField_a_of_type_Aakb == null);
    FeedCloudMeta.StComment localStComment = this.jdField_a_of_type_FeedcloudFeedCloudMeta$StComment;
    FeedCloudMeta.StReply localStReply = this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply;
    this.jdField_a_of_type_Aakb.b(paramView, 8, this.jdField_a_of_type_Int, new Object[] { localStComment, localStReply });
    return true;
  }
  
  public void onReceiveEvent(SimpleBaseEvent paramSimpleBaseEvent)
  {
    if ((!(paramSimpleBaseEvent instanceof QCircleCommentPraiseUpdateEvent)) || (this.jdField_a_of_type_FeedcloudFeedCloudMeta$StFeed == null) || (this.jdField_a_of_type_FeedcloudFeedCloudMeta$StComment == null) || (this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply == null) || (!TextUtils.equals(((QCircleCommentPraiseUpdateEvent)paramSimpleBaseEvent).mFeedId, this.jdField_a_of_type_FeedcloudFeedCloudMeta$StFeed.id.get()))) {}
    while ((((QCircleCommentPraiseUpdateEvent)paramSimpleBaseEvent).mType != 2) || (!TextUtils.equals(((QCircleCommentPraiseUpdateEvent)paramSimpleBaseEvent).mCommentId, this.jdField_a_of_type_FeedcloudFeedCloudMeta$StComment.id.get())) || (!TextUtils.equals(((QCircleCommentPraiseUpdateEvent)paramSimpleBaseEvent).mReplyId, this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply.id.get()))) {
      return;
    }
    if (uzg.a((FeedCloudMeta.StUser)this.jdField_a_of_type_FeedcloudFeedCloudMeta$StFeed.poster.get())) {
      this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply.likeInfo.ownerStatus.set(((QCircleCommentPraiseUpdateEvent)paramSimpleBaseEvent).mPraisedStatus);
    }
    this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply.likeInfo.status.set(((QCircleCommentPraiseUpdateEvent)paramSimpleBaseEvent).mPraisedStatus);
    this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply.likeInfo.count.set(((QCircleCommentPraiseUpdateEvent)paramSimpleBaseEvent).mPraisedNum);
    a(this.jdField_a_of_type_FeedcloudFeedCloudMeta$StComment, this.jdField_a_of_type_FeedcloudFeedCloudMeta$StReply);
  }
  
  public void setOnCommentElementClickListener(aakb paramaakb)
  {
    this.jdField_a_of_type_Aakb = paramaakb;
  }
  
  public void setPreData(FeedCloudMeta.StFeed paramStFeed, FeedCloudMeta.StComment paramStComment, int paramInt)
  {
    this.jdField_a_of_type_FeedcloudFeedCloudMeta$StFeed = paramStFeed;
    this.jdField_a_of_type_FeedcloudFeedCloudMeta$StComment = paramStComment;
    this.jdField_a_of_type_Int = paramInt;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     com.tencent.biz.qqcircle.comment.QCircleReplyItemView
 * JD-Core Version:    0.7.0.1
 */
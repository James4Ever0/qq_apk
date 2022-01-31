package com.tencent.biz.pubaccount.readinjoy.comment;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.biz.pubaccount.PublicAccountReportUtils;
import com.tencent.biz.pubaccount.readinjoy.biu.ReadInJoyDeliverBiuActivity;
import com.tencent.biz.pubaccount.readinjoy.common.ReadInJoyTimeUtils;
import com.tencent.biz.pubaccount.readinjoy.common.ReadInJoyUtils;
import com.tencent.biz.pubaccount.readinjoy.struct.ArticleInfo;
import com.tencent.biz.pubaccount.readinjoy.struct.SocializeFeedsInfo;
import com.tencent.biz.pubaccount.readinjoy.struct.SocializeFeedsInfo.UGCFeedsInfo;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.search.util.SearchUtils;
import com.tencent.mobileqq.service.message.MessageUtils;
import com.tencent.mobileqq.text.QQText;
import com.tencent.mobileqq.util.FaceDecoder;
import com.tencent.mobileqq.util.FaceDecoder.DecodeTaskCompletionListener;
import com.tencent.widget.ActionSheet;
import com.tencent.widget.FixSizeImageView;
import com.tencent.widget.ListView;
import java.util.List;
import lkb;
import lkc;
import lke;
import lkf;
import lki;
import lkj;

public class ReadInJoySecondCommentListAdapter
  extends BaseAdapter
  implements View.OnClickListener, ReadInJoyCommentListView.RefreshCallback, FaceDecoder.DecodeTaskCompletionListener
{
  private final int jdField_a_of_type_Int = 1;
  private FragmentActivity jdField_a_of_type_AndroidSupportV4AppFragmentActivity;
  private LayoutInflater jdField_a_of_type_AndroidViewLayoutInflater;
  private ArticleCommentModule.FetchCommentObserver jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentArticleCommentModule$FetchCommentObserver = new lke(this);
  public ArticleCommentModule a;
  private CommentInfo jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentCommentInfo;
  private ReadInJoyCommentListView jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentReadInJoyCommentListView;
  private ReadInJoySecondCommentListAdapter.SecondCommentOperationCallback jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentReadInJoySecondCommentListAdapter$SecondCommentOperationCallback;
  private ReadInJoySecondCommentListFragment jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentReadInJoySecondCommentListFragment;
  private ArticleInfo jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo;
  public QQAppInterface a;
  private FaceDecoder jdField_a_of_type_ComTencentMobileqqUtilFaceDecoder;
  private final String jdField_a_of_type_JavaLangString = "ReadInJoySecondCommentListAdapter";
  private boolean jdField_a_of_type_Boolean;
  private final int b = 2;
  private final int c = 3;
  private int d;
  
  public ReadInJoySecondCommentListAdapter(FragmentActivity paramFragmentActivity, ReadInJoyCommentListView paramReadInJoyCommentListView, ReadInJoySecondCommentListFragment paramReadInJoySecondCommentListFragment)
  {
    this.jdField_a_of_type_AndroidViewLayoutInflater = LayoutInflater.from(paramFragmentActivity);
    this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity = paramFragmentActivity;
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = ((QQAppInterface)this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity.getAppRuntime());
    this.jdField_a_of_type_ComTencentMobileqqUtilFaceDecoder = new FaceDecoder(this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity, this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface);
    this.jdField_a_of_type_ComTencentMobileqqUtilFaceDecoder.a(this);
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentReadInJoyCommentListView = paramReadInJoyCommentListView;
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentReadInJoyCommentListView.setRefreshCallback(this);
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentReadInJoySecondCommentListFragment = paramReadInJoySecondCommentListFragment;
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentReadInJoySecondCommentListAdapter$SecondCommentOperationCallback = new ReadInJoySecondCommentListAdapter.SecondCommentOperationCallback(this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentReadInJoySecondCommentListFragment);
  }
  
  private void a(int paramInt, lkj paramlkj)
  {
    paramlkj.jdField_a_of_type_ComTencentWidgetFixSizeImageView.setOnClickListener(this);
    paramlkj.jdField_a_of_type_AndroidWidgetTextView.setOnClickListener(this);
    paramlkj.jdField_b_of_type_AndroidWidgetImageView.setOnClickListener(this);
    paramlkj.c.setOnClickListener(this);
    paramlkj.jdField_a_of_type_AndroidWidgetRelativeLayout.setOnClickListener(this);
  }
  
  private void a(lkj paramlkj, int paramInt)
  {
    if (this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentArticleCommentModule != null) {
      if (paramInt != 0) {
        break label21;
      }
    }
    for (CommentInfo localCommentInfo = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentCommentInfo; localCommentInfo == null; localCommentInfo = (CommentInfo)this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentArticleCommentModule.getCommentList().get(paramInt - 2)) {
      label21:
      do
      {
        return;
      } while (paramInt == 1);
    }
    SpannableStringBuilder localSpannableStringBuilder;
    QQText localQQText;
    if (!TextUtils.isEmpty(localCommentInfo.commentContent))
    {
      localSpannableStringBuilder = new SpannableStringBuilder();
      if (localCommentInfo.hasTarget)
      {
        localSpannableStringBuilder.append("回复 ");
        if (!TextUtils.isEmpty(localCommentInfo.toNickName))
        {
          localSpannableStringBuilder.append(localCommentInfo.toNickName);
          localSpannableStringBuilder.append("：");
          localSpannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#777777")), 2, localSpannableStringBuilder.length(), 33);
        }
      }
      String str = MessageUtils.b(localCommentInfo.commentContent);
      localQQText = new QQText(str, 7, 16);
      if (localSpannableStringBuilder.length() > 0)
      {
        paramlkj.d.setText(localSpannableStringBuilder + str);
        paramlkj.jdField_a_of_type_ComTencentWidgetFixSizeImageView.setImageDrawable(SearchUtils.a(this.jdField_a_of_type_ComTencentMobileqqUtilFaceDecoder, localCommentInfo.authorUin, 1));
        if (TextUtils.isEmpty(localCommentInfo.authorNickName)) {
          break label627;
        }
        paramlkj.jdField_a_of_type_AndroidWidgetTextView.setText(ReadInJoyUtils.d(localCommentInfo.authorNickName));
        label237:
        paramlkj.jdField_a_of_type_AndroidWidgetTextView.setTag(localCommentInfo);
        paramlkj.jdField_a_of_type_ComTencentWidgetFixSizeImageView.setTag(localCommentInfo);
        if (!localCommentInfo.liked) {
          break label644;
        }
        paramlkj.jdField_b_of_type_AndroidWidgetImageView.setImageResource(2130840726);
        paramlkj.c.setTextColor(Color.parseColor("#07D0B0"));
        label283:
        if (localCommentInfo.likeCount <= 999) {
          break label670;
        }
        paramlkj.c.setText("999+");
        label303:
        paramlkj.c.setTag(2131362471, localCommentInfo);
        paramlkj.c.setTag(2131362472, paramlkj);
        paramlkj.c.setTag(2131362473, Integer.valueOf(paramInt));
        paramlkj.jdField_b_of_type_AndroidWidgetImageView.setTag(2131362471, localCommentInfo);
        paramlkj.jdField_b_of_type_AndroidWidgetImageView.setTag(2131362472, paramlkj);
        paramlkj.jdField_b_of_type_AndroidWidgetImageView.setTag(2131362473, Integer.valueOf(paramInt));
        paramlkj.jdField_a_of_type_AndroidWidgetRelativeLayout.setTag(2131362471, localCommentInfo);
        paramlkj.jdField_a_of_type_AndroidWidgetRelativeLayout.setTag(2131362472, paramlkj);
        paramlkj.jdField_a_of_type_AndroidWidgetRelativeLayout.setTag(2131362473, Integer.valueOf(paramInt));
        paramlkj.e.setText(ReadInJoyTimeUtils.a(localCommentInfo.commentTime, true));
        if (paramInt != 0) {
          break label707;
        }
        paramlkj.f.setVisibility(8);
        paramlkj.g.setVisibility(8);
        paramlkj.f.setOnClickListener(null);
        label456:
        if (localCommentInfo.rank != 0) {
          break label794;
        }
        paramlkj.jdField_a_of_type_AndroidWidgetImageView.setVisibility(0);
        label471:
        if (localCommentInfo.author_selection != 1) {
          break label806;
        }
        paramlkj.jdField_b_of_type_AndroidWidgetTextView.setVisibility(0);
      }
    }
    for (;;)
    {
      if ((paramInt != 0) || (TextUtils.isEmpty(localCommentInfo.authorComment))) {
        break label818;
      }
      paramlkj.jdField_a_of_type_AndroidWidgetLinearLayout.setVisibility(0);
      localSpannableStringBuilder = new SpannableStringBuilder();
      localSpannableStringBuilder.append("作者回复：");
      localSpannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FF8444")), 0, localSpannableStringBuilder.length(), 33);
      localSpannableStringBuilder.append(new QQText(MessageUtils.b(localCommentInfo.authorComment), 7, 16));
      paramlkj.h.setText(localSpannableStringBuilder);
      paramlkj.h.setVisibility(0);
      return;
      paramlkj.d.setText(localQQText);
      break;
      if (localCommentInfo.gift_list != null) {
        break;
      }
      paramlkj.d.setText("发布了图片");
      break;
      label627:
      paramlkj.jdField_a_of_type_AndroidWidgetTextView.setText(ReadInJoyUtils.d(localCommentInfo.authorUin));
      break label237;
      label644:
      paramlkj.jdField_b_of_type_AndroidWidgetImageView.setImageResource(2130840725);
      paramlkj.c.setTextColor(Color.parseColor("#9D9D9D"));
      break label283;
      label670:
      if (localCommentInfo.likeCount < 0)
      {
        paramlkj.c.setText("0");
        break label303;
      }
      paramlkj.c.setText(String.valueOf(localCommentInfo.likeCount));
      break label303;
      label707:
      if (localCommentInfo.commentByMyself)
      {
        paramlkj.g.setVisibility(0);
        paramlkj.f.setVisibility(8);
        paramlkj.g.setOnClickListener(this);
        paramlkj.g.setTag(localCommentInfo);
        paramlkj.f.setOnClickListener(null);
        break label456;
      }
      paramlkj.g.setVisibility(8);
      paramlkj.f.setVisibility(0);
      paramlkj.f.setOnClickListener(this);
      paramlkj.f.setTag(localCommentInfo);
      break label456;
      label794:
      paramlkj.jdField_a_of_type_AndroidWidgetImageView.setVisibility(8);
      break label471;
      label806:
      paramlkj.jdField_b_of_type_AndroidWidgetTextView.setVisibility(8);
    }
    label818:
    paramlkj.jdField_a_of_type_AndroidWidgetLinearLayout.setVisibility(8);
  }
  
  private boolean a(int paramInt, View paramView)
  {
    boolean bool2 = true;
    boolean bool1 = true;
    if (paramView == null) {}
    do
    {
      return false;
      if (paramInt == 1)
      {
        if ((paramView.getTag() != null) && ((paramView.getTag() instanceof lkj))) {}
        for (;;)
        {
          return bool1;
          bool1 = false;
        }
      }
    } while (paramInt != 2);
    if ((paramView.getTag() != null) && ((paramView.getTag() instanceof lki))) {}
    for (bool1 = bool2;; bool1 = false) {
      return bool1;
    }
  }
  
  public void a()
  {
    this.jdField_a_of_type_AndroidViewLayoutInflater = null;
    this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity = null;
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo = null;
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentArticleCommentModule = null;
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentReadInJoySecondCommentListFragment = null;
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentReadInJoySecondCommentListAdapter$SecondCommentOperationCallback = null;
    if (this.jdField_a_of_type_ComTencentMobileqqUtilFaceDecoder != null)
    {
      this.jdField_a_of_type_ComTencentMobileqqUtilFaceDecoder.d();
      this.jdField_a_of_type_ComTencentMobileqqUtilFaceDecoder = null;
    }
  }
  
  public void a(CommentInfo paramCommentInfo, boolean paramBoolean)
  {
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentCommentInfo = paramCommentInfo;
    this.jdField_a_of_type_Boolean = paramBoolean;
    if (this.jdField_a_of_type_Boolean)
    {
      this.d = 1;
      return;
    }
    this.d = 2;
  }
  
  public void a(ArticleInfo paramArticleInfo)
  {
    int i = 2;
    if ((paramArticleInfo == null) || (paramArticleInfo != this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo))
    {
      this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentArticleCommentModule = null;
      notifyDataSetChanged();
    }
    Object localObject;
    String str1;
    long l;
    int j;
    String str2;
    if (paramArticleInfo != null)
    {
      localObject = System.currentTimeMillis() + "";
      this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentArticleCommentModule = new ArticleCommentModule(paramArticleInfo, 2, this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentCommentInfo.commentId, (String)localObject);
      this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentArticleCommentModule.fetchNextCommentInfo((QQAppInterface)this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity.getAppRuntime(), this.d);
      this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentArticleCommentModule.setCommentObsrver(this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentArticleCommentModule$FetchCommentObserver);
      localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface;
      str1 = ReadInJoyCommentUtils.a(paramArticleInfo);
      l = paramArticleInfo.mArticleID;
      j = paramArticleInfo.mStrategyId;
      str2 = paramArticleInfo.innerUniqueID;
      if (!this.jdField_a_of_type_Boolean) {
        break label183;
      }
    }
    for (;;)
    {
      PublicAccountReportUtils.a((QQAppInterface)localObject, str1, "0X800901F", "0X800901F", 0, 0, String.valueOf(l), String.valueOf(j), str2, ReadInJoyCommentUtils.a(paramArticleInfo, i, ""), false);
      this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo = paramArticleInfo;
      return;
      label183:
      i = 1;
    }
  }
  
  public void a(ListView paramListView)
  {
    if (!this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentArticleCommentModule.hasNextPage())
    {
      this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentReadInJoyCommentListView.a(this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentArticleCommentModule.hasNextPage());
      return;
    }
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentArticleCommentModule.fetchNextCommentInfo(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.d);
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentArticleCommentModule.setCommentObsrver(new lkb(this));
  }
  
  public int getCount()
  {
    if ((this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentArticleCommentModule == null) || (this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentArticleCommentModule.getCommentList().size() == 0))
    {
      this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentReadInJoyCommentListView.jdField_a_of_type_Boolean = false;
      return 2;
    }
    return this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentArticleCommentModule.getCommentList().size() + 2;
  }
  
  public Object getItem(int paramInt)
  {
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public int getItemViewType(int paramInt)
  {
    if (paramInt == 0) {}
    do
    {
      return 1;
      if ((this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentArticleCommentModule == null) || (this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentArticleCommentModule.getCommentList().size() == 0)) {
        return 3;
      }
    } while (paramInt != 1);
    return 2;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    int i = getItemViewType(paramInt);
    if (a(i, paramView)) {
      switch (i)
      {
      default: 
        paramViewGroup = null;
        localObject1 = localObject2;
        localObject2 = localObject1;
        localObject1 = paramViewGroup;
        paramViewGroup = localObject2;
      }
    }
    for (;;)
    {
      if ((localObject1 != null) && ((paramView.getTag() instanceof lkj)))
      {
        a(paramInt, (lkj)localObject1);
        a((lkj)localObject1, paramInt);
        paramView.setOnClickListener(new lkf(this, paramInt));
      }
      if ((paramViewGroup != null) && ((paramView.getTag() instanceof lki)) && (this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentCommentInfo != null))
      {
        if (this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentCommentInfo.sub_comments_total <= 999) {
          break label537;
        }
        paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setText("999+条回复");
        paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setVisibility(0);
      }
      return paramView;
      localObject1 = (lki)paramView.getTag();
      paramViewGroup = null;
      break;
      paramViewGroup = (lkj)paramView.getTag();
      localObject1 = localObject2;
      break;
      switch (i)
      {
      default: 
        paramViewGroup = null;
        break;
      case 2: 
        paramView = this.jdField_a_of_type_AndroidViewLayoutInflater.inflate(2130969592, paramViewGroup, false);
        paramViewGroup = new lki(this);
        paramViewGroup.jdField_a_of_type_AndroidWidgetTextView = ((TextView)paramView.findViewById(2131367035));
        paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.getPaint().setFakeBoldText(true);
        paramView.setTag(paramViewGroup);
        break;
      case 1: 
        paramView = this.jdField_a_of_type_AndroidViewLayoutInflater.inflate(2130969556, paramViewGroup, false);
        localObject1 = new lkj(this);
        ((lkj)localObject1).jdField_a_of_type_ComTencentWidgetFixSizeImageView = ((FixSizeImageView)paramView.findViewById(2131366949));
        ((lkj)localObject1).jdField_a_of_type_AndroidWidgetTextView = ((TextView)paramView.findViewById(2131366951));
        ((lkj)localObject1).jdField_b_of_type_AndroidWidgetTextView = ((TextView)paramView.findViewById(2131366952));
        ((lkj)localObject1).jdField_b_of_type_AndroidWidgetTextView.setBackgroundColor(Color.parseColor("#28FF8444"));
        ((lkj)localObject1).jdField_a_of_type_AndroidWidgetImageView = ((ImageView)paramView.findViewById(2131366953));
        ((lkj)localObject1).jdField_a_of_type_AndroidWidgetRelativeLayout = ((RelativeLayout)paramView.findViewById(2131366954));
        ((lkj)localObject1).jdField_b_of_type_AndroidWidgetImageView = ((ImageView)paramView.findViewById(2131366956));
        ((lkj)localObject1).c = ((TextView)paramView.findViewById(2131366955));
        ((lkj)localObject1).d = ((TextView)paramView.findViewById(2131366957));
        ((lkj)localObject1).e = ((TextView)paramView.findViewById(2131366963));
        ((lkj)localObject1).f = ((TextView)paramView.findViewById(2131366964));
        ((lkj)localObject1).g = ((TextView)paramView.findViewById(2131366966));
        ((lkj)localObject1).jdField_a_of_type_AndroidWidgetLinearLayout = ((LinearLayout)paramView.findViewById(2131366958));
        ((lkj)localObject1).h = ((TextView)paramView.findViewById(2131366959));
        paramView.setTag(localObject1);
        paramViewGroup = null;
        break;
      case 3: 
        paramView = this.jdField_a_of_type_AndroidViewLayoutInflater.inflate(2130969634, paramViewGroup, false);
        paramViewGroup = null;
      }
    }
    label537:
    if (this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentCommentInfo.sub_comments_total <= 0)
    {
      paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setVisibility(8);
      return paramView;
    }
    paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setText(this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentCommentInfo.sub_comments_total + "条回复");
    paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setVisibility(0);
    return paramView;
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    Object localObject1;
    int i;
    label175:
    Object localObject2;
    label232:
    do
    {
      do
      {
        do
        {
          do
          {
            Object localObject3;
            Object localObject4;
            long l;
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      return;
                    } while ((paramView.getTag() == null) || (!(paramView.getTag() instanceof CommentInfo)));
                    localObject1 = (CommentInfo)paramView.getTag();
                  } while (localObject1 == null);
                  j = 4;
                } while (this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo == null);
                boolean bool;
                if (((this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo.mFeedType == 1) && (this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo.mSocialFeedInfo != null) && (this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo.mSocialFeedInfo.jdField_a_of_type_Int == 5)) || (ReadInJoyUtils.a(this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo)))
                {
                  i = 2;
                  if (!TextUtils.isEmpty(((CommentInfo)localObject1).authorNickName)) {
                    break label396;
                  }
                  paramView = "";
                  paramView = this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity.getString(2131438899) + paramView;
                  localObject2 = this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity;
                  localObject3 = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo;
                  localObject4 = ((CommentInfo)localObject1).authorUin;
                  if (this.jdField_a_of_type_Boolean) {
                    break label405;
                  }
                  bool = true;
                  ReadInJoyCommentUtils.a((Activity)localObject2, (ArticleInfo)localObject3, (CommentInfo)localObject1, i, paramView, null, true, (String)localObject4, bool);
                  paramView = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface;
                  localObject2 = ReadInJoyCommentUtils.a(this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo);
                  l = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo.mArticleID;
                  j = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo.mStrategyId;
                  localObject3 = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo.innerUniqueID;
                  localObject4 = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo;
                  if (!this.jdField_a_of_type_Boolean) {
                    break label411;
                  }
                }
                for (i = 2;; i = 1)
                {
                  PublicAccountReportUtils.a(paramView, (String)localObject2, "0X8009014", "0X8009014", 0, 0, String.valueOf(l), String.valueOf(j), (String)localObject3, ReadInJoyCommentUtils.a((ArticleInfo)localObject4, i, ((CommentInfo)localObject1).commentId), false);
                  return;
                  i = j;
                  if (!ReadInJoyDeliverBiuActivity.a(this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo)) {
                    break;
                  }
                  i = j;
                  if (this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo.mSocialFeedInfo.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructSocializeFeedsInfo$UGCFeedsInfo == null) {
                    break;
                  }
                  i = j;
                  if (!ReadInJoyDeliverBiuActivity.a(this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo.mSocialFeedInfo.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructSocializeFeedsInfo$UGCFeedsInfo.jdField_a_of_type_Int)) {
                    break;
                  }
                  i = 9;
                  break;
                  paramView = ((CommentInfo)localObject1).authorNickName;
                  break label175;
                  bool = false;
                  break label232;
                }
              } while ((paramView.getTag() == null) || (!(paramView.getTag() instanceof CommentInfo)));
              paramView = (CommentInfo)paramView.getTag();
            } while (paramView == null);
            localObject1 = ActionSheet.a(this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity);
            ((ActionSheet)localObject1).a(2131438857);
            ((ActionSheet)localObject1).a(2131438856, 3);
            ((ActionSheet)localObject1).c(2131432998);
            if (!((ActionSheet)localObject1).isShowing()) {
              ((ActionSheet)localObject1).show();
            }
            ArticleInfo localArticleInfo;
            if (this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo != null)
            {
              localObject2 = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface;
              localObject3 = ReadInJoyCommentUtils.a(this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo);
              l = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo.mArticleID;
              j = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo.mStrategyId;
              localObject4 = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo.innerUniqueID;
              localArticleInfo = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo;
              if (!this.jdField_a_of_type_Boolean) {
                break label611;
              }
            }
            for (i = 2;; i = 1)
            {
              PublicAccountReportUtils.a((QQAppInterface)localObject2, (String)localObject3, "0X8009013", "0X8009013", 0, 0, String.valueOf(l), String.valueOf(j), (String)localObject4, ReadInJoyCommentUtils.a(localArticleInfo, i, paramView.commentId, 1, 4), false);
              ((ActionSheet)localObject1).a(new lkc(this, paramView, (ActionSheet)localObject1));
              return;
            }
          } while ((paramView.getTag() == null) || (!(paramView.getTag() instanceof CommentInfo)));
          paramView = (CommentInfo)paramView.getTag();
        } while (paramView == null);
        ReadInJoyCommentUtils.a(paramView.authorUin, this.jdField_a_of_type_AndroidSupportV4AppFragmentActivity);
        return;
      } while (paramView.getTag(2131362471) == null);
      localObject1 = (CommentInfo)paramView.getTag(2131362471);
      localObject2 = (lkj)paramView.getTag(2131362472);
      int j = ((Integer)paramView.getTag(2131362473)).intValue();
      i = 2;
      if (j == 0) {
        i = 1;
      }
    } while ((localObject1 == null) || (localObject2 == null) || (this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo == null) || (this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentCommentInfo == null));
    label396:
    label405:
    label411:
    label611:
    ReadInJoyCommentUtils.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentArticleCommentModule, (CommentInfo)localObject1, ((lkj)localObject2).jdField_b_of_type_AndroidWidgetImageView, ((lkj)localObject2).c, i, this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentCommentInfo, this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyStructArticleInfo, this.jdField_a_of_type_Boolean, ((CommentInfo)localObject1).authorUin, this.d, this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentReadInJoySecondCommentListAdapter$SecondCommentOperationCallback);
  }
  
  public void onDecodeTaskCompleted(int paramInt1, int paramInt2, String paramString, Bitmap paramBitmap)
  {
    if (this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentReadInJoyCommentListView == null) {
      return;
    }
    paramInt2 = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentReadInJoyCommentListView.getChildCount();
    paramInt1 = 0;
    while (paramInt1 < paramInt2)
    {
      paramString = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyCommentReadInJoyCommentListView.getChildAt(paramInt1);
      if ((paramString != null) && (paramString.getTag() != null) && ((paramString.getTag() instanceof lkj)))
      {
        paramString = (lkj)paramString.getTag();
        if (paramString == null) {}
      }
      try
      {
        if ((paramString.jdField_a_of_type_ComTencentWidgetFixSizeImageView.getTag() != null) && ((paramString.jdField_a_of_type_ComTencentWidgetFixSizeImageView.getTag() instanceof CommentInfo)))
        {
          paramBitmap = (CommentInfo)paramString.jdField_a_of_type_ComTencentWidgetFixSizeImageView.getTag();
          paramString.jdField_a_of_type_ComTencentWidgetFixSizeImageView.setImageDrawable(SearchUtils.a(this.jdField_a_of_type_ComTencentMobileqqUtilFaceDecoder, paramBitmap.authorUin, 1));
        }
        paramInt1 += 1;
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          paramString.printStackTrace();
        }
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.biz.pubaccount.readinjoy.comment.ReadInJoySecondCommentListAdapter
 * JD-Core Version:    0.7.0.1
 */
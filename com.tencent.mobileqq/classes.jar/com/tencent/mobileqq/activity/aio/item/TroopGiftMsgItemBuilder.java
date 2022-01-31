package com.tencent.mobileqq.activity.aio.item;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.biz.anonymous.AnonymousChatHelper;
import com.tencent.common.config.AppSetting;
import com.tencent.image.RegionDrawable;
import com.tencent.image.URLDrawable;
import com.tencent.image.URLDrawable.URLDrawableOptions;
import com.tencent.mobileqq.activity.BaseChatPie;
import com.tencent.mobileqq.activity.ChatActivityFacade;
import com.tencent.mobileqq.activity.aio.AIOUtils;
import com.tencent.mobileqq.activity.aio.BaseBubbleBuilder;
import com.tencent.mobileqq.activity.aio.BaseBubbleBuilder.ViewHolder;
import com.tencent.mobileqq.activity.aio.BaseChatItemLayout;
import com.tencent.mobileqq.activity.aio.OnLongClickAndTouchListener;
import com.tencent.mobileqq.activity.aio.SessionInfo;
import com.tencent.mobileqq.activity.aio.anim.AIOAnimationConatiner;
import com.tencent.mobileqq.app.AppConstants;
import com.tencent.mobileqq.app.NearbyFlowerManager;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.data.ChatMessage;
import com.tencent.mobileqq.data.MessageForTroopGift;
import com.tencent.mobileqq.msf.core.NetConnInfoCenter;
import com.tencent.mobileqq.persistence.EntityManagerFactory;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.statistics.ReportTask;
import com.tencent.mobileqq.troop.utils.AIOAnimationControlManager;
import com.tencent.mobileqq.troop.utils.TroopGiftUtil;
import com.tencent.mobileqq.utils.dialogutils.QQCustomMenu;
import com.tencent.mobileqq.utils.dialogutils.QQCustomMenuItem;
import com.tencent.mobileqq.widget.BubbleImageView;
import com.tencent.qphone.base.util.QLog;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import vgv;
import vgw;
import vgx;
import vgz;
import vha;
import vhb;
import vhc;
import vhd;
import vhf;

public abstract class TroopGiftMsgItemBuilder
  extends BaseBubbleBuilder
{
  public static String a;
  public static List a;
  private static int jdField_b_of_type_Int = 101;
  private static int c = 102;
  public BaseChatPie a;
  public Map a;
  AtomicInteger a;
  Handler jdField_b_of_type_AndroidOsHandler = new vgv(this);
  public Map b;
  
  static
  {
    jdField_a_of_type_JavaUtilList = new LinkedList();
    jdField_a_of_type_JavaLangString = "TroopGiftMsgItemBuilder";
  }
  
  public TroopGiftMsgItemBuilder(QQAppInterface paramQQAppInterface, BaseAdapter paramBaseAdapter, Context paramContext, SessionInfo paramSessionInfo, AIOAnimationConatiner paramAIOAnimationConatiner, BaseChatPie paramBaseChatPie)
  {
    super(paramQQAppInterface, paramBaseAdapter, paramContext, paramSessionInfo, paramAIOAnimationConatiner);
    this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicInteger = new AtomicInteger(0);
    this.jdField_a_of_type_JavaUtilMap = new HashMap();
    this.jdField_b_of_type_JavaUtilMap = new HashMap();
    this.jdField_a_of_type_ComTencentMobileqqActivityBaseChatPie = paramBaseChatPie;
  }
  
  public static void a(QQAppInterface paramQQAppInterface)
  {
    if (!jdField_a_of_type_JavaUtilList.isEmpty()) {
      ThreadManager.post(new vhc(paramQQAppInterface.getEntityManagerFactory().createEntityManager()), 5, null, true);
    }
  }
  
  public int a(ChatMessage paramChatMessage)
  {
    return 0;
  }
  
  public abstract View a(BaseChatItemLayout paramBaseChatItemLayout);
  
  protected View a(ChatMessage paramChatMessage, BaseBubbleBuilder.ViewHolder paramViewHolder, View paramView, BaseChatItemLayout paramBaseChatItemLayout, OnLongClickAndTouchListener paramOnLongClickAndTouchListener)
  {
    vhf localvhf = (vhf)paramViewHolder;
    View localView = paramView;
    int i;
    int j;
    if (paramView == null)
    {
      localView = a(paramBaseChatItemLayout);
      localvhf.jdField_a_of_type_AndroidWidgetLinearLayout = ((LinearLayout)localView);
      localvhf.jdField_a_of_type_AndroidWidgetTextView = ((TextView)localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375114));
      localvhf.jdField_b_of_type_AndroidWidgetTextView = ((TextView)localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375115));
      localvhf.jdField_a_of_type_AndroidWidgetButton = ((Button)localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375116));
      localvhf.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375113));
      localvhf.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView = ((BubbleImageView)localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131368528));
      localvhf.jdField_b_of_type_AndroidViewView = localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131362731);
      localvhf.jdField_c_of_type_AndroidViewView = localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375117);
      localvhf.jdField_b_of_type_AndroidWidgetButton = ((Button)localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375109));
      localvhf.jdField_c_of_type_AndroidWidgetButton = ((Button)localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375110));
      localvhf.d = ((Button)localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375112));
      localvhf.jdField_a_of_type_AndroidViewViewGroup = ((ViewGroup)localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375108));
      localvhf.jdField_b_of_type_AndroidViewViewGroup = ((ViewGroup)localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375111));
      i = (int)(220.0F * this.jdField_a_of_type_Float);
      j = (int)(i - 10.0F * this.jdField_a_of_type_Float);
      paramViewHolder = (RelativeLayout.LayoutParams)localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375108).getLayoutParams();
      paramViewHolder.width = j;
      localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375108).setLayoutParams(paramViewHolder);
      paramViewHolder = (LinearLayout.LayoutParams)localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375109).getLayoutParams();
      paramViewHolder.width = ((int)(j / 2 - 1.0F * this.jdField_a_of_type_Float));
      localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375109).setLayoutParams(paramViewHolder);
      paramViewHolder = (LinearLayout.LayoutParams)localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375110).getLayoutParams();
      paramViewHolder.width = (j / 2);
      localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375110).setLayoutParams(paramViewHolder);
      paramViewHolder = (RelativeLayout.LayoutParams)localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375111).getLayoutParams();
      paramViewHolder.width = j;
      localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375111).setLayoutParams(paramViewHolder);
      paramViewHolder = (LinearLayout.LayoutParams)localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375112).getLayoutParams();
      paramViewHolder.width = j;
      localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131375112).setLayoutParams(paramViewHolder);
      paramViewHolder = (RelativeLayout.LayoutParams)localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131368528).getLayoutParams();
      paramViewHolder.width = i;
      localvhf.jdField_a_of_type_AndroidWidgetLinearLayout.findViewById(2131368528).setLayoutParams(paramViewHolder);
      localvhf.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView.c(false);
      localvhf.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView.setRadius(13.0F);
      localvhf.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
      localvhf.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView.d(true);
      localvhf.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView.setFocusable(false);
      localvhf.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView.setFocusableInTouchMode(false);
      localvhf.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView.setClickable(false);
    }
    localvhf.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView.d = a(paramChatMessage);
    MessageForTroopGift localMessageForTroopGift = (MessageForTroopGift)paramChatMessage;
    boolean bool = AnonymousChatHelper.a().a(this.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_JavaLangString);
    if (localMessageForTroopGift.senderUin == this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getLongAccountUin())
    {
      localvhf.jdField_b_of_type_AndroidViewViewGroup.setVisibility(8);
      localvhf.jdField_a_of_type_AndroidViewViewGroup.setVisibility(8);
      if ((localMessageForTroopGift.btFlag == 0) || (bool))
      {
        localvhf.jdField_b_of_type_AndroidViewViewGroup.setVisibility(8);
        localvhf.jdField_a_of_type_AndroidViewViewGroup.setVisibility(8);
      }
      if (localMessageForTroopGift.btFlag == 1) {
        localvhf.jdField_b_of_type_AndroidViewViewGroup.setVisibility(8);
      }
      if (localMessageForTroopGift.btFlag == 2) {
        localvhf.jdField_a_of_type_AndroidViewViewGroup.setVisibility(8);
      }
      if (localvhf.jdField_a_of_type_AndroidViewViewGroup.getVisibility() == 0)
      {
        new ReportTask(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface).a("dc00899").b("Grp_flower").c("grp_aio").d("exp_tks").a(0).a(new String[] { localMessageForTroopGift.frienduin + "", "" }).a();
        new ReportTask(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface).a("dc00899").b("Grp_flower").c("grp_aio").d("exp_return").a(0).a(new String[] { localMessageForTroopGift.frienduin + "", "" }).a();
      }
      if (localvhf.jdField_b_of_type_AndroidViewViewGroup.getVisibility() == 0) {
        new ReportTask(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface).a("dc00899").b("Grp_flower").c("grp_aio").d("exp_ask").a(0).a(new String[] { localMessageForTroopGift.frienduin + "", "" }).a();
      }
      if ((localvhf.jdField_a_of_type_AndroidViewViewGroup.getVisibility() != 8) || (localvhf.jdField_b_of_type_AndroidViewViewGroup.getVisibility() != 8)) {
        break label1774;
      }
      localvhf.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView.getLayoutParams().height = ((int)(100.0F * this.jdField_a_of_type_Float));
      label1021:
      localvhf.jdField_a_of_type_ComTencentMobileqqDataMessageForTroopGift = localMessageForTroopGift;
      if (localMessageForTroopGift.isInteract()) {
        break label1797;
      }
      localvhf.jdField_a_of_type_AndroidWidgetTextView.setText(localMessageForTroopGift.title + localMessageForTroopGift.subtitle);
      localvhf.jdField_b_of_type_AndroidWidgetTextView.setVisibility(8);
      localvhf.jdField_b_of_type_AndroidWidgetTextView.setTextColor(-1);
      label1089:
      if (!TextUtils.isEmpty(localMessageForTroopGift.charmHeroism)) {
        break label1846;
      }
      label1100:
      localvhf.jdField_a_of_type_AndroidWidgetButton.setText(localMessageForTroopGift.comefrom);
      localvhf.jdField_a_of_type_AndroidWidgetButton.setContentDescription(localMessageForTroopGift.comefrom);
      localvhf.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView.setTag(2131362148, localMessageForTroopGift.giftPicId + "");
      if (localMessageForTroopGift.isInteract()) {
        break label2202;
      }
      localvhf.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView.setImageDrawable(new ColorDrawable(localMessageForTroopGift.objColor));
      localvhf.jdField_a_of_type_AndroidWidgetTextView.setTextColor(-1);
      label1198:
      paramBaseChatItemLayout = null;
      paramView = null;
      paramChatMessage = paramView;
      paramViewHolder = paramBaseChatItemLayout;
    }
    try
    {
      URLDrawable.URLDrawableOptions localURLDrawableOptions = URLDrawable.URLDrawableOptions.obtain();
      paramChatMessage = paramView;
      paramViewHolder = paramBaseChatItemLayout;
      localURLDrawableOptions.mFailedDrawable = this.jdField_a_of_type_AndroidContentContext.getResources().getDrawable(2130846159);
      paramChatMessage = paramView;
      paramViewHolder = paramBaseChatItemLayout;
      localURLDrawableOptions.mLoadingDrawable = this.jdField_a_of_type_AndroidContentContext.getResources().getDrawable(2130846159);
      paramChatMessage = paramView;
      paramViewHolder = paramBaseChatItemLayout;
      paramView = URLDrawable.getDrawable(localMessageForTroopGift.makeGiftIconUrl(), localURLDrawableOptions);
      paramChatMessage = paramView;
      paramViewHolder = paramView;
      paramView.setDownloadListener(new vgz(this, paramView, localMessageForTroopGift, localvhf));
      paramChatMessage = paramView;
    }
    catch (OutOfMemoryError paramViewHolder)
    {
      for (;;)
      {
        if (QLog.isColorLevel()) {
          QLog.d("ChatItemBuilder", 2, paramViewHolder.getMessage());
        }
      }
    }
    catch (Exception paramChatMessage)
    {
      do
      {
        for (;;)
        {
          if (QLog.isColorLevel()) {
            QLog.d("ChatItemBuilder", 2, paramChatMessage.getMessage());
          }
          paramChatMessage = paramViewHolder;
        }
      } while (paramChatMessage == null);
      if (!(paramChatMessage.getCurrDrawable() instanceof RegionDrawable)) {
        break label2361;
      }
    }
    if ((paramChatMessage != null) && (paramChatMessage.getStatus() == 2)) {
      paramChatMessage.restartDownload();
    }
    label1578:
    label2859:
    for (;;)
    {
      localvhf.jdField_a_of_type_AndroidWidgetImageView.setImageDrawable(paramChatMessage);
      paramChatMessage = new vhd(this, localMessageForTroopGift, localvhf);
      localvhf.jdField_b_of_type_AndroidWidgetButton.setOnClickListener(paramChatMessage);
      localvhf.jdField_c_of_type_AndroidWidgetButton.setOnClickListener(paramChatMessage);
      localvhf.d.setOnClickListener(paramChatMessage);
      localvhf.jdField_a_of_type_AndroidWidgetButton.setOnClickListener(paramChatMessage);
      localvhf.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView.setOnClickListener(paramChatMessage);
      localvhf.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView.setOnLongClickListener(paramOnLongClickAndTouchListener);
      localvhf.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView.setOnTouchListener(new vha(this, paramOnLongClickAndTouchListener));
      localvhf.jdField_b_of_type_AndroidViewView.setOnClickListener(paramChatMessage);
      localvhf.jdField_b_of_type_AndroidViewView.setOnLongClickListener(paramOnLongClickAndTouchListener);
      localvhf.jdField_b_of_type_AndroidViewView.setOnTouchListener(new vhb(this, paramOnLongClickAndTouchListener));
      paramChatMessage = (AIOAnimationControlManager)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(222);
      if ((localMessageForTroopGift.isLoading) && (paramChatMessage.b(TroopGiftUtil.b(localMessageForTroopGift))))
      {
        paramChatMessage.a(localvhf);
        if (QLog.isColorLevel()) {
          QLog.d("ChatItemBuilder", 2, "VISIBLE uniseq = " + localMessageForTroopGift.uniseq);
        }
        localvhf.jdField_c_of_type_AndroidViewView.setVisibility(0);
        label1532:
        if (!localMessageForTroopGift.isReported)
        {
          localMessageForTroopGift.isReported = true;
          jdField_a_of_type_JavaUtilList.add(localMessageForTroopGift);
          if (!this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.c().equals(localMessageForTroopGift.senderuin)) {
            break label2421;
          }
          i = 0;
          if (localMessageForTroopGift.istroop != 0) {
            break label2448;
          }
          ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "dc00899", "Grp_flower", "", "C2C", "exp_obj", 0, 0, "", "", "", "");
        }
        label1622:
        if ((AppSetting.b) && (!TextUtils.isEmpty(localMessageForTroopGift.title)))
        {
          paramViewHolder = localMessageForTroopGift.title;
          paramChatMessage = paramViewHolder;
          if (localvhf.jdField_b_of_type_AndroidWidgetTextView != null)
          {
            paramChatMessage = paramViewHolder;
            if (!TextUtils.isEmpty(localvhf.jdField_b_of_type_AndroidWidgetTextView.getText())) {
              paramChatMessage = paramViewHolder + localvhf.jdField_b_of_type_AndroidWidgetTextView.getText().toString();
            }
          }
          localvhf.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView.setContentDescription(paramChatMessage);
        }
        return localView;
        if (localMessageForTroopGift.receiverUin == this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getLongAccountUin())
        {
          localvhf.jdField_b_of_type_AndroidViewViewGroup.setVisibility(8);
          localvhf.jdField_a_of_type_AndroidViewViewGroup.setVisibility(0);
          break;
        }
        localvhf.jdField_b_of_type_AndroidViewViewGroup.setVisibility(0);
        localvhf.jdField_a_of_type_AndroidViewViewGroup.setVisibility(8);
        break;
        label1774:
        localvhf.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView.getLayoutParams().height = ((int)(142.0F * this.jdField_a_of_type_Float));
        break label1021;
        localvhf.jdField_a_of_type_AndroidWidgetTextView.setText(localMessageForTroopGift.title);
        localvhf.jdField_b_of_type_AndroidWidgetTextView.setVisibility(0);
        localvhf.jdField_b_of_type_AndroidWidgetTextView.setText(localMessageForTroopGift.subtitle);
        localvhf.jdField_b_of_type_AndroidWidgetTextView.setTextColor(-7829368);
        break label1089;
        label1846:
        localvhf.jdField_b_of_type_AndroidWidgetTextView.setVisibility(0);
        paramChatMessage = localMessageForTroopGift.charmHeroism.replace("<", "").replace(">", "").split("\\$s");
        if ((paramChatMessage == null) || (paramChatMessage.length != 2)) {
          break label1100;
        }
        paramViewHolder = paramChatMessage[0].split("\\#");
        if ((paramViewHolder == null) || (paramViewHolder.length != 3)) {
          break label1100;
        }
        paramView = paramChatMessage[1].split("\\#");
        if ((paramView == null) || (paramView.length != 3)) {
          break label1100;
        }
        paramChatMessage = "";
        if (localMessageForTroopGift.senderUin == this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getLongAccountUin())
        {
          if (localMessageForTroopGift.sendScore >= 0) {
            paramChatMessage = "+";
          }
          paramChatMessage = "为" + paramViewHolder[0] + paramChatMessage + localMessageForTroopGift.sendScore + "" + paramView[0];
          if (localMessageForTroopGift.sendScore == 0) {
            paramChatMessage = "";
          }
        }
        for (;;)
        {
          localvhf.jdField_b_of_type_AndroidWidgetTextView.setText(paramChatMessage);
          break;
          if (localMessageForTroopGift.receiverUin == this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getLongAccountUin())
          {
            if (localMessageForTroopGift.recvScore >= 0) {
              paramChatMessage = "+";
            }
            paramChatMessage = "为" + paramViewHolder[1] + paramChatMessage + localMessageForTroopGift.recvScore + "" + paramView[1];
            if (localMessageForTroopGift.recvScore == 0) {
              paramChatMessage = "";
            }
          }
          else
          {
            if (localMessageForTroopGift.recvScore >= 0) {
              paramChatMessage = "+";
            }
            paramChatMessage = "为" + paramViewHolder[2] + paramChatMessage + localMessageForTroopGift.recvScore + "" + paramView[2];
            if (localMessageForTroopGift.recvScore == 0) {
              paramChatMessage = "";
            }
          }
        }
        localvhf.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView.setImageResource(2130846160);
        localvhf.jdField_a_of_type_AndroidWidgetTextView.setTextColor(-16777216);
        break label1198;
        i = localMessageForTroopGift.objColor;
        if (i != 0) {
          break label2858;
        }
        i = -2138570752;
      }
      for (;;)
      {
        if (!TextUtils.isEmpty(localMessageForTroopGift.interactId)) {
          break label2859;
        }
        a(((RegionDrawable)paramChatMessage.getCurrDrawable()).getBitmap(), i, localvhf.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView, localMessageForTroopGift.giftPicId + "");
        break;
        label2361:
        if (!QLog.isColorLevel()) {
          break;
        }
        QLog.e("TroopGiftMsgItemBuilder", 2, "drawable.getCurrDrawable() instanceof  RegionDrawable = " + (paramChatMessage.getCurrDrawable() instanceof RegionDrawable));
        break;
        localvhf.jdField_c_of_type_AndroidViewView.setVisibility(8);
        paramChatMessage.b(localvhf);
        break label1532;
        label2421:
        if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.c().equals(Long.valueOf(localMessageForTroopGift.receiverUin)))
        {
          i = 1;
          break label1578;
          if (localMessageForTroopGift.istroop == 3000)
          {
            ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "dc00899", "Grp_flower", "", "discuss_grp", "exp_obj", 0, 0, "", "", "", "");
            break label1622;
          }
          if ((localMessageForTroopGift.istroop == 1000) || (localMessageForTroopGift.istroop == 1004))
          {
            ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "dc00899", "Grp_flower", "", "temp_c2c", "exp_obj", 0, 0, "", "", "", "");
            break label1622;
          }
          if (localMessageForTroopGift.isFromNearby)
          {
            NearbyFlowerManager.a("gift_aio", "exp_obj", this.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_JavaLangString, i + "", "", "");
            if (!TroopGiftUtil.a(localMessageForTroopGift)) {
              break label1622;
            }
            NearbyFlowerManager.a("gift_aio", "exp_play", this.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_JavaLangString, i + "", "", "");
            break label1622;
          }
          if (AnonymousChatHelper.a(localMessageForTroopGift)) {}
          for (j = 2;; j = 1)
          {
            ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "P_CliOper", "Grp_flower", "", "grp_aio", "exp_obj", j, 0, this.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_JavaLangString, i + "", localMessageForTroopGift.giftPicId + "", "");
            if (!TroopGiftUtil.a(localMessageForTroopGift)) {
              break;
            }
            ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "P_CliOper", "Grp_flower", "", "grp_aio", "exp_play", j, 0, this.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_JavaLangString, i + "", localMessageForTroopGift.giftPicId + "", "");
            break;
          }
        }
        i = 2;
        break label1578;
      }
    }
  }
  
  protected String a(ChatMessage paramChatMessage)
  {
    return ((MessageForTroopGift)paramChatMessage).title;
  }
  
  public String a(String paramString, int paramInt)
  {
    return AppConstants.aJ + ".gift/" + "troopGift_" + paramString + "_" + paramInt + ".png";
  }
  
  public void a(int paramInt, Context paramContext, ChatMessage paramChatMessage)
  {
    switch (paramInt)
    {
    default: 
      super.a(paramInt, paramContext, paramChatMessage);
      return;
    }
    ChatActivityFacade.a(this.jdField_a_of_type_AndroidContentContext, this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, paramChatMessage);
  }
  
  public void a(Bitmap paramBitmap, int paramInt, BubbleImageView paramBubbleImageView, String paramString)
  {
    if ((paramBitmap == null) || (paramBubbleImageView == null) || (paramString == null)) {
      return;
    }
    Object localObject = new File(a(paramString, paramInt));
    String str = "troopGift_" + paramString + "_" + paramInt + ".png";
    SharedPreferences localSharedPreferences = this.jdField_a_of_type_AndroidContentContext.getSharedPreferences(jdField_a_of_type_JavaLangString, 0);
    long l1 = localSharedPreferences.getLong(str, 0L);
    long l2 = NetConnInfoCenter.getServerTimeMillis();
    if ((l1 != 0L) && (l2 - l1 < 259200000L)) {}
    for (int i = 1;; i = 0)
    {
      if (this.jdField_a_of_type_JavaUtilMap.get(str) != null) {}
      for (boolean bool = ((Boolean)this.jdField_a_of_type_JavaUtilMap.get(str)).booleanValue();; bool = false)
      {
        if ((localObject != null) && (((File)localObject).exists()) && (i != 0))
        {
          paramBitmap = URLDrawable.URLDrawableOptions.obtain();
          paramBitmap.mFailedDrawable = new ColorDrawable(paramInt);
          paramBitmap.mLoadingDrawable = new ColorDrawable(paramInt);
          paramBubbleImageView.setImageDrawable(URLDrawable.getDrawable(new File(a(paramString, paramInt)), paramBitmap));
          return;
        }
        if (bool)
        {
          localObject = (ArrayList)this.jdField_b_of_type_JavaUtilMap.get(str);
          paramBitmap = (Bitmap)localObject;
          if (localObject == null)
          {
            paramBitmap = new ArrayList();
            this.jdField_b_of_type_JavaUtilMap.put(str, paramBitmap);
          }
          paramBitmap.add(new vgw(this, paramBubbleImageView, paramString, paramInt));
          return;
        }
        this.jdField_a_of_type_JavaUtilMap.put(str, Boolean.valueOf(true));
        paramBubbleImageView.setImageDrawable(new ColorDrawable(paramInt));
        this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicInteger.incrementAndGet();
        ThreadManager.post(new vgx(this, paramString, paramInt, paramBitmap, paramBubbleImageView, str, localSharedPreferences, l2), 8, null, false);
        return;
      }
    }
  }
  
  protected void a(View paramView, ChatMessage paramChatMessage)
  {
    paramView.setPadding(0, 0, 0, BaseChatItemLayout.h);
  }
  
  public boolean a(ChatMessage paramChatMessage)
  {
    return ((MessageForTroopGift)paramChatMessage).senderUin == this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getLongAccountUin();
  }
  
  public QQCustomMenuItem[] a(View paramView)
  {
    QQCustomMenu localQQCustomMenu = new QQCustomMenu();
    a(AIOUtils.a(paramView), localQQCustomMenu);
    ChatActivityFacade.a(localQQCustomMenu, this.jdField_a_of_type_AndroidContentContext, this.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_Int);
    return localQQCustomMenu.a();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     com.tencent.mobileqq.activity.aio.item.TroopGiftMsgItemBuilder
 * JD-Core Version:    0.7.0.1
 */
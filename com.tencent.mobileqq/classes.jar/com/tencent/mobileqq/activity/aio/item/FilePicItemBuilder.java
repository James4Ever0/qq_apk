package com.tencent.mobileqq.activity.aio.item;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.MQLruCache;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.common.galleryactivity.AnimationUtils;
import com.tencent.image.URLDrawable;
import com.tencent.image.URLDrawable.URLDrawableOptions;
import com.tencent.mobileqq.activity.BaseChatPie;
import com.tencent.mobileqq.activity.ChatActivity;
import com.tencent.mobileqq.activity.ChatActivityFacade;
import com.tencent.mobileqq.activity.ChatFragment;
import com.tencent.mobileqq.activity.MultiForwardActivity;
import com.tencent.mobileqq.activity.SplashActivity;
import com.tencent.mobileqq.activity.aio.AIOUtils;
import com.tencent.mobileqq.activity.aio.BaseBubbleBuilder;
import com.tencent.mobileqq.activity.aio.BaseBubbleBuilder.TouchDelegate;
import com.tencent.mobileqq.activity.aio.BaseBubbleBuilder.ViewHolder;
import com.tencent.mobileqq.activity.aio.BaseChatItemLayout;
import com.tencent.mobileqq.activity.aio.OnLongClickAndTouchListener;
import com.tencent.mobileqq.activity.aio.SessionInfo;
import com.tencent.mobileqq.activity.aio.anim.AIOAnimationConatiner;
import com.tencent.mobileqq.activity.aio.photo.AIOGalleryUtils;
import com.tencent.mobileqq.activity.aio.photo.AIOImageProviderService;
import com.tencent.mobileqq.app.AppConstants;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.customviews.PicProgressView;
import com.tencent.mobileqq.data.ChatMessage;
import com.tencent.mobileqq.data.MessageForFile;
import com.tencent.mobileqq.drawable.BitmapDrawableWithMargin;
import com.tencent.mobileqq.filemanager.app.FileManagerEngine;
import com.tencent.mobileqq.filemanager.core.FileManagerDataCenter;
import com.tencent.mobileqq.filemanager.core.OnlineFileSessionCenter;
import com.tencent.mobileqq.filemanager.data.FileManagerEntity;
import com.tencent.mobileqq.filemanager.recreate.FileModel;
import com.tencent.mobileqq.filemanager.util.FMDialogUtil;
import com.tencent.mobileqq.filemanager.util.FMToastUtil;
import com.tencent.mobileqq.filemanager.util.FileManagerReporter;
import com.tencent.mobileqq.filemanager.util.FileManagerReporter.fileAssistantReportData;
import com.tencent.mobileqq.filemanager.util.FileManagerUtil;
import com.tencent.mobileqq.filemanager.util.FilePicURLDrawlableHelper;
import com.tencent.mobileqq.filemanager.util.FilePicURLDrawlableHelper.AIOImgInfo;
import com.tencent.mobileqq.filemanager.util.FileUtil;
import com.tencent.mobileqq.filemanager.util.QFileUtils;
import com.tencent.mobileqq.filemanager.widget.AsyncImageView;
import com.tencent.mobileqq.forward.ForwardBaseOption;
import com.tencent.mobileqq.forward.ForwardFileOption;
import com.tencent.mobileqq.ocr.OCRManager;
import com.tencent.mobileqq.service.message.MessageCache;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.transfile.URLDrawableHelper;
import com.tencent.mobileqq.utils.FileUtils;
import com.tencent.mobileqq.utils.MsgUtils;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.mobileqq.utils.dialogutils.QQCustomMenu;
import com.tencent.mobileqq.utils.dialogutils.QQCustomMenuItem;
import com.tencent.mobileqq.widget.BubbleImageView;
import com.tencent.mobileqq.widget.PhotoProgressDrawable;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import com.tencent.theme.SkinnableBitmapDrawable;
import com.tencent.widget.ActionSheet;
import com.tencent.widget.ActionSheetHelper;
import cooperation.peak.PeakUtils;
import cooperation.qqfav.QfavBuilder;
import java.net.URL;
import mqq.app.AccountNotMatchException;
import mqq.app.AppRuntime;
import mqq.app.MobileQQ;
import utq;
import uts;
import utt;
import utv;
import utw;
import utx;
import uty;
import utz;

public class FilePicItemBuilder
  extends BaseBubbleBuilder
{
  FileManagerEntity a;
  public float b;
  public int b;
  public Handler b;
  public float c;
  public int c;
  public boolean c;
  public float d;
  int d;
  int e;
  
  public FilePicItemBuilder(QQAppInterface paramQQAppInterface, BaseAdapter paramBaseAdapter, Context paramContext, SessionInfo paramSessionInfo, AIOAnimationConatiner paramAIOAnimationConatiner)
  {
    super(paramQQAppInterface, paramBaseAdapter, paramContext, paramSessionInfo, paramAIOAnimationConatiner);
    this.jdField_b_of_type_Float = 0.5625F;
    this.jdField_c_of_type_Float = 1.777778F;
    this.jdField_d_of_type_Float = 1.333333F;
    this.jdField_b_of_type_AndroidOsHandler = new Handler();
    this.jdField_c_of_type_Boolean = false;
    this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity = null;
  }
  
  private URLDrawable a(FileManagerEntity paramFileManagerEntity, MessageForFile paramMessageForFile, Context paramContext, URL paramURL, utz paramutz)
  {
    if (QLog.isColorLevel()) {
      QLog.i("FilePicItemBuilder<FileAssistant>", 1, "Id[" + paramFileManagerEntity.nSessionId + "] picFile entity size(wh)[" + paramFileManagerEntity.imgWidth + ":" + paramFileManagerEntity.imgHeight + "]");
    }
    int k = this.jdField_b_of_type_Int;
    int m = this.jdField_c_of_type_Int;
    paramMessageForFile = FilePicURLDrawlableHelper.a(paramFileManagerEntity.imgWidth, paramFileManagerEntity.imgHeight, paramFileManagerEntity.strMiddleThumPath);
    int j = k;
    int i = m;
    if (paramMessageForFile.jdField_a_of_type_Int > 0)
    {
      j = k;
      i = m;
      if (paramMessageForFile.jdField_b_of_type_Int > 0)
      {
        j = paramMessageForFile.jdField_a_of_type_Int;
        i = paramMessageForFile.jdField_b_of_type_Int;
      }
    }
    if (QLog.isColorLevel()) {
      QLog.i("FilePicItemBuilder<FileAssistant>", 1, "Id[" + paramFileManagerEntity.nSessionId + "] show AIOFilePicItem use size(wh)[" + j + ":" + i + "]");
    }
    paramutz.e = j;
    paramutz.f = i;
    if (paramURL != null)
    {
      paramMessageForFile = paramURL.toString();
      if ((BaseApplicationImpl.sImageCache != null) && (BaseApplicationImpl.sImageCache.get(paramMessageForFile) != null))
      {
        paramContext = URLDrawableHelper.a(paramURL, 0, 0, null, null, true, 0.0F);
        paramutz.jdField_a_of_type_Boolean = true;
        return paramContext;
      }
    }
    paramMessageForFile = null;
    if ((URLDrawableHelper.b() instanceof SkinnableBitmapDrawable))
    {
      paramMessageForFile = ((SkinnableBitmapDrawable)URLDrawableHelper.b()).getBitmap();
      label277:
      paramContext = URLDrawable.URLDrawableOptions.obtain();
      paramContext.mRequestWidth = j;
      paramContext.mRequestHeight = i;
      paramContext.mLoadingDrawable = URLDrawableHelper.b();
      paramContext.mFailedDrawable = URLDrawableHelper.a();
      paramContext.mGifRoundCorner = 12.0F;
      if (paramMessageForFile != null) {
        paramContext.mLoadingDrawable = new BitmapDrawableWithMargin(this.jdField_a_of_type_AndroidContentContext.getResources(), paramMessageForFile, j, i, -921103);
      }
      if (paramURL == null) {
        break label414;
      }
      paramMessageForFile = URLDrawable.getDrawable(paramURL, paramContext);
      paramMessageForFile.setAutoDownload(true);
      paramutz.jdField_a_of_type_Boolean = true;
    }
    for (;;)
    {
      paramContext = paramMessageForFile;
      if (paramFileManagerEntity.imgWidth > 0) {
        break;
      }
      paramContext = paramMessageForFile;
      if (paramFileManagerEntity.imgHeight > 0) {
        break;
      }
      FileManagerUtil.e(paramFileManagerEntity);
      return paramMessageForFile;
      if (!(URLDrawableHelper.b() instanceof BitmapDrawable)) {
        break label277;
      }
      paramMessageForFile = ((BitmapDrawable)URLDrawableHelper.b()).getBitmap();
      break label277;
      label414:
      paramContext.mPlayGifImage = false;
      if (FileUtil.b(paramFileManagerEntity.getFilePath())) {
        ThreadManager.executeOnSubThread(new utq(this, paramFileManagerEntity));
      }
      if (FilePicURLDrawlableHelper.b(paramFileManagerEntity)) {
        this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(paramFileManagerEntity, 7);
      }
      for (;;)
      {
        paramMessageForFile = AsyncImageView.a(AppConstants.aI, j, i, null, false, false, true);
        if (paramMessageForFile != null) {
          break;
        }
        return null;
        this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(paramFileManagerEntity, 5);
      }
      paramMessageForFile = URLDrawable.getDrawable(paramMessageForFile, paramContext);
      paramMessageForFile.setProgressDrawable(new PhotoProgressDrawable(URLDrawableHelper.a(), 0, false));
      if (FilePicURLDrawlableHelper.a(paramFileManagerEntity)) {
        paramMessageForFile.setAutoDownload(true);
      } else {
        paramMessageForFile.setAutoDownload(false);
      }
    }
  }
  
  public static void a(Context paramContext, View paramView, MessageForFile paramMessageForFile, SessionInfo paramSessionInfo)
  {
    paramView = AnimationUtils.a(paramView);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("KEY_THUMBNAL_BOUND", paramView);
    if ((((paramContext instanceof ChatActivity)) || ((paramContext instanceof SplashActivity))) && (!(paramContext instanceof MultiForwardActivity)))
    {
      int i = ((FragmentActivity)paramContext).getChatFragment().a().f();
      localBundle.putInt("extra.AIO_CURRENT_PANEL_STATE", i);
      if (i == 1)
      {
        paramView = (InputMethodManager)paramContext.getSystemService("input_method");
        if (paramView != null) {
          paramView.toggleSoftInput(1, 0);
        }
      }
    }
    if (paramSessionInfo.jdField_a_of_type_Int == 1)
    {
      localBundle.putBoolean("extra.CAN_FORWARD_TO_GROUP_ALBUM", true);
      localBundle.putString("extra.GROUP_UIN", paramSessionInfo.jdField_a_of_type_JavaLangString);
      localBundle.putString("extra.GROUP_CODE", paramSessionInfo.b);
    }
    if ((paramSessionInfo.jdField_a_of_type_Int == 1) || (paramSessionInfo.jdField_a_of_type_Int == 3000))
    {
      localBundle.putInt("extra.EXTRA_FORWARD_TO_QZONE_SRC", 2);
      localBundle.putBoolean("extra.IS_FROM_MULTI_MSG", paramMessageForFile.isMultiMsg);
      localBundle.putInt("extra.MOBILE_QQ_PROCESS_ID", Process.myPid());
      paramView = paramMessageForFile.selfuin;
      if (!paramMessageForFile.isMultiMsg) {
        break label386;
      }
    }
    label386:
    for (;;)
    {
      try
      {
        AppRuntime localAppRuntime = MobileQQ.sMobileQQ.waitAppRuntime(null);
        Object localObject = paramView;
        if ((localAppRuntime instanceof QQAppInterface)) {
          localObject = localAppRuntime.getAccount();
        }
        paramView = (View)localObject;
        boolean bool = OCRManager.a(paramMessageForFile.selfuin, 1);
        localBundle.putBoolean("extra.OCR", bool);
        if (bool)
        {
          localObject = OCRManager.a(paramMessageForFile.selfuin);
          if (!TextUtils.isEmpty((CharSequence)localObject)) {
            localBundle.putString("extra.OCR_TEXT", (String)localObject);
          }
        }
        localBundle.putInt("forward_source_uin_type", paramSessionInfo.jdField_a_of_type_Int);
        localBundle.putString("uin", paramMessageForFile.frienduin);
      }
      catch (Exception localException)
      {
        try
        {
          paramSessionInfo = (QQAppInterface)BaseApplicationImpl.sApplication.getAppRuntime(paramView);
          PeakUtils.a(paramContext, localBundle, new AIOImageProviderService(paramView, paramMessageForFile.frienduin, paramMessageForFile.istroop, paramMessageForFile), AIOGalleryUtils.a(paramMessageForFile, paramSessionInfo), -1);
          if (QLog.isColorLevel()) {
            QLog.i("FilePicItemBuilder<FileAssistant>", 2, "PicItemBuilder.enterImagePreview()");
          }
          return;
          localBundle.putInt("extra.EXTRA_FORWARD_TO_QZONE_SRC", 1);
          break;
          localException = localException;
        }
        catch (AccountNotMatchException paramContext)
        {
          paramContext.printStackTrace();
        }
      }
    }
  }
  
  private void a(String paramString1, String paramString2, utz paramutz)
  {
    if (paramutz.jdField_a_of_type_AndroidWidgetRelativeLayout != null)
    {
      paramutz.jdField_a_of_type_AndroidWidgetRelativeLayout.removeAllViews();
      ((RelativeLayout)paramutz.jdField_a_of_type_AndroidViewView).removeView(paramutz.jdField_a_of_type_AndroidWidgetRelativeLayout);
    }
    RelativeLayout localRelativeLayout = new RelativeLayout(this.jdField_a_of_type_AndroidContentContext);
    localRelativeLayout.setId(2131361958);
    localRelativeLayout.setBackgroundResource(2130838361);
    paramutz.jdField_a_of_type_AndroidWidgetRelativeLayout = localRelativeLayout;
    Object localObject1 = new RelativeLayout.LayoutParams(-1, AIOUtils.a(55.0F, this.jdField_a_of_type_AndroidContentContext.getResources()));
    ((RelativeLayout.LayoutParams)localObject1).addRule(12);
    ((RelativeLayout)paramutz.jdField_a_of_type_AndroidViewView).addView(localRelativeLayout, (ViewGroup.LayoutParams)localObject1);
    ((RelativeLayout.LayoutParams)localObject1).addRule(5, 2131366616);
    ((RelativeLayout.LayoutParams)localObject1).addRule(7, 2131366616);
    int i = QFileUtils.a(paramutz.e, paramutz.f);
    localObject1 = new TextView(this.jdField_a_of_type_AndroidContentContext);
    ((TextView)localObject1).setId(2131361963);
    ((TextView)localObject1).setTextSize(2, 12.0F);
    ((TextView)localObject1).setTextColor(-1);
    Object localObject2 = new RelativeLayout.LayoutParams(-1, -2);
    ((RelativeLayout.LayoutParams)localObject2).leftMargin = AIOUtils.a(7.0F, this.jdField_a_of_type_AndroidContentContext.getResources());
    ((RelativeLayout.LayoutParams)localObject2).rightMargin = AIOUtils.a(7.0F, this.jdField_a_of_type_AndroidContentContext.getResources());
    ((RelativeLayout.LayoutParams)localObject2).bottomMargin = AIOUtils.a(7.0F, this.jdField_a_of_type_AndroidContentContext.getResources());
    ((RelativeLayout.LayoutParams)localObject2).addRule(12);
    localRelativeLayout.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
    localObject2 = new TextView(this.jdField_a_of_type_AndroidContentContext, null);
    ((TextView)localObject2).setId(2131361962);
    ((TextView)localObject2).setTextSize(2, 14.0F);
    ((TextView)localObject2).setTextColor(-1);
    ((TextView)localObject2).setSingleLine();
    ((TextView)localObject2).setEllipsize(TextUtils.TruncateAt.END);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.leftMargin = AIOUtils.a(7.0F, this.jdField_a_of_type_AndroidContentContext.getResources());
    localLayoutParams.rightMargin = AIOUtils.a(7.0F, this.jdField_a_of_type_AndroidContentContext.getResources());
    localLayoutParams.bottomMargin = AIOUtils.a(7.0F, this.jdField_a_of_type_AndroidContentContext.getResources());
    if (i == 1)
    {
      localLayoutParams.addRule(12);
      localLayoutParams.addRule(2, 2131361963);
      localRelativeLayout.addView((View)localObject2, localLayoutParams);
      paramString1 = QFileUtils.a(this.jdField_a_of_type_AndroidContentContext, i, paramutz.e, (TextView)localObject2, (TextView)localObject1, paramString1, paramString2);
      switch (i)
      {
      }
    }
    for (;;)
    {
      ((TextView)localObject2).setText(paramString1);
      ((TextView)localObject1).setText(paramString2);
      return;
      localLayoutParams.addRule(12);
      break;
      ((TextView)localObject2).setLines(2);
      ((TextView)localObject2).setMaxLines(2);
      ((TextView)localObject1).setGravity(3);
      continue;
      ((TextView)localObject2).setLines(1);
      ((TextView)localObject2).setMaxLines(1);
      ((TextView)localObject1).setGravity(5);
    }
  }
  
  @TargetApi(16)
  private void a(utz paramutz)
  {
    FrameLayout localFrameLayout = new FrameLayout(this.jdField_a_of_type_AndroidContentContext);
    float f = this.jdField_a_of_type_Float;
    Object localObject = new AIOFilePicMask(Color.parseColor("#D8DAE0"), 255, f * 14.0F);
    if (Build.VERSION.SDK_INT >= 16) {
      localFrameLayout.setBackground((Drawable)localObject);
    }
    for (;;)
    {
      localObject = new TextView(this.jdField_a_of_type_AndroidContentContext);
      ((TextView)localObject).setGravity(17);
      ((TextView)localObject).setTextColor(Color.rgb(178, 182, 195));
      ((TextView)localObject).setText(2131433434);
      ((TextView)localObject).setCompoundDrawablePadding(AIOUtils.a(7.0F, this.jdField_a_of_type_AndroidContentContext.getResources()));
      ((TextView)localObject).setCompoundDrawablesWithIntrinsicBounds(0, 2130845457, 0, 0);
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
      localLayoutParams.gravity = 17;
      localFrameLayout.addView((View)localObject, localLayoutParams);
      localObject = new RelativeLayout.LayoutParams(paramutz.e, paramutz.f);
      ((RelativeLayout)paramutz.jdField_a_of_type_AndroidViewView).addView(localFrameLayout, (ViewGroup.LayoutParams)localObject);
      paramutz.jdField_a_of_type_AndroidWidgetFrameLayout = localFrameLayout;
      return;
      localFrameLayout.setBackgroundDrawable((Drawable)localObject);
    }
  }
  
  private void a(utz paramutz, FileManagerEntity paramFileManagerEntity)
  {
    int j = 1;
    if (paramFileManagerEntity != null) {}
    int i;
    switch (paramFileManagerEntity.status)
    {
    default: 
      i = 0;
      j = 0;
      label65:
      if (j != 0) {
        if (paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView == null)
        {
          paramFileManagerEntity = new PicProgressView(this.jdField_a_of_type_AndroidContentContext);
          paramFileManagerEntity.setRadius(this.jdField_a_of_type_Float * 15.0F, false);
          paramFileManagerEntity.setSharpCornerCor(BubbleImageView.a);
          paramFileManagerEntity.setShowCorner(false);
          paramFileManagerEntity.setProgressBackgroudColor(2130706432);
          RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
          localLayoutParams.addRule(6, 2131366616);
          localLayoutParams.addRule(8, 2131366616);
          localLayoutParams.addRule(5, 2131366616);
          localLayoutParams.addRule(7, 2131366616);
          ((RelativeLayout)paramutz.jdField_a_of_type_AndroidViewView).addView(paramFileManagerEntity, localLayoutParams);
          paramFileManagerEntity.setProgress(0);
          paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView = paramFileManagerEntity;
          paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView.setProgressKey(paramutz.jdField_a_of_type_ComTencentMobileqqDataChatMessage.frienduin + paramutz.jdField_a_of_type_ComTencentMobileqqDataChatMessage.uniseq);
          label233:
          paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView.setVisibility(0);
        }
      }
      break;
    }
    for (;;)
    {
      if ((i != 0) && (paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView != null))
      {
        if (paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView.a(paramutz.jdField_a_of_type_ComTencentMobileqqDataChatMessage.frienduin + paramutz.jdField_a_of_type_ComTencentMobileqqDataChatMessage.uniseq)) {
          break label447;
        }
        ((RelativeLayout)paramutz.jdField_a_of_type_AndroidViewView).removeView(paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView);
        paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView = null;
      }
      return;
      i = 0;
      j = 0;
      break label65;
      i = 0;
      break label65;
      if (9 != paramFileManagerEntity.nOpType) {
        break;
      }
      i = 0;
      break label65;
      i = 1;
      j = 0;
      break label65;
      paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView.setProgress((int)(paramFileManagerEntity.fProgress * 100.0F));
      break label233;
      if (paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView != null) {
        if (!paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView.a(paramutz.jdField_a_of_type_ComTencentMobileqqDataChatMessage.frienduin + paramutz.jdField_a_of_type_ComTencentMobileqqDataChatMessage.uniseq))
        {
          ((RelativeLayout)paramutz.jdField_a_of_type_AndroidViewView).removeView(paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView);
          paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView = null;
        }
        else
        {
          paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView.setProgress(100);
        }
      }
    }
    label447:
    paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView.setProgress(100);
  }
  
  private boolean a(utz paramutz, FileManagerEntity paramFileManagerEntity)
  {
    boolean bool = false;
    int i;
    if ((paramutz.jdField_a_of_type_Boolean) && ((paramFileManagerEntity.status == -1) || (paramFileManagerEntity.status == 1) || (paramFileManagerEntity.status == 0) || (paramFileManagerEntity.status == 3) || (paramFileManagerEntity.status == 13)))
    {
      i = 1;
      if (paramFileManagerEntity.status != 16) {
        break label84;
      }
    }
    label84:
    for (int j = 1;; j = 0)
    {
      if ((i != 0) || (j != 0)) {
        bool = true;
      }
      return bool;
      i = 0;
      break;
    }
  }
  
  private boolean b(FileManagerEntity paramFileManagerEntity)
  {
    boolean bool = true;
    if (paramFileManagerEntity == null) {
      return false;
    }
    switch (paramFileManagerEntity.status)
    {
    case 1: 
    case 2: 
    case 4: 
    case 9: 
    case 12: 
    case 13: 
    case 15: 
    default: 
      bool = false;
    }
    for (;;)
    {
      return bool;
      if ((paramFileManagerEntity.status != 0) || (paramFileManagerEntity.isSend() != true)) {
        break;
      }
      continue;
      if ((paramFileManagerEntity.isSend() != true) || (paramFileManagerEntity.bOnceSuccess)) {
        break;
      }
      continue;
      if (13 != paramFileManagerEntity.nOpType) {
        break;
      }
      continue;
      if (10 == paramFileManagerEntity.nOpType)
      {
        bool = false;
      }
      else
      {
        bool = false;
        continue;
        if (13 != paramFileManagerEntity.nOpType) {
          break;
        }
        continue;
        if (paramFileManagerEntity.isSend() != true) {
          break;
        }
      }
    }
  }
  
  public int a(ChatMessage paramChatMessage)
  {
    return 0;
  }
  
  protected View a(ChatMessage paramChatMessage, BaseBubbleBuilder.ViewHolder paramViewHolder, View paramView, BaseChatItemLayout paramBaseChatItemLayout, OnLongClickAndTouchListener paramOnLongClickAndTouchListener)
  {
    MessageForFile localMessageForFile = (MessageForFile)paramChatMessage;
    paramChatMessage = null;
    if (utz.class.isInstance(paramViewHolder))
    {
      paramViewHolder = (utz)paramViewHolder;
      paramChatMessage = paramView;
      if (paramChatMessage != null) {
        break label333;
      }
      paramChatMessage = new RelativeLayout(this.jdField_a_of_type_AndroidContentContext);
      paramView = new BubbleImageView(this.jdField_a_of_type_AndroidContentContext);
      paramView.setId(2131366616);
      paramView.setAdjustViewBounds(true);
      paramView.setScaleType(ImageView.ScaleType.CENTER_CROP);
      paramView.setRadius(15.0F);
      paramView.d(false);
      paramView.setShowEdge(true);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams.addRule(15);
      paramChatMessage.addView(paramView, localLayoutParams);
      paramChatMessage.setOnClickListener(this);
      paramChatMessage.setOnTouchListener(paramOnLongClickAndTouchListener);
      paramChatMessage.setOnLongClickListener(paramOnLongClickAndTouchListener);
      paramViewHolder.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView = paramView;
    }
    label333:
    for (;;)
    {
      paramView = paramViewHolder.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView;
      this.jdField_d_of_type_Int = BaseChatItemLayout.e;
      this.e = ((int)(BaseChatItemLayout.e * this.jdField_b_of_type_Float));
      this.jdField_c_of_type_Int = this.jdField_d_of_type_Int;
      this.jdField_b_of_type_Int = this.e;
      paramView.setMinimumWidth(this.e);
      paramView.setMinimumHeight(this.e);
      paramView.setMaxWidth(this.jdField_d_of_type_Int);
      paramView.setMaxHeight(this.jdField_d_of_type_Int);
      paramView = FileManagerUtil.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, localMessageForFile);
      paramViewHolder.jdField_a_of_type_AndroidViewView = paramChatMessage;
      a(paramBaseChatItemLayout, localMessageForFile, paramViewHolder, paramView, false);
      return paramChatMessage;
      paramView = new utz(this);
      paramView.jdField_b_of_type_JavaLangStringBuilder = paramViewHolder.jdField_b_of_type_JavaLangStringBuilder;
      paramView.jdField_a_of_type_ComTencentMobileqqDataChatMessage = paramViewHolder.jdField_a_of_type_ComTencentMobileqqDataChatMessage;
      paramView.jdField_a_of_type_AndroidViewView = paramViewHolder.jdField_a_of_type_AndroidViewView;
      paramView.jdField_a_of_type_ComTencentMobileqqBubbleBubbleInfo = paramViewHolder.jdField_a_of_type_ComTencentMobileqqBubbleBubbleInfo;
      paramView.jdField_a_of_type_ComTencentMobileqqActivityAioBaseChatItemLayout = paramViewHolder.jdField_a_of_type_ComTencentMobileqqActivityAioBaseChatItemLayout;
      paramView.jdField_a_of_type_Int = paramViewHolder.jdField_a_of_type_Int;
      paramView.jdField_b_of_type_Int = paramViewHolder.jdField_b_of_type_Int;
      paramView.jdField_c_of_type_Int = paramViewHolder.jdField_c_of_type_Int;
      paramView.jdField_d_of_type_Int = paramViewHolder.jdField_d_of_type_Int;
      paramView.jdField_a_of_type_JavaLangString = paramViewHolder.jdField_a_of_type_JavaLangString;
      paramViewHolder = paramView;
      break;
    }
  }
  
  public BaseBubbleBuilder.TouchDelegate a(View paramView)
  {
    if ((paramView != null) && (paramView.getParent() != null))
    {
      paramView = ((View)paramView.getParent()).getTag();
      if ((paramView != null) && (utz.class.isInstance(paramView))) {
        return ((utz)paramView).jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView;
      }
    }
    return null;
  }
  
  protected BaseBubbleBuilder.ViewHolder a()
  {
    return new utz(this);
  }
  
  protected String a(ChatMessage paramChatMessage)
  {
    if (MsgUtils.a(paramChatMessage.issend)) {
      return "发出图片文件";
    }
    return "发来图片文件";
  }
  
  public void a(int paramInt, Context paramContext, ChatMessage paramChatMessage)
  {
    MessageForFile localMessageForFile = (MessageForFile)paramChatMessage;
    FileManagerEntity localFileManagerEntity = FileManagerUtil.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, localMessageForFile);
    switch (paramInt)
    {
    default: 
      super.a(paramInt, paramContext, paramChatMessage);
    }
    for (;;)
    {
      this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity = null;
      return;
      long l1 = MessageCache.a();
      long l2 = paramChatMessage.time;
      if ((paramChatMessage.msgtype == -2005) && (paramChatMessage.istroop == 3000) && (l1 - l2 > 604800L))
      {
        FMToastUtil.a("该文件发送超过7天，撤回失败。");
        ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "CliOper", "", "", "0X80056B1", "0X80056B1", 0, 0, "6", "", "", "");
        return;
      }
      a(paramChatMessage);
      FileManagerReporter.a("0X8005E4B");
      continue;
      ChatActivityFacade.a(this.jdField_a_of_type_AndroidContentContext, this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, paramChatMessage);
      this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(localFileManagerEntity);
      ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "CliOper", "", "", "0X8006447", "0X8006447", 0, 0, "6", "", "", "");
      continue;
      super.c(paramChatMessage);
      continue;
      if (localFileManagerEntity.status == 16)
      {
        FMToastUtil.a(2131428188);
      }
      else
      {
        ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "CliOper", "", "", "0X800644C", "0X800644C", 0, 0, "6", "", "", "");
        if (FileModel.a(localFileManagerEntity).a(false))
        {
          FMDialogUtil.a(paramContext, 2131428241, 2131428238, new utw(this, localMessageForFile, paramContext));
        }
        else
        {
          FileManagerUtil.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, localMessageForFile, paramContext);
          continue;
          if (localFileManagerEntity.status == 16)
          {
            FMToastUtil.a(2131428188);
          }
          else
          {
            paramContext = new FileManagerReporter.fileAssistantReportData();
            paramContext.b = "file_forward";
            paramContext.jdField_a_of_type_Int = 9;
            paramContext.jdField_a_of_type_Long = localFileManagerEntity.fileSize;
            paramContext.c = FileUtil.a(localFileManagerEntity.fileName);
            paramContext.d = FileManagerUtil.a(localFileManagerEntity.getCloudType(), localFileManagerEntity.peerType);
            FileManagerReporter.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getCurrentAccountUin(), paramContext);
            paramContext = new Bundle();
            paramContext.putInt("forward_type", 0);
            paramContext.putBoolean("not_forward", true);
            paramContext.putParcelable("fileinfo", ForwardFileOption.a(localFileManagerEntity, paramChatMessage));
            paramChatMessage = new Intent();
            paramChatMessage.putExtras(paramContext);
            paramChatMessage.putExtra("forward_text", "已选择" + FileManagerUtil.d(localFileManagerEntity.fileName) + "，大小" + FileUtil.a(localFileManagerEntity.fileSize) + "。");
            paramChatMessage.putExtra("direct_send_if_dataline_forward", true);
            paramChatMessage.putExtra("forward _key_nojump", true);
            paramChatMessage.putExtra("isPic", true);
            paramChatMessage.putExtra("forward_filepath", localFileManagerEntity.getFilePath());
            if (!NetworkUtil.d(BaseApplication.getContext())) {
              QQToast.a(this.jdField_a_of_type_AndroidContentContext, 2131434596, 1).b(this.jdField_a_of_type_AndroidContentContext.getResources().getDimensionPixelSize(2131558448));
            }
            for (;;)
            {
              ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "CliOper", "", "", "0X8004045", "0X8004045", 0, 0, "6", "", "", "");
              break;
              ForwardBaseOption.a((Activity)this.jdField_a_of_type_AndroidContentContext, paramChatMessage, 21);
            }
            if (localFileManagerEntity.status == 16)
            {
              FMToastUtil.a(2131428188);
            }
            else
            {
              FileManagerUtil.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, localMessageForFile, paramContext);
              continue;
              if (localFileManagerEntity.status == 16)
              {
                FMToastUtil.a(2131428188);
              }
              else
              {
                ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "CliOper", "", "", "0X800644D", "0X800644D", 0, 0, "6", "", "", "");
                FileManagerReporter.a("0X8005080");
                if (!NetworkUtil.d(paramContext))
                {
                  FMToastUtil.a(2131428327);
                  return;
                }
                FileModel.a(localFileManagerEntity).a(false, paramContext, new utx(this, localFileManagerEntity));
                this.jdField_a_of_type_AndroidWidgetBaseAdapter.notifyDataSetChanged();
                continue;
                FileManagerReporter.a("0X8005081");
                if (localFileManagerEntity.getCloudType() == 0)
                {
                  this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(localFileManagerEntity.nSessionId);
                }
                else
                {
                  this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(localFileManagerEntity.nSessionId);
                  this.jdField_a_of_type_AndroidWidgetBaseAdapter.notifyDataSetChanged();
                  continue;
                  FileManagerReporter.a("0X8005082");
                  if (!NetworkUtil.d(paramContext))
                  {
                    FMToastUtil.a(2131428327);
                    return;
                  }
                  boolean bool = localFileManagerEntity.isSend();
                  FileModel.a(localFileManagerEntity).a(bool, paramContext, new uty(this, localFileManagerEntity));
                  this.jdField_a_of_type_AndroidWidgetBaseAdapter.notifyDataSetChanged();
                  continue;
                  this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(localFileManagerEntity.nSessionId);
                  b();
                  continue;
                  if (localFileManagerEntity.status == 16) {
                    FMToastUtil.a(2131428188);
                  } else {
                    new QfavBuilder(3).a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, (Activity)this.jdField_a_of_type_AndroidContentContext, localFileManagerEntity, paramChatMessage, false);
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  protected void a(View paramView)
  {
    super.a(paramView);
    utz localutz = (utz)AIOUtils.a(paramView);
    MessageForFile localMessageForFile = (MessageForFile)localutz.jdField_a_of_type_ComTencentMobileqqDataChatMessage;
    BaseChatItemLayout localBaseChatItemLayout = localutz.jdField_a_of_type_ComTencentMobileqqActivityAioBaseChatItemLayout;
    paramView = FileManagerUtil.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, localMessageForFile);
    if (paramView.getCloudType() == 5)
    {
      FileManagerUtil.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.jdField_a_of_type_AndroidContentContext, paramView);
      return;
    }
    this.jdField_a_of_type_AndroidContentContext.getString(2131433618);
    this.jdField_a_of_type_AndroidContentContext.getString(2131433619);
    String str;
    switch (paramView.nOpType)
    {
    case 6: 
    case 7: 
    default: 
      str = this.jdField_a_of_type_AndroidContentContext.getString(2131428109);
    }
    for (paramView = this.jdField_a_of_type_AndroidContentContext.getString(2131428107); localMessageForFile.isSendFromLocal(); paramView = this.jdField_a_of_type_AndroidContentContext.getString(2131428108))
    {
      ActionSheet localActionSheet = (ActionSheet)ActionSheetHelper.a(this.jdField_a_of_type_AndroidContentContext, null);
      localActionSheet.c(str);
      localActionSheet.d(this.jdField_a_of_type_AndroidContentContext.getString(2131432998));
      localActionSheet.a(paramView);
      localActionSheet.a(new utt(this, localMessageForFile, localActionSheet, localBaseChatItemLayout, localutz));
      localActionSheet.show();
      return;
      str = this.jdField_a_of_type_AndroidContentContext.getString(2131428110);
    }
    paramView = (ActionSheet)ActionSheetHelper.a(this.jdField_a_of_type_AndroidContentContext, null);
    paramView.c(this.jdField_a_of_type_AndroidContentContext.getString(2131428110));
    paramView.d(this.jdField_a_of_type_AndroidContentContext.getString(2131432998));
    paramView.a(this.jdField_a_of_type_AndroidContentContext.getString(2131428108));
    paramView.a(new utv(this, localMessageForFile, paramView, localBaseChatItemLayout, localutz));
    paramView.show();
  }
  
  public void a(BaseChatItemLayout paramBaseChatItemLayout, MessageForFile paramMessageForFile, utz paramutz, FileManagerEntity paramFileManagerEntity, boolean paramBoolean)
  {
    if (paramFileManagerEntity == null) {
      break label5;
    }
    label5:
    while (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.isBackground_Pause) {
      return;
    }
    FileManagerUtil.c(paramFileManagerEntity);
    FileManagerUtil.b(paramFileManagerEntity);
    paramMessageForFile.fileName = paramFileManagerEntity.fileName;
    paramMessageForFile.fileSize = paramFileManagerEntity.fileSize;
    paramMessageForFile.status = paramFileManagerEntity.status;
    paramMessageForFile.urlAtServer = paramFileManagerEntity.strServerPath;
    paramMessageForFile.url = paramFileManagerEntity.getFilePath();
    paramMessageForFile.fileSizeString = FileUtil.a(paramFileManagerEntity.fileSize);
    if (paramutz.jdField_a_of_type_AndroidWidgetFrameLayout != null)
    {
      paramutz.jdField_a_of_type_AndroidWidgetFrameLayout.removeAllViews();
      ((RelativeLayout)paramutz.jdField_a_of_type_AndroidViewView).removeView(paramutz.jdField_a_of_type_AndroidWidgetFrameLayout);
    }
    if ((paramFileManagerEntity.status == 16) && (!FileManagerUtil.e(paramFileManagerEntity)))
    {
      paramMessageForFile = FilePicURLDrawlableHelper.a(paramFileManagerEntity);
      if ((paramMessageForFile.jdField_a_of_type_Int > 0) && (paramMessageForFile.jdField_b_of_type_Int > 0))
      {
        paramutz.e = paramMessageForFile.jdField_a_of_type_Int;
        paramutz.f = paramMessageForFile.jdField_b_of_type_Int;
        label165:
        paramutz.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView.setImageDrawable(null);
        paramutz.jdField_a_of_type_ComTencentImageURLDrawable = null;
        a(paramutz);
        label183:
        if (!a(paramutz, paramFileManagerEntity)) {
          break label376;
        }
        a(paramFileManagerEntity.fileName, FileUtils.a(paramFileManagerEntity.fileSize), paramutz);
      }
    }
    for (;;)
    {
      paramBaseChatItemLayout.setFailedIconVisable(b(paramFileManagerEntity), this);
      if (paramFileManagerEntity.isSend()) {
        break label410;
      }
      if (paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView == null) {
        break;
      }
      if (paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView.a(paramutz.jdField_a_of_type_ComTencentMobileqqDataChatMessage.frienduin + paramutz.jdField_a_of_type_ComTencentMobileqqDataChatMessage.uniseq)) {
        break label400;
      }
      ((RelativeLayout)paramutz.jdField_a_of_type_AndroidViewView).removeView(paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView);
      paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView = null;
      return;
      paramutz.e = this.jdField_b_of_type_Int;
      paramutz.f = this.jdField_c_of_type_Int;
      break label165;
      URL localURL = FilePicURLDrawlableHelper.b(paramFileManagerEntity);
      if ((paramutz.jdField_a_of_type_ComTencentImageURLDrawable != null) && (paramutz.jdField_a_of_type_ComTencentImageURLDrawable.getURL().equals(localURL))) {
        break label183;
      }
      paramMessageForFile = a(paramFileManagerEntity, paramMessageForFile, this.jdField_a_of_type_AndroidContentContext, localURL, paramutz);
      paramutz.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView.setImageDrawable(paramMessageForFile);
      paramutz.jdField_a_of_type_ComTencentImageURLDrawable = paramMessageForFile;
      break label183;
      label376:
      if (paramutz.jdField_a_of_type_AndroidWidgetRelativeLayout != null) {
        ((RelativeLayout)paramutz.jdField_a_of_type_AndroidViewView).removeView(paramutz.jdField_a_of_type_AndroidWidgetRelativeLayout);
      }
    }
    label400:
    paramutz.jdField_a_of_type_ComTencentMobileqqCustomviewsPicProgressView.setProgress(100);
    return;
    label410:
    a(paramutz, paramFileManagerEntity);
  }
  
  public boolean a(FileManagerEntity paramFileManagerEntity)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramFileManagerEntity != null) {
      if (paramFileManagerEntity.nOpType != 24)
      {
        bool1 = bool2;
        if (paramFileManagerEntity.nOpType != 25) {}
      }
      else if (paramFileManagerEntity.status != 2)
      {
        bool1 = bool2;
        if (paramFileManagerEntity.status != 0) {}
      }
      else
      {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public QQCustomMenuItem[] a(View paramView)
  {
    paramView = (MessageForFile)AIOUtils.a(paramView);
    FileManagerEntity localFileManagerEntity = FileManagerUtil.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, paramView);
    QQCustomMenu localQQCustomMenu = new QQCustomMenu();
    if ((paramView.isSendFromLocal()) && (localFileManagerEntity.status == 2)) {
      localQQCustomMenu.a(2131375338, this.jdField_a_of_type_AndroidContentContext.getString(2131433622), 2130838299);
    }
    for (;;)
    {
      if (QLog.isColorLevel()) {
        QLog.i("msgrevoke", 2, "FileMenuitem entity.status:" + localFileManagerEntity.status);
      }
      return localQQCustomMenu.a();
      if (!FilePicURLDrawlableHelper.a(localFileManagerEntity))
      {
        a(paramView, localQQCustomMenu);
        if ((localFileManagerEntity.getCloudType() != 0) && (!a(localFileManagerEntity)))
        {
          if (!localFileManagerEntity.sendCloudUnsuccessful()) {
            localQQCustomMenu.a(2131375357, this.jdField_a_of_type_AndroidContentContext.getString(2131428121), 2130838309);
          }
          localQQCustomMenu.a(2131366733, this.jdField_a_of_type_AndroidContentContext.getString(2131428123), 2130838308);
        }
      }
      if ((localFileManagerEntity.status == 1) || (localFileManagerEntity.status == -1) || ((localFileManagerEntity.status == 3) && (localFileManagerEntity.nOpType == 1))) {
        a(localQQCustomMenu, this.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_Int, paramView);
      }
      ChatActivityFacade.a(localQQCustomMenu, this.jdField_a_of_type_AndroidContentContext, this.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_Int);
      super.b(localQQCustomMenu, this.jdField_a_of_type_AndroidContentContext);
    }
  }
  
  public void onClick(View paramView)
  {
    if (this.jdField_c_of_type_Boolean) {}
    MessageForFile localMessageForFile;
    FileManagerEntity localFileManagerEntity;
    do
    {
      do
      {
        return;
        this.jdField_c_of_type_Boolean = true;
        new Handler().postDelayed(new uts(this), 1000L);
        AIOUtils.m = true;
      } while (super.a());
      if (paramView.getId() != 2131361877) {
        break;
      }
      paramView = AIOUtils.a(paramView);
      if (paramView == null)
      {
        QLog.w("FilePicItemBuilder<FileAssistant>", 1, "holder tag is null");
        return;
      }
      if (!utz.class.isInstance(paramView))
      {
        QLog.w("FilePicItemBuilder<FileAssistant>", 1, "holder tag class[" + paramView.getClass().getName() + "] is not Holder");
        return;
      }
      paramView = (utz)paramView;
      localMessageForFile = (MessageForFile)paramView.jdField_a_of_type_ComTencentMobileqqDataChatMessage;
      localFileManagerEntity = FileManagerUtil.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, localMessageForFile);
    } while ((localFileManagerEntity.status == 16) && (!FileManagerUtil.e(localFileManagerEntity)));
    a(this.jdField_a_of_type_AndroidContentContext, paramView.jdField_a_of_type_ComTencentMobileqqWidgetBubbleImageView, localMessageForFile, this.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo);
    return;
    super.onClick(paramView);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     com.tencent.mobileqq.activity.aio.item.FilePicItemBuilder
 * JD-Core Version:    0.7.0.1
 */
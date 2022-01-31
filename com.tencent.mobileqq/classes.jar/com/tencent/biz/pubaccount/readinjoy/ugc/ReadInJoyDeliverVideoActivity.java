package com.tencent.biz.pubaccount.readinjoy.ugc;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.biz.pubaccount.PublicAccountReportUtils;
import com.tencent.biz.pubaccount.VideoReporter;
import com.tencent.biz.pubaccount.readinjoy.activity.ReadInJoyBaseDeliverActivity;
import com.tencent.biz.pubaccount.readinjoy.common.ReadInJoyUtils;
import com.tencent.biz.pubaccount.readinjoy.engine.ReadInJoyLogicEngine;
import com.tencent.biz.pubaccount.readinjoy.engine.ReadInJoyLogicEngineEventDispatcher;
import com.tencent.biz.pubaccount.readinjoy.engine.ReadInJoyObserver;
import com.tencent.biz.pubaccount.readinjoy.ugc.video.transfer.KingsMomentVideoDeliverController;
import com.tencent.biz.pubaccount.readinjoy.ugc.video.transfer.NormalVideoDeliverController;
import com.tencent.biz.pubaccount.readinjoy.ugc.video.transfer.VideoDeliverController;
import com.tencent.biz.pubaccount.readinjoy.ugc.video.transfer.VideoDeliverController.DeliverVideoTaskListener;
import com.tencent.biz.pubaccount.readinjoy.view.KandianUrlImageView;
import com.tencent.biz.pubaccount.readinjoy.view.imageloader.ImageRequest;
import com.tencent.biz.widgets.ShareAioResultDialog;
import com.tencent.mobileqq.activity.QQBrowserActivity;
import com.tencent.mobileqq.activity.aio.AIOUtils;
import com.tencent.mobileqq.activity.shortvideo.ShortVideoPreviewActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.msf.core.NetConnInfoCenter;
import com.tencent.mobileqq.shortvideo.ShortVideoErrorReport;
import com.tencent.mobileqq.shortvideo.ShortVideoResourceManager;
import com.tencent.mobileqq.shortvideo.ShortVideoResourceManager.INet_ShortVideoResource;
import com.tencent.mobileqq.shortvideo.ShortVideoResourceStatus.ISVConfig;
import com.tencent.mobileqq.shortvideo.ShortVideoUtils;
import com.tencent.mobileqq.shortvideo.VideoEnvironment;
import com.tencent.mobileqq.shortvideo.util.ShortVideoTrimmer;
import com.tencent.mobileqq.statistics.StatisticCollector;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.mobileqq.widget.CircleProgress;
import com.tencent.qphone.base.util.QLog;
import com.tencent.util.MqqWeakReferenceHandler;
import cooperation.readinjoy.ReadInJoyHelper;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import lxy;
import lya;
import lyc;
import lyd;
import lye;
import lyf;
import lyg;
import lyh;
import lyi;
import mqq.app.AppRuntime;
import mqq.app.MobileQQ;
import mqq.os.MqqHandler;

public class ReadInJoyDeliverVideoActivity
  extends ReadInJoyBaseDeliverActivity
  implements Handler.Callback, View.OnTouchListener, VideoDeliverController.DeliverVideoTaskListener, ShortVideoResourceManager.INet_ShortVideoResource, ShortVideoResourceStatus.ISVConfig
{
  private long jdField_a_of_type_Long;
  private Bundle jdField_a_of_type_AndroidOsBundle;
  private View jdField_a_of_type_AndroidViewView;
  ReadInJoyObserver jdField_a_of_type_ComTencentBizPubaccountReadinjoyEngineReadInJoyObserver = new lya(this);
  private VideoDeliverController jdField_a_of_type_ComTencentBizPubaccountReadinjoyUgcVideoTransferVideoDeliverController;
  private KandianUrlImageView jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewKandianUrlImageView;
  private ShareAioResultDialog jdField_a_of_type_ComTencentBizWidgetsShareAioResultDialog;
  private CircleProgress jdField_a_of_type_ComTencentMobileqqWidgetCircleProgress;
  private final MqqHandler jdField_a_of_type_MqqOsMqqHandler = new MqqWeakReferenceHandler(Looper.getMainLooper(), this, true);
  private long jdField_b_of_type_Long;
  protected Dialog b;
  private View jdField_b_of_type_AndroidViewView;
  private TextView jdField_b_of_type_AndroidWidgetTextView;
  ReadInJoyObserver jdField_b_of_type_ComTencentBizPubaccountReadinjoyEngineReadInJoyObserver = new lyc(this);
  private long jdField_c_of_type_Long;
  private View jdField_c_of_type_AndroidViewView;
  private String jdField_c_of_type_JavaLangString;
  private long jdField_d_of_type_Long;
  private String jdField_d_of_type_JavaLangString;
  private long jdField_e_of_type_Long;
  private String jdField_e_of_type_JavaLangString;
  private long jdField_f_of_type_Long;
  private String jdField_f_of_type_JavaLangString;
  private long jdField_g_of_type_Long;
  private String jdField_g_of_type_JavaLangString;
  private long jdField_h_of_type_Long;
  private String jdField_h_of_type_JavaLangString;
  private int jdField_i_of_type_Int;
  private long jdField_i_of_type_Long;
  private String jdField_i_of_type_JavaLangString;
  private int jdField_j_of_type_Int;
  private String jdField_j_of_type_JavaLangString;
  private int jdField_k_of_type_Int;
  private String jdField_k_of_type_JavaLangString;
  private int jdField_l_of_type_Int;
  private String jdField_l_of_type_JavaLangString;
  private int jdField_m_of_type_Int;
  private String jdField_m_of_type_JavaLangString;
  private String jdField_n_of_type_JavaLangString = "";
  private boolean jdField_n_of_type_Boolean;
  private String jdField_o_of_type_JavaLangString;
  private boolean jdField_o_of_type_Boolean;
  private boolean p;
  private boolean q;
  private boolean r;
  private boolean s;
  private boolean t;
  
  private int a()
  {
    if (TextUtils.isEmpty(b())) {
      return 1;
    }
    return 2;
  }
  
  private void b(float paramFloat)
  {
    if (this.jdField_b_of_type_AndroidViewView.getVisibility() != 0) {
      this.jdField_b_of_type_AndroidViewView.setVisibility(0);
    }
    if (this.jdField_c_of_type_AndroidViewView.getVisibility() != 0) {
      this.jdField_c_of_type_AndroidViewView.setVisibility(0);
    }
    this.jdField_a_of_type_ComTencentMobileqqWidgetCircleProgress.setProgress(paramFloat);
  }
  
  private void c(int paramInt)
  {
    this.jdField_g_of_type_Long = System.currentTimeMillis();
    HashMap localHashMap = new HashMap();
    localHashMap.put("param_FailCode", String.valueOf(paramInt));
    StatisticCollector localStatisticCollector = StatisticCollector.a(this);
    String str = getAppRuntime().getAccount();
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      localStatisticCollector.a(str, "actReadInJoyDeliverUGCVideo", bool, this.jdField_g_of_type_Long - this.jdField_f_of_type_Long, 0L, localHashMap, "");
      return;
    }
  }
  
  private void c(String paramString)
  {
    Intent localIntent = new Intent(this, ShortVideoPreviewActivity.class);
    localIntent.putExtra("PhotoConst.INIT_ACTIVITY_CLASS_NAME", ReadInJoyDeliverVideoActivity.class.getName());
    localIntent.putExtra("file_send_path", paramString);
    localIntent.putExtra("preview_only", true);
    startActivity(localIntent);
    overridePendingTransition(2131034373, 2131034375);
    PublicAccountReportUtils.a(this.app, "", "0X80081D9", "0X80081D9", 0, 0, "", "2", "", VideoReporter.a(null), false);
  }
  
  private void d(int paramInt)
  {
    this.jdField_i_of_type_Long = System.currentTimeMillis();
    HashMap localHashMap = new HashMap();
    localHashMap.put("param_FailCode", String.valueOf(paramInt));
    StatisticCollector localStatisticCollector = StatisticCollector.a(this);
    String str = getAppRuntime().getAccount();
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      localStatisticCollector.a(str, "actReadInJoyDeliverVideoSendRequest", bool, this.jdField_i_of_type_Long - this.jdField_h_of_type_Long, 0L, localHashMap, "");
      return;
    }
  }
  
  private void d(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      QLog.d("ReadInJoyDeliverVideoActivity", 2, "king moment cover url is null");
      return;
    }
    ImageRequest localImageRequest = new ImageRequest();
    try
    {
      localImageRequest.jdField_a_of_type_JavaNetURL = new URL(paramString);
      localImageRequest.b = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewKandianUrlImageView.getHeight();
      localImageRequest.jdField_a_of_type_Int = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewKandianUrlImageView.getWidth();
      this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewKandianUrlImageView.a(localImageRequest, new lye(this));
      return;
    }
    catch (MalformedURLException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  private void e(int paramInt)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("param_FailCode", String.valueOf(paramInt));
    long l1 = NetConnInfoCenter.getServerTimeMillis();
    long l2 = this.jdField_b_of_type_Long;
    StatisticCollector localStatisticCollector = StatisticCollector.a(this);
    String str = this.app.getCurrentAccountUin();
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      localStatisticCollector.a(str, "actReadInJoyUGCVideo", bool, l1 - l2, 0L, localHashMap, "");
      return;
    }
  }
  
  private void i()
  {
    Object localObject = ShortVideoTrimmer.a(this.jdField_f_of_type_JavaLangString);
    if ((localObject != null) && (localObject.length == 5))
    {
      this.jdField_j_of_type_Int = localObject[1];
      this.jdField_k_of_type_Int = localObject[2];
      this.jdField_a_of_type_Long = localObject[4];
      getIntent().putExtra("arg_video_width", this.jdField_j_of_type_Int);
      getIntent().putExtra("arg_video_height", this.jdField_k_of_type_Int);
      getIntent().putExtra("arg_video_duration", this.jdField_a_of_type_Long);
      if (QLog.isColorLevel()) {
        QLog.d("ReadInJoyDeliverVideoActivity", 2, "generateVideoInfo width=" + this.jdField_j_of_type_Int + ", height=" + this.jdField_k_of_type_Int + ", duration=" + this.jdField_a_of_type_Long);
      }
    }
    if (TextUtils.isEmpty(this.jdField_g_of_type_JavaLangString)) {
      if (this.jdField_a_of_type_Long < 3000L) {
        break label243;
      }
    }
    label243:
    for (localObject = ShortVideoUtils.a(this, this.jdField_f_of_type_JavaLangString, 640, 3000000L);; localObject = ShortVideoUtils.a(this, this.jdField_f_of_type_JavaLangString, 640))
    {
      this.jdField_g_of_type_JavaLangString = ShortVideoPreviewActivity.a((Bitmap)localObject);
      getIntent().putExtra("arg_video_cover", this.jdField_g_of_type_JavaLangString);
      if (QLog.isColorLevel()) {
        QLog.d("ReadInJoyDeliverVideoActivity", 2, "generateVideoInfo cover=" + this.jdField_g_of_type_JavaLangString);
      }
      return;
    }
  }
  
  private void j()
  {
    this.jdField_b_of_type_AndroidViewView.setVisibility(0);
    this.jdField_c_of_type_AndroidViewView.setVisibility(0);
    this.jdField_b_of_type_AndroidViewView.setOnClickListener(null);
  }
  
  private void k()
  {
    this.jdField_a_of_type_ComTencentMobileqqWidgetCircleProgress.setProgress(0.0F);
    this.jdField_b_of_type_AndroidViewView.setVisibility(8);
    this.jdField_c_of_type_AndroidViewView.setVisibility(8);
  }
  
  private void l()
  {
    if (this.jdField_a_of_type_ComTencentBizWidgetsShareAioResultDialog == null) {
      this.jdField_a_of_type_ComTencentBizWidgetsShareAioResultDialog = new ShareAioResultDialog(this);
    }
    this.jdField_a_of_type_ComTencentBizWidgetsShareAioResultDialog.a("发布成功");
    String str = this.app.getApplication().getString(2131430135);
    str = str + "王者荣耀";
    lyd locallyd = new lyd(this);
    this.jdField_a_of_type_ComTencentBizWidgetsShareAioResultDialog.a(str, locallyd);
    this.jdField_a_of_type_ComTencentBizWidgetsShareAioResultDialog.a(locallyd);
    this.jdField_a_of_type_ComTencentBizWidgetsShareAioResultDialog.show();
  }
  
  private void m()
  {
    if (QLog.isColorLevel()) {
      QLog.d("ReadInJoyDeliverVideoActivity", 2, "business url is " + this.jdField_o_of_type_JavaLangString);
    }
    if (TextUtils.isEmpty(this.jdField_o_of_type_JavaLangString)) {
      return;
    }
    Intent localIntent = new Intent(this, QQBrowserActivity.class);
    localIntent.putExtra("url", this.jdField_o_of_type_JavaLangString);
    startActivity(localIntent);
  }
  
  private void n()
  {
    if (Looper.myLooper() != Looper.getMainLooper()) {
      this.jdField_a_of_type_MqqOsMqqHandler.post(new lyf(this));
    }
    do
    {
      return;
      if (this.jdField_b_of_type_AndroidAppDialog == null)
      {
        this.jdField_b_of_type_AndroidAppDialog = a(this, null, getString(2131438885), new lyg(this), getString(2131438886), new lyh(this), getString(2131438884));
        this.jdField_b_of_type_AndroidAppDialog.setCanceledOnTouchOutside(false);
      }
    } while (this.jdField_b_of_type_AndroidAppDialog.isShowing());
    this.jdField_b_of_type_AndroidAppDialog.show();
  }
  
  private void o()
  {
    if (Looper.myLooper() != Looper.getMainLooper()) {
      this.jdField_a_of_type_MqqOsMqqHandler.post(new lyi(this));
    }
    while ((this.jdField_b_of_type_AndroidAppDialog == null) || (!this.jdField_b_of_type_AndroidAppDialog.isShowing())) {
      return;
    }
    this.jdField_b_of_type_AndroidAppDialog.dismiss();
  }
  
  private void p()
  {
    this.p = VideoEnvironment.c(this.app);
    this.q = VideoEnvironment.e(this.app);
    if (!this.p)
    {
      VideoEnvironment.a("ReadInJoyDeliverVideoActivity_AvCodecSo", "不支持短视频功能", null);
      return;
    }
    if (this.q)
    {
      VideoEnvironment.a("ReadInJoyDeliverVideoActivity_AvCodecSo", "短视频插件ready", null);
      return;
    }
    VideoEnvironment.a("ReadInJoyDeliverVideoActivity_AvCodecSo", "短视频插件not ready", null);
    if (NetworkUtil.g(null))
    {
      VideoEnvironment.a("ReadInJoyDeliverVideoActivity_AvCodecSo", "短视频插件配置下载中", null);
      ShortVideoResourceManager.a(this.app, this);
      this.r = true;
      return;
    }
    VideoEnvironment.a("ReadInJoyDeliverVideoActivity_AvCodecSo", "网络不可用，短视频插件下载失败", null);
  }
  
  private void q()
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (localInputMethodManager != null) {
      localInputMethodManager.hideSoftInputFromWindow(this.jdField_a_of_type_AndroidWidgetEditText.getWindowToken(), 0);
    }
  }
  
  protected void a()
  {
    this.jdField_f_of_type_Int = 178;
    super.a();
    this.jdField_a_of_type_AndroidViewView = findViewById(2131367033);
    this.jdField_a_of_type_AndroidViewView.setOnTouchListener(this);
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewKandianUrlImageView = ((KandianUrlImageView)findViewById(2131367034));
    this.jdField_c_of_type_AndroidViewView = new View(this);
    this.jdField_c_of_type_AndroidViewView.setBackgroundColor(1996488704);
    addContentView(this.jdField_c_of_type_AndroidViewView, new ViewGroup.LayoutParams(-1, -1));
    this.jdField_c_of_type_AndroidViewView.setVisibility(8);
    this.jdField_b_of_type_AndroidViewView = View.inflate(this, 2130969653, null);
    addContentView(this.jdField_b_of_type_AndroidViewView, new ViewGroup.LayoutParams(-1, -1));
    this.jdField_a_of_type_ComTencentMobileqqWidgetCircleProgress = ((CircleProgress)this.jdField_b_of_type_AndroidViewView.findViewById(2131363549));
    this.jdField_a_of_type_ComTencentMobileqqWidgetCircleProgress.setStrokeWidth(5.0F);
    this.jdField_a_of_type_ComTencentMobileqqWidgetCircleProgress.setBgAndProgressColor(100, -1, 100, getResources().getColor(2131493396));
    this.jdField_b_of_type_AndroidWidgetTextView = ((TextView)this.jdField_b_of_type_AndroidViewView.findViewById(2131367302));
    this.jdField_b_of_type_AndroidWidgetTextView.setOnClickListener(this);
  }
  
  public void a(float paramFloat)
  {
    Message localMessage = Message.obtain();
    localMessage.what = 108;
    localMessage.obj = Float.valueOf(paramFloat);
    this.jdField_a_of_type_MqqOsMqqHandler.sendMessage(localMessage);
  }
  
  protected void a(int paramInt)
  {
    super.a(paramInt);
    setRightButton(2131438889, this);
    a(false);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    VideoEnvironment.a("ReadInJoyDeliverVideoActivity_AvCodecSo", "onConfigResult result=" + paramInt1 + ", serverError=" + paramInt2, null);
    if ((paramInt1 == 1) || (paramInt1 == 0))
    {
      if (paramInt2 != 0)
      {
        VideoEnvironment.a("ReadInJoyDeliverVideoActivity_AvCodecSo", "短视频配置解压失败[" + paramInt2 + "]", null);
        ShortVideoErrorReport.a(1, paramInt2);
        this.r = false;
        return;
      }
      ArrayList localArrayList = new ArrayList(1);
      paramInt1 = ShortVideoResourceManager.a(this.app, localArrayList);
      if (paramInt1 == 0)
      {
        VideoEnvironment.a("ReadInJoyDeliverVideoActivity_AvCodecSo", "配置下载成功,插件下载中...", null);
        ShortVideoResourceManager.a(this.app, localArrayList, this);
        return;
      }
      VideoEnvironment.a("ReadInJoyDeliverVideoActivity_AvCodecSo", "短视频配置校验失败[" + paramInt1 + "]", null);
      ShortVideoErrorReport.a(1, paramInt1);
      this.r = false;
      return;
    }
    VideoEnvironment.a("ReadInJoyDeliverVideoActivity_AvCodecSo", "短视频配置下载失败[" + paramInt2 + "]", null);
    ShortVideoErrorReport.a(1, paramInt2);
    this.r = false;
  }
  
  public void a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    int i1 = 1001;
    switch (paramInt)
    {
    default: 
      i1 = 0;
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 13: 
    case 12: 
      for (;;)
      {
        if (paramInt != 0) {
          c(i1);
        }
        return;
        this.jdField_a_of_type_MqqOsMqqHandler.sendEmptyMessage(106);
        continue;
        this.jdField_a_of_type_MqqOsMqqHandler.sendEmptyMessage(107);
        continue;
        this.jdField_a_of_type_MqqOsMqqHandler.sendEmptyMessage(100);
        continue;
        this.jdField_a_of_type_MqqOsMqqHandler.sendEmptyMessage(102);
        continue;
        this.jdField_a_of_type_MqqOsMqqHandler.sendEmptyMessage(105);
        i1 = 1004;
        continue;
        this.jdField_a_of_type_MqqOsMqqHandler.sendEmptyMessage(105);
        i1 = 1004;
        continue;
        this.jdField_a_of_type_MqqOsMqqHandler.sendEmptyMessage(104);
        i1 = 1004;
        continue;
        this.jdField_a_of_type_MqqOsMqqHandler.sendEmptyMessage(100);
        i1 = 1002;
        continue;
        this.jdField_a_of_type_MqqOsMqqHandler.sendEmptyMessage(105);
        i1 = 1003;
        continue;
        this.jdField_a_of_type_MqqOsMqqHandler.sendEmptyMessage(105);
        i1 = 1003;
        continue;
        this.jdField_a_of_type_MqqOsMqqHandler.sendEmptyMessage(104);
        i1 = 1003;
        continue;
        this.jdField_a_of_type_MqqOsMqqHandler.sendEmptyMessage(105);
        i1 = 0;
        continue;
        n();
        i1 = 0;
      }
    }
    ArrayList localArrayList = new ArrayList();
    a(localArrayList);
    if (this.jdField_o_of_type_Boolean)
    {
      this.jdField_a_of_type_AndroidOsBundle.putString("arg_video_cover_url", paramString1);
      ReadInJoyLogicEngine.a().a(this.app.c(), b(), this.jdField_a_of_type_AndroidOsBundle, localArrayList, true, this.t);
    }
    for (;;)
    {
      this.jdField_b_of_type_Long = NetConnInfoCenter.getServerTimeMillis();
      if (QLog.isColorLevel()) {
        QLog.d("ReadInJoyDeliverVideoActivity", 2, "initData fromWeb:\n adTag=" + this.jdField_i_of_type_Int + ", topicId=" + this.jdField_c_of_type_JavaLangString + ", topicName=" + this.jdField_d_of_type_JavaLangString + ", callback=" + this.jdField_e_of_type_JavaLangString + "\nfromVideo:\n video=" + this.jdField_f_of_type_JavaLangString + ", width=" + this.jdField_j_of_type_Int + ", height=" + this.jdField_k_of_type_Int + ", duration=" + this.jdField_a_of_type_Long + "\n cover=" + this.jdField_g_of_type_JavaLangString + "\nfromUpload:\n videoTitle=" + this.jdField_m_of_type_JavaLangString + "\n videoMd5=" + this.jdField_j_of_type_JavaLangString + "\n videoUuid=" + this.jdField_k_of_type_JavaLangString + "\n videoUrl=" + this.jdField_l_of_type_JavaLangString + "\n coverUrl=" + this.jdField_h_of_type_JavaLangString + "\n coverMd5=" + this.jdField_i_of_type_JavaLangString + "\n coverWidth=" + this.jdField_l_of_type_Int + ", coverHeight=" + this.jdField_m_of_type_Int);
      }
      this.jdField_h_of_type_Long = System.currentTimeMillis();
      i1 = 0;
      break;
      this.jdField_h_of_type_JavaLangString = paramString1;
      this.jdField_i_of_type_JavaLangString = paramString2;
      this.jdField_l_of_type_JavaLangString = paramString3;
      this.jdField_j_of_type_JavaLangString = paramString4;
      this.jdField_k_of_type_JavaLangString = paramString5;
      this.jdField_m_of_type_JavaLangString = b();
      getIntent().putExtra("arg_video_cover_url", this.jdField_h_of_type_JavaLangString);
      getIntent().putExtra("arg_video_cover_md5", this.jdField_i_of_type_JavaLangString);
      getIntent().putExtra("arg_video_url", this.jdField_l_of_type_JavaLangString);
      getIntent().putExtra("arg_video_md5", this.jdField_j_of_type_JavaLangString);
      getIntent().putExtra("arg_video_uuid", this.jdField_k_of_type_JavaLangString);
      getIntent().putExtra("arg_video_title", this.jdField_m_of_type_JavaLangString);
      ReadInJoyLogicEngine.a().a(this.app.c(), b(), getIntent().getExtras(), localArrayList, false, this.t);
    }
  }
  
  protected void a(Editable paramEditable)
  {
    super.a(paramEditable);
    if (!TextUtils.isEmpty(this.jdField_n_of_type_JavaLangString))
    {
      a(true);
      int i1 = paramEditable.length();
      if (this.jdField_a_of_type_AndroidWidgetTextView != null) {
        this.jdField_a_of_type_AndroidWidgetTextView.setText(String.valueOf(this.jdField_c_of_type_Int - i1));
      }
      if (i1 - this.jdField_c_of_type_Int <= 0) {
        break label160;
      }
      if (this.jdField_a_of_type_AndroidWidgetTextView != null) {
        this.jdField_a_of_type_AndroidWidgetTextView.setTextColor(Color.parseColor("#FF4222"));
      }
    }
    for (this.jdField_d_of_type_Boolean = true;; this.jdField_d_of_type_Boolean = false)
    {
      if (paramEditable.toString().trim().length() <= 0) {
        break label188;
      }
      a(true);
      return;
      if (paramEditable.length() <= 0)
      {
        a(false);
        break;
      }
      String str = UUID.randomUUID().toString();
      if (a(paramEditable.toString(), str).trim().length() <= 0)
      {
        a(false);
        break;
      }
      a(true);
      break;
      label160:
      if (this.jdField_a_of_type_AndroidWidgetTextView != null) {
        this.jdField_a_of_type_AndroidWidgetTextView.setTextColor(Color.parseColor("#BBBBBB"));
      }
    }
    label188:
    a(false);
  }
  
  public void a(String paramString1, int paramInt, String paramString2)
  {
    if (paramString1.startsWith("new_qq_android_native_short_video_"))
    {
      if (paramInt == 0) {
        break label105;
      }
      VideoEnvironment.a("ReadInJoyDeliverVideoActivity_AvCodecSo", "短视频插件下载失败[" + paramInt + "]", null);
      ShortVideoErrorReport.a(2, paramInt);
    }
    for (;;)
    {
      this.r = false;
      VideoEnvironment.a("ReadInJoyDeliverVideoActivity_AvCodecSo", "onDownloadFinish name=" + paramString1 + ", result=" + paramInt + ", filePath=" + paramString2, null);
      return;
      label105:
      this.q = true;
      VideoEnvironment.a("ReadInJoyDeliverVideoActivity_AvCodecSo", "短视频插件下载成功[" + paramInt + "]", null);
    }
  }
  
  public void a(String paramString, long paramLong1, long paramLong2) {}
  
  protected boolean a()
  {
    this.jdField_f_of_type_Long = System.currentTimeMillis();
    if (QLog.isColorLevel()) {
      QLog.d("ReadInJoyDeliverVideoActivity", 2, "onDeliver!");
    }
    PublicAccountReportUtils.a(this.app, "", "0X80081D8", "0X80081D8", 0, 0, "1", "2", "", VideoReporter.a(null), false);
    PublicAccountReportUtils.a(null, "", "0X8008245", "0X8008245", 0, 0, String.valueOf(a()), "", "", ReadInJoyUtils.e(), false);
    if ((this.jdField_n_of_type_JavaLangString.equals("")) && (!this.jdField_o_of_type_Boolean))
    {
      if (QLog.isColorLevel()) {
        QLog.d("ReadInJoyDeliverVideoActivity", 2, "onDeliver no video!");
      }
      a(1, getString(2131438893));
    }
    while (!super.a()) {
      return false;
    }
    q();
    j();
    if (this.jdField_o_of_type_Boolean) {
      this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyUgcVideoTransferVideoDeliverController.a(null, this.jdField_g_of_type_JavaLangString);
    }
    for (;;)
    {
      return true;
      if ((TextUtils.isEmpty(this.jdField_f_of_type_JavaLangString)) || (!new File(this.jdField_f_of_type_JavaLangString).exists()))
      {
        this.jdField_a_of_type_MqqOsMqqHandler.sendEmptyMessage(101);
        if (!QLog.isColorLevel()) {
          break;
        }
        QLog.d("ReadInJoyDeliverVideoActivity", 2, "onDeliver video not exist!");
        return false;
      }
      this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyUgcVideoTransferVideoDeliverController.a(this.jdField_f_of_type_JavaLangString, this.jdField_n_of_type_JavaLangString);
    }
  }
  
  protected void b()
  {
    this.jdField_j_of_type_Boolean = true;
    this.jdField_l_of_type_Boolean = true;
    this.jdField_m_of_type_Boolean = true;
    super.b();
    this.jdField_b_of_type_JavaLangString = "0X800865E";
    this.jdField_a_of_type_AndroidWidgetEditText.addTextChangedListener(this.jdField_a_of_type_AndroidTextTextWatcher);
    Object localObject = getIntent();
    this.jdField_i_of_type_Int = ((Intent)localObject).getIntExtra("arg_ad_tag", 0);
    this.jdField_c_of_type_JavaLangString = ((Intent)localObject).getStringExtra("arg_topic_id");
    this.jdField_d_of_type_JavaLangString = ((Intent)localObject).getStringExtra("arg_topic_name");
    this.jdField_e_of_type_JavaLangString = ((Intent)localObject).getStringExtra("arg_callback");
    this.jdField_f_of_type_JavaLangString = ((Intent)localObject).getStringExtra("arg_video_path");
    this.jdField_g_of_type_JavaLangString = ((Intent)localObject).getStringExtra("arg_video_cover");
    this.jdField_j_of_type_Int = ((Intent)localObject).getIntExtra("arg_video_width", 0);
    this.jdField_k_of_type_Int = ((Intent)localObject).getIntExtra("arg_video_height", 0);
    this.jdField_a_of_type_Long = ((Intent)localObject).getLongExtra("arg_video_duration", 0L);
    this.jdField_o_of_type_Boolean = ((Intent)localObject).getBooleanExtra("arg_is_from_wang_zhe", false);
    this.jdField_c_of_type_Long = ((Intent)localObject).getLongExtra("arg_wang_zhe_app_id", 0L);
    this.t = ((Intent)localObject).getBooleanExtra("is_from_dian_dian", false);
    ReadInJoyLogicEngineEventDispatcher.a().a(this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyEngineReadInJoyObserver);
    ReadInJoyLogicEngineEventDispatcher.a().a(this.jdField_b_of_type_ComTencentBizPubaccountReadinjoyEngineReadInJoyObserver);
    i();
    b(this.jdField_g_of_type_JavaLangString);
    int i1 = ((Intent)localObject).getIntExtra("arg_video_source", 0);
    String str;
    if (TextUtils.isEmpty(this.jdField_c_of_type_JavaLangString))
    {
      localObject = "0";
      if (!this.t) {
        break label398;
      }
      str = "1";
      label248:
      PublicAccountReportUtils.a(null, "", "0X8008241", "0X8008241", 0, 0, String.valueOf(i1), (String)localObject, str, ReadInJoyUtils.e(), false);
      if (ReadInJoyHelper.p(this.app) != 0) {
        break label406;
      }
    }
    label398:
    label406:
    for (boolean bool = true;; bool = false)
    {
      this.jdField_g_of_type_Boolean = bool;
      if ((!this.jdField_g_of_type_Boolean) && (this.jdField_b_of_type_AndroidWidgetImageView != null)) {
        this.jdField_b_of_type_AndroidWidgetImageView.setVisibility(8);
      }
      if (this.jdField_o_of_type_Boolean)
      {
        setRightViewTextDisable(0);
        this.jdField_a_of_type_AndroidWidgetEditText.setHint(getString(2131438895));
        this.jdField_a_of_type_MqqOsMqqHandler.postDelayed(new lxy(this), 30000L);
      }
      p();
      if (!this.jdField_o_of_type_Boolean) {
        break label411;
      }
      this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyUgcVideoTransferVideoDeliverController = new KingsMomentVideoDeliverController(this, this.app, this);
      return;
      localObject = String.valueOf(this.jdField_c_of_type_JavaLangString);
      break;
      str = "2";
      break label248;
    }
    label411:
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyUgcVideoTransferVideoDeliverController = new NormalVideoDeliverController(this, this.p, this.q, this.app, this, this.jdField_f_of_type_JavaLangString);
  }
  
  protected void b(String paramString)
  {
    int i2 = 1;
    if ((!TextUtils.isEmpty(paramString)) && (new File(paramString).exists()))
    {
      this.jdField_n_of_type_JavaLangString = paramString;
      Object localObject = new BitmapFactory.Options();
      ((BitmapFactory.Options)localObject).inJustDecodeBounds = true;
      BitmapFactory.decodeFile(this.jdField_n_of_type_JavaLangString, (BitmapFactory.Options)localObject);
      int i1 = AIOUtils.a(110.0F, getResources());
      int i3 = AIOUtils.a(110.0F, getResources());
      float f1 = ((BitmapFactory.Options)localObject).outWidth / i1;
      float f2 = ((BitmapFactory.Options)localObject).outHeight / i3;
      this.jdField_l_of_type_Int = ((BitmapFactory.Options)localObject).outWidth;
      this.jdField_m_of_type_Int = ((BitmapFactory.Options)localObject).outHeight;
      getIntent().putExtra("arg_video_cover_width", this.jdField_l_of_type_Int);
      getIntent().putExtra("arg_video_cover_height", this.jdField_m_of_type_Int);
      i1 = i2;
      if (f1 >= 1.0F)
      {
        i1 = i2;
        if (f2 >= 1.0F) {
          i1 = (int)Math.floor(Math.min(f1, f2));
        }
      }
      ((BitmapFactory.Options)localObject).inJustDecodeBounds = false;
      ((BitmapFactory.Options)localObject).inSampleSize = i1;
      try
      {
        localObject = BitmapFactory.decodeFile(this.jdField_n_of_type_JavaLangString, (BitmapFactory.Options)localObject);
        localObject = a(a(this.jdField_n_of_type_JavaLangString), (Bitmap)localObject);
        this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewKandianUrlImageView.setImageBitmap((Bitmap)localObject);
        this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewKandianUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (QLog.isColorLevel()) {
          QLog.d("ReadInJoyDeliverVideoActivity", 2, "setSelectedImage sampleSize=" + i1 + ", path=" + paramString);
        }
        return;
      }
      catch (OutOfMemoryError paramString)
      {
        this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewKandianUrlImageView.setImageDrawable(new ColorDrawable(-16777216));
        this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewKandianUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return;
      }
    }
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewKandianUrlImageView.setImageDrawable(new ColorDrawable(-16777216));
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewKandianUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
  }
  
  protected void b(boolean paramBoolean)
  {
    super.b(paramBoolean);
    if (this.jdField_b_of_type_AndroidViewView.getVisibility() == 0)
    {
      this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyUgcVideoTransferVideoDeliverController.a();
      n();
    }
  }
  
  protected void c()
  {
    super.c();
    PublicAccountReportUtils.a(this.app, "", "0X80081D8", "0X80081D8", 0, 0, "2", "2", "", VideoReporter.a(null), false);
    PublicAccountReportUtils.a(null, "", "0X8008242", "0X8008242", 0, 0, String.valueOf(a()), "", "", ReadInJoyUtils.e(), false);
  }
  
  protected void c(boolean paramBoolean)
  {
    super.c(paramBoolean);
    if (this.jdField_b_of_type_AndroidViewView.getVisibility() == 0)
    {
      this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyUgcVideoTransferVideoDeliverController.a();
      n();
    }
  }
  
  protected void d()
  {
    super.d();
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyUgcVideoTransferVideoDeliverController.b();
    PublicAccountReportUtils.a(null, "", "0X8008243", "0X8008243", 0, 0, String.valueOf(a()), "", "", ReadInJoyUtils.e(), false);
  }
  
  protected boolean doOnCreate(Bundle paramBundle)
  {
    this.jdField_d_of_type_Long = System.currentTimeMillis();
    super.doOnCreate(paramBundle);
    super.setContentView(2130969591);
    a(2131438888);
    a();
    b();
    return true;
  }
  
  protected void doOnDestroy()
  {
    super.doOnDestroy();
    ReadInJoyLogicEngineEventDispatcher.a().b(this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyEngineReadInJoyObserver);
    ReadInJoyLogicEngineEventDispatcher.a().b(this.jdField_b_of_type_ComTencentBizPubaccountReadinjoyEngineReadInJoyObserver);
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyUgcVideoTransferVideoDeliverController.c();
    this.jdField_a_of_type_MqqOsMqqHandler.removeCallbacksAndMessages(null);
  }
  
  protected void doOnPause()
  {
    super.doOnPause();
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyUgcVideoTransferVideoDeliverController.a();
  }
  
  protected void doOnPostResume()
  {
    super.doOnPostResume();
    this.jdField_e_of_type_Long = System.currentTimeMillis();
    StatisticCollector.a(this).a(getAppRuntime().getAccount(), "actReadInJoyEnterVideoDeliverPage", true, this.jdField_e_of_type_Long - this.jdField_d_of_type_Long, 0L, null, "");
  }
  
  protected void doOnResume()
  {
    super.doOnResume();
    if (this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyUgcVideoTransferVideoDeliverController.a()) {
      this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyUgcVideoTransferVideoDeliverController.a(this.jdField_k_of_type_Boolean);
    }
  }
  
  protected void f()
  {
    if (QLog.isColorLevel()) {
      QLog.d("ReadInJoyDeliverVideoActivity", 2, "onEmotionBtn!");
    }
    PublicAccountReportUtils.a(null, "", "0X8008244", "0X8008244", 0, 0, "", "", "", ReadInJoyUtils.e(), false);
    super.f();
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 100)
    {
      this.jdField_a_of_type_MqqOsMqqHandler.removeMessages(100);
      k();
      a(1, getString(2131438876));
    }
    do
    {
      return true;
      if (paramMessage.what == 101)
      {
        this.jdField_a_of_type_MqqOsMqqHandler.removeMessages(101);
        k();
        a(1, getString(2131437339));
        return true;
      }
      if (paramMessage.what == 102)
      {
        this.jdField_a_of_type_MqqOsMqqHandler.removeMessages(102);
        k();
        a(1, getString(2131438880));
        return true;
      }
      if (paramMessage.what == 103)
      {
        this.jdField_a_of_type_MqqOsMqqHandler.removeMessages(103);
        k();
        return true;
      }
      if (paramMessage.what == 104)
      {
        this.jdField_a_of_type_MqqOsMqqHandler.removeMessages(104);
        k();
        o();
        a(1, getString(2131438883));
        return true;
      }
      if (paramMessage.what == 105)
      {
        this.jdField_a_of_type_MqqOsMqqHandler.removeMessages(105);
        k();
        a(1, getString(2131438874));
        return true;
      }
      if (paramMessage.what == 106)
      {
        this.jdField_a_of_type_MqqOsMqqHandler.removeMessages(106);
        k();
        a(1, getString(2131438877));
        return true;
      }
      if (paramMessage.what == 107)
      {
        this.jdField_a_of_type_MqqOsMqqHandler.removeMessages(107);
        k();
        if (this.r)
        {
          a(0, getString(2131438878));
          return true;
        }
        a(0, getString(2131438879));
        return true;
      }
    } while (paramMessage.what != 108);
    b(((Float)paramMessage.obj).floatValue());
    return true;
  }
  
  protected boolean onBackEvent()
  {
    if (!this.jdField_n_of_type_Boolean)
    {
      if ((this.jdField_o_of_type_Boolean) && (!this.s)) {
        return super.onBackEvent();
      }
      a(false, 0, this.jdField_o_of_type_Boolean, this.jdField_c_of_type_Long);
      return true;
    }
    return super.onBackEvent();
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      super.onClick(paramView);
      return;
    case 2131367033: 
      if (!this.jdField_o_of_type_Boolean) {
        c(this.jdField_f_of_type_JavaLangString);
      }
      break;
    }
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyUgcVideoTransferVideoDeliverController.b();
    this.jdField_a_of_type_MqqOsMqqHandler.sendEmptyMessage(103);
    PublicAccountReportUtils.a(this.app, "", "0X80081DA", "0X80081DA", 0, 0, "", "", "", VideoReporter.a(null), false);
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramView.getId() == 2131367033)
    {
      switch (paramMotionEvent.getAction())
      {
      }
      for (;;)
      {
        return true;
        this.jdField_a_of_type_Float = paramMotionEvent.getX();
        this.jdField_b_of_type_Float = paramMotionEvent.getY();
        continue;
        if ((Math.abs(this.jdField_a_of_type_Float - paramMotionEvent.getX()) <= jdField_g_of_type_Int) && (Math.abs(this.jdField_b_of_type_Float - paramMotionEvent.getY()) <= jdField_g_of_type_Int) && (!this.jdField_o_of_type_Boolean)) {
          c(this.jdField_f_of_type_JavaLangString);
        }
      }
    }
    return false;
  }
  
  public void y_()
  {
    VideoEnvironment.a("ReadInJoyDeliverVideoActivity_AvCodecSo", "网络断开，短视频插件下载失败", null);
    ShortVideoErrorReport.a(3, -1500);
    this.r = false;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.biz.pubaccount.readinjoy.ugc.ReadInJoyDeliverVideoActivity
 * JD-Core Version:    0.7.0.1
 */
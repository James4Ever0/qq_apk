package com.tencent.mobileqq.activity.recent;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.text.Html;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cjr;
import cjs;
import cjt;
import cju;
import cjv;
import cjx;
import cjz;
import ckb;
import ckc;
import ckd;
import cke;
import ckf;
import ckg;
import ckh;
import cki;
import com.tencent.image.URLDrawable;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.app.ConfigHandler;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.message.ConversationFacade;
import com.tencent.mobileqq.app.proxy.ProxyManager;
import com.tencent.mobileqq.app.proxy.RecentUserProxy;
import com.tencent.mobileqq.app.upgrade.UpgradeController;
import com.tencent.mobileqq.app.upgrade.UpgradeDetailWrapper;
import com.tencent.mobileqq.app.upgrade.UpgradeDetailWrapper.NewApkInfo;
import com.tencent.mobileqq.config.Config;
import com.tencent.mobileqq.config.ConfigManager;
import com.tencent.mobileqq.config.splashlogo.ConfigServlet;
import com.tencent.mobileqq.config.struct.PicAndAdConf;
import com.tencent.mobileqq.data.RecentUser;
import com.tencent.mobileqq.filemanager.fileviewer.FileViewMusicService;
import com.tencent.mobileqq.managers.TroopAssistantManager;
import com.tencent.mobileqq.model.FriendManager;
import com.tencent.mobileqq.music.QQPlayerService;
import com.tencent.mobileqq.music.SongInfo;
import com.tencent.mobileqq.redtouch.RedTouchManager;
import com.tencent.mobileqq.redtouch.VipBannerInfo;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.struct.PushBanner;
import com.tencent.mobileqq.util.Utils;
import com.tencent.mobileqq.utils.CustomHandler;
import com.tencent.mobileqq.utils.JumpParser;
import com.tencent.mobileqq.widget.ADView;
import com.tencent.pb.getbusiinfo.BusinessInfoCheckUpdate.AppInfo;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.AbsListView.LayoutParams;
import com.tencent.widget.XListView;
import java.util.Calendar;
import java.util.List;
import mqq.app.AppRuntime;

public class BannerManager
  implements Handler.Callback
{
  public static final int A = 4;
  public static final int B = 6;
  public static final int C = 7;
  public static final int D = 8;
  public static final int E = 9;
  private static final int F = 101;
  public static final int a = 1;
  public static final String a = "0X8004028";
  public static final boolean a = true;
  public static final int b = 1;
  public static final String b = "0X8004029";
  public static final int c = 1;
  public static final String c = "Q.recent.banner";
  public static final int d = 2;
  public static final int e = 3;
  private static final boolean jdField_e_of_type_Boolean = false;
  public static final int f = 4;
  private static final String jdField_f_of_type_JavaLangString = "0X80040AA";
  public static final int g = 5;
  public static final int h = 6;
  public static final int i = 7;
  public static final int j = 8;
  public static final int k = 9;
  public static final int l = 10;
  public static final int m = 11;
  public static final int n = 12;
  public static final int o = 13;
  public static final int p = 13;
  public static final int q = 14;
  public static final int r = 14;
  public static final int s = 14;
  public static final int t = 15;
  public static final int u = 16;
  public static final int v = 16;
  public static final int w = 16;
  public static final int x = 3;
  public static final int y = 0;
  public static final int z = 1;
  private Handler jdField_a_of_type_AndroidOsHandler = new CustomHandler(this);
  private BaseActivity jdField_a_of_type_ComTencentMobileqqAppBaseActivity;
  private XListView jdField_a_of_type_ComTencentWidgetXListView;
  private int[] jdField_a_of_type_ArrayOfInt;
  private Banner[] jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner = new Banner[17];
  public boolean b;
  private int[] b;
  private boolean c = true;
  public String d;
  private boolean d;
  private String jdField_e_of_type_JavaLangString;
  private boolean jdField_f_of_type_Boolean;
  
  public BannerManager(BaseActivity paramBaseActivity, XListView paramXListView)
  {
    this.jdField_d_of_type_Boolean = false;
    this.e = "";
    this.jdField_b_of_type_Boolean = false;
    this.f = true;
    this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity = paramBaseActivity;
    this.jdField_a_of_type_ComTencentWidgetXListView = paramXListView;
    paramBaseActivity = i();
    this.jdField_a_of_type_ComTencentWidgetXListView.a(paramBaseActivity);
    paramBaseActivity.setVisibility(8);
  }
  
  private View a()
  {
    View localView = View.inflate(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity, 2130903242, null);
    localView.setOnClickListener(new ckb(this, localView));
    localView.findViewById(2131297321).setVisibility(8);
    return localView;
  }
  
  private void a(View paramView)
  {
    paramView.findViewById(2131296688).setVisibility(0);
    ((TextView)paramView.findViewById(2131296890)).setText(2131363976);
  }
  
  private void a(View paramView, Message paramMessage)
  {
    paramMessage = paramView.findViewById(2131297321);
    paramView = (TextView)paramView.findViewById(2131297323);
    if ((this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity != null) && (this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.app != null))
    {
      if (FileViewMusicService.a().a())
      {
        String str1 = this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getString(2131364136);
        String str2 = FileViewMusicService.a().a();
        if (str2 != null)
        {
          paramView.setText(Html.fromHtml(str1 + " " + str2));
          paramMessage.setVisibility(0);
          return;
        }
        paramMessage.setVisibility(8);
        return;
      }
      paramMessage.setVisibility(8);
      return;
    }
    paramMessage.setVisibility(8);
  }
  
  private void a(Banner paramBanner)
  {
    if ((paramBanner == null) || (paramBanner.jdField_a_of_type_AndroidViewView != null)) {}
    for (;;)
    {
      return;
      switch (paramBanner.d)
      {
      }
      while (QLog.isDevelopLevel())
      {
        QLog.d("Q.recent.banner", 4, "initBannerView | banner = " + paramBanner);
        return;
        paramBanner.jdField_a_of_type_AndroidViewView = b();
        continue;
        paramBanner.jdField_a_of_type_AndroidViewView = e();
        continue;
        paramBanner.jdField_a_of_type_AndroidViewView = c();
        continue;
        paramBanner.jdField_a_of_type_AndroidViewView = a();
        continue;
        paramBanner.jdField_a_of_type_AndroidViewView = b();
        continue;
        paramBanner.jdField_a_of_type_AndroidViewView = d();
        continue;
        paramBanner.jdField_a_of_type_AndroidViewView = g();
        continue;
        paramBanner.jdField_a_of_type_AndroidViewView = f();
        continue;
        paramBanner.jdField_a_of_type_AndroidViewView = f();
        continue;
        paramBanner.jdField_a_of_type_AndroidViewView = j();
        continue;
        paramBanner.jdField_a_of_type_AndroidViewView = h();
        continue;
        paramBanner.jdField_a_of_type_AndroidViewView = l();
        continue;
        paramBanner.jdField_a_of_type_AndroidViewView = k();
        continue;
        paramBanner.jdField_a_of_type_AndroidViewView = i();
      }
    }
  }
  
  private void a(Banner paramBanner, Message paramMessage)
  {
    if (QLog.isDevelopLevel()) {
      QLog.d("Q.recent.banner", 4, "updateBanner| banner = " + paramBanner + ", msg = " + paramMessage);
    }
    if ((paramBanner == null) || (paramBanner.jdField_a_of_type_AndroidViewView == null)) {
      return;
    }
    switch (paramBanner.d)
    {
    case 2: 
    case 11: 
    case 15: 
    default: 
      return;
    case 1: 
      b(paramBanner.jdField_a_of_type_AndroidViewView);
      return;
    case 3: 
      c(paramBanner.jdField_a_of_type_AndroidViewView, paramMessage);
      return;
    case 4: 
      b(paramBanner.jdField_a_of_type_AndroidViewView, paramMessage);
      return;
    case 16: 
      a(paramBanner.jdField_a_of_type_AndroidViewView, paramMessage);
      return;
    case 5: 
      a(paramBanner.jdField_a_of_type_AndroidViewView);
      return;
    case 13: 
      d(paramBanner.jdField_a_of_type_AndroidViewView, paramMessage);
      return;
    case 6: 
      paramBanner.jdField_a_of_type_AndroidViewView.findViewById(2131297381).setVisibility(0);
      return;
    case 8: 
      paramBanner.jdField_a_of_type_AndroidViewView.findViewById(2131298958).setVisibility(0);
      return;
    case 7: 
      paramBanner.jdField_a_of_type_AndroidViewView.findViewById(2131298958).setVisibility(0);
      return;
    case 10: 
      c(paramBanner.jdField_a_of_type_AndroidViewView);
      return;
    case 9: 
      e(paramBanner.jdField_a_of_type_AndroidViewView, paramMessage);
      return;
    case 14: 
      d(paramBanner.jdField_a_of_type_AndroidViewView);
      return;
    }
    e(paramBanner.jdField_a_of_type_AndroidViewView);
  }
  
  private void a(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length < 3)) {}
    for (;;)
    {
      return;
      if ((paramArrayOfInt[1] >= 14) && (paramArrayOfInt[0] >= 1)) {
        switch (paramArrayOfInt[0])
        {
        }
      }
      while ((paramArrayOfInt[2] >= 15) && (paramArrayOfInt[0] >= 1))
      {
        switch (paramArrayOfInt[0])
        {
        case 8: 
        case 9: 
        case 11: 
        default: 
          return;
        }
        paramArrayOfInt[0] = 0;
        return;
        paramArrayOfInt[0] = 0;
      }
    }
  }
  
  private boolean a(int paramInt, View paramView)
  {
    Object localObject1 = this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.app.b(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.app.a());
    PushBanner localPushBanner = new PushBanner(((Config)localObject1).a(0, paramInt), ((Config)localObject1).c(0, paramInt), ((Config)localObject1).a(0, paramInt));
    String str = ((Config)localObject1).b(0, paramInt);
    localPushBanner.l = str;
    localPushBanner.m = ((Config)localObject1).d(0, paramInt);
    boolean bool = localPushBanner.a(((Config)localObject1).b(0, paramInt));
    if ((localPushBanner.c != null) && (localPushBanner.c.contains("|")) && (!a(Long.parseLong(localPushBanner.c.substring(0, localPushBanner.c.indexOf("|"))), Long.parseLong(localPushBanner.c.substring(localPushBanner.c.indexOf("|") + 1))))) {}
    label494:
    for (;;)
    {
      return false;
      if ((bool) && (!"".equals(localPushBanner.j)))
      {
        localPushBanner.a = JumpParser.a(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.app, this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity, localPushBanner.j);
        if (localPushBanner.a == null) {}
        for (int i1 = 0;; i1 = 1)
        {
          if (i1 == 0) {
            break label494;
          }
          Object localObject2 = ((Config)localObject1).a(0, paramInt);
          if (QLog.isDevelopLevel()) {
            QLog.i("PUSH BANNER", 4, "addPushBanner, bannerPic = " + localObject2);
          }
          if (localObject2 == null) {
            break;
          }
          localObject1 = (FrameLayout)this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getLayoutInflater().inflate(2130903276, null);
          ImageView localImageView = (ImageView)((FrameLayout)localObject1).findViewById(2131297452);
          localImageView.setScaleType(ImageView.ScaleType.FIT_XY);
          localImageView.setImageBitmap((Bitmap)localObject2);
          DisplayMetrics localDisplayMetrics = this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getResources().getDisplayMetrics();
          FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localImageView.getLayoutParams();
          i1 = ((Bitmap)localObject2).getHeight() * Math.min(localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels) / ((Bitmap)localObject2).getWidth();
          localLayoutParams.height = Math.max((int)(30.0F * localDisplayMetrics.density), Math.min(Math.min(localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels) * 68 / 320, i1));
          localImageView.setLayoutParams(localLayoutParams);
          localObject2 = (ImageView)((FrameLayout)localObject1).findViewById(2131297453);
          ((ImageView)localObject2).setTag(localPushBanner);
          ((ImageView)localObject2).setContentDescription("图片推广位");
          ((ImageView)localObject2).setOnClickListener(new cjz(this, paramView, paramInt, (FrameLayout)localObject1, str));
          ((FrameLayout)localObject1).setTag(localPushBanner);
          ((ADView)paramView.findViewById(2131297449)).a((View)localObject1, paramInt);
          return true;
        }
      }
    }
  }
  
  static boolean a(long paramLong1, long paramLong2)
  {
    if ((paramLong1 == 0L) || (paramLong2 == 0L)) {}
    long l1;
    do
    {
      return false;
      l1 = System.currentTimeMillis();
    } while ((l1 < paramLong1) || (l1 > paramLong2));
    return true;
  }
  
  private boolean a(View paramView)
  {
    int i4 = this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.app.b(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.app.a()).a(0);
    if (i4 > 0)
    {
      ((ADView)paramView.findViewById(2131297449)).a();
      int i1 = 0;
      int i3;
      for (int i2 = 0; i1 < i4; i2 = i3)
      {
        i3 = i2;
        if (a(i1, paramView)) {
          i3 = i2 + 1;
        }
        i1 += 1;
      }
      if (QLog.isDevelopLevel()) {
        QLog.i("Q.recent.banner", 4, "loadPushBanner, addnum = " + i2);
      }
      if (i2 > 0)
      {
        e();
        return true;
      }
    }
    return false;
  }
  
  private View b()
  {
    View localView = View.inflate(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity, 2130903246, null);
    ((TextView)localView.findViewById(2131296890)).setText(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getString(2131363975));
    localView.setOnClickListener(new ckc(this));
    localView.findViewById(2131296688).setVisibility(8);
    return localView;
  }
  
  private void b(View paramView)
  {
    paramView.findViewById(2131296688).setVisibility(0);
    ((TextView)paramView.findViewById(2131296890)).setText(2131363975);
    if (a(6))
    {
      a(6, 0);
      this.jdField_d_of_type_JavaLangString = null;
    }
  }
  
  private void b(View paramView, Message paramMessage)
  {
    if ((paramMessage == null) || (paramMessage.arg1 == 0))
    {
      if (QLog.isColorLevel()) {
        QLog.d("Q.recent.banner", 2, "updateNetNeedSignOn return, msg == null || msg.arg1==HIDE");
      }
      return;
    }
    if ((paramMessage != null) && ((paramMessage.obj instanceof String))) {}
    for (paramMessage = String.valueOf(paramMessage.obj);; paramMessage = "http://qq.com")
    {
      paramView = paramView.findViewById(2131296688);
      if (paramView.getVisibility() != 0) {
        paramView.setVisibility(0);
      }
      paramView.setOnClickListener(new cjr(this, paramMessage));
      ReportController.a(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.app, "CliOper", "", "", "0X8004028", "0X8004028", 0, 0, "", "", "", "");
      return;
    }
  }
  
  private boolean b()
  {
    return this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getResources().getConfiguration().orientation == 1;
  }
  
  private View c()
  {
    View localView = View.inflate(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity, 2130903246, null);
    ((TextView)localView.findViewById(2131296890)).setText(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getString(2131362913));
    localView.findViewById(2131296688).setVisibility(8);
    return localView;
  }
  
  private void c(View paramView)
  {
    paramView.findViewById(2131296892).setVisibility(0);
    if (this.c)
    {
      TroopAssistantManager.a().i(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.app);
      ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.app, "P_CliOper", "Grp_msg", "", "Msglist", "exp_setmsg", 0, 0, "", "", "", "");
    }
    this.c = false;
    this.jdField_d_of_type_Boolean = true;
  }
  
  private void c(View paramView, Message paramMessage)
  {
    TextView localTextView = (TextView)paramView.findViewById(2131298130);
    if (paramMessage != null)
    {
      if (paramMessage.arg1 != 1) {
        break label42;
      }
      localTextView.setText(2131361859);
    }
    for (;;)
    {
      paramView.findViewById(2131298129).setVisibility(0);
      return;
      label42:
      if (paramMessage.arg2 == 2) {
        localTextView.setText(2131361858);
      }
    }
  }
  
  private boolean c()
  {
    return this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getSharedPreferences("QQLite", 0).getBoolean("reveive_newpb" + this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.app.getAccount(), false);
  }
  
  private View d()
  {
    View localView = View.inflate(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity, 2130903603, null);
    localView.setVisibility(8);
    return localView;
  }
  
  private void d(View paramView)
  {
    if (QQPlayerService.a())
    {
      paramView.findViewById(2131297321).setVisibility(0);
      paramView = (TextView)paramView.findViewById(2131297323);
      SongInfo localSongInfo = QQPlayerService.a();
      if (localSongInfo != null)
      {
        String str = this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getString(2131364136);
        paramView.setText(Html.fromHtml(str + " " + localSongInfo.jdField_b_of_type_JavaLangString));
      }
      return;
    }
    paramView.findViewById(2131297321).setVisibility(8);
  }
  
  private void d(View paramView, Message paramMessage)
  {
    if ((paramMessage != null) && (paramMessage.what == 8)) {
      if ((paramMessage.obj instanceof VipBannerInfo))
      {
        paramMessage = (VipBannerInfo)paramMessage.obj;
        localObject2 = paramMessage.jdField_b_of_type_JavaLangString;
        localObject1 = (TextView)paramView.findViewById(2131298705);
        ((TextView)localObject1).setText((CharSequence)localObject2);
        if ((paramMessage.e != null) && (!TextUtils.isEmpty(paramMessage.e)))
        {
          localObject2 = this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.app.a().getResources().getDrawable(2130839062);
          localObject2 = URLDrawable.getDrawable(paramMessage.e, (Drawable)localObject2, (Drawable)localObject2);
          if (localObject2 != null)
          {
            ((Drawable)localObject2).setBounds(0, 0, Utils.a(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity, 22.0F), Utils.a(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity, 22.0F));
            ((TextView)localObject1).setCompoundDrawables((Drawable)localObject2, null, null, null);
          }
        }
        localObject1 = (Button)paramView.findViewById(2131298706);
        if ((paramMessage.f != null) && (!TextUtils.isEmpty(paramMessage.f))) {
          ((Button)localObject1).setText(paramMessage.f);
        }
        localObject2 = paramMessage.jdField_a_of_type_ComTencentPbGetbusiinfoBusinessInfoCheckUpdate$AppInfo;
        localRedTouchManager = (RedTouchManager)this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.app.getManager(32);
        if ((paramMessage.jdField_a_of_type_JavaLangString != null) && (localObject2 != null) && (localRedTouchManager != null))
        {
          ((Button)localObject1).setOnClickListener(new cke(this, paramMessage, localRedTouchManager, (BusinessInfoCheckUpdate.AppInfo)localObject2));
          this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessageDelayed(9, paramMessage.jdField_b_of_type_Long);
          localRedTouchManager.a((BusinessInfoCheckUpdate.AppInfo)localObject2, paramMessage.jdField_a_of_type_JavaLangString);
          paramView.setVisibility(0);
        }
      }
    }
    while (paramView.getVisibility() != 8)
    {
      Object localObject2;
      Object localObject1;
      RedTouchManager localRedTouchManager;
      return;
    }
    this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(9);
  }
  
  private boolean d()
  {
    return this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getSharedPreferences("QQLite", 0).getBoolean("push_banner_display" + this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.app.getAccount(), true);
  }
  
  private View e()
  {
    View localView = View.inflate(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity, 2130903465, null);
    localView.findViewById(2131298130).setOnClickListener(new ckd(this));
    localView.findViewById(2131298129).setVisibility(8);
    return localView;
  }
  
  private void e()
  {
    this.jdField_a_of_type_AndroidOsHandler.removeMessages(101);
    long l1 = System.currentTimeMillis();
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.add(5, 1);
    localCalendar.set(11, 0);
    localCalendar.clear(12);
    localCalendar.clear(13);
    localCalendar.clear(14);
    l1 = localCalendar.getTimeInMillis() - (l1 - 10L) + 300000L;
    if (QLog.isColorLevel()) {
      QLog.d("PushBanner", 2, "Check banner delay: " + l1);
    }
    this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessageDelayed(101, l1);
  }
  
  private void e(View paramView)
  {
    paramView.findViewById(2131297448).setVisibility(0);
    RelativeLayout localRelativeLayout = (RelativeLayout)paramView.findViewById(2131297447);
    paramView = (ADView)paramView.findViewById(2131297449);
    if (b())
    {
      localRelativeLayout.setPadding(0, 0, 0, 0);
      paramView.b();
      return;
    }
    localRelativeLayout.setPadding(0, -1, 0, 0);
  }
  
  private void e(View paramView, Message paramMessage)
  {
    paramView.findViewById(2131298958).setVisibility(0);
    TextView localTextView = (TextView)paramView.findViewById(2131298959);
    if (paramMessage != null)
    {
      if (!ConfigHandler.a(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.app))
      {
        paramMessage = "新版本QQ ";
        UpgradeDetailWrapper localUpgradeDetailWrapper = UpgradeController.a().a();
        paramView = paramMessage;
        if (localUpgradeDetailWrapper != null)
        {
          paramView = paramMessage;
          if (localUpgradeDetailWrapper.a != null)
          {
            paramView = paramMessage;
            if (localUpgradeDetailWrapper.a.jdField_a_of_type_JavaLangString != null) {
              paramView = localUpgradeDetailWrapper.a.jdField_a_of_type_JavaLangString + " ";
            }
          }
        }
        localTextView.setText(String.format("已下载%s,点击安装", new Object[] { paramView }));
      }
    }
    else {
      return;
    }
    localTextView.setText("已通过Wi-Fi下载手机新版本，点击安装");
  }
  
  private View f()
  {
    View localView = View.inflate(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity, 2130903704, null);
    TextView localTextView = (TextView)localView.findViewById(2131298959);
    localTextView.setOnClickListener(new ckf(this));
    localTextView.setText(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getString(2131363144));
    ((ImageView)localView.findViewById(2131298960)).setOnClickListener(new ckg(this));
    localView.findViewById(2131298958).setVisibility(8);
    return localView;
  }
  
  private void f()
  {
    if (this.jdField_a_of_type_ArrayOfInt == null) {}
    for (;;)
    {
      return;
      int i1 = 0;
      while (i1 < 3)
      {
        Banner localBanner = this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[this.jdField_a_of_type_ArrayOfInt[i1]];
        if ((localBanner != null) && (localBanner.jdField_a_of_type_AndroidViewView != null) && (localBanner.jdField_a_of_type_Boolean))
        {
          this.jdField_a_of_type_ComTencentWidgetXListView.a(localBanner.jdField_a_of_type_AndroidViewView);
          localBanner.jdField_a_of_type_Boolean = false;
          if (!localBanner.a()) {
            localBanner.jdField_a_of_type_AndroidViewView = null;
          }
        }
        i1 += 1;
      }
    }
  }
  
  private View g()
  {
    View localView1 = View.inflate(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity, 2130903252, null);
    View localView2 = localView1.findViewById(2131297382);
    View localView3 = localView1.findViewById(2131297383);
    ckh localckh = new ckh(this);
    localView2.setOnClickListener(localckh);
    localView3.setOnClickListener(localckh);
    localView1.findViewById(2131297381).setVisibility(8);
    return localView1;
  }
  
  private View h()
  {
    View localView1 = View.inflate(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity, 2130903130, null);
    View localView2 = localView1.findViewById(2131296892);
    localView1.setOnClickListener(new cki(this));
    localView2.setVisibility(8);
    return localView1;
  }
  
  private View i()
  {
    View localView = View.inflate(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity, 2130903242, null);
    localView.setOnClickListener(new cjs(this));
    localView.findViewById(2131297321).setVisibility(8);
    return localView;
  }
  
  private View j()
  {
    View localView = View.inflate(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity, 2130903704, null);
    TextView localTextView = (TextView)localView.findViewById(2131298959);
    localTextView.setOnClickListener(new cjt(this));
    localTextView.setText("");
    localTextView.setContentDescription(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getString(2131363150));
    ((ImageView)localView.findViewById(2131298960)).setOnClickListener(new cju(this));
    localView.findViewById(2131298958).setVisibility(8);
    return localView;
  }
  
  private View k()
  {
    View localView = View.inflate(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity, 2130903129, null);
    localView.setOnClickListener(new cjv(this));
    return localView;
  }
  
  private View l()
  {
    View localView = this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getLayoutInflater().inflate(2130903275, null);
    localView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
    localView.findViewById(2131297448).setVisibility(8);
    ((LinearLayout)localView.findViewById(2131297450)).setOnClickListener(new cjx(this));
    return localView;
  }
  
  public int a(int paramInt)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramInt >= 0)
    {
      localObject1 = localObject2;
      if (paramInt < this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner.length) {
        localObject1 = this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[paramInt];
      }
    }
    if (localObject1 == null) {
      return 0;
    }
    return ((Banner)localObject1).e;
  }
  
  public Handler a()
  {
    return this.jdField_a_of_type_AndroidOsHandler;
  }
  
  public void a()
  {
    if (a(6))
    {
      a(6, 0);
      this.jdField_d_of_type_JavaLangString = null;
      a(null);
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 1) && (paramInt1 <= 16))
    {
      if (this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[paramInt1] == null) {
        break label31;
      }
      this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[paramInt1].e = paramInt2;
    }
    label31:
    while ((this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[paramInt1] != null) || (!Banner.a(paramInt2))) {
      return;
    }
    this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[paramInt1] = new Banner(paramInt1, paramInt2);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, Object paramObject, long paramLong)
  {
    Message localMessage = Message.obtain();
    localMessage.what = paramInt1;
    localMessage.arg1 = paramInt2;
    localMessage.arg2 = paramInt3;
    localMessage.obj = paramObject;
    if (paramLong > 0L)
    {
      this.jdField_a_of_type_AndroidOsHandler.sendMessageDelayed(localMessage, paramLong);
      return;
    }
    this.jdField_a_of_type_AndroidOsHandler.sendMessage(localMessage);
  }
  
  public void a(Message paramMessage)
  {
    int i2 = 1;
    int i5 = 0;
    if (QLog.isDevelopLevel()) {
      QLog.d("Q.recent.banner", 4, "refreshBanner");
    }
    if (this.jdField_b_of_type_ArrayOfInt == null) {
      this.jdField_b_of_type_ArrayOfInt = new int[3];
    }
    int i1 = 0;
    while (i1 < 3)
    {
      this.jdField_b_of_type_ArrayOfInt[i1] = 0;
      i1 += 1;
    }
    if (this.jdField_a_of_type_ArrayOfInt == null) {
      this.jdField_a_of_type_ArrayOfInt = new int[3];
    }
    i1 = 1;
    if (i1 <= 13)
    {
      if ((this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[i1] != null) && (this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[i1].a())) {
        this.jdField_b_of_type_ArrayOfInt[0] = i1;
      }
    }
    else
    {
      i1 = 14;
      label108:
      if (i1 <= 14)
      {
        if ((this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[i1] == null) || (!this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[i1].a())) {
          break label253;
        }
        this.jdField_b_of_type_ArrayOfInt[1] = i1;
      }
      i1 = 15;
    }
    int i3;
    int i4;
    for (;;)
    {
      if (i1 <= 16)
      {
        if ((this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[i1] != null) && (this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[i1].a())) {
          this.jdField_b_of_type_ArrayOfInt[2] = i1;
        }
      }
      else
      {
        a(this.jdField_b_of_type_ArrayOfInt);
        i1 = 0;
        i3 = 0;
        i4 = 0;
        while (i1 < 3)
        {
          i4 += this.jdField_b_of_type_ArrayOfInt[i1];
          i3 += this.jdField_a_of_type_ArrayOfInt[i1];
          if (this.jdField_b_of_type_ArrayOfInt[i1] != this.jdField_a_of_type_ArrayOfInt[i1]) {
            i2 = 0;
          }
          i1 += 1;
        }
        i1 += 1;
        break;
        label253:
        i1 += 1;
        break label108;
      }
      i1 += 1;
    }
    if ((i4 == 0) && (i3 == 0)) {
      return;
    }
    if ((i4 == 0) && (i3 != 0))
    {
      f();
      return;
    }
    i1 = i5;
    if (i2 == 0)
    {
      f();
      i2 = 0;
      for (;;)
      {
        i1 = i5;
        if (i2 >= 3) {
          break;
        }
        this.jdField_a_of_type_ArrayOfInt[i2] = this.jdField_b_of_type_ArrayOfInt[i2];
        i2 += 1;
      }
    }
    label333:
    Banner localBanner;
    if (i1 < 3)
    {
      localBanner = this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[this.jdField_a_of_type_ArrayOfInt[i1]];
      if (localBanner != null) {
        break label363;
      }
    }
    for (;;)
    {
      i1 += 1;
      break label333;
      break;
      label363:
      a(localBanner);
      try
      {
        if ((localBanner.jdField_a_of_type_AndroidViewView != null) && (!localBanner.jdField_a_of_type_Boolean))
        {
          this.jdField_a_of_type_ComTencentWidgetXListView.a(localBanner.jdField_a_of_type_AndroidViewView);
          localBanner.jdField_a_of_type_Boolean = true;
        }
        a(localBanner, paramMessage);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          if (QLog.isDevelopLevel()) {
            QLog.d("Q.recent.banner", 4, "initBanner|" + localException.toString());
          }
        }
      }
    }
  }
  
  public void a(String paramString)
  {
    if ((a(10)) && (!TextUtils.isEmpty(this.e)) && (!TextUtils.isEmpty(paramString)) && (this.e.equals(paramString)))
    {
      this.e = "";
      this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessageDelayed(1, 1000L);
    }
  }
  
  public boolean a()
  {
    boolean bool1 = true;
    boolean bool2 = c();
    if ((this.jdField_b_of_type_Boolean) && (!bool2)) {}
    for (;;)
    {
      if (QLog.isDevelopLevel()) {
        QLog.i("Q.recent.banner", 4, "isNeedShowPushBanner, isNeedShow = " + bool1);
      }
      return bool1;
      if (d())
      {
        if (this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[12] == null) {
          this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[12] = new Banner(12, 0);
        }
        a(this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[12]);
        View localView = this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[12].jdField_a_of_type_AndroidViewView;
        if (localView != null) {}
        for (bool1 = a(localView);; bool1 = false)
        {
          if (bool1)
          {
            localView.findViewById(2131297448).setVisibility(0);
            this.jdField_b_of_type_Boolean = true;
            this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getSharedPreferences("QQLite", 0).edit().putBoolean("reveive_newpb" + this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.app.getAccount(), false).commit();
          }
          break;
        }
      }
      bool1 = false;
    }
  }
  
  public boolean a(int paramInt)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramInt >= 0)
    {
      localObject1 = localObject2;
      if (paramInt < this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner.length) {
        localObject1 = this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[paramInt];
      }
    }
    return (localObject1 != null) && (((Banner)localObject1).a());
  }
  
  public void b()
  {
    Object localObject = this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[12];
    ViewGroup localViewGroup;
    int i2;
    int i1;
    if ((localObject != null) && (((Banner)localObject).jdField_a_of_type_AndroidViewView != null))
    {
      localObject = (ADView)((Banner)localObject).jdField_a_of_type_AndroidViewView.findViewById(2131297449);
      localViewGroup = ((ADView)localObject).a(0);
      if (localViewGroup != null)
      {
        i2 = localViewGroup.getChildCount();
        i1 = 0;
        i2 -= 1;
        if (i2 >= 0)
        {
          View localView = localViewGroup.getChildAt(i2);
          PushBanner localPushBanner = (PushBanner)localView.getTag();
          String str = localPushBanner.c;
          int i3 = str.indexOf("|");
          if (a(Long.parseLong(str.substring(0, i3)), Long.parseLong(str.substring(i3 + 1)))) {
            break label295;
          }
          ((ADView)localObject).a(0, i2, localView);
          Config.a.b(localPushBanner.l);
          i1 = 1;
        }
      }
    }
    label295:
    for (;;)
    {
      i2 -= 1;
      break;
      if (i1 != 0)
      {
        if (localViewGroup.getChildCount() == 0)
        {
          this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getSharedPreferences("QQLite", 0).edit().putBoolean("push_banner_display" + this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getAppRuntime().getAccount(), false).commit();
          ((ADView)localObject).a();
          a(12, 0);
          a(null);
          this.jdField_b_of_type_Boolean = false;
        }
        for (;;)
        {
          localObject = new ConfigManager(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getApplicationContext(), ConfigServlet.jdField_d_of_type_JavaLangString);
          if (localObject != null)
          {
            ((ConfigManager)localObject).b();
            ((ConfigManager)localObject).c();
          }
          return;
          e();
        }
      }
      e();
      return;
    }
  }
  
  public void c()
  {
    this.jdField_a_of_type_AndroidOsHandler.removeMessages(101);
    a(7, 0);
    a(9, 0);
    Object localObject = this.jdField_a_of_type_ArrayOfComTencentMobileqqActivityRecentBanner[12];
    if ((localObject != null) && (((Banner)localObject).jdField_a_of_type_AndroidViewView != null))
    {
      RelativeLayout localRelativeLayout = (RelativeLayout)((Banner)localObject).jdField_a_of_type_AndroidViewView.findViewById(2131297447);
      localObject = (ADView)((Banner)localObject).jdField_a_of_type_AndroidViewView.findViewById(2131297449);
      if (localObject != null)
      {
        ((ADView)localObject).c();
        ((ADView)localObject).a();
      }
      if (localRelativeLayout != null) {
        localRelativeLayout.setPadding(0, -1, 0, 0);
      }
    }
    this.jdField_b_of_type_Boolean = false;
    a();
    a(10, 0);
    this.c = true;
    this.jdField_d_of_type_Boolean = false;
    this.e = "";
    a(11, 0);
    a(13, 0);
    a(null);
  }
  
  public void d()
  {
    if (QLog.isColorLevel()) {
      QLog.d("Q.recent.banner", 2, "checkIsShowTroopTip");
    }
    QQAppInterface localQQAppInterface;
    FriendManager localFriendManager;
    List localList;
    int i1;
    label81:
    int i2;
    if (this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity != null)
    {
      localQQAppInterface = this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.app;
      if ((localQQAppInterface != null) && ((TroopAssistantManager.a().e(localQQAppInterface)) || (this.jdField_d_of_type_Boolean)))
      {
        localFriendManager = (FriendManager)localQQAppInterface.getManager(8);
        localList = localQQAppInterface.a().a().b();
        if (localList != null) {
          break label130;
        }
        i1 = 0;
        i2 = 0;
        label83:
        if (i2 >= i1) {
          break label148;
        }
        if (((RecentUser)localList.get(i2)).type != 5000) {
          break label141;
        }
        if (this.jdField_d_of_type_Boolean) {
          this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(1);
        }
      }
    }
    label130:
    label141:
    label148:
    do
    {
      return;
      localQQAppInterface = null;
      break;
      i1 = localList.size();
      break label81;
      i2 += 1;
      break label83;
      i2 = 0;
      if (i2 < i1)
      {
        RecentUser localRecentUser = (RecentUser)localList.get(i2);
        if (localRecentUser.type != 1) {}
        do
        {
          do
          {
            i2 += 1;
            break;
          } while ((TextUtils.isEmpty(localRecentUser.uin)) || (localFriendManager.f(localRecentUser.uin)) || (TroopAssistantManager.a().b(localQQAppInterface, localRecentUser.uin)) || (TroopAssistantManager.a().a(localQQAppInterface, localRecentUser.uin) != 1));
          if (localQQAppInterface.a().a(localRecentUser.uin, localRecentUser.type) > 99)
          {
            if ((this.jdField_d_of_type_Boolean) && (!TextUtils.isEmpty(this.e)) && (this.e.equals(localRecentUser.uin))) {
              break;
            }
            this.e = localRecentUser.uin;
            if ((!this.c) || (!TroopAssistantManager.a().e(localQQAppInterface))) {
              break;
            }
            this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(0);
            return;
          }
        } while ((TextUtils.isEmpty(this.e)) || (!this.e.equals(localRecentUser.uin)));
        this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(1);
        return;
      }
    } while ((!this.jdField_d_of_type_Boolean) || (TextUtils.isEmpty(this.e)));
    this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(1);
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      return true;
      a(10, 2);
      a(paramMessage);
      continue;
      a(10, 0);
      this.e = "";
      a(paramMessage);
      continue;
      a(11, 0);
      a(paramMessage);
      continue;
      a(2, 2);
      a(paramMessage);
      continue;
      a(2, 0);
      a(paramMessage);
      continue;
      a(13, 2);
      a(paramMessage);
      continue;
      a(13, 0);
      a(paramMessage);
      continue;
      try
      {
        if (QLog.isColorLevel()) {
          QLog.d("PushBanner", 2, "checkAndClosePushBanner");
        }
        b();
      }
      catch (Exception paramMessage) {}
      if (QLog.isColorLevel()) {
        QLog.d("PushBanner", 2, "checkAndClosePushBanner Exception:", paramMessage);
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     com.tencent.mobileqq.activity.recent.BannerManager
 * JD-Core Version:    0.7.0.1
 */
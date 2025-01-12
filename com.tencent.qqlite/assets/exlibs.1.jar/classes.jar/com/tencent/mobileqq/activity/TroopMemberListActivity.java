package com.tencent.mobileqq.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import boj;
import bok;
import bol;
import bom;
import bon;
import boo;
import boq;
import bor;
import bot;
import bou;
import bov;
import bow;
import box;
import boy;
import boz;
import bpa;
import bpd;
import bpf;
import bph;
import bpi;
import bpj;
import bpk;
import bpl;
import bpm;
import bpn;
import bpo;
import bpp;
import com.tencent.biz.pubaccount.PublicAccountBrowser;
import com.tencent.mobileqq.activity.aio.AIOUtils;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.app.DiscussionHandler;
import com.tencent.mobileqq.app.DiscussionManager;
import com.tencent.mobileqq.app.DiscussionObserver;
import com.tencent.mobileqq.app.FriendsManager;
import com.tencent.mobileqq.app.FriendsManagerImp;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.app.TroopHandler;
import com.tencent.mobileqq.app.TroopManager;
import com.tencent.mobileqq.app.TroopObserver;
import com.tencent.mobileqq.app.proxy.ProxyManager;
import com.tencent.mobileqq.data.DiscussionInfo;
import com.tencent.mobileqq.data.DiscussionMemberInfo;
import com.tencent.mobileqq.data.Friends;
import com.tencent.mobileqq.data.TroopInfo;
import com.tencent.mobileqq.data.TroopMemberInfo;
import com.tencent.mobileqq.model.FriendManager;
import com.tencent.mobileqq.persistence.EntityManager;
import com.tencent.mobileqq.persistence.EntityManagerFactory;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.utils.ChnToSpell;
import com.tencent.mobileqq.utils.ContactUtils;
import com.tencent.mobileqq.utils.DBUtils;
import com.tencent.mobileqq.utils.ImageUtil;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.mobileqq.widget.IndexView;
import com.tencent.mobileqq.widget.IndexView.OnIndexChangedListener;
import com.tencent.mobileqq.widget.IndexView.OnIndexChangedListener2;
import com.tencent.mobileqq.widget.PinnedDividerListView;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.mobileqq.widget.TabBarView;
import com.tencent.mobileqq.widget.TroopMemberListSlideItem;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.ActionSheet;
import com.tencent.widget.ActionSheet.OnButtonClickListener;
import com.tencent.widget.AdapterView;
import com.tencent.widget.AdapterView.OnItemClickListener;
import com.tencent.widget.XListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TroopMemberListActivity
  extends BaseActivity
  implements IndexView.OnIndexChangedListener, IndexView.OnIndexChangedListener2, AdapterView.OnItemClickListener
{
  public static final int A = 1;
  public static final int B = 2;
  public static final int C = 4;
  public static final int D = 5;
  public static final int E = 6;
  public static final int F = 7;
  public static final int G = 34;
  public static final int H = 250;
  public static final int a = 1;
  public static final String a = "TroopMemberListActivity";
  protected static final int b = 1;
  public static final String b = "last_update_time";
  protected static final int c = 2;
  public static final String c = "key_last_update_time";
  protected static final int d = 5;
  public static final String d = "key_last_update_num";
  protected static final int e = 6;
  public static final String e = "key_troop_info_last_update";
  protected static final int f = 7;
  public static final String f = "member_uin";
  protected static final int g = 8;
  public static final String g = "member_display_name";
  protected static final int h = 9;
  protected static final int i = 10;
  public static final int l = 0;
  public static final int m = 1;
  public static final String m = "param_is_pop_up_style";
  public static final int n = 0;
  public static final String n = "param_from";
  public static final int o = 1;
  public static final String o = "param_chat_mode";
  public static final int p = 2;
  public static final int q = 3;
  public static final int r = 4;
  public static final int s = 10;
  public static final String s = "http://web.qun.qq.com/statistics/index.html?_bid=149&_wv=3";
  public static final int u = 500;
  public static final int v = 300000;
  public static final int w = 86400000;
  public static final int x = 60000;
  public static final int z = 0;
  public float a;
  public long a;
  public Dialog a;
  protected Drawable a;
  public Handler a;
  protected LayoutInflater a;
  public View.OnClickListener a;
  public View a;
  public EditText a;
  protected ImageButton a;
  public ImageView a;
  public LinearLayout a;
  protected RelativeLayout a;
  protected TextView a;
  public TroopMemberListActivity.ListAdapter a;
  public TroopMemberListActivity.SearchResultAdapter a;
  protected DiscussionHandler a;
  public DiscussionObserver a;
  public TroopObserver a;
  protected DiscussionInfo a;
  public TroopInfo a;
  protected IndexView a;
  public PinnedDividerListView a;
  public TabBarView a;
  protected ActionSheet.OnButtonClickListener a;
  public ActionSheet a;
  protected XListView a;
  public List a;
  public boolean a;
  public long b;
  public Dialog b;
  protected Drawable b;
  public View.OnClickListener b;
  protected View b;
  private ImageView b;
  protected RelativeLayout b;
  protected TextView b;
  protected List b;
  public boolean b;
  protected Drawable c;
  protected View c;
  private ImageView c;
  protected RelativeLayout c;
  protected List c;
  public boolean c;
  protected View d;
  private RelativeLayout d;
  public boolean d;
  public View e;
  public boolean e = false;
  protected boolean f = false;
  public boolean g = true;
  protected String h = "";
  public String i = "";
  public int j;
  public String j;
  protected int k;
  public String k;
  public String l = "";
  public String p = "2";
  public String q = "";
  public String r = "";
  public int t = 0;
  public int y = 0;
  
  public TroopMemberListActivity()
  {
    this.jdField_a_of_type_Boolean = false;
    this.jdField_j_of_type_JavaLangString = "";
    this.jdField_k_of_type_JavaLangString = "";
    this.jdField_c_of_type_Boolean = false;
    this.jdField_j_of_type_Int = 0;
    this.jdField_k_of_type_Int = 0;
    this.jdField_a_of_type_Float = 1.5F;
    this.jdField_a_of_type_JavaUtilList = new ArrayList();
    this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$ListAdapter = null;
    this.jdField_b_of_type_JavaUtilList = new ArrayList();
    this.jdField_d_of_type_Boolean = false;
    this.jdField_a_of_type_Long = 0L;
    this.jdField_b_of_type_Long = 0L;
    this.jdField_a_of_type_ComTencentWidgetActionSheet$OnButtonClickListener = new boo(this);
    this.jdField_a_of_type_AndroidOsHandler = new boy(this);
    this.jdField_a_of_type_AndroidViewView$OnClickListener = new boz(this);
    this.jdField_b_of_type_AndroidViewView$OnClickListener = new bpa(this);
    this.jdField_a_of_type_ComTencentMobileqqAppDiscussionObserver = new bpd(this);
    this.jdField_a_of_type_ComTencentMobileqqAppTroopObserver = new bpf(this);
  }
  
  public static Intent a(Context paramContext, String paramString, int paramInt)
  {
    paramContext = new Intent(paramContext, TroopMemberListActivity.class);
    paramContext.putExtra("troop_uin", paramString);
    paramContext.putExtra("param_from", paramInt);
    return paramContext;
  }
  
  private void a(boolean paramBoolean1, String paramString1, boolean paramBoolean2, int paramInt1, int paramInt2, String paramString2, String paramString3)
  {
    boolean bool = true;
    if (QLog.isColorLevel()) {
      QLog.d("TroopMemberListActivity", 2, "onGetAtAllRemianCountInfo:" + paramBoolean1 + ", " + paramString1 + ", " + paramBoolean2 + ", " + paramInt1 + ", " + paramString2 + ", " + paramString3);
    }
    if ((this.jdField_b_of_type_AndroidWidgetRelativeLayout != null) && (this.jdField_c_of_type_AndroidGraphicsDrawableDrawable != null))
    {
      ((Animatable)this.jdField_c_of_type_AndroidGraphicsDrawableDrawable).stop();
      this.jdField_c_of_type_AndroidGraphicsDrawableDrawable = null;
      ((TextView)this.jdField_b_of_type_AndroidWidgetRelativeLayout.findViewById(2131298921)).setCompoundDrawables(null, null, null, null);
    }
    if ((this.jdField_b_of_type_AndroidWidgetRelativeLayout != null) && (this.jdField_b_of_type_AndroidWidgetRelativeLayout.getVisibility() != 8))
    {
      this.jdField_b_of_type_AndroidWidgetRelativeLayout.setEnabled(true);
      if ((paramBoolean1) && (paramString1 != null) && (paramString1.equals(this.i))) {}
    }
    else
    {
      return;
    }
    ((TextView)this.jdField_b_of_type_AndroidWidgetRelativeLayout.findViewById(2131296876)).setTextColor(getResources().getColor(2131427469));
    TextView localTextView = (TextView)this.jdField_b_of_type_AndroidWidgetRelativeLayout.findViewById(2131298921);
    paramString1 = "@全体成员";
    if (this.t == 10)
    {
      this.jdField_j_of_type_Int = paramInt2;
      if ((paramBoolean2) && (paramInt1 > 0))
      {
        paramBoolean1 = bool;
        this.jdField_c_of_type_Boolean = paramBoolean1;
        if (!this.jdField_c_of_type_Boolean) {
          break label397;
        }
        this.l = ("剩余" + paramInt1 + "次");
        localTextView.setText(this.l);
        paramString1 = "@全体成员" + "," + this.l;
        label334:
        paramString3 = paramString1;
        if (this.jdField_a_of_type_ComTencentMobileqqWidgetIndexView.getVisibility() == 0)
        {
          paramString2 = (RelativeLayout.LayoutParams)localTextView.getLayoutParams();
          paramString2.rightMargin = AIOUtils.a(20.0F, getResources());
          localTextView.setLayoutParams(paramString2);
          paramString3 = paramString1;
        }
      }
    }
    for (;;)
    {
      this.jdField_b_of_type_AndroidWidgetRelativeLayout.setContentDescription(paramString3);
      return;
      paramBoolean1 = false;
      break;
      label397:
      if (paramInt1 == 0)
      {
        this.l = "该功能的使用次数已用完";
        paramString1 = "@全体成员" + "," + "剩余0次";
        localTextView.setText("剩余0次");
        break label334;
      }
      this.l = "";
      paramString1 = "@全体成员" + "," + "现在无法发送@All消息";
      localTextView.setText("");
      break label334;
      this.jdField_c_of_type_Boolean = paramBoolean2;
      this.l = paramString3;
      localTextView.setText(paramString2);
      paramString3 = paramString1;
      if (paramString2 != null) {
        paramString3 = "@全体成员" + "," + paramString2;
      }
    }
  }
  
  private void p()
  {
    this.jdField_d_of_type_AndroidViewView.setVisibility(0);
  }
  
  public TroopMemberListActivity.ATroopMember a(DiscussionMemberInfo paramDiscussionMemberInfo, FriendsManager paramFriendsManager)
  {
    TroopMemberListActivity.ATroopMember localATroopMember = new TroopMemberListActivity.ATroopMember();
    localATroopMember.jdField_a_of_type_JavaLangString = paramDiscussionMemberInfo.memberUin.trim();
    Friends localFriends = null;
    if (paramFriendsManager != null) {
      localFriends = paramFriendsManager.a(paramDiscussionMemberInfo.memberUin);
    }
    localATroopMember.jdField_b_of_type_JavaLangString = paramDiscussionMemberInfo.getDiscussionMemberName();
    localATroopMember.jdField_a_of_type_Short = 0;
    localATroopMember.jdField_c_of_type_JavaLangString = ChnToSpell.a(localATroopMember.jdField_b_of_type_JavaLangString, 2);
    localATroopMember.c(ChnToSpell.a(localATroopMember.jdField_b_of_type_JavaLangString, 1));
    if ((localFriends != null) && (localFriends.isFriend()) && (localFriends.remark != null) && (localFriends.remark.length() > 0))
    {
      localATroopMember.g(localFriends.remark);
      localATroopMember.i(ChnToSpell.a(localATroopMember.jdField_j_of_type_JavaLangString, 1));
      localATroopMember.h(ChnToSpell.a(localATroopMember.jdField_j_of_type_JavaLangString, 2));
    }
    for (;;)
    {
      if ((paramDiscussionMemberInfo.memberName != null) && (paramDiscussionMemberInfo.memberName.length() > 0))
      {
        localATroopMember.j(paramDiscussionMemberInfo.memberName);
        localATroopMember.l(ChnToSpell.a(paramDiscussionMemberInfo.memberName, 1));
        localATroopMember.k(ChnToSpell.a(paramDiscussionMemberInfo.memberName, 2));
      }
      return localATroopMember;
      if ((paramDiscussionMemberInfo.inteRemark != null) && (paramDiscussionMemberInfo.inteRemark.length() > 0))
      {
        localATroopMember.g(paramDiscussionMemberInfo.inteRemark);
        localATroopMember.i(ChnToSpell.a(paramDiscussionMemberInfo.inteRemark, 1));
        localATroopMember.h(ChnToSpell.a(paramDiscussionMemberInfo.inteRemark, 2));
      }
    }
  }
  
  public TroopMemberListActivity.ATroopMember a(TroopMemberInfo paramTroopMemberInfo, FriendsManagerImp paramFriendsManagerImp)
  {
    TroopMemberListActivity.ATroopMember localATroopMember = new TroopMemberListActivity.ATroopMember();
    localATroopMember.jdField_a_of_type_JavaLangString = paramTroopMemberInfo.memberuin.trim();
    Object localObject2 = localATroopMember.jdField_a_of_type_JavaLangString;
    Object localObject1;
    if (paramFriendsManagerImp != null)
    {
      localObject1 = paramFriendsManagerImp.a(paramTroopMemberInfo.memberuin);
      if ((localObject1 != null) && (((Friends)localObject1).isFriend()) && (!TextUtils.isEmpty(((Friends)localObject1).remark)))
      {
        paramFriendsManagerImp = ((Friends)localObject1).remark;
        if (!TextUtils.isEmpty(paramFriendsManagerImp)) {
          break label481;
        }
        localObject2 = paramTroopMemberInfo.memberuin;
        paramFriendsManagerImp = (FriendsManagerImp)localObject1;
        localObject1 = localObject2;
      }
    }
    for (;;)
    {
      localATroopMember.jdField_b_of_type_JavaLangString = ((String)localObject1);
      localATroopMember.jdField_a_of_type_Short = paramTroopMemberInfo.faceid;
      localATroopMember.jdField_c_of_type_JavaLangString = ChnToSpell.a(localATroopMember.jdField_b_of_type_JavaLangString, 2);
      localATroopMember.c(ChnToSpell.a(localATroopMember.jdField_b_of_type_JavaLangString, 1));
      if ((paramTroopMemberInfo.friendnick != null) && (paramTroopMemberInfo.friendnick.length() > 0))
      {
        localATroopMember.d(paramTroopMemberInfo.friendnick);
        localATroopMember.f(paramTroopMemberInfo.pyAll_friendnick);
        localATroopMember.e(paramTroopMemberInfo.pyFirst_friendnick);
      }
      if ((paramFriendsManagerImp != null) && (paramFriendsManagerImp.isFriend()) && (paramFriendsManagerImp.remark != null) && (paramFriendsManagerImp.remark.length() > 0))
      {
        localATroopMember.g(paramFriendsManagerImp.remark);
        localATroopMember.i(ChnToSpell.a(localATroopMember.jdField_j_of_type_JavaLangString, 1));
        localATroopMember.h(ChnToSpell.a(localATroopMember.jdField_j_of_type_JavaLangString, 2));
      }
      for (;;)
      {
        if ((paramTroopMemberInfo.troopnick != null) && (paramTroopMemberInfo.troopnick.length() > 0))
        {
          localATroopMember.j(paramTroopMemberInfo.troopnick);
          localATroopMember.l(paramTroopMemberInfo.pyAll_troopnick);
          localATroopMember.k(paramTroopMemberInfo.pyFirst_troopnick);
        }
        localATroopMember.jdField_b_of_type_Long = paramTroopMemberInfo.last_active_time;
        localATroopMember.jdField_a_of_type_Long = paramTroopMemberInfo.join_time;
        localATroopMember.jdField_a_of_type_Int = paramTroopMemberInfo.level;
        localATroopMember.d = paramTroopMemberInfo.credit_level;
        localATroopMember.jdField_a_of_type_Boolean = paramTroopMemberInfo.isTroopFollowed;
        localATroopMember.jdField_c_of_type_Long = paramTroopMemberInfo.active_point;
        return localATroopMember;
        if (!TextUtils.isEmpty(paramTroopMemberInfo.troopnick))
        {
          paramFriendsManagerImp = paramTroopMemberInfo.troopnick;
          break;
        }
        if ((localObject1 != null) && (((Friends)localObject1).isFriend()))
        {
          paramFriendsManagerImp = ((Friends)localObject1).name;
          break;
        }
        paramFriendsManagerImp = (FriendsManagerImp)localObject2;
        if (paramTroopMemberInfo == null) {
          break;
        }
        if (localATroopMember.jdField_a_of_type_JavaLangString.equals(this.app.a()))
        {
          paramFriendsManagerImp = paramTroopMemberInfo.friendnick;
          break;
        }
        if (!TextUtils.isEmpty(paramTroopMemberInfo.autoremark))
        {
          paramFriendsManagerImp = paramTroopMemberInfo.autoremark;
          break;
        }
        paramFriendsManagerImp = paramTroopMemberInfo.friendnick;
        break;
        if ((paramTroopMemberInfo.autoremark != null) && (paramTroopMemberInfo.autoremark.length() > 0))
        {
          localATroopMember.g(paramTroopMemberInfo.autoremark);
          localATroopMember.i(paramTroopMemberInfo.pyAll_autoremark);
          localATroopMember.h(paramTroopMemberInfo.pyFirst_autoremark);
        }
      }
      label481:
      localObject2 = paramFriendsManagerImp;
      paramFriendsManagerImp = (FriendsManagerImp)localObject1;
      localObject1 = localObject2;
      continue;
      localObject1 = localObject2;
      paramFriendsManagerImp = null;
    }
  }
  
  public TroopMemberListActivity.TmViewHolder a(String paramString, boolean paramBoolean)
  {
    Object localObject1;
    int i2;
    int i1;
    if (paramBoolean)
    {
      localObject1 = this.jdField_a_of_type_ComTencentWidgetXListView;
      i2 = ((ViewGroup)localObject1).getChildCount();
      i1 = 0;
    }
    for (;;)
    {
      if (i1 >= i2) {
        break label133;
      }
      Object localObject2 = ((ViewGroup)localObject1).getChildAt(i1);
      if ((((View)localObject2).getTag() != null) && ((((View)localObject2).getTag() instanceof TroopMemberListActivity.TmViewHolder)))
      {
        localObject2 = (TroopMemberListActivity.TmViewHolder)((View)localObject2).getTag();
        if ((((TroopMemberListActivity.TmViewHolder)localObject2).jdField_a_of_type_JavaLangString != null) && (((TroopMemberListActivity.TmViewHolder)localObject2).jdField_a_of_type_JavaLangString.equals(paramString)))
        {
          if (QLog.isColorLevel()) {
            QLog.d("TroopMemberListActivity", 2, "findListItemHolderByUin:" + i1);
          }
          return localObject2;
          localObject1 = this.jdField_a_of_type_ComTencentMobileqqWidgetPinnedDividerListView;
          break;
        }
      }
      i1 += 1;
    }
    label133:
    return null;
  }
  
  void a(View paramView, int paramInt1, int paramInt2)
  {
    Object localObject;
    if (paramInt2 == 0)
    {
      localObject = new TranslateAnimation(0.0F, 34.0F * this.jdField_a_of_type_Float, 0.0F, 0.0F);
      ((Animation)localObject).setDuration(250L);
    }
    for (;;)
    {
      if (localObject != null)
      {
        ((Animation)localObject).setFillAfter(true);
        ((Animation)localObject).setAnimationListener(new bpp(this, paramView, paramInt2));
        paramView.clearAnimation();
        paramView.startAnimation((Animation)localObject);
      }
      return;
      if (paramInt2 == 1)
      {
        localObject = new TranslateAnimation(0.0F, -34.0F * this.jdField_a_of_type_Float, 0.0F, 0.0F);
        ((Animation)localObject).setDuration(250L);
      }
      else
      {
        localObject = AnimationUtils.loadAnimation(this, paramInt1);
      }
    }
  }
  
  public void a(TroopMemberListActivity.ATroopMember paramATroopMember)
  {
    if ((paramATroopMember == null) || (paramATroopMember.jdField_a_of_type_JavaLangString == null)) {}
    do
    {
      return;
      Object localObject;
      if (this.t == 1)
      {
        if (this.app.a().equals(paramATroopMember.jdField_a_of_type_JavaLangString))
        {
          localObject = new ProfileActivity.AllInOne(paramATroopMember.jdField_a_of_type_JavaLangString, 0);
          ((ProfileActivity.AllInOne)localObject).h = ContactUtils.g(this.app, paramATroopMember.jdField_a_of_type_JavaLangString);
          ((ProfileActivity.AllInOne)localObject).f = 3;
          ((ProfileActivity.AllInOne)localObject).g = 4;
          ProfileActivity.b(this, (ProfileActivity.AllInOne)localObject);
          return;
        }
        a(paramATroopMember.jdField_a_of_type_JavaLangString, paramATroopMember.jdField_b_of_type_JavaLangString);
        return;
      }
      if (this.t == 2)
      {
        localObject = getIntent();
        ((Intent)localObject).putExtra("troop_uin", this.i);
        ((Intent)localObject).putExtra("member_uin", paramATroopMember.jdField_a_of_type_JavaLangString);
        SetTroopAdminsActivity.TroopAdmin localTroopAdmin = new SetTroopAdminsActivity.TroopAdmin();
        localTroopAdmin.jdField_a_of_type_JavaLangString = paramATroopMember.jdField_a_of_type_JavaLangString;
        localTroopAdmin.jdField_a_of_type_Short = paramATroopMember.jdField_a_of_type_Short;
        localTroopAdmin.jdField_b_of_type_JavaLangString = paramATroopMember.jdField_b_of_type_JavaLangString;
        ((Intent)localObject).putExtra("member_info", localTroopAdmin);
        setResult(-1, (Intent)localObject);
        finish();
        return;
      }
      if ((this.t == 3) || (this.t == 10))
      {
        localObject = getIntent();
        ((Intent)localObject).putExtra("member_uin", paramATroopMember.jdField_a_of_type_JavaLangString);
        ((Intent)localObject).putExtra("member_display_name", paramATroopMember.jdField_b_of_type_JavaLangString);
        setResult(-1, (Intent)localObject);
        finish();
        return;
      }
    } while ((this.t != 0) && (this.t != 4));
    f(paramATroopMember.jdField_a_of_type_JavaLangString);
  }
  
  protected void a(TroopMemberListActivity.TmViewHolder paramTmViewHolder, TroopMemberListActivity.ATroopMember paramATroopMember, Bitmap paramBitmap, boolean paramBoolean)
  {
    String str;
    if (paramBoolean)
    {
      str = this.r;
      paramTmViewHolder.jdField_a_of_type_Boolean = paramBoolean;
      paramTmViewHolder.jdField_a_of_type_ComTencentMobileqqWidgetTroopMemberListSlideItem.setVisibility(0);
      paramTmViewHolder.jdField_a_of_type_AndroidWidgetTextView.setVisibility(8);
      paramTmViewHolder.jdField_a_of_type_AndroidWidgetImageView.setVisibility(0);
      paramTmViewHolder.jdField_b_of_type_AndroidWidgetImageView.setImageBitmap(paramBitmap);
      paramTmViewHolder.jdField_c_of_type_AndroidWidgetTextView.setText(paramATroopMember.jdField_b_of_type_JavaLangString);
      paramTmViewHolder.jdField_a_of_type_JavaLangString = paramATroopMember.jdField_a_of_type_JavaLangString;
      paramTmViewHolder.e.setText("");
      paramTmViewHolder.jdField_c_of_type_AndroidViewView.setTag(Boolean.valueOf(paramBoolean));
      paramTmViewHolder.jdField_b_of_type_AndroidWidgetTextView.setTag(Boolean.valueOf(paramBoolean));
      paramTmViewHolder.f.setOnClickListener(this.jdField_b_of_type_AndroidViewView$OnClickListener);
      paramTmViewHolder.jdField_b_of_type_AndroidViewView.setOnClickListener(this.jdField_b_of_type_AndroidViewView$OnClickListener);
      paramTmViewHolder.jdField_a_of_type_ComTencentMobileqqWidgetTroopMemberListSlideItem.setOnClickListener(this.jdField_a_of_type_AndroidViewView$OnClickListener);
      if (!this.jdField_b_of_type_Boolean) {
        break label350;
      }
      paramTmViewHolder.jdField_a_of_type_AndroidViewView.setOnClickListener(this.jdField_b_of_type_AndroidViewView$OnClickListener);
      paramTmViewHolder.jdField_a_of_type_AndroidViewView.setClickable(true);
      label161:
      if (this.t != 1) {
        break label400;
      }
      paramTmViewHolder.jdField_c_of_type_AndroidWidgetTextView.setContentDescription(getString(2131363246) + paramTmViewHolder.jdField_c_of_type_AndroidWidgetTextView.getText().toString());
      if ((this.jdField_j_of_type_JavaLangString == null) || (paramATroopMember.jdField_a_of_type_JavaLangString.equals(this.jdField_j_of_type_JavaLangString))) {
        break label369;
      }
      paramTmViewHolder.jdField_b_of_type_AndroidViewView.setVisibility(0);
      label240:
      if (!str.equals(paramATroopMember.jdField_a_of_type_JavaLangString)) {
        break label389;
      }
      paramTmViewHolder.jdField_a_of_type_ComTencentMobileqqWidgetTroopMemberListSlideItem.a(false);
    }
    for (;;)
    {
      paramTmViewHolder.jdField_b_of_type_AndroidViewView.setContentDescription(String.format(getString(2131363244), new Object[] { paramTmViewHolder.jdField_c_of_type_AndroidWidgetTextView.getText().toString() }));
      paramTmViewHolder.f.setContentDescription(getString(2131363245));
      return;
      str = this.q;
      if (this.jdField_a_of_type_ComTencentMobileqqWidgetIndexView.getVisibility() == 0)
      {
        paramTmViewHolder.jdField_d_of_type_AndroidViewView.setVisibility(0);
        break;
      }
      paramTmViewHolder.jdField_d_of_type_AndroidViewView.setVisibility(8);
      break;
      label350:
      paramTmViewHolder.jdField_a_of_type_AndroidViewView.setOnClickListener(null);
      paramTmViewHolder.jdField_a_of_type_AndroidViewView.setClickable(false);
      break label161;
      label369:
      paramTmViewHolder.jdField_b_of_type_AndroidViewView.setVisibility(8);
      paramTmViewHolder.jdField_a_of_type_ComTencentMobileqqWidgetTroopMemberListSlideItem.b(false);
      break label240;
      label389:
      paramTmViewHolder.jdField_a_of_type_ComTencentMobileqqWidgetTroopMemberListSlideItem.b(false);
    }
    label400:
    if (this.y == 2)
    {
      paramTmViewHolder.jdField_b_of_type_AndroidWidgetTextView.setVisibility(8);
      paramTmViewHolder.jdField_d_of_type_AndroidWidgetTextView.setVisibility(0);
      paramTmViewHolder.jdField_d_of_type_AndroidWidgetTextView.setText(getString(2131362889, new Object[] { Long.valueOf(paramATroopMember.jdField_c_of_type_Long) }));
    }
    while (this.jdField_b_of_type_Boolean) {
      if ((paramATroopMember.jdField_a_of_type_JavaLangString.equals(this.jdField_j_of_type_JavaLangString)) || ((!this.app.a().equals(this.jdField_j_of_type_JavaLangString)) && (this.jdField_k_of_type_JavaLangString != null) && (this.jdField_k_of_type_JavaLangString.contains(paramATroopMember.jdField_a_of_type_JavaLangString))))
      {
        paramTmViewHolder.jdField_b_of_type_AndroidViewView.setVisibility(8);
        paramTmViewHolder.jdField_a_of_type_ComTencentMobileqqWidgetTroopMemberListSlideItem.b(false);
        return;
        paramTmViewHolder.jdField_d_of_type_AndroidWidgetTextView.setVisibility(8);
        paramTmViewHolder.jdField_b_of_type_AndroidWidgetTextView.setText("");
        int i1;
        if ((this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo != null) && (this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.getTroopLevelMap() != null) && (!TextUtils.isEmpty((CharSequence)this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.getTroopLevelMap().get(Integer.valueOf(paramATroopMember.jdField_a_of_type_Int))))) {
          i1 = 1;
        }
        for (;;)
        {
          if ((paramATroopMember.jdField_a_of_type_JavaLangString != null) && (paramATroopMember.jdField_a_of_type_JavaLangString.equals(this.jdField_j_of_type_JavaLangString)))
          {
            if (paramATroopMember.jdField_a_of_type_JavaLangString.equals(this.app.a()))
            {
              if (i1 != 0)
              {
                paramTmViewHolder.jdField_b_of_type_AndroidWidgetTextView.setText(this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.getOwnerShow(this));
                paramTmViewHolder.jdField_b_of_type_AndroidWidgetTextView.setVisibility(0);
                paramTmViewHolder.e.setText(getString(2131362855));
                break;
                i1 = 0;
                continue;
              }
              paramTmViewHolder.jdField_b_of_type_AndroidWidgetTextView.setVisibility(8);
              if (this.t == 10)
              {
                paramTmViewHolder.e.setText(getString(2131362855));
                break;
              }
              paramTmViewHolder.e.setText(getString(2131362854));
              break;
            }
            if (i1 != 0)
            {
              paramTmViewHolder.jdField_b_of_type_AndroidWidgetTextView.setText(this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.getOwnerShow(this));
              paramTmViewHolder.jdField_b_of_type_AndroidWidgetTextView.setVisibility(0);
              paramTmViewHolder.e.setText("");
              break;
            }
            paramTmViewHolder.jdField_b_of_type_AndroidWidgetTextView.setVisibility(8);
            if (this.t == 10)
            {
              paramTmViewHolder.e.setText("");
              break;
            }
            paramTmViewHolder.e.setText(getString(2131362852));
            break;
          }
        }
        if ((this.jdField_k_of_type_JavaLangString != null) && (this.jdField_k_of_type_JavaLangString.contains(paramATroopMember.jdField_a_of_type_JavaLangString)))
        {
          if (paramATroopMember.jdField_a_of_type_JavaLangString.equals(this.app.a()))
          {
            if (i1 != 0)
            {
              paramTmViewHolder.jdField_b_of_type_AndroidWidgetTextView.setText(this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.getAdminShow(this));
              paramTmViewHolder.jdField_b_of_type_AndroidWidgetTextView.setVisibility(0);
              paramTmViewHolder.e.setText(getString(2131362855));
            }
            else
            {
              paramTmViewHolder.jdField_b_of_type_AndroidWidgetTextView.setVisibility(8);
              paramTmViewHolder.e.setText(getString(2131362853));
            }
          }
          else if (i1 != 0)
          {
            paramTmViewHolder.jdField_b_of_type_AndroidWidgetTextView.setText(this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.getAdminShow(this));
            paramTmViewHolder.jdField_b_of_type_AndroidWidgetTextView.setVisibility(0);
            paramTmViewHolder.e.setText("");
          }
          else
          {
            paramTmViewHolder.jdField_b_of_type_AndroidWidgetTextView.setVisibility(8);
            paramTmViewHolder.e.setText(getString(2131362851));
          }
        }
        else
        {
          if (i1 != 0)
          {
            paramTmViewHolder.jdField_b_of_type_AndroidWidgetTextView.setText((CharSequence)this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.getTroopLevelMap().get(Integer.valueOf(paramATroopMember.jdField_a_of_type_Int)));
            paramTmViewHolder.jdField_b_of_type_AndroidWidgetTextView.setVisibility(0);
          }
          for (;;)
          {
            if (!paramATroopMember.jdField_a_of_type_JavaLangString.equals(this.app.a())) {
              break label1081;
            }
            paramTmViewHolder.e.setText(getString(2131362855));
            break;
            paramTmViewHolder.jdField_b_of_type_AndroidWidgetTextView.setVisibility(8);
          }
        }
      }
      else
      {
        label1081:
        paramTmViewHolder.jdField_b_of_type_AndroidViewView.setVisibility(0);
        if (str.equals(paramATroopMember.jdField_a_of_type_JavaLangString))
        {
          paramTmViewHolder.jdField_a_of_type_ComTencentMobileqqWidgetTroopMemberListSlideItem.a(false);
          return;
        }
        paramTmViewHolder.jdField_a_of_type_ComTencentMobileqqWidgetTroopMemberListSlideItem.b(false);
        return;
      }
    }
    paramTmViewHolder.jdField_b_of_type_AndroidViewView.setVisibility(8);
    paramTmViewHolder.jdField_a_of_type_ComTencentMobileqqWidgetTroopMemberListSlideItem.b(false);
  }
  
  public void a(ActionSheet paramActionSheet, String[] paramArrayOfString)
  {
    if ((paramActionSheet == null) || (paramArrayOfString == null)) {
      return;
    }
    for (;;)
    {
      int i2;
      int i1;
      try
      {
        paramActionSheet = (LinearLayout)paramActionSheet.findViewById(2131296504);
        i2 = paramActionSheet.getChildCount();
        paramArrayOfString = paramArrayOfString[this.y];
        if (!QLog.isColorLevel()) {
          break label200;
        }
        QLog.d("TroopMemberListActivity", 2, "checkSortType:" + paramArrayOfString);
      }
      catch (Exception paramActionSheet) {}
      if (i1 >= i2) {
        break;
      }
      View localView2 = paramActionSheet.getChildAt(i1);
      if (localView2 != null)
      {
        View localView1 = localView2.findViewById(2131296507);
        localView2 = localView2.findViewById(2131296509);
        if (((localView1 instanceof TextView)) && ((localView2 instanceof ImageView)))
        {
          if (paramArrayOfString.equals(((TextView)localView1).getText().toString()))
          {
            localView2.setVisibility(0);
            break label205;
            if (!QLog.isColorLevel()) {
              break;
            }
            QLog.d("TroopMemberListActivity", 2, "checkSortType:" + paramActionSheet.toString());
            return;
          }
          localView2.setVisibility(4);
          break label205;
          label200:
          i1 = 0;
          continue;
        }
      }
      label205:
      i1 += 1;
    }
  }
  
  protected void a(AdapterView paramAdapterView, int paramInt)
  {
    paramAdapterView = (TroopMemberListActivity.ATroopMember)paramAdapterView.a().getItem(paramInt);
    if ((paramAdapterView == null) || (paramAdapterView.jdField_a_of_type_JavaLangString == null)) {
      return;
    }
    a(paramAdapterView);
  }
  
  public void a(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) {}
  
  public void a(String paramString)
  {
    if ("$".equals(paramString)) {
      this.jdField_a_of_type_ComTencentMobileqqWidgetPinnedDividerListView.setSelection(0);
    }
    int i1;
    do
    {
      return;
      i1 = this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$ListAdapter.a(paramString);
    } while (i1 == -1);
    this.jdField_a_of_type_ComTencentMobileqqWidgetPinnedDividerListView.setSelection(i1 + this.jdField_a_of_type_ComTencentMobileqqWidgetPinnedDividerListView.k());
  }
  
  public void a(String paramString, int paramInt)
  {
    if ("$".equals(paramString)) {
      if ((this.t == 10) && (paramInt == 1)) {
        ReportController.b(this.app, "CliOper", "", "", "0X800621B", "0X800621B", 0, 0, "", "", "", "");
      }
    }
    while ((this.t != 10) || (paramInt != 0)) {
      return;
    }
    ReportController.b(this.app, "CliOper", "", "", "0X800621A", "0X800621A", 0, 0, "", "", "", "");
  }
  
  protected void a(String paramString1, String paramString2)
  {
    paramString2 = (FriendManager)this.app.getManager(8);
    if (paramString2 != null)
    {
      if (paramString2.b(paramString1))
      {
        paramString1 = new ProfileActivity.AllInOne(paramString1, 20);
        paramString1.jdField_a_of_type_Int = 20;
        paramString1.d = this.h;
        paramString1.jdField_c_of_type_JavaLangString = this.i;
        paramString1.g = 4;
        ProfileActivity.b(this, paramString1);
      }
    }
    else {
      return;
    }
    paramString1 = new ProfileActivity.AllInOne(paramString1, 21);
    paramString1.jdField_a_of_type_Int = 21;
    paramString1.d = this.h;
    paramString1.jdField_c_of_type_JavaLangString = this.i;
    paramString1.g = 4;
    ProfileActivity.b(this, paramString1);
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      if (QLog.isColorLevel()) {
        QLog.i("TroopMemberListActivity", 2, "doReport, actionName=" + paramString1 + " ext2=" + paramString2 + " ext3=" + paramString3 + " from=" + this.t);
      }
      if (this.t != 1)
      {
        if (this.t == 10) {
          return;
        }
        ReportController.b(this.app, "P_CliOper", "Grp_mber", "", "mber_list", paramString1, 0, 0, this.i, paramString2, paramString3, "");
        return;
      }
    }
    catch (Exception paramString1)
    {
      if (QLog.isColorLevel()) {
        QLog.i("TroopMemberListActivity", 2, "doReport:" + paramString1.toString());
      }
    }
  }
  
  public Object[] a(String paramString)
  {
    int i1 = 0;
    ArrayList localArrayList;
    long l1;
    Object localObject;
    long l2;
    int i2;
    try
    {
      localArrayList = new ArrayList();
      try
      {
        if (QLog.isColorLevel()) {
          QLog.d("TroopMemberListActivity", 2, "getDiscussionMemberFromDB, uin:" + paramString);
        }
        l1 = System.currentTimeMillis();
        localObject = (FriendsManager)this.app.getManager(43);
        this.jdField_c_of_type_JavaUtilList = ((DiscussionManager)this.app.getManager(45)).a(paramString);
        l2 = System.currentTimeMillis();
        if (QLog.isColorLevel()) {
          QLog.d("TroopMemberListActivity", 2, "getDiscussionMemberFromDB, queryTime:" + (l2 - l1));
        }
        if (this.jdField_c_of_type_JavaUtilList == null) {
          break label536;
        }
        i2 = this.jdField_c_of_type_JavaUtilList.size();
        if (i1 < i2)
        {
          paramString = (DiscussionMemberInfo)this.jdField_c_of_type_JavaUtilList.get(i1);
          if (paramString == null) {
            break label541;
          }
          if ((paramString.memberUin != null) && (paramString.memberUin.trim().length() > 0) && (!paramString.memberUin.trim().equalsIgnoreCase("0")))
          {
            if ((this.t == 2) && (paramString.memberUin.equals(this.jdField_j_of_type_JavaLangString))) {
              break label541;
            }
          }
          else
          {
            if (!QLog.isColorLevel()) {
              break label541;
            }
            QLog.d("TroopMemberListActivity", 2, "getDiscussionMemberFromDB, continued:" + paramString.memberUin);
          }
        }
      }
      catch (Exception paramString)
      {
        if (QLog.isColorLevel()) {
          QLog.d("TroopMemberListActivity", 2, "getDiscussionMemberFromDB:" + paramString.toString());
        }
        paramString = new Object[1];
        paramString[0] = localArrayList;
        return paramString;
        localArrayList.add(a(paramString, (FriendsManager)localObject));
      }
      catch (OutOfMemoryError paramString)
      {
        for (;;)
        {
          label310:
          if (QLog.isColorLevel()) {
            QLog.d("TroopMemberListActivity", 2, "getDiscussionMemberFromDB:" + paramString.toString());
          }
        }
      }
      if (this.app.a() == null) {
        break label548;
      }
    }
    finally {}
    this.app.a().f();
    for (;;)
    {
      l2 = System.currentTimeMillis();
      if (QLog.isColorLevel()) {
        QLog.d("TroopMemberListActivity", 2, "getDiscussionMemberFromDB, TotalTime:" + (l2 - l1) + ", listSize:" + localArrayList.size() + ", dbSize:" + i1);
      }
      localObject = this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$ListAdapter.a(localArrayList);
      if ((localObject != null) && (localObject.length == 3))
      {
        paramString = new Object[4];
        paramString[0] = localArrayList;
        paramString[1] = localObject[0];
        paramString[2] = localObject[1];
        paramString[3] = localObject[2];
        break label310;
      }
      paramString = new Object[1];
      paramString[0] = localArrayList;
      break label310;
      label536:
      i1 = 0;
      continue;
      label541:
      i1 += 1;
      break;
      label548:
      i1 = i2;
    }
  }
  
  public void b(String paramString)
  {
    if (QLog.isColorLevel()) {
      QLog.d("TroopMemberListActivity", 2, "removeSearchItem:" + paramString);
    }
    List localList = this.jdField_b_of_type_JavaUtilList;
    int i1 = 0;
    for (;;)
    {
      try
      {
        if (i1 < this.jdField_b_of_type_JavaUtilList.size())
        {
          TroopMemberListActivity.ATroopMember localATroopMember = (TroopMemberListActivity.ATroopMember)this.jdField_b_of_type_JavaUtilList.get(i1);
          if ((localATroopMember != null) && (localATroopMember.jdField_a_of_type_JavaLangString.equals(paramString))) {
            this.jdField_b_of_type_JavaUtilList.remove(i1);
          }
        }
        else
        {
          return;
        }
      }
      finally {}
      i1 += 1;
    }
  }
  
  public Object[] b(String paramString)
  {
    ArrayList localArrayList;
    long l1;
    Object localObject;
    long l2;
    int i1;
    int i2;
    try
    {
      localArrayList = new ArrayList();
      try
      {
        if (QLog.isColorLevel()) {
          QLog.d("TroopMemberListActivity", 2, "getTroopMemberFromDB, uin:" + paramString);
        }
        l1 = System.currentTimeMillis();
        localObject = this.app.a().createEntityManager();
        paramString = ((EntityManager)localObject).a(TroopMemberInfo.class, false, "troopuin=? ", new String[] { paramString }, null, null, null, null);
        ((EntityManager)localObject).a();
        l2 = System.currentTimeMillis();
        if (QLog.isColorLevel()) {
          QLog.d("TroopMemberListActivity", 2, "getTroopMemberFromDB, queryTime:" + (l2 - l1));
        }
        i1 = 0;
        if (paramString == null) {
          break label488;
        }
        localObject = (FriendsManagerImp)this.app.getManager(8);
        i2 = paramString.size();
        i1 = 0;
        if (i1 < i2)
        {
          localTroopMemberInfo = (TroopMemberInfo)paramString.get(i1);
          if (localTroopMemberInfo == null) {
            break label625;
          }
          if ((localTroopMemberInfo.memberuin != null) && (localTroopMemberInfo.memberuin.trim().length() > 0) && (!localTroopMemberInfo.memberuin.trim().equalsIgnoreCase("0")) && (!localTroopMemberInfo.memberuin.trim().equalsIgnoreCase("10000")) && (!localTroopMemberInfo.memberuin.trim().equalsIgnoreCase("1000000")) && (!localTroopMemberInfo.memberuin.trim().equalsIgnoreCase("80000000")))
          {
            if (this.t == 2)
            {
              if (localTroopMemberInfo.memberuin.equals(this.jdField_j_of_type_JavaLangString)) {
                break label625;
              }
              if (this.jdField_k_of_type_JavaLangString.contains(localTroopMemberInfo.memberuin)) {
                break label625;
              }
            }
          }
          else
          {
            if (!QLog.isColorLevel()) {
              break label625;
            }
            QLog.d("TroopMemberListActivity", 2, "getTroopMemberFromDB, continued, tmi.memberuin:" + localTroopMemberInfo.memberuin);
          }
        }
      }
      catch (Exception paramString)
      {
        TroopMemberInfo localTroopMemberInfo;
        if (QLog.isColorLevel()) {
          QLog.d("TroopMemberListActivity", 2, "getTroopMemberFromDB:" + paramString.toString());
        }
        paramString = new Object[1];
        paramString[0] = localArrayList;
        return paramString;
        localArrayList.add(a(localTroopMemberInfo, (FriendsManagerImp)localObject));
      }
      catch (OutOfMemoryError paramString)
      {
        for (;;)
        {
          label398:
          if (QLog.isColorLevel()) {
            QLog.d("TroopMemberListActivity", 2, "getTroopMemberFromDB:" + paramString.toString());
          }
        }
      }
      if (this.app.a() == null) {
        break label632;
      }
    }
    finally {}
    this.app.a().f();
    for (;;)
    {
      label488:
      l2 = System.currentTimeMillis();
      if (QLog.isColorLevel()) {
        QLog.d("TroopMemberListActivity", 2, "getTroopMemberFromDB, totalTime:" + (l2 - l1) + ", listSize:" + localArrayList.size() + ", dbSize:" + i1);
      }
      localObject = this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$ListAdapter.a(localArrayList);
      if ((localObject != null) && (localObject.length == 3))
      {
        paramString = new Object[4];
        paramString[0] = localArrayList;
        paramString[1] = localObject[0];
        paramString[2] = localObject[1];
        paramString[3] = localObject[2];
        break label398;
      }
      paramString = new Object[1];
      paramString[0] = localArrayList;
      break label398;
      label625:
      i1 += 1;
      break;
      label632:
      i1 = i2;
    }
  }
  
  protected void c()
  {
    Object localObject = (ViewGroup)findViewById(2131296891);
    if (localObject != null) {
      IphoneTitleBarActivity.setLayerType((View)localObject);
    }
    localObject = findViewById(2131297507);
    if (localObject != null) {
      IphoneTitleBarActivity.setLayerType((View)localObject);
    }
    localObject = (TextView)findViewById(2131296898);
    if (localObject != null) {
      IphoneTitleBarActivity.setLayerType((View)localObject);
    }
  }
  
  public void c(String paramString)
  {
    if (QLog.isColorLevel()) {
      QLog.d("TroopMemberListActivity", 2, "removeItem:" + paramString);
    }
    List localList = this.jdField_a_of_type_JavaUtilList;
    int i1 = 0;
    for (;;)
    {
      try
      {
        if (i1 < this.jdField_a_of_type_JavaUtilList.size())
        {
          TroopMemberListActivity.ATroopMember localATroopMember = (TroopMemberListActivity.ATroopMember)this.jdField_a_of_type_JavaUtilList.get(i1);
          if ((localATroopMember != null) && (localATroopMember.jdField_a_of_type_JavaLangString.equals(paramString))) {
            this.jdField_a_of_type_JavaUtilList.remove(i1);
          }
        }
        else
        {
          return;
        }
      }
      finally {}
      i1 += 1;
    }
  }
  
  protected void d()
  {
    this.jdField_a_of_type_AndroidWidgetLinearLayout = ((LinearLayout)findViewById(2131298908));
    this.jdField_a_of_type_AndroidViewView = findViewById(2131297507);
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131296892));
    this.jdField_b_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131296898));
    this.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)findViewById(2131296903));
    this.jdField_d_of_type_AndroidWidgetRelativeLayout = ((RelativeLayout)findViewById(2131296908));
    this.jdField_b_of_type_AndroidWidgetImageView = ((ImageView)this.jdField_d_of_type_AndroidWidgetRelativeLayout.findViewById(2131296909));
    this.jdField_c_of_type_AndroidWidgetImageView = ((ImageView)this.jdField_d_of_type_AndroidWidgetRelativeLayout.findViewById(2131296910));
    this.jdField_b_of_type_AndroidWidgetImageView.setImageResource(2130838062);
    this.jdField_c_of_type_AndroidWidgetImageView.setImageResource(2130838057);
    this.jdField_b_of_type_AndroidWidgetImageView.setContentDescription(getString(2131364541));
    this.jdField_c_of_type_AndroidWidgetImageView.setContentDescription(getString(2131364542));
    this.jdField_b_of_type_AndroidWidgetImageView.setOnClickListener(new boj(this));
    this.jdField_c_of_type_AndroidWidgetImageView.setOnClickListener(new bow(this));
    this.jdField_a_of_type_ComTencentMobileqqWidgetPinnedDividerListView = ((PinnedDividerListView)findViewById(2131298788));
    this.jdField_a_of_type_ComTencentMobileqqWidgetIndexView = ((IndexView)findViewById(2131298743));
    this.jdField_d_of_type_AndroidViewView = findViewById(2131296561);
    this.jdField_a_of_type_AndroidWidgetImageView.setContentDescription(getString(2131362890));
  }
  
  protected void d(String paramString)
  {
    this.r = "";
    this.jdField_b_of_type_JavaUtilList.clear();
    this.jdField_c_of_type_AndroidViewView.getLayoutParams().height = -1;
    if ((paramString == null) || (paramString.trim().length() == 0))
    {
      this.jdField_a_of_type_AndroidWidgetImageButton.setVisibility(8);
      this.jdField_a_of_type_ComTencentWidgetXListView.setVisibility(8);
      this.jdField_b_of_type_AndroidViewView.setVisibility(8);
      this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$SearchResultAdapter.notifyDataSetChanged();
      return;
    }
    this.jdField_a_of_type_AndroidWidgetImageButton.setVisibility(0);
    this.jdField_a_of_type_ComTencentWidgetXListView.setVisibility(0);
    String str1 = paramString.toLowerCase();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    paramString = this.jdField_a_of_type_JavaUtilList;
    int i1 = 0;
    for (;;)
    {
      TroopMemberListActivity.ATroopMember localATroopMember;
      try
      {
        if (i1 >= this.jdField_a_of_type_JavaUtilList.size()) {
          break label855;
        }
        localATroopMember = (TroopMemberListActivity.ATroopMember)this.jdField_a_of_type_JavaUtilList.get(i1);
        localATroopMember.e = "";
        localATroopMember.f = "";
        if ((str1.equals(localATroopMember.m)) || (str1.equals(localATroopMember.o)) || (str1.equals(localATroopMember.n)))
        {
          localATroopMember.e = localATroopMember.m;
          localArrayList1.add(localATroopMember);
        }
        else if ((str1.equals(localATroopMember.jdField_j_of_type_JavaLangString)) || (str1.equals(localATroopMember.l)) || (str1.equals(localATroopMember.jdField_k_of_type_JavaLangString)))
        {
          localATroopMember.e = localATroopMember.jdField_j_of_type_JavaLangString;
          localArrayList1.add(localATroopMember);
        }
      }
      finally {}
      if ((str2.equals(localATroopMember.g)) || (str2.equals(localATroopMember.i)) || (str2.equals(localATroopMember.h)))
      {
        localATroopMember.e = localATroopMember.g;
        localArrayList1.add(localATroopMember);
      }
      else if (str2.equals(localATroopMember.jdField_a_of_type_JavaLangString))
      {
        localATroopMember.e = localATroopMember.jdField_a_of_type_JavaLangString;
        localArrayList1.add(localATroopMember);
      }
      else if ((localATroopMember.m.indexOf(str2) == 0) || (localATroopMember.o.indexOf(str2) == 0) || (localATroopMember.n.indexOf(str2) == 0))
      {
        localATroopMember.e = localATroopMember.m;
        localATroopMember.f = localATroopMember.n;
        localArrayList2.add(localATroopMember);
      }
      else if ((localATroopMember.jdField_j_of_type_JavaLangString.indexOf(str2) == 0) || (localATroopMember.l.indexOf(str2) == 0) || (localATroopMember.jdField_k_of_type_JavaLangString.indexOf(str2) == 0))
      {
        localATroopMember.e = localATroopMember.jdField_j_of_type_JavaLangString;
        localATroopMember.f = localATroopMember.jdField_k_of_type_JavaLangString;
        localArrayList2.add(localATroopMember);
      }
      else if ((localATroopMember.g.indexOf(str2) == 0) || (localATroopMember.i.indexOf(str2) == 0) || (localATroopMember.h.indexOf(str2) == 0))
      {
        localATroopMember.e = localATroopMember.g;
        localATroopMember.f = localATroopMember.h;
        localArrayList2.add(localATroopMember);
      }
      else if (localATroopMember.jdField_a_of_type_JavaLangString.indexOf(str2) == 0)
      {
        localATroopMember.e = localATroopMember.jdField_a_of_type_JavaLangString;
        localATroopMember.f = localATroopMember.jdField_a_of_type_JavaLangString;
        localArrayList2.add(localATroopMember);
      }
      else if ((localATroopMember.m.indexOf(str2) > 0) || (localATroopMember.o.indexOf(str2) > 0) || (localATroopMember.n.indexOf(str2) > 0))
      {
        localATroopMember.e = localATroopMember.m;
        localArrayList3.add(localATroopMember);
      }
      else if ((localATroopMember.jdField_j_of_type_JavaLangString.indexOf(str2) > 0) || (localATroopMember.l.indexOf(str2) > 0) || (localATroopMember.jdField_k_of_type_JavaLangString.indexOf(str2) > 0))
      {
        localATroopMember.e = localATroopMember.jdField_j_of_type_JavaLangString;
        localArrayList3.add(localATroopMember);
      }
      else if ((localATroopMember.g.indexOf(str2) > 0) || (localATroopMember.i.indexOf(str2) > 0) || (localATroopMember.h.indexOf(str2) > 0))
      {
        localATroopMember.e = localATroopMember.g;
        localArrayList3.add(localATroopMember);
      }
      else if (localATroopMember.jdField_a_of_type_JavaLangString.indexOf(str2) > 0)
      {
        localATroopMember.e = localATroopMember.jdField_a_of_type_JavaLangString;
        localArrayList3.add(localATroopMember);
        break label946;
        label855:
        Collections.sort(localArrayList2, new TroopMemberListActivity.SearchResultComparator(this));
        this.jdField_b_of_type_JavaUtilList.addAll(localArrayList1);
        this.jdField_b_of_type_JavaUtilList.addAll(localArrayList2);
        this.jdField_b_of_type_JavaUtilList.addAll(localArrayList3);
        if (this.jdField_b_of_type_JavaUtilList.isEmpty()) {
          this.jdField_b_of_type_AndroidViewView.setVisibility(0);
        }
        for (;;)
        {
          this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$SearchResultAdapter.notifyDataSetChanged();
          return;
          this.jdField_b_of_type_AndroidViewView.setVisibility(8);
        }
      }
      label946:
      i1 += 1;
    }
  }
  
  protected void doOnActivityResult(int paramInt1, int paramInt2, Intent arg3)
  {
    int i1 = -1;
    FriendsManagerImp localFriendsManagerImp;
    if (paramInt2 == -1) {
      localFriendsManagerImp = (FriendsManagerImp)this.app.getManager(8);
    }
    switch (paramInt1)
    {
    default: 
      return;
    }
    if (???.getBooleanExtra("isNeedFinish", false))
    {
      ??? = new Intent();
      ???.putExtra("isNeedFinish", true);
      setResult(-1, ???);
      finish();
      return;
    }
    Object localObject1 = "";
    paramInt1 = i1;
    if (??? != null)
    {
      paramInt1 = ???.getIntExtra("memberOperationFlag", -1);
      localObject1 = ???.getStringExtra("memberOperateUin");
    }
    if (QLog.isColorLevel()) {
      QLog.d("TroopMemberListActivity", 2, "onActivityResult, REQUEST_CODE_SHOW_MEMBER_CARD, optFlg=" + paramInt1 + ", optUin=" + (String)localObject1);
    }
    if (paramInt1 == 1) {
      c((String)localObject1);
    }
    label163:
    while ((paramInt1 >= 0) && (this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$ListAdapter != null))
    {
      this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$ListAdapter.a();
      return;
      if (paramInt1 == 0)
      {
        TroopMemberInfo localTroopMemberInfo = DBUtils.a().a(this.app, this.i, (String)localObject1);
        if ((localTroopMemberInfo != null) && (localFriendsManagerImp != null))
        {
          c((String)localObject1);
          synchronized (this.jdField_a_of_type_JavaUtilList)
          {
            localObject1 = a(localTroopMemberInfo, localFriendsManagerImp);
            this.jdField_a_of_type_JavaUtilList.add(localObject1);
          }
        }
      }
      else if ((paramInt1 == 2) && (localFriendsManagerImp != null))
      {
        this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo = localFriendsManagerImp.a(this.i);
        if (this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo != null)
        {
          if (this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.troopowneruin != null) {
            this.jdField_j_of_type_JavaLangString = this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.troopowneruin;
          }
          if (this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.Administrator != null) {
            this.jdField_k_of_type_JavaLangString = this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.Administrator;
          }
          if (((this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.troopowneruin == null) || (!this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.troopowneruin.equals(this.app.a()))) && ((this.jdField_k_of_type_JavaLangString == null) || (!this.jdField_k_of_type_JavaLangString.contains(this.app.a())))) {
            break label447;
          }
        }
      }
    }
    label447:
    for (boolean bool = true;; bool = false)
    {
      this.jdField_a_of_type_Boolean = bool;
      if (!QLog.isColorLevel()) {
        break label163;
      }
      QLog.d("TroopMemberListActivity", 2, "onActivityResult, REQUEST_CODE_SHOW_MEMBER_CARD, admins:" + this.jdField_k_of_type_JavaLangString + " owner:" + this.jdField_j_of_type_JavaLangString);
      break label163;
      break;
    }
  }
  
  public void doOnBackPressed()
  {
    if (this.t == 10) {
      ReportController.b(this.app, "CliOper", "", "", "0X8006215", "0X8006215", 0, 0, "2", "", "", "");
    }
    super.doOnBackPressed();
  }
  
  protected boolean doOnCreate(Bundle paramBundle)
  {
    boolean bool2 = false;
    this.h = getIntent().getStringExtra("troop_uin");
    this.i = getIntent().getStringExtra("troop_code");
    this.f = getIntent().getBooleanExtra("param_is_pop_up_style", false);
    this.t = getIntent().getIntExtra("param_from", 0);
    this.jdField_k_of_type_Int = getIntent().getIntExtra("param_chat_mode", 0);
    if (QLog.isColorLevel()) {
      QLog.d("TroopMemberListActivity", 2, "doOnCreate, troopCode=" + this.i + " troopUin=" + this.h + " from=" + this.t);
    }
    if (this.f) {
      setTheme(2131624276);
    }
    super.doOnCreate(paramBundle);
    setContentView(2130903688);
    d();
    this.jdField_a_of_type_ComTencentMobileqqAppDiscussionHandler = ((DiscussionHandler)this.app.a(6));
    this.jdField_a_of_type_AndroidViewLayoutInflater = getLayoutInflater();
    this.jdField_a_of_type_Float = getResources().getDisplayMetrics().density;
    paramBundle = (TroopManager)this.app.getManager(44);
    Object localObject = (DiscussionManager)this.app.getManager(45);
    label300:
    boolean bool1;
    label365:
    String str;
    if ((paramBundle != null) && (localObject != null)) {
      if ((this.t == 1) || (this.t == 10))
      {
        this.jdField_a_of_type_ComTencentMobileqqDataDiscussionInfo = ((DiscussionManager)localObject).a(this.h);
        this.i = this.h;
        if ((this.t != 1) && (this.t != 10)) {
          break label551;
        }
        addObserver(this.jdField_a_of_type_ComTencentMobileqqAppDiscussionObserver);
        ChnToSpell.a(this);
        if (this.t == 1) {
          break label759;
        }
        if (this.t != 10) {
          break label571;
        }
        if (this.jdField_a_of_type_ComTencentMobileqqDataDiscussionInfo != null)
        {
          this.jdField_j_of_type_JavaLangString = this.jdField_a_of_type_ComTencentMobileqqDataDiscussionInfo.ownerUin;
          if ((this.jdField_j_of_type_JavaLangString == null) || (!this.jdField_j_of_type_JavaLangString.equals(this.app.a()))) {
            break label566;
          }
          bool1 = true;
          this.jdField_a_of_type_Boolean = bool1;
        }
        ReportController.b(this.app, "CliOper", "", "", "0X8006214", "0X8006214", 0, 0, "", "", "", "");
        e();
        g();
        h();
        c();
        localObject = "4";
        paramBundle = (Bundle)localObject;
        switch (this.t)
        {
        default: 
          paramBundle = (Bundle)localObject;
        case 1: 
          label467:
          str = "2";
          if ((this.jdField_j_of_type_JavaLangString != null) && (this.jdField_j_of_type_JavaLangString.equals(this.app.a()))) {
            localObject = "0";
          }
          break;
        }
      }
    }
    for (;;)
    {
      this.p = ((String)localObject);
      a("exp", paramBundle, (String)localObject);
      return true;
      this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo = paramBundle.a(this.i);
      break;
      if (!QLog.isColorLevel()) {
        break;
      }
      QLog.d("TroopMemberListActivity", 2, "doOnCreate, app.getManager(QQAppInterface.FRIEND_MANAGER) is null");
      break;
      label551:
      this.app.a(this.jdField_a_of_type_ComTencentMobileqqAppTroopObserver, true);
      break label300;
      label566:
      bool1 = false;
      break label365;
      label571:
      this.jdField_b_of_type_Boolean = false;
      if (this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo != null)
      {
        if (this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.troopowneruin != null) {
          this.jdField_j_of_type_JavaLangString = this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.troopowneruin;
        }
        if (this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.Administrator != null) {
          this.jdField_k_of_type_JavaLangString = this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.Administrator;
        }
        if ((this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.troopowneruin == null) || (!this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.troopowneruin.equals(this.app.a())))
        {
          bool1 = bool2;
          if (this.jdField_k_of_type_JavaLangString != null)
          {
            bool1 = bool2;
            if (!this.jdField_k_of_type_JavaLangString.contains(this.app.a())) {}
          }
        }
        else
        {
          bool1 = true;
        }
        this.jdField_a_of_type_Boolean = bool1;
      }
      while (QLog.isColorLevel())
      {
        QLog.d("TroopMemberListActivity", 2, "doOnCreate, mTroopInfo admin: " + this.jdField_k_of_type_JavaLangString + "  owner:" + this.jdField_j_of_type_JavaLangString);
        break;
        if (QLog.isColorLevel()) {
          QLog.d("TroopMemberListActivity", 2, "doOnCreate, mTroopInfo==null");
        }
      }
      label759:
      this.jdField_b_of_type_Boolean = true;
      this.q = "";
      if (this.jdField_a_of_type_ComTencentMobileqqDataDiscussionInfo != null) {
        this.jdField_j_of_type_JavaLangString = this.jdField_a_of_type_ComTencentMobileqqDataDiscussionInfo.ownerUin;
      }
      for (;;)
      {
        if ((this.jdField_j_of_type_JavaLangString != null) && (this.jdField_j_of_type_JavaLangString.equals(this.app.a()))) {
          this.jdField_a_of_type_Boolean = true;
        }
        if (!QLog.isColorLevel()) {
          break;
        }
        QLog.d("TroopMemberListActivity", 2, "doOnCreate, mDiscussionInfo owner: " + this.jdField_j_of_type_JavaLangString);
        break;
        if (QLog.isColorLevel()) {
          QLog.d("TroopMemberListActivity", 2, "doOnCreate, mDiscussionInfo==null");
        }
      }
      paramBundle = "0";
      break label467;
      paramBundle = "1";
      break label467;
      paramBundle = "2";
      break label467;
      paramBundle = "3";
      break label467;
      localObject = str;
      if (this.jdField_k_of_type_JavaLangString != null)
      {
        localObject = str;
        if (this.jdField_k_of_type_JavaLangString.contains(this.app.a())) {
          localObject = "1";
        }
      }
    }
  }
  
  protected void doOnDestroy()
  {
    try
    {
      this.jdField_a_of_type_AndroidOsHandler.removeCallbacksAndMessages(null);
      try
      {
        label8:
        removeObserver(this.jdField_a_of_type_ComTencentMobileqqAppDiscussionObserver);
        removeObserver(this.jdField_a_of_type_ComTencentMobileqqAppTroopObserver);
        label24:
        if (this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$SearchResultAdapter != null) {
          this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$SearchResultAdapter.b();
        }
        super.doOnDestroy();
        if ((this.jdField_a_of_type_AndroidAppDialog != null) && (this.jdField_a_of_type_AndroidAppDialog.isShowing())) {
          this.jdField_a_of_type_AndroidAppDialog.dismiss();
        }
        if (this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$ListAdapter != null) {
          this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$ListAdapter.b();
        }
        return;
      }
      catch (Exception localException1)
      {
        break label24;
      }
    }
    catch (Exception localException2)
    {
      break label8;
    }
  }
  
  protected void doOnResume()
  {
    super.doOnResume();
    try
    {
      getWindow().setSoftInputMode(48);
      label13:
      if (this.jdField_a_of_type_AndroidViewView != null)
      {
        this.jdField_a_of_type_AndroidViewView.destroyDrawingCache();
        this.jdField_a_of_type_AndroidViewView.requestLayout();
        this.jdField_a_of_type_AndroidViewView.invalidate();
      }
      return;
    }
    catch (Exception localException)
    {
      break label13;
    }
  }
  
  protected void doOnStop()
  {
    super.doOnStop();
    getWindow().setSoftInputMode(16);
  }
  
  protected void e()
  {
    if (this.t == 1)
    {
      this.jdField_b_of_type_AndroidWidgetTextView.setText(getString(2131363728));
      this.jdField_b_of_type_AndroidWidgetTextView.setOnClickListener(new bpi(this));
      this.jdField_a_of_type_AndroidWidgetImageView.setVisibility(0);
      this.jdField_a_of_type_AndroidWidgetImageView.setImageResource(2130838062);
      this.jdField_a_of_type_AndroidWidgetImageView.setOnClickListener(new bpj(this));
      this.jdField_d_of_type_AndroidWidgetRelativeLayout.setVisibility(8);
      return;
    }
    if (this.t == 2)
    {
      this.jdField_b_of_type_AndroidWidgetTextView.setText(getString(2131362856));
      this.jdField_b_of_type_AndroidWidgetTextView.setOnClickListener(new bpk(this));
      this.jdField_a_of_type_AndroidWidgetImageView.setVisibility(8);
      this.jdField_d_of_type_AndroidWidgetRelativeLayout.setVisibility(0);
      return;
    }
    if (this.t == 3)
    {
      this.jdField_b_of_type_AndroidWidgetTextView.setText(getString(2131362496));
      this.jdField_b_of_type_AndroidWidgetTextView.setOnClickListener(new bpl(this));
      this.jdField_a_of_type_AndroidWidgetImageView.setVisibility(8);
      this.jdField_d_of_type_AndroidWidgetRelativeLayout.setVisibility(0);
      return;
    }
    if (this.t == 10)
    {
      this.jdField_b_of_type_AndroidWidgetTextView.setText(2131362499);
      this.jdField_b_of_type_AndroidWidgetTextView.setOnClickListener(new bpm(this));
      this.jdField_a_of_type_AndroidWidgetImageView.setVisibility(0);
      this.jdField_d_of_type_AndroidWidgetRelativeLayout.setVisibility(8);
      return;
    }
    this.jdField_b_of_type_AndroidWidgetTextView.setText(getString(2131362850));
    this.jdField_b_of_type_AndroidWidgetTextView.setOnClickListener(new bpn(this));
    if (this.t != 4)
    {
      this.jdField_d_of_type_AndroidWidgetRelativeLayout.setVisibility(0);
      return;
    }
    this.jdField_a_of_type_AndroidWidgetImageView.setVisibility(8);
    this.jdField_d_of_type_AndroidWidgetRelativeLayout.setVisibility(8);
  }
  
  public void e(String paramString)
  {
    boolean bool = true;
    if (QLog.isColorLevel()) {
      QLog.d("TroopMemberListActivity", 2, "kickOutDiscussionMember:" + paramString);
    }
    for (;;)
    {
      try
      {
        if (this.jdField_a_of_type_AndroidAppDialog == null)
        {
          this.jdField_a_of_type_AndroidAppDialog = new Dialog(this, 2131624120);
          this.jdField_a_of_type_AndroidAppDialog.setContentView(2130903049);
          Dialog localDialog = this.jdField_a_of_type_AndroidAppDialog;
          if (this.t != 1)
          {
            localDialog.setCancelable(bool);
            ((TextView)this.jdField_a_of_type_AndroidAppDialog.findViewById(2131296473)).setText(getString(2131363233));
          }
        }
        else
        {
          this.jdField_a_of_type_AndroidAppDialog.show();
          this.jdField_a_of_type_ComTencentMobileqqAppDiscussionHandler.a(Long.parseLong(this.h), Long.valueOf(paramString).longValue());
          return;
        }
      }
      catch (Exception paramString)
      {
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.d("TroopMemberListActivity", 2, "kickOutDiscussionMember:" + paramString.toString());
      }
      bool = false;
    }
  }
  
  public void f()
  {
    if ((this.t == 2) || (this.t == 3) || (this.t == 0)) {
      this.jdField_a_of_type_AndroidWidgetImageView.setOnClickListener(new bpo(this));
    }
    if (this.t == 10)
    {
      this.jdField_a_of_type_AndroidWidgetImageView.setImageResource(2130838062);
      this.jdField_a_of_type_AndroidWidgetImageView.setOnClickListener(new bok(this));
    }
    if (this.t == 0) {}
  }
  
  protected void f(String paramString)
  {
    Intent localIntent = new Intent(this, TroopMemberCardActivity.class);
    localIntent.putExtra("troopUin", this.i);
    localIntent.putExtra("memberUin", paramString);
    localIntent.putExtra("fromFlag", 1);
    localIntent.putExtra("selfSet_leftViewText", getString(2131362850));
    startActivityForResult(localIntent, 1);
    a("Clk_item", this.p, "");
  }
  
  public void finish()
  {
    super.finish();
    if (this.f) {
      overridePendingTransition(0, 2130968584);
    }
  }
  
  protected void g()
  {
    View localView = getLayoutInflater().inflate(2130903691, this.jdField_a_of_type_ComTencentMobileqqWidgetPinnedDividerListView, false);
    this.jdField_a_of_type_ComTencentMobileqqWidgetTabBarView = ((TabBarView)localView.findViewById(2131298919));
    this.jdField_b_of_type_AndroidWidgetRelativeLayout = ((RelativeLayout)localView.findViewById(2131298920));
    this.jdField_b_of_type_AndroidWidgetRelativeLayout.setVisibility(8);
    int i1;
    if ((this.t == 3) && (this.jdField_a_of_type_Boolean) && (this.jdField_k_of_type_Int != 1))
    {
      i1 = 1;
      if ((this.t != 10) || (!this.jdField_a_of_type_Boolean)) {
        break label554;
      }
    }
    Object localObject;
    TextView localTextView;
    label554:
    for (int i2 = 1;; i2 = 0)
    {
      if ((i1 != 0) || (i2 != 0))
      {
        localObject = getString(2131362864);
        ((TextView)this.jdField_b_of_type_AndroidWidgetRelativeLayout.findViewById(2131296876)).setText((CharSequence)localObject);
        localTextView = (TextView)this.jdField_b_of_type_AndroidWidgetRelativeLayout.findViewById(2131298921);
        localTextView.setText("");
        ((ImageView)this.jdField_b_of_type_AndroidWidgetRelativeLayout.findViewById(2131297011)).setBackgroundDrawable(ImageUtil.c());
        this.jdField_b_of_type_AndroidWidgetRelativeLayout.setOnClickListener(new bol(this, (String)localObject));
        this.jdField_b_of_type_AndroidWidgetRelativeLayout.setVisibility(0);
        this.jdField_b_of_type_AndroidWidgetRelativeLayout.setEnabled(false);
        localObject = (TroopHandler)this.app.a(17);
        if (NetworkUtil.e(BaseApplication.getContext())) {
          break label559;
        }
        QQToast.a(this, 2131362923, 0).b(getTitleBarHeight());
        this.jdField_a_of_type_ComTencentMobileqqWidgetPinnedDividerListView.a(localView);
      }
      this.jdField_a_of_type_ComTencentMobileqqWidgetTabBarView.a(0, "tab0");
      this.jdField_a_of_type_ComTencentMobileqqWidgetTabBarView.a(1, "tab1");
      this.jdField_a_of_type_ComTencentMobileqqWidgetTabBarView.setSelectedTab(0, true);
      this.jdField_a_of_type_ComTencentMobileqqWidgetTabBarView.setOnTabChangeListener(new bom(this));
      this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$ListAdapter = new TroopMemberListActivity.ListAdapter(this);
      this.jdField_a_of_type_ComTencentMobileqqWidgetPinnedDividerListView.setAdapter(this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$ListAdapter);
      this.jdField_a_of_type_ComTencentMobileqqWidgetIndexView.setIndex(new String[] { "$", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#" });
      this.jdField_a_of_type_ComTencentMobileqqWidgetIndexView.setOnIndexChangedListener(this);
      if (this.t == 10) {
        this.jdField_a_of_type_ComTencentMobileqqWidgetIndexView.setOnIndexChangedListener2(this);
      }
      return;
      i1 = 0;
      break;
    }
    label559:
    if ((this.jdField_a_of_type_ComTencentMobileqqAppDiscussionHandler != null) && (this.t == 10)) {
      this.jdField_a_of_type_ComTencentMobileqqAppDiscussionHandler.b(this.app.a(), this.i);
    }
    for (;;)
    {
      this.jdField_c_of_type_AndroidGraphicsDrawableDrawable = getResources().getDrawable(2130837928);
      localTextView.setCompoundDrawablesWithIntrinsicBounds(this.jdField_c_of_type_AndroidGraphicsDrawableDrawable, null, null, null);
      ((Animatable)this.jdField_c_of_type_AndroidGraphicsDrawableDrawable).start();
      break;
      if (localObject != null) {
        ((TroopHandler)localObject).a(this.app.a(), this.i);
      }
    }
  }
  
  protected void h()
  {
    p();
    bon localbon = new bon(this);
    Object localObject;
    long l1;
    long l2;
    int i2;
    if ((this.t != 10) && (this.t != 1) && (NetworkUtil.f(this)))
    {
      localObject = getSharedPreferences("last_update_time" + this.app.a(), 0);
      l1 = ((SharedPreferences)localObject).getLong("key_last_update_time" + this.i, 0L);
      l2 = Math.abs(System.currentTimeMillis() - l1);
      int i3 = 0;
      if (this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo != null) {
        i3 = this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.wMemberNum;
      }
      i2 = ((SharedPreferences)localObject).getInt("key_last_update_num" + this.i, 0);
      ((SharedPreferences)localObject).edit().putInt("key_last_update_num" + this.i, i3).commit();
      if (QLog.isColorLevel()) {
        QLog.d("TroopMemberListActivity", 2, "fillData, lastUpdateTime:" + l1 + " timeDiff:" + l2 / 1000L / 60L + " min  curMemberNum:" + i3 + " lastUpdateMemberNum:" + i2);
      }
      i1 = 0;
      if (i2 != i3) {
        i1 = 1;
      }
      i2 = i1;
      if (i3 <= 500) {
        if (l1 != 0L)
        {
          i2 = i1;
          if (l1 > 0L)
          {
            i2 = i1;
            if (l2 <= 300000L) {}
          }
        }
        else
        {
          i2 = 1;
        }
      }
      if ((i3 <= 500) || ((l1 != 0L) && ((l1 <= 0L) || (l2 <= 86400000L)))) {
        break label673;
      }
    }
    label673:
    for (int i1 = 1;; i1 = i2)
    {
      if (i1 != 0)
      {
        localObject = (TroopHandler)this.app.a(17);
        if (localObject != null)
        {
          this.jdField_d_of_type_Boolean = true;
          this.jdField_a_of_type_Long = System.currentTimeMillis();
          ((TroopHandler)localObject).a(true, this.i, this.h);
          if (QLog.isColorLevel()) {
            QLog.d("TroopMemberListActivity", 2, "fillData, TroopHandler.getTroopMemberList(), troopUin: " + this.h + " troopCode: " + this.i);
          }
        }
      }
      if (this.t == 3)
      {
        l1 = getSharedPreferences("last_update_time" + this.app.a(), 0).getLong("key_troop_info_last_update" + this.i, 0L);
        l2 = Math.abs(l1 - System.currentTimeMillis());
        if (QLog.isColorLevel()) {
          QLog.d("TroopMemberListActivity", 2, "fillData, TroopInfo lastUpdateTime:" + l1 + " timeDiff:" + l2 / 1000L / 60L);
        }
        if (l2 > 60000L)
        {
          localObject = (TroopHandler)this.app.a(17);
          if (localObject != null)
          {
            this.jdField_b_of_type_Long = System.currentTimeMillis();
            ((TroopHandler)localObject).a(this.i, (byte)0, 0L, 0);
            if (QLog.isColorLevel()) {
              QLog.d("TroopMemberListActivity", 2, "fillData, getGroupInfoReq, mTroopCode:" + this.i);
            }
          }
        }
      }
      this.app.a(localbon);
      return;
    }
  }
  
  public void i()
  {
    String[] arrayOfString = getResources().getStringArray(2131230732);
    int i1;
    int i2;
    if (this.t == 0) {
      if (this.jdField_a_of_type_Boolean)
      {
        i1 = arrayOfString.length;
        this.jdField_a_of_type_ComTencentWidgetActionSheet = ActionSheet.a(this);
        i2 = 0;
        label38:
        if (i2 >= i1) {
          break label101;
        }
        if (i2 != 7) {
          break label83;
        }
        this.jdField_a_of_type_ComTencentWidgetActionSheet.a(arrayOfString[i2], 3);
      }
    }
    for (;;)
    {
      i2 += 1;
      break label38;
      i1 = arrayOfString.length - 1;
      break;
      i1 = arrayOfString.length - 3;
      break;
      label83:
      if (i2 != 3) {
        this.jdField_a_of_type_ComTencentWidgetActionSheet.c(arrayOfString[i2]);
      }
    }
    label101:
    this.jdField_a_of_type_ComTencentWidgetActionSheet.d(2131362801);
    this.jdField_a_of_type_ComTencentWidgetActionSheet.a(this.jdField_a_of_type_ComTencentWidgetActionSheet$OnButtonClickListener);
    this.jdField_a_of_type_ComTencentWidgetActionSheet.show();
    a(this.jdField_a_of_type_ComTencentWidgetActionSheet, arrayOfString);
  }
  
  public void j()
  {
    if ((this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$ListAdapter != null) && (QLog.isColorLevel())) {
      QLog.d("TroopMemberListActivity", 2, "checkShowCharIndexView, mItemCount:" + this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$ListAdapter.b + " mCharSegmentCount:" + this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$ListAdapter.jdField_a_of_type_Int);
    }
    if (this.y == 0)
    {
      if (this.t == 10)
      {
        if ((this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$ListAdapter != null) && (this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$ListAdapter.b > 6) && (this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$ListAdapter.jdField_a_of_type_Int > 1)) {
          this.jdField_a_of_type_ComTencentMobileqqWidgetIndexView.setVisibility(0);
        }
        return;
      }
      if ((this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$ListAdapter != null) && (this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$ListAdapter.b > 50) && (this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$ListAdapter.jdField_a_of_type_Int > 1))
      {
        this.jdField_a_of_type_ComTencentMobileqqWidgetIndexView.setVisibility(0);
        return;
      }
      this.jdField_a_of_type_ComTencentMobileqqWidgetIndexView.setVisibility(4);
      return;
    }
    this.jdField_a_of_type_ComTencentMobileqqWidgetIndexView.setVisibility(4);
  }
  
  public void k()
  {
    boolean bool = true;
    Dialog localDialog;
    if (this.jdField_a_of_type_AndroidAppDialog == null)
    {
      this.jdField_a_of_type_AndroidAppDialog = new Dialog(this, 2131624120);
      this.jdField_a_of_type_AndroidAppDialog.setContentView(2130903049);
      localDialog = this.jdField_a_of_type_AndroidAppDialog;
      if (this.t == 1) {
        break label76;
      }
    }
    for (;;)
    {
      localDialog.setCancelable(bool);
      ((TextView)this.jdField_a_of_type_AndroidAppDialog.findViewById(2131296473)).setText(getString(2131363392));
      return;
      label76:
      bool = false;
    }
  }
  
  public void l()
  {
    this.jdField_b_of_type_AndroidAppDialog = new Dialog(this);
    this.jdField_b_of_type_AndroidAppDialog.setCanceledOnTouchOutside(true);
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    int i1 = this.jdField_a_of_type_AndroidViewView.getHeight();
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, -i1);
    localTranslateAnimation.setDuration(300L);
    localTranslateAnimation.setFillAfter(true);
    this.jdField_a_of_type_AndroidWidgetLinearLayout.startAnimation(localTranslateAnimation);
    this.jdField_b_of_type_AndroidAppDialog.requestWindowFeature(1);
    this.jdField_b_of_type_AndroidAppDialog.getWindow().setSoftInputMode(36);
    this.jdField_b_of_type_AndroidAppDialog.setContentView(2130903613);
    Object localObject = this.jdField_b_of_type_AndroidAppDialog.getWindow().getAttributes();
    ((WindowManager.LayoutParams)localObject).x = 0;
    ((WindowManager.LayoutParams)localObject).y = 0;
    ((WindowManager.LayoutParams)localObject).width = -1;
    ((WindowManager.LayoutParams)localObject).windowAnimations = 16973824;
    ((WindowManager.LayoutParams)localObject).gravity = 51;
    this.jdField_b_of_type_AndroidAppDialog.getWindow().setBackgroundDrawable(new ColorDrawable());
    localObject = new TranslateAnimation(0.0F, 0.0F, -i1, 0.0F);
    ((TranslateAnimation)localObject).setDuration(300L);
    boq localboq = new boq(this, localTranslateAnimation);
    localTranslateAnimation.setAnimationListener(localboq);
    ((TranslateAnimation)localObject).setAnimationListener(localboq);
    this.jdField_b_of_type_AndroidAppDialog.setOnDismissListener(new bor(this, (TranslateAnimation)localObject, localInputMethodManager));
    this.jdField_c_of_type_AndroidViewView = this.jdField_b_of_type_AndroidAppDialog.findViewById(2131296567);
    this.jdField_a_of_type_AndroidWidgetEditText = ((EditText)this.jdField_b_of_type_AndroidAppDialog.findViewById(2131297962));
    this.jdField_a_of_type_AndroidWidgetEditText.addTextChangedListener(new TroopMemberListActivity.SearchTextWatcher(this));
    this.jdField_a_of_type_AndroidWidgetEditText.setSelection(0);
    this.jdField_a_of_type_AndroidWidgetEditText.requestFocus();
    this.jdField_a_of_type_AndroidWidgetImageButton = ((ImageButton)this.jdField_b_of_type_AndroidAppDialog.findViewById(2131297955));
    this.jdField_a_of_type_AndroidWidgetImageButton.setOnClickListener(new bot(this));
    ((Button)this.jdField_b_of_type_AndroidAppDialog.findViewById(2131298430)).setOnClickListener(new bou(this));
    this.jdField_b_of_type_AndroidViewView = this.jdField_b_of_type_AndroidAppDialog.findViewById(2131296868);
    this.jdField_c_of_type_AndroidWidgetRelativeLayout = ((RelativeLayout)this.jdField_b_of_type_AndroidAppDialog.findViewById(2131296866));
    this.jdField_c_of_type_AndroidWidgetRelativeLayout.setOnClickListener(new bov(this));
    this.jdField_a_of_type_ComTencentWidgetXListView = ((XListView)this.jdField_b_of_type_AndroidAppDialog.findViewById(2131298730));
    this.jdField_a_of_type_ComTencentWidgetXListView.setBackgroundDrawable(getResources().getDrawable(2130837660));
    this.jdField_a_of_type_ComTencentWidgetXListView.setDividerHeight(0);
    this.jdField_b_of_type_JavaUtilList.clear();
    this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$SearchResultAdapter = new TroopMemberListActivity.SearchResultAdapter(this, this.jdField_b_of_type_JavaUtilList);
    this.jdField_a_of_type_ComTencentWidgetXListView.setAdapter(this.jdField_a_of_type_ComTencentMobileqqActivityTroopMemberListActivity$SearchResultAdapter);
    this.jdField_a_of_type_ComTencentWidgetXListView.setOnTouchListener(new box(this, localInputMethodManager));
    this.e = true;
  }
  
  public void m()
  {
    this.jdField_d_of_type_AndroidViewView.setVisibility(8);
  }
  
  public void n()
  {
    Intent localIntent = new Intent(this, PublicAccountBrowser.class);
    String str = "http://web.qun.qq.com/statistics/index.html?_bid=149&_wv=3&gc=" + this.i;
    localIntent.putExtra("url", str);
    startActivity(localIntent);
    if (QLog.isColorLevel()) {
      QLog.d("TroopMemberListActivity", 2, "showMemberDstribute:" + str);
    }
    a("Clk_mberdist", this.p, "");
  }
  
  public void o()
  {
    ThreadManager.a(new bph(this));
    a("Clk_invite", this.p, "");
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    getWindow().getDecorView().invalidate();
  }
  
  protected void requestWindowFeature(Intent paramIntent)
  {
    requestWindowFeature(1);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     com.tencent.mobileqq.activity.TroopMemberListActivity
 * JD-Core Version:    0.7.0.1
 */
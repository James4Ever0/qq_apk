package com.tencent.biz.eqq;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import cel;
import cem;
import cen;
import ceo;
import cep;
import ceq;
import cer;
import ces;
import cet;
import ceu;
import cev;
import cew;
import cex;
import cey;
import cez;
import cfa;
import cfb;
import cfc;
import cfd;
import cff;
import cfg;
import cfh;
import cfj;
import cfk;
import com.tencent.biz.ProtoServlet;
import com.tencent.biz.pubaccount.PublicAccountBrowser;
import com.tencent.biz.pubaccount.PublicAccountServlet;
import com.tencent.biz.pubaccount.assistant.PubAccountAssistantManager;
import com.tencent.biz.pubaccount.util.PublicAccountUtil;
import com.tencent.image.URLDrawable;
import com.tencent.mobileqq.activity.ChatActivity;
import com.tencent.mobileqq.app.EqqDetailDataManager;
import com.tencent.mobileqq.app.FriendListHandler;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import com.tencent.mobileqq.app.PublicAccountDataManager;
import com.tencent.mobileqq.app.PublicAccountHandler;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.data.EqqDetail;
import com.tencent.mobileqq.data.PublicAccountInfo;
import com.tencent.mobileqq.mp.mobileqq_mp.ConfigGroupInfo;
import com.tencent.mobileqq.mp.mobileqq_mp.ConfigInfo;
import com.tencent.mobileqq.mp.mobileqq_mp.FollowRequest;
import com.tencent.mobileqq.mp.mobileqq_mp.GetEqqAccountDetailInfoResponse;
import com.tencent.mobileqq.mp.mobileqq_mp.GetEqqDetailInfoRequest;
import com.tencent.mobileqq.mp.mobileqq_mp.SetFunctionFlagRequset;
import com.tencent.mobileqq.mp.mobileqq_mp.UnFollowRequest;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.persistence.EntityManager;
import com.tencent.mobileqq.persistence.EntityManagerFactory;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.troop.activity.TroopAvatarWallPreviewActivity;
import com.tencent.mobileqq.utils.ContactUtils;
import com.tencent.mobileqq.utils.DialogUtil;
import com.tencent.mobileqq.utils.QQCustomDialog;
import com.tencent.mobileqq.utils.ShareMsgHelper;
import com.tencent.mobileqq.widget.QQProgressDialog;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.ActionSheet;
import com.tencent.widget.ActionSheetHelper;
import com.tencent.widget.Switch;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mqq.app.NewIntent;
import mqq.observer.BusinessObserver;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class EnterpriseDetailActivity
  extends IphoneTitleBarActivity
  implements View.OnClickListener
{
  static final int jdField_b_of_type_Int = 1;
  private static final int jdField_c_of_type_Int = 0;
  private static final int jdField_d_of_type_Int = 1;
  public static final String d = "need_finish";
  private static final int e = 2;
  private static final int f = 3;
  float jdField_a_of_type_Float;
  public int a;
  View jdField_a_of_type_AndroidViewView;
  public Button a;
  public ImageView a;
  LinearLayout jdField_a_of_type_AndroidWidgetLinearLayout;
  TextView jdField_a_of_type_AndroidWidgetTextView;
  FriendListObserver jdField_a_of_type_ComTencentMobileqqAppFriendListObserver;
  public PublicAccountHandler a;
  public QQAppInterface a;
  public EqqDetail a;
  public mobileqq_mp.GetEqqAccountDetailInfoResponse a;
  QQProgressDialog jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog;
  public ActionSheet a;
  public String a;
  NewIntent jdField_a_of_type_MqqAppNewIntent;
  BusinessObserver jdField_a_of_type_MqqObserverBusinessObserver;
  public boolean a;
  View jdField_b_of_type_AndroidViewView;
  ImageView jdField_b_of_type_AndroidWidgetImageView;
  LinearLayout jdField_b_of_type_AndroidWidgetLinearLayout;
  TextView jdField_b_of_type_AndroidWidgetTextView;
  public String b;
  NewIntent jdField_b_of_type_MqqAppNewIntent;
  BusinessObserver jdField_b_of_type_MqqObserverBusinessObserver;
  boolean jdField_b_of_type_Boolean = true;
  View jdField_c_of_type_AndroidViewView;
  LinearLayout jdField_c_of_type_AndroidWidgetLinearLayout;
  TextView jdField_c_of_type_AndroidWidgetTextView;
  String jdField_c_of_type_JavaLangString;
  NewIntent jdField_c_of_type_MqqAppNewIntent;
  BusinessObserver jdField_c_of_type_MqqObserverBusinessObserver;
  public boolean c;
  TextView jdField_d_of_type_AndroidWidgetTextView;
  BusinessObserver jdField_d_of_type_MqqObserverBusinessObserver;
  protected boolean d;
  protected String e;
  public boolean e;
  protected String f;
  public boolean f;
  public boolean g = false;
  boolean h = false;
  private boolean i = false;
  
  public EnterpriseDetailActivity()
  {
    this.jdField_a_of_type_JavaLangString = "Q.enterprise.EnterpriseDetailActivity";
    this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail = null;
    this.jdField_c_of_type_Boolean = false;
    this.jdField_d_of_type_Boolean = false;
    this.jdField_a_of_type_ComTencentWidgetActionSheet = null;
    this.jdField_a_of_type_Int = 0;
    this.jdField_e_of_type_Boolean = true;
    this.jdField_f_of_type_Boolean = false;
  }
  
  private ViewGroup a()
  {
    if (QLog.isColorLevel()) {
      QLog.d(this.jdField_a_of_type_JavaLangString, 2, "createGroupLayout");
    }
    LinearLayout localLinearLayout = new LinearLayout(this);
    localLinearLayout.setOrientation(1);
    localLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    if (QLog.isColorLevel()) {
      QLog.d(this.jdField_a_of_type_JavaLangString, 2, "createGroupLayout exit");
    }
    return localLinearLayout;
  }
  
  private void a()
  {
    if (QLog.isColorLevel()) {
      QLog.d(this.jdField_a_of_type_JavaLangString, 2, "initView");
    }
    super.setContentView(2130903504);
    this.jdField_a_of_type_Float = super.getResources().getDisplayMetrics().density;
    this.jdField_a_of_type_AndroidWidgetLinearLayout = ((LinearLayout)super.findViewById(2131296532));
    this.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)super.findViewById(2131296551));
    this.jdField_b_of_type_AndroidWidgetImageView = ((ImageView)super.findViewById(2131296555));
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)super.findViewById(2131296554));
    this.jdField_b_of_type_AndroidWidgetTextView = ((TextView)super.findViewById(2131296730));
    this.jdField_c_of_type_AndroidWidgetTextView = ((TextView)super.findViewById(2131296545));
    this.jdField_a_of_type_AndroidViewView = super.findViewById(2131296544);
    this.jdField_c_of_type_AndroidWidgetTextView.setCompoundDrawablesWithIntrinsicBounds(2130840484, 0, 0, 0);
    this.jdField_b_of_type_AndroidViewView = super.findViewById(2131298558);
    this.jdField_c_of_type_AndroidViewView = super.findViewById(2131298556);
    this.jdField_d_of_type_AndroidWidgetTextView = ((TextView)super.findViewById(2131298557));
    int j = getResources().getColor(2131427889);
    this.jdField_b_of_type_AndroidViewView.setBackgroundColor(j);
    this.jdField_b_of_type_AndroidViewView.setLayoutParams(new LinearLayout.LayoutParams(1, -1));
    this.jdField_d_of_type_AndroidWidgetTextView.setCompoundDrawablesWithIntrinsicBounds(2130840477, 0, 0, 0);
    this.jdField_b_of_type_AndroidViewView.setVisibility(8);
    this.jdField_c_of_type_AndroidViewView.setVisibility(8);
    this.jdField_b_of_type_AndroidWidgetLinearLayout = ((LinearLayout)super.findViewById(2131296563));
    super.setTitle(2131363604);
    this.jdField_c_of_type_AndroidWidgetLinearLayout = ((LinearLayout)super.findViewById(2131296549));
    this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog = new QQProgressDialog(this, super.getTitleBarHeight());
    this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.setCanceledOnTouchOutside(true);
    this.jdField_a_of_type_AndroidWidgetButton = ((Button)super.findViewById(2131296557));
    this.jdField_a_of_type_AndroidViewView.setOnClickListener(this);
    this.jdField_a_of_type_AndroidWidgetButton.setOnClickListener(this);
    this.rightViewText.setText("");
    this.rightViewImg.setVisibility(0);
    this.rightViewImg.setImageResource(2130838104);
    this.rightViewImg.setOnClickListener(this);
    this.rightViewImg.setContentDescription(getResources().getString(2131363855));
    if (QLog.isColorLevel()) {
      QLog.d(this.jdField_a_of_type_JavaLangString, 2, "initView exit");
    }
  }
  
  private void a(ViewGroup paramViewGroup, mobileqq_mp.ConfigInfo paramConfigInfo, int paramInt)
  {
    if (QLog.isColorLevel()) {
      QLog.d(this.jdField_a_of_type_JavaLangString, 2, "addDetailItem");
    }
    int j = (int)(10.0F * this.jdField_a_of_type_Float);
    int k = (int)(15.0F * this.jdField_a_of_type_Float);
    Object localObject2 = super.getLayoutInflater();
    Object localObject4 = null;
    Object localObject1;
    Object localObject3;
    if (paramConfigInfo.type.get() == 3)
    {
      localObject1 = paramConfigInfo.content.get();
      if (TextUtils.isEmpty((CharSequence)localObject1))
      {
        localObject2 = ((LayoutInflater)localObject2).inflate(2130903352, null);
        if (paramConfigInfo.event_id.get() != 7) {
          break label352;
        }
        ((View)localObject2).setOnClickListener(new ceo(this));
        localObject3 = localObject4;
        localObject1 = localObject2;
      }
    }
    for (;;)
    {
      label117:
      ((TextView)((View)localObject1).findViewById(2131297001)).setText(paramConfigInfo.title.get());
      localObject2 = new LinearLayout.LayoutParams(-1, -2);
      switch (paramInt)
      {
      default: 
        ((LinearLayout.LayoutParams)localObject2).setMargins(0, j, 0, j);
        ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
        if (paramConfigInfo.type.get() == 5)
        {
          ((View)localObject1).setBackgroundResource(2130841913);
          label217:
          if (paramConfigInfo.state_id.get() != 5) {
            break label1233;
          }
          paramViewGroup.addView((View)localObject3);
          localObject2 = getString(2131363642);
          if (paramConfigInfo.state.get() != 1) {
            break label1222;
          }
          paramViewGroup = getString(2131367642);
          label262:
          ((View)localObject1).setContentDescription(String.format((String)localObject2, new Object[] { paramViewGroup }));
          label280:
          if (paramConfigInfo.type.get() != 4) {
            break label1242;
          }
          ((View)localObject1).setPadding(k, k, k, k);
        }
        break;
      }
      for (;;)
      {
        if (QLog.isColorLevel()) {
          QLog.d(this.jdField_a_of_type_JavaLangString, 2, "addDetailItem exit");
        }
        return;
        localObject2 = ((LayoutInflater)localObject2).inflate(2130903590, null);
        ((TextView)((View)localObject2).findViewById(2131296744)).setText((CharSequence)localObject1);
        break;
        label352:
        if (paramConfigInfo.event_id.get() == 8)
        {
          localObject1 = paramConfigInfo.content.get();
          if (Pattern.compile("[\\d-]+?").matcher((CharSequence)localObject1).matches()) {
            ((View)localObject2).setOnClickListener(new cep(this, paramConfigInfo));
          }
          ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "CliOper", "", "", "Biz_card", "Biz_card_call", 0, 0, this.jdField_b_of_type_JavaLangString, "", "", "");
          localObject1 = localObject2;
          localObject3 = localObject4;
          break label117;
        }
        localObject1 = localObject2;
        localObject3 = localObject4;
        if (paramConfigInfo.event_id.get() != 9) {
          break label117;
        }
        ((View)localObject2).setOnClickListener(new ceq(this));
        localObject1 = localObject2;
        localObject3 = localObject4;
        break label117;
        if (paramConfigInfo.type.get() == 1)
        {
          if (paramConfigInfo.content.has())
          {
            localObject1 = ((LayoutInflater)localObject2).inflate(2130903590, null);
            ((TextView)((View)localObject1).findViewById(2131296744)).setText(paramConfigInfo.content.get());
          }
          for (;;)
          {
            if (!paramConfigInfo.url.has()) {
              break label1258;
            }
            ((View)localObject1).setOnClickListener(new cer(this, paramConfigInfo.url.get()));
            localObject3 = localObject4;
            break;
            localObject1 = ((LayoutInflater)localObject2).inflate(2130903352, null);
          }
        }
        if (paramConfigInfo.type.get() == 2)
        {
          if (paramConfigInfo.state_id.get() == 5)
          {
            localObject1 = ((LayoutInflater)localObject2).inflate(2130904468, null);
            localObject2 = ((View)localObject1).findViewById(2131302286);
            ((TextView)((View)localObject1).findViewById(2131302287)).setVisibility(0);
            label653:
            localObject3 = (Switch)((View)localObject2).findViewById(2131297410);
            ((Switch)localObject3).setContentDescription(paramConfigInfo.title.get());
            if (paramConfigInfo.state.get() != 1) {
              break label741;
            }
            ((Switch)localObject3).setChecked(true);
          }
          for (;;)
          {
            ((Switch)localObject3).setOnCheckedChangeListener(new ces(this, paramConfigInfo, (Switch)localObject3, (View)localObject2));
            localObject3 = localObject1;
            localObject1 = localObject2;
            break;
            localObject2 = ((LayoutInflater)localObject2).inflate(2130904468, null);
            localObject1 = null;
            break label653;
            label741:
            ((Switch)localObject3).setChecked(false);
          }
        }
        if (paramConfigInfo.type.get() == 4)
        {
          localObject1 = ((LayoutInflater)localObject2).inflate(2130903261, null);
          ((TextView)((View)localObject1).findViewById(2131296744)).setText(paramConfigInfo.content.get());
          localObject3 = localObject4;
          break label117;
        }
        if (paramConfigInfo.type.get() == 5)
        {
          localObject1 = ((LayoutInflater)localObject2).inflate(2130903414, null);
          localObject2 = paramConfigInfo.url.get();
          if (!TextUtils.isEmpty((CharSequence)localObject2))
          {
            ((View)localObject1).findViewById(2131298142).setVisibility(0);
            ((View)localObject1).setOnClickListener(new cet(this, (String)localObject2));
          }
          for (boolean bool = true;; bool = false)
          {
            try
            {
              localObject2 = new JSONObject(paramConfigInfo.content.get());
              localObject3 = ((JSONObject)localObject2).getString("content");
              ((TextView)((View)localObject1).findViewById(2131296744)).setText((CharSequence)localObject3);
              localObject3 = ((JSONObject)localObject2).getJSONArray("pic_list");
              localObject2 = ((JSONObject)localObject2).getJSONArray("thumb_list");
              a(bool, (LinearLayout)((View)localObject1).findViewById(2131298141), (JSONArray)localObject3, (JSONArray)localObject2);
              localObject3 = localObject4;
            }
            catch (JSONException localJSONException)
            {
              if (QLog.isColorLevel()) {
                QLog.d(this.jdField_a_of_type_JavaLangString, 2, "RICH_PIC_TEXT:pic json error!");
              }
              localJSONException.printStackTrace();
              localObject3 = localObject4;
            }
            break;
            ((View)localObject1).findViewById(2131298142).setVisibility(8);
          }
        }
        localObject1 = localJSONException.inflate(2130903261, null);
        localObject3 = localObject4;
        break label117;
        localJSONException.setMargins(0, j, 0, j);
        ((View)localObject1).setLayoutParams(localJSONException);
        if (paramConfigInfo.type.get() == 5)
        {
          ((View)localObject1).setBackgroundResource(2130841913);
          break label217;
        }
        ((View)localObject1).setBackgroundResource(2130838151);
        break label217;
        localJSONException.setMargins(0, j, 0, 0);
        ((View)localObject1).setLayoutParams(localJSONException);
        if (paramConfigInfo.type.get() == 5)
        {
          ((View)localObject1).setBackgroundResource(2130841925);
          break label217;
        }
        ((View)localObject1).setBackgroundResource(2130838156);
        break label217;
        localJSONException.setMargins(0, 0, 0, j);
        ((View)localObject1).setLayoutParams(localJSONException);
        if (paramConfigInfo.type.get() == 5)
        {
          ((View)localObject1).setBackgroundResource(2130841915);
          break label217;
        }
        ((View)localObject1).setBackgroundResource(2130838153);
        break label217;
        if (paramConfigInfo.type.get() == 5)
        {
          ((View)localObject1).setBackgroundResource(2130841921);
          break label217;
        }
        ((View)localObject1).setBackgroundResource(2130838155);
        break label217;
        ((View)localObject1).setBackgroundResource(2130838151);
        break label217;
        label1222:
        paramViewGroup = getString(2131367671);
        break label262;
        label1233:
        paramViewGroup.addView((View)localObject1);
        break label280;
        label1242:
        ((View)localObject1).setPadding(k, j, k, j);
      }
      label1258:
      localObject3 = localObject4;
    }
  }
  
  private void a(EqqDetail paramEqqDetail)
  {
    ThreadManager.a().post(new cfh(this, paramEqqDetail));
  }
  
  private void a(mobileqq_mp.ConfigGroupInfo paramConfigGroupInfo, int paramInt1, int paramInt2)
  {
    if (QLog.isColorLevel()) {
      QLog.d(this.jdField_a_of_type_JavaLangString, 2, "addGroup");
    }
    ViewGroup localViewGroup = a();
    paramConfigGroupInfo = paramConfigGroupInfo.config_info.get();
    int m = paramConfigGroupInfo.size();
    int k = 0;
    if (k < m)
    {
      int j;
      if (m > 1) {
        if (k == 0) {
          j = 1;
        }
      }
      for (;;)
      {
        a(localViewGroup, (mobileqq_mp.ConfigInfo)paramConfigGroupInfo.get(k), j);
        if (k != m - 1) {}
        k += 1;
        break;
        if (k == m - 1)
        {
          j = 2;
        }
        else
        {
          j = 3;
          continue;
          if (m > 2)
          {
            if (paramInt1 == 1) {
              j = 1;
            } else if (paramInt1 == paramInt2 - 1) {
              j = 2;
            } else {
              j = 3;
            }
          }
          else {
            j = 0;
          }
        }
      }
    }
    this.jdField_a_of_type_AndroidWidgetLinearLayout.addView(localViewGroup);
    if (QLog.isColorLevel()) {
      QLog.d(this.jdField_a_of_type_JavaLangString, 2, "addGroup exit");
    }
  }
  
  private void a(mobileqq_mp.ConfigInfo paramConfigInfo, Switch paramSwitch)
  {
    boolean bool = true;
    if (paramConfigInfo.state.get() == 1) {}
    for (;;)
    {
      this.jdField_e_of_type_Boolean = false;
      paramSwitch.setChecked(bool);
      return;
      bool = false;
    }
  }
  
  private void a(mobileqq_mp.ConfigInfo paramConfigInfo, Switch paramSwitch, boolean paramBoolean)
  {
    int j = 1;
    b(2131363614);
    NewIntent localNewIntent = new NewIntent(super.getApplicationContext(), PublicAccountServlet.class);
    localNewIntent.putExtra("cmd", "set_function_flag");
    mobileqq_mp.SetFunctionFlagRequset localSetFunctionFlagRequset = new mobileqq_mp.SetFunctionFlagRequset();
    localSetFunctionFlagRequset.version.set(1);
    try
    {
      long l = Long.parseLong(this.jdField_b_of_type_JavaLangString);
      localSetFunctionFlagRequset.uin.set((int)l);
      int k = paramConfigInfo.state_id.get();
      if (paramBoolean) {}
      for (;;)
      {
        localSetFunctionFlagRequset.type.set(k);
        localSetFunctionFlagRequset.value.set(j);
        localSetFunctionFlagRequset.account_type.set(2);
        localNewIntent.putExtra("data", localSetFunctionFlagRequset.toByteArray());
        this.jdField_d_of_type_MqqObserverBusinessObserver = new cfj(this, paramConfigInfo, paramSwitch, j, paramBoolean);
        localNewIntent.setObserver(this.jdField_d_of_type_MqqObserverBusinessObserver);
        this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.startServlet(localNewIntent);
        this.jdField_a_of_type_Int += 1;
        return;
        j = 2;
      }
      return;
    }
    catch (Exception paramConfigInfo) {}
  }
  
  private void a(String paramString)
  {
    Intent localIntent = new Intent(this, PublicAccountBrowser.class);
    paramString = paramString.replace("${puin}", this.jdField_b_of_type_JavaLangString).replace("${uin}", this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getAccount()).replace("${sid}", this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getSid());
    localIntent.putExtra("uin", this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a());
    localIntent.putExtra("url", paramString);
    localIntent.putExtra("puin", this.jdField_b_of_type_JavaLangString);
    if (this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail != null) {
      localIntent.putExtra("source_name", this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.name);
    }
    super.startActivity(localIntent);
  }
  
  private boolean a()
  {
    EntityManager localEntityManager = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().createEntityManager();
    this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail = ((EqqDetail)localEntityManager.a(EqqDetail.class, this.jdField_b_of_type_JavaLangString));
    localEntityManager.a();
    if (this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail == null) {
      return false;
    }
    try
    {
      this.jdField_a_of_type_ComTencentMobileqqMpMobileqq_mp$GetEqqAccountDetailInfoResponse = new mobileqq_mp.GetEqqAccountDetailInfoResponse();
      this.jdField_a_of_type_ComTencentMobileqqMpMobileqq_mp$GetEqqAccountDetailInfoResponse.mergeFrom(this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.accountData);
      this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.groupInfoList = this.jdField_a_of_type_ComTencentMobileqqMpMobileqq_mp$GetEqqAccountDetailInfoResponse.config_group_info.get();
      label85:
      return true;
    }
    catch (Exception localException)
    {
      break label85;
    }
  }
  
  private void b()
  {
    if (QLog.isColorLevel()) {
      QLog.d(this.jdField_a_of_type_JavaLangString, 2, "init");
    }
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = ((QQAppInterface)super.getAppRuntime());
    Intent localIntent = super.getIntent();
    if (localIntent != null) {
      this.jdField_b_of_type_JavaLangString = localIntent.getStringExtra("uin");
    }
    if ((this.jdField_b_of_type_JavaLangString == null) || (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface == null)) {
      return;
    }
    this.jdField_e_of_type_JavaLangString = localIntent.getStringExtra("extvalue");
    this.jdField_f_of_type_JavaLangString = localIntent.getStringExtra("exttype");
    if (!TextUtils.isEmpty(this.jdField_e_of_type_JavaLangString))
    {
      if (!"2".equals(this.jdField_f_of_type_JavaLangString)) {
        break label151;
      }
      this.jdField_c_of_type_Boolean = true;
    }
    for (;;)
    {
      this.jdField_a_of_type_ComTencentMobileqqAppPublicAccountHandler = ((PublicAccountHandler)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(10));
      a();
      if (!QLog.isColorLevel()) {
        break;
      }
      QLog.d(this.jdField_a_of_type_JavaLangString, 2, "init exit");
      return;
      label151:
      if ("1".equals(this.jdField_f_of_type_JavaLangString)) {
        this.jdField_d_of_type_Boolean = true;
      }
    }
  }
  
  private void b(int paramInt)
  {
    this.jdField_a_of_type_AndroidWidgetButton.postDelayed(new cel(this, paramInt), 500L);
  }
  
  private void b(EqqDetail paramEqqDetail)
  {
    if (QLog.isColorLevel()) {
      QLog.d(this.jdField_a_of_type_JavaLangString, 2, "saveCache");
    }
    Object localObject = (EqqDetailDataManager)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(65);
    if (localObject != null) {
      ((EqqDetailDataManager)localObject).a(paramEqqDetail);
    }
    this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail = paramEqqDetail;
    if ((paramEqqDetail != null) && (paramEqqDetail.followType == 1))
    {
      localObject = (PublicAccountDataManager)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(54);
      if (localObject != null)
      {
        ((PublicAccountDataManager)localObject).a(PublicAccountInfo.createPublicAccount(paramEqqDetail, 0L));
        PubAccountAssistantManager.a().a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, ((PublicAccountDataManager)localObject).a());
      }
    }
    if (QLog.isColorLevel()) {
      QLog.d(this.jdField_a_of_type_JavaLangString, 2, "saveCache exit");
    }
  }
  
  private void b(mobileqq_mp.ConfigInfo paramConfigInfo, Switch paramSwitch, boolean paramBoolean)
  {
    this.g = true;
    QQCustomDialog localQQCustomDialog = DialogUtil.a(this, 0);
    localQQCustomDialog.setCanceledOnTouchOutside(false);
    String str = paramConfigInfo.confirm_tips.get();
    if (3 == paramConfigInfo.state_id.get())
    {
      str = String.format(getString(2131362348), new Object[] { this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.name });
      localQQCustomDialog.setOnCancelListener(new cfk(this, paramConfigInfo, paramSwitch));
    }
    localQQCustomDialog.setTitle("温馨提示");
    localQQCustomDialog.setMessage(str);
    paramConfigInfo = new cem(this, paramConfigInfo, paramSwitch, paramBoolean);
    localQQCustomDialog.setNegativeButton("取消", paramConfigInfo);
    localQQCustomDialog.setPositiveButton("确定", paramConfigInfo);
    try
    {
      localQQCustomDialog.show();
      label133:
      if (0 != 0) {}
      return;
    }
    catch (Exception paramConfigInfo)
    {
      break label133;
    }
  }
  
  private void b(String paramString)
  {
    this.g = true;
    QQCustomDialog localQQCustomDialog = DialogUtil.a(this, 0);
    localQQCustomDialog.setCanceledOnTouchOutside(false);
    localQQCustomDialog.setMessage(paramString);
    paramString = new cen(this, paramString);
    localQQCustomDialog.setNegativeButton("取消", paramString);
    localQQCustomDialog.setPositiveButton("呼叫", paramString);
    try
    {
      localQQCustomDialog.show();
      label54:
      if (0 != 0) {}
      return;
    }
    catch (Exception paramString)
    {
      break label54;
    }
  }
  
  private void c()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("isNeedFinish", true);
    setResult(-1, localIntent);
    finish();
  }
  
  private void c(int paramInt)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog != null)
    {
      this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.b(paramInt);
      this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.show();
    }
  }
  
  private void c(EqqDetail paramEqqDetail)
  {
    EntityManager localEntityManager = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().createEntityManager();
    localEntityManager.b(paramEqqDetail);
    localEntityManager.a();
  }
  
  private void d()
  {
    if (QLog.isColorLevel()) {
      QLog.d(this.jdField_a_of_type_JavaLangString, 2, "unfollow");
    }
    b(2131363615);
    if (this.jdField_c_of_type_MqqAppNewIntent != null) {
      this.jdField_c_of_type_MqqAppNewIntent.setObserver(null);
    }
    this.jdField_c_of_type_MqqAppNewIntent = new NewIntent(super.getApplicationContext(), PublicAccountServlet.class);
    this.jdField_c_of_type_MqqAppNewIntent.putExtra("cmd", "unfollow");
    mobileqq_mp.UnFollowRequest localUnFollowRequest = new mobileqq_mp.UnFollowRequest();
    localUnFollowRequest.uin.set((int)Long.parseLong(this.jdField_b_of_type_JavaLangString));
    localUnFollowRequest.account_type.set(2);
    this.jdField_c_of_type_MqqAppNewIntent.putExtra("data", localUnFollowRequest.toByteArray());
    this.jdField_c_of_type_MqqObserverBusinessObserver = new cew(this);
    this.jdField_c_of_type_MqqAppNewIntent.setObserver(this.jdField_c_of_type_MqqObserverBusinessObserver);
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.startServlet(this.jdField_c_of_type_MqqAppNewIntent);
    this.jdField_a_of_type_Int += 1;
    PublicAccountUtil.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.jdField_b_of_type_JavaLangString);
    if (QLog.isColorLevel()) {
      QLog.d(this.jdField_a_of_type_JavaLangString, 2, "unfollow exit");
    }
  }
  
  private void d(EqqDetail paramEqqDetail)
  {
    if (QLog.isColorLevel()) {
      QLog.d(this.jdField_a_of_type_JavaLangString, 2, "update");
    }
    a(paramEqqDetail);
    this.jdField_a_of_type_ComTencentMobileqqAppPublicAccountHandler.b();
    if (this.jdField_a_of_type_Boolean)
    {
      k();
      l();
    }
    for (;;)
    {
      if (QLog.isColorLevel()) {
        QLog.d(this.jdField_a_of_type_JavaLangString, 2, "update exit");
      }
      return;
      k();
    }
  }
  
  private void e()
  {
    if (QLog.isColorLevel()) {
      QLog.d(this.jdField_a_of_type_JavaLangString, 2, "follow");
    }
    this.jdField_f_of_type_Boolean = true;
    this.jdField_a_of_type_AndroidWidgetButton.postDelayed(new cfc(this), 3000L);
    b(2131363616);
    ((FriendListHandler)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(1)).b(this.jdField_b_of_type_JavaLangString);
    this.jdField_b_of_type_MqqAppNewIntent = new NewIntent(super.getApplicationContext(), PublicAccountServlet.class);
    this.jdField_b_of_type_MqqAppNewIntent.putExtra("cmd", "follow");
    mobileqq_mp.FollowRequest localFollowRequest = new mobileqq_mp.FollowRequest();
    if ((!TextUtils.isEmpty(this.jdField_e_of_type_JavaLangString)) && (this.jdField_d_of_type_Boolean)) {
      localFollowRequest.ext.set(this.jdField_e_of_type_JavaLangString);
    }
    localFollowRequest.uin.set((int)Long.parseLong(this.jdField_b_of_type_JavaLangString));
    localFollowRequest.account_type.set(2);
    this.jdField_b_of_type_MqqAppNewIntent.putExtra("data", localFollowRequest.toByteArray());
    this.jdField_b_of_type_MqqObserverBusinessObserver = new cfd(this);
    this.jdField_b_of_type_MqqAppNewIntent.setObserver(this.jdField_b_of_type_MqqObserverBusinessObserver);
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.startServlet(this.jdField_b_of_type_MqqAppNewIntent);
    this.jdField_a_of_type_Int += 1;
    if (QLog.isColorLevel()) {
      QLog.d(this.jdField_a_of_type_JavaLangString, 2, "follow exit");
    }
  }
  
  private void f()
  {
    Resources localResources;
    if (this.jdField_a_of_type_ComTencentWidgetActionSheet == null)
    {
      this.jdField_a_of_type_ComTencentWidgetActionSheet = ((ActionSheet)ActionSheetHelper.a(this, null));
      localResources = super.getResources();
      if (this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail != null) {
        break label139;
      }
    }
    label139:
    for (String str = "";; str = this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.name)
    {
      str = String.format(localResources.getString(2131363609, new Object[] { str }), new Object[0]);
      this.jdField_a_of_type_ComTencentWidgetActionSheet.a(str);
      this.jdField_a_of_type_ComTencentWidgetActionSheet.a(2131363605, 3);
      this.jdField_a_of_type_ComTencentWidgetActionSheet.e(2131365736);
      this.jdField_a_of_type_ComTencentWidgetActionSheet.setOnDismissListener(new cff(this));
      this.jdField_a_of_type_ComTencentWidgetActionSheet.a(new cfg(this));
      if (!this.jdField_a_of_type_ComTencentWidgetActionSheet.isShowing())
      {
        this.i = false;
        this.jdField_a_of_type_ComTencentWidgetActionSheet.show();
      }
      return;
    }
  }
  
  private void g()
  {
    if (QLog.isColorLevel()) {
      QLog.d(this.jdField_a_of_type_JavaLangString, 2, "initData");
    }
    boolean bool;
    if (!a())
    {
      bool = true;
      this.jdField_a_of_type_Boolean = bool;
      if (!this.jdField_a_of_type_Boolean) {
        break label72;
      }
      c(2131363614);
      m();
    }
    for (;;)
    {
      if (QLog.isColorLevel()) {
        QLog.d(this.jdField_a_of_type_JavaLangString, 2, "initData exit");
      }
      return;
      bool = false;
      break;
      label72:
      k();
      m();
    }
  }
  
  private void h()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.certifiedGrade == 0) {
      this.jdField_a_of_type_AndroidWidgetTextView.setText(this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.name);
    }
    for (;;)
    {
      if ((this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.displayNumber != null) && (this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.displayNumber.length() > 0))
      {
        this.jdField_c_of_type_JavaLangString = String.format(super.getResources().getString(2131363603), new Object[] { this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.displayNumber });
        this.jdField_b_of_type_AndroidWidgetTextView.setVisibility(0);
        this.jdField_b_of_type_AndroidWidgetTextView.setText(this.jdField_c_of_type_JavaLangString);
      }
      Object localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.b(this.jdField_b_of_type_JavaLangString);
      this.jdField_a_of_type_AndroidWidgetImageView.setBackgroundDrawable((Drawable)localObject);
      if (this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver == null)
      {
        this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver = new cez(this);
        addObserver(this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver);
      }
      i();
      return;
      localObject = getResources().getDrawable(2130839260);
      ((Drawable)localObject).setBounds(0, 0, ((Drawable)localObject).getIntrinsicWidth(), ((Drawable)localObject).getIntrinsicHeight());
      localObject = new ImageSpan((Drawable)localObject, 1);
      SpannableString localSpannableString = new SpannableString(this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.name + "[certified]");
      int j = this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.name.length();
      int k = this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.name.length();
      localSpannableString.setSpan(localObject, j, "[certified]".length() + k, 17);
      this.jdField_a_of_type_AndroidWidgetTextView.setText(localSpannableString);
    }
  }
  
  private void i()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail == null) {
      return;
    }
    if (this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.followType == 1)
    {
      this.jdField_a_of_type_AndroidWidgetButton.setText(2131363605);
      this.jdField_a_of_type_AndroidWidgetButton.setTextAppearance(this, 2131558814);
      return;
    }
    this.jdField_a_of_type_AndroidWidgetButton.setText(2131363602);
    this.jdField_a_of_type_AndroidWidgetButton.setTextAppearance(this, 2131558814);
  }
  
  private void j()
  {
    this.jdField_a_of_type_AndroidWidgetLinearLayout.removeAllViews();
    if (this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.groupInfoList != null)
    {
      int k = this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.groupInfoList.size();
      int j = 0;
      while (j < k)
      {
        a((mobileqq_mp.ConfigGroupInfo)this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.groupInfoList.get(j), j, k);
        j += 1;
      }
    }
  }
  
  private void k()
  {
    if (QLog.isColorLevel()) {
      QLog.d(this.jdField_a_of_type_JavaLangString, 2, "updateView");
    }
    if (this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.hasIvrAbility())
    {
      this.jdField_b_of_type_AndroidViewView.setVisibility(0);
      this.jdField_c_of_type_AndroidViewView.setVisibility(0);
      this.jdField_c_of_type_AndroidViewView.setOnClickListener(this);
    }
    for (;;)
    {
      h();
      j();
      this.jdField_c_of_type_AndroidWidgetLinearLayout.invalidate();
      if (QLog.isColorLevel()) {
        QLog.d(this.jdField_a_of_type_JavaLangString, 2, "updateView exit");
      }
      return;
      this.jdField_b_of_type_AndroidViewView.setVisibility(8);
      this.jdField_c_of_type_AndroidViewView.setVisibility(8);
    }
  }
  
  private void l()
  {
    if ((this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog != null) && (this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.isShowing())) {
      this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.dismiss();
    }
  }
  
  private void m()
  {
    if (QLog.isDevelopLevel()) {
      QLog.d("crmtest", 4, "sendDetailInfoRequest, ts=" + System.currentTimeMillis());
    }
    if (QLog.isColorLevel()) {
      QLog.d(this.jdField_a_of_type_JavaLangString, 2, "sendDetailInfoRequest");
    }
    if (this.jdField_a_of_type_MqqAppNewIntent != null) {
      this.jdField_a_of_type_MqqAppNewIntent.setObserver(null);
    }
    this.jdField_a_of_type_MqqAppNewIntent = new NewIntent(super.getApplicationContext(), ProtoServlet.class);
    this.jdField_a_of_type_MqqAppNewIntent.putExtra("cmd", "EqqAccountSvc.get_eqq_detail");
    mobileqq_mp.GetEqqDetailInfoRequest localGetEqqDetailInfoRequest = new mobileqq_mp.GetEqqDetailInfoRequest();
    localGetEqqDetailInfoRequest.version.set(2);
    if (this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail != null) {
      localGetEqqDetailInfoRequest.seqno.set(this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.seqno);
    }
    try
    {
      for (;;)
      {
        localGetEqqDetailInfoRequest.eqq_id.set((int)Long.parseLong(this.jdField_b_of_type_JavaLangString));
        label151:
        this.jdField_a_of_type_MqqAppNewIntent.putExtra("data", localGetEqqDetailInfoRequest.toByteArray());
        this.jdField_a_of_type_MqqObserverBusinessObserver = new cfa(this);
        this.jdField_a_of_type_MqqAppNewIntent.setObserver(this.jdField_a_of_type_MqqObserverBusinessObserver);
        this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.startServlet(this.jdField_a_of_type_MqqAppNewIntent);
        this.jdField_a_of_type_Int += 1;
        if (QLog.isColorLevel()) {
          QLog.d(this.jdField_a_of_type_JavaLangString, 2, "sendDetailInfoRequest exit");
        }
        return;
        localGetEqqDetailInfoRequest.seqno.set(0);
      }
    }
    catch (Exception localException)
    {
      break label151;
    }
  }
  
  private void n()
  {
    boolean bool = super.getIntent().getBooleanExtra("need_finish", false);
    if (this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail == null) {
      return;
    }
    if (bool)
    {
      finish();
      return;
    }
    if (this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.followType == 1)
    {
      localIntent = new Intent(this, ChatActivity.class);
      localIntent.putExtra("chat_subType", 1);
      localIntent.putExtra("cSpecialFlag", getIntent().getExtras().getInt("cSpecialFlag"));
      localIntent.putExtra("uin", this.jdField_b_of_type_JavaLangString);
      localIntent.putExtra("uintype", 0);
      localIntent.putExtra("uinname", this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.name);
      startActivity(localIntent);
      return;
    }
    Intent localIntent = new Intent(this, ChatActivity.class);
    localIntent.putExtra("chat_subType", 1);
    localIntent.putExtra("uin", this.jdField_b_of_type_JavaLangString);
    localIntent.putExtra("uintype", 1024);
    localIntent.putExtra("uinname", this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.name);
    startActivity(localIntent);
  }
  
  public void a(int paramInt)
  {
    Toast.makeText(getApplicationContext(), paramInt, 0).show();
  }
  
  public void a(int paramInt, JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList();
    int j = 0;
    for (;;)
    {
      if (j < paramJSONArray.length()) {
        try
        {
          localArrayList.add(paramJSONArray.getString(j));
          j += 1;
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            localJSONException.printStackTrace();
          }
        }
      }
    }
    paramJSONArray = new Intent(this, TroopAvatarWallPreviewActivity.class);
    Bundle localBundle = new Bundle();
    localBundle.putInt("index", paramInt);
    localBundle.putStringArrayList("seqNum", localArrayList);
    localBundle.putBoolean("IS_EDIT", false);
    localBundle.putBoolean("is_use_path", true);
    localBundle.putBoolean("is_show_action", false);
    paramJSONArray.putExtras(localBundle);
    startActivity(paramJSONArray);
  }
  
  public void a(boolean paramBoolean, LinearLayout paramLinearLayout, JSONArray paramJSONArray1, JSONArray paramJSONArray2)
  {
    int n = paramJSONArray2.length();
    if (n <= 0) {
      return;
    }
    if (paramBoolean) {}
    for (int j = getWindow().getWindowManager().getDefaultDisplay().getWidth() - getResources().getDimensionPixelSize(2131493186); n == 1; j = getWindow().getWindowManager().getDefaultDisplay().getWidth() - getResources().getDimensionPixelSize(2131493187))
    {
      localObject = new ImageView(this);
      ((ImageView)localObject).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
      ((ImageView)localObject).setMaxWidth(j);
      ((ImageView)localObject).setMaxHeight(j);
      ((ImageView)localObject).setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
      ((ImageView)localObject).setOnClickListener(new ceu(this, paramJSONArray1));
      try
      {
        paramJSONArray1 = URLDrawable.getDrawable(paramJSONArray2.getString(0));
        ((ImageView)localObject).setImageDrawable(paramJSONArray1);
        paramLinearLayout.addView((View)localObject);
        paramJSONArray1.setURLDrawableListener(new cev(this, (ImageView)localObject));
        return;
      }
      catch (JSONException paramLinearLayout)
      {
        paramLinearLayout.printStackTrace();
        return;
      }
    }
    int i1 = (int)(2.0F * this.jdField_a_of_type_Float);
    int m = (j - i1 * 2) / 3;
    Object localObject = new GridView(this);
    ((GridView)localObject).setColumnWidth(m);
    ((GridView)localObject).setHorizontalSpacing(i1);
    ((GridView)localObject).setVerticalSpacing(i1);
    ((GridView)localObject).setSelector(new ColorDrawable(0));
    int k;
    if (n == 4)
    {
      ((GridView)localObject).setNumColumns(2);
      ((GridView)localObject).setAdapter(new cex(this, n, paramJSONArray2, m));
      ((GridView)localObject).setOnItemClickListener(new cey(this, paramJSONArray1));
      k = j;
      if (n == 4) {
        k = m * 2 + i1;
      }
      if (n <= 6) {
        break label365;
      }
      j = m * 3 + i1 * 2;
    }
    for (;;)
    {
      ((GridView)localObject).setLayoutParams(new LinearLayout.LayoutParams(k, j));
      paramLinearLayout.addView((View)localObject);
      return;
      ((GridView)localObject).setNumColumns(3);
      break;
      label365:
      j = m;
      if (n >= 4) {
        j = m * 2 + i1;
      }
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    do
    {
      do
      {
        return super.dispatchTouchEvent(paramMotionEvent);
      } while (!this.jdField_f_of_type_Boolean);
      this.h = true;
      return true;
    } while (!this.h);
    this.h = false;
    return true;
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.jdField_a_of_type_AndroidWidgetButton) {
      if (this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail != null) {}
    }
    do
    {
      return;
      if (this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.followType != 1)
      {
        e();
        ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "CliOper", "", "", "Biz_card", "Biz_card_follow", 0, 0, this.jdField_b_of_type_JavaLangString, "", "", "");
      }
      for (;;)
      {
        this.jdField_a_of_type_AndroidWidgetButton.setEnabled(false);
        this.jdField_a_of_type_AndroidWidgetButton.postDelayed(new cfb(this), 1000L);
        return;
        f();
        ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "CliOper", "", "", "Biz_card", "Biz_card_disfollow", 0, 0, this.jdField_b_of_type_JavaLangString, "", "", "");
      }
      if (paramView == this.jdField_a_of_type_AndroidViewView)
      {
        n();
        ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "CliOper", "", "", "Biz_card", "Biz_card_talk", 0, 0, this.jdField_b_of_type_JavaLangString, "2", "", "");
        return;
      }
    } while ((paramView == this.jdField_c_of_type_AndroidViewView) || (paramView != this.rightViewImg) || (this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail == null));
    ShareMsgHelper.a(this, this.jdField_b_of_type_JavaLangString, this.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.name, this.jdField_c_of_type_JavaLangString, "https://s.p.qq.com/pub/get_face?img_type=3&uin=" + this.jdField_b_of_type_JavaLangString, "https://s.p.qq.com/mpmobile/card/index.html?puin=" + this.jdField_b_of_type_JavaLangString, ContactUtils.g(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getAccount()), 2);
    PublicAccountHandler.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.jdField_b_of_type_JavaLangString, "Pb_account_lifeservice", "mp_msg_sys_10", "pbshare_click");
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    b();
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    paramMenu.add("menu");
    return super.onCreateOptionsMenu(paramMenu);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog != null) {
      this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.dismiss();
    }
    this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog = null;
    if (this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver != null)
    {
      this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.c(this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver);
      this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver = null;
    }
    if (this.jdField_a_of_type_MqqAppNewIntent != null) {
      this.jdField_a_of_type_MqqAppNewIntent.setObserver(null);
    }
    if (this.jdField_c_of_type_MqqAppNewIntent != null) {
      this.jdField_c_of_type_MqqAppNewIntent.setObserver(null);
    }
    if (this.jdField_b_of_type_MqqAppNewIntent != null) {
      this.jdField_b_of_type_MqqAppNewIntent.setObserver(null);
    }
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    if (this.jdField_b_of_type_Boolean) {}
    return false;
  }
  
  public void onResume()
  {
    super.onResume();
    if ((this.jdField_b_of_type_JavaLangString != null) && (!this.g)) {
      g();
    }
    if (QLog.isDevelopLevel()) {
      QLog.d("crmtest", 4, "detail activity opened, ts=" + System.currentTimeMillis());
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.minihd.qq\assets\exlibs.2.jar\classes.jar
 * Qualified Name:     com.tencent.biz.eqq.EnterpriseDetailActivity
 * JD-Core Version:    0.7.0.1
 */
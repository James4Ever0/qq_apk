import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.biz.pubaccount.PublicAccountBrowser.a;
import com.tencent.biz.pubaccount.PublicAccountBrowser.b;
import com.tencent.biz.pubaccount.PublicAccountBrowser.c;
import com.tencent.biz.widgets.ElasticHorScrView;
import com.tencent.mobileqq.activity.ForwardRecentActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.structmsg.AbsStructMsg;
import com.tencent.qphone.base.util.QLog;
import com.tencent.qqlive.module.videoreport.collect.EventCollector;
import com.tencent.tim.teamwork.ShareUtils.2;
import java.util.ArrayList;
import java.util.List;

public class aujz
  implements AdapterView.OnItemClickListener
{
  private View HK;
  private aujz.a a;
  private QQAppInterface app;
  protected String aue;
  protected String auf;
  private ElasticHorScrView c;
  private boolean cLk = true;
  private ElasticHorScrView d;
  protected int dOi;
  private int dOj;
  private boolean djd;
  private ausj mActionSheet;
  private Activity mContext;
  private float mDensity = 1.0F;
  protected String mShareUrl;
  private TextView topTitle;
  protected String zc;
  
  public aujz(Activity paramActivity, QQAppInterface paramQQAppInterface)
  {
    this.mContext = paramActivity;
    this.app = paramQQAppInterface;
    this.mDensity = this.mContext.getResources().getDisplayMetrics().density;
  }
  
  @SuppressLint({"InflateParams"})
  @TargetApi(9)
  protected View L()
  {
    View localView = this.mContext.getLayoutInflater().inflate(2131559311, null);
    localView.setBackgroundResource(2130838900);
    this.c = ((ElasticHorScrView)localView.findViewById(2131377768));
    this.d = ((ElasticHorScrView)localView.findViewById(2131377769));
    this.topTitle = ((TextView)localView.findViewById(2131362019));
    this.topTitle.setText(2131720972);
    Object localObject1;
    GridView localGridView2;
    GridView localGridView1;
    if (azw())
    {
      this.topTitle.setVisibility(0);
      localObject1 = (LinearLayout)localView.findViewById(2131362025);
      if ((localObject1 != null) && (this.HK != null)) {
        ((LinearLayout)localObject1).addView(this.HK, this.dOj);
      }
      localGridView2 = (GridView)localView.findViewById(2131368140);
      localGridView1 = (GridView)localView.findViewById(2131368141);
      localObject1 = (TextView)localView.findViewById(2131362018);
      ((TextView)localObject1).setText(2131721058);
      ((TextView)localObject1).setOnClickListener(new auka(this));
      if (Build.VERSION.SDK_INT >= 9)
      {
        this.c.setOverScrollMode(2);
        this.d.setOverScrollMode(2);
      }
      localGridView1.setSmoothScrollbarEnabled(false);
      localObject2 = a();
      if (localObject2.length <= 0) {
        break label452;
      }
      localObject1 = localObject2[0];
      label222:
      if (localObject2.length <= 1) {
        break label464;
      }
    }
    label452:
    label464:
    for (Object localObject2 = localObject2[1];; localObject2 = new ArrayList(0))
    {
      int i = ((List)localObject1).size();
      localGridView2.setNumColumns(i);
      ViewGroup.LayoutParams localLayoutParams = localGridView2.getLayoutParams();
      localLayoutParams.width = ((int)(((i - 1) * 10 + i * 75 + 3) * this.mDensity));
      localGridView2.setLayoutParams(localLayoutParams);
      localGridView2.setAdapter(new PublicAccountBrowser.b(this.mContext, 0, (List)localObject1));
      localGridView2.setSelector(new ColorDrawable(0));
      localGridView2.setOnItemClickListener(this);
      i = localLayoutParams.width;
      int j = ((List)localObject2).size();
      localObject1 = localGridView1.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).width = ((int)((j * 75 + (j - 1) * 10 + 3) * this.mDensity));
      localGridView1.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localGridView1.setNumColumns(j);
      localGridView1.setAdapter(new PublicAccountBrowser.b(this.mContext, 0, (List)localObject2));
      localGridView1.setSelector(new ColorDrawable(0));
      localGridView1.setOnItemClickListener(this);
      localView.post(new ShareUtils.2(this, i, ((ViewGroup.LayoutParams)localObject1).width));
      return localView;
      this.topTitle.setVisibility(8);
      break;
      localObject1 = new ArrayList(0);
      break label222;
    }
  }
  
  public void QJ(boolean paramBoolean)
  {
    this.cLk = paramBoolean;
  }
  
  public void Qq()
  {
    if (this.mContext.isFinishing()) {}
    do
    {
      return;
      if (this.mActionSheet == null)
      {
        this.mActionSheet = ((ausj)auss.a(this.mContext, null));
        View localView = L();
        this.mActionSheet.setOnDismissListener(new aukb(this));
        this.mActionSheet.setOnKeyListener(new aukc(this));
        this.mActionSheet.setActionContentView(localView, null);
      }
    } while (this.mActionSheet.isShowing());
    this.mActionSheet.show();
  }
  
  public void VS(boolean paramBoolean)
  {
    this.djd = paramBoolean;
  }
  
  public void a(aujz.a parama)
  {
    this.a = parama;
  }
  
  protected List<PublicAccountBrowser.a>[] a()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = new PublicAccountBrowser.a();
    ((PublicAccountBrowser.a)localObject).label = this.mContext.getString(2131698630);
    ((PublicAccountBrowser.a)localObject).icon = 2130839248;
    ((PublicAccountBrowser.a)localObject).iconNeedBg = true;
    ((PublicAccountBrowser.a)localObject).action = 2;
    ((PublicAccountBrowser.a)localObject).argus = "";
    localArrayList.add(localObject);
    localObject = new PublicAccountBrowser.a();
    ((PublicAccountBrowser.a)localObject).label = this.mContext.getString(2131698652);
    ((PublicAccountBrowser.a)localObject).icon = 2130839256;
    ((PublicAccountBrowser.a)localObject).action = 9;
    ((PublicAccountBrowser.a)localObject).argus = "";
    localArrayList.add(localObject);
    localObject = new PublicAccountBrowser.a();
    ((PublicAccountBrowser.a)localObject).label = this.mContext.getString(2131698633);
    ((PublicAccountBrowser.a)localObject).icon = 2130839249;
    ((PublicAccountBrowser.a)localObject).action = 10;
    ((PublicAccountBrowser.a)localObject).argus = "";
    localArrayList.add(localObject);
    localObject = new PublicAccountBrowser.a();
    ((PublicAccountBrowser.a)localObject).label = this.mContext.getString(2131698648);
    ((PublicAccountBrowser.a)localObject).icon = 2130839255;
    ((PublicAccountBrowser.a)localObject).iconNeedBg = true;
    ((PublicAccountBrowser.a)localObject).action = 12;
    ((PublicAccountBrowser.a)localObject).argus = "";
    localArrayList.add(localObject);
    localObject = new PublicAccountBrowser.a();
    ((PublicAccountBrowser.a)localObject).label = this.mContext.getString(2131698636);
    ((PublicAccountBrowser.a)localObject).icon = 2130839251;
    ((PublicAccountBrowser.a)localObject).iconNeedBg = true;
    ((PublicAccountBrowser.a)localObject).action = 5;
    ((PublicAccountBrowser.a)localObject).argus = "";
    localArrayList.add(localObject);
    localObject = new ArrayList();
    PublicAccountBrowser.a locala = new PublicAccountBrowser.a();
    locala.label = this.mContext.getString(2131698650);
    locala.icon = 2130837670;
    locala.iconNeedBg = true;
    locala.action = 26;
    locala.argus = "";
    ((ArrayList)localObject).add(locala);
    locala = new PublicAccountBrowser.a();
    locala.label = this.mContext.getString(2131698622);
    locala.icon = 2130837654;
    locala.iconNeedBg = true;
    locala.action = 1;
    locala.argus = "";
    ((ArrayList)localObject).add(locala);
    if (this.djd)
    {
      locala = new PublicAccountBrowser.a();
      locala.label = this.mContext.getString(2131698681);
      locala.icon = 2130837655;
      locala.iconNeedBg = true;
      locala.action = 27;
      locala.argus = "";
      ((ArrayList)localObject).add(locala);
    }
    locala = new PublicAccountBrowser.a();
    locala.label = this.mContext.getString(2131698628);
    locala.icon = 2130837667;
    locala.iconNeedBg = true;
    locala.action = 11;
    locala.argus = "";
    ((ArrayList)localObject).add(locala);
    return (List[])new ArrayList[] { localArrayList, localObject };
  }
  
  public void aB(View paramView, int paramInt)
  {
    if (paramView != null)
    {
      this.HK = paramView;
      this.dOj = paramInt;
    }
  }
  
  public boolean azw()
  {
    return this.cLk;
  }
  
  public View cD()
  {
    return this.HK;
  }
  
  public AbsStructMsg d()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("key_flag_from_plugin", true);
    localIntent.setClass(this.mContext, ForwardRecentActivity.class);
    localIntent.putExtra("isFromShare", true);
    localIntent.putExtra("forward_type", 1001);
    localIntent.putExtra("pluginName", "web_share");
    localIntent.putExtra("req_type", 95);
    localIntent.putExtra("detail_url", this.mShareUrl);
    localIntent.putExtra("image_url_remote", this.auf);
    localIntent.putExtra("pubUin", "");
    localIntent.putExtra("struct_uin", "");
    if ((this.zc != null) && (this.zc.length() > 45)) {
      this.zc = (this.zc.substring(0, 45) + "…");
    }
    localIntent.putExtra("title", this.zc);
    if ((this.aue != null) && (this.aue.length() > 60)) {
      this.aue = (this.aue.substring(0, 60) + "…");
    }
    localIntent.putExtra("desc", this.aue);
    localIntent.putExtra("forward_thumb", this.auf);
    localIntent.putExtra("struct_share_key_content_action", "web");
    localIntent.putExtra("req_share_id", -1L);
    localIntent.putExtra("brief_key", this.mContext.getString(2131698632, new Object[] { this.zc }));
    return anre.a(localIntent.getExtras());
  }
  
  public void dUl()
  {
    if (this.HK != null) {
      this.HK.setVisibility(8);
    }
  }
  
  public void destroy()
  {
    if ((this.mActionSheet != null) && (this.mActionSheet.isShowing()))
    {
      this.a = null;
      this.mActionSheet.dismiss();
    }
  }
  
  public void g(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    this.mShareUrl = paramString1;
    this.zc = paramString2;
    this.aue = paramString3;
    this.dOi = paramInt;
    this.auf = paramString4;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Object localObject = paramView.getTag();
    if (localObject == null) {
      if (QLog.isColorLevel()) {
        QLog.d("ShareUtils", 2, "onItemClick, tag is null");
      }
    }
    for (;;)
    {
      EventCollector.getInstance().onItemClick(paramAdapterView, paramView, paramInt, paramLong);
      return;
      localObject = ((PublicAccountBrowser.c)localObject).a;
      if (this.a != null) {
        this.a.rr(((PublicAccountBrowser.a)localObject).action);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void dUm();
    
    public abstract void rr(int paramInt);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.tim\classes4.jar
 * Qualified Name:     aujz
 * JD-Core Version:    0.7.0.1
 */
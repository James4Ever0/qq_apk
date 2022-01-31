package dov.com.tencent.biz.qqstory.takevideo.music;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import anml;
import anmm;
import anmn;
import anmo;
import com.tencent.biz.qqstory.base.ErrorMessage;
import com.tencent.biz.qqstory.base.download.DownloadProgressListener;
import com.tencent.biz.qqstory.base.download.DownloaderImp;
import com.tencent.biz.qqstory.channel.CmdTaskManger;
import com.tencent.biz.qqstory.channel.CmdTaskManger.CommandCallback;
import com.tencent.biz.qqstory.model.AddressDataProvider;
import com.tencent.biz.qqstory.model.AddressDataProvider.AddressInfo;
import com.tencent.biz.qqstory.model.DataProvider.DataUpdateListener;
import com.tencent.biz.qqstory.model.DataProviderManager;
import com.tencent.biz.qqstory.model.SuperManager;
import com.tencent.biz.qqstory.network.pb.qqstory_service.RspGetMusicListConfig;
import com.tencent.biz.qqstory.network.pb.qqstory_struct.MusicConfigInfo;
import com.tencent.biz.qqstory.network.request.GetMusicConfigRequest;
import com.tencent.biz.qqstory.network.response.GetMusicConfigResponse;
import com.tencent.biz.qqstory.support.logging.SLog;
import com.tencent.biz.qqstory.support.report.StoryReportor;
import com.tencent.biz.qqstory.support.report.VideoEditReport;
import com.tencent.mobileqq.activity.aio.AIOUtils;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import dov.com.tencent.biz.qqstory.takevideo.EditVideoMusic;
import dov.com.tencent.biz.qqstory.takevideo.EditVideoParams;
import dov.com.tencent.biz.qqstory.takevideo.EditVideoPartManager;
import dov.com.tencent.biz.qqstory.takevideo.EditVideoPlayerExport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;

@TargetApi(11)
public class EditVideoMusicDialog
  extends Dialog
  implements View.OnClickListener, AdapterView.OnItemClickListener, DownloadProgressListener, CmdTaskManger.CommandCallback, MusicHorizontalSeekView.SeekListener
{
  public int a;
  protected long a;
  protected BroadcastReceiver a;
  public Handler a;
  public View a;
  protected GridView a;
  public ProgressBar a;
  public TextView a;
  public DownloaderImp a;
  private DataProvider.DataUpdateListener a;
  public EditVideoMusic a;
  protected EditVideoParams a;
  public BlessVoiceChangeManager a;
  protected EditVideoMusicDialog.MusicPlayTask a;
  public MusicGridAdapter a;
  public MusicHorizontalSeekView a;
  public QQStoryMusicInfo a;
  protected HashMap a;
  protected Timer a;
  public final boolean a;
  public int b;
  protected long b;
  public View b;
  public TextView b;
  protected HashMap b;
  public boolean b;
  protected int c;
  protected TextView c;
  public boolean c;
  protected volatile int d;
  protected TextView d;
  protected TextView e;
  protected TextView f;
  
  public EditVideoMusicDialog(Context paramContext, EditVideoMusic paramEditVideoMusic, boolean paramBoolean, int paramInt, EditVideoParams paramEditVideoParams)
  {
    super(paramContext, 2131624484);
    this.jdField_a_of_type_JavaUtilHashMap = new HashMap();
    this.jdField_b_of_type_JavaUtilHashMap = new HashMap();
    this.jdField_a_of_type_Long = 1000L;
    this.jdField_a_of_type_AndroidOsHandler = new anml(this);
    this.jdField_a_of_type_AndroidContentBroadcastReceiver = new anmn(this);
    this.jdField_a_of_type_ComTencentBizQqstoryModelDataProvider$DataUpdateListener = new anmo(this);
    super.requestWindowFeature(1);
    this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic = paramEditVideoMusic;
    this.jdField_a_of_type_Boolean = paramBoolean;
    this.jdField_a_of_type_Int = paramInt;
    this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoParams = paramEditVideoParams;
    this.jdField_c_of_type_Int = this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoParams.jdField_a_of_type_Int;
    a(paramContext);
    paramEditVideoMusic = super.getWindow().getAttributes();
    paramEditVideoMusic.x = 0;
    paramEditVideoMusic.y = 0;
    paramEditVideoMusic.width = -1;
    paramEditVideoMusic.height = AIOUtils.a(260.0F, paramContext.getResources());
    paramEditVideoMusic.windowAnimations = 2131624200;
    paramEditVideoMusic.gravity = 83;
    super.getWindow().setBackgroundDrawable(new ColorDrawable());
  }
  
  private void g()
  {
    this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.a(this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicQQStoryMusicInfo);
    if (this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicQQStoryMusicInfo != null)
    {
      if (this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicQQStoryMusicInfo.jdField_b_of_type_Int == 1)
      {
        this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(6);
        return;
      }
      if (this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicQQStoryMusicInfo.jdField_b_of_type_Int == 0)
      {
        this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(3);
        return;
      }
      if (!TextUtils.isEmpty(this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicQQStoryMusicInfo.h))
      {
        this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(11);
        return;
      }
      this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(6);
      this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.a(QQStoryMusicInfo.jdField_b_of_type_DovComTencentBizQqstoryTakevideoMusicQQStoryMusicInfo);
      return;
    }
    this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(6);
    this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.a(QQStoryMusicInfo.jdField_b_of_type_DovComTencentBizQqstoryTakevideoMusicQQStoryMusicInfo);
  }
  
  public int a()
  {
    if (this.jdField_a_of_type_Int < 5000) {
      return 5000;
    }
    return this.jdField_a_of_type_Int;
  }
  
  public void a()
  {
    if (this.jdField_a_of_type_Boolean) {
      this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.aq_();
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    int i = (int)(this.jdField_c_of_type_AndroidWidgetTextView.getPaint().measureText("00:00") / 2.0F);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.jdField_c_of_type_AndroidWidgetTextView.getLayoutParams();
    localLayoutParams.leftMargin = (paramInt1 - i);
    this.jdField_c_of_type_AndroidWidgetTextView.setLayoutParams(localLayoutParams);
    localLayoutParams = (LinearLayout.LayoutParams)this.jdField_d_of_type_AndroidWidgetTextView.getLayoutParams();
    localLayoutParams.leftMargin = (paramInt2 - i * 2);
    this.jdField_d_of_type_AndroidWidgetTextView.setLayoutParams(localLayoutParams);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    b();
    c();
    b(paramInt1, paramInt2, paramInt3);
    if (this.jdField_a_of_type_Boolean) {}
    for (String str = "2";; str = "1")
    {
      StoryReportor.a("video_edit", "cut_music", 0, 0, new String[] { str, "", "", "" });
      VideoEditReport.a("0X80076DA");
      return;
    }
  }
  
  public void a(Context paramContext)
  {
    Object localObject = LayoutInflater.from(paramContext).inflate(2130970737, null);
    super.setContentView((View)localObject);
    long l;
    label362:
    int i;
    if ((this.jdField_a_of_type_Int < 5000) || (this.jdField_a_of_type_Boolean))
    {
      l = this.jdField_a_of_type_Int / 6;
      this.jdField_a_of_type_Long = l;
      this.jdField_a_of_type_AndroidWidgetProgressBar = ((ProgressBar)((View)localObject).findViewById(2131368980));
      this.jdField_b_of_type_AndroidViewView = ((View)localObject).findViewById(2131368984);
      this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicMusicHorizontalSeekView = ((MusicHorizontalSeekView)((View)localObject).findViewById(2131368985));
      this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicMusicHorizontalSeekView.setOnSeekListener(this);
      this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)((View)localObject).findViewById(2131371745));
      this.jdField_c_of_type_AndroidWidgetTextView = ((TextView)super.findViewById(2131368986));
      this.jdField_d_of_type_AndroidWidgetTextView = ((TextView)super.findViewById(2131368987));
      this.e = ((TextView)super.findViewById(2131371748));
      this.f = ((TextView)super.findViewById(2131371749));
      this.e.setOnClickListener(this);
      this.f.setOnClickListener(this);
      this.jdField_b_of_type_AndroidWidgetTextView = ((TextView)((View)localObject).findViewById(2131371744));
      this.jdField_b_of_type_AndroidWidgetTextView.setText("");
      this.jdField_a_of_type_AndroidViewView = ((View)localObject).findViewById(2131368981);
      this.jdField_a_of_type_AndroidWidgetGridView = ((GridView)((View)localObject).findViewById(2131371747));
      this.jdField_a_of_type_AndroidWidgetGridView.setNumColumns(-1);
      this.jdField_a_of_type_AndroidWidgetGridView.setSelector(new ColorDrawable(0));
      if (Build.VERSION.SDK_INT >= 9) {
        this.jdField_a_of_type_AndroidWidgetGridView.setOverScrollMode(2);
      }
      this.jdField_a_of_type_AndroidWidgetGridView.setOnItemClickListener(this);
      this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicMusicGridAdapter = new MusicGridAdapter(paramContext, this.jdField_a_of_type_AndroidWidgetGridView, this.jdField_a_of_type_Boolean, a(this.jdField_c_of_type_Int));
      this.jdField_a_of_type_AndroidWidgetGridView.setAdapter(this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicMusicGridAdapter);
      this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicMusicGridAdapter.a(null);
      localObject = this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.a();
      if (localObject == null)
      {
        EditVideoMusic localEditVideoMusic = this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic;
        if (!this.jdField_a_of_type_Boolean) {
          break label663;
        }
        paramContext = QQStoryMusicInfo.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicQQStoryMusicInfo;
        localEditVideoMusic.a(paramContext);
      }
      this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicQQStoryMusicInfo = ((QQStoryMusicInfo)localObject);
      this.jdField_c_of_type_Boolean = EditVideoPartManager.a(this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoParams.jdField_b_of_type_Int, 4096);
      if (this.jdField_c_of_type_Boolean) {
        this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicBlessVoiceChangeManager = new BlessVoiceChangeManager(this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic, this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoParams, this.jdField_a_of_type_AndroidOsHandler);
      }
      if (a(this.jdField_c_of_type_Int))
      {
        if ((this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.jdField_a_of_type_JavaUtilArrayList != null) && (!this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.jdField_a_of_type_JavaUtilArrayList.isEmpty())) {
          break label670;
        }
        i = 1;
        label457:
        this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.jdField_a_of_type_JavaUtilArrayList = QQStoryMusicInfo.a(getContext());
        this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(1);
        if (i != 0)
        {
          if (!NetworkUtil.d(getContext())) {
            break label675;
          }
          this.jdField_b_of_type_Long = System.currentTimeMillis();
          paramContext = new GetMusicConfigRequest();
          CmdTaskManger.a().a(paramContext, this);
        }
      }
      label517:
      paramContext = (AddressDataProvider)((DataProviderManager)SuperManager.a(20)).a(1);
      localObject = (AddressDataProvider.AddressInfo)paramContext.a();
      if (localObject == null) {
        break label702;
      }
      SLog.b("Q.qqstory.publish.edit.EditVideoMusicDialog", "get address from cache.");
      if (paramContext.a((AddressDataProvider.AddressInfo)localObject))
      {
        this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicMusicGridAdapter.a();
        if (QLog.isColorLevel()) {
          QLog.d("zivonchen", 2, "isInternationalUser --------------------1");
        }
      }
    }
    for (;;)
    {
      paramContext = new IntentFilter("com.tencent.mobileqq.action.ACTION_WEBVIEW_DISPATCH_EVENT");
      paramContext.addAction("action_music_start");
      getContext().registerReceiver(this.jdField_a_of_type_AndroidContentBroadcastReceiver, paramContext);
      if (QLog.isColorLevel()) {
        QLog.d("zivonchen", 2, "mVideoLength = " + this.jdField_a_of_type_Int);
      }
      return;
      l = 1000L;
      break;
      label663:
      paramContext = QQStoryMusicInfo.jdField_b_of_type_DovComTencentBizQqstoryTakevideoMusicQQStoryMusicInfo;
      break label362;
      label670:
      i = 0;
      break label457;
      label675:
      this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(1);
      QQToast.a(getContext(), "当前无网络", 0).a();
      break label517;
      label702:
      SLog.b("Q.qqstory.publish.edit.EditVideoMusicDialog", "get address from net.");
      paramContext.a(this.jdField_a_of_type_ComTencentBizQqstoryModelDataProvider$DataUpdateListener);
      paramContext.b();
      if (QLog.isColorLevel()) {
        QLog.d("zivonchen", 2, "isInternationalUser request poi --------------------0");
      }
    }
  }
  
  public void a(GetMusicConfigRequest paramGetMusicConfigRequest, GetMusicConfigResponse paramGetMusicConfigResponse, ErrorMessage paramErrorMessage)
  {
    StringBuilder localStringBuilder;
    if (QLog.isColorLevel())
    {
      localStringBuilder = new StringBuilder().append("onCmdRespond = ").append(System.currentTimeMillis() - this.jdField_b_of_type_Long).append(", errorMsg = ");
      if (paramErrorMessage != null) {
        break label199;
      }
    }
    label199:
    for (paramGetMusicConfigRequest = "null";; paramGetMusicConfigRequest = paramErrorMessage.getErrorMessage())
    {
      QLog.d("zivonchen", 2, paramGetMusicConfigRequest);
      StoryReportor.a("edit_video", "music_list_time", 0, 0, new String[] { String.valueOf(System.currentTimeMillis() - this.jdField_b_of_type_Long), "", "", "" });
      if ((paramErrorMessage == null) || (!paramErrorMessage.isFail())) {
        break;
      }
      paramGetMusicConfigRequest = this.jdField_a_of_type_AndroidOsHandler.obtainMessage(7);
      paramGetMusicConfigRequest.obj = ("onCmdRespond error = " + paramErrorMessage.getErrorMessage());
      this.jdField_a_of_type_AndroidOsHandler.sendMessage(paramGetMusicConfigRequest);
      StoryReportor.a("edit_video", "music_list_failed", 0, 0, new String[] { "", "", "", "" });
      return;
    }
    paramGetMusicConfigResponse = paramGetMusicConfigResponse.a;
    int j = paramGetMusicConfigResponse.music_config.size();
    paramGetMusicConfigRequest = new ArrayList(j);
    if (j > 0)
    {
      int i = 0;
      while (i < j)
      {
        paramGetMusicConfigRequest.add(new QQStoryMusicInfo((qqstory_struct.MusicConfigInfo)paramGetMusicConfigResponse.music_config.get(i)));
        i += 1;
      }
      if (QLog.isColorLevel())
      {
        paramGetMusicConfigResponse = new StringBuffer();
        paramGetMusicConfigResponse.append("GetMusicConfigResponse size = " + j);
        i = 0;
        while (i < j)
        {
          paramErrorMessage = (QQStoryMusicInfo)paramGetMusicConfigRequest.get(i);
          paramGetMusicConfigResponse.append(", " + i + ": title = " + paramErrorMessage.jdField_b_of_type_JavaLangString + ", audioUrl = " + paramErrorMessage.jdField_d_of_type_JavaLangString);
          i += 1;
        }
        QLog.d("zivonchen", 2, paramGetMusicConfigResponse.toString());
      }
    }
    for (;;)
    {
      StoryReportor.a("edit_video", "music_list_count", 0, 0, new String[] { String.valueOf(j), "", "", "" });
      this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.jdField_a_of_type_JavaUtilArrayList = paramGetMusicConfigRequest;
      QQStoryMusicInfo.a(getContext(), paramGetMusicConfigRequest);
      this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(1);
      return;
      if (QLog.isColorLevel()) {
        QLog.e("zivonchen", 2, "onCmdRespond data is NULL!!!!!");
      }
    }
  }
  
  public void a(String paramString)
  {
    Object localObject2;
    Object localObject1;
    if (!TextUtils.isEmpty(paramString))
    {
      localObject2 = QQStoryBGMusicUtils.a(paramString);
      localObject1 = (String)this.jdField_a_of_type_JavaUtilHashMap.get(paramString);
      if (TextUtils.isEmpty((CharSequence)localObject1)) {
        break label157;
      }
    }
    while (com.tencent.biz.qqstory.utils.FileUtils.e((String)localObject1))
    {
      if ((this.jdField_a_of_type_ComTencentBizQqstoryBaseDownloadDownloaderImp != null) && (this.jdField_a_of_type_ComTencentBizQqstoryBaseDownloadDownloaderImp.a()))
      {
        com.tencent.mobileqq.utils.FileUtils.d(this.jdField_a_of_type_ComTencentBizQqstoryBaseDownloadDownloaderImp.a());
        this.jdField_a_of_type_ComTencentBizQqstoryBaseDownloadDownloaderImp.a();
      }
      localObject2 = this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.a();
      if ((localObject2 != null) && (paramString.equals(((QQStoryMusicInfo)localObject2).jdField_d_of_type_JavaLangString)))
      {
        this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.a((String)localObject1);
        this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(2);
      }
      if (QLog.isColorLevel()) {
        QLog.d("zivonchen", 2, "exists audio_url = " + paramString + ", path = " + (String)localObject1);
      }
      return;
      label157:
      localObject1 = localObject2;
    }
    if (!NetworkUtil.g(BaseApplication.getContext()))
    {
      f();
      QQToast.a(BaseApplication.getContext(), 2131430016, 0).a();
      return;
    }
    this.jdField_b_of_type_JavaUtilHashMap.put(paramString, Long.valueOf(System.currentTimeMillis()));
    this.jdField_a_of_type_JavaUtilHashMap.put(paramString, localObject1);
    if ((this.jdField_a_of_type_ComTencentBizQqstoryBaseDownloadDownloaderImp != null) && (this.jdField_a_of_type_ComTencentBizQqstoryBaseDownloadDownloaderImp.a()))
    {
      com.tencent.mobileqq.utils.FileUtils.d(this.jdField_a_of_type_ComTencentBizQqstoryBaseDownloadDownloaderImp.a());
      this.jdField_a_of_type_ComTencentBizQqstoryBaseDownloadDownloaderImp.a();
    }
    ThreadManager.post(new anmm(this, paramString, (String)localObject2), 5, null, true);
  }
  
  public void a(String paramString, int paramInt)
  {
    String str = QQStoryBGMusicUtils.a(paramString);
    if (paramInt == 0)
    {
      this.jdField_d_of_type_Int = 0;
      if (QLog.isColorLevel()) {
        QLog.d("zivonchen", 2, "onDownloadFinish() url = " + paramString);
      }
      if (this.jdField_a_of_type_JavaUtilHashMap == null) {
        this.jdField_a_of_type_JavaUtilHashMap = new HashMap();
      }
      this.jdField_a_of_type_JavaUtilHashMap.put(paramString, str);
      QQStoryMusicInfo localQQStoryMusicInfo = this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.a();
      if ((localQQStoryMusicInfo != null) && (paramString.equals(localQQStoryMusicInfo.jdField_d_of_type_JavaLangString)))
      {
        this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.a(str);
        this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(2);
      }
      StoryReportor.a("edit_video", "music_download_success", 0, 0, new String[] { "", "", "", "" });
    }
    for (;;)
    {
      if (QLog.isColorLevel())
      {
        long l = ((Long)this.jdField_b_of_type_JavaUtilHashMap.get(paramString)).longValue();
        QLog.d("zivonchen", 2, "onDownloadFinish errCode = " + paramInt + ", name = " + com.tencent.biz.qqstory.utils.FileUtils.b(paramString) + ", downloadTime = " + (System.currentTimeMillis() - l) + ", fileSize = " + com.tencent.biz.qqstory.utils.FileUtils.a(str) + new StringBuilder().append(", url = ").append(paramString).toString());
      }
      return;
      StoryReportor.a("edit_video", "music_download_failed", 0, 0, new String[] { String.valueOf(paramInt), "", "", "" });
      VideoEditReport.a("0X80076D9");
    }
  }
  
  public void a(String paramString, long paramLong1, long paramLong2)
  {
    float f1 = (float)paramLong1 / (float)paramLong2;
    if (f1 >= this.jdField_d_of_type_Int * 0.05F)
    {
      this.jdField_d_of_type_Int += 1;
      paramString = this.jdField_a_of_type_AndroidOsHandler.obtainMessage(9);
      paramString.arg1 = ((int)(100.0F * f1));
      this.jdField_a_of_type_AndroidOsHandler.sendMessage(paramString);
      if (QLog.isColorLevel()) {
        QLog.d("zivonchen", 2, "onProgress() mIndex = " + this.jdField_d_of_type_Int + ", progress = " + f1 + ", cur = " + paramLong1 + ", size = " + paramLong2);
      }
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    if (QLog.isColorLevel()) {
      QLog.d("zivonchen", 2, "onDownloadStart() url = " + paramString1 + ", dstPath = " + paramString2);
    }
    this.jdField_d_of_type_Int = 0;
    paramString1 = this.jdField_a_of_type_AndroidOsHandler.obtainMessage(9);
    paramString1.arg1 = 0;
    this.jdField_a_of_type_AndroidOsHandler.sendMessage(paramString1);
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.k();
    }
    this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.l();
  }
  
  protected boolean a(int paramInt)
  {
    boolean bool = true;
    if (paramInt == 5) {
      bool = false;
    }
    return bool;
  }
  
  public void b()
  {
    e();
    this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.j();
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    int i = 1000;
    int j = (paramInt2 - paramInt1) / 1000 * 1000;
    if (j < 1000) {}
    for (;;)
    {
      j = i;
      if (this.jdField_c_of_type_Int == 1)
      {
        j = i;
        if (i > 8500.0D) {
          j = 10000;
        }
      }
      i = j + paramInt1;
      if (QLog.isColorLevel()) {
        QLog.d("zivonchen", 2, "start = " + paramInt1 + ", end = " + paramInt2 + ", displayEnd = " + i);
      }
      this.jdField_c_of_type_AndroidWidgetTextView.setText(QQStoryBGMusicUtils.a(paramInt1, false));
      this.jdField_d_of_type_AndroidWidgetTextView.setText(QQStoryBGMusicUtils.a(i, true));
      return;
      i = j;
    }
  }
  
  public void b(int paramInt1, int paramInt2, int paramInt3)
  {
    QQStoryMusicInfo localQQStoryMusicInfo = this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.a();
    if (localQQStoryMusicInfo != null)
    {
      localQQStoryMusicInfo.jdField_d_of_type_Int = ((int)(localQQStoryMusicInfo.f * (paramInt3 / paramInt1)));
      localQQStoryMusicInfo.e = (localQQStoryMusicInfo.jdField_d_of_type_Int + this.jdField_a_of_type_Int);
      b(localQQStoryMusicInfo.jdField_d_of_type_Int, localQQStoryMusicInfo.e);
    }
  }
  
  protected void c()
  {
    this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.m();
  }
  
  public void c(int paramInt1, int paramInt2, int paramInt3)
  {
    b(paramInt1, paramInt2, paramInt3);
    a();
    a(true);
  }
  
  public void d()
  {
    e();
    this.jdField_a_of_type_JavaUtilTimer = new Timer();
    this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicEditVideoMusicDialog$MusicPlayTask = new EditVideoMusicDialog.MusicPlayTask(this);
    this.jdField_a_of_type_JavaUtilTimer.schedule(this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicEditVideoMusicDialog$MusicPlayTask, 0L, this.jdField_a_of_type_Long);
  }
  
  public void dismiss()
  {
    getContext().unregisterReceiver(this.jdField_a_of_type_AndroidContentBroadcastReceiver);
    if ((this.jdField_a_of_type_ComTencentBizQqstoryBaseDownloadDownloaderImp != null) && (this.jdField_a_of_type_ComTencentBizQqstoryBaseDownloadDownloaderImp.a()))
    {
      com.tencent.mobileqq.utils.FileUtils.d(this.jdField_a_of_type_ComTencentBizQqstoryBaseDownloadDownloaderImp.a());
      this.jdField_a_of_type_ComTencentBizQqstoryBaseDownloadDownloaderImp.a();
    }
    ((AddressDataProvider)((DataProviderManager)SuperManager.a(20)).a(1)).b(this.jdField_a_of_type_ComTencentBizQqstoryModelDataProvider$DataUpdateListener);
    e();
    a(true);
    super.dismiss();
  }
  
  protected void e()
  {
    if (this.jdField_a_of_type_JavaUtilTimer != null)
    {
      this.jdField_a_of_type_JavaUtilTimer.cancel();
      this.jdField_a_of_type_JavaUtilTimer = null;
    }
    if (this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicEditVideoMusicDialog$MusicPlayTask != null)
    {
      this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicEditVideoMusicDialog$MusicPlayTask.cancel();
      this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicEditVideoMusicDialog$MusicPlayTask = null;
    }
    this.jdField_b_of_type_Int = -1;
    this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(8);
  }
  
  public void f()
  {
    QQStoryMusicInfo localQQStoryMusicInfo = this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.a();
    if ((localQQStoryMusicInfo != null) && (localQQStoryMusicInfo.jdField_b_of_type_Int == 3) && (this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicMusicGridAdapter.a(localQQStoryMusicInfo) > 0) && (localQQStoryMusicInfo != null) && (!localQQStoryMusicInfo.equals(this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicMusicGridAdapter.a())))
    {
      this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicMusicGridAdapter.a(localQQStoryMusicInfo);
      this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicMusicGridAdapter.notifyDataSetChanged();
      if (QLog.isColorLevel()) {
        QLog.d("zivonchen", 2, "checkButtonState 按钮错位!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
      }
    }
  }
  
  public void onBackPressed()
  {
    g();
    super.onBackPressed();
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131371748: 
      g();
      VideoEditReport.a("0X80076DB");
      dismiss();
      return;
    }
    VideoEditReport.a("0X80076DC");
    dismiss();
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicMusicGridAdapter != null)
    {
      paramView = (QQStoryMusicInfo)this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicMusicGridAdapter.getItem(paramInt);
      if (paramView != null) {
        break label57;
      }
      if (QLog.isColorLevel()) {
        QLog.e("zivonchen", 2, "onItemClick error musicInfo = " + null);
      }
    }
    label57:
    do
    {
      do
      {
        return;
        this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.a(paramView);
        this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicMusicGridAdapter.a(paramView);
        this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicMusicGridAdapter.notifyDataSetChanged();
        if (paramInt >= this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicMusicGridAdapter.a()) {
          break;
        }
        b();
        if (paramView.jdField_b_of_type_Int == 0)
        {
          this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(3);
          if (this.jdField_a_of_type_Boolean) {}
          for (paramAdapterView = "2";; paramAdapterView = "1")
          {
            StoryReportor.a("video_edit", "close_music", 0, 0, new String[] { paramAdapterView, "", "", "" });
            VideoEditReport.a("0X80076D3");
            return;
          }
        }
        if (paramView.jdField_b_of_type_Int == 1)
        {
          this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(6);
          if (this.jdField_a_of_type_Boolean) {}
          for (paramAdapterView = "2";; paramAdapterView = "1")
          {
            StoryReportor.a("video_edit", "clk_video_sound", 0, 0, new String[] { paramAdapterView, "", "", "" });
            VideoEditReport.a("0X80076D4");
            this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.a("608", "3", "2", true);
            return;
          }
        }
      } while (paramView.jdField_b_of_type_Int != 2);
      if (!NetworkUtil.g(BaseApplication.getContext()))
      {
        f();
        QQToast.a(BaseApplication.getContext(), 2131430016, 0).a();
        return;
      }
      this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.a(QQStoryMusicInfo.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicQQStoryMusicInfo);
      this.jdField_b_of_type_Boolean = true;
      paramAdapterView = (EditVideoPlayerExport)this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoPartManager.a(EditVideoPlayerExport.class);
      if (paramAdapterView != null) {
        paramAdapterView.a(true);
      }
      b();
      paramAdapterView = this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.a();
      if ((paramAdapterView instanceof BaseActivity)) {
        QQStoryBGMusicUtils.a((BaseActivity)paramAdapterView);
      }
      if (this.jdField_a_of_type_Boolean) {}
      for (paramAdapterView = "2";; paramAdapterView = "1")
      {
        StoryReportor.a("video_edit", "add_qqmusic", 0, 0, new String[] { paramAdapterView, "", "", "" });
        VideoEditReport.a("0X80076D5");
        this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.a("608", "3", "1", true);
        return;
      }
      this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.a(QQStoryMusicInfo.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicQQStoryMusicInfo);
      paramAdapterView = (EditVideoPlayerExport)this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoPartManager.a(EditVideoPlayerExport.class);
      if (paramAdapterView != null) {
        paramAdapterView.a(true);
      }
      b();
      if (paramView.jdField_b_of_type_Int != 4) {
        break;
      }
    } while (this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicBlessVoiceChangeManager == null);
    this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoMusicBlessVoiceChangeManager.a(paramView);
    return;
    if (!TextUtils.isEmpty(paramView.jdField_d_of_type_JavaLangString))
    {
      this.jdField_a_of_type_AndroidViewView.setVisibility(0);
      this.jdField_b_of_type_AndroidWidgetTextView.setVisibility(8);
      this.jdField_a_of_type_AndroidWidgetTextView.setText(paramView.jdField_b_of_type_JavaLangString);
      this.jdField_b_of_type_AndroidViewView.setVisibility(8);
    }
    this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.a(paramView);
    a(paramView.jdField_d_of_type_JavaLangString);
    if (this.jdField_a_of_type_Boolean) {}
    for (paramAdapterView = "2";; paramAdapterView = "1")
    {
      StoryReportor.a("video_edit", "add_music", 0, 0, new String[] { paramAdapterView, "", "", "" });
      VideoEditReport.a("0X80076D8", "", "", paramView.jdField_b_of_type_JavaLangString, "");
      this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoMusic.a("608", "3", "1", true);
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     dov.com.tencent.biz.qqstory.takevideo.music.EditVideoMusicDialog
 * JD-Core Version:    0.7.0.1
 */
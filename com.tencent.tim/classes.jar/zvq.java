import android.content.Intent;
import android.content.res.Resources;
import android.util.Pair;
import android.view.View;
import com.tencent.biz.pubaccount.readinjoy.activity.ReadInJoyUploadAvatarFragment;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.activity.photo.LocalMediaInfo;
import com.tencent.mobileqq.activity.photo.MediaScanner;
import com.tencent.mobileqq.activity.photo.PhotoCropActivity;
import com.tencent.mobileqq.activity.photo.PhotoCropForPortraitActivity;
import com.tencent.mobileqq.activity.photo.PhotoUtils;
import com.tencent.mobileqq.activity.photo.album.AbstractPhotoListActivity.PhotoListAdapter;
import com.tencent.mobileqq.activity.photo.album.NewPhotoListActivity;
import com.tencent.mobileqq.activity.photo.album.NewPhotoPreviewActivity;
import com.tencent.mobileqq.activity.photo.album.PhotoCommonBaseData;
import com.tencent.mobileqq.activity.shortvideo.ShortVideoPreviewActivity;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.AdapterView;
import com.tencent.widget.GestureSelectGridView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class zvq
  extends ztv
{
  private boolean btY;
  private boolean btZ;
  
  zvq(NewPhotoListActivity paramNewPhotoListActivity)
  {
    super(paramNewPhotoListActivity);
  }
  
  protected void a(LocalMediaInfo paramLocalMediaInfo, int paramInt)
  {
    aqfy.clearCache();
    String str = paramLocalMediaInfo.path;
    Intent localIntent = ((NewPhotoListActivity)this.mActivity).getIntent();
    localIntent.putExtra("ALBUM_NAME", this.mPhotoCommonData.albumName);
    localIntent.putExtra("ALBUM_ID", this.mPhotoCommonData.albumId);
    localIntent.putExtra("PhotoConst.IS_SINGLE_MODE", true);
    localIntent.putStringArrayListExtra("PhotoConst.PHOTO_PATHS", this.mPhotoCommonData.selectedPhotoList);
    localIntent.putExtra("PhotoConst.SINGLE_PHOTO_PATH", str);
    localIntent.putExtra("media_info", paramLocalMediaInfo);
    if (localIntent.getBooleanExtra("PhotoConst.MULTI_PREVIEW_IN_SINGLE_MODE", false))
    {
      localIntent.putStringArrayListExtra("PhotoConst.PHOTO_PATHS", this.mPhotoCommonData.mediaPathsList);
      localIntent.putExtra("PhotoConst.CURRENT_SELECTED_INDEX", paramInt);
    }
    if (this.a.btn)
    {
      paramLocalMediaInfo = aqfy.sSelectItemAlbum;
      if (!paramLocalMediaInfo.containsKey(str)) {
        paramLocalMediaInfo.put(str, new Pair(this.mPhotoCommonData.albumId, this.mPhotoCommonData.albumName));
      }
      ((NewPhotoListActivity)this.mActivity).recordLastPos(str);
      PhotoUtils.a(this.mActivity, localIntent, this.mPhotoCommonData.selectedPhotoList, 0, this.a.bjL);
      return;
    }
    if (!this.a.bto)
    {
      localIntent.putExtra("PhotoConst.ALLOW_LOCK", false);
      localIntent.setClass(this.mActivity, NewPhotoPreviewActivity.class);
      localIntent.putExtra("PasterConstants.pasters_data", this.a.hx);
      localIntent.putExtra("FROM_WHERE", "FROM_PHOTO_LIST");
      localIntent.putExtra("PhotoConst.SOURCE_FROM", "FROM_SELECT_PHOTO");
      localIntent.addFlags(603979776);
      paramLocalMediaInfo = ((NewPhotoListActivity)this.mActivity).getIntent().getStringExtra("PhotoConst.INIT_ACTIVITY_CLASS_NAME");
      if (ReadInJoyUploadAvatarFragment.class.getName().equals(paramLocalMediaInfo)) {
        break label528;
      }
      ((NewPhotoListActivity)this.mActivity).startActivity(localIntent);
      ((NewPhotoListActivity)this.mActivity).finish();
    }
    for (;;)
    {
      aqfy.anim(this.mActivity, true, true);
      return;
      paramInt = localIntent.getIntExtra("Business_Origin", 0);
      if ((100 == paramInt) || (102 == paramInt) || (103 == paramInt)) {
        if (100 == paramInt)
        {
          int i = aqep.w(this.mActivity);
          localIntent.putExtra("PhotoConst.CLIP_WIDTH", i);
          localIntent.putExtra("PhotoConst.CLIP_HEIGHT", i);
          label410:
          localIntent.setClass(this.mActivity, PhotoCropForPortraitActivity.class);
          localIntent.putExtra("PhotoConst.EDIT_MASK_SHAPE_TYPE", zti.fF(paramInt));
          localIntent.putExtra("PhotoConst.TARGET_WIDTH", 640);
          localIntent.putExtra("PhotoConst.TARGET_HEIGHT", 640);
        }
      }
      for (;;)
      {
        aqfy.a(localIntent, this.mPhotoCommonData.albumId, str, this.a.isRecodeLastAlbumPath);
        localIntent.putExtra("PHOTOLIST_START_POSITION", ((NewPhotoListActivity)this.mActivity).mGridView.getFirstVisiblePosition());
        break;
        localIntent.putExtra("PhotoConst.IS_WITH_PENDANT", false);
        break label410;
        localIntent.setClass(this.mActivity, PhotoCropActivity.class);
      }
      label528:
      ((NewPhotoListActivity)this.mActivity).startActivityForResult(localIntent, 100014);
    }
  }
  
  public void caseVideo(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (!aqft.cC()) {
      QQToast.a(this.mActivity, ((NewPhotoListActivity)this.mActivity).getResources().getString(2131719242), 0).show();
    }
    do
    {
      return;
      paramView = ((NewPhotoListActivity)this.mActivity).photoListAdapter.getItem(paramInt);
    } while (paramView == null);
    paramAdapterView = ((NewPhotoListActivity)this.mActivity).getIntent();
    if ((paramView.fileSize > this.mPhotoCommonData.videoSizeLimit) && (!this.btY))
    {
      paramAdapterView = aqha.a(this.mActivity, "你选择的视频文件过大，无法发送。");
      paramAdapterView.setPositiveButton(2131721079, new aqha.a());
      paramAdapterView.show();
      return;
    }
    Object localObject1 = aqfy.sSelectItemAlbum;
    Object localObject2;
    if (!((HashMap)localObject1).containsKey(paramView.path))
    {
      localObject2 = new Pair(this.mPhotoCommonData.albumId, this.mPhotoCommonData.albumName);
      ((HashMap)localObject1).put(paramView.path, localObject2);
    }
    ((NewPhotoListActivity)this.mActivity).recordLastPos(paramView.path);
    if (!this.a.btj)
    {
      paramAdapterView.putExtra("file_send_path", paramView.path);
      paramAdapterView.putExtra("PhotoConst.IS_VIDEO_SELECTED", true);
      paramAdapterView.putExtra("PhotoConst.VIDEO_SIZE", paramView.fileSize);
      paramAdapterView.putExtra("file_send_duration", paramView.mDuration);
      paramAdapterView.putExtra("file_width", paramView.mediaWidth);
      paramAdapterView.putExtra("file_height", paramView.mediaHeight);
      paramAdapterView.putExtra("media_info", paramView);
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).add(paramView.path);
      if (this.btY)
      {
        ((NewPhotoListActivity)this.mActivity).showProgressDialog();
        MediaScanner.getInstance(BaseApplicationImpl.getContext()).queryMediaInfoAsync(new zvr(this, paramAdapterView, (ArrayList)localObject1), paramView);
        return;
      }
      PhotoUtils.a(this.mActivity, paramAdapterView, (ArrayList)localObject1, 2, false);
      return;
    }
    if (!this.a.isSingleMode)
    {
      paramView = ((NewPhotoListActivity)this.mActivity).getIntent();
      paramView.putExtra("ALBUM_NAME", this.mPhotoCommonData.albumName);
      paramView.putExtra("ALBUM_ID", this.mPhotoCommonData.albumId);
      localObject1 = ((NewPhotoListActivity)this.mActivity).photoListAdapter.getItem(paramInt);
      paramView.putExtra("PhotoConst.CURRENT_SELECTED_INDEX", ((LocalMediaInfo)localObject1).position);
      paramView.putStringArrayListExtra("PhotoConst.SELECTED_PATHS", this.mPhotoCommonData.selectedPhotoList);
      paramView.putIntegerArrayListExtra("PhotoConst.SELECTED_INDEXS", this.mPhotoCommonData.selectedIndex);
      paramView.putExtra("FROM_WHERE", "FROM_PHOTO_LIST");
      paramView.putExtra("PhotoConst.CURRENT_QUALITY_TYPE", this.mPhotoCommonData.currentQualityType);
      paramView.putExtra("PhotoConst.SHOW_ALBUM", true);
      paramView.putExtra("PhotoConst.SHOW_MAGIC_USE_PASTER", this.a.btm);
      paramView.putExtra("PasterConstants.paster_id", this.a.pasterId);
      paramView.putExtra("PasterConstants.paster_cate_id", this.a.baR);
      ztu.sPhotoListFirstPos = ((NewPhotoListActivity)this.mActivity).mGridView.getFirstVisiblePosition();
      localObject2 = this.mPhotoCommonData.selectedMediaInfoHashMap;
      if (!((HashMap)localObject2).containsKey(((LocalMediaInfo)localObject1).path)) {
        ((HashMap)localObject2).put(((LocalMediaInfo)localObject1).path, localObject1);
      }
      paramView.putExtra("PeakConstants.selectedMediaInfoHashMap", (Serializable)localObject2);
      paramView.putExtra("PasterConstants.pasters_data", this.a.hx);
      paramView.setClass(this.mActivity, NewPhotoPreviewActivity.class);
      paramView.addFlags(603979776);
      if ((this.mPhotoCommonData.selectedPhotoList != null) && (this.mPhotoCommonData.selectedPhotoList.size() > 0)) {
        anot.b(null, "CliOper", "", this.mPhotoCommonData.myUin, "0X8005674", "0X8005674", 0, this.mPhotoCommonData.selectedPhotoList.size(), 0, "", "", "", "");
      }
      if (((zuc)this.mOtherCommonData).VO()) {
        ((NewPhotoListActivity)this.mActivity).startActivityForResult(paramAdapterView, 100010);
      }
      for (;;)
      {
        aqfy.anim(this.mActivity, true, true);
        return;
        ((NewPhotoListActivity)this.mActivity).startActivity(paramView);
        ((NewPhotoListActivity)this.mActivity).finish();
      }
    }
    localObject1 = new Intent(this.mActivity, ShortVideoPreviewActivity.class);
    ((Intent)localObject1).putExtras(paramAdapterView);
    ((Intent)localObject1).putExtra("file_send_path", paramView.path);
    ((Intent)localObject1).putExtra("file_send_size", paramView.fileSize);
    ((Intent)localObject1).putExtra("file_send_duration", paramView.mDuration);
    ((Intent)localObject1).putExtra("file_width", paramView.mediaWidth);
    ((Intent)localObject1).putExtra("file_height", paramView.mediaHeight);
    ((Intent)localObject1).putExtra("uin", this.a.friendUin);
    ((Intent)localObject1).putExtra("uintype", this.a.cZ);
    ((Intent)localObject1).putExtra("file_source", "album");
    ((Intent)localObject1).putExtra("is_from_system_media", paramView.isSystemMeidaStore);
    if (this.a.isSupportVideoCheckbox)
    {
      ((Intent)localObject1).putExtra("PhotoConst.IS_SUPPORT_VIDEO_CHECKBOX", true);
      ((Intent)localObject1).putExtra("PhotoConst.PHOTO_PATHS", this.mPhotoCommonData.selectedPhotoList);
    }
    ((NewPhotoListActivity)this.mActivity).startActivityForResult((Intent)localObject1, 17);
  }
  
  public List<LocalMediaInfo> getLocalMediaInfos()
  {
    List localList = super.getLocalMediaInfos();
    if ((this.btY) && (localList != null))
    {
      int i = localList.size() - 1;
      while (i >= 0)
      {
        if (!((LocalMediaInfo)localList.get(i)).path.endsWith(".mp4")) {
          localList.remove(i);
        }
        i -= 1;
      }
    }
    return localList;
  }
  
  public void initData(Intent paramIntent)
  {
    super.initData(paramIntent);
    this.btY = paramIntent.getBooleanExtra("readinjoy_video", false);
    this.btZ = paramIntent.getBooleanExtra("from_readinjoy_slideshow", false);
    ((zuc)this.mOtherCommonData).a(this.btZ, this.mPhotoCommonData);
    if (((zuc)this.mOtherCommonData).VO())
    {
      rma.a().xL(21);
      rma.a().xK(13);
      rma.a().bvr();
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((!this.btY) && (!this.btZ))
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
    }
    ArrayList localArrayList = this.mPhotoCommonData.selectedPhotoList;
    if ((QLog.isDevelopLevel()) && (localArrayList != null) && (localArrayList.size() != 0)) {
      QLog.d("PhotoListActivity", 4, "[NewPhotoListActivity] [onActivityResult] selectedPhotoList = " + localArrayList.size());
    }
    if (paramInt2 == -1)
    {
      if ((this.btY) || (this.btZ))
      {
        ((NewPhotoListActivity)this.mActivity).setResult(-1, paramIntent);
        ((NewPhotoListActivity)this.mActivity).finish();
      }
    }
    else if (paramInt1 == 17)
    {
      if ((this.btY) && (paramIntent != null))
      {
        ((NewPhotoListActivity)this.mActivity).setResult(0, paramIntent);
        ((NewPhotoListActivity)this.mActivity).finish();
      }
      aqfy.sLastAlbumRecordTime = 0L;
      return;
    }
    PhotoUtils.a(this.mActivity, paramInt1, paramInt2, paramIntent, this.a.btp, this.mPhotoCommonData.myUin);
  }
  
  public void onTitleBtnCancelClick(View paramView)
  {
    if (this.btY)
    {
      aqfy.clearSelectItemInfo();
      aqfy.clearCache();
      ((NewPhotoListActivity)this.mActivity).setResult(0, ((NewPhotoListActivity)this.mActivity).getIntent());
      ((NewPhotoListActivity)this.mActivity).finish();
      aqfy.anim(this.mActivity, false, false);
      return;
    }
    super.onTitleBtnCancelClick(paramView);
  }
  
  public void startPhotoPreviewActivity(Intent paramIntent)
  {
    if (this.btZ)
    {
      ((NewPhotoListActivity)this.mActivity).startActivityForResult(paramIntent, 10013);
      return;
    }
    super.startPhotoPreviewActivity(paramIntent);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.tim\classes16.jar
 * Qualified Name:     zvq
 * JD-Core Version:    0.7.0.1
 */
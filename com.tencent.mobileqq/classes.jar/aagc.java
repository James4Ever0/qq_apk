import android.os.Handler;
import com.tencent.mobileqq.ar.arcloud.pb.ARRelationShipUploadRusult.StoryVideoExtRsp;
import com.tencent.mobileqq.ar.arcloud.pb.ARRelationShipUploadRusult.UploadPicExtInfo;
import com.tencent.mobileqq.arcard.ARRelationShipFileUpload.ARRelationShipFileUploadCallBack;
import com.tencent.mobileqq.arcard.ARVideoPreviewActivity;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.PBBytesField;

class aagc
  implements ARRelationShipFileUpload.ARRelationShipFileUploadCallBack
{
  aagc(aagb paramaagb) {}
  
  public void a(int paramInt)
  {
    this.a.a.a(2, paramInt);
  }
  
  public void a(String paramString)
  {
    ARVideoPreviewActivity.a(this.a.a).post(new aagd(this));
  }
  
  public void a(String paramString, ARRelationShipUploadRusult.StoryVideoExtRsp paramStoryVideoExtRsp)
  {
    paramString = paramStoryVideoExtRsp.bytes_cdn_url.get().toStringUtf8();
    this.a.a.a(2, paramString);
  }
  
  public void a(String paramString, ARRelationShipUploadRusult.UploadPicExtInfo paramUploadPicExtInfo) {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     aagc
 * JD-Core Version:    0.7.0.1
 */
import android.widget.TextView;
import com.tencent.biz.qqstory.support.logging.SLog;
import com.tencent.mobileqq.widget.QQToast;
import dov.com.tencent.biz.qqstory.takevideo.EditLocalVideoPlayer;
import dov.com.tencent.biz.qqstory.takevideo.localmedia.baoutils.common.Callbacks.Callback;
import dov.com.tencent.biz.qqstory.takevideo.localmedia.demos.MediaCodecThumbnailGenerator.ThumbnailResult;
import java.util.List;

public class anzr
  implements Callbacks.Callback
{
  public anzr(EditLocalVideoPlayer paramEditLocalVideoPlayer) {}
  
  public Void a(Boolean paramBoolean, MediaCodecThumbnailGenerator.ThumbnailResult paramThumbnailResult)
  {
    if (paramBoolean.booleanValue())
    {
      SLog.b("Q.qqstory.record.EditLocalVideoPlayer.Flow", "ThumbnailResult succ=%b size=%d", paramBoolean, Integer.valueOf(Math.max(paramThumbnailResult.b.size(), paramThumbnailResult.jdField_a_of_type_JavaUtilList.size())));
      this.a.a.setEnabled(true);
    }
    for (;;)
    {
      return null;
      SLog.e("Q.qqstory.record.EditLocalVideoPlayer.Flow", "ThumbnailResult error!!! errorCode=" + paramThumbnailResult.jdField_a_of_type_Int);
      QQToast.a(this.a.a(), 1, "生成缩略图出错, 错误码:" + paramThumbnailResult.jdField_a_of_type_Int, 1);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     anzr
 * JD-Core Version:    0.7.0.1
 */
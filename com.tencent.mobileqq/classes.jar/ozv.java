import com.tencent.biz.tribe.TribeVideoPlugin;
import com.tencent.qphone.base.util.QLog;
import com.tencent.qqlive.mediaplayer.api.TVK_IMediaPlayer;
import com.tencent.qqlive.mediaplayer.api.TVK_IMediaPlayer.OnErrorListener;

public class ozv
  implements TVK_IMediaPlayer.OnErrorListener
{
  public ozv(TribeVideoPlugin paramTribeVideoPlugin, paf parampaf) {}
  
  public boolean onError(TVK_IMediaPlayer paramTVK_IMediaPlayer, int paramInt1, int paramInt2, int paramInt3, String paramString, Object paramObject)
  {
    QLog.e("TribeVideoPlugin", 2, "TVK_IMediaPlayer.OnErrorListener model = " + paramInt1 + " what = " + paramInt2 + " position = " + paramInt3 + " extra = " + paramString);
    if (TribeVideoPlugin.a(this.jdField_a_of_type_ComTencentBizTribeTribeVideoPlugin) != null)
    {
      TribeVideoPlugin.a(this.jdField_a_of_type_ComTencentBizTribeTribeVideoPlugin).removeMessages(7, paf.a(this.jdField_a_of_type_Paf));
      paramTVK_IMediaPlayer = TribeVideoPlugin.a(this.jdField_a_of_type_ComTencentBizTribeTribeVideoPlugin).obtainMessage();
      paramTVK_IMediaPlayer.obj = paf.a(this.jdField_a_of_type_Paf);
      paramTVK_IMediaPlayer.what = 7;
      TribeVideoPlugin.a(this.jdField_a_of_type_ComTencentBizTribeTribeVideoPlugin).sendMessage(paramTVK_IMediaPlayer);
    }
    return false;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     ozv
 * JD-Core Version:    0.7.0.1
 */
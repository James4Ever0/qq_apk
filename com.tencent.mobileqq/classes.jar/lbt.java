import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.biz.pubaccount.VideoInfo.TopBarInfo;

public final class lbt
  implements Parcelable.Creator
{
  public VideoInfo.TopBarInfo a(Parcel paramParcel)
  {
    return new VideoInfo.TopBarInfo(paramParcel);
  }
  
  public VideoInfo.TopBarInfo[] a(int paramInt)
  {
    return new VideoInfo.TopBarInfo[paramInt];
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     lbt
 * JD-Core Version:    0.7.0.1
 */
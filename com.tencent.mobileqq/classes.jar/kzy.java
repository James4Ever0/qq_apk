import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.biz.pubaccount.VideoInfo;

public final class kzy
  implements Parcelable.Creator
{
  public VideoInfo a(Parcel paramParcel)
  {
    return new VideoInfo(paramParcel);
  }
  
  public VideoInfo[] a(int paramInt)
  {
    return new VideoInfo[paramInt];
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     kzy
 * JD-Core Version:    0.7.0.1
 */
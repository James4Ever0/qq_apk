import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mobileqq.pic.CompressInfo;

public final class dzp
  implements Parcelable.Creator
{
  public CompressInfo a(Parcel paramParcel)
  {
    return new CompressInfo(paramParcel, null);
  }
  
  public CompressInfo[] a(int paramInt)
  {
    return new CompressInfo[paramInt];
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     dzp
 * JD-Core Version:    0.7.0.1
 */
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mobileqq.ar.aidl.ARScanStarFaceConfigInfo;

public final class aald
  implements Parcelable.Creator
{
  public ARScanStarFaceConfigInfo a(Parcel paramParcel)
  {
    return new ARScanStarFaceConfigInfo(paramParcel);
  }
  
  public ARScanStarFaceConfigInfo[] a(int paramInt)
  {
    return new ARScanStarFaceConfigInfo[paramInt];
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aald
 * JD-Core Version:    0.7.0.1
 */
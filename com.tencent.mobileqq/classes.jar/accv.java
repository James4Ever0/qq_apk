import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mobileqq.data.PrecoverResource;

public final class accv
  implements Parcelable.Creator
{
  public PrecoverResource a(Parcel paramParcel)
  {
    return new PrecoverResource(paramParcel);
  }
  
  public PrecoverResource[] a(int paramInt)
  {
    return new PrecoverResource[paramInt];
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     accv
 * JD-Core Version:    0.7.0.1
 */
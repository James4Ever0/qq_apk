import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mobileqq.app.RoamInfoListWrapper;
import java.util.ArrayList;

public final class ztb
  implements Parcelable.Creator
{
  public RoamInfoListWrapper a(Parcel paramParcel)
  {
    RoamInfoListWrapper localRoamInfoListWrapper = new RoamInfoListWrapper();
    localRoamInfoListWrapper.a = paramParcel.readArrayList(ArrayList.class.getClassLoader());
    return localRoamInfoListWrapper;
  }
  
  public RoamInfoListWrapper[] a(int paramInt)
  {
    return new RoamInfoListWrapper[paramInt];
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     ztb
 * JD-Core Version:    0.7.0.1
 */
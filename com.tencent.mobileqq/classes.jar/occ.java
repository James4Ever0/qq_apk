import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.biz.qqstory.takevideo.EditTakeVideoSource;

public final class occ
  implements Parcelable.Creator
{
  public EditTakeVideoSource a(Parcel paramParcel)
  {
    return new EditTakeVideoSource(paramParcel);
  }
  
  public EditTakeVideoSource[] a(int paramInt)
  {
    return new EditTakeVideoSource[paramInt];
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     occ
 * JD-Core Version:    0.7.0.1
 */
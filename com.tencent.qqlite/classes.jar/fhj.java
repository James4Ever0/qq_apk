import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.widget.AbsListView.SavedState;

public final class fhj
  implements Parcelable.Creator
{
  public AbsListView.SavedState a(Parcel paramParcel)
  {
    return new AbsListView.SavedState(paramParcel, null);
  }
  
  public AbsListView.SavedState[] a(int paramInt)
  {
    return new AbsListView.SavedState[paramInt];
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     fhj
 * JD-Core Version:    0.7.0.1
 */
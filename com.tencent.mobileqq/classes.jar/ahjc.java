import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mobileqq.service.friendlist.remote.FriendGroupListInfo;

public final class ahjc
  implements Parcelable.Creator
{
  public FriendGroupListInfo a(Parcel paramParcel)
  {
    return new FriendGroupListInfo(paramParcel);
  }
  
  public FriendGroupListInfo[] a(int paramInt)
  {
    return new FriendGroupListInfo[paramInt];
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     ahjc
 * JD-Core Version:    0.7.0.1
 */
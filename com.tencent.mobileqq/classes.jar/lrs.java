import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.biz.pubaccount.readinjoy.magic.models.PFile;

public final class lrs
  implements Parcelable.Creator
{
  public PFile a(Parcel paramParcel)
  {
    return new PFile(paramParcel);
  }
  
  public PFile[] a(int paramInt)
  {
    return new PFile[paramInt];
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     lrs
 * JD-Core Version:    0.7.0.1
 */
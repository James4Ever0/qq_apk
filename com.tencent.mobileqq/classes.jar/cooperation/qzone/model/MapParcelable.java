package cooperation.qzone.model;

import amen;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Map;

public class MapParcelable
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new amen();
  private Map a;
  
  public MapParcelable(Map paramMap)
  {
    this.a = paramMap;
  }
  
  public Map a()
  {
    return this.a;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeMap(this.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     cooperation.qzone.model.MapParcelable
 * JD-Core Version:    0.7.0.1
 */
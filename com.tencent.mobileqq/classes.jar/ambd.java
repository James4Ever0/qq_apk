import android.os.Parcel;
import android.os.Parcelable.Creator;
import cooperation.qzone.LbsDataV2.GeoInfo;
import cooperation.qzone.LbsDataV2.GpsInfo;

public final class ambd
  implements Parcelable.Creator
{
  public LbsDataV2.GeoInfo a(Parcel paramParcel)
  {
    LbsDataV2.GeoInfo localGeoInfo = new LbsDataV2.GeoInfo();
    if (paramParcel != null)
    {
      localGeoInfo.address = paramParcel.readString();
      localGeoInfo.iDistrictCode = paramParcel.readInt();
      localGeoInfo.iRange = paramParcel.readInt();
      localGeoInfo.strCountry = paramParcel.readString();
      localGeoInfo.strProvince = paramParcel.readString();
      localGeoInfo.strCity = paramParcel.readString();
      localGeoInfo.strDistrict = paramParcel.readString();
      localGeoInfo.strTown = paramParcel.readString();
      localGeoInfo.strVillage = paramParcel.readString();
      localGeoInfo.strRoad = paramParcel.readString();
      localGeoInfo.strDefaultName = paramParcel.readString();
      localGeoInfo.gpsInfo = ((LbsDataV2.GpsInfo)paramParcel.readParcelable(LbsDataV2.GpsInfo.class.getClassLoader()));
    }
    return localGeoInfo;
  }
  
  public LbsDataV2.GeoInfo[] a(int paramInt)
  {
    return null;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     ambd
 * JD-Core Version:    0.7.0.1
 */
package com.tencent.mobileqq.troop.homework.arithmetic.data;

import ajfy;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class HWGuideItem
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new ajfy();
  public String a;
  public String b;
  
  public HWGuideItem(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\b.jar
 * Qualified Name:     com.tencent.mobileqq.troop.homework.arithmetic.data.HWGuideItem
 * JD-Core Version:    0.7.0.1
 */
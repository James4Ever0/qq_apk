package com.tencent.mobileqq.pluginsdk.ipc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelableBinder
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelableBinder> CREATOR = new Parcelable.Creator()
  {
    public ParcelableBinder createFromParcel(Parcel paramAnonymousParcel)
    {
      return new ParcelableBinder(paramAnonymousParcel, null);
    }
    
    public ParcelableBinder[] newArray(int paramAnonymousInt)
    {
      return new ParcelableBinder[paramAnonymousInt];
    }
  };
  private IBinder mBinder;
  
  public ParcelableBinder(IBinder paramIBinder)
  {
    this.mBinder = paramIBinder;
  }
  
  private ParcelableBinder(Parcel paramParcel)
  {
    this.mBinder = paramParcel.readStrongBinder();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getBinder()
  {
    return this.mBinder;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStrongBinder(this.mBinder);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     com.tencent.mobileqq.pluginsdk.ipc.ParcelableBinder
 * JD-Core Version:    0.7.0.1
 */
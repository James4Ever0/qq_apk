package com.tencent.mm.plugin.webview.ui.tools;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.plugin.webview.stub.e.a;

public class WebViewStubCallbackWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<WebViewStubCallbackWrapper> CREATOR = new WebViewStubCallbackWrapper.1();
  public int id;
  public e rno;
  
  private WebViewStubCallbackWrapper(IBinder paramIBinder)
  {
    this.rno = e.a.I(paramIBinder);
  }
  
  public WebViewStubCallbackWrapper(e parame, int paramInt)
  {
    this.rno = parame;
    this.id = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof WebViewStubCallbackWrapper)) {}
    while (((WebViewStubCallbackWrapper)paramObject).id != this.id) {
      return false;
    }
    return true;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStrongBinder(this.rno.asBinder());
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mm\classes6.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper
 * JD-Core Version:    0.7.0.1
 */
package com.tencent.mm.plugin.base.stub;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class WXEntryActivity$2
  implements DialogInterface.OnCancelListener
{
  WXEntryActivity$2(WXEntryActivity paramWXEntryActivity) {}
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    WXEntryActivity.b(this.hSD);
    this.hSD.finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mm\classes3.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXEntryActivity.2
 * JD-Core Version:    0.7.0.1
 */
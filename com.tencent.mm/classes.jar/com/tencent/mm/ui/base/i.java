package com.tencent.mm.ui.base;

import android.app.Dialog;
import android.content.Context;
import com.tencent.mm.sdk.platformtools.y;

public class i
  extends Dialog
{
  public i(Context paramContext)
  {
    super(paramContext);
  }
  
  public i(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }
  
  public void dismiss()
  {
    try
    {
      super.dismiss();
      return;
    }
    catch (Exception localException)
    {
      y.printErrStackTrace("MicroMsg.MMDialog", localException, "", new Object[0]);
    }
  }
  
  public void show()
  {
    try
    {
      super.show();
      return;
    }
    catch (Exception localException)
    {
      y.printErrStackTrace("MicroMsg.MMDialog", localException, "", new Object[0]);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mm\classes3.jar
 * Qualified Name:     com.tencent.mm.ui.base.i
 * JD-Core Version:    0.7.0.1
 */
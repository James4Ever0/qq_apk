package com.tencent.mobileqq.emosm.view;

import android.os.Handler;
import android.view.View;
import com.tencent.mobileqq.data.EmoticonPackage;
import com.tencent.mobileqq.emoticon.EmoticonPackageDownloadListener;
import com.tencent.mobileqq.widget.ProgressCircle;

class DragSortAdapter$3
  extends EmoticonPackageDownloadListener
{
  DragSortAdapter$3(DragSortAdapter paramDragSortAdapter, EmoticonPackage paramEmoticonPackage, ProgressCircle paramProgressCircle, View paramView) {}
  
  public void onPackageEnd(EmoticonPackage paramEmoticonPackage, int paramInt)
  {
    if ((paramEmoticonPackage != null) && (paramEmoticonPackage.epId.equals(this.val$pkg.epId)) && (paramEmoticonPackage.status == 2)) {
      this.this$0.handler.post(new DragSortAdapter.3.3(this, paramInt));
    }
  }
  
  public void onPackageProgress(EmoticonPackage paramEmoticonPackage, int paramInt1, int paramInt2)
  {
    if ((paramEmoticonPackage != null) && (paramEmoticonPackage.epId.equals(this.val$pkg.epId)) && (paramEmoticonPackage.status == 2)) {
      this.this$0.handler.post(new DragSortAdapter.3.2(this, paramInt1, paramInt2));
    }
  }
  
  public void onPackageStart(EmoticonPackage paramEmoticonPackage)
  {
    if ((paramEmoticonPackage != null) && (paramEmoticonPackage.epId.equals(this.val$pkg.epId)) && (paramEmoticonPackage.status == 2)) {
      this.this$0.handler.post(new DragSortAdapter.3.1(this));
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     com.tencent.mobileqq.emosm.view.DragSortAdapter.3
 * JD-Core Version:    0.7.0.1
 */
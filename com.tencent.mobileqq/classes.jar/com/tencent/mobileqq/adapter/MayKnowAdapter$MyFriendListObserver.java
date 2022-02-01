package com.tencent.mobileqq.adapter;

import android.os.Bundle;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.data.MayKnowRecommend;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.HorizontalListView;
import java.util.List;
import mqq.util.WeakReference;

final class MayKnowAdapter$MyFriendListObserver
  extends FriendListObserver
{
  WeakReference<MayKnowAdapter> a;
  
  MayKnowAdapter$MyFriendListObserver(MayKnowAdapter paramMayKnowAdapter)
  {
    this.a = new WeakReference(paramMayKnowAdapter);
  }
  
  public void onCancelMayKnowRecommend(boolean paramBoolean, String paramString)
  {
    MayKnowAdapter localMayKnowAdapter;
    if (paramBoolean)
    {
      localMayKnowAdapter = (MayKnowAdapter)this.a.get();
      if (localMayKnowAdapter == null) {
        break label71;
      }
      paramString = MayKnowAdapter.a(localMayKnowAdapter, paramString);
      if (QLog.isColorLevel()) {
        QLog.d("MayKnowAdapter", 2, "onCancelMayKnowRecommend target：" + paramString);
      }
      if (paramString != null) {
        MayKnowAdapter.a(localMayKnowAdapter, paramString);
      }
    }
    else
    {
      return;
    }
    MayKnowAdapter.a(localMayKnowAdapter);
    return;
    label71:
    QLog.d("MayKnowAdapter", 1, "onCancelMayKnowRecommend  adapter is null!");
  }
  
  public void onGetMayKnowRecommend(boolean paramBoolean, Bundle paramBundle)
  {
    if (paramBoolean)
    {
      paramBundle = (MayKnowAdapter)this.a.get();
      if (paramBundle != null)
      {
        if (QLog.isColorLevel()) {
          QLog.d("MayKnowAdapter", 2, "onGetMayKnowRecommend ");
        }
        MayKnowAdapter.a(paramBundle);
      }
    }
    else
    {
      return;
    }
    QLog.d("MayKnowAdapter", 1, "onGetMayKnowRecommend adapter is null!");
  }
  
  public void onMayKnowListPushAdd(boolean paramBoolean, List<MayKnowRecommend> paramList)
  {
    super.onMayKnowListPushAdd(paramBoolean, paramList);
    if (QLog.isColorLevel()) {
      QLog.d("MayKnowAdapter", 2, "onMayKnowListPushAdd");
    }
    if (paramBoolean)
    {
      paramList = (MayKnowAdapter)this.a.get();
      if (paramList != null) {
        MayKnowAdapter.a(paramList);
      }
    }
    else
    {
      return;
    }
    QLog.d("MayKnowAdapter", 1, "onMayKnowListPushAdd adapter is null!");
  }
  
  public void onMayKnowListPushDel(boolean paramBoolean, List<String> paramList)
  {
    super.onMayKnowListPushDel(paramBoolean, paramList);
    if (QLog.isColorLevel()) {
      QLog.d("MayKnowAdapter", 2, "onMayKnowListPushDel");
    }
    if (paramBoolean)
    {
      paramList = (MayKnowAdapter)this.a.get();
      if (paramList != null) {
        MayKnowAdapter.a(paramList);
      }
    }
    else
    {
      return;
    }
    QLog.d("MayKnowAdapter", 1, "onMayKnowListPushDel adapter is null!");
  }
  
  public void onMayknowStateChanged(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      MayKnowAdapter localMayKnowAdapter = (MayKnowAdapter)this.a.get();
      if (localMayKnowAdapter == null) {
        break label60;
      }
      if (MayKnowAdapter.a(localMayKnowAdapter) != null)
      {
        if (QLog.isColorLevel()) {
          QLog.d("MayKnowAdapter", 2, "onMayknowStateChanged");
        }
        localMayKnowAdapter.notifyDataSetChanged();
        MayKnowAdapter.a(localMayKnowAdapter).postDelayed(localMayKnowAdapter.a, 1600L);
      }
    }
    return;
    label60:
    QLog.d("MayKnowAdapter", 1, "onMayknowStateChanged adapter is null!");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     com.tencent.mobileqq.adapter.MayKnowAdapter.MyFriendListObserver
 * JD-Core Version:    0.7.0.1
 */
package com.tencent.biz.qqstory.takevideo.permission;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import com.tencent.biz.qqstory.support.logging.SLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ojw;

public class PermissionListAdapter
  extends BaseAdapter
  implements AdapterView.OnItemClickListener, PermissionPart.PartCallback
{
  private int jdField_a_of_type_Int;
  private List jdField_a_of_type_JavaUtilList = new ArrayList();
  
  public PermissionListAdapter(@NonNull List paramList)
  {
    if (paramList.isEmpty()) {
      SLog.d("Q.qqstory.publish.editPermissionListAdapter", "part list is empty.");
    }
    this.jdField_a_of_type_JavaUtilList.addAll(paramList);
    a();
    paramList = this.jdField_a_of_type_JavaUtilList.iterator();
    while (paramList.hasNext()) {
      ((PermissionPart)paramList.next()).a(this);
    }
  }
  
  @NonNull
  private ojw a(int paramInt)
  {
    Iterator localIterator = this.jdField_a_of_type_JavaUtilList.iterator();
    int j;
    for (int i = 0; localIterator.hasNext(); i = j)
    {
      PermissionPart localPermissionPart = (PermissionPart)localIterator.next();
      j = localPermissionPart.a() + i;
      if (paramInt <= j - 1) {
        return new ojw(localPermissionPart, paramInt - i);
      }
    }
    throw new IllegalStateException("unable find PermissionPart, position:" + paramInt);
  }
  
  private void a()
  {
    Iterator localIterator = this.jdField_a_of_type_JavaUtilList.iterator();
    for (int i = 0; localIterator.hasNext(); i = ((PermissionPart)localIterator.next()).a() + i) {}
    this.jdField_a_of_type_Int = i;
  }
  
  @Nullable
  public PermissionPart a()
  {
    Iterator localIterator = this.jdField_a_of_type_JavaUtilList.iterator();
    while (localIterator.hasNext())
    {
      PermissionPart localPermissionPart = (PermissionPart)localIterator.next();
      if (localPermissionPart.a) {
        return localPermissionPart;
      }
    }
    return null;
  }
  
  public void a(PermissionPart paramPermissionPart)
  {
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    return this.jdField_a_of_type_Int;
  }
  
  public Object getItem(int paramInt)
  {
    return Integer.valueOf(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public int getItemViewType(int paramInt)
  {
    ojw localojw = a(paramInt);
    return localojw.jdField_a_of_type_ComTencentBizQqstoryTakevideoPermissionPermissionPart.a(localojw.jdField_a_of_type_Int);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject = a(paramInt);
    PermissionPart localPermissionPart = ((ojw)localObject).jdField_a_of_type_ComTencentBizQqstoryTakevideoPermissionPermissionPart;
    paramInt = ((ojw)localObject).jdField_a_of_type_Int;
    localObject = paramView;
    if (paramView == null) {
      localObject = localPermissionPart.a(paramInt, paramViewGroup);
    }
    localPermissionPart.a(paramInt, (View)localObject);
    return localObject;
  }
  
  public int getViewTypeCount()
  {
    return 5;
  }
  
  public void notifyDataSetChanged()
  {
    a();
    super.notifyDataSetChanged();
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramView = a(paramInt);
    paramAdapterView = paramView.jdField_a_of_type_ComTencentBizQqstoryTakevideoPermissionPermissionPart;
    paramAdapterView.a(paramView.jdField_a_of_type_Int);
    if ((paramAdapterView instanceof EmptyPart)) {
      return;
    }
    paramAdapterView.b(true);
    paramView = this.jdField_a_of_type_JavaUtilList.iterator();
    while (paramView.hasNext())
    {
      PermissionPart localPermissionPart = (PermissionPart)paramView.next();
      if (localPermissionPart != paramAdapterView)
      {
        localPermissionPart.b(false);
        localPermissionPart.a(false);
      }
    }
    notifyDataSetChanged();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.biz.qqstory.takevideo.permission.PermissionListAdapter
 * JD-Core Version:    0.7.0.1
 */
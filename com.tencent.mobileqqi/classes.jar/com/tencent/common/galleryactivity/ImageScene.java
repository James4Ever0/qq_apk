package com.tencent.common.galleryactivity;

import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

public abstract class ImageScene
{
  ViewGroup a;
  public GalleryManager a;
  
  public ViewGroup a()
  {
    return this.jdField_a_of_type_AndroidViewViewGroup;
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public abstract void a(ViewGroup paramViewGroup);
  
  void a(GalleryManager paramGalleryManager)
  {
    this.jdField_a_of_type_ComTencentCommonGalleryactivityGalleryManager = paramGalleryManager;
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2) {}
  
  public boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }
  
  public boolean a(Menu paramMenu)
  {
    return true;
  }
  
  public boolean a(MenuItem paramMenuItem)
  {
    return true;
  }
  
  public void b(ViewGroup paramViewGroup)
  {
    this.jdField_a_of_type_AndroidViewViewGroup = paramViewGroup;
  }
  
  public void b(boolean paramBoolean1, boolean paramBoolean2) {}
  
  public abstract boolean c();
  
  public boolean d()
  {
    return false;
  }
  
  public void f() {}
  
  public void g() {}
  
  public void j() {}
  
  public void k() {}
  
  public void n()
  {
    if (this.jdField_a_of_type_ComTencentCommonGalleryactivityGalleryManager != null) {
      this.jdField_a_of_type_ComTencentCommonGalleryactivityGalleryManager.a();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     com.tencent.common.galleryactivity.ImageScene
 * JD-Core Version:    0.7.0.1
 */
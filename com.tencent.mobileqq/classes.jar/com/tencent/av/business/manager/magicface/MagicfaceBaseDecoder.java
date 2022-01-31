package com.tencent.av.business.manager.magicface;

import android.os.Handler;
import android.os.Looper;
import com.tencent.qphone.base.util.QLog;
import java.lang.ref.WeakReference;
import jhv;
import jhw;
import jhx;
import jhy;
import jhz;

public abstract class MagicfaceBaseDecoder
{
  Handler jdField_a_of_type_AndroidOsHandler = new Handler(Looper.getMainLooper());
  public MagicfaceData a;
  String jdField_a_of_type_JavaLangString;
  public WeakReference a;
  public volatile boolean a;
  WeakReference b;
  
  public MagicfaceBaseDecoder()
  {
    this.jdField_a_of_type_Boolean = false;
    c();
  }
  
  public abstract int a();
  
  public void a()
  {
    d();
    if (!this.jdField_a_of_type_Boolean) {
      this.jdField_a_of_type_ComTencentAvBusinessManagerMagicfaceMagicfaceData.a();
    }
    try
    {
      new Thread(new jhv(this)).start();
      return;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (!QLog.isColorLevel()) {}
      QLog.e("MagicfaceBaseDecoder", 1, "startDecoder err:" + localOutOfMemoryError.getMessage());
    }
  }
  
  public void a(MagicfaceBaseDecoder.MagicPlayListener paramMagicPlayListener)
  {
    this.jdField_a_of_type_JavaLangRefWeakReference = new WeakReference(paramMagicPlayListener);
  }
  
  public void a(MagicfaceBaseDecoder.MagicfaceRenderListener paramMagicfaceRenderListener)
  {
    if (paramMagicfaceRenderListener != null)
    {
      this.b = new WeakReference(paramMagicfaceRenderListener);
      return;
    }
    this.b = null;
  }
  
  public void a(MagicfaceData paramMagicfaceData)
  {
    this.jdField_a_of_type_ComTencentAvBusinessManagerMagicfaceMagicfaceData = paramMagicfaceData;
  }
  
  public void a(String paramString)
  {
    this.jdField_a_of_type_JavaLangString = paramString;
  }
  
  public void a(String paramString, int paramInt)
  {
    if (this.jdField_a_of_type_JavaLangRefWeakReference != null) {
      this.jdField_a_of_type_AndroidOsHandler.post(new jhx(this, paramString, paramInt));
    }
  }
  
  protected void a(String paramString, boolean paramBoolean)
  {
    if (this.jdField_a_of_type_JavaLangRefWeakReference != null) {
      this.jdField_a_of_type_AndroidOsHandler.post(new jhy(this, paramString, paramBoolean));
    }
  }
  
  public void b()
  {
    this.jdField_a_of_type_Boolean = false;
    this.jdField_a_of_type_ComTencentAvBusinessManagerMagicfaceMagicfaceData.b();
  }
  
  public void b(String paramString)
  {
    if (this.jdField_a_of_type_JavaLangRefWeakReference != null) {
      this.jdField_a_of_type_AndroidOsHandler.post(new jhw(this, paramString));
    }
  }
  
  protected void c() {}
  
  protected void c(String paramString)
  {
    if (this.jdField_a_of_type_JavaLangRefWeakReference != null) {
      this.jdField_a_of_type_AndroidOsHandler.post(new jhz(this, paramString));
    }
  }
  
  protected void d() {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     com.tencent.av.business.manager.magicface.MagicfaceBaseDecoder
 * JD-Core Version:    0.7.0.1
 */
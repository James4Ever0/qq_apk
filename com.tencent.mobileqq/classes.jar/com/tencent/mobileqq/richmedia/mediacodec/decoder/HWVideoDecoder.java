package com.tencent.mobileqq.richmedia.mediacodec.decoder;

import ahsu;
import android.annotation.TargetApi;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.view.Surface;
import com.tencent.biz.qqstory.support.logging.SLog;
import com.tencent.mobileqq.app.ThreadManager;

@TargetApi(16)
public class HWVideoDecoder
  implements IVideoDecoder
{
  private ahsu jdField_a_of_type_Ahsu;
  private DecodeOutputSurface jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecDecoderDecodeOutputSurface;
  private Thread jdField_a_of_type_JavaLangThread;
  
  private void a(DecodeConfig paramDecodeConfig, Surface paramSurface, HWDecodeListener paramHWDecodeListener)
  {
    if ((paramDecodeConfig == null) || (paramSurface == null)) {
      throw new IllegalArgumentException("both decodeConfig and surface should not be null");
    }
    SLog.b("HWVideoDecoder", "startDecode config = %s", paramDecodeConfig);
    Thread localThread;
    if (this.jdField_a_of_type_JavaLangThread != null)
    {
      localThread = this.jdField_a_of_type_JavaLangThread;
      a();
    }
    try
    {
      localThread.join();
      this.jdField_a_of_type_Ahsu = new ahsu(paramDecodeConfig.a, paramSurface, paramHWDecodeListener);
      this.jdField_a_of_type_Ahsu.a(paramDecodeConfig);
      this.jdField_a_of_type_JavaLangThread = ThreadManager.newFreeThread(this.jdField_a_of_type_Ahsu, "HWVideoDecoder-Thread", 8);
      this.jdField_a_of_type_JavaLangThread.start();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        localInterruptedException.printStackTrace();
      }
    }
  }
  
  public void a()
  {
    if (this.jdField_a_of_type_JavaLangThread != null) {
      this.jdField_a_of_type_JavaLangThread.interrupt();
    }
    this.jdField_a_of_type_JavaLangThread = null;
    this.jdField_a_of_type_Ahsu = null;
  }
  
  public void a(int paramInt)
  {
    ahsu localahsu = this.jdField_a_of_type_Ahsu;
    if (localahsu != null)
    {
      localahsu.a(paramInt);
      SLog.a("HWVideoDecoder", "setSpeedType %d", Integer.valueOf(paramInt));
      return;
    }
    SLog.d("HWVideoDecoder", "setSpeedType %d failed, can not find DecodeRunnable", new Object[] { Integer.valueOf(paramInt) });
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    ahsu localahsu = this.jdField_a_of_type_Ahsu;
    if (localahsu != null)
    {
      SLog.a("HWVideoDecoder", "setPlayRange [%d ms, %d ms]", Long.valueOf(paramLong1), Long.valueOf(paramLong2));
      localahsu.a(paramLong1, paramLong2);
      return;
    }
    SLog.d("HWVideoDecoder", "setPlayRange failed, can not find DecodeRunnable");
  }
  
  public void a(DecodeConfig paramDecodeConfig, int paramInt, SurfaceTexture.OnFrameAvailableListener paramOnFrameAvailableListener, HWDecodeListener paramHWDecodeListener)
  {
    this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecDecoderDecodeOutputSurface = new DecodeOutputSurface(paramInt, paramOnFrameAvailableListener);
    a(paramDecodeConfig, this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecDecoderDecodeOutputSurface.a, paramHWDecodeListener);
  }
  
  public void b()
  {
    ahsu localahsu = this.jdField_a_of_type_Ahsu;
    if (localahsu != null)
    {
      ahsu.a(localahsu, true);
      SLog.b("HWVideoDecoder", "pauseDecode");
      return;
    }
    SLog.d("HWVideoDecoder", "pauseDecode failed, can not find DecodeRunnable");
  }
  
  public void c()
  {
    ahsu localahsu = this.jdField_a_of_type_Ahsu;
    if (localahsu != null)
    {
      ahsu.a(localahsu, false);
      synchronized (ahsu.a(localahsu))
      {
        ahsu.a(localahsu).notifyAll();
        SLog.b("HWVideoDecoder", "resumeDecode");
        return;
      }
    }
    SLog.d("HWVideoDecoder", "resumeDecode failed, can not find DecodeRunnable");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     com.tencent.mobileqq.richmedia.mediacodec.decoder.HWVideoDecoder
 * JD-Core Version:    0.7.0.1
 */
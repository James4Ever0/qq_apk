package dov.com.tencent.mobileqq.richmedia.mediacodec;

import android.annotation.TargetApi;
import anxa;
import com.tencent.biz.qqstory.support.logging.SLog;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.qphone.base.util.QLog;

@TargetApi(16)
public class AudioDecoder
{
  private anxa jdField_a_of_type_Anxa;
  public AudioDecoder.AudioDecodeConfig a;
  private Thread jdField_a_of_type_JavaLangThread;
  
  public void a()
  {
    if (this.jdField_a_of_type_Anxa != null)
    {
      this.jdField_a_of_type_Anxa.a();
      QLog.d("AudioDecoder", 4, "repeat");
    }
  }
  
  public void a(int paramInt)
  {
    if (this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig != null)
    {
      this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig.jdField_a_of_type_Int = paramInt;
      QLog.d("AudioDecoder", 4, "setSpeedType:" + paramInt);
    }
  }
  
  public void a(long paramLong)
  {
    if (this.jdField_a_of_type_Anxa != null)
    {
      this.jdField_a_of_type_Anxa.a(paramLong, this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig.c);
      QLog.d("AudioDecoder", 1, "seekTo: " + paramLong);
      return;
    }
    QLog.d("AudioDecoder", 4, "seekTo failed: " + paramLong);
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    if (this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig == null)
    {
      QLog.w("AudioDecoder", 4, "you must start play first");
      return;
    }
    if ((paramLong1 == this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig.jdField_a_of_type_Long) && (paramLong2 == this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig.jdField_b_of_type_Long))
    {
      SLog.d("AudioDecoder", "segment not changed, setPlayRange ignore, startTimeMs=%d, endTimeMs=%d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
      return;
    }
    QLog.d("AudioDecoder", 4, "setPlayRange begin startTimeMs=" + paramLong1 + " endTimeMs=" + paramLong2);
    this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig.jdField_a_of_type_Long = paramLong1;
    this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig.jdField_b_of_type_Long = paramLong2;
    a(this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig);
  }
  
  public void a(AudioDecoder.AudioDecodeConfig paramAudioDecodeConfig)
  {
    for (;;)
    {
      float f2;
      float f3;
      float f1;
      try
      {
        QLog.d("AudioDecoder", 4, "startPlay " + paramAudioDecodeConfig.toString());
        c();
        b();
        if (this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig == null) {
          this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig = new AudioDecoder.AudioDecodeConfig();
        }
        this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig.a(paramAudioDecodeConfig);
        if (this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig.jdField_b_of_type_Long == 0L) {
          this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig.jdField_b_of_type_Long = this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig.c;
        }
        f2 = (float)this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig.jdField_a_of_type_Long / (float)this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig.c;
        f3 = (float)this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig.jdField_b_of_type_Long / (float)this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig.c;
        f1 = f2;
        if (f2 >= 0.0F) {
          break label184;
        }
        f1 = 0.0F;
      }
      finally {}
      this.jdField_a_of_type_Anxa = new anxa(this, f1, f2);
      this.jdField_a_of_type_JavaLangThread = ThreadManager.newFreeThread(this.jdField_a_of_type_Anxa, "AudioPlay", 8);
      this.jdField_a_of_type_JavaLangThread.start();
      return;
      label184:
      if (f3 != 0.0F)
      {
        f2 = f3;
        if (f3 <= 1.0F) {}
      }
      else
      {
        f2 = 1.0F;
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig == null) {
      return;
    }
    QLog.d("AudioDecoder", 1, "setMuteAudio: " + paramBoolean);
    this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecAudioDecoder$AudioDecodeConfig.jdField_b_of_type_Boolean = paramBoolean;
  }
  
  public void b()
  {
    if (this.jdField_a_of_type_JavaLangThread != null)
    {
      this.jdField_a_of_type_JavaLangThread.interrupt();
      this.jdField_a_of_type_JavaLangThread = null;
      this.jdField_a_of_type_Anxa.a = true;
      QLog.d("AudioDecoder", 4, "stopAudio");
    }
  }
  
  public void c()
  {
    if (this.jdField_a_of_type_Anxa != null)
    {
      this.jdField_a_of_type_Anxa.b();
      QLog.d("AudioDecoder", 4, "pausePlay");
    }
  }
  
  public void d()
  {
    if (this.jdField_a_of_type_Anxa != null)
    {
      this.jdField_a_of_type_Anxa.c();
      QLog.d("AudioDecoder", 4, "resumePlay");
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     dov.com.tencent.mobileqq.richmedia.mediacodec.AudioDecoder
 * JD-Core Version:    0.7.0.1
 */
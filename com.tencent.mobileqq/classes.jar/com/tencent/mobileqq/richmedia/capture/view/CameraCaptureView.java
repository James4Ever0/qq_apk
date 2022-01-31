package com.tencent.mobileqq.richmedia.capture.view;

import ahpu;
import ahpv;
import ahpw;
import ahpx;
import ahpy;
import ahpz;
import ahqa;
import ahqb;
import ahqc;
import ahqd;
import ahqe;
import ahqf;
import ahqg;
import ahqh;
import ahqi;
import ahqj;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.hardware.Camera;
import android.hardware.Camera.FaceDetectionListener;
import android.hardware.Camera.PreviewCallback;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.EGLContextFactory;
import android.opengl.GLSurfaceView.Renderer;
import android.os.Handler;
import android.os.SystemClock;
import android.provider.Settings.System;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.OrientationEventListener;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.mobileqq.activity.richmedia.NewFlowCameraOperator;
import com.tencent.mobileqq.activity.richmedia.subtitles.AudioTranslator;
import com.tencent.mobileqq.activity.richmedia.view.CameraCover.PictureCallback;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.app.ThreadManagerV2;
import com.tencent.mobileqq.camera.utils.CameraUtils;
import com.tencent.mobileqq.qmcf.QmcfManager;
import com.tencent.mobileqq.richmedia.capture.audio.AudioCapture;
import com.tencent.mobileqq.richmedia.capture.audio.AudioCapture.AudioCaptureListener;
import com.tencent.mobileqq.richmedia.capture.util.CameraHelper;
import com.tencent.mobileqq.richmedia.capture.util.CaptureReportUtil;
import com.tencent.mobileqq.richmedia.capture.util.CaptureUtil;
import com.tencent.mobileqq.richmedia.capture.util.DarkModeChecker;
import com.tencent.mobileqq.richmedia.capture.util.DarkModeChecker.DarkModeListener;
import com.tencent.mobileqq.richmedia.capture.util.ReportUtil;
import com.tencent.mobileqq.richmedia.mediacodec.encoder.EglHandlerThread;
import com.tencent.mobileqq.richmedia.mediacodec.encoder.EncodeConfig;
import com.tencent.mobileqq.richmedia.mediacodec.recorder.HWEncodeListener;
import com.tencent.mobileqq.richmedia.mediacodec.recorder.HWVideoRecorder;
import com.tencent.mobileqq.richmedia.mediacodec.renderer.GPUBaseFilter;
import com.tencent.mobileqq.richmedia.mediacodec.renderer.RenderBuffer;
import com.tencent.mobileqq.richmedia.mediacodec.renderer.TextureRender;
import com.tencent.mobileqq.richmedia.mediacodec.utils.GlUtil;
import com.tencent.mobileqq.shortvideo.common.Observer;
import com.tencent.mobileqq.shortvideo.filter.QQLowLightFilter;
import com.tencent.mobileqq.shortvideo.mediadevice.CameraAbility;
import com.tencent.mobileqq.shortvideo.mediadevice.CameraCompatibleList;
import com.tencent.mobileqq.shortvideo.mediadevice.CameraControl;
import com.tencent.mobileqq.shortvideo.mediadevice.CameraControl.CustomSize;
import com.tencent.mobileqq.shortvideo.mediadevice.CameraExceptionHandler;
import com.tencent.mobileqq.shortvideo.mediadevice.CameraExceptionHandler.Callback;
import com.tencent.mobileqq.shortvideo.mediadevice.CameraProxy;
import com.tencent.mobileqq.shortvideo.mediadevice.CodecParam;
import com.tencent.mobileqq.utils.FileUtils;
import com.tencent.qphone.base.util.QLog;
import dov.com.tencent.mobileqq.activity.richmedia.NewFlowCameraReporter;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import mqq.os.MqqHandler;

@TargetApi(18)
public class CameraCaptureView
  extends GLSurfaceView
  implements SurfaceTexture.OnFrameAvailableListener, Camera.PreviewCallback, GLSurfaceView.Renderer, CameraCover.PictureCallback, AudioCapture.AudioCaptureListener, HWEncodeListener, Observer, CameraExceptionHandler.Callback
{
  private static int B;
  private static Camera.FaceDetectionListener jdField_a_of_type_AndroidHardwareCamera$FaceDetectionListener = new ahqc();
  private static final CameraProxy jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy = new CameraProxy(null, null);
  private int A;
  protected int a;
  private long jdField_a_of_type_Long;
  public SurfaceTexture a;
  private GLSurfaceView.EGLContextFactory jdField_a_of_type_AndroidOpenglGLSurfaceView$EGLContextFactory = new ahpu(this);
  private Handler jdField_a_of_type_AndroidOsHandler;
  protected OrientationEventListener a;
  private View jdField_a_of_type_AndroidViewView;
  protected NewFlowCameraOperator a;
  protected AudioCapture a;
  private DarkModeChecker.DarkModeListener jdField_a_of_type_ComTencentMobileqqRichmediaCaptureUtilDarkModeChecker$DarkModeListener;
  private DarkModeChecker jdField_a_of_type_ComTencentMobileqqRichmediaCaptureUtilDarkModeChecker;
  protected CameraCaptureView.CaptureListener a;
  protected CameraCaptureView.CaptureParam a;
  private CameraCaptureView.VideoCaptureResult jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$VideoCaptureResult;
  protected EglHandlerThread a;
  protected EncodeConfig a;
  private HWVideoRecorder jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRecorderHWVideoRecorder;
  protected TextureRender a;
  private CameraExceptionHandler jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraExceptionHandler;
  public Map a;
  protected boolean a;
  protected final float[] a;
  public int b;
  private long b;
  protected boolean b;
  public int c;
  private long c;
  public volatile boolean c;
  protected int d;
  boolean d;
  protected int e;
  protected boolean e;
  public int f;
  protected boolean f;
  public int g;
  public boolean g;
  public int h;
  protected boolean h;
  public int i;
  private boolean i;
  protected int j;
  private boolean j;
  protected int k;
  private boolean k;
  protected int l;
  private boolean l;
  protected int m;
  private volatile boolean m;
  public int n;
  private boolean n;
  public int o;
  private boolean o;
  protected int p;
  private boolean p;
  protected int q;
  private boolean q;
  protected int r;
  private boolean r;
  public int s;
  private boolean s;
  public int t;
  private boolean t;
  public int u;
  public int v = 90;
  private int w;
  private int x;
  private int y;
  private int z;
  
  public CameraCaptureView(@NonNull Context paramContext)
  {
    super(paramContext);
    this.jdField_a_of_type_Int = 2;
    this.jdField_a_of_type_ArrayOfFloat = new float[16];
    this.jdField_a_of_type_JavaUtilMap = new HashMap();
    this.jdField_r_of_type_Boolean = true;
    this.jdField_t_of_type_Int = 90;
    this.jdField_d_of_type_Boolean = true;
    this.jdField_g_of_type_Boolean = true;
    this.jdField_c_of_type_Long = System.currentTimeMillis();
    setEGLContextFactory(this.jdField_a_of_type_AndroidOpenglGLSurfaceView$EGLContextFactory);
  }
  
  public CameraCaptureView(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.jdField_a_of_type_Int = 2;
    this.jdField_a_of_type_ArrayOfFloat = new float[16];
    this.jdField_a_of_type_JavaUtilMap = new HashMap();
    this.jdField_r_of_type_Boolean = true;
    this.jdField_t_of_type_Int = 90;
    this.jdField_d_of_type_Boolean = true;
    this.jdField_g_of_type_Boolean = true;
    this.jdField_c_of_type_Long = System.currentTimeMillis();
    setEGLContextFactory(this.jdField_a_of_type_AndroidOpenglGLSurfaceView$EGLContextFactory);
  }
  
  private int a(boolean paramBoolean)
  {
    int i1 = this.jdField_r_of_type_Int;
    if (paramBoolean) {
      paramBoolean = c();
    }
    int i3;
    int i2;
    for (;;)
    {
      if (!this.jdField_f_of_type_Boolean) {
        break label561;
      }
      if (paramBoolean)
      {
        Object localObject1 = (RenderBuffer)this.jdField_a_of_type_JavaUtilMap.get(CameraCaptureView.CaptureParam.e);
        if (localObject1 != null) {
          ((RenderBuffer)localObject1).b();
        }
        synchronized (this.jdField_a_of_type_AndroidGraphicsSurfaceTexture)
        {
          this.jdField_a_of_type_AndroidGraphicsSurfaceTexture.getTransformMatrix(this.jdField_a_of_type_ArrayOfFloat);
          this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererTextureRender.a(36197, this.jdField_r_of_type_Int, this.jdField_a_of_type_ArrayOfFloat, null);
          QmcfManager.a().a(this.jdField_a_of_type_ArrayOfFloat);
          QmcfManager.a().a(false);
          i1 = ((RenderBuffer)localObject1).a();
          ((RenderBuffer)localObject1).c();
          ??? = (RenderBuffer)this.jdField_a_of_type_JavaUtilMap.get(CameraCaptureView.CaptureParam.f);
          i3 = i1;
          if (??? != null)
          {
            i3 = i1;
            if (localObject1 != null)
            {
              if (((RenderBuffer)localObject1).b() == ((RenderBuffer)???).b())
              {
                i2 = i1;
                if (((RenderBuffer)localObject1).c() == ((RenderBuffer)???).c()) {}
              }
              else
              {
                ((RenderBuffer)???).b();
                localObject1 = GPUBaseFilter.a(((RenderBuffer)localObject1).b(), ((RenderBuffer)localObject1).c(), ((RenderBuffer)???).b(), ((RenderBuffer)???).c());
                this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererTextureRender.a(3553, i1, null, (float[])localObject1);
                i2 = ((RenderBuffer)???).a();
                ((RenderBuffer)???).c();
              }
              if (this.jdField_n_of_type_Int == ((RenderBuffer)???).b())
              {
                i3 = i2;
                if (this.jdField_o_of_type_Int == ((RenderBuffer)???).c()) {}
              }
              else
              {
                d(true);
                i3 = i2;
              }
            }
          }
          return i3;
          if (this.jdField_f_of_type_Boolean) {
            paramBoolean = d();
          } else {
            paramBoolean = false;
          }
        }
      }
    }
    Object localObject3 = (RenderBuffer)this.jdField_a_of_type_JavaUtilMap.get(CameraCaptureView.CaptureParam.c);
    if (localObject3 != null) {
      ((RenderBuffer)localObject3).b();
    }
    synchronized (this.jdField_a_of_type_AndroidGraphicsSurfaceTexture)
    {
      this.jdField_a_of_type_AndroidGraphicsSurfaceTexture.getTransformMatrix(this.jdField_a_of_type_ArrayOfFloat);
      this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererTextureRender.a(36197, this.jdField_r_of_type_Int, this.jdField_a_of_type_ArrayOfFloat, null);
      QmcfManager.a().a(this.jdField_a_of_type_ArrayOfFloat);
      QmcfManager.a().a(false);
      i1 = ((RenderBuffer)localObject3).a();
      ((RenderBuffer)localObject3).c();
      ??? = (RenderBuffer)this.jdField_a_of_type_JavaUtilMap.get(CameraCaptureView.CaptureParam.d);
      i3 = i1;
      if (??? != null)
      {
        i3 = i1;
        if (localObject3 != null)
        {
          if (((RenderBuffer)localObject3).b() == ((RenderBuffer)???).b())
          {
            i2 = i1;
            if (((RenderBuffer)localObject3).c() == ((RenderBuffer)???).c()) {}
          }
          else
          {
            ((RenderBuffer)???).b();
            localObject3 = GPUBaseFilter.a(((RenderBuffer)localObject3).b(), ((RenderBuffer)localObject3).c(), ((RenderBuffer)???).b(), ((RenderBuffer)???).c());
            this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererTextureRender.a(3553, i1, null, (float[])localObject3);
            i2 = ((RenderBuffer)???).a();
            ((RenderBuffer)???).c();
          }
          if (this.jdField_n_of_type_Int == ((RenderBuffer)???).b())
          {
            i3 = i2;
            if (this.jdField_o_of_type_Int == ((RenderBuffer)???).c()) {}
          }
          else
          {
            d(false);
            i3 = i2;
          }
        }
      }
      return i3;
    }
    label561:
    ??? = (RenderBuffer)this.jdField_a_of_type_JavaUtilMap.get(CameraCaptureView.CaptureParam.jdField_b_of_type_JavaLangString);
    if (??? != null)
    {
      ((RenderBuffer)???).b();
      synchronized (this.jdField_a_of_type_AndroidGraphicsSurfaceTexture)
      {
        this.jdField_a_of_type_AndroidGraphicsSurfaceTexture.getTransformMatrix(this.jdField_a_of_type_ArrayOfFloat);
        float[] arrayOfFloat = GPUBaseFilter.a(this.jdField_d_of_type_Int, this.jdField_e_of_type_Int, ((RenderBuffer)???).b(), ((RenderBuffer)???).c());
        this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererTextureRender.a(36197, this.jdField_r_of_type_Int, this.jdField_a_of_type_ArrayOfFloat, arrayOfFloat);
        QmcfManager.a().a(this.jdField_a_of_type_ArrayOfFloat);
        ((RenderBuffer)???).c();
        return ((RenderBuffer)???).a();
      }
    }
    return i1;
  }
  
  private void a(CameraCaptureView.VideoCaptureResult paramVideoCaptureResult)
  {
    int i1 = 1;
    if (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener != null) {
      this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener.a(paramVideoCaptureResult);
    }
    this.jdField_a_of_type_AndroidOsHandler.post(new ahpx(this));
    ReportUtil.c();
    if (CameraControl.a().jdField_a_of_type_Int == 1) {}
    for (;;)
    {
      CaptureReportUtil.i(i1);
      return;
      i1 = 2;
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (this.jdField_a_of_type_Int == 1)
    {
      e(paramBoolean);
      return;
    }
    jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.c(paramBoolean);
  }
  
  private void c()
  {
    this.jdField_a_of_type_Int = CameraCaptureView.CaptureParam.a(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam);
    if (!CameraAbility.c()) {
      this.jdField_a_of_type_Int = 2;
    }
    setEGLContextClientVersion(2);
    this.jdField_a_of_type_AndroidOsHandler = new Handler();
    this.jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraExceptionHandler = new CameraExceptionHandler(this.jdField_a_of_type_AndroidOsHandler, this);
    jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.a(this.jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraExceptionHandler);
    jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.a(jdField_a_of_type_AndroidHardwareCamera$FaceDetectionListener);
    setRenderer(this);
    setRenderMode(0);
    this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRecorderHWVideoRecorder = new HWVideoRecorder();
    if (CameraCaptureView.CaptureParam.a(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam)) {
      this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureAudioAudioCapture = new AudioCapture(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam.jdField_a_of_type_JavaLangString, 1, CodecParam.jdField_q_of_type_Int, CodecParam.jdField_o_of_type_Int, CodecParam.jdField_p_of_type_Int, this, jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.a());
    }
    this.jdField_a_of_type_ComTencentMobileqqActivityRichmediaNewFlowCameraOperator = new NewFlowCameraOperator();
    this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureUtilDarkModeChecker = new DarkModeChecker();
    QmcfManager.a().a(this.jdField_a_of_type_Int);
    this.jdField_i_of_type_Boolean = true;
  }
  
  private void e(boolean paramBoolean)
  {
    Activity localActivity = (Activity)getContext();
    if (paramBoolean)
    {
      if (this.jdField_a_of_type_AndroidViewView == null) {
        this.jdField_a_of_type_AndroidViewView = new View(localActivity);
      }
      this.jdField_a_of_type_AndroidViewView.setBackgroundColor(-1);
      this.jdField_a_of_type_AndroidViewView.setAlpha(0.7F);
      if (this.jdField_a_of_type_AndroidViewView.getParent() != null) {
        ((ViewGroup)this.jdField_a_of_type_AndroidViewView.getParent()).removeView(this.jdField_a_of_type_AndroidViewView);
      }
      localActivity.addContentView(this.jdField_a_of_type_AndroidViewView, new ViewGroup.LayoutParams(-1, -1));
    }
    do
    {
      do
      {
        try
        {
          this.z = Settings.System.getInt(localActivity.getContentResolver(), "screen_brightness_mode");
          Settings.System.putInt(localActivity.getContentResolver(), "screen_brightness_mode", 0);
          this.A = Settings.System.getInt(localActivity.getContentResolver(), "screen_brightness");
          Settings.System.putInt(localActivity.getContentResolver(), "screen_brightness", 255);
          this.jdField_q_of_type_Boolean = true;
          return;
        }
        catch (Exception localException)
        {
          do
          {
            this.z = 1;
            this.A = 100;
          } while (!QLog.isColorLevel());
          QLog.e("CameraCaptureView", 2, "turn FrontFlash Error ", localException);
          localException.printStackTrace();
          return;
        }
        if (this.jdField_a_of_type_Int == 2)
        {
          jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.c(false);
          return;
        }
      } while (this.jdField_a_of_type_Int != 1);
      if (this.jdField_q_of_type_Boolean)
      {
        Settings.System.putInt(localException.getContentResolver(), "screen_brightness", this.A);
        Settings.System.putInt(localException.getContentResolver(), "screen_brightness_mode", this.z);
        this.jdField_q_of_type_Boolean = false;
      }
    } while ((this.jdField_a_of_type_AndroidViewView == null) || (this.jdField_a_of_type_AndroidViewView.getParent() == null));
    ((ViewGroup)this.jdField_a_of_type_AndroidViewView.getParent()).removeView(this.jdField_a_of_type_AndroidViewView);
  }
  
  private void f()
  {
    if (!this.jdField_i_of_type_Boolean) {
      throw new RuntimeException("Not inited. Must be called after setCaptureParam");
    }
  }
  
  private void q()
  {
    boolean bool = true;
    if (!this.jdField_i_of_type_Boolean) {}
    while (this.jdField_j_of_type_Boolean) {
      return;
    }
    if (QLog.isColorLevel()) {
      QLog.d("CameraCaptureView", 2, "startCamera");
    }
    jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.a(this);
    this.jdField_k_of_type_Boolean = false;
    this.w = 0;
    this.x = 0;
    jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.a(jdField_a_of_type_AndroidHardwareCamera$FaceDetectionListener);
    jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.a(this.jdField_a_of_type_Int);
    this.jdField_j_of_type_Boolean = true;
    if ((CameraCaptureView.CaptureParam.a(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam)) && (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureAudioAudioCapture != null)) {
      this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureAudioAudioCapture.e();
    }
    NewFlowCameraOperator localNewFlowCameraOperator = this.jdField_a_of_type_ComTencentMobileqqActivityRichmediaNewFlowCameraOperator;
    if (this.jdField_a_of_type_Int == 1) {}
    for (;;)
    {
      localNewFlowCameraOperator.a(bool);
      CameraHelper.a(this.jdField_a_of_type_Int);
      com.tencent.mobileqq.activity.richmedia.FlowCameraConstant.jdField_a_of_type_Int = this.jdField_a_of_type_Int;
      return;
      bool = false;
    }
  }
  
  private void r()
  {
    if (!this.jdField_i_of_type_Boolean) {}
    while ((!this.jdField_n_of_type_Boolean) || (!this.jdField_j_of_type_Boolean) || ((this.jdField_k_of_type_Boolean) && (this.w == this.jdField_b_of_type_Int) && (this.x == this.jdField_c_of_type_Int))) {
      return;
    }
    if (QLog.isColorLevel()) {
      QLog.d("CameraCaptureView", 2, "startCameraPreview");
    }
    if (this.jdField_f_of_type_Boolean) {
      jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.a(new CameraControl.CustomSize(CameraCaptureView.CaptureParam.b(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam), CameraCaptureView.CaptureParam.c(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam)), new CameraControl.CustomSize(this.jdField_b_of_type_Int, this.jdField_c_of_type_Int), 0, 30, this.jdField_f_of_type_Boolean);
    }
    for (;;)
    {
      jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.a(this.jdField_a_of_type_AndroidGraphicsSurfaceTexture, this, true);
      this.jdField_k_of_type_Boolean = true;
      this.w = this.jdField_b_of_type_Int;
      this.x = this.jdField_c_of_type_Int;
      return;
      jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.a(new CameraControl.CustomSize(CameraCaptureView.CaptureParam.d(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam), CameraCaptureView.CaptureParam.e(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam)), new CameraControl.CustomSize(this.jdField_b_of_type_Int, this.jdField_c_of_type_Int), 0, 30, this.jdField_f_of_type_Boolean);
    }
  }
  
  public int a()
  {
    return this.jdField_a_of_type_Int;
  }
  
  protected int a(int paramInt)
  {
    return paramInt;
  }
  
  public MediaFormat a()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRecorderHWVideoRecorder != null) {
      return this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRecorderHWVideoRecorder.a();
    }
    return null;
  }
  
  public String a()
  {
    return this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam.jdField_a_of_type_JavaLangString;
  }
  
  public void a()
  {
    this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$VideoCaptureResult.videoFrameCount = 0;
    if ((CameraCaptureView.CaptureParam.a(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam)) && (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureAudioAudioCapture != null)) {
      this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureAudioAudioCapture.a();
    }
    if (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener != null) {
      this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener.al_();
    }
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    f();
    Rect localRect1 = this.jdField_a_of_type_ComTencentMobileqqActivityRichmediaNewFlowCameraOperator.a(paramFloat1, paramFloat2, this.jdField_b_of_type_Int, this.jdField_c_of_type_Int, 1.0F);
    Rect localRect2 = this.jdField_a_of_type_ComTencentMobileqqActivityRichmediaNewFlowCameraOperator.a(paramFloat1, paramFloat2, this.jdField_b_of_type_Int, this.jdField_c_of_type_Int, 1.5F);
    if (QLog.isColorLevel()) {
      QLog.i("CameraCaptureView", 2, "requestCameraFocus:" + paramFloat1 + " " + paramFloat2 + " " + localRect1 + " " + localRect2);
    }
    jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.a(localRect1, localRect2, new ahqf(this));
  }
  
  /* Error */
  protected void a(int paramInt1, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 116	com/tencent/mobileqq/richmedia/capture/view/CameraCaptureView:jdField_t_of_type_Int	I
    //   4: sipush 360
    //   7: iadd
    //   8: bipush 90
    //   10: isub
    //   11: sipush 360
    //   14: irem
    //   15: istore 4
    //   17: invokestatic 412	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   20: ifeq +51 -> 71
    //   23: ldc_w 414
    //   26: iconst_2
    //   27: new 505	java/lang/StringBuilder
    //   30: dup
    //   31: invokespecial 506	java/lang/StringBuilder:<init>	()V
    //   34: ldc_w 538
    //   37: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: iload_2
    //   41: invokevirtual 541	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   44: ldc_w 543
    //   47: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: iload_3
    //   51: invokevirtual 541	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   54: ldc_w 545
    //   57: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: iload 4
    //   62: invokevirtual 541	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   65: invokevirtual 523	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   68: invokestatic 436	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   71: new 160	com/tencent/mobileqq/richmedia/mediacodec/renderer/RenderBuffer
    //   74: dup
    //   75: iload_2
    //   76: iload_3
    //   77: ldc_w 546
    //   80: invokespecial 548	com/tencent/mobileqq/richmedia/mediacodec/renderer/RenderBuffer:<init>	(III)V
    //   83: astore 6
    //   85: aload 6
    //   87: invokevirtual 162	com/tencent/mobileqq/richmedia/mediacodec/renderer/RenderBuffer:b	()V
    //   90: aload_0
    //   91: getfield 172	com/tencent/mobileqq/richmedia/capture/view/CameraCaptureView:jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererTextureRender	Lcom/tencent/mobileqq/richmedia/mediacodec/renderer/TextureRender;
    //   94: sipush 3553
    //   97: iload_1
    //   98: aconst_null
    //   99: aconst_null
    //   100: invokevirtual 178	com/tencent/mobileqq/richmedia/mediacodec/renderer/TextureRender:a	(II[F[F)V
    //   103: aload 6
    //   105: invokevirtual 193	com/tencent/mobileqq/richmedia/mediacodec/renderer/RenderBuffer:c	()V
    //   108: aload 6
    //   110: invokevirtual 191	com/tencent/mobileqq/richmedia/mediacodec/renderer/RenderBuffer:a	()I
    //   113: iload_2
    //   114: iload_3
    //   115: iload 4
    //   117: ineg
    //   118: invokestatic 553	com/tencent/mobileqq/richmedia/mediacodec/utils/GlUtil:a	(IIII)Landroid/graphics/Bitmap;
    //   121: astore 5
    //   123: aload 6
    //   125: invokevirtual 555	com/tencent/mobileqq/richmedia/mediacodec/renderer/RenderBuffer:d	()V
    //   128: new 505	java/lang/StringBuilder
    //   131: dup
    //   132: invokespecial 506	java/lang/StringBuilder:<init>	()V
    //   135: aload_0
    //   136: getfield 272	com/tencent/mobileqq/richmedia/capture/view/CameraCaptureView:jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam	Lcom/tencent/mobileqq/richmedia/capture/view/CameraCaptureView$CaptureParam;
    //   139: getfield 314	com/tencent/mobileqq/richmedia/capture/view/CameraCaptureView$CaptureParam:jdField_a_of_type_JavaLangString	Ljava/lang/String;
    //   142: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: ldc_w 557
    //   148: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: invokestatic 128	java/lang/System:currentTimeMillis	()J
    //   154: invokevirtual 560	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   157: ldc_w 562
    //   160: invokevirtual 512	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: invokevirtual 523	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   166: astore 6
    //   168: aload 6
    //   170: invokestatic 566	com/tencent/mobileqq/utils/FileUtils:c	(Ljava/lang/String;)V
    //   173: new 568	java/io/File
    //   176: dup
    //   177: aload 6
    //   179: invokespecial 569	java/io/File:<init>	(Ljava/lang/String;)V
    //   182: astore 7
    //   184: aload 5
    //   186: aload 7
    //   188: invokestatic 574	com/tencent/mobileqq/utils/ImageUtil:a	(Landroid/graphics/Bitmap;Ljava/io/File;)Z
    //   191: pop
    //   192: invokestatic 579	com/tencent/common/app/BaseApplicationImpl:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   195: aload 7
    //   197: invokevirtual 582	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   200: invokestatic 585	com/tencent/mobileqq/utils/ImageUtil:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   203: aload_0
    //   204: new 587	com/tencent/mobileqq/richmedia/capture/view/CameraCaptureView$PhotoCaptureResult
    //   207: dup
    //   208: iconst_0
    //   209: iconst_0
    //   210: aload 6
    //   212: aconst_null
    //   213: aload_0
    //   214: getfield 116	com/tencent/mobileqq/richmedia/capture/view/CameraCaptureView:jdField_t_of_type_Int	I
    //   217: invokespecial 590	com/tencent/mobileqq/richmedia/capture/view/CameraCaptureView$PhotoCaptureResult:<init>	(IILjava/lang/String;Landroid/graphics/Bitmap;I)V
    //   220: invokevirtual 593	com/tencent/mobileqq/richmedia/capture/view/CameraCaptureView:b	(Lcom/tencent/mobileqq/richmedia/capture/view/CameraCaptureView$PhotoCaptureResult;)V
    //   223: aload 5
    //   225: invokevirtual 598	android/graphics/Bitmap:recycle	()V
    //   228: getstatic 85	com/tencent/mobileqq/richmedia/capture/view/CameraCaptureView:jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy	Lcom/tencent/mobileqq/shortvideo/mediadevice/CameraProxy;
    //   231: iconst_1
    //   232: invokevirtual 599	com/tencent/mobileqq/shortvideo/mediadevice/CameraProxy:a	(Z)V
    //   235: return
    //   236: astore 5
    //   238: aload_0
    //   239: getfield 226	com/tencent/mobileqq/richmedia/capture/view/CameraCaptureView:jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener	Lcom/tencent/mobileqq/richmedia/capture/view/CameraCaptureView$CaptureListener;
    //   242: ifnull -7 -> 235
    //   245: aload_0
    //   246: getfield 226	com/tencent/mobileqq/richmedia/capture/view/CameraCaptureView:jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener	Lcom/tencent/mobileqq/richmedia/capture/view/CameraCaptureView$CaptureListener;
    //   249: bipush 103
    //   251: invokeinterface 600 2 0
    //   256: return
    //   257: astore 7
    //   259: aload 7
    //   261: invokevirtual 601	java/io/IOException:printStackTrace	()V
    //   264: aload_0
    //   265: new 587	com/tencent/mobileqq/richmedia/capture/view/CameraCaptureView$PhotoCaptureResult
    //   268: dup
    //   269: iconst_0
    //   270: iconst_m1
    //   271: aload 6
    //   273: aconst_null
    //   274: aload_0
    //   275: getfield 116	com/tencent/mobileqq/richmedia/capture/view/CameraCaptureView:jdField_t_of_type_Int	I
    //   278: invokespecial 590	com/tencent/mobileqq/richmedia/capture/view/CameraCaptureView$PhotoCaptureResult:<init>	(IILjava/lang/String;Landroid/graphics/Bitmap;I)V
    //   281: invokevirtual 593	com/tencent/mobileqq/richmedia/capture/view/CameraCaptureView:b	(Lcom/tencent/mobileqq/richmedia/capture/view/CameraCaptureView$PhotoCaptureResult;)V
    //   284: goto -61 -> 223
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	287	0	this	CameraCaptureView
    //   0	287	1	paramInt1	int
    //   0	287	2	paramInt2	int
    //   0	287	3	paramInt3	int
    //   15	101	4	i1	int
    //   121	103	5	localBitmap	android.graphics.Bitmap
    //   236	1	5	localOutOfMemoryError	java.lang.OutOfMemoryError
    //   83	189	6	localObject	Object
    //   182	14	7	localFile	File
    //   257	3	7	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   71	128	236	java/lang/OutOfMemoryError
    //   184	223	257	java/io/IOException
  }
  
  protected void a(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, long paramLong)
  {
    if ((this.jdField_m_of_type_Boolean) && (this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecEncoderEncodeConfig != null))
    {
      switch (this.y)
      {
      default: 
        throw new RuntimeException("unknown status " + this.y);
      case 0: 
        this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecEncoderEncodeConfig.a(EGL14.eglGetCurrentContext());
        this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRecorderHWVideoRecorder.a();
        this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRecorderHWVideoRecorder.a(this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecEncoderEncodeConfig, this);
        this.y = 1;
      }
      this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRecorderHWVideoRecorder.a(paramInt1, paramInt2, paramArrayOfFloat1, paramArrayOfFloat2, paramLong);
      return;
    }
    switch (this.y)
    {
    case 0: 
    default: 
      throw new RuntimeException("unknown status " + this.y);
    }
    this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRecorderHWVideoRecorder.c();
    p();
    this.y = 0;
  }
  
  protected void a(CameraControl.CustomSize paramCustomSize)
  {
    this.jdField_e_of_type_Int = paramCustomSize.jdField_a_of_type_Int;
    this.jdField_d_of_type_Int = paramCustomSize.jdField_b_of_type_Int;
    if (!this.jdField_f_of_type_Boolean)
    {
      paramCustomSize = CaptureUtil.a(this.jdField_d_of_type_Int, this.jdField_e_of_type_Int, this.jdField_b_of_type_Int, this.jdField_c_of_type_Int, 1.0F);
      this.jdField_n_of_type_Int = paramCustomSize[0];
      this.jdField_o_of_type_Int = paramCustomSize[1];
      paramCustomSize = CaptureUtil.a(this.jdField_d_of_type_Int, this.jdField_e_of_type_Int, this.jdField_b_of_type_Int, this.jdField_c_of_type_Int, this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam.jdField_a_of_type_Float);
      this.jdField_p_of_type_Int = paramCustomSize[0];
      this.jdField_q_of_type_Int = paramCustomSize[1];
      paramCustomSize = CaptureUtil.a(CameraCaptureView.CaptureParam.d(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam), this.jdField_p_of_type_Int, this.jdField_q_of_type_Int);
      this.jdField_p_of_type_Int = paramCustomSize[0];
      this.jdField_q_of_type_Int = paramCustomSize[1];
      CameraCaptureView.CaptureParam.jdField_b_of_type_JavaLangString = "key_aio_fbo" + this.jdField_n_of_type_Int + this.jdField_o_of_type_Int;
      queueEvent(new ahqi(this));
      if (QLog.isColorLevel()) {
        QLog.i("CameraCaptureView", 2, "onCameraSizeSelected(): cameraPreviewWidth=" + this.jdField_d_of_type_Int + ",cameraPreviewHeight=" + this.jdField_e_of_type_Int);
      }
    }
    int i1;
    int i2;
    int i3;
    int i4;
    do
    {
      return;
      paramCustomSize = CaptureUtil.a(CameraCaptureView.CaptureParam.d(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam), this.jdField_d_of_type_Int, this.jdField_e_of_type_Int);
      i1 = paramCustomSize[0];
      i2 = paramCustomSize[1];
      CameraCaptureView.CaptureParam.c = "key_riji_h_compress_fbo" + i1 + i2;
      paramCustomSize = CaptureUtil.a(i1, i2, this.jdField_b_of_type_Int, this.jdField_c_of_type_Int, 1.0F);
      this.jdField_f_of_type_Int = paramCustomSize[0];
      this.jdField_g_of_type_Int = paramCustomSize[1];
      CameraCaptureView.CaptureParam.d = "key_riji_h_clip_fbo" + this.jdField_f_of_type_Int + this.jdField_g_of_type_Int;
      this.jdField_j_of_type_Int = this.jdField_f_of_type_Int;
      this.jdField_k_of_type_Int = this.jdField_g_of_type_Int;
      CameraCaptureView.CaptureParam.h(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam);
      paramCustomSize = CaptureUtil.a(CameraCaptureView.CaptureParam.i(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam), this.jdField_d_of_type_Int, this.jdField_e_of_type_Int);
      i3 = paramCustomSize[0];
      i4 = paramCustomSize[1];
      CameraCaptureView.CaptureParam.e = "key_riji_l_compress_fbo" + i3 + i4;
      paramCustomSize = CaptureUtil.a(i3, i4, this.jdField_b_of_type_Int, this.jdField_c_of_type_Int, 1.0F);
      this.jdField_h_of_type_Int = paramCustomSize[0];
      this.jdField_i_of_type_Int = paramCustomSize[1];
      CameraCaptureView.CaptureParam.f = "key_riji_l_clip_fbo" + this.jdField_h_of_type_Int + this.jdField_i_of_type_Int;
      this.jdField_l_of_type_Int = this.jdField_h_of_type_Int;
      this.jdField_m_of_type_Int = this.jdField_i_of_type_Int;
      queueEvent(new ahqj(this, i1, i2, i3, i4));
    } while (!QLog.isColorLevel());
    QLog.i("CameraCaptureView", 2, "onCameraSizeSelected(): cameraPreviewWidth=" + this.jdField_d_of_type_Int + ",cameraPreviewHeight=" + this.jdField_e_of_type_Int + "， highCompressCameraPreviewWidth=" + i1 + ",highCompressCamerareviewHeight=" + i2 + "， highCameraClipWidth=" + this.jdField_f_of_type_Int + ",highCameraClipHeight=" + this.jdField_g_of_type_Int + ", highVideoWidth=" + this.jdField_j_of_type_Int + ",highVideoHeight=" + this.jdField_k_of_type_Int + " ,lowCompressCameraPreviewWidth=" + i3 + ",lowCompressCamerareviewHeight=" + i4 + " ,lowCameraClipWidth=" + this.jdField_h_of_type_Int + " ,lowCameraClipHeight=" + this.jdField_i_of_type_Int + ",lowVideoWidth=" + this.jdField_l_of_type_Int + " ,lowVideoHeight=" + this.jdField_m_of_type_Int);
  }
  
  public void a(Object paramObject, int paramInt, Object... paramVarArgs)
  {
    if (QLog.isColorLevel()) {
      QLog.d("CameraCaptureView", 2, " notify : eventId = " + paramInt + " ; sender = " + paramObject + " ; args = " + Arrays.toString(paramVarArgs));
    }
    switch (paramInt)
    {
    }
    do
    {
      do
      {
        do
        {
          return;
          if (!(paramVarArgs[0] instanceof CameraControl.CustomSize)) {
            break;
          }
          a((CameraControl.CustomSize)paramVarArgs[0]);
        } while (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener == null);
        this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener.a(true, "");
        return;
      } while ((!(paramVarArgs[0] instanceof String)) || (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener == null));
      this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener.a(false, (String)paramVarArgs[0]);
      return;
    } while ((!(paramVarArgs[0] instanceof String)) || (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener == null));
    this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener.a(false, (String)paramVarArgs[0]);
  }
  
  public void a(RuntimeException paramRuntimeException) {}
  
  public void a(String paramString)
  {
    if (QLog.isColorLevel()) {
      QLog.d("CameraCaptureView", 2, "onEncodeFinish filePath = " + paramString);
    }
    this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$VideoCaptureResult.videoMp4FilePath = paramString;
    if ((CameraCaptureView.CaptureParam.a(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam)) && (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureAudioAudioCapture != null)) {
      if (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$VideoCaptureResult.audioDataFilePath != null) {
        a(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$VideoCaptureResult);
      }
    }
    for (;;)
    {
      ThreadManager.postImmediately(new ahpv(this), null, false);
      return;
      this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureAudioAudioCapture.d();
      continue;
      paramString = this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam.jdField_a_of_type_JavaLangString + "/noaudio";
      FileUtils.c(paramString);
      this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$VideoCaptureResult.audioDataFilePath = paramString;
      a(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$VideoCaptureResult);
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2) {}
  
  protected boolean a()
  {
    return CameraUtils.a();
  }
  
  public void a_(int paramInt, Throwable paramThrowable)
  {
    this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$VideoCaptureResult.errorCode = paramInt;
    if (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener != null) {
      this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener.a(104);
    }
  }
  
  public void a_(String paramString)
  {
    b(new CameraCaptureView.PhotoCaptureResult(1, 0, paramString, null, this.jdField_t_of_type_Int));
  }
  
  public void b()
  {
    CameraCaptureView.VideoCaptureResult localVideoCaptureResult = this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$VideoCaptureResult;
    localVideoCaptureResult.videoFrameCount += 1;
  }
  
  public void b(int paramInt)
  {
    QLog.e("CameraCaptureView", 2, "onAudioError. errorCode = " + paramInt);
    switch (paramInt)
    {
    default: 
      return;
    }
    ThreadManager.getUIHandler().post(new ahpy(this));
  }
  
  protected void b(CameraCaptureView.PhotoCaptureResult paramPhotoCaptureResult)
  {
    int i1 = 1;
    if (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener != null) {
      this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener.a(paramPhotoCaptureResult);
    }
    this.jdField_a_of_type_AndroidOsHandler.post(new ahpw(this));
    ReportUtil.b();
    if (CameraControl.a().jdField_a_of_type_Int == 1) {}
    for (;;)
    {
      CaptureReportUtil.g(i1);
      return;
      i1 = 2;
    }
  }
  
  public void b(String paramString)
  {
    if (QLog.isColorLevel()) {
      QLog.d("CameraCaptureView", 2, "onAudioCaptured filePath = " + paramString);
    }
    this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$VideoCaptureResult.audioDataFilePath = paramString;
    if (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$VideoCaptureResult.videoMp4FilePath != null) {
      a(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$VideoCaptureResult);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    f();
    this.jdField_p_of_type_Boolean = paramBoolean;
    jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.d(this.jdField_p_of_type_Boolean);
  }
  
  protected boolean b()
  {
    return this.jdField_m_of_type_Boolean;
  }
  
  public void c(boolean paramBoolean)
  {
    f();
    QQLowLightFilter.a(paramBoolean);
    this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener.a(paramBoolean);
  }
  
  protected boolean c()
  {
    return false;
  }
  
  public void d() {}
  
  public void d(boolean paramBoolean)
  {
    if (this.jdField_f_of_type_Boolean)
    {
      if (!paramBoolean) {
        break label178;
      }
      this.jdField_o_of_type_Int = this.jdField_i_of_type_Int;
      this.jdField_n_of_type_Int = this.jdField_h_of_type_Int;
      if (!this.jdField_e_of_type_Boolean) {
        break label159;
      }
      this.jdField_p_of_type_Int = this.jdField_j_of_type_Int;
      this.jdField_q_of_type_Int = this.jdField_k_of_type_Int;
    }
    for (;;)
    {
      this.jdField_a_of_type_ComTencentMobileqqActivityRichmediaNewFlowCameraOperator.a(this.jdField_o_of_type_Int, this.jdField_n_of_type_Int, this.jdField_b_of_type_Int, this.jdField_c_of_type_Int);
      if (QLog.isColorLevel()) {
        QLog.d("CameraCaptureView", 2, "compress=" + paramBoolean + " onCameraSizeUpdate cameraClipHeight = " + this.jdField_o_of_type_Int + " cameraClipWidth=" + this.jdField_n_of_type_Int + " videoWidth=" + this.jdField_p_of_type_Int + " videoHeight=" + this.jdField_q_of_type_Int);
      }
      return;
      label159:
      this.jdField_p_of_type_Int = this.jdField_l_of_type_Int;
      this.jdField_q_of_type_Int = this.jdField_m_of_type_Int;
      continue;
      label178:
      this.jdField_o_of_type_Int = this.jdField_g_of_type_Int;
      this.jdField_n_of_type_Int = this.jdField_f_of_type_Int;
      this.jdField_p_of_type_Int = this.jdField_j_of_type_Int;
      this.jdField_q_of_type_Int = this.jdField_k_of_type_Int;
    }
  }
  
  protected boolean d()
  {
    return false;
  }
  
  public void e() {}
  
  public void g()
  {
    if (!this.jdField_i_of_type_Boolean) {}
    while (!this.jdField_j_of_type_Boolean) {
      return;
    }
    if (QLog.isColorLevel()) {
      QLog.d("CameraCaptureView", 2, "stopCamera");
    }
    jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.a(false);
    this.jdField_k_of_type_Boolean = false;
    jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.b(this.jdField_s_of_type_Boolean);
    this.jdField_j_of_type_Boolean = false;
    if ((CameraCaptureView.CaptureParam.a(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam)) && (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureAudioAudioCapture != null)) {
      this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureAudioAudioCapture.f();
    }
    jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.b(this);
    jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.a(null);
    jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.a(null);
  }
  
  public void h()
  {
    f();
    if (!CameraAbility.c()) {
      return;
    }
    NewFlowCameraOperator localNewFlowCameraOperator;
    if (this.jdField_a_of_type_Int == 1)
    {
      this.jdField_a_of_type_Int = 2;
      localNewFlowCameraOperator = this.jdField_a_of_type_ComTencentMobileqqActivityRichmediaNewFlowCameraOperator;
      if (this.jdField_a_of_type_Int != 1) {
        break label87;
      }
    }
    label87:
    for (boolean bool = true;; bool = false)
    {
      localNewFlowCameraOperator.a(bool);
      this.jdField_o_of_type_Boolean = false;
      QmcfManager.a().a(this.jdField_a_of_type_Int);
      AudioTranslator.a().a(true);
      g();
      q();
      r();
      return;
      this.jdField_a_of_type_Int = 1;
      break;
    }
  }
  
  public void i()
  {
    int i1 = 0;
    f();
    if (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener != null) {
      this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener.B_();
    }
    if (a())
    {
      if (this.jdField_p_of_type_Boolean) {
        a(true);
      }
      Object localObject = this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam.jdField_a_of_type_JavaLangString + "/" + System.currentTimeMillis() + ".jpg";
      FileUtils.c((String)localObject);
      localObject = new File((String)localObject);
      boolean bool;
      if (this.jdField_a_of_type_Int == 1)
      {
        bool = true;
        if (!this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam.jdField_a_of_type_Boolean) {
          break label160;
        }
      }
      label160:
      for (i1 = CaptureUtil.c(this.u);; i1 = 0)
      {
        if ((!this.jdField_p_of_type_Boolean) || (this.jdField_o_of_type_Boolean)) {
          break label165;
        }
        jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.a(null, null, new ahqg(this, (File)localObject, i1, bool));
        return;
        bool = false;
        break;
      }
      label165:
      jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.a((File)localObject, new Rect(0, 0, this.jdField_b_of_type_Int, this.jdField_c_of_type_Int), this, i1, bool, 1);
      return;
    }
    if (this.jdField_p_of_type_Boolean)
    {
      i1 = 1500;
      a(true);
    }
    this.jdField_a_of_type_AndroidOsHandler.postDelayed(new ahqh(this), i1);
  }
  
  public void j()
  {
    f();
    if (this.jdField_p_of_type_Boolean) {
      a(true);
    }
    String str = this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam.jdField_a_of_type_JavaLangString + "/" + System.currentTimeMillis() + ".mp4";
    int i1 = CaptureUtil.b(this.jdField_t_of_type_Int);
    this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecEncoderEncodeConfig = new EncodeConfig(str, this.jdField_p_of_type_Int, this.jdField_q_of_type_Int, CameraCaptureView.CaptureParam.f(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam), CameraCaptureView.CaptureParam.g(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam), false, i1);
    this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecEncoderEncodeConfig.jdField_j_of_type_Int = this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam.jdField_a_of_type_Int;
    this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecEncoderEncodeConfig.jdField_k_of_type_Int = this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam.jdField_b_of_type_Int;
    this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$VideoCaptureResult = new CameraCaptureView.VideoCaptureResult();
    this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$VideoCaptureResult.orientation = this.jdField_t_of_type_Int;
    this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$VideoCaptureResult.type = 0;
    if (this.jdField_a_of_type_Int == 2) {
      jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.e();
    }
    this.jdField_a_of_type_Long = System.currentTimeMillis();
    this.jdField_m_of_type_Boolean = true;
    CaptureUtil.a(false, false);
  }
  
  public void k()
  {
    if (this.jdField_m_of_type_Boolean)
    {
      this.jdField_m_of_type_Boolean = false;
      if ((this.y == 0) && (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener != null)) {
        this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener.a(102);
      }
    }
    jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.f();
    this.jdField_b_of_type_Long = System.currentTimeMillis();
    ReportUtil.jdField_a_of_type_Long = this.jdField_b_of_type_Long - this.jdField_a_of_type_Long;
    CaptureReportUtil.jdField_a_of_type_Long = this.jdField_b_of_type_Long - this.jdField_a_of_type_Long;
  }
  
  public void l()
  {
    ReportUtil.a(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$VideoCaptureResult.videoFrameCount, this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$VideoCaptureResult.videoMp4FilePath);
  }
  
  protected void m()
  {
    this.jdField_a_of_type_AndroidViewOrientationEventListener = new ahpz(this, getContext());
    if (this.jdField_a_of_type_AndroidViewOrientationEventListener.canDetectOrientation()) {
      this.jdField_a_of_type_AndroidViewOrientationEventListener.enable();
    }
    if (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener != null) {
      this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener.A_();
    }
    if (QLog.isColorLevel()) {
      QLog.d("CameraCaptureView", 2, "Create to FirstFrameShown cost : " + (System.currentTimeMillis() - this.jdField_c_of_type_Long) + "ms");
    }
  }
  
  public void n()
  {
    if (QLog.isColorLevel()) {
      QLog.d("CameraCaptureView", 2, "onSurfaceDestroy");
    }
    this.jdField_n_of_type_Boolean = false;
    if (this.jdField_a_of_type_AndroidGraphicsSurfaceTexture != null) {
      this.jdField_a_of_type_AndroidGraphicsSurfaceTexture.setOnFrameAvailableListener(null);
    }
    g();
  }
  
  protected void o()
  {
    if (QLog.isColorLevel()) {
      QLog.d("CameraCaptureView", 2, "onFirstFrameShownEachOpenFrame");
    }
    NewFlowCameraReporter.b("first frame show");
    if (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener != null) {
      this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener.f();
    }
    if (this.jdField_a_of_type_AndroidViewOrientationEventListener.canDetectOrientation()) {
      this.jdField_a_of_type_AndroidViewOrientationEventListener.enable();
    }
    CameraHelper.a(this.jdField_a_of_type_Int);
  }
  
  public void onDrawFrame(GL10 paramGL10)
  {
    if ((this.jdField_d_of_type_Int == 0) || (this.jdField_e_of_type_Int == 0) || (this.jdField_a_of_type_JavaUtilMap.size() == 0))
    {
      GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      GLES20.glClear(16384);
    }
    long l1;
    long l2;
    do
    {
      do
      {
        return;
      } while (!this.jdField_j_of_type_Boolean);
      l1 = System.currentTimeMillis();
      System.currentTimeMillis();
      boolean bool = this.jdField_c_of_type_Boolean;
      this.jdField_s_of_type_Int = a(bool);
      System.currentTimeMillis();
      System.currentTimeMillis();
      int i1 = a(this.jdField_s_of_type_Int);
      System.currentTimeMillis();
      System.currentTimeMillis();
      GLES20.glBindFramebuffer(36160, 0);
      GLES20.glViewport(0, 0, this.jdField_b_of_type_Int, this.jdField_c_of_type_Int);
      this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererTextureRender.a(3553, i1, null, null);
      System.currentTimeMillis();
      System.currentTimeMillis();
      a(3553, i1, null, null, SystemClock.elapsedRealtimeNanos());
      System.currentTimeMillis();
      if (!this.jdField_b_of_type_Boolean)
      {
        this.jdField_b_of_type_Boolean = true;
        m();
      }
      if (!this.jdField_a_of_type_Boolean)
      {
        this.jdField_a_of_type_Boolean = true;
        o();
      }
      if (bool)
      {
        a(i1, this.jdField_n_of_type_Int, this.jdField_o_of_type_Int);
        this.jdField_c_of_type_Boolean = false;
      }
      l2 = System.currentTimeMillis();
    } while (!QLog.isColorLevel());
    QLog.d("CameraCaptureView", 2, "onDrawFrame cost : " + (l2 - l1));
  }
  
  public void onFrameAvailable(SurfaceTexture paramSurfaceTexture)
  {
    if ((this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecEncoderEglHandlerThread.a()) && (!this.jdField_h_of_type_Boolean))
    {
      this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecEncoderEglHandlerThread.a().post(new ahqa(this, paramSurfaceTexture));
      return;
    }
    queueEvent(new ahqb(this, paramSurfaceTexture));
  }
  
  public void onPause()
  {
    if (QLog.isColorLevel()) {
      QLog.d("CameraCaptureView", 2, "onPause");
    }
    g();
    if (this.jdField_a_of_type_AndroidViewOrientationEventListener != null) {
      this.jdField_a_of_type_AndroidViewOrientationEventListener.disable();
    }
    ThreadManagerV2.excute(new ahqe(this), 16, null, false);
  }
  
  public void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    if (this.jdField_r_of_type_Boolean) {
      this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureUtilDarkModeChecker.a(paramArrayOfByte, this.jdField_d_of_type_Int, this.jdField_e_of_type_Int, this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureUtilDarkModeChecker$DarkModeListener);
    }
    CameraControl.a().a(true, paramArrayOfByte);
  }
  
  public void onResume()
  {
    if (QLog.isColorLevel()) {
      QLog.d("CameraCaptureView", 2, "onResume");
    }
    this.jdField_a_of_type_Boolean = false;
    q();
    if (this.jdField_l_of_type_Boolean) {
      r();
    }
    if ((this.jdField_a_of_type_AndroidViewOrientationEventListener != null) && (this.jdField_a_of_type_AndroidViewOrientationEventListener.canDetectOrientation())) {
      this.jdField_a_of_type_AndroidViewOrientationEventListener.enable();
    }
    if (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureUtilDarkModeChecker != null) {
      this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureUtilDarkModeChecker.a();
    }
    ThreadManagerV2.excute(new ahqd(this), 16, null, false);
  }
  
  public void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    if (QLog.isColorLevel()) {
      QLog.d("CameraCaptureView", 2, "onSurfaceChanged(): width " + paramInt1 + ";height" + paramInt2);
    }
    this.jdField_b_of_type_Int = paramInt1;
    this.jdField_c_of_type_Int = paramInt2;
    this.jdField_n_of_type_Boolean = true;
    q();
    r();
  }
  
  public void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    if (QLog.isColorLevel()) {
      QLog.d("CameraCaptureView", 2, "onSurfaceCreated");
    }
    this.jdField_n_of_type_Boolean = false;
    paramGL10 = this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecEncoderEglHandlerThread;
    this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecEncoderEglHandlerThread = new EglHandlerThread("update_texture", EGL14.eglGetCurrentContext());
    this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecEncoderEglHandlerThread.start();
    if (paramGL10 != null) {
      paramGL10.quitSafely();
    }
    this.jdField_r_of_type_Int = GlUtil.a(36197);
    this.jdField_a_of_type_AndroidGraphicsSurfaceTexture = new SurfaceTexture(this.jdField_r_of_type_Int);
    this.jdField_a_of_type_AndroidGraphicsSurfaceTexture.setOnFrameAvailableListener(this);
    this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererTextureRender = new TextureRender();
    this.y = 0;
    this.jdField_h_of_type_Boolean = CameraCompatibleList.c();
  }
  
  protected void p() {}
  
  public void setCaptureListener(CameraCaptureView.CaptureListener paramCaptureListener)
  {
    this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureListener = paramCaptureListener;
  }
  
  public void setCaptureParam(CameraCaptureView.CaptureParam paramCaptureParam)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam != null) {
      throw new RuntimeException("setCaptureParam is already called");
    }
    this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureViewCameraCaptureView$CaptureParam = paramCaptureParam;
    if (QLog.isColorLevel()) {
      QLog.d("CameraCaptureView", 2, "setCaptureParam : " + paramCaptureParam);
    }
    c();
  }
  
  public void setDarkModeEnable(boolean paramBoolean)
  {
    this.jdField_r_of_type_Boolean = paramBoolean;
  }
  
  public void setDarkModeListener(DarkModeChecker.DarkModeListener paramDarkModeListener)
  {
    this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureUtilDarkModeChecker$DarkModeListener = paramDarkModeListener;
  }
  
  public void setDynamicResolutionMode(boolean paramBoolean)
  {
    this.jdField_f_of_type_Boolean = paramBoolean;
  }
  
  public void setPreviewEnable(boolean paramBoolean)
  {
    this.jdField_d_of_type_Boolean = paramBoolean;
    if (QLog.isColorLevel()) {
      QLog.d("CameraCaptureView", 2, "setPreviewEnable, " + paramBoolean);
    }
  }
  
  public void setSceneMode(String paramString)
  {
    f();
    jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.a(paramString);
  }
  
  public void setSegmentMode(boolean paramBoolean)
  {
    this.jdField_e_of_type_Boolean = paramBoolean;
  }
  
  public void setSyncStopCamera(boolean paramBoolean)
  {
    this.jdField_s_of_type_Boolean = paramBoolean;
  }
  
  public void setZoom(int paramInt)
  {
    f();
    jdField_a_of_type_ComTencentMobileqqShortvideoMediadeviceCameraProxy.b(paramInt);
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    if (QLog.isColorLevel()) {
      QLog.d("CameraCaptureView", 2, "surfaceCreated");
    }
    super.surfaceCreated(paramSurfaceHolder);
    this.jdField_l_of_type_Boolean = true;
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    if (QLog.isColorLevel()) {
      QLog.d("CameraCaptureView", 2, "surfaceDestroyed");
    }
    super.surfaceDestroyed(paramSurfaceHolder);
    this.jdField_l_of_type_Boolean = false;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     com.tencent.mobileqq.richmedia.capture.view.CameraCaptureView
 * JD-Core Version:    0.7.0.1
 */
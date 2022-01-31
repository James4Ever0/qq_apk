package com.tencent.mobileqq.ar.ARRenderModel;

import aafm;
import aafn;
import aafo;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.SystemClock;
import android.util.Log;
import com.tencent.mobileqq.ar.ARDeviceController;
import com.tencent.mobileqq.ar.ARRecord.VideoEncoderUtils;
import com.tencent.mobileqq.ar.ARRecord.VideoRecordController;
import com.tencent.mobileqq.ar.ARRecord.worldcup.ARWorldCupRecordController;
import com.tencent.mobileqq.ar.FramePerformanceMonitor;
import com.tencent.mobileqq.ar.ReportUtil;
import com.tencent.mobileqq.ar.ScanEntranceReport;
import com.tencent.mobileqq.ar.aidl.ArCloudConfigInfo;
import com.tencent.mobileqq.ar.model.ArVideoResourceInfo;
import com.tencent.mobileqq.richmedia.mediacodec.encoder.EglCore;
import com.tencent.mobileqq.richmedia.mediacodec.renderer.RenderBuffer;
import com.tencent.mobileqq.richmedia.mediacodec.renderer.TextureRender;
import com.tencent.mobileqq.richmedia.mediacodec.utils.GlUtil;
import com.tencent.qphone.base.util.QLog;
import java.nio.IntBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class ARRenderManagerImpl
  implements ARRenderManager, ARRenderMangerInnerCallback
{
  public static float a;
  public static int a;
  public static int b;
  private long jdField_a_of_type_Long;
  private Context jdField_a_of_type_AndroidContentContext;
  GLSurfaceView jdField_a_of_type_AndroidOpenglGLSurfaceView;
  private VideoRecordController jdField_a_of_type_ComTencentMobileqqArARRecordVideoRecordController;
  private ARWorldCupRecordController jdField_a_of_type_ComTencentMobileqqArARRecordWorldcupARWorldCupRecordController;
  public volatile ARBaseRender a;
  ARRenderManagerCallBack jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenderManagerCallBack;
  public ARRenerArumentManager a;
  private CameraRendererable jdField_a_of_type_ComTencentMobileqqArARRenderModelCameraRendererable = new CameraRendererable(this);
  FramePerformanceMonitor jdField_a_of_type_ComTencentMobileqqArFramePerformanceMonitor = new FramePerformanceMonitor();
  private EglCore jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecEncoderEglCore;
  private RenderBuffer jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererRenderBuffer;
  private TextureRender jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererTextureRender;
  public Map a;
  private boolean jdField_a_of_type_Boolean;
  private long jdField_b_of_type_Long;
  private Map jdField_b_of_type_JavaUtilMap = new ConcurrentHashMap();
  private boolean jdField_b_of_type_Boolean;
  int jdField_c_of_type_Int = 0;
  private volatile boolean jdField_c_of_type_Boolean;
  int d = 0;
  
  static
  {
    jdField_a_of_type_Float = 1.0F;
  }
  
  public ARRenderManagerImpl()
  {
    this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenerArumentManager = new ARRenerArumentManager();
    this.jdField_a_of_type_JavaUtilMap = new ConcurrentHashMap();
  }
  
  private ARBaseRender a(String paramString)
  {
    if (this.jdField_a_of_type_JavaUtilMap.containsKey(paramString)) {
      return (ARBaseRender)this.jdField_a_of_type_JavaUtilMap.get(paramString);
    }
    return null;
  }
  
  private void a(GL10 paramGL10)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARBaseRender != null) {
      this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARBaseRender.c();
    }
    GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    GLES20.glDepthMask(true);
    GLES20.glColorMask(true, true, true, true);
    GLES20.glClear(16640);
    GLES20.glDisable(2929);
    b(paramGL10);
    GLES20.glFinish();
  }
  
  private void b(GL10 paramGL10)
  {
    long l1 = System.currentTimeMillis();
    this.jdField_a_of_type_ComTencentMobileqqArARRenderModelCameraRendererable.onDrawFrame(paramGL10);
    long l2 = System.currentTimeMillis();
    if (QLog.isDebugVersion())
    {
      this.d += 1;
      this.jdField_c_of_type_Int = ((int)(l2 - l1 + this.jdField_c_of_type_Int));
      if (this.d % 100 == 0) {
        Log.i("wing", "scan line anime cameraRenderer cost---- " + this.jdField_c_of_type_Int * 1.0F / Math.max(1, this.d));
      }
    }
    paramGL10 = this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARBaseRender;
    if ((paramGL10 != null) && (paramGL10.a()))
    {
      System.currentTimeMillis();
      GLES20.glEnable(2929);
      ARRenerArumentManager.DrawFrameParements localDrawFrameParements = this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenerArumentManager.a(paramGL10.a(), paramGL10.b());
      if (localDrawFrameParements != null) {
        paramGL10.a(localDrawFrameParements);
      }
      GLES20.glDisable(2929);
      System.currentTimeMillis();
    }
    System.currentTimeMillis();
  }
  
  public long a()
  {
    return this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenerArumentManager.jdField_a_of_type_Long;
  }
  
  public Context a()
  {
    return this.jdField_a_of_type_AndroidContentContext;
  }
  
  public ARRenerArumentManager a()
  {
    return this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenerArumentManager;
  }
  
  public Object a(int paramInt)
  {
    return this.jdField_b_of_type_JavaUtilMap.get(Integer.valueOf(paramInt));
  }
  
  public void a()
  {
    QLog.i("AREngine_ARRenderManagerImpl", 1, "stop.");
    Iterator localIterator = this.jdField_a_of_type_JavaUtilMap.values().iterator();
    while (localIterator.hasNext()) {
      ((ARBaseRender)localIterator.next()).d();
    }
    this.jdField_a_of_type_JavaUtilMap.clear();
    this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARBaseRender = null;
    this.jdField_a_of_type_ComTencentMobileqqArARRenderModelCameraRendererable.g();
    this.jdField_b_of_type_JavaUtilMap.clear();
    this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenerArumentManager.a();
    this.jdField_c_of_type_Boolean = false;
    try
    {
      if (this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecEncoderEglCore != null)
      {
        this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecEncoderEglCore.a();
        this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecEncoderEglCore = null;
      }
      return;
    }
    catch (Exception localException)
    {
      QLog.e("AREngine_ARRenderManagerImpl", 1, "stop, mEglCore release: " + localException.getMessage());
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if ((this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenderManagerCallBack == null) || (this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARBaseRender == null))
    {
      QLog.i("AREngine_ARRenderManagerImpl", 1, "notifyAnimationPlayStatusChange.mCurrentRenderable or mOutCallBack is null");
      return;
    }
    switch (paramInt1)
    {
    default: 
      return;
    case 0: 
      this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenderManagerCallBack.a(this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARBaseRender.a(), paramInt2);
      return;
    case 1: 
      this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenderManagerCallBack.c(this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARBaseRender.a(), paramInt2);
      return;
    case 2: 
      this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenderManagerCallBack.b(this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARBaseRender.a(), paramInt2);
      return;
    }
    this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenderManagerCallBack.d(this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARBaseRender.a(), paramInt2);
  }
  
  public void a(int paramInt1, SurfaceTexture paramSurfaceTexture, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    QLog.i("AREngine_ARRenderManagerImpl", 1, "startCameraPreviewRender. textureId = " + paramInt1 + ", surfaceTexture = " + paramSurfaceTexture);
    this.jdField_a_of_type_ComTencentMobileqqArARRenderModelCameraRendererable.a(paramInt1, paramSurfaceTexture);
    this.jdField_a_of_type_ComTencentMobileqqArARRenderModelCameraRendererable.a(paramInt2, paramInt3, paramInt4, paramInt5);
    this.jdField_a_of_type_Long = 0L;
    this.jdField_b_of_type_Long = 0L;
  }
  
  public void a(int paramInt, Object paramObject)
  {
    this.jdField_b_of_type_JavaUtilMap.put(Integer.valueOf(paramInt), paramObject);
  }
  
  public void a(int paramInt, float[] paramArrayOfFloat)
  {
    this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenerArumentManager.a(paramArrayOfFloat);
  }
  
  public void a(long paramLong)
  {
    this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenerArumentManager.jdField_a_of_type_Long = paramLong;
  }
  
  public void a(VideoRecordController paramVideoRecordController)
  {
    this.jdField_a_of_type_ComTencentMobileqqArARRecordVideoRecordController = paramVideoRecordController;
    if ((this.jdField_a_of_type_ComTencentMobileqqArARRecordVideoRecordController != null) && (this.jdField_a_of_type_ComTencentMobileqqArARRecordWorldcupARWorldCupRecordController != null))
    {
      this.jdField_a_of_type_ComTencentMobileqqArARRecordWorldcupARWorldCupRecordController.c();
      this.jdField_a_of_type_ComTencentMobileqqArARRecordWorldcupARWorldCupRecordController = null;
    }
  }
  
  public void a(ARBaseRender paramARBaseRender, ArCloudConfigInfo paramArCloudConfigInfo, int paramInt1, int paramInt2, Object paramObject)
  {
    if ((paramArCloudConfigInfo != null) && (paramArCloudConfigInfo.a()) && (this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenderManagerCallBack != null)) {
      this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenderManagerCallBack.a(paramArCloudConfigInfo, paramInt1, paramInt2, paramObject);
    }
  }
  
  public void a(ARRenderTrackInfo paramARRenderTrackInfo)
  {
    this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenerArumentManager.a(paramARRenderTrackInfo);
  }
  
  public void a(ArVideoResourceInfo paramArVideoResourceInfo) {}
  
  public void a(ArVideoResourceInfo paramArVideoResourceInfo, ARRenderMangerInnerCallback paramARRenderMangerInnerCallback)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenderManagerCallBack == null) {
      return;
    }
    this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenderManagerCallBack.a(paramArVideoResourceInfo, paramARRenderMangerInnerCallback);
  }
  
  public void a(Runnable paramRunnable)
  {
    if (this.jdField_a_of_type_AndroidOpenglGLSurfaceView != null) {
      this.jdField_a_of_type_AndroidOpenglGLSurfaceView.queueEvent(paramRunnable);
    }
  }
  
  public void a(String paramString)
  {
    this.jdField_a_of_type_JavaUtilMap.remove(paramString);
  }
  
  public boolean a()
  {
    QLog.i("AREngine_ARRenderManagerImpl", 1, "start.");
    return true;
  }
  
  public boolean a(GLSurfaceView paramGLSurfaceView, Context paramContext, ARRenderManagerCallBack paramARRenderManagerCallBack)
  {
    QLog.i("AREngine_ARRenderManagerImpl", 1, "init.");
    this.jdField_a_of_type_AndroidOpenglGLSurfaceView = paramGLSurfaceView;
    this.jdField_a_of_type_AndroidContentContext = paramContext;
    this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenderManagerCallBack = paramARRenderManagerCallBack;
    this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARBaseRender = null;
    return true;
  }
  
  public boolean a(ARRenderResourceInfo paramARRenderResourceInfo)
  {
    QLog.i("AREngine_ARRenderManagerImpl", 1, "startModelRender. resourceInfo.key = " + paramARRenderResourceInfo.jdField_a_of_type_JavaLangString + ", resourceInfo.arType = " + paramARRenderResourceInfo.jdField_a_of_type_Int + ", resourceInfo.trackMode = " + paramARRenderResourceInfo.jdField_b_of_type_Int);
    if (!this.jdField_c_of_type_Boolean)
    {
      QLog.i("AREngine_ARRenderManagerImpl", 1, "startModelRender. fail because of render not ready");
      return false;
    }
    Object localObject2 = a(paramARRenderResourceInfo.jdField_a_of_type_JavaLangString);
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = ARRenderableConstructorFactoty.a(this, paramARRenderResourceInfo, this.jdField_a_of_type_AndroidOpenglGLSurfaceView);
      this.jdField_a_of_type_JavaUtilMap.put(paramARRenderResourceInfo.jdField_a_of_type_JavaLangString, localObject1);
      QLog.d("AREngine_ARRenderManagerImpl", 1, "crate new render here " + localObject1);
    }
    if (localObject1 == null)
    {
      if (QLog.isColorLevel()) {
        QLog.d("HSRender", 1, "onARStateChanged, renderable == null");
      }
      paramARRenderResourceInfo = this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARBaseRender;
      this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARBaseRender = null;
      this.jdField_a_of_type_AndroidOpenglGLSurfaceView.queueEvent(new aafm(this, paramARRenderResourceInfo));
      return false;
    }
    if ((localObject1 instanceof ARWorldCupGlobalSceneRenderable))
    {
      localObject2 = (ARWorldCupGlobalSceneRenderable)localObject1;
      if ((this.jdField_a_of_type_ComTencentMobileqqArARRecordWorldcupARWorldCupRecordController == null) && (this.jdField_a_of_type_ComTencentMobileqqArARRecordVideoRecordController != null)) {
        this.jdField_a_of_type_ComTencentMobileqqArARRecordWorldcupARWorldCupRecordController = new ARWorldCupRecordController(this.jdField_a_of_type_ComTencentMobileqqArARRecordVideoRecordController);
      }
      if (this.jdField_a_of_type_ComTencentMobileqqArARRecordWorldcupARWorldCupRecordController != null)
      {
        ((ARWorldCupGlobalSceneRenderable)localObject2).a(this.jdField_a_of_type_ComTencentMobileqqArARRecordWorldcupARWorldCupRecordController);
        this.jdField_a_of_type_ComTencentMobileqqArARRecordWorldcupARWorldCupRecordController.a();
      }
    }
    for (;;)
    {
      this.jdField_a_of_type_AndroidOpenglGLSurfaceView.queueEvent(new aafn(this, (ARBaseRender)localObject1, paramARRenderResourceInfo));
      return true;
      if ((this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARBaseRender instanceof ARWorldCupGlobalSceneRenderable))
      {
        ((ARWorldCupGlobalSceneRenderable)this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARBaseRender).a(null);
        if (this.jdField_a_of_type_ComTencentMobileqqArARRecordWorldcupARWorldCupRecordController != null) {
          this.jdField_a_of_type_ComTencentMobileqqArARRecordWorldcupARWorldCupRecordController.b();
        }
      }
    }
  }
  
  public boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqArARRenderModelCameraRendererable != null)
    {
      this.jdField_a_of_type_ComTencentMobileqqArARRenderModelCameraRendererable.a(paramBoolean);
      this.jdField_a_of_type_ComTencentMobileqqArARRenderModelCameraRendererable.a(paramFloat2);
      return true;
    }
    return false;
  }
  
  public void b()
  {
    QLog.i("AREngine_ARRenderManagerImpl", 1, "uninit.");
    this.jdField_a_of_type_AndroidOpenglGLSurfaceView = null;
    this.jdField_a_of_type_AndroidContentContext = null;
    this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenderManagerCallBack = null;
  }
  
  public void b(long paramLong)
  {
    this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenerArumentManager.c = paramLong;
  }
  
  public void c()
  {
    QLog.i("AREngine_ARRenderManagerImpl", 1, "stopCameraPreviewRender.");
    this.jdField_a_of_type_ComTencentMobileqqArARRenderModelCameraRendererable.jdField_a_of_type_Boolean = false;
    if ((this.jdField_a_of_type_Long > 0L) && (this.jdField_b_of_type_Long > 0L))
    {
      long l = System.currentTimeMillis() - this.jdField_a_of_type_Long;
      if (l > 1000L)
      {
        int i = (int)(this.jdField_b_of_type_Long / (l / 1000L));
        ScanEntranceReport.a().a(i);
      }
    }
  }
  
  public void d()
  {
    QLog.i("AREngine_ARRenderManagerImpl", 1, "stopModelRender.");
    this.jdField_a_of_type_AndroidOpenglGLSurfaceView.queueEvent(new aafo(this));
    if ((this.jdField_a_of_type_ComTencentMobileqqArARRecordWorldcupARWorldCupRecordController != null) && (this.jdField_a_of_type_ComTencentMobileqqArARRecordWorldcupARWorldCupRecordController.a())) {
      this.jdField_a_of_type_ComTencentMobileqqArARRecordWorldcupARWorldCupRecordController.b();
    }
  }
  
  public void e()
  {
    this.jdField_b_of_type_Boolean = true;
  }
  
  public void f()
  {
    if (this.jdField_a_of_type_AndroidOpenglGLSurfaceView != null) {
      this.jdField_a_of_type_AndroidOpenglGLSurfaceView.requestRender();
    }
  }
  
  public void onDrawFrame(GL10 paramGL10)
  {
    int i;
    if ((this.jdField_a_of_type_ComTencentMobileqqArARRecordVideoRecordController != null) && (this.jdField_a_of_type_ComTencentMobileqqArARRecordVideoRecordController.b())) {
      i = 1;
    }
    while (i != 0)
    {
      if (!this.jdField_a_of_type_Boolean)
      {
        if (this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererRenderBuffer == null) {
          this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererRenderBuffer = new RenderBuffer(jdField_a_of_type_Int, jdField_b_of_type_Int, 33984);
        }
        if (this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererTextureRender == null) {
          this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererTextureRender = new TextureRender();
        }
        int k = jdField_a_of_type_Int;
        int m = jdField_b_of_type_Int;
        int j = m;
        i = k;
        if (this.jdField_a_of_type_ComTencentMobileqqArARRecordWorldcupARWorldCupRecordController != null)
        {
          j = m;
          i = k;
          if (this.jdField_a_of_type_ComTencentMobileqqArARRecordWorldcupARWorldCupRecordController.a())
          {
            i = 540;
            j = 960;
          }
        }
        this.jdField_a_of_type_ComTencentMobileqqArARRecordVideoRecordController.a(this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecEncoderEglCore, i, j);
        this.jdField_a_of_type_Boolean = true;
      }
      if (this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererRenderBuffer == null)
      {
        a(paramGL10);
        QLog.d("AREngine_ARRenderManagerImpl", 1, "onDrawFrame, mRecordFBO == null");
        return;
        i = 0;
      }
      else
      {
        this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererRenderBuffer.b();
        a(paramGL10);
        this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererRenderBuffer.c();
        if ((this.jdField_a_of_type_ComTencentMobileqqArARRecordWorldcupARWorldCupRecordController != null) && (this.jdField_a_of_type_ComTencentMobileqqArARRecordWorldcupARWorldCupRecordController.a())) {
          this.jdField_a_of_type_ComTencentMobileqqArARRecordWorldcupARWorldCupRecordController.a(3553, this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererRenderBuffer.a(), null, null, SystemClock.elapsedRealtimeNanos());
        }
        for (;;)
        {
          GLES20.glBindFramebuffer(36160, 0);
          GLES20.glViewport(0, 0, jdField_a_of_type_Int, jdField_b_of_type_Int);
          GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
          GLES20.glDisable(2929);
          GLES20.glDisable(3042);
          this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererTextureRender.a(3553, this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererRenderBuffer.a(), null, null);
          if (this.jdField_a_of_type_Long == 0L) {
            this.jdField_a_of_type_Long = System.currentTimeMillis();
          }
          this.jdField_b_of_type_Long += 1L;
          return;
          this.jdField_a_of_type_ComTencentMobileqqArARRecordVideoRecordController.a(3553, this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererRenderBuffer.a(), null, null, SystemClock.elapsedRealtimeNanos());
        }
      }
    }
    if (this.jdField_a_of_type_Boolean)
    {
      if (this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererRenderBuffer != null)
      {
        GLES20.glDeleteTextures(1, new int[] { this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererRenderBuffer.a() }, 0);
        this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererRenderBuffer.d();
        this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererRenderBuffer = null;
      }
      if (this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererTextureRender != null)
      {
        this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererTextureRender.a();
        this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecRendererTextureRender = null;
      }
      if (this.jdField_a_of_type_ComTencentMobileqqArARRecordVideoRecordController != null) {
        this.jdField_a_of_type_ComTencentMobileqqArARRecordVideoRecordController.d();
      }
      this.jdField_a_of_type_Boolean = false;
    }
    GLES20.glViewport(0, 0, jdField_a_of_type_Int, jdField_b_of_type_Int);
    RenderBuffer localRenderBuffer1;
    if (this.jdField_b_of_type_Boolean)
    {
      localRenderBuffer1 = new RenderBuffer(jdField_a_of_type_Int, jdField_b_of_type_Int, 33984);
      localRenderBuffer1.b();
    }
    for (;;)
    {
      a(paramGL10);
      if (!this.jdField_b_of_type_Boolean) {
        break;
      }
      localRenderBuffer1.c();
      paramGL10 = new TextureRender();
      GLES20.glViewport(0, 0, jdField_a_of_type_Int, jdField_b_of_type_Int);
      paramGL10.a(3553, localRenderBuffer1.a(), null, null);
      RenderBuffer localRenderBuffer2 = new RenderBuffer(540, 960, 33984);
      localRenderBuffer2.b();
      paramGL10.a(3553, localRenderBuffer1.a(), null, null);
      localRenderBuffer2.c();
      Bitmap localBitmap = GlUtil.a(localRenderBuffer2.a(), 540, 960, 0);
      GLES20.glDeleteTextures(1, new int[] { localRenderBuffer2.a() }, 0);
      GLES20.glDeleteTextures(1, new int[] { localRenderBuffer1.a() }, 0);
      localRenderBuffer2.d();
      paramGL10.a();
      localRenderBuffer1.d();
      if (this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenderManagerCallBack != null) {
        this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenderManagerCallBack.a(null, 1001, 0, localBitmap);
      }
      this.jdField_b_of_type_Boolean = false;
      break;
      localRenderBuffer1 = null;
    }
  }
  
  public void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    jdField_a_of_type_Int = paramInt1;
    jdField_b_of_type_Int = paramInt2;
    this.jdField_a_of_type_ComTencentMobileqqArARRenderModelCameraRendererable.onSurfaceChanged(paramGL10, paramInt1, paramInt2);
    if (this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenderManagerCallBack != null) {
      this.jdField_a_of_type_ComTencentMobileqqArARRenderModelARRenderManagerCallBack.a();
    }
    this.jdField_c_of_type_Boolean = true;
    GLES20.glEnable(2884);
  }
  
  public void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    if (VideoEncoderUtils.a()) {
      this.jdField_a_of_type_ComTencentMobileqqRichmediaMediacodecEncoderEglCore = new EglCore(EGL14.eglGetCurrentContext(), 1);
    }
    ARDeviceController.a().a(paramGL10.glGetString(7937));
    this.jdField_a_of_type_ComTencentMobileqqArARRenderModelCameraRendererable.onSurfaceCreated(paramGL10, paramEGLConfig);
    paramGL10.glClearColor(0.0F, 0.0F, 0.0F, 0.5F);
    paramEGLConfig = new StringBuilder();
    if (QLog.isColorLevel()) {
      QLog.d("GPU_INFO", 2, "GL_RENDERER = " + paramGL10.glGetString(7937));
    }
    paramEGLConfig.append("GL_RENDERER = " + paramGL10.glGetString(7937));
    paramEGLConfig.append('\n');
    if (QLog.isColorLevel()) {
      QLog.d("GPU_INFO", 1, "GL_VENDOR = " + paramGL10.glGetString(7936));
    }
    paramEGLConfig.append("GL_VENDOR = " + paramGL10.glGetString(7936));
    paramEGLConfig.append('\n');
    if (QLog.isColorLevel()) {
      QLog.d("GPU_INFO", 2, "GL_VERSION = " + paramGL10.glGetString(7938));
    }
    paramEGLConfig.append("GL_VERSION = " + paramGL10.glGetString(7938));
    paramEGLConfig.append('\n');
    Object localObject = IntBuffer.allocate(20);
    paramGL10.glGetIntegerv(36347, (IntBuffer)localObject);
    paramEGLConfig.append("GL_MAX_VERTEX_UNIFORM_VECTORS = " + ((IntBuffer)localObject).get());
    paramEGLConfig.append('\n');
    localObject = IntBuffer.allocate(20);
    paramGL10.glGetIntegerv(35661, (IntBuffer)localObject);
    paramEGLConfig.append("GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = " + ((IntBuffer)localObject).get());
    paramEGLConfig.append('\n');
    localObject = IntBuffer.allocate(20);
    paramGL10.glGetIntegerv(34076, (IntBuffer)localObject);
    paramEGLConfig.append("GL_MAX_CUBE_MAP_TEXTURE_SIZE = " + ((IntBuffer)localObject).get());
    paramEGLConfig.append('\n');
    localObject = IntBuffer.allocate(20);
    paramGL10.glGetIntegerv(34024, (IntBuffer)localObject);
    paramEGLConfig.append("GL_MAX_RENDERBUFFER_SIZE = " + ((IntBuffer)localObject).get());
    paramEGLConfig.append('\n');
    localObject = IntBuffer.allocate(20);
    paramGL10.glGetIntegerv(34930, (IntBuffer)localObject);
    paramEGLConfig.append("GL_MAX_TEXTURE_IMAGE_UNITS = " + ((IntBuffer)localObject).get());
    paramEGLConfig.append('\n');
    localObject = IntBuffer.allocate(20);
    paramGL10.glGetIntegerv(3379, (IntBuffer)localObject);
    paramEGLConfig.append("GL_MAX_TEXTURE_SIZE = " + ((IntBuffer)localObject).get());
    paramEGLConfig.append('\n');
    localObject = IntBuffer.allocate(20);
    paramGL10.glGetIntegerv(36349, (IntBuffer)localObject);
    paramEGLConfig.append("GL_MAX_FRAGMENT_UNIFORM_VECTORS = " + ((IntBuffer)localObject).get());
    paramEGLConfig.append('\n');
    localObject = IntBuffer.allocate(20);
    paramGL10.glGetIntegerv(34921, (IntBuffer)localObject);
    paramEGLConfig.append("GL_MAX_VERTEX_ATTRIBS = " + ((IntBuffer)localObject).get());
    paramEGLConfig.append('\n');
    localObject = IntBuffer.allocate(20);
    paramGL10.glGetIntegerv(36348, (IntBuffer)localObject);
    paramEGLConfig.append("GL_MAX_VARYING_VECTORS = " + ((IntBuffer)localObject).get());
    paramEGLConfig.append('\n');
    localObject = IntBuffer.allocate(20);
    paramGL10.glGetIntegerv(36349, (IntBuffer)localObject);
    paramEGLConfig.append("GL_MAX_FRAGMENT_UNIFORM_VECTORS = " + ((IntBuffer)localObject).get());
    paramEGLConfig.append('\n');
    paramEGLConfig = new StringBuilder();
    localObject = paramGL10.glGetString(7939).split(" ");
    int i = 0;
    while (i < localObject.length)
    {
      if (QLog.isColorLevel())
      {
        QLog.d("GPU_INFO", 2, "GL_EXTENSIONS = " + localObject[i]);
        paramEGLConfig.append(localObject[i] + " ");
      }
      i += 1;
    }
    ReportUtil.a(paramGL10.glGetString(7937), paramGL10.glGetString(7936), paramGL10.glGetString(7938), paramEGLConfig.toString());
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     com.tencent.mobileqq.ar.ARRenderModel.ARRenderManagerImpl
 * JD-Core Version:    0.7.0.1
 */
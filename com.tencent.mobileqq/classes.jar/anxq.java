import android.opengl.GLSurfaceView.EGLContextFactory;
import com.tencent.qphone.base.util.QLog;
import dov.com.tencent.mobileqq.richmedia.mediacodec.widget.HWVideoPlayView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

public class anxq
  implements GLSurfaceView.EGLContextFactory
{
  private int jdField_a_of_type_Int = 12440;
  
  public anxq(HWVideoPlayView paramHWVideoPlayView) {}
  
  public EGLContext createContext(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig)
  {
    int i = this.jdField_a_of_type_Int;
    if (QLog.isColorLevel()) {
      QLog.d("HWVideoPlayView", 1, "createContext. display = " + paramEGLDisplay + " tid = " + Thread.currentThread().getId());
    }
    return paramEGL10.eglCreateContext(paramEGLDisplay, paramEGLConfig, EGL10.EGL_NO_CONTEXT, new int[] { i, 2, 12344 });
  }
  
  public void destroyContext(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLContext paramEGLContext)
  {
    if (!paramEGL10.eglDestroyContext(paramEGLDisplay, paramEGLContext)) {
      QLog.e("HWVideoPlayView", 1, "destroyContext. display = " + paramEGLDisplay + " context = " + paramEGLContext + " tid = " + Thread.currentThread().getId());
    }
    this.jdField_a_of_type_DovComTencentMobileqqRichmediaMediacodecWidgetHWVideoPlayView.a();
    if (QLog.isColorLevel()) {
      QLog.d("HWVideoPlayView", 1, "destroyContext. display = " + paramEGLDisplay + " context = " + paramEGLContext + " tid = " + Thread.currentThread().getId());
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     anxq
 * JD-Core Version:    0.7.0.1
 */
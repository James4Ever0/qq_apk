import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;

class ammb
  extends Handler
{
  ammb(amma paramamma) {}
  
  ammb(amma paramamma, Handler paramHandler)
  {
    super(paramHandler.getLooper());
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      throw new RuntimeException("Unknown message " + paramMessage);
    case 1: 
      this.a.jdField_a_of_type_AndroidViewGestureDetector$OnGestureListener.onShowPress(this.a.jdField_a_of_type_AndroidViewMotionEvent);
    }
    do
    {
      return;
      this.a.a();
      return;
    } while (this.a.jdField_a_of_type_AndroidViewGestureDetector$OnDoubleTapListener == null);
    if (!this.a.jdField_a_of_type_Boolean)
    {
      this.a.jdField_a_of_type_AndroidViewGestureDetector$OnDoubleTapListener.onSingleTapConfirmed(this.a.jdField_a_of_type_AndroidViewMotionEvent);
      return;
    }
    this.a.b = true;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     ammb
 * JD-Core Version:    0.7.0.1
 */
import android.view.View;
import com.tencent.mobileqq.activity.aio.FileTransferManager;
import com.tencent.mobileqq.activity.aio.FileTransferManager.Callback;
import java.lang.ref.WeakReference;

public class bss
{
  WeakReference jdField_a_of_type_JavaLangRefWeakReference;
  public WeakReference b;
  
  public bss(FileTransferManager paramFileTransferManager, View paramView, FileTransferManager.Callback paramCallback)
  {
    this.jdField_a_of_type_JavaLangRefWeakReference = new WeakReference(paramView);
    this.b = new WeakReference(paramCallback);
  }
  
  public View a()
  {
    return (View)this.jdField_a_of_type_JavaLangRefWeakReference.get();
  }
  
  public FileTransferManager.Callback a()
  {
    return (FileTransferManager.Callback)this.b.get();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     bss
 * JD-Core Version:    0.7.0.1
 */
import com.tencent.mobileqq.filemanager.widget.SendBottomBar;

public class aczl
  implements Runnable
{
  public aczl(SendBottomBar paramSendBottomBar) {}
  
  public void run()
  {
    new aczm(this).execute(new Object[0]);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aczl
 * JD-Core Version:    0.7.0.1
 */
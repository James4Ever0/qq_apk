import com.tencent.mobileqq.filemanager.core.UniformDownloadMgr;

public class dpv
  implements Runnable
{
  public dpv(UniformDownloadMgr paramUniformDownloadMgr) {}
  
  public void run()
  {
    UniformDownloadMgr.b(this.a, null);
    UniformDownloadMgr.b(this.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     dpv
 * JD-Core Version:    0.7.0.1
 */
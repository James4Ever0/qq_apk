import java.util.concurrent.ThreadFactory;

class evw
  implements ThreadFactory
{
  public Thread newThread(Runnable paramRunnable)
  {
    evv.a();
    paramRunnable = new Thread(paramRunnable, "InfiniteTaskThread_" + evv.b());
    paramRunnable.setDaemon(true);
    return paramRunnable;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     evw
 * JD-Core Version:    0.7.0.1
 */
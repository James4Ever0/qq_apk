import com.tencent.mobileqq.ar.ARRenderModel.ARWorldCupGlobalSceneRenderable;
import com.tencent.mobileqq.worldcup.ARWorldCupMediaPlayerWrapper;
import com.tencent.qphone.base.util.QLog;

class aagi
  implements Runnable
{
  aagi(aagh paramaagh) {}
  
  public void run()
  {
    if ((ARWorldCupGlobalSceneRenderable.a(this.a.a) != null) && (ARWorldCupGlobalSceneRenderable.a(this.a.a).a()))
    {
      ARWorldCupGlobalSceneRenderable.a(this.a.a).a();
      QLog.d("ARWorldCupGlobalSceneRenderable", 2, "mRepeatCheckRunnable run ");
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aagi
 * JD-Core Version:    0.7.0.1
 */
import com.tencent.mobileqq.armap.ARMapActivity;
import com.tencent.mobileqq.armap.map.ARMapEngine;

class aato
  implements Runnable
{
  aato(aatm paramaatm) {}
  
  public void run()
  {
    ARMapEngine localARMapEngine = this.a.a.a;
    ARMapEngine.nativeRequestPOIList();
    localARMapEngine = this.a.a.a;
    ARMapEngine.nativeRequestLbsPOIListByPid("");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aato
 * JD-Core Version:    0.7.0.1
 */
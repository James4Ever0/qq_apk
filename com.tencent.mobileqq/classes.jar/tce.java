import com.tencent.mobileqq.activity.Leba;
import com.tencent.mobileqq.adapter.LebaListViewAdapter;

class tce
  implements Runnable
{
  tce(tcd paramtcd) {}
  
  public void run()
  {
    if ((Leba.a(this.a.a) != null) && (this.a.a.a != null)) {
      this.a.a.a.notifyDataSetChanged();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     tce
 * JD-Core Version:    0.7.0.1
 */
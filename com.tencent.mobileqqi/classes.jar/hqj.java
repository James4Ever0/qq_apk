import com.tencent.open.component.cache.database.DbCacheManager;
import com.tencent.open.component.cache.database.DbCacheService;
import java.util.HashMap;

public class hqj
  implements hqi
{
  public hqj(DbCacheService paramDbCacheService) {}
  
  public void a(DbCacheManager paramDbCacheManager)
  {
    synchronized (this.a.a)
    {
      this.a.a.remove(paramDbCacheManager.a());
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     hqj
 * JD-Core Version:    0.7.0.1
 */
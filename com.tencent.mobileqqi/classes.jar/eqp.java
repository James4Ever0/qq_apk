import com.tencent.mobileqq.activity.photo.AlbumListActivity;
import com.tencent.mobileqq.data.QQAlbumInfo;
import java.util.Comparator;

public class eqp
  implements Comparator
{
  public eqp(AlbumListActivity paramAlbumListActivity) {}
  
  public int a(QQAlbumInfo paramQQAlbumInfo1, QQAlbumInfo paramQQAlbumInfo2)
  {
    return -Long.valueOf(paramQQAlbumInfo1.coverDate).compareTo(Long.valueOf(paramQQAlbumInfo2.coverDate));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     eqp
 * JD-Core Version:    0.7.0.1
 */
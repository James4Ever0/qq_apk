import com.tencent.widget.ExpandableListView;
import java.util.ArrayList;

public class allu
{
  private static ArrayList a;
  public int a;
  public int b;
  public int c;
  public int d;
  
  static
  {
    jdField_a_of_type_JavaUtilArrayList = new ArrayList(5);
  }
  
  private static allu a()
  {
    synchronized (jdField_a_of_type_JavaUtilArrayList)
    {
      if (jdField_a_of_type_JavaUtilArrayList.size() > 0)
      {
        localallu = (allu)jdField_a_of_type_JavaUtilArrayList.remove(0);
        localallu.b();
        return localallu;
      }
      allu localallu = new allu();
      return localallu;
    }
  }
  
  public static allu a(int paramInt)
  {
    return a(2, paramInt, 0, 0);
  }
  
  public static allu a(int paramInt1, int paramInt2)
  {
    return a(1, paramInt1, paramInt2, 0);
  }
  
  public static allu a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    allu localallu = a();
    localallu.d = paramInt1;
    localallu.jdField_a_of_type_Int = paramInt2;
    localallu.b = paramInt3;
    localallu.c = paramInt4;
    return localallu;
  }
  
  public static allu a(long paramLong)
  {
    if (paramLong == 4294967295L) {
      return null;
    }
    allu localallu = a();
    localallu.jdField_a_of_type_Int = ExpandableListView.c(paramLong);
    if (ExpandableListView.b(paramLong) == 1)
    {
      localallu.d = 1;
      localallu.b = ExpandableListView.d(paramLong);
      return localallu;
    }
    localallu.d = 2;
    return localallu;
  }
  
  private void b()
  {
    this.jdField_a_of_type_Int = 0;
    this.b = 0;
    this.c = 0;
    this.d = 0;
  }
  
  public long a()
  {
    if (this.d == 1) {
      return ExpandableListView.a(this.jdField_a_of_type_Int, this.b);
    }
    return ExpandableListView.b(this.jdField_a_of_type_Int);
  }
  
  public void a()
  {
    synchronized (jdField_a_of_type_JavaUtilArrayList)
    {
      if (jdField_a_of_type_JavaUtilArrayList.size() < 5) {
        jdField_a_of_type_JavaUtilArrayList.add(this);
      }
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     allu
 * JD-Core Version:    0.7.0.1
 */
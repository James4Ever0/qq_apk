import android.text.TextUtils;
import com.tencent.av.random.RandomWebProtocol;
import com.tencent.av.random.RandomWebProtocol.OnRequestListener;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class jle
  extends Thread
{
  List jdField_a_of_type_JavaUtilList = new ArrayList();
  jlf jdField_a_of_type_Jlf;
  jlk jdField_a_of_type_Jlk;
  boolean jdField_a_of_type_Boolean = false;
  
  public jle(RandomWebProtocol paramRandomWebProtocol, jlf paramjlf)
  {
    this.jdField_a_of_type_JavaUtilList.addAll(paramRandomWebProtocol.jdField_a_of_type_JavaUtilList);
    this.jdField_a_of_type_Jlf = paramjlf;
  }
  
  public void a()
  {
    this.jdField_a_of_type_JavaUtilList.clear();
    this.jdField_a_of_type_Boolean = true;
  }
  
  void a(boolean paramBoolean, int paramInt)
  {
    if (QLog.isColorLevel()) {
      QLog.d("RandomWebProtocol", 2, "[randomWeb] quitMatch. result: " + paramInt);
    }
    if ((paramBoolean) && (!this.jdField_a_of_type_Boolean) && (this.jdField_a_of_type_Jlk != null))
    {
      Iterator localIterator = this.jdField_a_of_type_JavaUtilList.iterator();
      while (localIterator.hasNext()) {
        ((RandomWebProtocol.OnRequestListener)localIterator.next()).a(paramInt, this.jdField_a_of_type_Jlk);
      }
    }
    a();
    if (this.jdField_a_of_type_Jlf != null) {
      RandomWebProtocol.a(this.jdField_a_of_type_ComTencentAvRandomRandomWebProtocol).remove(this.jdField_a_of_type_Jlf.d);
    }
  }
  
  public void run()
  {
    this.jdField_a_of_type_Jlk = null;
    if (QLog.isColorLevel()) {
      QLog.d("RandomWebProtocol", 2, "[random room owner] realRequest.reqtype:" + this.jdField_a_of_type_Jlf.a);
    }
    if (this.jdField_a_of_type_Jlf != null)
    {
      if (1 != this.jdField_a_of_type_Jlf.a) {
        break label106;
      }
      this.jdField_a_of_type_Jlk = new jll();
    }
    while ((this.jdField_a_of_type_Jlf == null) || (this.jdField_a_of_type_Jlk == null) || (TextUtils.isEmpty(this.jdField_a_of_type_Jlf.c)))
    {
      a(true, -2);
      return;
      label106:
      if (2 == this.jdField_a_of_type_Jlf.a) {
        this.jdField_a_of_type_Jlk = new jln(this.jdField_a_of_type_ComTencentAvRandomRandomWebProtocol);
      } else if (3 == this.jdField_a_of_type_Jlf.a) {
        this.jdField_a_of_type_Jlk = new jlo(this.jdField_a_of_type_ComTencentAvRandomRandomWebProtocol);
      } else if ((4 == this.jdField_a_of_type_Jlf.a) || (5 == this.jdField_a_of_type_Jlf.a)) {
        this.jdField_a_of_type_Jlk = new jlp(this.jdField_a_of_type_ComTencentAvRandomRandomWebProtocol);
      }
    }
    String str1 = this.jdField_a_of_type_Jlf.a();
    if (QLog.isColorLevel()) {
      QLog.d("RandomWebProtocol", 2, "[randomWeb] [random room owner][1v1] json post:" + str1);
    }
    if (this.jdField_a_of_type_Boolean)
    {
      a(false, -2);
      return;
    }
    long l = System.currentTimeMillis();
    if (System.currentTimeMillis() - l < this.jdField_a_of_type_Jlk.c)
    {
      if (this.jdField_a_of_type_Boolean)
      {
        a(false, -2);
        return;
      }
      String str2 = RandomWebProtocol.a(this.jdField_a_of_type_Jlf.c, str1, null);
      if (QLog.isColorLevel()) {
        QLog.d("RandomWebProtocol", 2, "[randomWeb][random room owner][1v1] json result:" + str2);
      }
      this.jdField_a_of_type_Jlk.a(str2);
      int i = this.jdField_a_of_type_Jlk.b;
      switch (i)
      {
      default: 
        i = 1;
      case 0: 
      case 1: 
      case 1000: 
      case 2: 
      case -1002: 
      case -1: 
      case 7: 
        while (i != 0)
        {
          try
          {
            Thread.sleep(this.jdField_a_of_type_Jlk.d);
          }
          catch (InterruptedException localInterruptedException)
          {
            localInterruptedException.printStackTrace();
          }
          break;
          if (((this.jdField_a_of_type_Jlk instanceof jll)) && (i == 1))
          {
            a(true, 1);
            return;
          }
          a(true, 0);
          return;
          if ((this.jdField_a_of_type_Jlk instanceof jlp)) {
            i = 1;
          } else {
            i = 0;
          }
        }
      case -1003: 
      case -1000: 
      case 6: 
      case 8: 
      case 10: 
      case 11: 
      case 12: 
        a(true, -2);
        return;
      case -1015: 
      case 13: 
        a(true, -3);
        return;
      case 4: 
        a(true, -1);
        return;
      }
      a(true, 100);
      return;
    }
    a(true, -1);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     jle
 * JD-Core Version:    0.7.0.1
 */
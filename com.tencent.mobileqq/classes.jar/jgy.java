import com.tencent.av.business.manager.report.VideoNodeReporter;
import com.tencent.qphone.base.util.QLog;
import java.util.Iterator;
import java.util.List;

public class jgy
  implements Runnable
{
  public jgy(VideoNodeReporter paramVideoNodeReporter, long paramLong) {}
  
  public void run()
  {
    if (this.jdField_a_of_type_ComTencentAvBusinessManagerReportVideoNodeReporter.a.size() > 0)
    {
      Iterator localIterator = this.jdField_a_of_type_ComTencentAvBusinessManagerReportVideoNodeReporter.a.iterator();
      while (localIterator.hasNext())
      {
        jhd localjhd = (jhd)localIterator.next();
        if (localjhd.jdField_a_of_type_Long == -1L)
        {
          localjhd.jdField_a_of_type_Long = this.jdField_a_of_type_Long;
          this.jdField_a_of_type_ComTencentAvBusinessManagerReportVideoNodeReporter.a(this.jdField_a_of_type_Long, 26, this.jdField_a_of_type_Long);
          QLog.d("VideoNodeReporter", 1, "updateCallerRoomId  updated roomId = " + this.jdField_a_of_type_Long);
          VideoNodeReporter.a(this.jdField_a_of_type_ComTencentAvBusinessManagerReportVideoNodeReporter, -1L);
        }
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     jgy
 * JD-Core Version:    0.7.0.1
 */
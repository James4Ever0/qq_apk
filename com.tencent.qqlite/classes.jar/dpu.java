import com.tencent.mobileqq.filemanager.core.UniformDownloadMgr;
import com.tencent.mobileqq.filemanager.util.UniformDownloader;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dpu
  implements Runnable
{
  public dpu(UniformDownloadMgr paramUniformDownloadMgr) {}
  
  public void run()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject4;
    Object localObject5;
    synchronized (UniformDownloadMgr.a(this.a))
    {
      localObject4 = UniformDownloadMgr.a(this.a).values().iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject5 = (dqd)((Iterator)localObject4).next();
        if ((((dqd)localObject5).jdField_a_of_type_ComTencentMobileqqFilemanagerUtilUniformDownloader != null) && (8 == ((dqd)localObject5).jdField_a_of_type_ComTencentMobileqqFilemanagerUtilUniformDownloader.f()) && (2 == ((dqd)localObject5).jdField_a_of_type_ComTencentMobileqqFilemanagerUtilUniformDownloader.g())) {
          localArrayList.add(localObject5);
        }
      }
    }
    ??? = localObject2.iterator();
    Object localObject3;
    while (((Iterator)???).hasNext())
    {
      localObject3 = (dqd)((Iterator)???).next();
      QLog.w("UniformDownloadMgr<FileAssistant>", 1, "[UniformDL] >>> resumeRuningGenDownloadOfOldApp, url:[" + ((dqd)localObject3).jdField_a_of_type_JavaLangString + "]");
      ((dqd)localObject3).jdField_a_of_type_ComTencentMobileqqFilemanagerUtilUniformDownloader.a();
    }
    if (UniformDownloadMgr.a(this.a))
    {
      QLog.i("UniformDownloadMgr<FileAssistant>", 1, "[UniformDL] >>>resumeRuningDownloadPreMobileQQReboot. start resume");
      localObject3 = this.a.a();
      this.a.c();
      ??? = new HashMap();
      if ((localObject3 != null) && (((Map)localObject3).size() > 0))
      {
        localObject3 = ((Map)localObject3).entrySet().iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject5 = (Map.Entry)((Iterator)localObject3).next();
          localObject4 = (String)((Map.Entry)localObject5).getKey();
          localObject5 = (dqe)((Map.Entry)localObject5).getValue();
          if (localObject5 != null)
          {
            if (((dqe)localObject5).jdField_a_of_type_Boolean)
            {
              ((Map)???).put(localObject4, localObject5);
            }
            else
            {
              QLog.i("UniformDownloadMgr<FileAssistant>", 1, "[UniformDL] >>>resumeRuningDownloadPreMobileQQReboot, url:[" + (String)localObject4 + "]" + " nId:[" + ((dqe)localObject5).jdField_a_of_type_Int + "] - 1");
              UniformDownloadMgr.a(this.a, (String)localObject4, ((dqe)localObject5).jdField_a_of_type_JavaLangString, ((dqe)localObject5).jdField_a_of_type_Long, ((dqe)localObject5).jdField_a_of_type_Int, true);
            }
          }
          else {
            QLog.e("UniformDownloadMgr<FileAssistant>", 1, "[UniformDL] resumeRuningDownloadPreMobileQQReboot, value error. url:[" + (String)localObject4 + "] -1");
          }
        }
      }
      if (((Map)???).size() > 0)
      {
        ??? = ((Map)???).entrySet().iterator();
        while (((Iterator)???).hasNext())
        {
          localObject4 = (Map.Entry)((Iterator)???).next();
          localObject3 = (String)((Map.Entry)localObject4).getKey();
          localObject4 = (dqe)((Map.Entry)localObject4).getValue();
          if (localObject4 != null)
          {
            QLog.i("UniformDownloadMgr<FileAssistant>", 1, "[UniformDL] >>>resumeRuningDownloadPreMobileQQReboot, url:[" + (String)localObject3 + "]" + " nId:[" + ((dqe)localObject4).jdField_a_of_type_Int + "] - 2");
            UniformDownloadMgr.a(this.a, (String)localObject3, ((dqe)localObject4).jdField_a_of_type_JavaLangString, ((dqe)localObject4).jdField_a_of_type_Long, ((dqe)localObject4).jdField_a_of_type_Int, true);
          }
          else
          {
            QLog.e("UniformDownloadMgr<FileAssistant>", 1, "[UniformDL] resumeRuningDownloadPreMobileQQReboot, value error. url:[" + (String)localObject3 + "] -2");
          }
        }
      }
    }
    else
    {
      QLog.i("UniformDownloadMgr<FileAssistant>", 1, "[UniformDL] >>>resumeRuningDownloadPreMobileQQReboot. not resume");
      this.a.c();
    }
    UniformDownloadMgr.b(this.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     dpu
 * JD-Core Version:    0.7.0.1
 */
import com.tencent.biz.qqstory.database.PublishVideoEntry;
import com.tencent.biz.qqstory.utils.ffmpeg.ExecuteBinResponseCallback;
import com.tencent.mobileqq.activity.aio.photo.PeakActivity;
import com.tencent.mobileqq.utils.FileUtils;
import com.tencent.qphone.base.util.QLog;

class aogr
  extends ExecuteBinResponseCallback
{
  aogr(aogp paramaogp, String paramString1, PeakActivity paramPeakActivity, String paramString2, String paramString3, PublishVideoEntry paramPublishVideoEntry) {}
  
  public void a(boolean paramBoolean)
  {
    if (QLog.isColorLevel()) {
      QLog.d("SaveVideoActivity", 2, "combine music finish: " + paramBoolean);
    }
    FileUtils.d(this.jdField_a_of_type_JavaLangString);
    if (paramBoolean)
    {
      aogp.a(this.jdField_a_of_type_Aogp, this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoPeakActivity, this.b, this.c, this.jdField_a_of_type_ComTencentBizQqstoryDatabasePublishVideoEntry);
      return;
    }
    aogp.a(this.jdField_a_of_type_Aogp, 1, this.jdField_a_of_type_ComTencentBizQqstoryDatabasePublishVideoEntry);
  }
  
  public void b(String paramString)
  {
    aogp.a(this.jdField_a_of_type_Aogp, 1, this.jdField_a_of_type_ComTencentBizQqstoryDatabasePublishVideoEntry);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     aogr
 * JD-Core Version:    0.7.0.1
 */
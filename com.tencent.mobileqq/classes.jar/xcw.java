import com.tencent.mobileqq.activity.photo.LocalMediaInfo;
import com.tencent.mobileqq.activity.photo.PhotoListActivity;
import cooperation.qzone.util.XMPCoreUtil.XMPCoreJarLoadListener;

public class xcw
  implements XMPCoreUtil.XMPCoreJarLoadListener
{
  public xcw(PhotoListActivity paramPhotoListActivity, LocalMediaInfo paramLocalMediaInfo) {}
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if ((this.jdField_a_of_type_ComTencentMobileqqActivityPhotoLocalMediaInfo.rotation == 90) && (this.jdField_a_of_type_ComTencentMobileqqActivityPhotoLocalMediaInfo.mediaWidth < this.jdField_a_of_type_ComTencentMobileqqActivityPhotoLocalMediaInfo.mediaHeight))
      {
        int i = this.jdField_a_of_type_ComTencentMobileqqActivityPhotoLocalMediaInfo.mediaHeight;
        this.jdField_a_of_type_ComTencentMobileqqActivityPhotoLocalMediaInfo.mediaHeight = this.jdField_a_of_type_ComTencentMobileqqActivityPhotoLocalMediaInfo.mediaWidth;
        this.jdField_a_of_type_ComTencentMobileqqActivityPhotoLocalMediaInfo.mediaWidth = i;
        this.jdField_a_of_type_ComTencentMobileqqActivityPhotoLocalMediaInfo.setPanoramaType();
      }
    }
    else {
      return;
    }
    this.jdField_a_of_type_ComTencentMobileqqActivityPhotoLocalMediaInfo.setPanoramaType();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xcw
 * JD-Core Version:    0.7.0.1
 */
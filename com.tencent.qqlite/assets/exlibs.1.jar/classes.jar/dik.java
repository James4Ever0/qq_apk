import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.filemanager.activity.cloudfile.QfileBaseCloudFileTabView;
import com.tencent.mobileqq.filemanager.app.FileManagerEngine;
import com.tencent.mobileqq.filemanager.core.FileManagerDataCenter;
import com.tencent.mobileqq.filemanager.data.FileManagerEntity;
import com.tencent.mobileqq.filemanager.data.WeiYunFileInfo;
import com.tencent.mobileqq.filemanager.util.FMDialogUtil.FMDialogInterface;
import com.tencent.mobileqq.filemanager.util.FileManagerUtil;

class dik
  implements FMDialogUtil.FMDialogInterface
{
  dik(dih paramdih, WeiYunFileInfo paramWeiYunFileInfo) {}
  
  public void a()
  {
    FileManagerEntity localFileManagerEntity = FileManagerUtil.a(this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataWeiYunFileInfo);
    QfileBaseCloudFileTabView.k(this.jdField_a_of_type_Dih.a).a().a(localFileManagerEntity);
    QfileBaseCloudFileTabView.l(this.jdField_a_of_type_Dih.a).a().a(localFileManagerEntity);
    this.jdField_a_of_type_Dih.a.a(localFileManagerEntity);
  }
  
  public void b() {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     dik
 * JD-Core Version:    0.7.0.1
 */
import android.app.Activity;
import android.content.res.Resources;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.tencent.image.Utils;
import com.tencent.mobileqq.activity.aio.photo.AIOGalleryScene;
import com.tencent.mobileqq.activity.aio.photo.AIOGalleryUtils;
import com.tencent.mobileqq.activity.aio.photo.AIOImageData;
import com.tencent.mobileqq.activity.aio.photo.AIOImageInfo;
import com.tencent.mobileqq.activity.aio.photo.IAIOImageProvider;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.ActionSheet;
import com.tencent.widget.ActionSheet.OnButtonClickListener;
import cooperation.qqfav.QfavBuilder;
import cooperation.qqfav.QfavReport;
import java.io.File;

public class byc
  implements ActionSheet.OnButtonClickListener
{
  public byc(AIOGalleryScene paramAIOGalleryScene, ActionSheet paramActionSheet, AIOImageInfo paramAIOImageInfo, File paramFile) {}
  
  public void a(View paramView, int paramInt)
  {
    if (paramView != null)
    {
      paramView = this.jdField_a_of_type_ComTencentWidgetActionSheet.a(paramInt);
      if (paramView == null) {
        return;
      }
      if (!TextUtils.isEmpty(paramView))
      {
        if (!paramView.equals(AIOGalleryScene.c(this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOGalleryScene).getResources().getString(2131363930))) {
          break label159;
        }
        this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOGalleryScene.a(this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOImageInfo);
        if (!paramView.equals(AIOGalleryScene.f(this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOGalleryScene).getResources().getString(2131363933))) {
          break label285;
        }
      }
    }
    for (;;)
    {
      try
      {
        paramView = this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOGalleryScene.a.a(this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOImageInfo.a.a, this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOImageInfo.a.d);
        if (paramView != null) {
          continue;
        }
        QfavBuilder.b(this.jdField_a_of_type_JavaIoFile.getAbsolutePath()).a(AIOGalleryScene.g(this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOGalleryScene), this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOGalleryScene.b);
        QfavReport.a(null, 40, 3);
      }
      catch (RemoteException paramView)
      {
        label159:
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.e("AIOGalleryScene", 2, "", paramView);
        QQToast.a(AIOGalleryScene.i(this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOGalleryScene).getApplicationContext(), AIOGalleryScene.j(this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOGalleryScene).getString(2131363407), 0).a();
        continue;
      }
      this.jdField_a_of_type_ComTencentWidgetActionSheet.dismiss();
      return;
      if (!paramView.equals(AIOGalleryScene.d(this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOGalleryScene).getResources().getString(2131363934))) {
        break;
      }
      AIOGalleryUtils.a(AIOGalleryScene.e(this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOGalleryScene), this.jdField_a_of_type_JavaIoFile, Utils.Crc64String(this.jdField_a_of_type_JavaIoFile.getAbsolutePath()));
      break;
      new QfavBuilder(paramView).a(AIOGalleryScene.h(this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOGalleryScene), this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOGalleryScene.b);
      continue;
      label285:
      if (paramView.equals(AIOGalleryScene.k(this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOGalleryScene).getResources().getString(2131363935))) {
        this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOGalleryScene.q();
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     byc
 * JD-Core Version:    0.7.0.1
 */
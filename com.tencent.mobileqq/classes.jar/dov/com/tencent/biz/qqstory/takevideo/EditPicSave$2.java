package dov.com.tencent.biz.qqstory.takevideo;

import android.support.annotation.NonNull;
import com.tencent.biz.qqstory.support.logging.SLog;
import com.tencent.mobileqq.app.HardCodeUtil;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.widget.QQToast;
import com.tribe.async.reactive.SimpleObserver;
import dov.com.tencent.biz.qqstory.takevideo.publish.GenerateContext;
import dov.com.tencent.biz.qqstory.takevideo.publish.GeneratePicArgs;

class EditPicSave$2
  extends SimpleObserver<GenerateContext>
{
  EditPicSave$2(EditPicSave paramEditPicSave) {}
  
  public void a(GenerateContext paramGenerateContext)
  {
    super.onNext(paramGenerateContext);
    this.a.a(40);
    paramGenerateContext = paramGenerateContext.a.b;
    SLog.b("EditPicSave", "picPath = " + paramGenerateContext);
    if (this.a.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoUi.getActivity() != null)
    {
      ThreadManager.excute(new EditPicSave.2.1(this, paramGenerateContext), 64, this.a.jdField_a_of_type_ComTencentMobileqqAppThreadExcutor$IThreadListener, true);
      this.a.jdField_a_of_type_Int = 40;
      this.a.jdField_a_of_type_Boolean = false;
      this.a.b = 10;
      this.a.b();
    }
  }
  
  public void onCancel()
  {
    super.onCancel();
    SLog.d("EditPicSave", "saveVideo cancel !");
    if (!EditPicSave.a(this.a))
    {
      if (this.a.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoPartManager.a.a() == 14) {
        this.a.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoPartManager.b = false;
      }
      this.a.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoPartManager.a(0);
    }
    this.a.c();
    QQToast.a(this.a.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoUi.a(), HardCodeUtil.a(2131703715), 0).a();
  }
  
  public void onError(@NonNull Error paramError)
  {
    super.onError(paramError);
    SLog.e("EditPicSave", "saveVideo error ：" + paramError);
    if (!EditPicSave.a(this.a))
    {
      if (this.a.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoPartManager.a.a() == 14) {
        this.a.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoPartManager.b = false;
      }
      this.a.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoPartManager.a(0);
    }
    QQToast.a(this.a.jdField_a_of_type_DovComTencentBizQqstoryTakevideoEditVideoUi.a(), 1, HardCodeUtil.a(2131703717) + paramError, 0).a();
    this.a.c();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes14.jar
 * Qualified Name:     dov.com.tencent.biz.qqstory.takevideo.EditPicSave.2
 * JD-Core Version:    0.7.0.1
 */
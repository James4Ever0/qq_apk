import android.widget.Button;
import com.tencent.mobileqq.richmedia.capture.fragment.CameraCaptureFragment;
import com.tencent.mobileqq.richmedia.capture.view.CameraCaptureView;

public class ahih
  implements Runnable
{
  public ahih(CameraCaptureFragment paramCameraCaptureFragment, boolean paramBoolean) {}
  
  public void run()
  {
    if (!CameraCaptureFragment.c(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureFragmentCameraCaptureFragment))
    {
      if (!this.jdField_a_of_type_Boolean) {
        break label73;
      }
      if (!CameraCaptureFragment.d(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureFragmentCameraCaptureFragment))
      {
        this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureFragmentCameraCaptureFragment.e.setVisibility(0);
        this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureFragmentCameraCaptureFragment.e.setSelected(true);
        this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureFragmentCameraCaptureFragment.a.c(this.jdField_a_of_type_Boolean);
        CameraCaptureFragment.c(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureFragmentCameraCaptureFragment, false);
      }
    }
    return;
    label73:
    this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureFragmentCameraCaptureFragment.e.setVisibility(8);
    this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureFragmentCameraCaptureFragment.e.setSelected(false);
    this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureFragmentCameraCaptureFragment.a.c(this.jdField_a_of_type_Boolean);
    CameraCaptureFragment.c(this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureFragmentCameraCaptureFragment, false);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     ahih
 * JD-Core Version:    0.7.0.1
 */
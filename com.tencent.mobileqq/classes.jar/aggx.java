import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.tencent.image.URLDrawable;
import com.tencent.image.URLDrawable.URLDrawableOptions;
import com.tencent.mobileqq.ocr.activity.ScanOcrActivity;
import com.tencent.mobileqq.ocr.view.MaskView;
import com.tencent.qphone.base.util.QLog;
import java.io.File;

class aggx
  implements Runnable
{
  aggx(aggr paramaggr, String paramString) {}
  
  public void run()
  {
    if ((!TextUtils.isEmpty(this.jdField_a_of_type_JavaLangString)) && (new File(this.jdField_a_of_type_JavaLangString).exists()))
    {
      long l = System.currentTimeMillis() - ScanOcrActivity.a(this.jdField_a_of_type_Aggr.a);
      if (this.jdField_a_of_type_Aggr.a.jdField_a_of_type_Int == 1)
      {
        Object localObject = URLDrawable.URLDrawableOptions.obtain();
        localObject = URLDrawable.getDrawable(new File(this.jdField_a_of_type_JavaLangString), (URLDrawable.URLDrawableOptions)localObject);
        ((URLDrawable)localObject).downloadImediatly();
        this.jdField_a_of_type_Aggr.a.jdField_a_of_type_ComTencentMobileqqOcrViewMaskView.setPreviewDrawable((Drawable)localObject);
        ScanOcrActivity.a(this.jdField_a_of_type_Aggr.a, this.jdField_a_of_type_JavaLangString, true);
        return;
      }
      if (l > 900L)
      {
        ScanOcrActivity.a(this.jdField_a_of_type_Aggr.a, this.jdField_a_of_type_JavaLangString, false);
        return;
      }
      ScanOcrActivity.a(this.jdField_a_of_type_Aggr.a).postDelayed(new aggy(this), 900L - l);
      return;
    }
    ScanOcrActivity.a(this.jdField_a_of_type_Aggr.a, false);
    QLog.d("Q.ocr.ScanOcrActivity", 1, "onTakePicFinish failed!");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aggx
 * JD-Core Version:    0.7.0.1
 */
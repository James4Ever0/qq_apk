import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.av.VideoController;
import com.tencent.av.app.SessionInfo;
import com.tencent.av.gaudio.AVPhoneUserInfo;
import com.tencent.av.gaudio.AVPhoneUserInfo.TelInfo;
import com.tencent.av.ui.GAudioMemberListCtrl;
import com.tencent.av.utils.PstnUtils;
import com.tencent.mobileqq.utils.ContactUtils;
import com.tencent.qphone.base.util.QLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class juv
  extends BaseAdapter
{
  private juv(GAudioMemberListCtrl paramGAudioMemberListCtrl) {}
  
  juw a(View paramView)
  {
    juw localjuw = new juw(this.a, null);
    localjuw.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)paramView.findViewById(2131365944));
    localjuw.jdField_a_of_type_AndroidWidgetTextView = ((TextView)paramView.findViewById(2131365946));
    localjuw.jdField_b_of_type_AndroidWidgetTextView = ((TextView)paramView.findViewById(2131365945));
    localjuw.jdField_b_of_type_AndroidWidgetImageView = ((ImageView)paramView.findViewById(2131365950));
    localjuw.jdField_b_of_type_AndroidWidgetImageView.setOnClickListener(this.a.jdField_a_of_type_AndroidViewView$OnClickListener);
    return localjuw;
  }
  
  public int getCount()
  {
    return this.a.jdField_a_of_type_JavaUtilArrayList.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.a.jdField_a_of_type_JavaUtilArrayList.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    juu localjuu = (juu)this.a.jdField_a_of_type_JavaUtilArrayList.get(paramInt);
    Object localObject;
    if (paramView == null)
    {
      paramView = this.a.jdField_a_of_type_AndroidViewLayoutInflater.inflate(2130969289, null);
      paramViewGroup = a(paramView);
      paramView.setTag(paramViewGroup);
      paramViewGroup.jdField_b_of_type_AndroidWidgetImageView.setTag(localjuu);
      if ((localjuu.jdField_a_of_type_JavaLangString == null) || (localjuu.jdField_a_of_type_AndroidGraphicsBitmap == null) || (!localjuu.jdField_b_of_type_Boolean))
      {
        if (localjuu.jdField_a_of_type_Int != 0) {
          break label450;
        }
        localObject = String.valueOf(localjuu.jdField_a_of_type_Long);
        localjuu.jdField_a_of_type_JavaLangString = this.a.jdField_a_of_type_ComTencentAvVideoController.a((String)localObject, String.valueOf(this.a.jdField_a_of_type_Long), this.a.jdField_a_of_type_Int);
        if (localjuu.jdField_a_of_type_JavaLangString.compareTo((String)localObject) == 0) {
          break label426;
        }
        localjuu.jdField_b_of_type_Boolean = true;
        label149:
        localObject = this.a.jdField_a_of_type_ComTencentAvVideoController.a((String)localObject, String.valueOf(this.a.jdField_a_of_type_Long), this.a.jdField_a_of_type_Int, false, true);
        if (localObject == null) {
          break label435;
        }
        localjuu.jdField_a_of_type_AndroidGraphicsBitmap = ((Bitmap)localObject);
      }
      label194:
      paramViewGroup.jdField_b_of_type_Boolean = true;
      paramViewGroup.jdField_a_of_type_Long = localjuu.jdField_a_of_type_Long;
      if (localjuu.jdField_a_of_type_JavaLangString == null) {
        break label716;
      }
      paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setText(localjuu.jdField_a_of_type_JavaLangString);
      label228:
      if (localjuu.jdField_a_of_type_AndroidGraphicsBitmap == null) {
        break label758;
      }
      if ((localjuu.jdField_a_of_type_Int == 0) || (localjuu.jdField_b_of_type_JavaLangString == null)) {
        break label734;
      }
      paramViewGroup.jdField_b_of_type_AndroidWidgetTextView.setVisibility(0);
      paramViewGroup.jdField_b_of_type_AndroidWidgetTextView.setText(localjuu.jdField_b_of_type_JavaLangString);
      localObject = ((BitmapDrawable)((Context)this.a.jdField_a_of_type_JavaLangRefWeakReference.get()).getResources().getDrawable(2130840183)).getBitmap();
      paramViewGroup.jdField_a_of_type_AndroidWidgetImageView.setImageBitmap((Bitmap)localObject);
      label310:
      if (!localjuu.c) {
        break label780;
      }
      if ((paramViewGroup.jdField_a_of_type_Int == -1) || (paramViewGroup.jdField_a_of_type_Int == 0))
      {
        this.a.a(paramViewGroup.jdField_b_of_type_AndroidWidgetImageView, localjuu.c);
        paramViewGroup.jdField_a_of_type_Int = 1;
      }
      localjuu.jdField_a_of_type_Boolean = false;
    }
    for (;;)
    {
      paramViewGroup.jdField_a_of_type_Boolean = localjuu.jdField_a_of_type_Boolean;
      if (!paramViewGroup.jdField_a_of_type_Boolean) {
        break label820;
      }
      paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setCompoundDrawablesWithIntrinsicBounds(null, null, this.a.jdField_a_of_type_AndroidGraphicsDrawableDrawable, null);
      return paramView;
      localObject = (juw)paramView.getTag();
      paramViewGroup = (ViewGroup)localObject;
      if (localObject == null)
      {
        paramViewGroup = a(paramView);
        paramView.setTag(paramViewGroup);
      }
      break;
      label426:
      localjuu.jdField_b_of_type_Boolean = false;
      break label149;
      label435:
      localjuu.jdField_a_of_type_AndroidGraphicsBitmap = null;
      localjuu.jdField_b_of_type_Boolean = false;
      break label194;
      label450:
      long l = localjuu.jdField_a_of_type_Long;
      if (localjuu.jdField_a_of_type_ComTencentAvGaudioAVPhoneUserInfo != null)
      {
        localObject = localjuu.jdField_a_of_type_ComTencentAvGaudioAVPhoneUserInfo;
        label472:
        if ((localObject == null) || (((AVPhoneUserInfo)localObject).telInfo.mobile == null)) {
          break label640;
        }
        localjuu.jdField_a_of_type_JavaLangString = ((AVPhoneUserInfo)localObject).telInfo.mobile;
        String str = this.a.jdField_a_of_type_ComTencentAvVideoController.a(((AVPhoneUserInfo)localObject).telInfo.mobile);
        if (str == null) {
          break label614;
        }
        localjuu.jdField_b_of_type_JavaLangString = ContactUtils.a(str);
        localjuu.jdField_a_of_type_JavaLangString = str;
      }
      for (;;)
      {
        localjuu.jdField_a_of_type_AndroidGraphicsBitmap = ((BitmapDrawable)((Context)this.a.jdField_a_of_type_JavaLangRefWeakReference.get()).getResources().getDrawable(2130840217)).getBitmap();
        localjuu.jdField_b_of_type_Boolean = true;
        break;
        localObject = this.a.jdField_a_of_type_ComTencentAvVideoController.a(l, this.a.jdField_a_of_type_ComTencentAvVideoController.a().f);
        break label472;
        label614:
        localjuu.jdField_b_of_type_JavaLangString = null;
        localjuu.jdField_a_of_type_JavaLangString = PstnUtils.a(((AVPhoneUserInfo)localObject).telInfo.mobile, 4);
        continue;
        label640:
        if ((localObject != null) && (QLog.isColorLevel())) {
          QLog.d("GAudioMemberListCtrl", 2, "getView --> can not get Open Id. PhoneInfo = " + ((AVPhoneUserInfo)localObject).toString());
        }
        localjuu.jdField_b_of_type_JavaLangString = null;
        localjuu.jdField_a_of_type_JavaLangString = ((Context)this.a.jdField_a_of_type_JavaLangRefWeakReference.get()).getResources().getString(2131428928);
      }
      label716:
      paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setText(String.valueOf(localjuu.jdField_a_of_type_Long));
      break label228;
      label734:
      paramViewGroup.jdField_b_of_type_AndroidWidgetTextView.setVisibility(8);
      paramViewGroup.jdField_a_of_type_AndroidWidgetImageView.setImageBitmap(localjuu.jdField_a_of_type_AndroidGraphicsBitmap);
      break label310;
      label758:
      paramViewGroup.jdField_b_of_type_AndroidWidgetTextView.setVisibility(8);
      paramViewGroup.jdField_a_of_type_AndroidWidgetImageView.setImageResource(2130839128);
      break label310;
      label780:
      if ((paramViewGroup.jdField_a_of_type_Int == -1) || (paramViewGroup.jdField_a_of_type_Int == 1))
      {
        this.a.a(paramViewGroup.jdField_b_of_type_AndroidWidgetImageView, localjuu.c);
        paramViewGroup.jdField_a_of_type_Int = 0;
      }
    }
    label820:
    paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    return paramView;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     juv
 * JD-Core Version:    0.7.0.1
 */
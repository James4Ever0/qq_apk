import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.mobileqq.profile.PersonalityLabel.CornerImageView;
import com.tencent.mobileqq.profile.PersonalityLabel.PersonalityLabelGalleryActivity;
import com.tencent.mobileqq.widget.MessageProgressView;

public class agtc
  extends RecyclerView.ViewHolder
{
  ImageView jdField_a_of_type_AndroidWidgetImageView;
  public RelativeLayout a;
  public MessageProgressView a;
  public ImageView b;
  
  public agtc(PersonalityLabelGalleryActivity paramPersonalityLabelGalleryActivity, View paramView)
  {
    super(paramView);
    float f = 2.0F * PersonalityLabelGalleryActivity.a(paramPersonalityLabelGalleryActivity);
    this.jdField_a_of_type_AndroidWidgetRelativeLayout = ((RelativeLayout)paramView.findViewById(2131370955));
    this.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)paramView.findViewById(2131365239));
    ((CornerImageView)this.jdField_a_of_type_AndroidWidgetImageView).setRadius(f);
    ((CornerImageView)this.jdField_a_of_type_AndroidWidgetImageView).setPressMask(true);
    this.b = ((ImageView)paramView.findViewById(2131370956));
    ((CornerImageView)this.b).setRadius(f);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     agtc
 * JD-Core Version:    0.7.0.1
 */
package dov.com.tencent.biz.qqstory.takevideo.filter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class VideoEffectsFilterData$VideoEffectsFilterPageItem
  extends FilterData.FilterPageItem
{
  public final ImageView a;
  public final TextView a;
  public final TextView b = (TextView)this.jdField_a_of_type_AndroidViewView.findViewById(2131371754);
  
  VideoEffectsFilterData$VideoEffectsFilterPageItem(VideoEffectsFilterData paramVideoEffectsFilterData, @NonNull Context paramContext, ViewGroup paramViewGroup)
  {
    super(paramContext, paramViewGroup);
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)this.jdField_a_of_type_AndroidViewView.findViewById(2131363651));
    this.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)this.jdField_a_of_type_AndroidViewView.findViewById(2131361846));
  }
  
  protected View a(@NonNull Context paramContext, ViewGroup paramViewGroup)
  {
    return LayoutInflater.from(paramContext).inflate(2130970752, paramViewGroup, false);
  }
  
  public void a()
  {
    super.a();
    this.jdField_a_of_type_AndroidWidgetTextView.setVisibility(4);
    this.jdField_a_of_type_AndroidWidgetImageView.setVisibility(4);
  }
  
  public void a(VideoEffectsFilterData paramVideoEffectsFilterData, int paramInt)
  {
    super.a(paramVideoEffectsFilterData, paramInt);
    if ((this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoFilterFilterData != null) && (((VideoEffectsFilterData)this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoFilterFilterData).c != 0) && (((VideoEffectsFilterData)this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoFilterFilterData).a != null))
    {
      this.jdField_a_of_type_AndroidWidgetImageView.setVisibility(0);
      this.jdField_a_of_type_AndroidWidgetImageView.setImageResource(((VideoEffectsFilterData)this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoFilterFilterData).c);
      this.jdField_a_of_type_AndroidWidgetTextView.setVisibility(0);
      this.jdField_a_of_type_AndroidWidgetTextView.setText(((VideoEffectsFilterData)this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoFilterFilterData).a);
      this.b.setText(((VideoEffectsFilterData)this.jdField_a_of_type_DovComTencentBizQqstoryTakevideoFilterFilterData).b);
      return;
    }
    this.jdField_a_of_type_AndroidWidgetImageView.setVisibility(4);
    this.jdField_a_of_type_AndroidWidgetTextView.setVisibility(4);
    this.b.setText("");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     dov.com.tencent.biz.qqstory.takevideo.filter.VideoEffectsFilterData.VideoEffectsFilterPageItem
 * JD-Core Version:    0.7.0.1
 */
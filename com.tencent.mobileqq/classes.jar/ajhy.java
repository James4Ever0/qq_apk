import com.tencent.mobileqq.data.MessageForDeliverGiftTips;
import com.tencent.mobileqq.surfaceviewaction.gl.FrameSprite.OnFrameEndListener;
import com.tencent.mobileqq.surfaceviewaction.gl.SpriteVideoView;
import com.tencent.mobileqq.troopgift.TroopInteractGiftAnimationController;
import org.json.JSONObject;

class ajhy
  implements FrameSprite.OnFrameEndListener
{
  ajhy(ajhs paramajhs, int paramInt1, String paramString, JSONObject paramJSONObject1, int paramInt2, JSONObject paramJSONObject2) {}
  
  public void a()
  {
    if (this.jdField_a_of_type_Ajhs.a.jdField_a_of_type_ComTencentMobileqqTroopgiftTroopInteractGiftAnimationController.jdField_a_of_type_ComTencentMobileqqSurfaceviewactionGlSpriteVideoView == null) {
      return;
    }
    if (this.jdField_a_of_type_Ajhs.a.jdField_a_of_type_ComTencentMobileqqDataMessageForDeliverGiftTips.playTotalMicroseconds / 1000L > this.jdField_a_of_type_Int)
    {
      String str = this.jdField_a_of_type_JavaLangString + this.jdField_a_of_type_OrgJsonJSONObject.optString("videoPath", "2.mp4");
      this.jdField_a_of_type_Ajhs.a.jdField_a_of_type_ComTencentMobileqqTroopgiftTroopInteractGiftAnimationController.jdField_a_of_type_ComTencentMobileqqSurfaceviewactionGlSpriteVideoView.a(str, new ajhz(this));
      this.jdField_a_of_type_Ajhs.a.jdField_a_of_type_ComTencentMobileqqTroopgiftTroopInteractGiftAnimationController.a(this.jdField_a_of_type_Ajhs.a.jdField_a_of_type_ComTencentMobileqqDataMessageForDeliverGiftTips, this.jdField_b_of_type_Int - 300);
      return;
    }
    this.jdField_a_of_type_Ajhs.a.jdField_a_of_type_ComTencentMobileqqTroopgiftTroopInteractGiftAnimationController.a();
    if (this.jdField_a_of_type_Ajhs.a.jdField_a_of_type_ComTencentMobileqqSurfaceviewactionGlFrameSprite$OnFrameEndListener != null) {
      this.jdField_a_of_type_Ajhs.a.jdField_a_of_type_ComTencentMobileqqSurfaceviewactionGlFrameSprite$OnFrameEndListener.a();
    }
    this.jdField_a_of_type_Ajhs.a.jdField_a_of_type_ComTencentMobileqqTroopgiftTroopInteractGiftAnimationController.a(this.jdField_a_of_type_Ajhs.a.jdField_a_of_type_ComTencentMobileqqDataMessageForDeliverGiftTips, this.jdField_a_of_type_Ajhs.a.jdField_a_of_type_ComTencentMobileqqDataMessageForDeliverGiftTips.frienduin, this.jdField_a_of_type_Ajhs.a.jdField_a_of_type_ComTencentMobileqqDataMessageForDeliverGiftTips.interactId, this.jdField_a_of_type_Ajhs.a.jdField_a_of_type_ComTencentMobileqqDataMessageForDeliverGiftTips.animationPackageId, this.jdField_a_of_type_Ajhs.a.jdField_a_of_type_ComTencentMobileqqTroopgiftTroopInteractGiftAnimationController.jdField_a_of_type_Int, true);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     ajhy
 * JD-Core Version:    0.7.0.1
 */
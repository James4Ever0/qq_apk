import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.surfaceviewaction.builder.SceneBuilder.ILabelTextHandle;
import com.tencent.mobileqq.surfaceviewaction.gl.Sprite;
import com.tencent.mobileqq.troop.enterEffect.TroopEnterEffectController.TroopEnterEffectData;
import com.tencent.mobileqq.utils.ContactUtils;

class ajfo
  implements SceneBuilder.ILabelTextHandle
{
  ajfo(ajfh paramajfh, QQAppInterface paramQQAppInterface) {}
  
  public String a(Sprite paramSprite, String paramString)
  {
    return paramString.replace("$NICK$", ContactUtils.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.jdField_a_of_type_Ajfh.a.a, this.jdField_a_of_type_Ajfh.a.b, 1, 0));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     ajfo
 * JD-Core Version:    0.7.0.1
 */
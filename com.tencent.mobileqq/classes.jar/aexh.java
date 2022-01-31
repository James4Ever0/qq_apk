import android.content.Intent;
import android.text.TextUtils;
import com.tencent.mobileqq.nearby.gameroom.GameRoomInviteActivity;
import com.tencent.mobileqq.nearby.gameroom.GameRoomTransActivity;
import com.tencent.mobileqq.nearby.gameroom.GameRoomUtils;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.utils.DialogUtil;
import com.tencent.mobileqq.utils.QQCustomDialog;
import com.tencent.mobileqq.werewolves.WerewolvesHandler.Callback;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.QLog;
import tencent.im.oidb.cmd0x8e4.oidb_0x8e4.RspBody;

public class aexh
  implements WerewolvesHandler.Callback
{
  public aexh(GameRoomTransActivity paramGameRoomTransActivity, String paramString, int paramInt) {}
  
  public void a(int paramInt, oidb_0x8e4.RspBody paramRspBody)
  {
    String str3 = null;
    String str2;
    if (paramRspBody.string_err_title.has())
    {
      str2 = paramRspBody.string_err_title.get().toStringUtf8();
      str1 = str2;
      if (!TextUtils.isEmpty(str2)) {}
    }
    for (String str1 = null;; str1 = null)
    {
      str2 = str3;
      if (paramRspBody.string_err_msg.has())
      {
        str2 = paramRspBody.string_err_msg.get().toStringUtf8();
        if (!TextUtils.isEmpty(str2)) {
          break label562;
        }
        str2 = str3;
      }
      label562:
      for (;;)
      {
        if (QLog.isColorLevel()) {
          QLog.d("qqBaseActivity", 2, "onAcceptInvite invitedId = " + this.jdField_a_of_type_JavaLangString + " errorCode = " + paramInt + " ,errTitle = " + str1 + " ,errMsgFromServer = " + str2);
        }
        if ((paramInt == 1000) || (paramInt == 1001) || (paramInt == 1002) || (paramInt == 1003) || (paramInt == 1007)) {
          this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog = GameRoomUtils.a(this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity, str1, str2);
        }
        for (;;)
        {
          if (this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog != null) {
            this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.setOnDismissListener(this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity.jdField_a_of_type_AndroidContentDialogInterface$OnDismissListener);
          }
          return;
          if ((paramInt == 1004) || (paramInt == 1006) || (paramInt == 1010) || (paramInt == 1013))
          {
            this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog = GameRoomUtils.a(this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity, str1, str2);
          }
          else
          {
            if ((paramInt == 0) || (paramInt == 1005))
            {
              paramRspBody = new Intent(this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity, GameRoomInviteActivity.class);
              paramRspBody.putExtra("inviteId", this.jdField_a_of_type_JavaLangString);
              paramRspBody.putExtra("roomNum", this.jdField_a_of_type_Int);
              GameRoomInviteActivity.jdField_a_of_type_JavaLangString = this.jdField_a_of_type_JavaLangString;
              this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity.startActivity(paramRspBody);
              this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity.finish();
              return;
            }
            if (paramInt == 1008)
            {
              str3 = paramRspBody.string_invite_id.get().toStringUtf8();
              GameRoomInviteActivity.jdField_a_of_type_JavaLangString = str3;
              paramInt = this.jdField_a_of_type_Int;
              if (paramRspBody.uint32_max_member_num.has()) {
                paramInt = paramRspBody.uint32_max_member_num.get();
              }
              this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog = GameRoomUtils.a(this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity, str1, str2, str3, paramInt);
            }
            else if (paramInt == 1009)
            {
              this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog = DialogUtil.a(this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity, 230);
              this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.setTitle(str1);
              this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.setMessage(str2);
              this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.setPositiveButton("查看我的游戏", new aexi(this, paramRspBody));
              this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.setNegativeButton(2131432425, new aexj(this));
              this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.show();
            }
            else
            {
              if (TextUtils.isEmpty(str2)) {
                break;
              }
              this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog = GameRoomUtils.a(this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity, str1, str2);
            }
          }
        }
        QQToast.a(this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity, 1, "加入组队失败", 1).a();
        this.jdField_a_of_type_ComTencentMobileqqNearbyGameroomGameRoomTransActivity.finish();
        return;
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aexh
 * JD-Core Version:    0.7.0.1
 */
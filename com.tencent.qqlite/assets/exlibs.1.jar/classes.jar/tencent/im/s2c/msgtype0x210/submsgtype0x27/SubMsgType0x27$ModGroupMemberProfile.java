package tencent.im.s2c.msgtype0x210.submsgtype0x27;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class SubMsgType0x27$ModGroupMemberProfile
  extends MessageMicro
{
  public static final int RPT_MSG_GROUP_MEMBER_PROFILE_INFOS_FIELD_NUMBER = 3;
  public static final int UINT64_GROUP_CODE_FIELD_NUMBER = 4;
  public static final int UINT64_GROUP_UIN_FIELD_NUMBER = 1;
  public static final int UINT64_UIN_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26, 32 }, new String[] { "uint64_group_uin", "uint64_uin", "rpt_msg_group_member_profile_infos", "uint64_group_code" }, new Object[] { Long.valueOf(0L), Long.valueOf(0L), null, Long.valueOf(0L) }, ModGroupMemberProfile.class);
  public final PBRepeatMessageField rpt_msg_group_member_profile_infos = PBField.initRepeatMessage(SubMsgType0x27.GroupMemberProfileInfo.class);
  public final PBUInt64Field uint64_group_code = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_group_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_uin = PBField.initUInt64(0L);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     tencent.im.s2c.msgtype0x210.submsgtype0x27.SubMsgType0x27.ModGroupMemberProfile
 * JD-Core Version:    0.7.0.1
 */
package tencent.im.s2c.frdsysmsg;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;

public final class FrdSysMsg$FriendMiscInfo
  extends MessageMicro
{
  public static final int STR_FROMUIN_NICK_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "str_fromuin_nick" }, new Object[] { "" }, FriendMiscInfo.class);
  public final PBStringField str_fromuin_nick = PBField.initString("");
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     tencent.im.s2c.frdsysmsg.FrdSysMsg.FriendMiscInfo
 * JD-Core Version:    0.7.0.1
 */
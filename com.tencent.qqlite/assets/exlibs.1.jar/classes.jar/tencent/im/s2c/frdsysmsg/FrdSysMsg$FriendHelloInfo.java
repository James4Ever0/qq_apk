package tencent.im.s2c.frdsysmsg;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;

public final class FrdSysMsg$FriendHelloInfo
  extends MessageMicro
{
  public static final int STR_SOURCE_NAME_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "str_source_name" }, new Object[] { "" }, FriendHelloInfo.class);
  public final PBStringField str_source_name = PBField.initString("");
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     tencent.im.s2c.frdsysmsg.FrdSysMsg.FriendHelloInfo
 * JD-Core Version:    0.7.0.1
 */
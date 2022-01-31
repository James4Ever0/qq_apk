package msf.msgcomm;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg_comm$AppShareInfo
  extends MessageMicro
{
  public static final int APPSHARE_COOKIE_FIELD_NUMBER = 2;
  public static final int APPSHARE_ID_FIELD_NUMBER = 1;
  public static final int APPSHARE_RESOURCE_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField appshare_cookie = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field appshare_id = PBField.initUInt32(0);
  public msg_comm.PluginInfo appshare_resource = new msg_comm.PluginInfo();
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26 }, new String[] { "appshare_id", "appshare_cookie", "appshare_resource" }, new Object[] { Integer.valueOf(0), localByteStringMicro, null }, AppShareInfo.class);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     msf.msgcomm.msg_comm.AppShareInfo
 * JD-Core Version:    0.7.0.1
 */
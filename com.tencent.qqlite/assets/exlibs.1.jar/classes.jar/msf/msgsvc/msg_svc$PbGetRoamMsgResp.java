package msf.msgsvc;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;
import msf.msgcomm.msg_comm.Msg;

public final class msg_svc$PbGetRoamMsgResp
  extends MessageMicro
{
  public static final int ERRMSG_FIELD_NUMBER = 2;
  public static final int LAST_MSGTIME_FIELD_NUMBER = 4;
  public static final int MSG_FIELD_NUMBER = 6;
  public static final int PEER_UIN_FIELD_NUMBER = 3;
  public static final int RANDOM_FIELD_NUMBER = 5;
  public static final int RESULT_FIELD_NUMBER = 1;
  public static final int SIG_FIELD_NUMBER = 7;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBStringField errmsg = PBField.initString("");
  public final PBUInt64Field last_msgtime = PBField.initUInt64(0L);
  public final PBRepeatMessageField msg = PBField.initRepeatMessage(msg_comm.Msg.class);
  public final PBUInt64Field peer_uin = PBField.initUInt64(0L);
  public final PBUInt64Field random = PBField.initUInt64(0L);
  public final PBUInt32Field result = PBField.initUInt32(0);
  public final PBBytesField sig = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 24, 32, 40, 50, 58 }, new String[] { "result", "errmsg", "peer_uin", "last_msgtime", "random", "msg", "sig" }, new Object[] { Integer.valueOf(0), "", Long.valueOf(0L), Long.valueOf(0L), Long.valueOf(0L), null, localByteStringMicro }, PbGetRoamMsgResp.class);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     msf.msgsvc.msg_svc.PbGetRoamMsgResp
 * JD-Core Version:    0.7.0.1
 */
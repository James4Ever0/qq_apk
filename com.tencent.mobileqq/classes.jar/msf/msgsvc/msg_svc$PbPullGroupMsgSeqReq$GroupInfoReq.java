package msf.msgsvc;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class msg_svc$PbPullGroupMsgSeqReq$GroupInfoReq
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16 }, new String[] { "group_code", "last_seq" }, new Object[] { Long.valueOf(0L), Long.valueOf(0L) }, GroupInfoReq.class);
  public final PBUInt64Field group_code = PBField.initUInt64(0L);
  public final PBUInt64Field last_seq = PBField.initUInt64(0L);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     msf.msgsvc.msg_svc.PbPullGroupMsgSeqReq.GroupInfoReq
 * JD-Core Version:    0.7.0.1
 */
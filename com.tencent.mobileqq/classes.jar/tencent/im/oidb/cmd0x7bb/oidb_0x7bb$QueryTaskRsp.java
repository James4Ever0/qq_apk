package tencent.im.oidb.cmd0x7bb;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class oidb_0x7bb$QueryTaskRsp
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "tasks" }, new Object[] { null }, QueryTaskRsp.class);
  public final PBRepeatMessageField tasks = PBField.initRepeatMessage(oidb_0x7bb.TaskInfo.class);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     tencent.im.oidb.cmd0x7bb.oidb_0x7bb.QueryTaskRsp
 * JD-Core Version:    0.7.0.1
 */
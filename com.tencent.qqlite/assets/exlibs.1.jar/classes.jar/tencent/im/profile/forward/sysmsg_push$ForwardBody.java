package tencent.im.profile.forward;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class sysmsg_push$ForwardBody
  extends MessageMicro
{
  public static final int MSG_APPOINTMENT_NOT_FIELD_NUMBER = 20;
  public static final int UINT32_NOTIFY_TYPE_FIELD_NUMBER = 1;
  public static final int UINT32_OP_TYPE_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 162 }, new String[] { "uint32_notify_type", "uint32_op_type", "msg_appointment_not" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), null }, ForwardBody.class);
  public sysmsg_push.AppointmentNot msg_appointment_not = new sysmsg_push.AppointmentNot();
  public final PBUInt32Field uint32_notify_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_op_type = PBField.initUInt32(0);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     tencent.im.profile.forward.sysmsg_push.ForwardBody
 * JD-Core Version:    0.7.0.1
 */
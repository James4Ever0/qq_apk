package tencent.im.oidb;

import appoint.define.appoint_define.AppointInfo;
import appoint.define.appoint_define.PublisherInfo;
import appoint.define.appoint_define.StrangerInfo;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class cmd0x7de$UserProfile
  extends MessageMicro
{
  public static final int MSG_APPOINTS_INFO_FIELD_NUMBER = 2;
  public static final int MSG_PUBLISHER_INFO_FIELD_NUMBER = 1;
  public static final int RPT_MSG_VISTOR_INFO_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26 }, new String[] { "msg_publisher_info", "msg_appoints_info", "rpt_msg_vistor_info" }, new Object[] { null, null, null }, UserProfile.class);
  public appoint_define.AppointInfo msg_appoints_info = new appoint_define.AppointInfo();
  public appoint_define.PublisherInfo msg_publisher_info = new appoint_define.PublisherInfo();
  public final PBRepeatMessageField rpt_msg_vistor_info = PBField.initRepeatMessage(appoint_define.StrangerInfo.class);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     tencent.im.oidb.cmd0x7de.UserProfile
 * JD-Core Version:    0.7.0.1
 */
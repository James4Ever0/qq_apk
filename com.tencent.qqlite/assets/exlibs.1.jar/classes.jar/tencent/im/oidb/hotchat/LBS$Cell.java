package tencent.im.oidb.hotchat;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;

public final class LBS$Cell
  extends MessageMicro
{
  public static final int CELLID_FIELD_NUMBER = 4;
  public static final int LAC_FIELD_NUMBER = 3;
  public static final int MCC_FIELD_NUMBER = 1;
  public static final int MNC_FIELD_NUMBER = 2;
  public static final int RSSI_FIELD_NUMBER = 5;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 40 }, new String[] { "mcc", "mnc", "lac", "cellid", "rssi" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, Cell.class);
  public final PBInt32Field cellid = PBField.initInt32(0);
  public final PBInt32Field lac = PBField.initInt32(0);
  public final PBInt32Field mcc = PBField.initInt32(0);
  public final PBInt32Field mnc = PBField.initInt32(0);
  public final PBInt32Field rssi = PBField.initInt32(0);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     tencent.im.oidb.hotchat.LBS.Cell
 * JD-Core Version:    0.7.0.1
 */
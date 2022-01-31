package tencent.im.secretfile;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class QQService$GetSecretFileInfoReq
  extends MessageMicro
{
  public static final int RPT_MSG_FILEINFO_LIST_FIELD_NUMBER = 2;
  public static final int UINT64_UIN_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18 }, new String[] { "uint64_uin", "rpt_msg_fileInfo_list" }, new Object[] { Long.valueOf(0L), null }, GetSecretFileInfoReq.class);
  public final PBRepeatMessageField rpt_msg_fileInfo_list = PBField.initRepeatMessage(QQService.SecretFileInfo.class);
  public final PBUInt64Field uint64_uin = PBField.initUInt64(0L);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     tencent.im.secretfile.QQService.GetSecretFileInfoReq
 * JD-Core Version:    0.7.0.1
 */
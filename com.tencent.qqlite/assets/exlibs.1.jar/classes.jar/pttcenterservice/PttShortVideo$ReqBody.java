package pttcenterservice;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class PttShortVideo$ReqBody
  extends MessageMicro
{
  public static final int MSG_PTTSHORTVIDEODOWNLOAD_REQ_FIELD_NUMBER = 4;
  public static final int MSG_PTTSHORTVIDEOUPLOAD_REQ_FIELD_NUMBER = 3;
  public static final int UINT32_CMD_FIELD_NUMBER = 1;
  public static final int UINT32_SEQ_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26, 34 }, new String[] { "uint32_cmd", "uint32_seq", "msg_PttShortVideoUpload_Req", "msg_PttShortVideoDownload_Req" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), null, null }, ReqBody.class);
  public PttShortVideo.PttShortVideoDownloadReq msg_PttShortVideoDownload_Req = new PttShortVideo.PttShortVideoDownloadReq();
  public PttShortVideo.PttShortVideoUploadReq msg_PttShortVideoUpload_Req = new PttShortVideo.PttShortVideoUploadReq();
  public final PBUInt32Field uint32_cmd = PBField.initUInt32(0);
  public final PBUInt32Field uint32_seq = PBField.initUInt32(0);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     pttcenterservice.PttShortVideo.ReqBody
 * JD-Core Version:    0.7.0.1
 */
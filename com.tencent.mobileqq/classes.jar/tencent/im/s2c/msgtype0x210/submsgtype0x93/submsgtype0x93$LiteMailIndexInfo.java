package tencent.im.s2c.msgtype0x210.submsgtype0x93;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;

public final class submsgtype0x93$LiteMailIndexInfo
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_feeds_id = PBField.initBytes(ByteStringMicro.EMPTY);
  public submsgtype0x93.SourceID msg_source_id = new submsgtype0x93.SourceID();
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "bytes_feeds_id", "msg_source_id" }, new Object[] { localByteStringMicro, null }, LiteMailIndexInfo.class);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     tencent.im.s2c.msgtype0x210.submsgtype0x93.submsgtype0x93.LiteMailIndexInfo
 * JD-Core Version:    0.7.0.1
 */
package tencent.im.oidb.cmd0x43c;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;

public final class Oidb_0x43c$ResponseCardDetail
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField card_id = PBField.initBytes(ByteStringMicro.EMPTY);
  public Oidb_0x43c.CardInfo card_info = new Oidb_0x43c.CardInfo();
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "card_id", "card_info" }, new Object[] { localByteStringMicro, null }, ResponseCardDetail.class);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     tencent.im.oidb.cmd0x43c.Oidb_0x43c.ResponseCardDetail
 * JD-Core Version:    0.7.0.1
 */
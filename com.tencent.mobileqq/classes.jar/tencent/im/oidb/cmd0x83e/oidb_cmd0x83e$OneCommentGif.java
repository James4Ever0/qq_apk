package tencent.im.oidb.cmd0x83e;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;

public final class oidb_cmd0x83e$OneCommentGif
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_gif_url = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_pic_url = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "bytes_gif_url", "bytes_pic_url" }, new Object[] { localByteStringMicro1, localByteStringMicro2 }, OneCommentGif.class);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     tencent.im.oidb.cmd0x83e.oidb_cmd0x83e.OneCommentGif
 * JD-Core Version:    0.7.0.1
 */
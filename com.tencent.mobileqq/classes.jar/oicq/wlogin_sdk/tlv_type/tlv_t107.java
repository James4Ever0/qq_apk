package oicq.wlogin_sdk.tlv_type;

import oicq.wlogin_sdk.tools.util;

public class tlv_t107
  extends tlv_t
{
  int _t107_body_len = 6;
  
  public tlv_t107()
  {
    this._cmd = 263;
  }
  
  public byte[] get_tlv_107(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    byte[] arrayOfByte = new byte[this._t107_body_len];
    util.int16_to_buf(arrayOfByte, 0, paramInt1);
    util.int8_to_buf(arrayOfByte, 2, paramInt2);
    util.int16_to_buf(arrayOfByte, 3, paramInt3);
    util.int8_to_buf(arrayOfByte, 5, paramInt4);
    fill_head(this._cmd);
    fill_body(arrayOfByte, this._t107_body_len);
    set_length();
    return get_buf();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     oicq.wlogin_sdk.tlv_type.tlv_t107
 * JD-Core Version:    0.7.0.1
 */
package com.tencent.pb.emosm;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBStringField;

public final class ComicIPSite$Gxzb
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 32, 42, 50 }, new String[] { "appId", "appName", "cover", "feeType", "id", "name" }, new Object[] { Integer.valueOf(0), "", "", Integer.valueOf(0), "", "" }, Gxzb.class);
  public final PBInt32Field appId = PBField.initInt32(0);
  public final PBStringField appName = PBField.initString("");
  public final PBStringField cover = PBField.initString("");
  public final PBInt32Field feeType = PBField.initInt32(0);
  public final PBStringField id = PBField.initString("");
  public final PBStringField name = PBField.initString("");
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     com.tencent.pb.emosm.ComicIPSite.Gxzb
 * JD-Core Version:    0.7.0.1
 */
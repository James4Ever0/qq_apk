package tencent.im.DynamicFeeds;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class DynamicDislike$FeedsItem_Dislike
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18 }, new String[] { "ulFeedID", "strFeedCookie" }, new Object[] { Long.valueOf(0L), "" }, FeedsItem_Dislike.class);
  public final PBStringField strFeedCookie = PBField.initString("");
  public final PBUInt64Field ulFeedID = PBField.initUInt64(0L);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     tencent.im.DynamicFeeds.DynamicDislike.FeedsItem_Dislike
 * JD-Core Version:    0.7.0.1
 */
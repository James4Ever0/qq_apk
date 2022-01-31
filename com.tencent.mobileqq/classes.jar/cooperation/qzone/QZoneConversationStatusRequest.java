package cooperation.qzone;

import NS_MOBILE_NEWEST_FEEDS.newest_feeds_req;
import com.qq.taf.jce.JceStruct;
import java.util.HashMap;
import java.util.Map;

public class QZoneConversationStatusRequest
  extends QZoneCommonRequest
{
  newest_feeds_req a = new newest_feeds_req();
  
  public QZoneConversationStatusRequest(long paramLong, Map paramMap)
  {
    this.a.cmd = 4;
    this.a.login_uin = paramLong;
    this.a.strQua = QUA.a();
    this.a.mapUinTimes = new HashMap();
    this.a.mapUinTimes.putAll(paramMap);
  }
  
  public int a()
  {
    return 1000;
  }
  
  public String getCmdString()
  {
    return "QzoneNewService.getMsgNewestFeeds";
  }
  
  public JceStruct getReq()
  {
    return this.a;
  }
  
  public String toString()
  {
    return String.format("reqetuest ,cmd:%d,loginUin;%d,qua;%s,mapUintimes:%s ", new Object[] { Integer.valueOf(this.a.cmd), Long.valueOf(this.a.login_uin), this.a.strQua, String.valueOf(this.a.mapUinTimes) });
  }
  
  public String uniKey()
  {
    return "getMsgNewestFeeds";
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     cooperation.qzone.QZoneConversationStatusRequest
 * JD-Core Version:    0.7.0.1
 */
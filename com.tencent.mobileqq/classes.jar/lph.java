import com.tencent.biz.pubaccount.readinjoy.engine.ReadinjoySPEventReport;
import com.tencent.biz.pubaccount.util.PublicAccountUtil;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import java.util.ArrayList;
import tencent.im.oidb.cmd0x80a.oidb_cmd0x80a.AttributeList;

public class lph
  implements Runnable
{
  public lph(ReadinjoySPEventReport paramReadinjoySPEventReport) {}
  
  public void run()
  {
    ArrayList localArrayList = new ArrayList();
    oidb_cmd0x80a.AttributeList localAttributeList = new oidb_cmd0x80a.AttributeList();
    localAttributeList.att_id.set(1);
    localAttributeList.att_name.set("OneClickRead");
    localAttributeList.att_value.set(String.valueOf(System.currentTimeMillis() / 1000L));
    localArrayList.add(localAttributeList);
    PublicAccountUtil.a(13, "OneClickRead", localArrayList);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     lph
 * JD-Core Version:    0.7.0.1
 */
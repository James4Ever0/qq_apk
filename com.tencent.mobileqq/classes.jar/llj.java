import com.tencent.biz.pubaccount.readinjoy.common.WeishiReportUtil;
import com.tencent.biz.pubaccount.util.PublicAccountUtil;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import java.util.ArrayList;
import tencent.im.oidb.cmd0x80a.oidb_cmd0x80a.AttributeList;

public final class llj
  implements Runnable
{
  public llj(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {}
  
  public void run()
  {
    ArrayList localArrayList = new ArrayList();
    oidb_cmd0x80a.AttributeList localAttributeList = new oidb_cmd0x80a.AttributeList();
    localAttributeList.att_id.set(1);
    localAttributeList.att_name.set("ExitType");
    localAttributeList.att_value.set(WeishiReportUtil.a(this.jdField_a_of_type_Int));
    localArrayList.add(localAttributeList);
    localAttributeList = new oidb_cmd0x80a.AttributeList();
    localAttributeList.att_id.set(2);
    localAttributeList.att_name.set("FolderStatus");
    localAttributeList.att_value.set(String.valueOf(this.jdField_a_of_type_JavaLangString));
    localArrayList.add(localAttributeList);
    localAttributeList = new oidb_cmd0x80a.AttributeList();
    localAttributeList.att_id.set(3);
    localAttributeList.att_name.set("Time");
    localAttributeList.att_value.set(String.valueOf(this.b));
    localArrayList.add(localAttributeList);
    if (!"1".equals(this.jdField_a_of_type_JavaLangString))
    {
      localAttributeList = new oidb_cmd0x80a.AttributeList();
      localAttributeList.att_id.set(5);
      localAttributeList.att_name.set("StrategyID");
      localAttributeList.att_value.set(this.c);
      localArrayList.add(localAttributeList);
      localAttributeList = new oidb_cmd0x80a.AttributeList();
      localAttributeList.att_id.set(6);
      localAttributeList.att_name.set("AlgorithmID");
      localAttributeList.att_value.set(this.d);
      localArrayList.add(localAttributeList);
      localAttributeList = new oidb_cmd0x80a.AttributeList();
      localAttributeList.att_id.set(7);
      localAttributeList.att_name.set("costtime");
      localAttributeList.att_value.set("" + this.e);
      localArrayList.add(localAttributeList);
    }
    PublicAccountUtil.a(26, "ExitWS", localArrayList);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     llj
 * JD-Core Version:    0.7.0.1
 */
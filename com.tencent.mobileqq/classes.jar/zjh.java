import com.tencent.litetransfersdk.LiteTransferWrapper;
import com.tencent.litetransfersdk.ProtocolHelper;
import com.tencent.litetransfersdk.Session;
import com.tencent.mobileqq.app.DataLineHandler;
import com.tencent.mobileqq.app.RouterHandler;
import com.tencent.mobileqq.data.RouterMsgRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class zjh
  implements Runnable
{
  public zjh(RouterHandler paramRouterHandler, long paramLong) {}
  
  public void run()
  {
    Object localObject1 = (Session)this.jdField_a_of_type_ComTencentMobileqqAppRouterHandler.e.get(Long.valueOf(this.jdField_a_of_type_Long));
    Object localObject2;
    if (localObject1 == null)
    {
      Iterator localIterator = this.jdField_a_of_type_ComTencentMobileqqAppRouterHandler.jdField_a_of_type_JavaUtilArrayList.iterator();
      localObject2 = localObject1;
      if (localIterator.hasNext())
      {
        RouterMsgRecord localRouterMsgRecord = (RouterMsgRecord)localIterator.next();
        if (localRouterMsgRecord.uSessionID != this.jdField_a_of_type_Long) {
          break label225;
        }
        localObject2 = this.jdField_a_of_type_ComTencentMobileqqAppRouterHandler.jdField_a_of_type_ComTencentLitetransfersdkProtocolHelper.genSession(0, localRouterMsgRecord.filename, null, DataLineHandler.d(localRouterMsgRecord.msgtype), 0, this.jdField_a_of_type_Long, 0, 0, 0);
        localObject1 = localObject2;
        if (localObject2 == null) {
          break label225;
        }
        if (0L == ((Session)localObject2).uSessionID) {
          ((Session)localObject2).uSessionID = this.jdField_a_of_type_ComTencentMobileqqAppRouterHandler.jdField_a_of_type_ComTencentLitetransfersdkLiteTransferWrapper.generateSessionID(0);
        }
        ((Session)localObject2).msgHeader = this.jdField_a_of_type_ComTencentMobileqqAppRouterHandler.jdField_a_of_type_ComTencentLitetransfersdkProtocolHelper.msgHeader(localRouterMsgRecord.peerDin);
        this.jdField_a_of_type_ComTencentMobileqqAppRouterHandler.jdField_a_of_type_ComTencentLitetransfersdkProtocolHelper.fillService((Session)localObject2, this.jdField_a_of_type_ComTencentMobileqqAppRouterHandler.jdField_a_of_type_JavaLangString, null);
        this.jdField_a_of_type_ComTencentMobileqqAppRouterHandler.e.put(Long.valueOf(this.jdField_a_of_type_Long), localObject2);
        this.jdField_a_of_type_ComTencentMobileqqAppRouterHandler.d.put(Long.valueOf(localRouterMsgRecord.uSessionID), localRouterMsgRecord);
      }
    }
    for (;;)
    {
      this.jdField_a_of_type_ComTencentMobileqqAppRouterHandler.a(0, (Session)localObject2, 0.0D, 0);
      return;
      label225:
      break;
      localObject2 = localObject1;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     zjh
 * JD-Core Version:    0.7.0.1
 */
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.dataline.activities.DLBaseFileViewActivity.DLFileState;
import com.dataline.activities.DLFilesViewerActivity;
import com.dataline.util.DataLineReportUtil;
import com.dataline.util.DatalineFilesAdapter;
import com.dataline.util.file.DLFileInfo;
import com.tencent.mobileqq.app.DataLineHandler;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.message.QQMessageFacade;
import com.tencent.mobileqq.data.DataLineMsgRecord;
import com.tencent.mobileqq.data.DataLineMsgSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class w
  implements DialogInterface.OnClickListener
{
  w(v paramv, DataLineMsgRecord paramDataLineMsgRecord, DataLineHandler paramDataLineHandler) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Object localObject2 = null;
    paramDialogInterface.dismiss();
    if ((this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgRecord != null) && (!this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgRecord.isSendFromLocal()) && (this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgRecord.strMoloKey != null)) {
      this.jdField_a_of_type_ComTencentMobileqqAppDataLineHandler.b(112);
    }
    DLFilesViewerActivity.a(this.jdField_a_of_type_V.a).setPaused(false);
    Iterator localIterator = DLFilesViewerActivity.a(this.jdField_a_of_type_V.a).values().iterator();
    Object localObject1 = null;
    paramDialogInterface = (DialogInterface)localObject2;
    if (localIterator.hasNext())
    {
      DataLineMsgRecord localDataLineMsgRecord = (DataLineMsgRecord)localIterator.next();
      DLFileInfo localDLFileInfo = DatalineFilesAdapter.a(localDataLineMsgRecord);
      if (localDLFileInfo.a == DLBaseFileViewActivity.DLFileState.SENDFAILED)
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new ArrayList();
        }
        ((ArrayList)localObject2).add(localDataLineMsgRecord);
        localObject1 = localObject2;
      }
      for (;;)
      {
        break;
        if (localDLFileInfo.a != DLBaseFileViewActivity.DLFileState.RECVFAILED)
        {
          localObject2 = paramDialogInterface;
          if (localDLFileInfo.a != DLBaseFileViewActivity.DLFileState.FILECOMING) {}
        }
        else
        {
          if ((localDataLineMsgRecord.fileMsgStatus == 1L) && (localDataLineMsgRecord.strMoloKey != null)) {
            DataLineReportUtil.e(this.jdField_a_of_type_V.a.b);
          }
          localObject2 = paramDialogInterface;
          if (paramDialogInterface == null) {
            localObject2 = new ArrayList();
          }
          ((List)localObject2).add(Long.valueOf(localDataLineMsgRecord.sessionid));
          localDataLineMsgRecord.fileMsgStatus = 0L;
          this.jdField_a_of_type_V.a.b.a().c(localDataLineMsgRecord.msgId);
        }
        paramDialogInterface = (DialogInterface)localObject2;
      }
    }
    if ((localObject1 != null) && (localObject1.size() > 0)) {
      this.jdField_a_of_type_ComTencentMobileqqAppDataLineHandler.a(localObject1, true);
    }
    if ((paramDialogInterface != null) && (paramDialogInterface.size() > 0)) {
      this.jdField_a_of_type_ComTencentMobileqqAppDataLineHandler.a(paramDialogInterface);
    }
    DLFilesViewerActivity.a(this.jdField_a_of_type_V.a).notifyDataSetChanged();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes3.jar
 * Qualified Name:     w
 * JD-Core Version:    0.7.0.1
 */
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.troop.data.TroopAioKeywordTipBar;
import com.tencent.mobileqq.troop.data.TroopAioKeywordTipInfo;
import com.tencent.mobileqq.troop.data.TroopAioKeywordTipManager.Callback;
import com.tencent.qphone.base.util.QLog;

class aioe
  extends TroopAioKeywordTipManager.Callback
{
  aioe(aiod paramaiod) {}
  
  public void a(MessageRecord paramMessageRecord, TroopAioKeywordTipInfo paramTroopAioKeywordTipInfo)
  {
    if (!this.a.a.a.a) {}
    do
    {
      return;
      if ((paramMessageRecord != null) && (paramTroopAioKeywordTipInfo != null)) {
        break;
      }
    } while (!QLog.isColorLevel());
    QLog.i("TroopAioKeywordTipBar", 2, "mCheckKeywordRunnable, messageRecord == null || keywordTipInfo == null");
    return;
    TroopAioKeywordTipBar.a(this.a.a.a, paramMessageRecord, paramTroopAioKeywordTipInfo);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     aioe
 * JD-Core Version:    0.7.0.1
 */
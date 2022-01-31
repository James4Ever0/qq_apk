import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import com.tencent.mobileqq.activity.aio.ecommerce.ECommerceDataReportUtil.1;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.data.ChatMessage;
import com.tencent.mobileqq.data.MessageForMixedMsg;
import com.tencent.mobileqq.data.MessageForReplyText;
import com.tencent.mobileqq.data.MessageForText;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.qphone.base.util.QLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import mqq.os.MqqHandler;
import mqq.util.WeakReference;

public class adgb
{
  private static String jdField_a_of_type_JavaLangString = "";
  private static HashMap<String, String> jdField_a_of_type_JavaUtilHashMap;
  
  private static String a(MessageRecord paramMessageRecord)
  {
    if ((paramMessageRecord instanceof MessageForText))
    {
      paramMessageRecord = (MessageForText)paramMessageRecord;
      if ((paramMessageRecord.sb instanceof ayki)) {
        return ((ayki)paramMessageRecord.sb).d;
      }
      if ((paramMessageRecord.sb instanceof Spannable)) {
        return paramMessageRecord.sb.toString();
      }
    }
    else
    {
      if ((paramMessageRecord instanceof MessageForMixedMsg)) {
        return paramMessageRecord.msg;
      }
      if ((paramMessageRecord instanceof MessageForReplyText)) {
        return ((MessageForReplyText)paramMessageRecord).getSummaryMsg();
      }
    }
    return "";
  }
  
  public static void a(Context paramContext, QQAppInterface paramQQAppInterface, MessageRecord paramMessageRecord, int paramInt)
  {
    a(paramContext, paramQQAppInterface, paramMessageRecord, paramInt, "");
  }
  
  public static void a(Context paramContext, QQAppInterface paramQQAppInterface, MessageRecord paramMessageRecord, int paramInt, String paramString)
  {
    if (a(paramContext, paramMessageRecord))
    {
      paramContext = a(paramMessageRecord);
      if (QLog.isColorLevel()) {
        QLog.d("ECommerceDataReportUtil", 2, "reportECommerceData reportContent : " + paramContext + ", reportConfig -> " + jdField_a_of_type_JavaUtilHashMap);
      }
      if (!a(paramQQAppInterface))
      {
        if (QLog.isColorLevel()) {
          QLog.d("ECommerceDataReportUtil", 2, "reportECommerceData load config from QConfigManager");
        }
        paramMessageRecord = new WeakReference(paramQQAppInterface);
        ThreadManager.getFileThreadHandler().post(new ECommerceDataReportUtil.1(paramQQAppInterface, paramMessageRecord, paramContext, paramInt, paramString));
      }
    }
    else
    {
      return;
    }
    if (QLog.isColorLevel()) {
      QLog.d("ECommerceDataReportUtil", 2, "reportECommerceData hit cache");
    }
    b(paramQQAppInterface, paramContext, paramInt, paramString);
  }
  
  public static void a(QQAppInterface paramQQAppInterface, List<ChatMessage> paramList, int paramInt)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        a(null, paramQQAppInterface, (ChatMessage)paramList.next(), paramInt);
      }
    }
  }
  
  private static boolean a(Context paramContext, MessageRecord paramMessageRecord)
  {
    if (((paramMessageRecord instanceof MessageForText)) || ((paramMessageRecord instanceof MessageForMixedMsg)) || ((paramMessageRecord instanceof MessageForReplyText))) {}
    for (boolean bool = true;; bool = false)
    {
      if (QLog.isColorLevel()) {
        QLog.d("ECommerceDataReportUtil", 2, "isMessageNeedReport : need -> " + bool + "， message -> " + a(paramMessageRecord));
      }
      return bool;
    }
  }
  
  private static boolean a(QQAppInterface paramQQAppInterface)
  {
    return (jdField_a_of_type_JavaUtilHashMap != null) && (!jdField_a_of_type_JavaUtilHashMap.isEmpty()) && (paramQQAppInterface != null) && (!TextUtils.isEmpty(jdField_a_of_type_JavaLangString)) && (jdField_a_of_type_JavaLangString.equals(paramQQAppInterface.getCurrentAccountUin()));
  }
  
  private static void b(QQAppInterface paramQQAppInterface, String paramString1, int paramInt, String paramString2)
  {
    Object localObject = jdField_a_of_type_JavaUtilHashMap.entrySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      String str = (String)localEntry.getKey();
      if ((!TextUtils.isEmpty(str)) && (!TextUtils.isEmpty(paramString1)) && (paramString1.contains(str))) {
        if ((paramInt != 5) || ((!TextUtils.isEmpty(paramString2)) && (paramString2.contains(str))))
        {
          localObject = (String)localEntry.getValue();
          axqw.b(paramQQAppInterface, "dc00898", "", "", (String)localObject, (String)localObject, paramInt, 0, "", "", "", "");
          if (QLog.isColorLevel()) {
            QLog.d("ECommerceDataReportUtil", 2, "checkAndReport : doReport key -> " + str + ", type => " + paramInt + ", reportTag -> " + (String)localObject + "， clickUrl -> " + paramString2 + ", content -> " + paramString1);
          }
        }
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes11.jar
 * Qualified Name:     adgb
 * JD-Core Version:    0.7.0.1
 */
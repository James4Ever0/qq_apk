import com.tencent.mobileqq.troop.utils.TroopLinkManager;

public class ajpz
  implements Runnable
{
  public ajpz(TroopLinkManager paramTroopLinkManager, String paramString) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 13	ajpz:jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopLinkManager	Lcom/tencent/mobileqq/troop/utils/TroopLinkManager;
    //   4: getfield 27	com/tencent/mobileqq/troop/utils/TroopLinkManager:jdField_a_of_type_JavaLangObject	Ljava/lang/Object;
    //   7: astore_1
    //   8: aload_1
    //   9: monitorenter
    //   10: aload_0
    //   11: getfield 13	ajpz:jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopLinkManager	Lcom/tencent/mobileqq/troop/utils/TroopLinkManager;
    //   14: getfield 30	com/tencent/mobileqq/troop/utils/TroopLinkManager:jdField_a_of_type_Boolean	Z
    //   17: ifeq +6 -> 23
    //   20: aload_1
    //   21: monitorexit
    //   22: return
    //   23: aload_1
    //   24: monitorexit
    //   25: new 32	java/io/File
    //   28: dup
    //   29: aload_0
    //   30: getfield 15	ajpz:jdField_a_of_type_JavaLangString	Ljava/lang/String;
    //   33: invokespecial 35	java/io/File:<init>	(Ljava/lang/String;)V
    //   36: astore_1
    //   37: aload_1
    //   38: invokevirtual 39	java/io/File:exists	()Z
    //   41: ifeq +96 -> 137
    //   44: new 41	org/json/JSONObject
    //   47: dup
    //   48: aload_1
    //   49: invokestatic 47	com/tencent/mobileqq/utils/FileUtils:b	(Ljava/io/File;)Ljava/lang/String;
    //   52: invokespecial 48	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   55: astore_2
    //   56: aload_2
    //   57: invokevirtual 52	org/json/JSONObject:keys	()Ljava/util/Iterator;
    //   60: astore_3
    //   61: aload_0
    //   62: getfield 13	ajpz:jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopLinkManager	Lcom/tencent/mobileqq/troop/utils/TroopLinkManager;
    //   65: getfield 27	com/tencent/mobileqq/troop/utils/TroopLinkManager:jdField_a_of_type_JavaLangObject	Ljava/lang/Object;
    //   68: astore_1
    //   69: aload_1
    //   70: monitorenter
    //   71: aload_3
    //   72: invokeinterface 57 1 0
    //   77: ifeq +57 -> 134
    //   80: aload_3
    //   81: invokeinterface 61 1 0
    //   86: checkcast 63	java/lang/String
    //   89: astore 4
    //   91: aload_2
    //   92: aload 4
    //   94: invokevirtual 67	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   97: astore 5
    //   99: getstatic 70	com/tencent/mobileqq/troop/utils/TroopLinkManager:jdField_a_of_type_JavaUtilHashMap	Ljava/util/HashMap;
    //   102: aload 4
    //   104: aload 5
    //   106: invokevirtual 76	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   109: pop
    //   110: goto -39 -> 71
    //   113: astore_2
    //   114: aload_1
    //   115: monitorexit
    //   116: aload_2
    //   117: athrow
    //   118: astore_1
    //   119: ldc 78
    //   121: iconst_1
    //   122: ldc 80
    //   124: aload_1
    //   125: invokestatic 86	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   128: return
    //   129: astore_2
    //   130: aload_1
    //   131: monitorexit
    //   132: aload_2
    //   133: athrow
    //   134: aload_1
    //   135: monitorexit
    //   136: return
    //   137: ldc 78
    //   139: iconst_1
    //   140: ldc 88
    //   142: invokestatic 91	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   145: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	146	0	this	ajpz
    //   118	17	1	localException	java.lang.Exception
    //   55	37	2	localJSONObject	org.json.JSONObject
    //   113	4	2	localObject2	Object
    //   129	4	2	localObject3	Object
    //   60	21	3	localIterator	java.util.Iterator
    //   89	14	4	str1	String
    //   97	8	5	str2	String
    // Exception table:
    //   from	to	target	type
    //   71	110	113	finally
    //   114	116	113	finally
    //   134	136	113	finally
    //   0	10	118	java/lang/Exception
    //   25	71	118	java/lang/Exception
    //   116	118	118	java/lang/Exception
    //   132	134	118	java/lang/Exception
    //   137	145	118	java/lang/Exception
    //   10	22	129	finally
    //   23	25	129	finally
    //   130	132	129	finally
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     ajpz
 * JD-Core Version:    0.7.0.1
 */
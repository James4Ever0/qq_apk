import com.tencent.biz.qqstory.utils.AssertUtils;
import com.tencent.mobileqq.troop.data.TroopAIOAppInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class aizt
{
  public int a;
  public String a;
  private List a;
  public ConcurrentHashMap a;
  public int b = 0;
  
  public aizt()
  {
    this.jdField_a_of_type_Int = 0;
    this.jdField_a_of_type_JavaLangString = "";
    this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap = new ConcurrentHashMap();
    this.jdField_a_of_type_JavaUtilList = new ArrayList();
  }
  
  public ArrayList a()
  {
    try
    {
      ArrayList localArrayList = new ArrayList(this.jdField_a_of_type_JavaUtilList);
      return localArrayList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a()
  {
    try
    {
      this.jdField_a_of_type_JavaUtilList.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(int paramInt, TroopAIOAppInfo paramTroopAIOAppInfo)
  {
    TroopAIOAppInfo localTroopAIOAppInfo = (TroopAIOAppInfo)this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.get(Integer.valueOf(paramInt));
    if (localTroopAIOAppInfo != null)
    {
      localTroopAIOAppInfo.copyFrom(paramTroopAIOAppInfo);
      return;
    }
    this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.put(Integer.valueOf(paramInt), paramTroopAIOAppInfo);
    try
    {
      this.jdField_a_of_type_JavaUtilList.add(paramTroopAIOAppInfo);
      return;
    }
    finally {}
  }
  
  public void a(List paramList, int paramInt)
  {
    for (;;)
    {
      int i;
      TroopAIOAppInfo localTroopAIOAppInfo;
      try
      {
        this.jdField_a_of_type_JavaUtilList.clear();
        paramList = paramList.iterator();
        if (!paramList.hasNext()) {
          break;
        }
        i = ((Integer)paramList.next()).intValue();
        localTroopAIOAppInfo = (TroopAIOAppInfo)this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.get(Integer.valueOf(i));
        AssertUtils.a(localTroopAIOAppInfo);
        if (localTroopAIOAppInfo != null)
        {
          this.jdField_a_of_type_JavaUtilList.add(localTroopAIOAppInfo);
          continue;
        }
        localTroopAIOAppInfo = new TroopAIOAppInfo();
      }
      finally {}
      localTroopAIOAppInfo.appid = i;
      localTroopAIOAppInfo.groupType = paramInt;
      a(i, localTroopAIOAppInfo);
    }
  }
  
  public boolean a(TroopAIOAppInfo paramTroopAIOAppInfo)
  {
    try
    {
      boolean bool = this.jdField_a_of_type_JavaUtilList.remove(paramTroopAIOAppInfo);
      return bool;
    }
    finally
    {
      paramTroopAIOAppInfo = finally;
      throw paramTroopAIOAppInfo;
    }
  }
  
  /* Error */
  public boolean a(List paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 32	aizt:jdField_a_of_type_JavaUtilList	Ljava/util/List;
    //   6: invokeinterface 107 1 0
    //   11: istore_2
    //   12: aload_1
    //   13: invokeinterface 107 1 0
    //   18: istore_3
    //   19: iload_2
    //   20: iload_3
    //   21: if_icmpeq +11 -> 32
    //   24: iconst_1
    //   25: istore 4
    //   27: aload_0
    //   28: monitorexit
    //   29: iload 4
    //   31: ireturn
    //   32: aload_0
    //   33: getfield 32	aizt:jdField_a_of_type_JavaUtilList	Ljava/util/List;
    //   36: invokeinterface 111 1 0
    //   41: astore 5
    //   43: aload_1
    //   44: invokeinterface 111 1 0
    //   49: astore_1
    //   50: aload 5
    //   52: invokeinterface 114 1 0
    //   57: ifeq +59 -> 116
    //   60: aload 5
    //   62: invokeinterface 115 1 0
    //   67: checkcast 55	com/tencent/mobileqq/troop/data/TroopAIOAppInfo
    //   70: astore 6
    //   72: aload_1
    //   73: invokeinterface 115 1 0
    //   78: checkcast 45	java/lang/Integer
    //   81: astore 7
    //   83: aload 6
    //   85: getfield 94	com/tencent/mobileqq/troop/data/TroopAIOAppInfo:appid	I
    //   88: aload 7
    //   90: invokevirtual 86	java/lang/Integer:intValue	()I
    //   93: if_icmpeq -43 -> 50
    //   96: invokestatic 120	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   99: ifeq +11 -> 110
    //   102: ldc 122
    //   104: iconst_2
    //   105: ldc 124
    //   107: invokestatic 128	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   110: iconst_1
    //   111: istore 4
    //   113: goto -86 -> 27
    //   116: iconst_0
    //   117: istore 4
    //   119: goto -92 -> 27
    //   122: astore_1
    //   123: aload_0
    //   124: monitorexit
    //   125: aload_1
    //   126: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	this	aizt
    //   0	127	1	paramList	List
    //   11	11	2	i	int
    //   18	4	3	j	int
    //   25	93	4	bool	boolean
    //   41	20	5	localListIterator	java.util.ListIterator
    //   70	14	6	localTroopAIOAppInfo	TroopAIOAppInfo
    //   81	8	7	localInteger	Integer
    // Exception table:
    //   from	to	target	type
    //   2	19	122	finally
    //   32	50	122	finally
    //   50	110	122	finally
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     aizt
 * JD-Core Version:    0.7.0.1
 */
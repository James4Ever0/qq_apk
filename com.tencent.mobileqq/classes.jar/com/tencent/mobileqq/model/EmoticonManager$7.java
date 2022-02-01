package com.tencent.mobileqq.model;

import com.tencent.commonsdk.cache.QQLruCache;
import com.tencent.mobileqq.data.Emoticon;
import com.tencent.mobileqq.persistence.EntityManager;
import com.tencent.qphone.base.util.QLog;

class EmoticonManager$7
  implements Runnable
{
  EmoticonManager$7(EmoticonManager paramEmoticonManager, String paramString1, String paramString2) {}
  
  public void run()
  {
    Emoticon localEmoticon = (Emoticon)this.this$0.a.find(Emoticon.class, "epId=? and eId=?", new String[] { this.a, this.b });
    if (localEmoticon != null)
    {
      this.this$0.b.put(localEmoticon.getMapKey(), localEmoticon);
      if (QLog.isColorLevel()) {
        QLog.d("EmoticonManager", 2, "hit db, put into cache");
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes9.jar
 * Qualified Name:     com.tencent.mobileqq.model.EmoticonManager.7
 * JD-Core Version:    0.7.0.1
 */
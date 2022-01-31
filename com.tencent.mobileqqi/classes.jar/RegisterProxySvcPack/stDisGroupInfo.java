package RegisterProxySvcPack;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;

public final class stDisGroupInfo
  extends JceStruct
  implements Cloneable
{
  static int cache_eInfoFlag;
  public int eInfoFlag = eDisGroupInfoFlag.E_DIS_GROUP_DEFAULT.value();
  public long lDisCode = 0L;
  public long uDisMsgSeq = 0L;
  public long uInfoSeq = 0L;
  public long uMemberMsgSeq = 0L;
  
  static
  {
    if (!stDisGroupInfo.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }
  
  public stDisGroupInfo() {}
  
  public stDisGroupInfo(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt)
  {
    this.lDisCode = paramLong1;
    this.uDisMsgSeq = paramLong2;
    this.uMemberMsgSeq = paramLong3;
    this.uInfoSeq = paramLong4;
    this.eInfoFlag = paramInt;
  }
  
  public String className()
  {
    return "RegisterProxySvcPack.stDisGroupInfo";
  }
  
  public Object clone()
  {
    Object localObject1 = null;
    try
    {
      Object localObject2 = super.clone();
      localObject1 = localObject2;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      while ($assertionsDisabled) {}
      throw new AssertionError();
    }
    return localObject1;
  }
  
  public void display(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new JceDisplayer(paramStringBuilder, paramInt);
    paramStringBuilder.display(this.lDisCode, "lDisCode");
    paramStringBuilder.display(this.uDisMsgSeq, "uDisMsgSeq");
    paramStringBuilder.display(this.uMemberMsgSeq, "uMemberMsgSeq");
    paramStringBuilder.display(this.uInfoSeq, "uInfoSeq");
    paramStringBuilder.display(this.eInfoFlag, "eInfoFlag");
  }
  
  public void displaySimple(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new JceDisplayer(paramStringBuilder, paramInt);
    paramStringBuilder.displaySimple(this.lDisCode, true);
    paramStringBuilder.displaySimple(this.uDisMsgSeq, true);
    paramStringBuilder.displaySimple(this.uMemberMsgSeq, true);
    paramStringBuilder.displaySimple(this.uInfoSeq, true);
    paramStringBuilder.displaySimple(this.eInfoFlag, false);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      paramObject = (stDisGroupInfo)paramObject;
    } while ((!JceUtil.equals(this.lDisCode, paramObject.lDisCode)) || (!JceUtil.equals(this.uDisMsgSeq, paramObject.uDisMsgSeq)) || (!JceUtil.equals(this.uMemberMsgSeq, paramObject.uMemberMsgSeq)) || (!JceUtil.equals(this.uInfoSeq, paramObject.uInfoSeq)) || (!JceUtil.equals(this.eInfoFlag, paramObject.eInfoFlag)));
    return true;
  }
  
  public String fullClassName()
  {
    return "RegisterProxySvcPack.stDisGroupInfo";
  }
  
  public int getEInfoFlag()
  {
    return this.eInfoFlag;
  }
  
  public long getLDisCode()
  {
    return this.lDisCode;
  }
  
  public long getUDisMsgSeq()
  {
    return this.uDisMsgSeq;
  }
  
  public long getUInfoSeq()
  {
    return this.uInfoSeq;
  }
  
  public long getUMemberMsgSeq()
  {
    return this.uMemberMsgSeq;
  }
  
  public int hashCode()
  {
    try
    {
      throw new Exception("Need define key first!");
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return 0;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.lDisCode = paramJceInputStream.read(this.lDisCode, 0, true);
    this.uDisMsgSeq = paramJceInputStream.read(this.uDisMsgSeq, 1, true);
    this.uMemberMsgSeq = paramJceInputStream.read(this.uMemberMsgSeq, 2, true);
    this.uInfoSeq = paramJceInputStream.read(this.uInfoSeq, 3, false);
    this.eInfoFlag = paramJceInputStream.read(this.eInfoFlag, 4, false);
  }
  
  public void setEInfoFlag(int paramInt)
  {
    this.eInfoFlag = paramInt;
  }
  
  public void setLDisCode(long paramLong)
  {
    this.lDisCode = paramLong;
  }
  
  public void setUDisMsgSeq(long paramLong)
  {
    this.uDisMsgSeq = paramLong;
  }
  
  public void setUInfoSeq(long paramLong)
  {
    this.uInfoSeq = paramLong;
  }
  
  public void setUMemberMsgSeq(long paramLong)
  {
    this.uMemberMsgSeq = paramLong;
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.lDisCode, 0);
    paramJceOutputStream.write(this.uDisMsgSeq, 1);
    paramJceOutputStream.write(this.uMemberMsgSeq, 2);
    paramJceOutputStream.write(this.uInfoSeq, 3);
    paramJceOutputStream.write(this.eInfoFlag, 4);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     RegisterProxySvcPack.stDisGroupInfo
 * JD-Core Version:    0.7.0.1
 */
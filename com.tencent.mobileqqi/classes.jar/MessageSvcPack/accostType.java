package MessageSvcPack;

import java.io.Serializable;

public final class accostType
  implements Serializable
{
  public static final int _accostType_MGroup = 3;
  public static final int _accostType_b2c_EMail = 204;
  public static final int _accostType_b2c_MicroBlog = 203;
  public static final int _accostType_b2c_Neighbor = 205;
  public static final int _accostType_b2c_QQCom = 202;
  public static final int _accostType_b2c_QSecretary = 201;
  public static final int _accostType_b2c_Qzone = 207;
  public static final int _accostType_b2c_Weather = 206;
  public static final int _accostType_chatting = 2;
  public static final int _accostType_default = 0;
  public static final int _accostType_say_hello = 1;
  public static final int _accostType_sys_chatting = 102;
  public static final int _accostType_sys_msg_first = 151;
  public static final int _accostType_sys_plugin_first = 152;
  public static final int _accostType_sys_say_hello = 101;
  private static accostType[] a;
  public static final accostType accostType_MGroup;
  public static final accostType accostType_b2c_EMail;
  public static final accostType accostType_b2c_MicroBlog;
  public static final accostType accostType_b2c_Neighbor;
  public static final accostType accostType_b2c_QQCom;
  public static final accostType accostType_b2c_QSecretary;
  public static final accostType accostType_b2c_Qzone;
  public static final accostType accostType_b2c_Weather;
  public static final accostType accostType_chatting;
  public static final accostType accostType_default;
  public static final accostType accostType_say_hello;
  public static final accostType accostType_sys_chatting;
  public static final accostType accostType_sys_msg_first;
  public static final accostType accostType_sys_plugin_first;
  public static final accostType accostType_sys_say_hello;
  private String __T = new String();
  private int __value;
  
  static
  {
    if (!accostType.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      a = new accostType[15];
      accostType_default = new accostType(0, 0, "accostType_default");
      accostType_say_hello = new accostType(1, 1, "accostType_say_hello");
      accostType_chatting = new accostType(2, 2, "accostType_chatting");
      accostType_MGroup = new accostType(3, 3, "accostType_MGroup");
      accostType_sys_say_hello = new accostType(4, 101, "accostType_sys_say_hello");
      accostType_sys_chatting = new accostType(5, 102, "accostType_sys_chatting");
      accostType_sys_msg_first = new accostType(6, 151, "accostType_sys_msg_first");
      accostType_sys_plugin_first = new accostType(7, 152, "accostType_sys_plugin_first");
      accostType_b2c_QSecretary = new accostType(8, 201, "accostType_b2c_QSecretary");
      accostType_b2c_QQCom = new accostType(9, 202, "accostType_b2c_QQCom");
      accostType_b2c_MicroBlog = new accostType(10, 203, "accostType_b2c_MicroBlog");
      accostType_b2c_EMail = new accostType(11, 204, "accostType_b2c_EMail");
      accostType_b2c_Neighbor = new accostType(12, 205, "accostType_b2c_Neighbor");
      accostType_b2c_Weather = new accostType(13, 206, "accostType_b2c_Weather");
      accostType_b2c_Qzone = new accostType(14, 207, "accostType_b2c_Qzone");
      return;
    }
  }
  
  private accostType(int paramInt1, int paramInt2, String paramString)
  {
    this.__T = paramString;
    this.__value = paramInt2;
    a[paramInt1] = this;
  }
  
  public static accostType convert(int paramInt)
  {
    int i = 0;
    while (i < a.length)
    {
      if (a[i].value() == paramInt) {
        return a[i];
      }
      i += 1;
    }
    if (!$assertionsDisabled) {
      throw new AssertionError();
    }
    return null;
  }
  
  public static accostType convert(String paramString)
  {
    int i = 0;
    while (i < a.length)
    {
      if (a[i].toString().equals(paramString)) {
        return a[i];
      }
      i += 1;
    }
    if (!$assertionsDisabled) {
      throw new AssertionError();
    }
    return null;
  }
  
  public String toString()
  {
    return this.__T;
  }
  
  public int value()
  {
    return this.__value;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     MessageSvcPack.accostType
 * JD-Core Version:    0.7.0.1
 */
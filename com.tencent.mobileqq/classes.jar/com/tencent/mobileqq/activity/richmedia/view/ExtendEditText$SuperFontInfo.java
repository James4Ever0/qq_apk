package com.tencent.mobileqq.activity.richmedia.view;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.ArrayList;

public class ExtendEditText$SuperFontInfo
{
  public int a;
  public long a;
  public String a;
  public ArrayList a;
  public int b;
  public String b;
  public ArrayList b;
  public int c;
  public String c;
  public ArrayList c;
  public int d;
  public String d;
  public int e;
  public String e;
  public int f;
  public String f;
  
  public ExtendEditText$SuperFontInfo()
  {
    this.jdField_a_of_type_JavaLangString = "";
    this.jdField_b_of_type_JavaLangString = "";
    this.jdField_c_of_type_JavaLangString = "";
    this.jdField_d_of_type_JavaLangString = "";
    this.jdField_a_of_type_Int = -1;
    this.jdField_e_of_type_JavaLangString = "";
    this.jdField_f_of_type_JavaLangString = "";
  }
  
  public static int a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return 0;
    }
    String str = paramString.trim();
    paramString = str;
    if (!str.startsWith("#")) {
      paramString = "#" + str;
    }
    try
    {
      i = Color.parseColor(paramString);
      return i;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        int i = 0;
      }
    }
  }
  
  public static SuperFontInfo a(String paramString)
  {
    SuperFontInfo localSuperFontInfo = new SuperFontInfo();
    localSuperFontInfo.a(paramString);
    return localSuperFontInfo;
  }
  
  /* Error */
  public void a(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: new 81	org/json/JSONObject
    //   6: dup
    //   7: aload_1
    //   8: invokespecial 83	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   11: astore_1
    //   12: aload_0
    //   13: aload_1
    //   14: ldc 85
    //   16: invokevirtual 88	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   19: putfield 30	com/tencent/mobileqq/activity/richmedia/view/ExtendEditText$SuperFontInfo:jdField_a_of_type_Int	I
    //   22: aload_0
    //   23: aload_1
    //   24: ldc 90
    //   26: invokevirtual 94	org/json/JSONObject:optLong	(Ljava/lang/String;)J
    //   29: putfield 96	com/tencent/mobileqq/activity/richmedia/view/ExtendEditText$SuperFontInfo:jdField_a_of_type_Long	J
    //   32: aload_0
    //   33: aload_1
    //   34: ldc 98
    //   36: invokevirtual 102	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   39: putfield 32	com/tencent/mobileqq/activity/richmedia/view/ExtendEditText$SuperFontInfo:jdField_e_of_type_JavaLangString	Ljava/lang/String;
    //   42: aload_0
    //   43: aload_1
    //   44: ldc 104
    //   46: invokevirtual 88	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   49: putfield 106	com/tencent/mobileqq/activity/richmedia/view/ExtendEditText$SuperFontInfo:jdField_b_of_type_Int	I
    //   52: aload_0
    //   53: aload_1
    //   54: ldc 108
    //   56: invokevirtual 88	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   59: putfield 110	com/tencent/mobileqq/activity/richmedia/view/ExtendEditText$SuperFontInfo:jdField_c_of_type_Int	I
    //   62: aload_0
    //   63: aload_1
    //   64: ldc 112
    //   66: invokevirtual 88	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   69: putfield 114	com/tencent/mobileqq/activity/richmedia/view/ExtendEditText$SuperFontInfo:jdField_d_of_type_Int	I
    //   72: aload_0
    //   73: aload_1
    //   74: ldc 116
    //   76: invokevirtual 102	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   79: putfield 34	com/tencent/mobileqq/activity/richmedia/view/ExtendEditText$SuperFontInfo:jdField_f_of_type_JavaLangString	Ljava/lang/String;
    //   82: aload_1
    //   83: ldc 118
    //   85: invokevirtual 122	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   88: astore 5
    //   90: aload 5
    //   92: ifnonnull +44 -> 136
    //   95: iconst_0
    //   96: istore_2
    //   97: aload_0
    //   98: new 124	java/util/ArrayList
    //   101: dup
    //   102: invokespecial 125	java/util/ArrayList:<init>	()V
    //   105: putfield 127	com/tencent/mobileqq/activity/richmedia/view/ExtendEditText$SuperFontInfo:jdField_a_of_type_JavaUtilArrayList	Ljava/util/ArrayList;
    //   108: iconst_0
    //   109: istore_3
    //   110: iload_3
    //   111: iload_2
    //   112: if_icmpge +40 -> 152
    //   115: aload_0
    //   116: getfield 127	com/tencent/mobileqq/activity/richmedia/view/ExtendEditText$SuperFontInfo:jdField_a_of_type_JavaUtilArrayList	Ljava/util/ArrayList;
    //   119: aload 5
    //   121: iload_3
    //   122: invokevirtual 133	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   125: invokevirtual 137	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   128: pop
    //   129: iload_3
    //   130: iconst_1
    //   131: iadd
    //   132: istore_3
    //   133: goto -23 -> 110
    //   136: aload 5
    //   138: invokevirtual 141	org/json/JSONArray:length	()I
    //   141: istore_2
    //   142: goto -45 -> 97
    //   145: astore 5
    //   147: aload 5
    //   149: invokevirtual 74	java/lang/Exception:printStackTrace	()V
    //   152: aload_0
    //   153: new 124	java/util/ArrayList
    //   156: dup
    //   157: invokespecial 125	java/util/ArrayList:<init>	()V
    //   160: putfield 143	com/tencent/mobileqq/activity/richmedia/view/ExtendEditText$SuperFontInfo:jdField_b_of_type_JavaUtilArrayList	Ljava/util/ArrayList;
    //   163: aload_1
    //   164: ldc 145
    //   166: invokevirtual 122	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   169: astore 5
    //   171: aload 5
    //   173: ifnonnull +37 -> 210
    //   176: iconst_0
    //   177: istore_2
    //   178: goto +149 -> 327
    //   181: iload_3
    //   182: iload_2
    //   183: if_icmpge +43 -> 226
    //   186: aload_0
    //   187: getfield 143	com/tencent/mobileqq/activity/richmedia/view/ExtendEditText$SuperFontInfo:jdField_b_of_type_JavaUtilArrayList	Ljava/util/ArrayList;
    //   190: aload 5
    //   192: iload_3
    //   193: invokevirtual 149	org/json/JSONArray:getDouble	(I)D
    //   196: invokestatic 155	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   199: invokevirtual 137	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   202: pop
    //   203: iload_3
    //   204: iconst_1
    //   205: iadd
    //   206: istore_3
    //   207: goto -26 -> 181
    //   210: aload 5
    //   212: invokevirtual 141	org/json/JSONArray:length	()I
    //   215: istore_2
    //   216: goto +111 -> 327
    //   219: astore 5
    //   221: aload 5
    //   223: invokevirtual 74	java/lang/Exception:printStackTrace	()V
    //   226: aload_0
    //   227: aload_1
    //   228: ldc 157
    //   230: invokevirtual 88	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   233: putfield 159	com/tencent/mobileqq/activity/richmedia/view/ExtendEditText$SuperFontInfo:jdField_e_of_type_Int	I
    //   236: aload_0
    //   237: new 124	java/util/ArrayList
    //   240: dup
    //   241: invokespecial 125	java/util/ArrayList:<init>	()V
    //   244: putfield 161	com/tencent/mobileqq/activity/richmedia/view/ExtendEditText$SuperFontInfo:jdField_c_of_type_JavaUtilArrayList	Ljava/util/ArrayList;
    //   247: aload_1
    //   248: ldc 163
    //   250: invokevirtual 122	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   253: astore 5
    //   255: aload 5
    //   257: ifnonnull +34 -> 291
    //   260: iconst_0
    //   261: istore_2
    //   262: iload 4
    //   264: istore_3
    //   265: iload_3
    //   266: iload_2
    //   267: if_icmpge +43 -> 310
    //   270: aload_0
    //   271: getfield 161	com/tencent/mobileqq/activity/richmedia/view/ExtendEditText$SuperFontInfo:jdField_c_of_type_JavaUtilArrayList	Ljava/util/ArrayList;
    //   274: aload 5
    //   276: iload_3
    //   277: invokevirtual 133	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   280: invokevirtual 137	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   283: pop
    //   284: iload_3
    //   285: iconst_1
    //   286: iadd
    //   287: istore_3
    //   288: goto -23 -> 265
    //   291: aload 5
    //   293: invokevirtual 141	org/json/JSONArray:length	()I
    //   296: istore_2
    //   297: iload 4
    //   299: istore_3
    //   300: goto -35 -> 265
    //   303: astore 5
    //   305: aload 5
    //   307: invokevirtual 74	java/lang/Exception:printStackTrace	()V
    //   310: aload_0
    //   311: aload_1
    //   312: ldc 165
    //   314: invokevirtual 88	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   317: putfield 167	com/tencent/mobileqq/activity/richmedia/view/ExtendEditText$SuperFontInfo:jdField_f_of_type_Int	I
    //   320: return
    //   321: astore_1
    //   322: aload_1
    //   323: invokevirtual 74	java/lang/Exception:printStackTrace	()V
    //   326: return
    //   327: iconst_0
    //   328: istore_3
    //   329: goto -148 -> 181
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	332	0	this	SuperFontInfo
    //   0	332	1	paramString	String
    //   96	201	2	i	int
    //   109	220	3	j	int
    //   1	297	4	k	int
    //   88	49	5	localJSONArray1	org.json.JSONArray
    //   145	3	5	localException1	Exception
    //   169	42	5	localJSONArray2	org.json.JSONArray
    //   219	3	5	localException2	Exception
    //   253	39	5	localJSONArray3	org.json.JSONArray
    //   303	3	5	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   82	90	145	java/lang/Exception
    //   97	108	145	java/lang/Exception
    //   115	129	145	java/lang/Exception
    //   136	142	145	java/lang/Exception
    //   163	171	219	java/lang/Exception
    //   186	203	219	java/lang/Exception
    //   210	216	219	java/lang/Exception
    //   247	255	303	java/lang/Exception
    //   270	284	303	java/lang/Exception
    //   291	297	303	java/lang/Exception
    //   3	82	321	java/lang/Exception
    //   147	152	321	java/lang/Exception
    //   152	163	321	java/lang/Exception
    //   221	226	321	java/lang/Exception
    //   226	247	321	java/lang/Exception
    //   305	310	321	java/lang/Exception
    //   310	320	321	java/lang/Exception
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     com.tencent.mobileqq.activity.richmedia.view.ExtendEditText.SuperFontInfo
 * JD-Core Version:    0.7.0.1
 */
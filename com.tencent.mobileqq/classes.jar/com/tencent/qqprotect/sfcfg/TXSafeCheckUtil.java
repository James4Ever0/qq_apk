package com.tencent.qqprotect.sfcfg;

import java.util.Map;
import java.util.jar.Attributes;

public class TXSafeCheckUtil
{
  /* Error */
  public static int a(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 8
    //   3: aconst_null
    //   4: astore 5
    //   6: aconst_null
    //   7: astore 9
    //   9: aconst_null
    //   10: astore 7
    //   12: aconst_null
    //   13: astore 11
    //   15: aconst_null
    //   16: astore 13
    //   18: aconst_null
    //   19: astore 10
    //   21: aconst_null
    //   22: astore 12
    //   24: iconst_0
    //   25: istore_3
    //   26: new 19	java/util/jar/JarFile
    //   29: dup
    //   30: aload_0
    //   31: invokespecial 22	java/util/jar/JarFile:<init>	(Ljava/lang/String;)V
    //   34: astore 6
    //   36: aload 12
    //   38: astore 8
    //   40: aload 11
    //   42: astore_0
    //   43: aload 6
    //   45: astore 5
    //   47: aload 13
    //   49: astore 9
    //   51: aload 10
    //   53: astore 7
    //   55: aload 6
    //   57: aload_1
    //   58: invokevirtual 26	java/util/jar/JarFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   61: astore_1
    //   62: aload_1
    //   63: ifnonnull +36 -> 99
    //   66: iconst_2
    //   67: istore 4
    //   69: iconst_0
    //   70: ifeq +11 -> 81
    //   73: new 28	java/lang/NullPointerException
    //   76: dup
    //   77: invokespecial 29	java/lang/NullPointerException:<init>	()V
    //   80: athrow
    //   81: iload 4
    //   83: istore_3
    //   84: aload 6
    //   86: ifnull +11 -> 97
    //   89: aload 6
    //   91: invokevirtual 32	java/util/jar/JarFile:close	()V
    //   94: iload 4
    //   96: istore_3
    //   97: iload_3
    //   98: ireturn
    //   99: aload 12
    //   101: astore 8
    //   103: aload 11
    //   105: astore_0
    //   106: aload 6
    //   108: astore 5
    //   110: aload 13
    //   112: astore 9
    //   114: aload 10
    //   116: astore 7
    //   118: aload 6
    //   120: aload_1
    //   121: invokevirtual 36	java/util/jar/JarFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   124: astore_1
    //   125: aload_1
    //   126: astore 8
    //   128: aload_1
    //   129: astore_0
    //   130: aload 6
    //   132: astore 5
    //   134: aload_1
    //   135: astore 9
    //   137: aload_1
    //   138: astore 7
    //   140: ldc 38
    //   142: invokestatic 44	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   145: astore 10
    //   147: aload_1
    //   148: astore 8
    //   150: aload_1
    //   151: astore_0
    //   152: aload 6
    //   154: astore 5
    //   156: aload_1
    //   157: astore 9
    //   159: aload_1
    //   160: astore 7
    //   162: sipush 8192
    //   165: newarray byte
    //   167: astore 11
    //   169: aload_1
    //   170: astore 8
    //   172: aload_1
    //   173: astore_0
    //   174: aload 6
    //   176: astore 5
    //   178: aload_1
    //   179: astore 9
    //   181: aload_1
    //   182: astore 7
    //   184: aload_1
    //   185: aload 11
    //   187: invokevirtual 50	java/io/InputStream:read	([B)I
    //   190: istore 4
    //   192: iload 4
    //   194: iconst_m1
    //   195: if_icmpeq +70 -> 265
    //   198: aload_1
    //   199: astore 8
    //   201: aload_1
    //   202: astore_0
    //   203: aload 6
    //   205: astore 5
    //   207: aload_1
    //   208: astore 9
    //   210: aload_1
    //   211: astore 7
    //   213: aload 10
    //   215: aload 11
    //   217: iconst_0
    //   218: iload 4
    //   220: invokevirtual 54	java/security/MessageDigest:update	([BII)V
    //   223: goto -54 -> 169
    //   226: astore_1
    //   227: aload 8
    //   229: astore_0
    //   230: aload 6
    //   232: astore 5
    //   234: aload_1
    //   235: invokevirtual 57	java/io/IOException:printStackTrace	()V
    //   238: iconst_3
    //   239: istore_3
    //   240: aload 8
    //   242: ifnull +8 -> 250
    //   245: aload 8
    //   247: invokevirtual 58	java/io/InputStream:close	()V
    //   250: aload 6
    //   252: ifnull -155 -> 97
    //   255: aload 6
    //   257: invokevirtual 32	java/util/jar/JarFile:close	()V
    //   260: iconst_3
    //   261: ireturn
    //   262: astore_0
    //   263: iconst_3
    //   264: ireturn
    //   265: aload_1
    //   266: astore 8
    //   268: aload_1
    //   269: astore_0
    //   270: aload 6
    //   272: astore 5
    //   274: aload_1
    //   275: astore 9
    //   277: aload_1
    //   278: astore 7
    //   280: aload 10
    //   282: invokevirtual 62	java/security/MessageDigest:digest	()[B
    //   285: astore 10
    //   287: aload_1
    //   288: astore 8
    //   290: aload_1
    //   291: astore_0
    //   292: aload 6
    //   294: astore 5
    //   296: aload_1
    //   297: astore 9
    //   299: aload_1
    //   300: astore 7
    //   302: aload 10
    //   304: iconst_0
    //   305: aload_2
    //   306: iconst_0
    //   307: aload 10
    //   309: arraylength
    //   310: invokestatic 68	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   313: aload_1
    //   314: ifnull +7 -> 321
    //   317: aload_1
    //   318: invokevirtual 58	java/io/InputStream:close	()V
    //   321: aload 6
    //   323: ifnull -226 -> 97
    //   326: aload 6
    //   328: invokevirtual 32	java/util/jar/JarFile:close	()V
    //   331: iconst_0
    //   332: ireturn
    //   333: astore_0
    //   334: iconst_0
    //   335: ireturn
    //   336: astore_1
    //   337: aconst_null
    //   338: astore 6
    //   340: aload 5
    //   342: astore 7
    //   344: aload 7
    //   346: astore_0
    //   347: aload 6
    //   349: astore 5
    //   351: aload_1
    //   352: invokevirtual 69	java/lang/OutOfMemoryError:printStackTrace	()V
    //   355: sipush 144
    //   358: istore_3
    //   359: aload 7
    //   361: ifnull +8 -> 369
    //   364: aload 7
    //   366: invokevirtual 58	java/io/InputStream:close	()V
    //   369: aload 6
    //   371: ifnull -274 -> 97
    //   374: aload 6
    //   376: invokevirtual 32	java/util/jar/JarFile:close	()V
    //   379: sipush 144
    //   382: ireturn
    //   383: astore_0
    //   384: sipush 144
    //   387: ireturn
    //   388: astore_1
    //   389: aconst_null
    //   390: astore 6
    //   392: aload 9
    //   394: astore_0
    //   395: aload 6
    //   397: astore 5
    //   399: aload_1
    //   400: invokevirtual 70	java/security/NoSuchAlgorithmException:printStackTrace	()V
    //   403: sipush 139
    //   406: istore_3
    //   407: aload 9
    //   409: ifnull +8 -> 417
    //   412: aload 9
    //   414: invokevirtual 58	java/io/InputStream:close	()V
    //   417: aload 6
    //   419: ifnull -322 -> 97
    //   422: aload 6
    //   424: invokevirtual 32	java/util/jar/JarFile:close	()V
    //   427: sipush 139
    //   430: ireturn
    //   431: astore_0
    //   432: sipush 139
    //   435: ireturn
    //   436: astore_1
    //   437: aconst_null
    //   438: astore 5
    //   440: aload 7
    //   442: astore_0
    //   443: aload_0
    //   444: ifnull +7 -> 451
    //   447: aload_0
    //   448: invokevirtual 58	java/io/InputStream:close	()V
    //   451: aload 5
    //   453: ifnull +8 -> 461
    //   456: aload 5
    //   458: invokevirtual 32	java/util/jar/JarFile:close	()V
    //   461: aload_1
    //   462: athrow
    //   463: astore_0
    //   464: goto -383 -> 81
    //   467: astore_0
    //   468: iconst_2
    //   469: ireturn
    //   470: astore_0
    //   471: goto -150 -> 321
    //   474: astore_0
    //   475: goto -225 -> 250
    //   478: astore_0
    //   479: goto -110 -> 369
    //   482: astore_0
    //   483: goto -66 -> 417
    //   486: astore_0
    //   487: goto -36 -> 451
    //   490: astore_0
    //   491: goto -30 -> 461
    //   494: astore_1
    //   495: goto -52 -> 443
    //   498: astore_1
    //   499: goto -107 -> 392
    //   502: astore_1
    //   503: goto -159 -> 344
    //   506: astore_1
    //   507: aconst_null
    //   508: astore 6
    //   510: goto -283 -> 227
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	513	0	paramString1	String
    //   0	513	1	paramString2	String
    //   0	513	2	paramArrayOfByte	byte[]
    //   25	382	3	i	int
    //   67	152	4	j	int
    //   4	453	5	localObject1	Object
    //   34	475	6	localJarFile	java.util.jar.JarFile
    //   10	431	7	localObject2	Object
    //   1	288	8	localObject3	Object
    //   7	406	9	localObject4	Object
    //   19	289	10	localObject5	Object
    //   13	203	11	arrayOfByte	byte[]
    //   22	78	12	localObject6	Object
    //   16	95	13	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   55	62	226	java/io/IOException
    //   118	125	226	java/io/IOException
    //   140	147	226	java/io/IOException
    //   162	169	226	java/io/IOException
    //   184	192	226	java/io/IOException
    //   213	223	226	java/io/IOException
    //   280	287	226	java/io/IOException
    //   302	313	226	java/io/IOException
    //   255	260	262	java/io/IOException
    //   326	331	333	java/io/IOException
    //   26	36	336	java/lang/OutOfMemoryError
    //   374	379	383	java/io/IOException
    //   26	36	388	java/security/NoSuchAlgorithmException
    //   422	427	431	java/io/IOException
    //   26	36	436	finally
    //   73	81	463	java/io/IOException
    //   89	94	467	java/io/IOException
    //   317	321	470	java/io/IOException
    //   245	250	474	java/io/IOException
    //   364	369	478	java/io/IOException
    //   412	417	482	java/io/IOException
    //   447	451	486	java/io/IOException
    //   456	461	490	java/io/IOException
    //   55	62	494	finally
    //   118	125	494	finally
    //   140	147	494	finally
    //   162	169	494	finally
    //   184	192	494	finally
    //   213	223	494	finally
    //   234	238	494	finally
    //   280	287	494	finally
    //   302	313	494	finally
    //   351	355	494	finally
    //   399	403	494	finally
    //   55	62	498	java/security/NoSuchAlgorithmException
    //   118	125	498	java/security/NoSuchAlgorithmException
    //   140	147	498	java/security/NoSuchAlgorithmException
    //   162	169	498	java/security/NoSuchAlgorithmException
    //   184	192	498	java/security/NoSuchAlgorithmException
    //   213	223	498	java/security/NoSuchAlgorithmException
    //   280	287	498	java/security/NoSuchAlgorithmException
    //   302	313	498	java/security/NoSuchAlgorithmException
    //   55	62	502	java/lang/OutOfMemoryError
    //   118	125	502	java/lang/OutOfMemoryError
    //   140	147	502	java/lang/OutOfMemoryError
    //   162	169	502	java/lang/OutOfMemoryError
    //   184	192	502	java/lang/OutOfMemoryError
    //   213	223	502	java/lang/OutOfMemoryError
    //   280	287	502	java/lang/OutOfMemoryError
    //   302	313	502	java/lang/OutOfMemoryError
    //   26	36	506	java/io/IOException
  }
  
  public static int a(Map paramMap, String paramString1, String paramString2)
  {
    if (paramMap == null) {
      return 17;
    }
    paramMap = (Attributes)paramMap.get(paramString1);
    if (paramMap == null) {
      return 7;
    }
    if (true == paramString2.equals(paramMap.getValue("SHA1-Digest"))) {
      return 0;
    }
    return 143;
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar1 = new char[16];
    char[] tmp6_5 = arrayOfChar1;
    tmp6_5[0] = 48;
    char[] tmp11_6 = tmp6_5;
    tmp11_6[1] = 49;
    char[] tmp16_11 = tmp11_6;
    tmp16_11[2] = 50;
    char[] tmp21_16 = tmp16_11;
    tmp21_16[3] = 51;
    char[] tmp26_21 = tmp21_16;
    tmp26_21[4] = 52;
    char[] tmp31_26 = tmp26_21;
    tmp31_26[5] = 53;
    char[] tmp36_31 = tmp31_26;
    tmp36_31[6] = 54;
    char[] tmp42_36 = tmp36_31;
    tmp42_36[7] = 55;
    char[] tmp48_42 = tmp42_36;
    tmp48_42[8] = 56;
    char[] tmp54_48 = tmp48_42;
    tmp54_48[9] = 57;
    char[] tmp60_54 = tmp54_48;
    tmp60_54[10] = 97;
    char[] tmp66_60 = tmp60_54;
    tmp66_60[11] = 98;
    char[] tmp72_66 = tmp66_60;
    tmp72_66[12] = 99;
    char[] tmp78_72 = tmp72_66;
    tmp78_72[13] = 100;
    char[] tmp84_78 = tmp78_72;
    tmp84_78[14] = 101;
    char[] tmp90_84 = tmp84_78;
    tmp90_84[15] = 102;
    tmp90_84;
    char[] arrayOfChar2 = new char[paramArrayOfByte.length * 2];
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      int j = paramArrayOfByte[i];
      arrayOfChar2[(i * 2)] = arrayOfChar1[(j >>> 4 & 0xF)];
      arrayOfChar2[(i * 2 + 1)] = arrayOfChar1[(j & 0xF)];
      i += 1;
    }
    return new String(arrayOfChar2);
  }
  
  /* Error */
  public static Map a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 19	java/util/jar/JarFile
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 22	java/util/jar/JarFile:<init>	(Ljava/lang/String;)V
    //   10: astore_1
    //   11: aload_1
    //   12: astore_0
    //   13: aload_1
    //   14: invokevirtual 116	java/util/jar/JarFile:getManifest	()Ljava/util/jar/Manifest;
    //   17: astore_2
    //   18: aload_2
    //   19: ifnonnull +17 -> 36
    //   22: aload_3
    //   23: astore_0
    //   24: aload_1
    //   25: ifnull +9 -> 34
    //   28: aload_1
    //   29: invokevirtual 32	java/util/jar/JarFile:close	()V
    //   32: aload_3
    //   33: astore_0
    //   34: aload_0
    //   35: areturn
    //   36: aload_1
    //   37: astore_0
    //   38: aload_2
    //   39: invokevirtual 122	java/util/jar/Manifest:getEntries	()Ljava/util/Map;
    //   42: astore_2
    //   43: aload_2
    //   44: astore_0
    //   45: aload_1
    //   46: ifnull -12 -> 34
    //   49: aload_1
    //   50: invokevirtual 32	java/util/jar/JarFile:close	()V
    //   53: aload_2
    //   54: areturn
    //   55: astore_0
    //   56: aload_2
    //   57: areturn
    //   58: astore_2
    //   59: aconst_null
    //   60: astore_1
    //   61: aload_1
    //   62: astore_0
    //   63: aload_2
    //   64: invokevirtual 57	java/io/IOException:printStackTrace	()V
    //   67: aload_3
    //   68: astore_0
    //   69: aload_1
    //   70: ifnull -36 -> 34
    //   73: aload_1
    //   74: invokevirtual 32	java/util/jar/JarFile:close	()V
    //   77: aconst_null
    //   78: areturn
    //   79: astore_0
    //   80: aconst_null
    //   81: areturn
    //   82: astore_1
    //   83: aconst_null
    //   84: astore_0
    //   85: aload_0
    //   86: ifnull +7 -> 93
    //   89: aload_0
    //   90: invokevirtual 32	java/util/jar/JarFile:close	()V
    //   93: aload_1
    //   94: athrow
    //   95: astore_0
    //   96: aconst_null
    //   97: areturn
    //   98: astore_0
    //   99: goto -6 -> 93
    //   102: astore_1
    //   103: goto -18 -> 85
    //   106: astore_2
    //   107: goto -46 -> 61
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	paramString	String
    //   10	64	1	localJarFile	java.util.jar.JarFile
    //   82	12	1	localObject1	Object
    //   102	1	1	localObject2	Object
    //   17	40	2	localObject3	Object
    //   58	6	2	localIOException1	java.io.IOException
    //   106	1	2	localIOException2	java.io.IOException
    //   1	67	3	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   49	53	55	java/io/IOException
    //   2	11	58	java/io/IOException
    //   73	77	79	java/io/IOException
    //   2	11	82	finally
    //   28	32	95	java/io/IOException
    //   89	93	98	java/io/IOException
    //   13	18	102	finally
    //   38	43	102	finally
    //   63	67	102	finally
    //   13	18	106	java/io/IOException
    //   38	43	106	java/io/IOException
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     com.tencent.qqprotect.sfcfg.TXSafeCheckUtil
 * JD-Core Version:    0.7.0.1
 */
import com.tencent.mobileqq.forward.ForwardShareCardOption;

public class admf
  implements Runnable
{
  public admf(ForwardShareCardOption paramForwardShareCardOption, int paramInt, String paramString1, String paramString2, boolean paramBoolean) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: invokestatic 37	java/lang/System:currentTimeMillis	()J
    //   5: lstore_3
    //   6: iconst_1
    //   7: aload_0
    //   8: getfield 18	admf:jdField_a_of_type_Int	I
    //   11: if_icmpne +364 -> 375
    //   14: invokestatic 42	com/tencent/mobileqq/util/SystemUtil:a	()Z
    //   17: ifeq +138 -> 155
    //   20: getstatic 47	com/tencent/mobileqq/app/AppConstants:bm	Ljava/lang/String;
    //   23: astore 6
    //   25: new 49	java/lang/StringBuilder
    //   28: dup
    //   29: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   32: aload 6
    //   34: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: ldc 56
    //   39: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   45: astore 6
    //   47: new 62	java/io/File
    //   50: dup
    //   51: aload 6
    //   53: invokespecial 65	java/io/File:<init>	(Ljava/lang/String;)V
    //   56: astore 7
    //   58: aload 7
    //   60: invokevirtual 68	java/io/File:exists	()Z
    //   63: ifeq +99 -> 162
    //   66: iconst_1
    //   67: istore_1
    //   68: iload_1
    //   69: ifne +7 -> 76
    //   72: ldc 70
    //   74: astore 6
    //   76: invokestatic 75	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   79: ifeq +37 -> 116
    //   82: ldc 77
    //   84: iconst_2
    //   85: new 49	java/lang/StringBuilder
    //   88: dup
    //   89: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   92: ldc 79
    //   94: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: invokestatic 37	java/lang/System:currentTimeMillis	()J
    //   100: lload_3
    //   101: lsub
    //   102: invokevirtual 82	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   105: ldc 84
    //   107: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   113: invokestatic 88	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   116: aload_0
    //   117: getfield 16	admf:jdField_a_of_type_ComTencentMobileqqForwardForwardShareCardOption	Lcom/tencent/mobileqq/forward/ForwardShareCardOption;
    //   120: aload_0
    //   121: getfield 20	admf:jdField_a_of_type_JavaLangString	Ljava/lang/String;
    //   124: aload 6
    //   126: invokestatic 93	com/tencent/mobileqq/forward/ForwardShareCardOption:a	(Lcom/tencent/mobileqq/forward/ForwardShareCardOption;Ljava/lang/String;Ljava/lang/String;)V
    //   129: aload_0
    //   130: getfield 16	admf:jdField_a_of_type_ComTencentMobileqqForwardForwardShareCardOption	Lcom/tencent/mobileqq/forward/ForwardShareCardOption;
    //   133: invokevirtual 96	com/tencent/mobileqq/forward/ForwardShareCardOption:t	()V
    //   136: aload_0
    //   137: getfield 16	admf:jdField_a_of_type_ComTencentMobileqqForwardForwardShareCardOption	Lcom/tencent/mobileqq/forward/ForwardShareCardOption;
    //   140: getfield 99	com/tencent/mobileqq/forward/ForwardShareCardOption:jdField_a_of_type_AndroidAppActivity	Landroid/app/Activity;
    //   143: new 101	admg
    //   146: dup
    //   147: aload_0
    //   148: invokespecial 104	admg:<init>	(Ladmf;)V
    //   151: invokevirtual 110	android/app/Activity:runOnUiThread	(Ljava/lang/Runnable;)V
    //   154: return
    //   155: ldc 112
    //   157: astore 6
    //   159: goto -134 -> 25
    //   162: aload 7
    //   164: invokevirtual 115	java/io/File:createNewFile	()Z
    //   167: pop
    //   168: new 117	java/io/BufferedOutputStream
    //   171: dup
    //   172: new 119	java/io/FileOutputStream
    //   175: dup
    //   176: aload 7
    //   178: invokespecial 122	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   181: invokespecial 125	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   184: astore 8
    //   186: invokestatic 131	com/tencent/mobileqq/utils/ImageUtil:e	()Landroid/graphics/drawable/Drawable;
    //   189: checkcast 133	android/graphics/drawable/BitmapDrawable
    //   192: invokevirtual 137	android/graphics/drawable/BitmapDrawable:getBitmap	()Landroid/graphics/Bitmap;
    //   195: getstatic 143	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   198: bipush 100
    //   200: aload 8
    //   202: invokevirtual 149	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   205: istore 5
    //   207: iload 5
    //   209: ifeq +432 -> 641
    //   212: iconst_1
    //   213: istore_2
    //   214: aload 6
    //   216: astore 7
    //   218: aload 7
    //   220: astore 6
    //   222: iload_2
    //   223: istore_1
    //   224: aload 8
    //   226: ifnull -158 -> 68
    //   229: aload 8
    //   231: invokevirtual 152	java/io/BufferedOutputStream:close	()V
    //   234: aload 7
    //   236: astore 6
    //   238: iload_2
    //   239: istore_1
    //   240: goto -172 -> 68
    //   243: astore 8
    //   245: aload 7
    //   247: astore 6
    //   249: iload_2
    //   250: istore_1
    //   251: invokestatic 75	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   254: ifeq -186 -> 68
    //   257: ldc 77
    //   259: iconst_2
    //   260: ldc 70
    //   262: aload 8
    //   264: invokestatic 155	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   267: aload 7
    //   269: astore 6
    //   271: iload_2
    //   272: istore_1
    //   273: goto -205 -> 68
    //   276: astore 7
    //   278: aconst_null
    //   279: astore 6
    //   281: invokestatic 75	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   284: ifeq +8 -> 292
    //   287: aload 7
    //   289: invokevirtual 158	java/io/IOException:printStackTrace	()V
    //   292: aload 6
    //   294: ifnull +339 -> 633
    //   297: aload 6
    //   299: invokevirtual 152	java/io/BufferedOutputStream:close	()V
    //   302: aconst_null
    //   303: astore 6
    //   305: iconst_0
    //   306: istore_1
    //   307: goto -239 -> 68
    //   310: astore 6
    //   312: invokestatic 75	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   315: ifeq +13 -> 328
    //   318: ldc 77
    //   320: iconst_2
    //   321: ldc 70
    //   323: aload 6
    //   325: invokestatic 155	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   328: aconst_null
    //   329: astore 6
    //   331: iconst_0
    //   332: istore_1
    //   333: goto -265 -> 68
    //   336: astore 6
    //   338: aconst_null
    //   339: astore 7
    //   341: aload 7
    //   343: ifnull +8 -> 351
    //   346: aload 7
    //   348: invokevirtual 152	java/io/BufferedOutputStream:close	()V
    //   351: aload 6
    //   353: athrow
    //   354: astore 7
    //   356: invokestatic 75	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   359: ifeq -8 -> 351
    //   362: ldc 77
    //   364: iconst_2
    //   365: ldc 70
    //   367: aload 7
    //   369: invokestatic 155	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   372: goto -21 -> 351
    //   375: aload_0
    //   376: getfield 16	admf:jdField_a_of_type_ComTencentMobileqqForwardForwardShareCardOption	Lcom/tencent/mobileqq/forward/ForwardShareCardOption;
    //   379: getfield 161	com/tencent/mobileqq/forward/ForwardShareCardOption:jdField_a_of_type_ComTencentMobileqqAppQQAppInterface	Lcom/tencent/mobileqq/app/QQAppInterface;
    //   382: bipush 101
    //   384: aload_0
    //   385: getfield 20	admf:jdField_a_of_type_JavaLangString	Ljava/lang/String;
    //   388: iconst_0
    //   389: invokevirtual 166	com/tencent/mobileqq/app/QQAppInterface:a	(ILjava/lang/String;I)Ljava/lang/String;
    //   392: astore 6
    //   394: aload_0
    //   395: getfield 16	admf:jdField_a_of_type_ComTencentMobileqqForwardForwardShareCardOption	Lcom/tencent/mobileqq/forward/ForwardShareCardOption;
    //   398: getfield 161	com/tencent/mobileqq/forward/ForwardShareCardOption:jdField_a_of_type_ComTencentMobileqqAppQQAppInterface	Lcom/tencent/mobileqq/app/QQAppInterface;
    //   401: invokevirtual 169	com/tencent/mobileqq/app/QQAppInterface:getCurrentAccountUin	()Ljava/lang/String;
    //   404: astore 7
    //   406: aload 6
    //   408: invokestatic 174	com/tencent/mobileqq/filemanager/util/FileUtil:a	(Ljava/lang/String;)Z
    //   411: ifeq +152 -> 563
    //   414: new 176	java/util/ArrayList
    //   417: dup
    //   418: invokespecial 177	java/util/ArrayList:<init>	()V
    //   421: astore 8
    //   423: aload 8
    //   425: aload 6
    //   427: invokevirtual 181	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   430: pop
    //   431: aload 8
    //   433: aload 7
    //   435: aload_0
    //   436: getfield 22	admf:b	Ljava/lang/String;
    //   439: ldc 183
    //   441: invokestatic 188	cooperation/qzone/QZoneShareManager:a	(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    //   444: astore 6
    //   446: invokestatic 75	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   449: ifeq +41 -> 490
    //   452: ldc 77
    //   454: iconst_4
    //   455: new 49	java/lang/StringBuilder
    //   458: dup
    //   459: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   462: ldc 190
    //   464: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   467: aload 6
    //   469: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   472: ldc 195
    //   474: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   477: aload_0
    //   478: getfield 24	admf:jdField_a_of_type_Boolean	Z
    //   481: invokevirtual 198	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   484: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   487: invokestatic 88	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   490: aload 6
    //   492: ifnull +133 -> 625
    //   495: aload 6
    //   497: invokevirtual 202	java/util/ArrayList:size	()I
    //   500: ifle +125 -> 625
    //   503: aload 6
    //   505: iconst_0
    //   506: invokevirtual 206	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   509: checkcast 208	java/lang/String
    //   512: astore 7
    //   514: aload 7
    //   516: astore 6
    //   518: iload_2
    //   519: istore_1
    //   520: aload 7
    //   522: invokestatic 214	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   525: ifne -457 -> 68
    //   528: aload 7
    //   530: ldc 216
    //   532: invokevirtual 219	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   535: ifne +19 -> 554
    //   538: aload 7
    //   540: astore 6
    //   542: iload_2
    //   543: istore_1
    //   544: aload 7
    //   546: ldc 221
    //   548: invokevirtual 219	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   551: ifeq -483 -> 68
    //   554: iconst_1
    //   555: istore_1
    //   556: aload 7
    //   558: astore 6
    //   560: goto -492 -> 68
    //   563: aload_0
    //   564: getfield 24	admf:jdField_a_of_type_Boolean	Z
    //   567: ifeq +58 -> 625
    //   570: aload_0
    //   571: getfield 16	admf:jdField_a_of_type_ComTencentMobileqqForwardForwardShareCardOption	Lcom/tencent/mobileqq/forward/ForwardShareCardOption;
    //   574: getfield 161	com/tencent/mobileqq/forward/ForwardShareCardOption:jdField_a_of_type_ComTencentMobileqqAppQQAppInterface	Lcom/tencent/mobileqq/app/QQAppInterface;
    //   577: bipush 6
    //   579: invokevirtual 224	com/tencent/mobileqq/app/QQAppInterface:a	(I)Lcom/tencent/mobileqq/app/BusinessHandler;
    //   582: checkcast 226	com/tencent/mobileqq/app/DiscussionHandler
    //   585: aload_0
    //   586: getfield 20	admf:jdField_a_of_type_JavaLangString	Ljava/lang/String;
    //   589: iconst_1
    //   590: invokevirtual 229	com/tencent/mobileqq/app/DiscussionHandler:a	(Ljava/lang/String;Z)V
    //   593: return
    //   594: astore 6
    //   596: aload 8
    //   598: astore 7
    //   600: goto -259 -> 341
    //   603: astore 8
    //   605: aload 6
    //   607: astore 7
    //   609: aload 8
    //   611: astore 6
    //   613: goto -272 -> 341
    //   616: astore 7
    //   618: aload 8
    //   620: astore 6
    //   622: goto -341 -> 281
    //   625: aconst_null
    //   626: astore 6
    //   628: iload_2
    //   629: istore_1
    //   630: goto -562 -> 68
    //   633: aconst_null
    //   634: astore 6
    //   636: iconst_0
    //   637: istore_1
    //   638: goto -570 -> 68
    //   641: aconst_null
    //   642: astore 7
    //   644: iconst_0
    //   645: istore_2
    //   646: goto -428 -> 218
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	649	0	this	admf
    //   67	571	1	i	int
    //   1	645	2	j	int
    //   5	96	3	l	long
    //   205	3	5	bool	boolean
    //   23	281	6	localObject1	Object
    //   310	14	6	localIOException1	java.io.IOException
    //   329	1	6	localObject2	Object
    //   336	16	6	localObject3	Object
    //   392	167	6	localObject4	Object
    //   594	12	6	localObject5	Object
    //   611	24	6	localObject6	Object
    //   56	212	7	localObject7	Object
    //   276	12	7	localIOException2	java.io.IOException
    //   339	8	7	localObject8	Object
    //   354	14	7	localIOException3	java.io.IOException
    //   404	204	7	localObject9	Object
    //   616	1	7	localIOException4	java.io.IOException
    //   642	1	7	localObject10	Object
    //   184	46	8	localBufferedOutputStream	java.io.BufferedOutputStream
    //   243	20	8	localIOException5	java.io.IOException
    //   421	176	8	localArrayList	java.util.ArrayList
    //   603	16	8	localObject11	Object
    // Exception table:
    //   from	to	target	type
    //   229	234	243	java/io/IOException
    //   162	186	276	java/io/IOException
    //   297	302	310	java/io/IOException
    //   162	186	336	finally
    //   346	351	354	java/io/IOException
    //   186	207	594	finally
    //   281	292	603	finally
    //   186	207	616	java/io/IOException
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     admf
 * JD-Core Version:    0.7.0.1
 */
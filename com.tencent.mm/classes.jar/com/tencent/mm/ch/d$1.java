package com.tencent.mm.ch;

final class d$1
  implements Runnable
{
  d$1(d paramd, d.a parama) {}
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: invokestatic 37	android/os/Debug:stopMethodTracing	()V
    //   3: aload_0
    //   4: getfield 21	com/tencent/mm/ch/d$1:uGe	Lcom/tencent/mm/ch/d$a;
    //   7: getfield 43	com/tencent/mm/ch/d$a:savePath	Ljava/lang/String;
    //   10: astore 4
    //   12: aload_0
    //   13: getfield 21	com/tencent/mm/ch/d$1:uGe	Lcom/tencent/mm/ch/d$a;
    //   16: getfield 47	com/tencent/mm/ch/d$a:uGh	I
    //   19: istore_1
    //   20: aload_0
    //   21: getfield 21	com/tencent/mm/ch/d$1:uGe	Lcom/tencent/mm/ch/d$a;
    //   24: getfield 43	com/tencent/mm/ch/d$a:savePath	Ljava/lang/String;
    //   27: astore 5
    //   29: aload 5
    //   31: ifnonnull +12 -> 43
    //   34: aload_0
    //   35: getfield 19	com/tencent/mm/ch/d$1:uGf	Lcom/tencent/mm/ch/d;
    //   38: invokestatic 50	com/tencent/mm/ch/d:b	(Lcom/tencent/mm/ch/d;)Z
    //   41: pop
    //   42: return
    //   43: new 52	java/io/File
    //   46: dup
    //   47: aload 4
    //   49: invokespecial 55	java/io/File:<init>	(Ljava/lang/String;)V
    //   52: astore 5
    //   54: new 52	java/io/File
    //   57: dup
    //   58: new 57	java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial 58	java/lang/StringBuilder:<init>	()V
    //   65: aload 4
    //   67: iconst_0
    //   68: aload 4
    //   70: bipush 46
    //   72: invokevirtual 64	java/lang/String:lastIndexOf	(I)I
    //   75: invokevirtual 68	java/lang/String:substring	(II)Ljava/lang/String;
    //   78: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: ldc 74
    //   83: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   89: invokespecial 55	java/io/File:<init>	(Ljava/lang/String;)V
    //   92: astore 4
    //   94: invokestatic 84	java/lang/System:currentTimeMillis	()J
    //   97: lstore_2
    //   98: aload 5
    //   100: aload 4
    //   102: invokevirtual 88	java/io/File:renameTo	(Ljava/io/File;)Z
    //   105: pop
    //   106: aload 5
    //   108: invokevirtual 92	java/io/File:delete	()Z
    //   111: pop
    //   112: ldc 94
    //   114: new 57	java/lang/StringBuilder
    //   117: dup
    //   118: ldc 96
    //   120: invokespecial 97	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   123: invokestatic 84	java/lang/System:currentTimeMillis	()J
    //   126: lload_2
    //   127: lsub
    //   128: invokevirtual 100	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   131: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   134: invokestatic 106	com/tencent/mm/sdk/platformtools/y:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   137: bipush 10
    //   139: invokestatic 112	android/os/Process:setThreadPriority	(I)V
    //   142: aload_0
    //   143: getfield 21	com/tencent/mm/ch/d$1:uGe	Lcom/tencent/mm/ch/d$a;
    //   146: getfield 115	com/tencent/mm/ch/d$a:cbH	I
    //   149: bipush 6
    //   151: if_icmpne +125 -> 276
    //   154: new 117	java/util/ArrayList
    //   157: dup
    //   158: invokespecial 118	java/util/ArrayList:<init>	()V
    //   161: astore 5
    //   163: aload 5
    //   165: aload 4
    //   167: invokevirtual 122	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   170: pop
    //   171: new 52	java/io/File
    //   174: dup
    //   175: new 57	java/lang/StringBuilder
    //   178: dup
    //   179: invokespecial 58	java/lang/StringBuilder:<init>	()V
    //   182: aload 4
    //   184: invokevirtual 125	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   187: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: ldc 127
    //   192: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   198: invokespecial 55	java/io/File:<init>	(Ljava/lang/String;)V
    //   201: astore 4
    //   203: aload 5
    //   205: aload 4
    //   207: invokestatic 133	com/tencent/mm/a/p:a	(Ljava/util/Collection;Ljava/io/File;)V
    //   210: getstatic 137	com/tencent/mm/ch/d:dPi	Lcom/tencent/mm/sdk/platformtools/ah;
    //   213: iconst_1
    //   214: invokevirtual 143	com/tencent/mm/sdk/platformtools/ah:sendEmptyMessage	(I)Z
    //   217: pop
    //   218: aload_0
    //   219: getfield 19	com/tencent/mm/ch/d$1:uGf	Lcom/tencent/mm/ch/d;
    //   222: invokestatic 50	com/tencent/mm/ch/d:b	(Lcom/tencent/mm/ch/d;)Z
    //   225: pop
    //   226: return
    //   227: astore 4
    //   229: ldc 94
    //   231: ldc 145
    //   233: iconst_1
    //   234: anewarray 4	java/lang/Object
    //   237: dup
    //   238: iconst_0
    //   239: aload 4
    //   241: invokestatic 151	com/tencent/mm/sdk/platformtools/bk:j	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   244: aastore
    //   245: invokestatic 155	com/tencent/mm/sdk/platformtools/y:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   248: ldc 94
    //   250: ldc 157
    //   252: iconst_1
    //   253: anewarray 4	java/lang/Object
    //   256: dup
    //   257: iconst_0
    //   258: aload 4
    //   260: invokevirtual 160	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   263: aastore
    //   264: invokestatic 155	com/tencent/mm/sdk/platformtools/y:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   267: aload_0
    //   268: getfield 19	com/tencent/mm/ch/d$1:uGf	Lcom/tencent/mm/ch/d;
    //   271: invokestatic 50	com/tencent/mm/ch/d:b	(Lcom/tencent/mm/ch/d;)Z
    //   274: pop
    //   275: return
    //   276: aload_0
    //   277: getfield 19	com/tencent/mm/ch/d$1:uGf	Lcom/tencent/mm/ch/d;
    //   280: invokestatic 163	com/tencent/mm/ch/d:a	(Lcom/tencent/mm/ch/d;)Ljava/util/concurrent/LinkedBlockingQueue;
    //   283: ifnull +16 -> 299
    //   286: aload_0
    //   287: getfield 19	com/tencent/mm/ch/d$1:uGf	Lcom/tencent/mm/ch/d;
    //   290: invokestatic 163	com/tencent/mm/ch/d:a	(Lcom/tencent/mm/ch/d;)Ljava/util/concurrent/LinkedBlockingQueue;
    //   293: invokevirtual 169	java/util/concurrent/LinkedBlockingQueue:size	()I
    //   296: ifne +50 -> 346
    //   299: aload 4
    //   301: invokestatic 173	com/tencent/mm/ch/d:R	(Ljava/io/File;)Ljava/lang/String;
    //   304: astore 4
    //   306: aload 4
    //   308: invokestatic 177	com/tencent/mm/sdk/platformtools/bk:bl	(Ljava/lang/String;)Z
    //   311: ifne +35 -> 346
    //   314: aload_0
    //   315: getfield 19	com/tencent/mm/ch/d$1:uGf	Lcom/tencent/mm/ch/d;
    //   318: astore 5
    //   320: iload_1
    //   321: iconst_1
    //   322: if_icmpeq +17 -> 339
    //   325: iload_1
    //   326: iconst_3
    //   327: if_icmpne +19 -> 346
    //   330: invokestatic 183	com/tencent/mm/sdk/platformtools/ae:getContext	()Landroid/content/Context;
    //   333: invokestatic 189	com/tencent/mm/sdk/platformtools/aq:isWifi	(Landroid/content/Context;)Z
    //   336: ifeq +10 -> 346
    //   339: aload 5
    //   341: aload 4
    //   343: invokevirtual 192	com/tencent/mm/ch/d:acT	(Ljava/lang/String;)V
    //   346: aload_0
    //   347: getfield 19	com/tencent/mm/ch/d$1:uGf	Lcom/tencent/mm/ch/d;
    //   350: invokestatic 50	com/tencent/mm/ch/d:b	(Lcom/tencent/mm/ch/d;)Z
    //   353: pop
    //   354: return
    //   355: astore 4
    //   357: ldc 194
    //   359: aload 4
    //   361: ldc 196
    //   363: iconst_0
    //   364: anewarray 4	java/lang/Object
    //   367: invokestatic 200	com/tencent/mm/sdk/platformtools/y:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   370: new 28	java/lang/IncompatibleClassChangeError
    //   373: dup
    //   374: ldc 196
    //   376: invokespecial 201	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   379: aload 4
    //   381: invokevirtual 205	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   384: checkcast 28	java/lang/IncompatibleClassChangeError
    //   387: checkcast 28	java/lang/IncompatibleClassChangeError
    //   390: athrow
    //   391: astore 4
    //   393: aload_0
    //   394: getfield 19	com/tencent/mm/ch/d$1:uGf	Lcom/tencent/mm/ch/d;
    //   397: invokestatic 50	com/tencent/mm/ch/d:b	(Lcom/tencent/mm/ch/d;)Z
    //   400: pop
    //   401: aload 4
    //   403: athrow
    //   404: astore 4
    //   406: ldc 94
    //   408: aload 4
    //   410: ldc 207
    //   412: iconst_0
    //   413: anewarray 4	java/lang/Object
    //   416: invokestatic 200	com/tencent/mm/sdk/platformtools/y:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   419: aload_0
    //   420: getfield 19	com/tencent/mm/ch/d$1:uGf	Lcom/tencent/mm/ch/d;
    //   423: invokestatic 50	com/tencent/mm/ch/d:b	(Lcom/tencent/mm/ch/d;)Z
    //   426: pop
    //   427: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	428	0	this	1
    //   19	309	1	i	int
    //   97	30	2	l	long
    //   10	196	4	localObject1	Object
    //   227	73	4	localException	java.lang.Exception
    //   304	38	4	str	java.lang.String
    //   355	25	4	localIncompatibleClassChangeError	java.lang.IncompatibleClassChangeError
    //   391	11	4	localObject2	Object
    //   404	5	4	localThrowable	java.lang.Throwable
    //   27	313	5	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   203	210	227	java/lang/Exception
    //   0	29	355	java/lang/IncompatibleClassChangeError
    //   43	203	355	java/lang/IncompatibleClassChangeError
    //   203	210	355	java/lang/IncompatibleClassChangeError
    //   210	218	355	java/lang/IncompatibleClassChangeError
    //   229	267	355	java/lang/IncompatibleClassChangeError
    //   276	299	355	java/lang/IncompatibleClassChangeError
    //   299	320	355	java/lang/IncompatibleClassChangeError
    //   330	339	355	java/lang/IncompatibleClassChangeError
    //   339	346	355	java/lang/IncompatibleClassChangeError
    //   0	29	391	finally
    //   43	203	391	finally
    //   203	210	391	finally
    //   210	218	391	finally
    //   229	267	391	finally
    //   276	299	391	finally
    //   299	320	391	finally
    //   330	339	391	finally
    //   339	346	391	finally
    //   357	391	391	finally
    //   406	419	391	finally
    //   0	29	404	java/lang/Throwable
    //   43	203	404	java/lang/Throwable
    //   203	210	404	java/lang/Throwable
    //   210	218	404	java/lang/Throwable
    //   229	267	404	java/lang/Throwable
    //   276	299	404	java/lang/Throwable
    //   299	320	404	java/lang/Throwable
    //   330	339	404	java/lang/Throwable
    //   339	346	404	java/lang/Throwable
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mm\classes.jar
 * Qualified Name:     com.tencent.mm.ch.d.1
 * JD-Core Version:    0.7.0.1
 */
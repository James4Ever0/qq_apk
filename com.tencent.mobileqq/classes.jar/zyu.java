import com.tencent.mobileqq.ar.ARRecord.VideoEncoderCore;

public class zyu
  extends Thread
{
  public zyu(VideoEncoderCore paramVideoEncoderCore)
  {
    super("VideoEncodeThread");
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: invokestatic 25	com/tencent/mobileqq/ar/ARRecord/VideoEncoderCore:a	()Ljava/lang/Object;
    //   3: astore_3
    //   4: aload_3
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 10	zyu:a	Lcom/tencent/mobileqq/ar/ARRecord/VideoEncoderCore;
    //   10: invokestatic 28	com/tencent/mobileqq/ar/ARRecord/VideoEncoderCore:a	(Lcom/tencent/mobileqq/ar/ARRecord/VideoEncoderCore;)Z
    //   13: ifeq +14 -> 27
    //   16: ldc 30
    //   18: iconst_1
    //   19: ldc 32
    //   21: invokestatic 38	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   24: aload_3
    //   25: monitorexit
    //   26: return
    //   27: aload_0
    //   28: getfield 10	zyu:a	Lcom/tencent/mobileqq/ar/ARRecord/VideoEncoderCore;
    //   31: invokestatic 41	com/tencent/mobileqq/ar/ARRecord/VideoEncoderCore:a	(Lcom/tencent/mobileqq/ar/ARRecord/VideoEncoderCore;)J
    //   34: lstore_1
    //   35: lload_1
    //   36: lconst_0
    //   37: lcmp
    //   38: ifne +9 -> 47
    //   41: invokestatic 25	com/tencent/mobileqq/ar/ARRecord/VideoEncoderCore:a	()Ljava/lang/Object;
    //   44: invokevirtual 46	java/lang/Object:wait	()V
    //   47: aload_3
    //   48: monitorexit
    //   49: aload_0
    //   50: getfield 10	zyu:a	Lcom/tencent/mobileqq/ar/ARRecord/VideoEncoderCore;
    //   53: invokestatic 41	com/tencent/mobileqq/ar/ARRecord/VideoEncoderCore:a	(Lcom/tencent/mobileqq/ar/ARRecord/VideoEncoderCore;)J
    //   56: lconst_0
    //   57: lcmp
    //   58: ifeq -58 -> 0
    //   61: aload_0
    //   62: getfield 10	zyu:a	Lcom/tencent/mobileqq/ar/ARRecord/VideoEncoderCore;
    //   65: aload_0
    //   66: getfield 10	zyu:a	Lcom/tencent/mobileqq/ar/ARRecord/VideoEncoderCore;
    //   69: invokestatic 41	com/tencent/mobileqq/ar/ARRecord/VideoEncoderCore:a	(Lcom/tencent/mobileqq/ar/ARRecord/VideoEncoderCore;)J
    //   72: iconst_0
    //   73: invokestatic 49	com/tencent/mobileqq/ar/ARRecord/VideoEncoderCore:a	(Lcom/tencent/mobileqq/ar/ARRecord/VideoEncoderCore;JZ)V
    //   76: aload_0
    //   77: getfield 10	zyu:a	Lcom/tencent/mobileqq/ar/ARRecord/VideoEncoderCore;
    //   80: lconst_0
    //   81: invokestatic 52	com/tencent/mobileqq/ar/ARRecord/VideoEncoderCore:a	(Lcom/tencent/mobileqq/ar/ARRecord/VideoEncoderCore;J)J
    //   84: pop2
    //   85: goto -85 -> 0
    //   88: astore 4
    //   90: ldc 30
    //   92: iconst_1
    //   93: ldc 54
    //   95: aload 4
    //   97: invokestatic 58	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   100: goto -53 -> 47
    //   103: astore 4
    //   105: aload_3
    //   106: monitorexit
    //   107: aload 4
    //   109: athrow
    //   110: astore_3
    //   111: ldc 30
    //   113: iconst_1
    //   114: ldc 60
    //   116: aload_3
    //   117: invokestatic 58	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   120: aload_0
    //   121: getfield 10	zyu:a	Lcom/tencent/mobileqq/ar/ARRecord/VideoEncoderCore;
    //   124: invokestatic 63	com/tencent/mobileqq/ar/ARRecord/VideoEncoderCore:a	(Lcom/tencent/mobileqq/ar/ARRecord/VideoEncoderCore;)Lcom/tencent/mobileqq/ar/ARRecord/VideoEncoder$VideoEncoderCallback;
    //   127: ifnull -51 -> 76
    //   130: aload_0
    //   131: getfield 10	zyu:a	Lcom/tencent/mobileqq/ar/ARRecord/VideoEncoderCore;
    //   134: invokestatic 63	com/tencent/mobileqq/ar/ARRecord/VideoEncoderCore:a	(Lcom/tencent/mobileqq/ar/ARRecord/VideoEncoderCore;)Lcom/tencent/mobileqq/ar/ARRecord/VideoEncoder$VideoEncoderCallback;
    //   137: iconst_4
    //   138: invokeinterface 68 2 0
    //   143: goto -67 -> 76
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	146	0	this	zyu
    //   34	2	1	l	long
    //   3	103	3	localObject1	java.lang.Object
    //   110	7	3	localException1	java.lang.Exception
    //   88	8	4	localException2	java.lang.Exception
    //   103	5	4	localObject2	java.lang.Object
    // Exception table:
    //   from	to	target	type
    //   41	47	88	java/lang/Exception
    //   6	26	103	finally
    //   27	35	103	finally
    //   41	47	103	finally
    //   47	49	103	finally
    //   90	100	103	finally
    //   105	107	103	finally
    //   61	76	110	java/lang/Exception
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     zyu
 * JD-Core Version:    0.7.0.1
 */
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.biz.pubaccount.CustomWebView;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.activity.photo.PhotoUtils;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.webview.swift.JsBridgeListener;
import com.tencent.mobileqq.webview.swift.WebViewPlugin;
import com.tencent.mobileqq.webview.swift.WebViewPlugin.a;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.QLog;
import common.config.service.QzoneConfig;
import cooperation.qzone.thread.BaseHandler;
import cooperation.qzone.util.GifCoder;
import cooperation.qzone.util.QZLog;
import cooperation.qzone.webviewplugin.QZoneSharePictureJsPlugin.1;
import cooperation.qzone.webviewplugin.QZoneSharePictureJsPlugin.10;
import cooperation.qzone.webviewplugin.QZoneSharePictureJsPlugin.2;
import cooperation.qzone.webviewplugin.QZoneSharePictureJsPlugin.3;
import cooperation.qzone.webviewplugin.QZoneSharePictureJsPlugin.4;
import cooperation.qzone.webviewplugin.QZoneSharePictureJsPlugin.5;
import cooperation.qzone.webviewplugin.QZoneSharePictureJsPlugin.6;
import cooperation.qzone.webviewplugin.QZoneSharePictureJsPlugin.7;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mqq.os.MqqHandler;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class awey
  extends awfr
{
  private static final String cPL = acfp.m(2131713365);
  static final Pattern pattern = Pattern.compile("@\\{uin:(\\d+),nick:(.+?)\\}");
  awal.a a = new awez(this);
  private String callback;
  
  /* Error */
  private String K(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: new 51	java/lang/StringBuilder
    //   6: dup
    //   7: invokespecial 52	java/lang/StringBuilder:<init>	()V
    //   10: getstatic 57	awal:cOD	Ljava/lang/String;
    //   13: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: invokestatic 67	java/lang/System:currentTimeMillis	()J
    //   19: invokestatic 73	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   22: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: ldc 75
    //   27: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   33: astore_3
    //   34: new 81	java/io/File
    //   37: dup
    //   38: getstatic 57	awal:cOD	Ljava/lang/String;
    //   41: invokespecial 84	java/io/File:<init>	(Ljava/lang/String;)V
    //   44: astore 4
    //   46: aload 4
    //   48: invokevirtual 88	java/io/File:exists	()Z
    //   51: ifne +9 -> 60
    //   54: aload 4
    //   56: invokevirtual 91	java/io/File:mkdirs	()Z
    //   59: pop
    //   60: new 81	java/io/File
    //   63: dup
    //   64: aload_3
    //   65: invokespecial 84	java/io/File:<init>	(Ljava/lang/String;)V
    //   68: astore 4
    //   70: aload 4
    //   72: invokevirtual 88	java/io/File:exists	()Z
    //   75: ifne +9 -> 84
    //   78: aload 4
    //   80: invokevirtual 94	java/io/File:createNewFile	()Z
    //   83: pop
    //   84: new 96	java/io/FileOutputStream
    //   87: dup
    //   88: aload 4
    //   90: invokespecial 99	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   93: astore 6
    //   95: aload 6
    //   97: astore_3
    //   98: aload 6
    //   100: aload_1
    //   101: invokevirtual 103	java/io/FileOutputStream:write	([B)V
    //   104: aload 6
    //   106: astore_3
    //   107: aload 6
    //   109: invokevirtual 106	java/io/FileOutputStream:flush	()V
    //   112: aload 6
    //   114: ifnull +201 -> 315
    //   117: aload 6
    //   119: invokevirtual 109	java/io/FileOutputStream:close	()V
    //   122: iconst_1
    //   123: istore_2
    //   124: aload 7
    //   126: astore_1
    //   127: iload_2
    //   128: ifeq +9 -> 137
    //   131: aload 4
    //   133: invokevirtual 112	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   136: astore_1
    //   137: aload_1
    //   138: areturn
    //   139: astore_1
    //   140: ldc 114
    //   142: iconst_1
    //   143: new 51	java/lang/StringBuilder
    //   146: dup
    //   147: invokespecial 52	java/lang/StringBuilder:<init>	()V
    //   150: ldc 116
    //   152: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: aload_1
    //   156: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   159: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   162: invokestatic 125	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   165: iconst_1
    //   166: istore_2
    //   167: goto -43 -> 124
    //   170: astore 5
    //   172: aconst_null
    //   173: astore 4
    //   175: aconst_null
    //   176: astore_1
    //   177: aload_1
    //   178: astore_3
    //   179: ldc 114
    //   181: iconst_1
    //   182: new 51	java/lang/StringBuilder
    //   185: dup
    //   186: invokespecial 52	java/lang/StringBuilder:<init>	()V
    //   189: ldc 127
    //   191: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: aload 5
    //   196: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   199: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   202: invokestatic 125	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   205: aload_1
    //   206: ifnull +104 -> 310
    //   209: aload_1
    //   210: invokevirtual 109	java/io/FileOutputStream:close	()V
    //   213: iconst_0
    //   214: istore_2
    //   215: goto -91 -> 124
    //   218: astore_1
    //   219: ldc 114
    //   221: iconst_1
    //   222: new 51	java/lang/StringBuilder
    //   225: dup
    //   226: invokespecial 52	java/lang/StringBuilder:<init>	()V
    //   229: ldc 116
    //   231: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: aload_1
    //   235: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   238: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   241: invokestatic 125	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   244: iconst_0
    //   245: istore_2
    //   246: goto -122 -> 124
    //   249: astore_1
    //   250: aconst_null
    //   251: astore_3
    //   252: aload_3
    //   253: ifnull +7 -> 260
    //   256: aload_3
    //   257: invokevirtual 109	java/io/FileOutputStream:close	()V
    //   260: aload_1
    //   261: athrow
    //   262: astore_3
    //   263: ldc 114
    //   265: iconst_1
    //   266: new 51	java/lang/StringBuilder
    //   269: dup
    //   270: invokespecial 52	java/lang/StringBuilder:<init>	()V
    //   273: ldc 116
    //   275: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: aload_3
    //   279: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   282: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   285: invokestatic 125	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   288: goto -28 -> 260
    //   291: astore_1
    //   292: goto -40 -> 252
    //   295: astore 5
    //   297: aconst_null
    //   298: astore_1
    //   299: goto -122 -> 177
    //   302: astore 5
    //   304: aload 6
    //   306: astore_1
    //   307: goto -130 -> 177
    //   310: iconst_0
    //   311: istore_2
    //   312: goto -188 -> 124
    //   315: iconst_1
    //   316: istore_2
    //   317: goto -193 -> 124
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	320	0	this	awey
    //   0	320	1	paramArrayOfByte	byte[]
    //   123	194	2	i	int
    //   33	224	3	localObject1	Object
    //   262	17	3	localException	Exception
    //   44	130	4	localFile	File
    //   170	25	5	localIOException1	java.io.IOException
    //   295	1	5	localIOException2	java.io.IOException
    //   302	1	5	localIOException3	java.io.IOException
    //   93	212	6	localFileOutputStream	java.io.FileOutputStream
    //   1	124	7	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   117	122	139	java/lang/Exception
    //   34	60	170	java/io/IOException
    //   60	70	170	java/io/IOException
    //   209	213	218	java/lang/Exception
    //   34	60	249	finally
    //   60	70	249	finally
    //   70	84	249	finally
    //   84	95	249	finally
    //   256	260	262	java/lang/Exception
    //   98	104	291	finally
    //   107	112	291	finally
    //   179	205	291	finally
    //   70	84	295	java/io/IOException
    //   84	95	295	java/io/IOException
    //   98	104	302	java/io/IOException
    //   107	112	302	java/io/IOException
  }
  
  private void a(WebViewPlugin.a parama, String... paramVarArgs)
  {
    QLog.i("QZoneSharePictureJsPlugin", 1, "saxon handleGenerateGif start");
    if ((parama == null) || (paramVarArgs == null) || (paramVarArgs.length < 1))
    {
      QLog.d("QZoneSharePictureJsPlugin", 1, "QzoneWidgetAI.handleGenerateGif args is empty");
      return;
    }
    paramVarArgs = paramVarArgs[0];
    Object localObject1;
    int j;
    int i;
    boolean bool3;
    Object localObject2;
    int k;
    for (;;)
    {
      try
      {
        localObject1 = new JSONObject(paramVarArgs);
        paramVarArgs = ((JSONObject)localObject1).getJSONArray("images");
        if (paramVarArgs == null) {
          break;
        }
        j = ((JSONObject)localObject1).optInt("delay");
        i = j;
        if (j < 0) {
          i = 100;
        }
        String str = ((JSONObject)localObject1).optString("content");
        this.callback = ((JSONObject)localObject1).optString("callback");
        boolean bool2 = ((JSONObject)localObject1).optBoolean("needPublish", false);
        bool1 = ((JSONObject)localObject1).optBoolean("useSample", false);
        boolean bool4 = ((JSONObject)localObject1).optBoolean("usePath", false);
        bool3 = ((JSONObject)localObject1).optBoolean("supportMultiPiecesCallback", false);
        QLog.i("QZoneSharePictureJsPlugin", 1, "QzoneWidgetAI.handleGenerateGif frameDelay is :" + i + ",jsonArrayImages len=" + paramVarArgs.length() + ",content=" + str + ",usePath=" + bool4 + ",supportMultiPiecesCallback=" + bool3);
        localObject2 = new GifCoder();
        ((GifCoder)localObject2).WZ(false);
        ((GifCoder)localObject2).Xa(true);
        localObject1 = PhotoUtils.v(aqul.getSDKPrivatePath(acbn.oM), "IMG", ".gif");
        long l1 = System.currentTimeMillis();
        if (!bool1)
        {
          bool1 = true;
          bool1 = ((GifCoder)localObject2).a((String)localObject1, paramVarArgs, i, bool1, bool4);
          ((GifCoder)localObject2).eDi();
          long l2 = System.currentTimeMillis();
          QLog.i("QZoneSharePictureJsPlugin", 4, "encodeGif: duration=" + (l2 - l1));
          i = 0;
          paramVarArgs = "success";
          if (!bool1)
          {
            i = -1;
            paramVarArgs = "gif合成失败";
          }
          localObject2 = new JSONObject();
          ((JSONObject)localObject2).put("published", bool2);
          if (bool2) {
            break label750;
          }
          k = QzoneConfig.getInstance().getConfig("QzoneCover", "gif_cover_callback_piece_size", 1048576);
          parama = B(new File((String)localObject1));
          if (!TextUtils.isEmpty(parama)) {
            break label422;
          }
          a(this.callback, -2, "gif文件转base64失败", (JSONObject)localObject2);
          return;
        }
      }
      catch (Throwable parama)
      {
        QLog.e("QZoneSharePictureJsPlugin", 1, "handleGenerateGif fail, compressGIFTask exception.", parama);
        return;
      }
      boolean bool1 = false;
    }
    label422:
    if (!bool3)
    {
      QLog.i("QZoneSharePictureJsPlugin", 1, "saxon 不分片callback ");
      a(this.callback, i, paramVarArgs, 1, 0, parama, parama.length());
      return;
    }
    if (parama.length() <= k)
    {
      QLog.i("QZoneSharePictureJsPlugin", 1, "saxon 不分片callback len=" + parama.length());
      a(this.callback, i, paramVarArgs, 1, 0, parama, parama.length());
      return;
    }
    int m = parama.length() / k;
    if (parama.length() % k == 0) {
      j = 0;
    }
    for (;;)
    {
      m += j;
      QLog.i("QZoneSharePictureJsPlugin", 1, "saxon 分片callback pcount＝" + m + ",filelen=" + parama.length());
      j = 0;
      label582:
      if (j < m - 1)
      {
        a(this.callback, i, paramVarArgs, m, j, parama.substring(j * k, (j + 1) * k), parama.length());
        QLog.i("QZoneSharePictureJsPlugin", 1, "saxon 分片callback ,i=" + j);
        try
        {
          Thread.sleep(200L);
          j += 1;
          break label582;
          j = 1;
        }
        catch (InterruptedException localInterruptedException)
        {
          for (;;)
          {
            QLog.e("QZoneSharePictureJsPlugin", 1, "handleGenerateGif Thread.sleep(200) fail.", localInterruptedException);
          }
        }
      }
    }
    a(this.callback, i, paramVarArgs, m, m - 1, parama.substring((m - 1) * k), parama.length());
    QLog.i("QZoneSharePictureJsPlugin", 1, "saxon 分片callback last piece,i=" + (m - 1));
    return;
    label750:
    a(this.callback, i, paramVarArgs, (JSONObject)localObject2);
    paramVarArgs = avpw.d.a();
    avpw.a(parama.getActivity(), paramVarArgs, (String)localObject1, acfp.m(2131713375), localInterruptedException, -1);
  }
  
  private void a(String paramString1, int paramInt1, String paramString2, int paramInt2, int paramInt3, String paramString3, int paramInt4)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString3))) {}
    for (;;)
    {
      return;
      try
      {
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("total", paramInt2);
        localJSONObject.put("current", paramInt3);
        localJSONObject.put("base64Data", paramString3);
        localJSONObject.put("fileLength", paramInt4);
        a(paramString1, paramInt1, paramString2, localJSONObject);
        if (QLog.isDevelopLevel())
        {
          QLog.i("QZoneSharePictureJsPlugin", 1, "callback" + paramString1 + ",total=" + paramInt2 + ",current=" + paramInt3 + ",fileLength=" + paramInt4 + ",base64Data len=" + paramString3.length());
          return;
        }
      }
      catch (Exception paramString1)
      {
        QLog.e("QZoneSharePictureJsPlugin", 1, "genGifCallback fail.", paramString1);
      }
    }
  }
  
  private void a(String paramString1, int paramInt, String paramString2, JSONObject paramJSONObject)
  {
    if (TextUtils.isEmpty(paramString1)) {
      QLog.e("QZoneSharePictureJsPlugin", 1, "callback is null");
    }
    for (;;)
    {
      return;
      try
      {
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("retCode", paramInt);
        localJSONObject.put("msg", paramString2);
        localJSONObject.put("data", paramJSONObject);
        paramJSONObject = localJSONObject.toString();
        QLog.i("QZoneSharePictureJsPlugin", 1, "callJs ：callback＝" + paramString1 + ", args length=" + paramJSONObject.length());
        if ((this.f != null) && (this.f.mRuntime != null) && (this.f.mRuntime.getWebView() != null))
        {
          this.f.mRuntime.getWebView().callJs(paramString1, new String[] { paramJSONObject });
          QLog.i("QZoneSharePictureJsPlugin", 1, "callJs ：retCode = " + paramInt + ", msg = " + paramString2);
          return;
        }
      }
      catch (JSONException paramString1)
      {
        QLog.e("QZoneSharePictureJsPlugin", 1, "JSONException", paramString1);
        return;
      }
      catch (OutOfMemoryError paramString2)
      {
        QLog.e("QZoneSharePictureJsPlugin", 1, "callJS OutOfMemoryError 内存不足", paramString2);
        try
        {
          paramString2 = new JSONObject();
          paramString2.put("retCode", -1);
          paramString2.put("msg", acfp.m(2131713366));
          paramString2 = paramString2.toString();
          if ((this.f != null) && (this.f.mRuntime != null) && (this.f.mRuntime.getWebView() != null))
          {
            this.f.mRuntime.getWebView().callJs(paramString1, new String[] { paramString2 });
            QLog.i("QZoneSharePictureJsPlugin", 1, "callJs ：retCode = -1 msg = 内存不足");
            return;
          }
        }
        catch (JSONException paramString1)
        {
          QLog.e("QZoneSharePictureJsPlugin", 1, "JSONException", paramString1);
        }
      }
    }
  }
  
  private void a(JSONObject paramJSONObject, String paramString, WebViewPlugin.a parama)
  {
    ThreadManager.getSubThreadHandler().post(new QZoneSharePictureJsPlugin.7(this, paramJSONObject, paramString, parama));
  }
  
  /* Error */
  public static byte[] a(Bitmap paramBitmap, int paramInt)
  {
    // Byte code:
    //   0: new 454	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: sipush 8192
    //   7: invokespecial 457	java/io/ByteArrayOutputStream:<init>	(I)V
    //   10: astore_3
    //   11: aload_3
    //   12: astore_2
    //   13: aload_0
    //   14: invokevirtual 462	android/graphics/Bitmap:hasAlpha	()Z
    //   17: ifeq +32 -> 49
    //   20: aload_3
    //   21: astore_2
    //   22: aload_0
    //   23: getstatic 468	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   26: iload_1
    //   27: aload_3
    //   28: invokevirtual 472	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   31: pop
    //   32: aload_3
    //   33: astore_2
    //   34: aload_3
    //   35: invokevirtual 476	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   38: astore_0
    //   39: aload_3
    //   40: invokevirtual 477	java/io/ByteArrayOutputStream:flush	()V
    //   43: aload_3
    //   44: invokevirtual 478	java/io/ByteArrayOutputStream:close	()V
    //   47: aload_0
    //   48: areturn
    //   49: aload_3
    //   50: astore_2
    //   51: aload_0
    //   52: getstatic 481	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   55: iload_1
    //   56: aload_3
    //   57: invokevirtual 472	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   60: pop
    //   61: goto -29 -> 32
    //   64: astore_0
    //   65: aload_3
    //   66: astore_2
    //   67: ldc 114
    //   69: iconst_1
    //   70: aload_0
    //   71: invokevirtual 482	java/lang/Exception:toString	()Ljava/lang/String;
    //   74: invokestatic 391	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   77: aload_3
    //   78: invokevirtual 477	java/io/ByteArrayOutputStream:flush	()V
    //   81: aload_3
    //   82: invokevirtual 478	java/io/ByteArrayOutputStream:close	()V
    //   85: aconst_null
    //   86: areturn
    //   87: astore_0
    //   88: ldc 114
    //   90: iconst_1
    //   91: aload_0
    //   92: invokevirtual 482	java/lang/Exception:toString	()Ljava/lang/String;
    //   95: invokestatic 391	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   98: aconst_null
    //   99: areturn
    //   100: astore_2
    //   101: ldc 114
    //   103: iconst_1
    //   104: aload_2
    //   105: invokevirtual 482	java/lang/Exception:toString	()Ljava/lang/String;
    //   108: invokestatic 391	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   111: aload_0
    //   112: areturn
    //   113: astore_0
    //   114: aconst_null
    //   115: astore_3
    //   116: aload_3
    //   117: astore_2
    //   118: ldc 114
    //   120: iconst_1
    //   121: aload_0
    //   122: invokevirtual 483	java/lang/OutOfMemoryError:toString	()Ljava/lang/String;
    //   125: invokestatic 391	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   128: aload_3
    //   129: invokevirtual 477	java/io/ByteArrayOutputStream:flush	()V
    //   132: aload_3
    //   133: invokevirtual 478	java/io/ByteArrayOutputStream:close	()V
    //   136: aconst_null
    //   137: areturn
    //   138: astore_0
    //   139: ldc 114
    //   141: iconst_1
    //   142: aload_0
    //   143: invokevirtual 482	java/lang/Exception:toString	()Ljava/lang/String;
    //   146: invokestatic 391	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   149: aconst_null
    //   150: areturn
    //   151: astore_0
    //   152: aconst_null
    //   153: astore_2
    //   154: aload_2
    //   155: invokevirtual 477	java/io/ByteArrayOutputStream:flush	()V
    //   158: aload_2
    //   159: invokevirtual 478	java/io/ByteArrayOutputStream:close	()V
    //   162: aload_0
    //   163: athrow
    //   164: astore_2
    //   165: ldc 114
    //   167: iconst_1
    //   168: aload_2
    //   169: invokevirtual 482	java/lang/Exception:toString	()Ljava/lang/String;
    //   172: invokestatic 391	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   175: goto -13 -> 162
    //   178: astore_0
    //   179: goto -25 -> 154
    //   182: astore_0
    //   183: goto -67 -> 116
    //   186: astore_0
    //   187: aconst_null
    //   188: astore_3
    //   189: goto -124 -> 65
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	192	0	paramBitmap	Bitmap
    //   0	192	1	paramInt	int
    //   12	55	2	localByteArrayOutputStream1	java.io.ByteArrayOutputStream
    //   100	5	2	localException1	Exception
    //   117	42	2	localByteArrayOutputStream2	java.io.ByteArrayOutputStream
    //   164	5	2	localException2	Exception
    //   10	179	3	localByteArrayOutputStream3	java.io.ByteArrayOutputStream
    // Exception table:
    //   from	to	target	type
    //   13	20	64	java/lang/Exception
    //   22	32	64	java/lang/Exception
    //   34	39	64	java/lang/Exception
    //   51	61	64	java/lang/Exception
    //   77	85	87	java/lang/Exception
    //   39	47	100	java/lang/Exception
    //   0	11	113	java/lang/OutOfMemoryError
    //   128	136	138	java/lang/Exception
    //   0	11	151	finally
    //   154	162	164	java/lang/Exception
    //   13	20	178	finally
    //   22	32	178	finally
    //   34	39	178	finally
    //   51	61	178	finally
    //   67	77	178	finally
    //   118	128	178	finally
    //   13	20	182	java/lang/OutOfMemoryError
    //   22	32	182	java/lang/OutOfMemoryError
    //   34	39	182	java/lang/OutOfMemoryError
    //   51	61	182	java/lang/OutOfMemoryError
    //   0	11	186	java/lang/Exception
  }
  
  private void aaP(String paramString)
  {
    if ((this.f != null) && (this.f.mRuntime != null) && (this.f.mRuntime.getWebView() != null)) {
      QQToast.a(this.f.mRuntime.getWebView().getContext(), paramString, 0).show();
    }
  }
  
  private void aaQ(String paramString)
  {
    QLog.i("QZoneSharePictureJsPlugin", 1, "doCreateTempFile arg=" + paramString);
    try
    {
      localObject1 = new JSONObject(paramString).optString("callback");
      localObject2 = localObject1;
      QLog.e("QZoneSharePictureJsPlugin", 1, "JSONObject fail", paramString);
    }
    catch (JSONException paramString)
    {
      try
      {
        if (!TextUtils.isEmpty((CharSequence)localObject1)) {
          break label113;
        }
        arxa.a().showToast("callback is null");
        QLog.e("QZoneSharePictureJsPlugin", 1, "doCreateTempFile arg=" + paramString + ",callback is null");
        return;
      }
      catch (JSONException paramString)
      {
        Object localObject1;
        Object localObject2;
        break label99;
      }
      paramString = paramString;
      localObject1 = null;
    }
    label99:
    localObject2 = localObject1;
    label113:
    paramString = avsu.b().sD();
    if (TextUtils.isEmpty(paramString))
    {
      am(localObject2, -1, acfp.m(2131713363));
      return;
    }
    try
    {
      localObject1 = new File(paramString);
      if ((!ahbj.isFileExists(paramString)) && (!((File)localObject1).mkdirs()))
      {
        QLog.e("QZoneSharePictureJsPlugin", 1, cPL);
        am(localObject2, -1, cPL);
        return;
      }
    }
    catch (Exception paramString)
    {
      QLog.e("QZoneSharePictureJsPlugin", 1, "检查临时目录失败", paramString);
      for (;;)
      {
        int i = (int)(Math.random() * 1000000.0D % 10000.0D);
        paramString = "tempfile_" + System.currentTimeMillis() + "_" + i;
        localObject1 = avsu.b().getPath(paramString);
        try
        {
          if (!new File((String)localObject1).createNewFile()) {
            break;
          }
          localObject1 = new JSONObject();
          ((JSONObject)localObject1).put("path", paramString);
          a(localObject2, 0, "", (JSONObject)localObject1);
          return;
        }
        catch (Exception paramString)
        {
          QLog.e("QZoneSharePictureJsPlugin", 1, "create file fail", paramString);
          return;
        }
        long l = aqft.getUsableSpace((File)localObject1);
        if (l < QzoneConfig.getInstance().getConfig("QzoneCover", "gif_cover_min_disk_size", 2097152))
        {
          QLog.e("QZoneSharePictureJsPlugin", 1, "手机存储空间已满，请清理后重试。 spaceLen=" + l + ",dir=" + paramString);
          am(localObject2, -1, cPL);
          return;
        }
        QLog.i("QZoneSharePictureJsPlugin", 1, "saxon spaceLen=" + l);
      }
      am(localObject2, -1, acfp.m(2131713379));
      return;
    }
  }
  
  private void aaR(String paramString)
  {
    String str1;
    try
    {
      localObject = new JSONObject(paramString);
      paramString = ((JSONObject)localObject).optString("callback");
      if (TextUtils.isEmpty(paramString))
      {
        arxa.a().showToast("callback is null");
        QLog.e("QZoneSharePictureJsPlugin", 1, "doAppendTempFile ,callback is null");
        return;
      }
      str1 = ((JSONObject)localObject).optString("path");
      if (TextUtils.isEmpty(str1))
      {
        am(paramString, -1, "path is empty");
        return;
      }
    }
    catch (JSONException paramString)
    {
      QLog.e("QZoneSharePictureJsPlugin", 1, "JSONObject fail", paramString);
      return;
    }
    if (!tR(str1))
    {
      am(paramString, -1, "path is invalid");
      return;
    }
    Object localObject = ((JSONObject)localObject).optString("data");
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      am(paramString, -1, "data is empty");
      return;
    }
    String str2 = avsu.b().getPath(str1);
    QLog.i("QZoneSharePictureJsPlugin", 1, "doAppendTempFile path=" + str2 + ",data len=" + ((String)localObject).length());
    File localFile = new File(str2);
    if (!localFile.exists())
    {
      am(paramString, -1, acfp.m(2131713362));
      return;
    }
    if (!localFile.canWrite())
    {
      am(paramString, -1, acfp.m(2131713364));
      return;
    }
    if (cv(str2, (String)localObject)) {
      try
      {
        long l = localFile.length();
        localObject = new JSONObject();
        ((JSONObject)localObject).put("path", str1);
        ((JSONObject)localObject).put("len", l);
        a(paramString, 0, "", (JSONObject)localObject);
        return;
      }
      catch (JSONException paramString)
      {
        QLog.e("QZoneSharePictureJsPlugin", 1, "JSONObject fail", paramString);
        return;
      }
    }
    am(paramString, -1, acfp.m(2131713368));
  }
  
  private void aaS(String paramString)
  {
    int i = 0;
    QLog.i("QZoneSharePictureJsPlugin", 1, "doDeleteTempFile arg=" + paramString);
    for (;;)
    {
      JSONObject localJSONObject;
      String str1;
      try
      {
        Object localObject = new JSONObject(paramString);
        paramString = ((JSONObject)localObject).optString("callback");
        localObject = ((JSONObject)localObject).optJSONArray("list");
        localJSONObject = new JSONObject();
        if ((localObject == null) || (((JSONArray)localObject).length() <= 0) || (i >= ((JSONArray)localObject).length())) {
          break label247;
        }
        str1 = ((JSONArray)localObject).getString(i);
        if (TextUtils.isEmpty(str1))
        {
          localJSONObject.put(str1, false);
          QLog.w("QZoneSharePictureJsPlugin", 1, "doDeleteTempFile fileName is empty");
        }
        else if (!tR(str1))
        {
          localJSONObject.put(str1, false);
          QLog.w("QZoneSharePictureJsPlugin", 1, "doDeleteTempFile fileName is invalid, fileName=" + str1);
        }
      }
      catch (JSONException paramString)
      {
        QLog.e("QZoneSharePictureJsPlugin", 1, "JSONObject fail", paramString);
        return;
      }
      String str2 = avsu.b().getPath(str1);
      boolean bool = ahbj.deleteFile(str2);
      localJSONObject.put(str1, bool);
      QZLog.i("QZoneSharePictureJsPlugin", "delete file " + str2 + ", ret=" + bool);
      label247:
      if (!TextUtils.isEmpty(paramString))
      {
        a(paramString, 0, "", localJSONObject);
        return;
        i += 1;
      }
    }
  }
  
  private void ad(String... paramVarArgs)
  {
    awby.a().a(new awfa(this, paramVarArgs));
  }
  
  private void am(String paramString1, int paramInt, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1)) {
      QLog.e("QZoneSharePictureJsPlugin", 1, "callback is null");
    }
    for (;;)
    {
      return;
      Object localObject = new JSONObject();
      try
      {
        ((JSONObject)localObject).put("retCode", paramInt);
        ((JSONObject)localObject).put("msg", paramString2);
        localObject = ((JSONObject)localObject).toString();
        if ((this.f != null) && (this.f.mRuntime != null) && (this.f.mRuntime.getWebView() != null))
        {
          this.f.mRuntime.getWebView().callJs(paramString1, new String[] { localObject });
          QLog.i("QZoneSharePictureJsPlugin", 1, "callJs ：retCode = " + paramInt + ", msg = " + paramString2);
          return;
        }
      }
      catch (JSONException paramString1)
      {
        QLog.e("QZoneSharePictureJsPlugin", 1, paramString1.getMessage());
      }
    }
  }
  
  private void b(WebViewPlugin.a parama, String... paramVarArgs)
  {
    int i = 0;
    Object localObject;
    if ((this.f != null) && (parama != null) && (paramVarArgs != null) && (paramVarArgs.length > 0))
    {
      String str;
      try
      {
        paramVarArgs = new JSONObject(paramVarArgs[0]);
        if (paramVarArgs == null) {
          break label292;
        }
        str = paramVarArgs.optString("type");
        localObject = paramVarArgs.optString("base64");
        this.callback = paramVarArgs.optString("callback");
        localObject = rZ((String)localObject);
        try
        {
          localObject = Base64.decode(((String)localObject).getBytes(), 0);
          localObject = K((byte[])localObject);
          if (TextUtils.isEmpty((CharSequence)localObject))
          {
            QLog.i("QZoneSharePictureJsPlugin", 1, "saveByteBufferToLocalFile catch exception");
            aaP(acfp.m(2131713373));
            return;
          }
        }
        catch (Exception parama)
        {
          QLog.w("QZoneSharePictureJsPlugin", 1, "Base64.decode Exception: " + parama.toString());
          aaP(acfp.m(2131713358));
          return;
        }
        if (!QLog.isColorLevel()) {
          break label206;
        }
      }
      catch (Exception parama)
      {
        QLog.w("QZoneSharePictureJsPlugin", 1, "handleSharePicture catch an exception in disPatchMethod", parama);
        return;
      }
      QLog.d("QZoneSharePictureJsPlugin", 1, "the filePath is " + (String)localObject);
      label206:
      if ((!TextUtils.isEmpty(str)) && (parama != null) && (parama.getActivity() != null)) {
        QLog.i("QZoneSharePictureJsPlugin", 1, "share type is " + str);
      }
      try
      {
        int j = Integer.parseInt(str);
        i = j;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;)
        {
          label292:
          QLog.w("QZoneSharePictureJsPlugin", 1, "parse string to integer catch a numberformatexcetion", localNumberFormatException);
          continue;
          paramVarArgs = new Bundle();
          paramVarArgs.putInt("forward_type", 1);
          paramVarArgs.putString("forward_filepath", (String)localObject);
          paramVarArgs.putString("forward_thumb", (String)localObject);
          paramVarArgs.putString("forward_extra", (String)localObject);
          paramVarArgs.putBoolean("key_flag_from_plugin", true);
          paramVarArgs.putBoolean("forward_photo_shortvideo_is_edited", true);
          Intent localIntent = new Intent();
          localIntent.putExtras(paramVarArgs);
          i = avpw.a(this.f, parama, 21);
          ahgq.f(parama.getActivity(), localIntent, i);
          continue;
          a(paramVarArgs, (String)localObject, parama);
          continue;
          if (awal.a().isWXinstalled())
          {
            awal.a().a(this.a);
            paramVarArgs = g((String)localObject);
            awal.a().a(BaseApplicationImpl.getContext(), (String)localObject, paramVarArgs, 0);
          }
          else if (parama.getWebView() != null)
          {
            parama.getWebView().post(new QZoneSharePictureJsPlugin.5(this, parama));
            continue;
            if (awal.a().isWXinstalled())
            {
              awal.a().a(this.a);
              awal.a().a(BaseApplicationImpl.getContext(), (String)localObject, null, 1);
            }
            else if (parama.getWebView() != null)
            {
              parama.getWebView().post(new QZoneSharePictureJsPlugin.6(this, parama));
            }
          }
        }
      }
      switch (i)
      {
      default: 
        parama = parama.a(parama.getActivity());
        if ((parama != null) && ((parama instanceof ardm.k)))
        {
          parama = ((ardm.k)parama).b().b();
          if ((parama != null) && (parama.isShowing())) {
            parama.dismiss();
          }
        }
        QLog.i("QZoneSharePictureJsPlugin", 1, "WebView share picture call jsbridge successful!");
        return;
      }
    }
    if (parama == null)
    {
      QLog.i("QZoneSharePictureJsPlugin", 1, "runtime is null");
      return;
    }
    if (paramVarArgs == null)
    {
      QLog.i("QZoneSharePictureJsPlugin", 1, "args is null");
      return;
    }
    if ((paramVarArgs != null) && (paramVarArgs.length <= 0)) {
      QLog.i("QZoneSharePictureJsPlugin", 1, "args.length = 0");
    }
  }
  
  /* Error */
  public static boolean cv(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 801	java/io/BufferedWriter
    //   5: dup
    //   6: new 803	java/io/OutputStreamWriter
    //   9: dup
    //   10: new 96	java/io/FileOutputStream
    //   13: dup
    //   14: aload_0
    //   15: iconst_1
    //   16: invokespecial 805	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   19: invokespecial 808	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;)V
    //   22: invokespecial 811	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   25: astore_2
    //   26: aload_2
    //   27: astore_0
    //   28: aload_2
    //   29: aload_1
    //   30: invokevirtual 813	java/io/BufferedWriter:write	(Ljava/lang/String;)V
    //   33: aload_2
    //   34: invokestatic 819	cooperation/qzone/util/DataUtils:closeDataObject	(Ljava/lang/Object;)Z
    //   37: pop
    //   38: iconst_1
    //   39: ireturn
    //   40: astore_3
    //   41: aconst_null
    //   42: astore_1
    //   43: aload_1
    //   44: astore_0
    //   45: ldc 114
    //   47: iconst_1
    //   48: aload_3
    //   49: iconst_0
    //   50: anewarray 821	java/lang/Object
    //   53: invokestatic 824	cooperation/qzone/util/QZLog:w	(Ljava/lang/String;ILjava/lang/Throwable;[Ljava/lang/Object;)V
    //   56: aload_1
    //   57: invokestatic 819	cooperation/qzone/util/DataUtils:closeDataObject	(Ljava/lang/Object;)Z
    //   60: pop
    //   61: iconst_0
    //   62: ireturn
    //   63: astore_0
    //   64: aload_3
    //   65: astore_1
    //   66: aload_1
    //   67: invokestatic 819	cooperation/qzone/util/DataUtils:closeDataObject	(Ljava/lang/Object;)Z
    //   70: pop
    //   71: aload_0
    //   72: athrow
    //   73: astore_2
    //   74: aload_0
    //   75: astore_1
    //   76: aload_2
    //   77: astore_0
    //   78: goto -12 -> 66
    //   81: astore_3
    //   82: aload_2
    //   83: astore_1
    //   84: goto -41 -> 43
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	paramString1	String
    //   0	87	1	paramString2	String
    //   25	9	2	localBufferedWriter	java.io.BufferedWriter
    //   73	10	2	localObject1	Object
    //   1	1	3	localObject2	Object
    //   40	25	3	localException1	Exception
    //   81	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   2	26	40	java/lang/Exception
    //   2	26	63	finally
    //   28	33	73	finally
    //   45	56	73	finally
    //   28	33	81	java/lang/Exception
  }
  
  public static byte[] g(String paramString)
  {
    Bitmap localBitmap1 = arwp.c(paramString, 120, 120, false);
    if (localBitmap1 == null) {
      return null;
    }
    paramString = a(localBitmap1, 90);
    double d = paramString.length / 30720.0D;
    if (d > 1.0D)
    {
      paramString = new Matrix();
      float f = (float)(1.0D / Math.sqrt(d));
      paramString.postScale(f, f);
      Bitmap localBitmap2 = Bitmap.createBitmap(localBitmap1, 0, 0, localBitmap1.getWidth(), localBitmap1.getHeight(), paramString, true);
      paramString = a(localBitmap2, 90);
      if (QLog.isDevelopLevel()) {
        QLog.d("QZoneSharePictureJsPlugin", 4, "thumbBmp.size:" + paramString.length / 1024 + " thumbBmp.width:" + localBitmap2.getWidth() + " thumbBmp.height:" + localBitmap2.getHeight());
      }
      localBitmap2.recycle();
    }
    for (;;)
    {
      if (QLog.isDevelopLevel()) {
        QLog.d("QZoneSharePictureJsPlugin", 4, "bitmap.size:" + paramString.length / 1024 + " bitmap.width:" + localBitmap1.getWidth() + " bitmap.height:" + localBitmap1.getHeight());
      }
      localBitmap1.recycle();
      return paramString;
    }
  }
  
  private String rZ(String paramString)
  {
    String str;
    if (paramString == null) {
      str = null;
    }
    int i;
    do
    {
      do
      {
        do
        {
          return str;
          str = paramString;
        } while (!paramString.startsWith("data:image"));
        i = paramString.indexOf("base64,");
        str = paramString;
      } while (i < 0);
      str = paramString;
    } while ("base64,".length() + i >= paramString.length());
    return paramString.substring("base64,".length() + i);
  }
  
  private void showToast(String paramString, int paramInt)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    new BaseHandler(Looper.getMainLooper()).post(new QZoneSharePictureJsPlugin.10(this, paramInt, paramString));
  }
  
  public static boolean tR(String paramString)
  {
    if (paramString == null) {}
    while ((paramString.length() > 50) || (!paramString.startsWith("tempfile_"))) {
      return false;
    }
    return Pattern.compile("[a-zA-Z0-9_]+").matcher(paramString).matches();
  }
  
  /* Error */
  String B(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: new 913	java/io/BufferedInputStream
    //   6: dup
    //   7: new 915	java/io/FileInputStream
    //   10: dup
    //   11: aload_1
    //   12: invokespecial 916	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   15: invokespecial 919	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   18: astore_2
    //   19: aload_2
    //   20: astore_1
    //   21: aload_2
    //   22: invokevirtual 922	java/io/BufferedInputStream:available	()I
    //   25: newarray byte
    //   27: astore_3
    //   28: aload_2
    //   29: astore_1
    //   30: aload_2
    //   31: aload_3
    //   32: invokevirtual 926	java/io/BufferedInputStream:read	([B)I
    //   35: pop
    //   36: aload_2
    //   37: astore_1
    //   38: aload_3
    //   39: iconst_0
    //   40: invokestatic 930	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   43: astore_3
    //   44: aload_3
    //   45: astore_1
    //   46: aload_2
    //   47: ifnull +9 -> 56
    //   50: aload_2
    //   51: invokevirtual 931	java/io/BufferedInputStream:close	()V
    //   54: aload_3
    //   55: astore_1
    //   56: aload_1
    //   57: areturn
    //   58: astore_1
    //   59: aload_1
    //   60: invokevirtual 934	java/io/IOException:printStackTrace	()V
    //   63: aload_3
    //   64: areturn
    //   65: astore_3
    //   66: aconst_null
    //   67: astore_2
    //   68: aload_2
    //   69: astore_1
    //   70: ldc 114
    //   72: iconst_1
    //   73: ldc_w 551
    //   76: aload_3
    //   77: invokestatic 936	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   80: aload 4
    //   82: astore_1
    //   83: aload_2
    //   84: ifnull -28 -> 56
    //   87: aload_2
    //   88: invokevirtual 931	java/io/BufferedInputStream:close	()V
    //   91: aconst_null
    //   92: areturn
    //   93: astore_1
    //   94: aload_1
    //   95: invokevirtual 934	java/io/IOException:printStackTrace	()V
    //   98: aconst_null
    //   99: areturn
    //   100: astore_3
    //   101: aconst_null
    //   102: astore_2
    //   103: aload_2
    //   104: astore_1
    //   105: ldc 114
    //   107: iconst_1
    //   108: ldc_w 551
    //   111: aload_3
    //   112: invokestatic 936	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   115: aload 4
    //   117: astore_1
    //   118: aload_2
    //   119: ifnull -63 -> 56
    //   122: aload_2
    //   123: invokevirtual 931	java/io/BufferedInputStream:close	()V
    //   126: aconst_null
    //   127: areturn
    //   128: astore_1
    //   129: aload_1
    //   130: invokevirtual 934	java/io/IOException:printStackTrace	()V
    //   133: aconst_null
    //   134: areturn
    //   135: astore_3
    //   136: aconst_null
    //   137: astore_2
    //   138: aload_2
    //   139: astore_1
    //   140: ldc 114
    //   142: iconst_1
    //   143: ldc_w 551
    //   146: aload_3
    //   147: invokestatic 936	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   150: aload 4
    //   152: astore_1
    //   153: aload_2
    //   154: ifnull -98 -> 56
    //   157: aload_2
    //   158: invokevirtual 931	java/io/BufferedInputStream:close	()V
    //   161: aconst_null
    //   162: areturn
    //   163: astore_1
    //   164: aload_1
    //   165: invokevirtual 934	java/io/IOException:printStackTrace	()V
    //   168: aconst_null
    //   169: areturn
    //   170: astore_2
    //   171: aconst_null
    //   172: astore_1
    //   173: aload_1
    //   174: ifnull +7 -> 181
    //   177: aload_1
    //   178: invokevirtual 931	java/io/BufferedInputStream:close	()V
    //   181: aload_2
    //   182: athrow
    //   183: astore_1
    //   184: aload_1
    //   185: invokevirtual 934	java/io/IOException:printStackTrace	()V
    //   188: goto -7 -> 181
    //   191: astore_2
    //   192: goto -19 -> 173
    //   195: astore_3
    //   196: goto -58 -> 138
    //   199: astore_3
    //   200: goto -97 -> 103
    //   203: astore_3
    //   204: goto -136 -> 68
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	207	0	this	awey
    //   0	207	1	paramFile	File
    //   18	140	2	localBufferedInputStream	java.io.BufferedInputStream
    //   170	12	2	localObject1	Object
    //   191	1	2	localObject2	Object
    //   27	37	3	localObject3	Object
    //   65	12	3	localFileNotFoundException1	java.io.FileNotFoundException
    //   100	12	3	localIOException1	java.io.IOException
    //   135	12	3	localOutOfMemoryError1	OutOfMemoryError
    //   195	1	3	localOutOfMemoryError2	OutOfMemoryError
    //   199	1	3	localIOException2	java.io.IOException
    //   203	1	3	localFileNotFoundException2	java.io.FileNotFoundException
    //   1	150	4	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   50	54	58	java/io/IOException
    //   3	19	65	java/io/FileNotFoundException
    //   87	91	93	java/io/IOException
    //   3	19	100	java/io/IOException
    //   122	126	128	java/io/IOException
    //   3	19	135	java/lang/OutOfMemoryError
    //   157	161	163	java/io/IOException
    //   3	19	170	finally
    //   177	181	183	java/io/IOException
    //   21	28	191	finally
    //   30	36	191	finally
    //   38	44	191	finally
    //   70	80	191	finally
    //   105	115	191	finally
    //   140	150	191	finally
    //   21	28	195	java/lang/OutOfMemoryError
    //   30	36	195	java/lang/OutOfMemoryError
    //   38	44	195	java/lang/OutOfMemoryError
    //   21	28	199	java/io/IOException
    //   30	36	199	java/io/IOException
    //   38	44	199	java/io/IOException
    //   21	28	203	java/io/FileNotFoundException
    //   30	36	203	java/io/FileNotFoundException
    //   38	44	203	java/io/FileNotFoundException
  }
  
  public boolean handleJsRequest(JsBridgeListener paramJsBridgeListener, String paramString1, String paramString2, String paramString3, String... paramVarArgs)
  {
    if ((!paramString2.equals("Qzone")) || (this.f == null) || (this.f.mRuntime == null)) {
      return false;
    }
    if ("sharePicture".equalsIgnoreCase(paramString3))
    {
      b(this.f.mRuntime, paramVarArgs);
      return true;
    }
    if ("generateGif".equalsIgnoreCase(paramString3))
    {
      ThreadManager.executeOnFileThread(new QZoneSharePictureJsPlugin.1(this, paramVarArgs));
      return true;
    }
    if ("createTempFile".equalsIgnoreCase(paramString3))
    {
      if ((paramVarArgs == null) || (paramVarArgs.length < 1))
      {
        QLog.e("QZoneSharePictureJsPlugin", 1, "args invalid");
        return true;
      }
      ThreadManager.executeOnFileThread(new QZoneSharePictureJsPlugin.2(this, paramVarArgs));
      return true;
    }
    if ("appendTempFile".equalsIgnoreCase(paramString3))
    {
      if ((paramVarArgs == null) || (paramVarArgs.length < 1))
      {
        QLog.e("QZoneSharePictureJsPlugin", 1, "args invalid");
        return true;
      }
      ThreadManager.executeOnFileThread(new QZoneSharePictureJsPlugin.3(this, paramVarArgs));
      return true;
    }
    if ("deleteTempFile".equalsIgnoreCase(paramString3))
    {
      if ((paramVarArgs == null) || (paramVarArgs.length < 1))
      {
        QLog.e("QZoneSharePictureJsPlugin", 1, "args invalid");
        return true;
      }
      ThreadManager.executeOnFileThread(new QZoneSharePictureJsPlugin.4(this, paramVarArgs));
      return true;
    }
    return false;
  }
  
  public void onActivityResult(Intent paramIntent, byte paramByte, int paramInt)
  {
    super.onActivityResult(paramIntent, paramByte, paramInt);
    switch (paramByte)
    {
    default: 
      return;
    }
    if (paramInt == -1) {
      paramInt = 0;
    }
    for (paramIntent = acfp.m(2131713382);; paramIntent = acfp.m(2131713360))
    {
      am(this.callback, paramInt, paramIntent);
      return;
      paramInt = 1;
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    if (this.a != null) {
      awal.a().b(this.a);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.tim\classes4.jar
 * Qualified Name:     awey
 * JD-Core Version:    0.7.0.1
 */
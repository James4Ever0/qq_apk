package cooperation.qzone;

import QMF_PROTOCAL.QmfBusiControl;
import QMF_PROTOCAL.QmfDownstream;
import ShareAlbumHelperProtocol.GetMyAlbumListReq;
import ShareAlbumHelperProtocol.GetMyAlbumListRsp;
import android.text.TextUtils;
import com.qq.jce.wup.UniAttribute;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.msf.sdk.MsfSdkUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ShareAlbumInfoRequest
{
  public static final String a = "getQQLoginMsgListData";
  public static final String b = "getQQLoginMsgListData";
  private static final String c = "hostuin";
  private static final String d = "QzoneNewService.getQQLoginMsgListData";
  private static final String e = "getQQLoginMsgListData";
  
  public static GetMyAlbumListRsp a(byte[] paramArrayOfByte, QQAppInterface paramQQAppInterface)
  {
    if (paramArrayOfByte == null) {
      paramArrayOfByte = null;
    }
    do
    {
      return paramArrayOfByte;
      paramQQAppInterface = (GetMyAlbumListRsp)a(paramArrayOfByte, paramQQAppInterface);
      paramArrayOfByte = paramQQAppInterface;
    } while (paramQQAppInterface != null);
    return null;
  }
  
  private static JceStruct a(byte[] paramArrayOfByte, QQAppInterface paramQQAppInterface)
  {
    paramQQAppInterface = new WNSStream();
    try
    {
      paramArrayOfByte = paramQQAppInterface.a(b(paramArrayOfByte));
      paramQQAppInterface = new UniAttribute();
      if ((paramArrayOfByte != null) && (paramArrayOfByte.WnsCode == 0))
      {
        paramQQAppInterface.setEncodeName("utf-8");
        paramQQAppInterface.decode(paramArrayOfByte.Extra);
        paramQQAppInterface = (QmfBusiControl)paramQQAppInterface.get("busiCompCtl");
        if ((paramQQAppInterface != null) && (1 == paramQQAppInterface.compFlag))
        {
          paramQQAppInterface = WNSStream.b(paramArrayOfByte.BusiBuff);
          if (paramQQAppInterface == null) {
            break label147;
          }
          paramArrayOfByte.BusiBuff = paramQQAppInterface;
        }
        paramQQAppInterface = new UniAttribute();
        paramQQAppInterface.setEncodeName("utf-8");
        paramQQAppInterface.decode(paramArrayOfByte.BusiBuff);
        return (JceStruct)paramQQAppInterface.get("getQQLoginMsgListData");
      }
      if (paramArrayOfByte != null)
      {
        int i = paramArrayOfByte.WnsCode;
        if (i != 0) {
          return null;
        }
      }
      if (paramArrayOfByte == null) {
        return null;
      }
    }
    catch (Exception paramArrayOfByte)
    {
      return null;
    }
    return null;
    label147:
    return null;
  }
  
  public static byte[] a(long paramLong1, long paramLong2, String paramString)
  {
    try
    {
      Object localObject1 = new UniAttribute();
      ((UniAttribute)localObject1).setEncodeName("utf8");
      ((UniAttribute)localObject1).put("hostuin", Long.valueOf(paramLong1));
      int i = MsfSdkUtils.getNextAppSeq();
      Object localObject2 = new GetMyAlbumListReq();
      ((GetMyAlbumListReq)localObject2).last_visit_time = paramLong2;
      if ((localObject2 != null) && ("getQQLoginMsgListData" != null) && ("getQQLoginMsgListData".length() > 0)) {
        ((UniAttribute)localObject1).put("getQQLoginMsgListData", localObject2);
      }
      if (!TextUtils.isEmpty(paramString)) {
        ((UniAttribute)localObject1).put("refer", paramString);
      }
      paramString = ((UniAttribute)localObject1).encode();
      localObject1 = QUA.a();
      localObject2 = PlatformInfor.a().e();
      localObject1 = new WNSStream(1000027, (String)localObject1, paramLong1, new byte[0], (String)localObject2, null);
      if (paramString != null)
      {
        paramString = a(((WNSStream)localObject1).a(i, "QzoneNewService.getQQLoginMsgListData", paramString, false));
        return paramString;
      }
      return null;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  private static byte[] a(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(paramArrayOfByte.length + 4);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    try
    {
      localDataOutputStream.writeInt(paramArrayOfByte.length + 4);
      localDataOutputStream.write(paramArrayOfByte);
      paramArrayOfByte = localByteArrayOutputStream.toByteArray();
      label76:
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      paramArrayOfByte = paramArrayOfByte;
      paramArrayOfByte.printStackTrace();
      try
      {
        localByteArrayOutputStream.close();
        localDataOutputStream.close();
        return null;
      }
      catch (Exception paramArrayOfByte)
      {
        return null;
      }
    }
    finally
    {
      try
      {
        localByteArrayOutputStream.close();
        localDataOutputStream.close();
        throw paramArrayOfByte;
      }
      catch (Exception localException1)
      {
        break label76;
      }
    }
  }
  
  private static byte[] b(byte[] paramArrayOfByte)
  {
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
    DataInputStream localDataInputStream = new DataInputStream(localByteArrayInputStream);
    try
    {
      paramArrayOfByte = new byte[localDataInputStream.readInt() - 4];
      label72:
      return paramArrayOfByte;
    }
    catch (Exception localException1)
    {
      try
      {
        localByteArrayInputStream.close();
        localDataInputStream.close();
        return paramArrayOfByte;
      }
      catch (Exception localException5) {}
      localException1 = localException1;
      paramArrayOfByte = null;
      localException1.printStackTrace();
      try
      {
        localByteArrayInputStream.close();
        localDataInputStream.close();
        return paramArrayOfByte;
      }
      catch (Exception localException2)
      {
        return paramArrayOfByte;
      }
    }
    finally
    {
      try
      {
        localByteArrayInputStream.close();
        localDataInputStream.close();
        throw paramArrayOfByte;
      }
      catch (Exception localException3)
      {
        break label72;
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     cooperation.qzone.ShareAlbumInfoRequest
 * JD-Core Version:    0.7.0.1
 */
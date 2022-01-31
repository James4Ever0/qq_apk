package com.tencent.biz.troop.file;

import android.os.Bundle;
import com.tencent.biz.ProtoUtils.TroopProtocolObserver;
import com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException;
import com.tencent.mobileqq.pb.PBInt32Field;
import tencent.im.oidb.cmd0x6d9.oidb_0x6d9.FeedsRspBody;
import tencent.im.oidb.cmd0x6d9.oidb_0x6d9.RspBody;

public abstract class TroopFileProtocol$ReqFeedsObserver
  extends ProtoUtils.TroopProtocolObserver
{
  public void a(int paramInt, byte[] paramArrayOfByte, Bundle paramBundle)
  {
    if (paramInt != 0)
    {
      a(false, paramInt, null, paramBundle);
      return;
    }
    oidb_0x6d9.RspBody localRspBody = new oidb_0x6d9.RspBody();
    try
    {
      localRspBody.mergeFrom(paramArrayOfByte);
      paramArrayOfByte = (oidb_0x6d9.FeedsRspBody)localRspBody.feeds_info_rsp.get();
      if (paramArrayOfByte.int32_ret_code.has())
      {
        a(true, 0, paramArrayOfByte, paramBundle);
        return;
      }
    }
    catch (InvalidProtocolBufferMicroException paramArrayOfByte)
    {
      a(false, -1, null, paramBundle);
      return;
    }
    a(false, -1, null, paramBundle);
  }
  
  public abstract void a(boolean paramBoolean, int paramInt, oidb_0x6d9.FeedsRspBody paramFeedsRspBody, Bundle paramBundle);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.biz.troop.file.TroopFileProtocol.ReqFeedsObserver
 * JD-Core Version:    0.7.0.1
 */
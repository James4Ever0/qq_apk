package com.tencent.mobileqq.nearby.now.model;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mobileqq.nearby.now.protocol.INowShortVideoProtoManager.Callback;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.pb.now.FeedsProtocol.GetMediaDetailRsp;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;
import tencent.im.oidb.cmd0xada.oidb_0xada.RspBody;

class InfinitePlayListDataModel$2
  implements INowShortVideoProtoManager.Callback
{
  InfinitePlayListDataModel$2(InfinitePlayListDataModel paramInfinitePlayListDataModel) {}
  
  public void a(int paramInt, byte[] paramArrayOfByte, Bundle paramBundle)
  {
    if (QLog.isColorLevel())
    {
      paramBundle = new StringBuilder();
      paramBundle.append("errorCode:   ");
      paramBundle.append(paramInt);
      QLog.i("InfinitePlayListDataModel", 2, paramBundle.toString());
    }
    if ((paramInt == 0) && (paramArrayOfByte != null)) {
      paramBundle = new oidb_0xada.RspBody();
    }
    for (;;)
    {
      try
      {
        paramBundle.mergeFrom(paramArrayOfByte);
        if (QLog.isColorLevel())
        {
          paramArrayOfByte = new StringBuilder();
          paramArrayOfByte.append("err_msg:   ");
          paramArrayOfByte.append(paramBundle.err_msg.get());
          QLog.i("InfinitePlayListDataModel", 2, paramArrayOfByte.toString());
        }
        if (paramBundle.busi_buf.has())
        {
          paramArrayOfByte = new FeedsProtocol.GetMediaDetailRsp();
          try
          {
            paramArrayOfByte.mergeFrom(paramBundle.busi_buf.get().toByteArray());
            paramBundle = this.a;
            if (paramArrayOfByte.is_end.get() == 0) {
              break label457;
            }
            bool = true;
            paramBundle.b = bool;
            this.a.a = paramArrayOfByte.total.get();
            InfinitePlayListDataModel.a(this.a, paramArrayOfByte);
            if (!TextUtils.isEmpty(InfinitePlayListDataModel.a(this.a)))
            {
              int j = -1;
              paramInt = 0;
              int i = j;
              if (paramInt >= this.a.d.size()) {
                break label470;
              }
              if (!InfinitePlayListDataModel.a(this.a).equals(((VideoData)this.a.d.get(paramInt)).c)) {
                break label463;
              }
              this.a.e.a((VideoData)this.a.d.get(paramInt));
              i = paramInt;
              break label470;
              if (paramInt <= i)
              {
                this.a.d.remove(0);
                paramInt += 1;
                continue;
              }
            }
            paramBundle = this.a.e;
            if (!paramArrayOfByte.err_code.has()) {
              break label475;
            }
            paramInt = paramArrayOfByte.err_code.get();
            paramBundle.a(1, paramInt);
            return;
          }
          catch (InvalidProtocolBufferMicroException paramArrayOfByte)
          {
            QLog.e("InfinitePlayListDataModel", 1, paramArrayOfByte, new Object[0]);
            this.a.e.a();
            return;
          }
        }
        this.a.e.a();
        return;
      }
      catch (InvalidProtocolBufferMicroException paramArrayOfByte)
      {
        paramArrayOfByte.printStackTrace();
        QLog.e("InfinitePlayListDataModel", 1, paramArrayOfByte, new Object[0]);
        this.a.e.a();
        return;
      }
      paramBundle = new StringBuilder();
      paramBundle.append("获取详情错误   errorCode=   ");
      paramBundle.append(paramInt);
      paramBundle.append(",data=");
      paramBundle.append(paramArrayOfByte);
      QLog.i("InfinitePlayListDataModel", 1, paramBundle.toString());
      return;
      label457:
      boolean bool = false;
      continue;
      label463:
      paramInt += 1;
      continue;
      label470:
      paramInt = 0;
      continue;
      label475:
      paramInt = 0;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes22.jar
 * Qualified Name:     com.tencent.mobileqq.nearby.now.model.InfinitePlayListDataModel.2
 * JD-Core Version:    0.7.0.1
 */
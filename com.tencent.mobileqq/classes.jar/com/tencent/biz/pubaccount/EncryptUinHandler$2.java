package com.tencent.biz.pubaccount;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.common.app.AppInterface;
import com.tencent.qphone.base.util.QLog;
import java.util.List;

class EncryptUinHandler$2
  extends EncryptUinHandler.EncryptUinObserver
{
  EncryptUinHandler$2(EncryptUinHandler paramEncryptUinHandler) {}
  
  protected void a(boolean paramBoolean, List<EncryptUinInfo> paramList, Bundle paramBundle)
  {
    if ((paramBoolean) && (paramList != null) && (!paramList.isEmpty()))
    {
      paramList = (EncryptUinInfo)paramList.get(0);
      if ((paramList.jdField_a_of_type_Int == 0) && (paramList.jdField_a_of_type_Long == EncryptUinHandler.a(this.a).getLongAccountUin()) && (!TextUtils.isEmpty(paramList.jdField_a_of_type_JavaLangString)))
      {
        EncryptUinHandler.a(this.a, paramList.jdField_a_of_type_JavaLangString);
        if (QLog.isColorLevel())
        {
          paramList = new StringBuilder();
          paramList.append("onGetEncryptUin: ");
          paramList.append(EncryptUinHandler.a(this.a));
          QLog.d("EncryptUinHandler", 2, paramList.toString());
        }
      }
      else if (QLog.isColorLevel())
      {
        paramBundle = new StringBuilder();
        paramBundle.append("onGetEncryptUin: failed，code=");
        paramBundle.append(paramList.jdField_a_of_type_Int);
        QLog.d("EncryptUinHandler", 2, paramBundle.toString());
      }
      if (EncryptUinHandler.a(this.a) != null) {
        EncryptUinHandler.a(this.a).a(EncryptUinHandler.a(this.a));
      }
    }
  }
  
  public void onUpdate(int paramInt, boolean paramBoolean, Object paramObject)
  {
    if (paramInt == 1)
    {
      super.onUpdate(paramInt, paramBoolean, paramObject);
      EncryptUinHandler.a(this.a).removeObserver(EncryptUinHandler.a(this.a));
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     com.tencent.biz.pubaccount.EncryptUinHandler.2
 * JD-Core Version:    0.7.0.1
 */
package com.tencent.biz.pubaccount.readinjoy.model;

import com.tencent.qphone.base.util.QLog;
import pon;

public class ArticleInfoModule$3
  implements Runnable
{
  public void run()
  {
    pon.a(true);
    QLog.d("ArticleInfoModule", 2, "getDataFromPreloadArticleListCache ： [red_pnt_push preload postdelayed 200ms callback] , article list [ " + this.jdField_a_of_type_JavaLangString + " ]");
    pon.a(this.this$0, this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg, this.jdField_a_of_type_TencentImOidbCmd0x68bOidb_cmd0x68b$RspBody, 0);
    synchronized (pon.a())
    {
      pon.a(null);
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     com.tencent.biz.pubaccount.readinjoy.model.ArticleInfoModule.3
 * JD-Core Version:    0.7.0.1
 */
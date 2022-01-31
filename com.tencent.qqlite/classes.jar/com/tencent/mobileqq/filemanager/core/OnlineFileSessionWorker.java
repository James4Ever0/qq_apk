package com.tencent.mobileqq.filemanager.core;

import MessageSvcPack.UinPairReadInfo;
import com.tencent.mobileqq.app.MessageHandler;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.message.C2CMessageProcessor;
import com.tencent.mobileqq.app.message.QQMessageFacade;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.filemanager.app.FileTransferHandler;
import com.tencent.mobileqq.filemanager.data.FileManagerEntity;
import com.tencent.mobileqq.filemanager.data.FileManagerProxy;
import com.tencent.mobileqq.filemanager.util.FileManagerUtil;
import com.tencent.mobileqq.service.message.MessageCache;
import com.tencent.mobileqq.utils.MsgUtils;
import com.tencent.qphone.base.util.QLog;
import dob;
import doc;
import dod;
import doe;
import dog;
import doh;
import doi;
import doj;
import dok;
import dol;
import dom;
import dop;
import doq;
import dor;
import dos;
import dot;
import dou;
import dov;
import dow;
import dox;
import doz;
import dpa;
import dpb;
import dpd;
import dpe;
import dpg;
import dph;
import dpi;
import dpj;
import dpk;
import dpm;
import dpn;
import dpo;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class OnlineFileSessionWorker
{
  public static final float a = 0.1F;
  public static final int a = -2;
  public static final long a = 30000L;
  public static final String a = "OnlineFileSessionWorker<FileAssistant>";
  public static final float b = 0.9F;
  public static final int b = 102400;
  public static final long b = 30000L;
  public static final int c = 4;
  public static final long c = 50000L;
  public static final int d = -1;
  public static final long d = 30000L;
  public static final int e = 1;
  public static final long e = 50000L;
  public static final int f = 2;
  public static final long f = 9223372036854775807L;
  public static final long g = 172800L;
  public QQAppInterface a;
  public FileManagerEntity a;
  private doh jdField_a_of_type_Doh;
  public dpo a;
  private Object jdField_a_of_type_JavaLangObject = new Object();
  private Timer jdField_a_of_type_JavaUtilTimer = null;
  private Object jdField_b_of_type_JavaLangObject = new Object();
  private Timer jdField_b_of_type_JavaUtilTimer = null;
  public long h;
  long i = 0L;
  public long j = 0L;
  public long k = 0L;
  long l = 0L;
  
  public OnlineFileSessionWorker(QQAppInterface paramQQAppInterface, long paramLong)
  {
    this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity = null;
    this.jdField_a_of_type_Dpo = new dpo(this);
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = paramQQAppInterface;
    this.h = paramLong;
    this.jdField_a_of_type_Doh = new doh(this);
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity == null)
    {
      QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] setCurStateOfEntityTo can not find entity . state change :(" + this.jdField_a_of_type_Doh.a() + "-> StateEnd)");
      this.jdField_a_of_type_Doh = new dop(this);
    }
    do
    {
      return;
      QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state:" + this.jdField_a_of_type_Doh.a() + " curstate of entity change: (opType:" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nOpType + " status:" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.status + ") -> (opType:" + paramInt1 + "  status:" + paramInt2 + ") savedb=" + paramBoolean);
      this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nOpType = paramInt1;
      this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.status = paramInt2;
    } while (!paramBoolean);
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().c(this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity);
  }
  
  private boolean a(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    switch (paramInt1)
    {
    default: 
      QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] error optype:" + paramInt1);
    }
    for (;;)
    {
      if (!bool)
      {
        QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] goto next state failed. state change :(" + this.jdField_a_of_type_Doh.a() + "-> StateEnd)");
        this.jdField_a_of_type_Doh = new dop(this);
      }
      return bool;
      switch (paramInt2)
      {
      default: 
        QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] no status. when GOTO_UPLOAD:" + paramInt2);
        break;
      case 9: 
        QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateCancelUploadWhenRecv)");
        this.jdField_a_of_type_Doh = new dok(this);
        bool = true;
        break;
      case 10: 
        QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateChangeToOffFailedWhenRecv)");
        this.jdField_a_of_type_Doh = new dom(this);
        bool = true;
        break;
      case 11: 
        QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateLocalFailedWhenRecv)");
        this.jdField_a_of_type_Doh = new dow(this);
        bool = true;
        break;
      case 12: 
        QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateExcepInvalidWhenRecv)");
        this.jdField_a_of_type_Doh = new dos(this);
        bool = true;
        break;
      case 14: 
        QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateUploadingWhenRecv)");
        this.jdField_a_of_type_Doh = new dpj(this);
        bool = true;
        break;
      case 15: 
        QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateWaitResultWhenRecv)");
        this.jdField_a_of_type_Doh = new dpn(this);
        bool = true;
        break;
      case 4: 
      case 5: 
      case 6: 
      case 7: 
      case 8: 
      case 13: 
        QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] can not set the status. when GOTO_UPLOAD:" + paramInt2);
        continue;
        switch (paramInt2)
        {
        default: 
          QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] no status. when STOP_UPLOAD:" + paramInt2);
          break;
        case 9: 
          QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateCancelUploadWhenPause)");
          this.jdField_a_of_type_Doh = new doj(this);
          bool = true;
          break;
        case 10: 
          QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateChangeToOffFailedWhenPause)");
          this.jdField_a_of_type_Doh = new dol(this);
          bool = true;
          break;
        case 11: 
          QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateLocalFailedWhenPause)");
          this.jdField_a_of_type_Doh = new dov(this);
          bool = true;
          break;
        case 12: 
          QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateExcepInvalidWhenPause)");
          this.jdField_a_of_type_Doh = new dor(this);
          bool = true;
          break;
        case 14: 
          QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateUploadingWhenPause)");
          this.jdField_a_of_type_Doh = new dpi(this);
          bool = true;
          break;
        case 15: 
          QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateWaitResultWhenPause)");
          this.jdField_a_of_type_Doh = new dpm(this);
          bool = true;
          break;
        case 4: 
        case 5: 
        case 6: 
        case 7: 
        case 8: 
        case 13: 
          QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] can not set the status. when STOP_UPLOAD:" + paramInt2);
          continue;
          switch (paramInt2)
          {
          default: 
            QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] no status. when BE_PC_HANDLED:" + paramInt2);
            break;
          case 5: 
            QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateAcceptByPC)");
            this.jdField_a_of_type_Doh = new doe(this);
            bool = true;
            break;
          case 6: 
            QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateRefuseByPC)");
            this.jdField_a_of_type_Doh = new dox(this);
            bool = true;
            break;
          case 7: 
            QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateSaveToWeiYunByPC)");
            this.jdField_a_of_type_Doh = new dpb(this);
            bool = true;
            break;
          case 8: 
            QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateSenderCancelSend)");
            this.jdField_a_of_type_Doh = new dpe(this);
            bool = true;
            break;
          case 9: 
            QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateCancelUploadWhenChangeToOff)");
            this.jdField_a_of_type_Doh = new doi(this);
            bool = true;
            break;
          case 12: 
            QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateExcepInvalidWhenChangeToOff)");
            this.jdField_a_of_type_Doh = new doq(this);
            bool = true;
            break;
          case 13: 
            QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateUploadoneWhenChangeToOff)");
            this.jdField_a_of_type_Doh = new dpk(this);
            bool = true;
            break;
          case 14: 
            QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateUploadingWhenChangeToOff)");
            this.jdField_a_of_type_Doh = new dph(this);
            bool = true;
            break;
          case 11: 
            QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateLocalFailedWhenChangeToOff)");
            this.jdField_a_of_type_Doh = new dou(this);
            bool = true;
            break;
          case 4: 
          case 10: 
          case 15: 
            QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] can not set the status. when BE_PC_HANDLED:" + paramInt2);
            continue;
            switch (paramInt2)
            {
            default: 
              QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] no status. when TYPE_UNKNOW:" + paramInt2);
              break;
            case 4: 
              QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateRequest)");
              this.jdField_a_of_type_Doh = new dpa(this);
              bool = true;
              break;
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
              QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] can not set the status. when TYPE_UNKNOW:" + paramInt2);
              continue;
              QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateGotoOffFileProcess)");
              this.jdField_a_of_type_Doh = new dot(this);
              bool = true;
              continue;
              switch (paramInt2)
              {
              default: 
                QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] can not set the status. when BE_PC_HANDLED_ON_RECV2OFF_FAILED:" + paramInt2);
                break;
              case 5: 
                QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateAcceptByPCWhenToOffFailed)");
                this.jdField_a_of_type_Doh = new dog(this);
                bool = true;
                break;
              case 6: 
                QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateRefuseByPCWhenToOffFailed)");
                this.jdField_a_of_type_Doh = new doz(this);
                bool = true;
                break;
              case 7: 
                QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateSaveToWeiYunByPCWhenToOffFailed)");
                this.jdField_a_of_type_Doh = new dpd(this);
                bool = true;
                break;
              case 8: 
                QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state change :(" + this.jdField_a_of_type_Doh.a() + "->StateSenderCancelSendWhenToOffFailed)");
                this.jdField_a_of_type_Doh = new dpg(this);
                bool = true;
              }
              break;
            }
            break;
          }
          break;
        }
        break;
      }
    }
  }
  
  private void b(int paramInt1, int paramInt2)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity == null)
    {
      QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] setStateToDatabase can not find entity . state change :(" + this.jdField_a_of_type_Doh.a() + "-> StateEnd)");
      this.jdField_a_of_type_Doh = new dop(this);
      return;
    }
    FileManagerEntity localFileManagerEntity = this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.clone();
    QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "] current status(opType:" + localFileManagerEntity.nOpType + " status:" + localFileManagerEntity.status + "). saveto db(opType:" + paramInt1 + "  status:" + paramInt2 + ")");
    if (-2 != paramInt1) {
      localFileManagerEntity.nOpType = paramInt1;
    }
    if (-2 != paramInt2) {
      localFileManagerEntity.status = paramInt2;
    }
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().c(localFileManagerEntity);
  }
  
  private void c(int paramInt1, int paramInt2)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity != null)
    {
      this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nOpType = paramInt1;
      this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.status = paramInt2;
    }
  }
  
  private void d(int paramInt1, int paramInt2)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity == null)
    {
      QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] setDBStateOfEntityTo can not find entity . state change :(" + this.jdField_a_of_type_Doh.a() + "-> StateEnd)");
      this.jdField_a_of_type_Doh = new dop(this);
      return;
    }
    FileManagerEntity localFileManagerEntity = this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.clone();
    QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state:" + this.jdField_a_of_type_Doh.a() + " curstate: (opType:" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nOpType + " status:" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.status + ").  save state:(opType:" + paramInt1 + "  status:" + paramInt2 + ") to DB");
    localFileManagerEntity.nOpType = paramInt1;
    localFileManagerEntity.status = paramInt2;
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().c(localFileManagerEntity);
  }
  
  private void p()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity != null)
    {
      if (0L != this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.lastTime) {
        QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state :" + this.jdField_a_of_type_Doh.a() + " initForMakeProgress. but had init. lastTime =" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.lastTime);
      }
      this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.lastTime = System.currentTimeMillis();
      QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state :" + this.jdField_a_of_type_Doh.a() + " initForMakeProgress lastTime =" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.lastTime);
    }
  }
  
  void a()
  {
    long l1 = 30000L;
    if (FileManagerUtil.a()) {
      l1 = 50000L;
    }
    synchronized (this.jdField_a_of_type_JavaLangObject)
    {
      if (this.jdField_a_of_type_JavaUtilTimer != null)
      {
        QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "] state:" + this.jdField_a_of_type_Doh.a() + " failure to startWaitSenderReplayOnRecvTimer ant it is runing");
        return;
      }
      QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "] state:" + this.jdField_a_of_type_Doh.a() + " startWaitSenderReplayOnRecvTimer. outTimerInterval=" + l1);
      this.jdField_a_of_type_JavaUtilTimer = new Timer();
      this.jdField_a_of_type_JavaUtilTimer.schedule(new dob(this), l1);
      return;
    }
  }
  
  public void a(float paramFloat)
  {
    new Thread(new dod(this, paramFloat)).start();
  }
  
  public void a(int paramInt)
  {
    this.jdField_a_of_type_Doh.a(paramInt);
    this.jdField_a_of_type_Doh = this.jdField_a_of_type_Doh.a();
    o();
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "]  state:" + this.jdField_a_of_type_Doh.a() + " stopWaitAskUpProgressResultTimer. stopWaitSenderReplayOnRecvTimer. when onSenderUploadProgressNotify");
    c();
    b();
    this.jdField_a_of_type_Doh.a(paramInt1, paramInt2);
    this.jdField_a_of_type_Doh = this.jdField_a_of_type_Doh.a();
  }
  
  public void a(int paramInt, String paramString)
  {
    this.jdField_a_of_type_Doh.a(paramInt, paramString);
    this.jdField_a_of_type_Doh = this.jdField_a_of_type_Doh.a();
  }
  
  void a(long paramLong)
  {
    long l1 = paramLong;
    if (0L == paramLong)
    {
      l1 = 30000L;
      if (FileManagerUtil.a()) {
        l1 = 50000L;
      }
    }
    synchronized (this.jdField_b_of_type_JavaLangObject)
    {
      if (this.jdField_b_of_type_JavaUtilTimer != null)
      {
        QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "] state:" + this.jdField_a_of_type_Doh.a() + " failure to startWaitAskUpProgressResultTimer ant it is runing");
        return;
      }
      QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "] state:" + this.jdField_a_of_type_Doh.a() + " startWaitAskUpProgressResultTimer. outTimerInterval=" + l1);
      this.jdField_b_of_type_JavaUtilTimer = new Timer();
      this.jdField_b_of_type_JavaUtilTimer.schedule(new doc(this), l1);
      return;
    }
  }
  
  public void a(long paramLong, String paramString)
  {
    int m;
    Object localObject;
    if ((paramLong != 0L) && (paramLong != this.l))
    {
      List localList = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(paramString, 0);
      if ((localList == null) || (localList.isEmpty())) {
        break label237;
      }
      m = localList.size() - 1;
      if (m < 0) {
        break label237;
      }
      localObject = (MessageRecord)localList.get(m);
      if (MsgUtils.b(((MessageRecord)localObject).issend)) {
        break label216;
      }
    }
    for (;;)
    {
      if (localObject != null)
      {
        if (!((MessageRecord)localObject).isread) {
          break label231;
        }
        m = 1;
      }
      for (;;)
      {
        if (m != 0)
        {
          QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] sendMsgReadedReport curFriendUin is " + paramString + ", shmsgseq  is " + paramLong);
          localObject = new ArrayList();
          ((ArrayList)localObject).add(new UinPairReadInfo(Long.valueOf(paramString).longValue(), paramLong, 0L, null));
          ((C2CMessageProcessor)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a("c2c_processor")).b((ArrayList)localObject);
          this.l = paramLong;
        }
        return;
        label216:
        m -= 1;
        break;
        m = 1;
        continue;
        label231:
        m = 0;
      }
      label237:
      localObject = null;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    dpo localdpo;
    if (paramBoolean)
    {
      localdpo = this.jdField_a_of_type_Dpo;
      localdpo.jdField_a_of_type_Int += 1;
      a();
    }
    for (;;)
    {
      this.jdField_a_of_type_Doh.a(paramBoolean);
      this.jdField_a_of_type_Doh = this.jdField_a_of_type_Doh.a();
      return;
      localdpo = this.jdField_a_of_type_Dpo;
      localdpo.jdField_b_of_type_Int += 1;
    }
  }
  
  public boolean a()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity == null) {}
    do
    {
      return false;
      if (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nOlSenderProgress != 0) {
        return true;
      }
    } while (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.fOlRecvSpeed <= 1.0E-007F);
    return true;
  }
  
  public boolean a(int paramInt, String paramString, long paramLong)
  {
    QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "]  state:" + this.jdField_a_of_type_Doh.a() + " stopWaitSenderReplayOnRecvTimer ant stopWaitAskUpProgressResultTimer. when onSenderUploadCompleted");
    d();
    boolean bool = this.jdField_a_of_type_Doh.a(paramInt, paramString, paramLong);
    this.jdField_a_of_type_Doh = this.jdField_a_of_type_Doh.a();
    return bool;
  }
  
  public boolean a(FileManagerEntity paramFileManagerEntity)
  {
    if (paramFileManagerEntity == null)
    {
      QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] init failed. state change :(" + this.jdField_a_of_type_Doh.a() + "-> StateEnd)");
      this.jdField_a_of_type_Doh = new dop(this);
      return false;
    }
    this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity = paramFileManagerEntity;
    boolean bool = a(this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nOpType, this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.status);
    QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] init state to:" + this.jdField_a_of_type_Doh.a());
    return bool;
  }
  
  public boolean a(String paramString, long paramLong)
  {
    if (this.jdField_a_of_type_Dpo.c) {
      QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "]  state:" + this.jdField_a_of_type_Doh.a() + " internalRecvOnlineFile. recv is going on, why?? ");
    }
    boolean bool = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(paramString, paramLong);
    if (!bool)
    {
      QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "]  state:" + this.jdField_a_of_type_Doh.a() + " internalRecvOnlineFile. recv cmd send failed.... ");
      paramString = this.jdField_a_of_type_Dpo;
      paramString.jdField_b_of_type_Int += 1;
    }
    do
    {
      return bool;
      QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "]  state:" + this.jdField_a_of_type_Doh.a() + " internalRecvOnlineFile. recv cmd send success, and will ask progress .... ");
      this.jdField_a_of_type_Dpo.c = true;
      this.jdField_a_of_type_Dpo.jdField_a_of_type_Boolean = false;
      this.jdField_a_of_type_Dpo.jdField_b_of_type_Boolean = false;
    } while (a(true, 0L));
    QLog.w("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "]  state:" + this.jdField_a_of_type_Doh.a() + " internalRecvOnlineFile. ask progress failed.... ");
    c(2);
    return bool;
  }
  
  public boolean a(boolean paramBoolean, long paramLong)
  {
    boolean bool = false;
    if (this.jdField_b_of_type_JavaUtilTimer == null)
    {
      if (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity == null)
      {
        QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "]. askUpProgress entity is null");
        paramBoolean = bool;
      }
      do
      {
        do
        {
          return paramBoolean;
          if ((!paramBoolean) || (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nOlSenderProgress == 0)) {}
          paramBoolean = bool;
        } while (1 == 0);
        bool = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().b(this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.peerUin, this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nOLfileSessionId);
        this.i += 1L;
        QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "] state:" + this.jdField_a_of_type_Doh.a() + " ask upload progress isSuccess = " + bool + ". askUpProgressCount=" + this.i);
        paramBoolean = bool;
      } while (!bool);
      a(paramLong);
      return bool;
    }
    QLog.w("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "]. askUpProgress is going on. return");
    return false;
  }
  
  public void b()
  {
    synchronized (this.jdField_a_of_type_JavaLangObject)
    {
      if (this.jdField_a_of_type_JavaUtilTimer != null)
      {
        this.jdField_a_of_type_JavaUtilTimer.cancel();
        this.jdField_a_of_type_JavaUtilTimer = null;
        QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "]  state:" + this.jdField_a_of_type_Doh.a() + " stopWaitSenderReplayOnRecvTimer");
        return;
      }
      QLog.w("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "]  state:" + this.jdField_a_of_type_Doh.a() + " stopWaitSenderReplayOnRecvTimer.but timer had stop");
    }
  }
  
  public void b(int paramInt)
  {
    QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "]  state:" + this.jdField_a_of_type_Doh.a() + " stopWaitSenderReplayOnRecvTimer ant stopWaitAskUpProgressResultTimer. when onNetworkChanged");
    d();
    this.jdField_a_of_type_Doh.b(1);
    this.jdField_a_of_type_Doh = this.jdField_a_of_type_Doh.a();
  }
  
  public void b(long paramLong)
  {
    this.jdField_a_of_type_Doh.a(paramLong);
    this.jdField_a_of_type_Doh = this.jdField_a_of_type_Doh.a();
  }
  
  public void b(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "]  state:" + this.jdField_a_of_type_Doh.a() + " stopWaitAskUpProgressResultTimer. when onAskSenderUpProgressResult = false");
      c();
    }
    this.jdField_a_of_type_Doh.b(paramBoolean);
    this.jdField_a_of_type_Doh = this.jdField_a_of_type_Doh.a();
  }
  
  public boolean b()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity != null)
    {
      bool1 = bool2;
      if (-1 != this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nOlSenderProgress) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public void c()
  {
    synchronized (this.jdField_b_of_type_JavaLangObject)
    {
      if (this.jdField_b_of_type_JavaUtilTimer != null)
      {
        this.jdField_b_of_type_JavaUtilTimer.cancel();
        this.jdField_b_of_type_JavaUtilTimer = null;
        QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "]  state:" + this.jdField_a_of_type_Doh.a() + " stopWaitAskUpProgressResultTimer");
        return;
      }
      QLog.w("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "]  state:" + this.jdField_a_of_type_Doh.a() + " stopWaitAskUpProgressResultTimer.but timer had stop");
    }
  }
  
  public void c(int paramInt)
  {
    if (1 == paramInt) {
      if (this.jdField_a_of_type_Dpo.c)
      {
        QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "]  state:" + this.jdField_a_of_type_Doh.a() + " recv olfile is going on. but the resp of sender is error");
        this.jdField_a_of_type_Dpo.jdField_a_of_type_Boolean = true;
      }
    }
    while ((2 != paramInt) || (!this.jdField_a_of_type_Dpo.c)) {
      return;
    }
    QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "]  state:" + this.jdField_a_of_type_Doh.a() + " recv olfile is going on. but the resp of ask progress is error");
    this.jdField_a_of_type_Dpo.jdField_b_of_type_Boolean = true;
  }
  
  public void c(boolean paramBoolean)
  {
    if (this.jdField_a_of_type_Dpo.c)
    {
      this.jdField_a_of_type_Dpo.c = false;
      this.jdField_a_of_type_Dpo.jdField_a_of_type_Boolean = false;
      this.jdField_a_of_type_Dpo.jdField_b_of_type_Boolean = false;
      if (paramBoolean) {
        QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfile session[" + this.h + "]  internalRecvOnlineFileOver.recv success!!");
      }
    }
    else
    {
      return;
    }
    QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfile session[" + this.h + "]  internalRecvOnlineFileOver.recv failed!!");
  }
  
  public boolean c()
  {
    return this.jdField_a_of_type_Doh.jdField_a_of_type_Boolean;
  }
  
  public void d()
  {
    b();
    c();
  }
  
  public boolean d()
  {
    QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "]  state:" + this.jdField_a_of_type_Doh.a() + " user recv online file....!!");
    boolean bool = this.jdField_a_of_type_Doh.a();
    this.jdField_a_of_type_Doh = this.jdField_a_of_type_Doh.a();
    return bool;
  }
  
  public void e()
  {
    QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "]  state:" + this.jdField_a_of_type_Doh.a() + " stopWaitSenderReplayOnRecvTimer ant stopWaitAskUpProgressResultTimer. when onSenderCancelUpload");
    d();
    this.jdField_a_of_type_Doh.b();
    this.jdField_a_of_type_Doh = this.jdField_a_of_type_Doh.a();
  }
  
  public boolean e()
  {
    return (!this.jdField_a_of_type_Dpo.c) || ((this.jdField_a_of_type_Dpo.jdField_a_of_type_Boolean) && (this.jdField_a_of_type_Dpo.jdField_b_of_type_Boolean));
  }
  
  public void f()
  {
    this.jdField_a_of_type_Doh.c();
    this.jdField_a_of_type_Doh = this.jdField_a_of_type_Doh.a();
  }
  
  public void g()
  {
    this.jdField_a_of_type_Doh.a();
    this.jdField_a_of_type_Doh = this.jdField_a_of_type_Doh.a();
  }
  
  public void h()
  {
    this.jdField_a_of_type_Doh.g();
    this.jdField_a_of_type_Doh = this.jdField_a_of_type_Doh.a();
  }
  
  public void i()
  {
    QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "]  state:" + this.jdField_a_of_type_Doh.a() + " stopWaitSenderReplayOnRecvTimer. stopWaitAskUpProgressResultTimer. when onSenderReplayComeOnRecv");
    b();
    c();
    this.jdField_a_of_type_Doh.e();
    this.jdField_a_of_type_Doh = this.jdField_a_of_type_Doh.a();
  }
  
  public void j()
  {
    this.jdField_a_of_type_Doh.f();
    this.jdField_a_of_type_Doh = this.jdField_a_of_type_Doh.a();
  }
  
  public void k()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity == null) {}
    long l1;
    do
    {
      return;
      l1 = MessageCache.a();
    } while ((this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.cloudType != 0) || (l1 - this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.srvTime <= 172800L));
    QLog.w("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.h + "] state :" + this.jdField_a_of_type_Doh.a() + " is too long session and invaild!!!! invaild time=" + 172800L);
    this.jdField_a_of_type_Doh.h();
    this.jdField_a_of_type_Doh = this.jdField_a_of_type_Doh.a();
  }
  
  public void l()
  {
    this.jdField_a_of_type_Doh.i();
    this.jdField_a_of_type_Doh = this.jdField_a_of_type_Doh.a();
  }
  
  public void m()
  {
    QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "]  state:" + this.jdField_a_of_type_Doh.a() + " stopWaitAskUpProgressResultTimer. when onAskUpProgressAndSessionInvaid");
    c();
    this.jdField_a_of_type_Doh.j();
    this.jdField_a_of_type_Doh = this.jdField_a_of_type_Doh.a();
  }
  
  public void n()
  {
    if ((this.jdField_a_of_type_Doh != null) && (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity != null))
    {
      QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "]  state:" + this.jdField_a_of_type_Doh.a() + " stop worker...");
      d();
      this.jdField_a_of_type_Doh.k();
      this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity = null;
      this.h = 0L;
      this.jdField_a_of_type_Doh = this.jdField_a_of_type_Doh.a();
    }
  }
  
  void o()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity != null)
    {
      if ((5 == this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.status) || (6 == this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.status) || (7 == this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.status))
      {
        QLog.i("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "]  state:" + this.jdField_a_of_type_Doh.a() + " checkAndDeleteRecordFromFM mEntity.nOpType = " + this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nOpType);
        this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.bDelInFM = true;
        this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity, false);
        this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(true, 3, null);
      }
      return;
    }
    QLog.e("OnlineFileSessionWorker<FileAssistant>", 1, "OLfilesession[]  state:" + this.jdField_a_of_type_Doh.a() + " checkAndDeleteRecordFromFM. mEntity = null");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     com.tencent.mobileqq.filemanager.core.OnlineFileSessionWorker
 * JD-Core Version:    0.7.0.1
 */
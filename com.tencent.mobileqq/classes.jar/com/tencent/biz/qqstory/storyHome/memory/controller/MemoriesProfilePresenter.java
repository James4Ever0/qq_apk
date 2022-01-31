package com.tencent.biz.qqstory.storyHome.memory.controller;

import android.support.annotation.NonNull;
import com.tencent.biz.qqstory.model.SuperManager;
import com.tencent.biz.qqstory.model.UserManager;
import com.tencent.biz.qqstory.model.item.QQUserUIItem;
import com.tencent.biz.qqstory.model.item.QQUserUIItem.UserID;
import com.tencent.biz.qqstory.network.handler.GetUserInfoHandler;
import com.tencent.biz.qqstory.playmode.util.PlayModeUtils;
import com.tencent.biz.qqstory.support.logging.SLog;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tribe.async.dispatch.Dispatcher;
import com.tribe.async.dispatch.Dispatchers;
import com.tribe.async.dispatch.IEventReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import nvh;
import nvi;
import nvk;
import nvn;

public class MemoriesProfilePresenter
  implements IEventReceiver
{
  private int jdField_a_of_type_Int = -1;
  public QQUserUIItem a;
  private MemoriesProfilePresenter.GetYearNodeListReceiver jdField_a_of_type_ComTencentBizQqstoryStoryHomeMemoryControllerMemoriesProfilePresenter$GetYearNodeListReceiver;
  private MemoriesProfilePresenter.ProfilePresenterListener jdField_a_of_type_ComTencentBizQqstoryStoryHomeMemoryControllerMemoriesProfilePresenter$ProfilePresenterListener;
  private FriendListObserver jdField_a_of_type_ComTencentMobileqqAppFriendListObserver = new nvh(this);
  public String a;
  private AtomicBoolean jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean = new AtomicBoolean(false);
  private nvi jdField_a_of_type_Nvi;
  private nvk jdField_a_of_type_Nvk;
  private nvn jdField_a_of_type_Nvn;
  private int b = -1;
  
  public MemoriesProfilePresenter(String paramString, @NonNull MemoriesProfilePresenter.ProfilePresenterListener paramProfilePresenterListener)
  {
    this.jdField_a_of_type_JavaLangString = paramString;
    this.jdField_a_of_type_ComTencentBizQqstoryStoryHomeMemoryControllerMemoriesProfilePresenter$ProfilePresenterListener = paramProfilePresenterListener;
  }
  
  public void a()
  {
    this.jdField_a_of_type_Nvn = new nvn(this);
    Dispatchers.get().registerSubscriber(this.jdField_a_of_type_Nvn);
    PlayModeUtils.a().addObserver(this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver);
    this.jdField_a_of_type_Nvi = new nvi(this);
    Dispatchers.get().registerSubscriber(this.jdField_a_of_type_Nvi);
    this.jdField_a_of_type_Nvk = new nvk(this);
    Dispatchers.get().registerSubscriber(this.jdField_a_of_type_Nvk);
    this.jdField_a_of_type_ComTencentBizQqstoryStoryHomeMemoryControllerMemoriesProfilePresenter$GetYearNodeListReceiver = new MemoriesProfilePresenter.GetYearNodeListReceiver(this);
    Dispatchers.get().registerSubscriber(this.jdField_a_of_type_ComTencentBizQqstoryStoryHomeMemoryControllerMemoriesProfilePresenter$GetYearNodeListReceiver);
  }
  
  public void a(boolean paramBoolean)
  {
    SLog.b("Q.qqstory.memories.MemoriesProfilePresenter", "request refresh user info data. from cache : %s.", Boolean.valueOf(paramBoolean));
    if (paramBoolean)
    {
      this.jdField_a_of_type_ComTencentBizQqstoryModelItemQQUserUIItem = ((UserManager)SuperManager.a(2)).b(this.jdField_a_of_type_JavaLangString);
      SLog.a("Q.qqstory.memories.MemoriesProfilePresenter", "get user info from cache: %s.", this.jdField_a_of_type_ComTencentBizQqstoryModelItemQQUserUIItem);
      return;
    }
    SLog.a("Q.qqstory.memories.MemoriesProfilePresenter", "request user info by uid: %s.", this.jdField_a_of_type_JavaLangString);
    new GetUserInfoHandler().a(1, new QQUserUIItem.UserID("", this.jdField_a_of_type_JavaLangString), String.valueOf(hashCode()));
  }
  
  public void b()
  {
    Dispatchers.get().unRegisterSubscriber(this.jdField_a_of_type_Nvn);
    PlayModeUtils.a().removeObserver(this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver);
    Dispatchers.get().unRegisterSubscriber(this.jdField_a_of_type_Nvi);
    Dispatchers.get().unRegisterSubscriber(this.jdField_a_of_type_Nvk);
    Dispatchers.get().unRegisterSubscriber(this.jdField_a_of_type_ComTencentBizQqstoryStoryHomeMemoryControllerMemoriesProfilePresenter$GetYearNodeListReceiver);
    this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.set(true);
  }
  
  public boolean isValidate()
  {
    return !this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.biz.qqstory.storyHome.memory.controller.MemoriesProfilePresenter
 * JD-Core Version:    0.7.0.1
 */
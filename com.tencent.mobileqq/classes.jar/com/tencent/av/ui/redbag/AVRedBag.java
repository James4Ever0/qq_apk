package com.tencent.av.ui.redbag;

import com.tencent.av.app.VideoAppInterface;
import com.tencent.av.app.VideoObserver;
import com.tencent.av.camera.CameraObserver;
import com.tencent.av.camera.CameraUtils;
import com.tencent.av.ui.ControlUIObserver;
import kfu;
import kfv;
import kfx;

public class AVRedBag
  extends SubHandleBase
{
  public VideoObserver a;
  public CameraObserver a;
  public ControlUIObserver a;
  
  AVRedBag(AVRedBagMgr paramAVRedBagMgr)
  {
    super(paramAVRedBagMgr);
  }
  
  void a()
  {
    this.jdField_a_of_type_ComTencentAvCameraCameraObserver = new kfu(this);
    this.jdField_a_of_type_ComTencentAvAppVideoObserver = new kfv(this);
    this.jdField_a_of_type_ComTencentAvUiControlUIObserver = new kfx(this);
    CameraUtils.a(this.jdField_a_of_type_ComTencentAvAppVideoAppInterface.getApplication()).a(this.jdField_a_of_type_ComTencentAvCameraCameraObserver);
    this.jdField_a_of_type_ComTencentAvAppVideoAppInterface.a(this.jdField_a_of_type_ComTencentAvAppVideoObserver);
    this.jdField_a_of_type_ComTencentAvAppVideoAppInterface.a(this.jdField_a_of_type_ComTencentAvUiControlUIObserver);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     com.tencent.av.ui.redbag.AVRedBag
 * JD-Core Version:    0.7.0.1
 */
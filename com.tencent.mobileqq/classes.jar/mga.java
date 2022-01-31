import android.os.Handler;
import com.tencent.biz.pubaccount.readinjoy.video.VideoAutoPlayController;
import com.tencent.biz.pubaccount.readinjoy.video.VideoPlayManager;
import com.tencent.biz.pubaccount.readinjoy.video.VideoPlayManager.VideoPlayParam;
import com.tencent.biz.pubaccount.readinjoy.view.ReadInJoyBaseAdapter;
import com.tencent.biz.pubaccount.readinjoy.view.ReadInJoyBaseAdapter.VideoFeedsViewHolder;
import com.tencent.mobileqq.msf.sdk.handler.INetInfoHandler;
import com.tencent.qphone.base.util.QLog;

public class mga
  implements INetInfoHandler
{
  public mga(ReadInJoyBaseAdapter paramReadInJoyBaseAdapter) {}
  
  public void onNetMobile2None()
  {
    if (QLog.isColorLevel()) {
      QLog.d("Q.readinjoy.video", 2, "net change: mobile -> none");
    }
    ReadInJoyBaseAdapter.a(this.a).b(false);
    if ((!this.a.a()) || (!this.a.jdField_a_of_type_Boolean)) {}
    while (!this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayManager.a()) {
      return;
    }
    this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayManager.a();
  }
  
  public void onNetMobile2Wifi(String paramString)
  {
    if (QLog.isColorLevel()) {
      QLog.d("Q.readinjoy.video", 2, "net change: wifi -> mobile");
    }
    if ((this.a.c == 0) || (this.a.c == 70)) {
      ReadInJoyBaseAdapter.a(this.a).post(new mgk(this));
    }
    do
    {
      return;
      ReadInJoyBaseAdapter.a(this.a).b(true);
    } while ((!this.a.a()) || (!this.a.jdField_a_of_type_Boolean));
    ReadInJoyBaseAdapter.a(this.a).post(new mgc(this));
  }
  
  public void onNetNone2Mobile(String paramString)
  {
    if (QLog.isColorLevel()) {
      QLog.d("Q.readinjoy.video", 2, "net change: none -> mobile");
    }
    if ((this.a.c == 0) || (this.a.c == 70)) {
      ReadInJoyBaseAdapter.a(this.a).post(new mgb(this));
    }
    do
    {
      do
      {
        return;
        if (ReadInJoyBaseAdapter.a(this.a) != null) {
          ReadInJoyBaseAdapter.a(this.a).b(false);
        }
      } while ((!this.a.a()) || (!this.a.jdField_a_of_type_Boolean));
      if ((!this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayManager.a()) && (!this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayManager.c()) && (ReadInJoyBaseAdapter.a(this.a).a()))
      {
        ReadInJoyBaseAdapter.a(this.a).post(new mgd(this));
        return;
      }
    } while ((this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewReadInJoyBaseAdapter$VideoFeedsViewHolder == null) || (!this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayManager.c()) || (this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayManager.b() != this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewReadInJoyBaseAdapter$VideoFeedsViewHolder.a.a) || (!ReadInJoyBaseAdapter.a(this.a).a()));
    if (QLog.isColorLevel()) {
      QLog.d("Q.readinjoy.video", 2, "net change: continue to play before video ,id : " + this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayManager.b());
    }
    this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayManager.b();
  }
  
  public void onNetNone2Wifi(String paramString)
  {
    if (QLog.isColorLevel()) {
      QLog.d("Q.readinjoy.video", 2, "net change: none -> wifi");
    }
    if ((this.a.c == 0) || (this.a.c == 70)) {
      ReadInJoyBaseAdapter.a(this.a).post(new mgi(this));
    }
    do
    {
      do
      {
        return;
        ReadInJoyBaseAdapter.a(this.a).b(true);
      } while ((!this.a.a()) || (!this.a.jdField_a_of_type_Boolean));
      if ((!this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayManager.a()) && (!this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayManager.c()))
      {
        ReadInJoyBaseAdapter.a(this.a).post(new mgj(this));
        return;
      }
    } while ((this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewReadInJoyBaseAdapter$VideoFeedsViewHolder == null) || (!this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayManager.c()) || (this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayManager.b() != this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewReadInJoyBaseAdapter$VideoFeedsViewHolder.a.a));
    if (QLog.isColorLevel()) {
      QLog.d("Q.readinjoy.video", 2, "net change: continue to play before video ,id : " + this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayManager.b());
    }
    this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayManager.b();
  }
  
  public void onNetWifi2Mobile(String paramString)
  {
    if (QLog.isColorLevel()) {
      QLog.d("Q.readinjoy.video", 2, "net change: wifi -> mobile,forwarding event to none2mobile handle");
    }
    if ((this.a.c == 0) || (this.a.c == 70)) {
      ReadInJoyBaseAdapter.a(this.a).post(new mgg(this));
    }
    do
    {
      return;
      ReadInJoyBaseAdapter.a(this.a).b(false);
    } while ((this.a.h) || (this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewReadInJoyBaseAdapter$VideoFeedsViewHolder == null));
    ReadInJoyBaseAdapter.a(this.a).post(new mgh(this));
  }
  
  public void onNetWifi2None()
  {
    if (QLog.isColorLevel()) {
      QLog.d("Q.readinjoy.video", 2, "net change: wifi -> none.");
    }
    if ((this.a.c == 0) || (this.a.c == 70)) {
      ReadInJoyBaseAdapter.a(this.a).post(new mge(this));
    }
    do
    {
      return;
      ReadInJoyBaseAdapter.a(this.a).b(false);
    } while ((this.a.h) || (this.a.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewReadInJoyBaseAdapter$VideoFeedsViewHolder == null));
    ReadInJoyBaseAdapter.a(this.a).post(new mgf(this));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     mga
 * JD-Core Version:    0.7.0.1
 */
import android.app.Activity;
import com.tencent.biz.pubaccount.readinjoy.common.ReadInJoyUtils;
import com.tencent.biz.pubaccount.readinjoy.struct.ReadinjoyVideoReportData;
import com.tencent.biz.pubaccount.readinjoy.video.VideoPlayManager;
import com.tencent.biz.pubaccount.readinjoy.video.VideoPlayManager.VideoPlayParam;
import com.tencent.biz.pubaccount.readinjoy.video.VideoPlayerWrapper;

class mdp
  implements Runnable
{
  mdp(mdl parammdl, int paramInt1, int paramInt2, String paramString, VideoPlayerWrapper paramVideoPlayerWrapper) {}
  
  public void run()
  {
    if (VideoPlayManager.a(this.jdField_a_of_type_Mdl.a) != null)
    {
      int i = this.jdField_a_of_type_Int;
      int j = this.b;
      VideoPlayManager.a(this.jdField_a_of_type_Mdl.a, VideoPlayManager.a(this.jdField_a_of_type_Mdl.a), VideoPlayManager.a(this.jdField_a_of_type_Mdl.a), 6, new int[] { i, j });
      VideoPlayManager.a(this.jdField_a_of_type_Mdl.a).a.b = (this.jdField_a_of_type_Int + ":" + this.b);
      VideoPlayManager.a(this.jdField_a_of_type_Mdl.a).a.jdField_c_of_type_JavaLangString = this.jdField_a_of_type_JavaLangString;
      VideoPlayManager.a(this.jdField_a_of_type_Mdl.a).a.jdField_a_of_type_Long = 0L;
      VideoPlayManager.a(this.jdField_a_of_type_Mdl.a).a.jdField_a_of_type_Boolean = false;
      VideoPlayManager.a(this.jdField_a_of_type_Mdl.a).a.m = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayerWrapper.c();
      VideoPlayManager.a(this.jdField_a_of_type_Mdl.a).a.d = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayerWrapper.a();
      VideoPlayManager.a(this.jdField_a_of_type_Mdl.a).a.e = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayerWrapper.b();
      VideoPlayManager.a(this.jdField_a_of_type_Mdl.a).a.jdField_c_of_type_Boolean = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayerWrapper.jdField_b_of_type_Boolean;
      VideoPlayManager.a(this.jdField_a_of_type_Mdl.a).a.p = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayerWrapper.jdField_b_of_type_Long;
      VideoPlayManager.a(this.jdField_a_of_type_Mdl.a).a.o = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayerWrapper.jdField_a_of_type_Long;
      VideoPlayManager.a(this.jdField_a_of_type_Mdl.a).a.q = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayerWrapper.e();
      VideoPlayManager.a(this.jdField_a_of_type_Mdl.a).a.r = this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayerWrapper.f();
      ReadInJoyUtils.a(VideoPlayManager.a(this.jdField_a_of_type_Mdl.a).getApplicationContext(), ReadInJoyUtils.a(), false, VideoPlayManager.a(this.jdField_a_of_type_Mdl.a).a.a());
    }
    VideoPlayManager.a(this.jdField_a_of_type_Mdl.a, null);
    VideoPlayManager.a(this.jdField_a_of_type_Mdl.a, null);
    this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyVideoVideoPlayerWrapper.h();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     mdp
 * JD-Core Version:    0.7.0.1
 */
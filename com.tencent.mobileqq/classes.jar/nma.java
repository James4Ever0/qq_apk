import com.tencent.biz.qqstory.newshare.callback.StoryShareCallback;
import com.tencent.biz.qqstory.newshare.model.ShareWeChatData;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mobileqq.wxapi.WXShareHelper;
import com.tencent.mobileqq.wxapi.WXShareHelper.WXShareListener;

public final class nma
  implements WXShareHelper.WXShareListener
{
  public nma(String paramString, StoryShareCallback paramStoryShareCallback, ShareWeChatData paramShareWeChatData) {}
  
  public void a(BaseResp paramBaseResp)
  {
    if (!this.jdField_a_of_type_JavaLangString.equals(paramBaseResp.transaction)) {
      return;
    }
    switch (paramBaseResp.errCode)
    {
    case -3: 
    case -1: 
    default: 
      if (this.jdField_a_of_type_ComTencentBizQqstoryNewshareCallbackStoryShareCallback != null) {
        this.jdField_a_of_type_ComTencentBizQqstoryNewshareCallbackStoryShareCallback.b(this.jdField_a_of_type_ComTencentBizQqstoryNewshareModelShareWeChatData);
      }
      break;
    }
    for (;;)
    {
      WXShareHelper.a().b(this);
      return;
      if (this.jdField_a_of_type_ComTencentBizQqstoryNewshareCallbackStoryShareCallback != null)
      {
        this.jdField_a_of_type_ComTencentBizQqstoryNewshareCallbackStoryShareCallback.a(this.jdField_a_of_type_ComTencentBizQqstoryNewshareModelShareWeChatData);
        continue;
        if (this.jdField_a_of_type_ComTencentBizQqstoryNewshareCallbackStoryShareCallback != null)
        {
          this.jdField_a_of_type_ComTencentBizQqstoryNewshareCallbackStoryShareCallback.c(this.jdField_a_of_type_ComTencentBizQqstoryNewshareModelShareWeChatData);
          continue;
          if (this.jdField_a_of_type_ComTencentBizQqstoryNewshareCallbackStoryShareCallback != null) {
            this.jdField_a_of_type_ComTencentBizQqstoryNewshareCallbackStoryShareCallback.b(this.jdField_a_of_type_ComTencentBizQqstoryNewshareModelShareWeChatData);
          }
        }
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     nma
 * JD-Core Version:    0.7.0.1
 */
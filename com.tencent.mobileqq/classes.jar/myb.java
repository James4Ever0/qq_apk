import com.tencent.biz.pubaccount.util.GalleryShareHelper;
import com.tencent.biz.qrcode.util.QRUtils;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mobileqq.wxapi.WXShareHelper;
import com.tencent.mobileqq.wxapi.WXShareHelper.WXShareListener;

public class myb
  implements WXShareHelper.WXShareListener
{
  public myb(GalleryShareHelper paramGalleryShareHelper, String paramString) {}
  
  public void a(BaseResp paramBaseResp)
  {
    if ((this.jdField_a_of_type_JavaLangString == null) || (!this.jdField_a_of_type_JavaLangString.equals(paramBaseResp.transaction))) {
      return;
    }
    BaseApplicationImpl.getContext();
    switch (paramBaseResp.errCode)
    {
    case -1: 
    default: 
      QRUtils.a(1, 2131435319);
    }
    for (;;)
    {
      WXShareHelper.a().b(this);
      return;
      QRUtils.a(2, 2131435318);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     myb
 * JD-Core Version:    0.7.0.1
 */
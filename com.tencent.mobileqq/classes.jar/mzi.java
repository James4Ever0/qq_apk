import com.tencent.biz.qrcode.util.QRUtils;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mobileqq.wxapi.WXShareHelper;
import com.tencent.mobileqq.wxapi.WXShareHelper.WXShareListener;

public final class mzi
  implements WXShareHelper.WXShareListener
{
  public mzi(String paramString) {}
  
  public void a(BaseResp paramBaseResp)
  {
    if ((this.a == null) || (!this.a.equals(paramBaseResp.transaction))) {
      return;
    }
    BaseApplicationImpl.getContext();
    switch (paramBaseResp.errCode)
    {
    case -1: 
    default: 
      QRUtils.a(1, 2131435303);
    }
    for (;;)
    {
      WXShareHelper.a().b(this);
      return;
      QRUtils.a(2, 2131435302);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     mzi
 * JD-Core Version:    0.7.0.1
 */
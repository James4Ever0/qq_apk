import android.content.res.Resources;
import com.tencent.av.guild.GuildMultiActivity;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.mobileqq.wxapi.WXShareHelper.WXShareListener;

public class jjw
  implements WXShareHelper.WXShareListener
{
  public jjw(GuildMultiActivity paramGuildMultiActivity) {}
  
  public void a(BaseResp paramBaseResp)
  {
    if ((this.a.b == null) || (!this.a.b.equals(paramBaseResp.transaction))) {
      return;
    }
    switch (paramBaseResp.errCode)
    {
    case -2: 
    case -1: 
    default: 
      QQToast.a(this.a, 1, 2131435286, 0).b(this.a.getResources().getDimensionPixelSize(2131558448));
      return;
    }
    QQToast.a(this.a, 2, 2131435285, 0).b(this.a.getResources().getDimensionPixelSize(2131558448));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     jjw
 * JD-Core Version:    0.7.0.1
 */
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.businessCard.activity.BusinessCardEditActivity;
import com.tencent.mobileqq.utils.ContactUtils;

public class abgd
  extends FriendListObserver
{
  public abgd(BusinessCardEditActivity paramBusinessCardEditActivity) {}
  
  protected void onUpdateFriendInfo(String paramString, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramString != null))
    {
      String str = ContactUtils.c(this.a.app, paramString, false);
      int i = 0;
      while (i < this.a.d.getChildCount())
      {
        Object localObject = this.a.d.getChildAt(i);
        if (((localObject instanceof ViewGroup)) && ((((View)localObject).getTag() instanceof abgm)) && (paramString.equals(((abgm)((View)localObject).getTag()).a)))
        {
          localObject = (TextView)((View)localObject).findViewById(2131369122);
          if (localObject != null) {
            ((TextView)localObject).setText(str);
          }
        }
        i += 1;
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     abgd
 * JD-Core Version:    0.7.0.1
 */
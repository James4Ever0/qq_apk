import android.content.Intent;
import android.text.TextUtils;
import com.tencent.biz.pubaccount.readinjoy.activity.ReadInJoyActivityHelper;
import com.tencent.biz.pubaccount.readinjoy.struct.ChannelInfo;
import com.tencent.biz.pubaccount.readinjoy.view.ReadInJoySearchTipsContainer.OnTipClickListener;
import com.tencent.mobileqq.activity.QQBrowserActivity;
import com.tencent.mobileqq.activity.contact.addcontact.ClassificationSearchActivity;
import java.util.Iterator;
import java.util.List;

public class wmx
  implements ReadInJoySearchTipsContainer.OnTipClickListener
{
  public wmx(ClassificationSearchActivity paramClassificationSearchActivity) {}
  
  public void a(String paramString)
  {
    Object localObject;
    if (paramString != null)
    {
      Iterator localIterator = this.a.c.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localObject = (ChannelInfo)localIterator.next();
      } while (!paramString.equals(((ChannelInfo)localObject).mChannelName));
    }
    for (paramString = (String)localObject;; paramString = null)
    {
      if (paramString != null)
      {
        if (!TextUtils.isEmpty(paramString.mJumpUrl))
        {
          localObject = new Intent(this.a, QQBrowserActivity.class);
          ((Intent)localObject).putExtra("hide_operation_bar", true);
          ((Intent)localObject).putExtra("url", paramString.mJumpUrl);
          this.a.startActivity((Intent)localObject);
        }
      }
      else {
        return;
      }
      ReadInJoyActivityHelper.a(this.a, paramString.mChannelID, paramString.mChannelName, paramString.mChannelType, 0);
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     wmx
 * JD-Core Version:    0.7.0.1
 */
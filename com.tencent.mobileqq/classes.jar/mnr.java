import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.biz.pubaccount.readinjoy.view.fastweb.video.FastWebVideoFeedsPlayActivity;
import com.tencent.biz.pubaccount.readinjoy.view.fastweb.video.FastWebVideoVolumeControl;

public class mnr
  implements View.OnClickListener
{
  public mnr(FastWebVideoFeedsPlayActivity paramFastWebVideoFeedsPlayActivity) {}
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == 2131367092)
    {
      paramView = FastWebVideoVolumeControl.a();
      if (FastWebVideoVolumeControl.a().b()) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false)
    {
      paramView.a(bool, "user_click", 2);
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     mnr
 * JD-Core Version:    0.7.0.1
 */
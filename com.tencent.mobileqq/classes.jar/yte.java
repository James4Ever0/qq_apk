import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mobileqq.apollo.cmgame.CmGameStartChecker.ICmGameConfirmListener;
import com.tencent.mobileqq.apollo.cmgame.CmGameStartChecker.StartCheckParam;
import com.tencent.mobileqq.apollo.store.ApolloGameActivity;

class yte
  implements Runnable
{
  yte(ytc paramytc, long paramLong, CmGameStartChecker.ICmGameConfirmListener paramICmGameConfirmListener, CmGameStartChecker.StartCheckParam paramStartCheckParam) {}
  
  public void run()
  {
    String str = String.format("当前需要更新%.1fM，马上开始?", new Object[] { Float.valueOf((float)this.jdField_a_of_type_Long * 1.0F / 1024.0F / 1024.0F) });
    ApolloGameActivity.a(this.jdField_a_of_type_Ytc.a).setVisibility(4);
    ApolloGameActivity.b(this.jdField_a_of_type_Ytc.a).setVisibility(8);
    ApolloGameActivity.c(this.jdField_a_of_type_Ytc.a).setText(str);
    ApolloGameActivity.c(this.jdField_a_of_type_Ytc.a).setVisibility(0);
    ApolloGameActivity.a(this.jdField_a_of_type_Ytc.a).setVisibility(0);
    ApolloGameActivity.a(this.jdField_a_of_type_Ytc.a).setOnClickListener(new ytf(this));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     yte
 * JD-Core Version:    0.7.0.1
 */
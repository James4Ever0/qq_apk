import android.annotation.SuppressLint;
import android.content.Context;
import com.tencent.mobileqq.activity.Conversation;
import com.tencent.mobileqq.activity.contact.SearchResultDialog;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;
import java.util.List;

public class agx
  extends SearchResultDialog
{
  public agx(Conversation paramConversation, Context paramContext, QQAppInterface paramQQAppInterface, int paramInt, AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    super(paramContext, paramQQAppInterface, paramInt, paramOnItemClickListener);
  }
  
  @SuppressLint({"UseSparseArrays"})
  protected List a(Context paramContext, QQAppInterface paramQQAppInterface, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(a(paramContext, paramQQAppInterface));
    localArrayList.addAll(super.a(paramContext, paramQQAppInterface, paramInt));
    return localArrayList;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     agx
 * JD-Core Version:    0.7.0.1
 */
import android.annotation.SuppressLint;
import android.content.Context;
import com.tencent.mobileqq.activity.ForwardOperations;
import com.tencent.mobileqq.activity.contact.SearchResultDialog;
import com.tencent.mobileqq.activity.phone.ContactListView;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.PhoneContact;
import com.tencent.mobileqq.search.ContactsSearchablePhoneContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class eph
  extends SearchResultDialog
{
  public eph(ContactListView paramContactListView, Context paramContext, QQAppInterface paramQQAppInterface, int paramInt, ForwardOperations paramForwardOperations)
  {
    super(paramContext, paramQQAppInterface, paramInt, paramForwardOperations);
  }
  
  @SuppressLint({"UseSparseArrays"})
  protected List a(Context paramContext, QQAppInterface paramQQAppInterface, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = new ArrayList();
    Iterator localIterator = this.a.a.iterator();
    if (localIterator.hasNext()) {
      ((ArrayList)localObject).addAll((List)localIterator.next());
    }
    localObject = ((ArrayList)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      localArrayList.add(new ContactsSearchablePhoneContact(paramContext, paramQQAppInterface, (PhoneContact)((Iterator)localObject).next(), 38654705664L));
    }
    return localArrayList;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     eph
 * JD-Core Version:    0.7.0.1
 */
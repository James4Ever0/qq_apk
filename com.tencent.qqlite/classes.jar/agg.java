import com.tencent.mobileqq.activity.Contacts;
import com.tencent.mobileqq.adapter.BuddyListAdapter;
import com.tencent.mobileqq.app.MessageObserver;

public class agg
  extends MessageObserver
{
  private agg(Contacts paramContacts) {}
  
  protected void a()
  {
    if (this.a.jdField_a_of_type_Boolean) {
      this.a.a(1400L, true);
    }
  }
  
  protected void a(int paramInt1, int paramInt2)
  {
    Contacts localContacts = this.a;
    if (paramInt1 != 0) {}
    for (boolean bool = true;; bool = false)
    {
      localContacts.c = bool;
      if (this.a.jdField_a_of_type_ComTencentMobileqqAdapterBuddyListAdapter != null) {
        this.a.jdField_a_of_type_ComTencentMobileqqAdapterBuddyListAdapter.b();
      }
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     agg
 * JD-Core Version:    0.7.0.1
 */
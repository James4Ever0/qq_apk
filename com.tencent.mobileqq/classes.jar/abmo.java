import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.ContactsContract.RawContacts;
import com.tencent.mobileqq.contactsync.ContactSyncManager;

public class abmo
{
  public static final String[] a = { "_id", "sourceid", "contact_id" };
  public static final String[] b = { "sync1", "sync2", "sync3" };
  
  public static final Uri a(String paramString)
  {
    return ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", paramString).appendQueryParameter("account_type", "com.tencent.mobileqq.account").appendQueryParameter("caller_is_syncadapter", ContactSyncManager.b()).build();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     abmo
 * JD-Core Version:    0.7.0.1
 */
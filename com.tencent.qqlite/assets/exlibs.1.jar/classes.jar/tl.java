import android.os.SystemClock;
import com.tencent.common.app.ThreadTracker;
import com.tencent.widget.TraceUtils;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.Vector;

class tl
  implements Iterator
{
  private Thread jdField_a_of_type_JavaLangThread;
  private final Iterator jdField_a_of_type_JavaUtilIterator = this.jdField_a_of_type_Tk.jdField_a_of_type_JavaLangIterable.iterator();
  private boolean jdField_a_of_type_Boolean;
  private Thread b;
  
  tl(tk paramtk) {}
  
  private void a()
  {
    this.jdField_a_of_type_Boolean = false;
    while ((this.jdField_a_of_type_JavaLangThread == null) && (this.jdField_a_of_type_JavaUtilIterator.hasNext()))
    {
      this.jdField_a_of_type_JavaLangThread = ((Thread)((Reference)this.jdField_a_of_type_JavaUtilIterator.next()).get());
      if ((this.jdField_a_of_type_Tk.jdField_a_of_type_Boolean) && (this.jdField_a_of_type_JavaLangThread == null)) {
        this.jdField_a_of_type_JavaUtilIterator.remove();
      }
    }
  }
  
  public Thread a()
  {
    if (!hasNext()) {
      throw new IllegalStateException();
    }
    Thread localThread = this.jdField_a_of_type_JavaLangThread;
    this.jdField_a_of_type_Boolean = true;
    this.jdField_a_of_type_JavaLangThread = null;
    this.b = localThread;
    return localThread;
  }
  
  public boolean hasNext()
  {
    a();
    return this.jdField_a_of_type_JavaLangThread != null;
  }
  
  public void remove()
  {
    if (!this.jdField_a_of_type_Boolean) {
      throw new IllegalStateException();
    }
    this.jdField_a_of_type_JavaUtilIterator.remove();
    tm localtm;
    if (this.b != null)
    {
      if (!this.b.getName().startsWith("SharedPreferencesImpl")) {
        TraceUtils.a("Thread." + this.b.getName() + "." + this.b.getId());
      }
      if (ThreadTracker.a())
      {
        localtm = ThreadTracker.a(this.b.getId(), ThreadTracker.a);
        if (localtm == null) {
          break label161;
        }
        tm.a(localtm, this.b.getName());
        tm.a(localtm, SystemClock.uptimeMillis() - ThreadTracker.a());
      }
    }
    for (;;)
    {
      if (!this.b.getName().startsWith("SharedPreferencesImpl")) {
        TraceUtils.a();
      }
      this.b = null;
      return;
      label161:
      localtm = new tm(this.b.getId(), this.b.getName(), 0L, null);
      tm.a(localtm, this.b.getName());
      tm.a(localtm, SystemClock.uptimeMillis() - ThreadTracker.a());
      ThreadTracker.a.add(localtm);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     tl
 * JD-Core Version:    0.7.0.1
 */
import common.qzone.component.cache.common.SoftHashMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class amis
  extends AbstractSet
{
  public amis(SoftHashMap paramSoftHashMap) {}
  
  public void clear()
  {
    this.a.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    return this.a.containsKey(paramObject);
  }
  
  public Iterator iterator()
  {
    return new amir(this.a);
  }
  
  public boolean remove(Object paramObject)
  {
    if (this.a.containsKey(paramObject))
    {
      this.a.remove(paramObject);
      return true;
    }
    return false;
  }
  
  public int size()
  {
    return this.a.size();
  }
  
  public Object[] toArray()
  {
    ArrayList localArrayList = new ArrayList(size());
    Iterator localIterator = iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(localIterator.next());
    }
    return localArrayList.toArray();
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    ArrayList localArrayList = new ArrayList(size());
    Iterator localIterator = iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(localIterator.next());
    }
    return localArrayList.toArray(paramArrayOfObject);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     amis
 * JD-Core Version:    0.7.0.1
 */
import com.tencent.component.network.utils.thread.internel.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class pqp
  implements Iterator
{
  private int jdField_a_of_type_Int = ArrayDeque.access$300(this.jdField_a_of_type_ComTencentComponentNetworkUtilsThreadInternelArrayDeque);
  private int b = ArrayDeque.access$200(this.jdField_a_of_type_ComTencentComponentNetworkUtilsThreadInternelArrayDeque);
  private int c = -1;
  
  private pqp(ArrayDeque paramArrayDeque) {}
  
  public boolean hasNext()
  {
    return this.jdField_a_of_type_Int != this.b;
  }
  
  public Object next()
  {
    if (this.jdField_a_of_type_Int == this.b) {
      throw new NoSuchElementException();
    }
    this.jdField_a_of_type_Int = (this.jdField_a_of_type_Int - 1 & ArrayDeque.access$400(this.jdField_a_of_type_ComTencentComponentNetworkUtilsThreadInternelArrayDeque).length - 1);
    Object localObject = ArrayDeque.access$400(this.jdField_a_of_type_ComTencentComponentNetworkUtilsThreadInternelArrayDeque)[this.jdField_a_of_type_Int];
    if ((ArrayDeque.access$200(this.jdField_a_of_type_ComTencentComponentNetworkUtilsThreadInternelArrayDeque) != this.b) || (localObject == null)) {
      throw new ConcurrentModificationException();
    }
    this.c = this.jdField_a_of_type_Int;
    return localObject;
  }
  
  public void remove()
  {
    if (this.c < 0) {
      throw new IllegalStateException();
    }
    if (!ArrayDeque.access$500(this.jdField_a_of_type_ComTencentComponentNetworkUtilsThreadInternelArrayDeque, this.c))
    {
      this.jdField_a_of_type_Int = (this.jdField_a_of_type_Int + 1 & ArrayDeque.access$400(this.jdField_a_of_type_ComTencentComponentNetworkUtilsThreadInternelArrayDeque).length - 1);
      this.b = ArrayDeque.access$200(this.jdField_a_of_type_ComTencentComponentNetworkUtilsThreadInternelArrayDeque);
    }
    this.c = -1;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     pqp
 * JD-Core Version:    0.7.0.1
 */
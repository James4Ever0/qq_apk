import com.tencent.mobileqq.activity.Leba;
import com.tencent.mobileqq.util.AccessibilityUtil;
import com.tencent.widget.CustomWidgetUtil;

class suv
  implements Runnable
{
  suv(sur paramsur, int paramInt1, int paramInt2) {}
  
  public void run()
  {
    CustomWidgetUtil.a(Leba.b(this.jdField_a_of_type_Sur.a), this.jdField_a_of_type_Int, this.b, 0);
    CustomWidgetUtil.a(this.jdField_a_of_type_Sur.a.a(), Leba.b(this.jdField_a_of_type_Sur.a), this.jdField_a_of_type_Int);
    if ((this.jdField_a_of_type_Int == 3) && (this.b > 0)) {
      AccessibilityUtil.a(Leba.a(this.jdField_a_of_type_Sur.a), "好友动态 " + this.b + "条更新");
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     suv
 * JD-Core Version:    0.7.0.1
 */
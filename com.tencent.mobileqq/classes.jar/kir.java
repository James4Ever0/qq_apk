import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.av.utils.PopupDialogQQSide;

public class kir
  implements DialogInterface.OnClickListener
{
  public kir(PopupDialogQQSide paramPopupDialogQQSide, DialogInterface.OnClickListener paramOnClickListener) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.jdField_a_of_type_AndroidContentDialogInterface$OnClickListener != null) {
      this.jdField_a_of_type_AndroidContentDialogInterface$OnClickListener.onClick(paramDialogInterface, paramInt);
    }
    paramDialogInterface.dismiss();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     kir
 * JD-Core Version:    0.7.0.1
 */
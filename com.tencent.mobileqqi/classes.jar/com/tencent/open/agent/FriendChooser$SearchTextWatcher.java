package com.tencent.open.agent;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class FriendChooser$SearchTextWatcher
  implements TextWatcher
{
  protected FriendChooser$SearchTextWatcher(FriendChooser paramFriendChooser) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    paramEditable = this.a.a.getText().toString().trim();
    this.a.a(paramEditable);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     com.tencent.open.agent.FriendChooser.SearchTextWatcher
 * JD-Core Version:    0.7.0.1
 */
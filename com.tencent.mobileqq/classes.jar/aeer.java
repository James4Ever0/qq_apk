import android.app.Activity;
import com.tencent.mobileqq.jsp.MediaApiPlugin;
import com.tencent.mobileqq.webview.swift.WebViewPlugin.PluginRuntime;
import com.tencent.mobileqq.widget.QQProgressDialog;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;

public class aeer
  extends Thread
{
  int jdField_a_of_type_Int;
  String jdField_a_of_type_JavaLangString;
  boolean jdField_a_of_type_Boolean = false;
  String[] jdField_a_of_type_ArrayOfJavaLangString;
  int jdField_b_of_type_Int;
  String jdField_b_of_type_JavaLangString;
  int jdField_c_of_type_Int;
  String jdField_c_of_type_JavaLangString = "[]";
  int jdField_d_of_type_Int;
  String jdField_d_of_type_JavaLangString;
  
  public aeer(MediaApiPlugin paramMediaApiPlugin, String paramString1, boolean paramBoolean, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String[] paramArrayOfString)
  {
    this.jdField_a_of_type_JavaLangString = paramString1;
    this.jdField_a_of_type_Int = paramInt1;
    this.jdField_b_of_type_Int = paramInt2;
    this.jdField_c_of_type_Int = paramInt3;
    this.jdField_d_of_type_Int = paramInt4;
    this.jdField_a_of_type_ArrayOfJavaLangString = paramArrayOfString;
    this.jdField_a_of_type_Boolean = paramBoolean;
    this.jdField_d_of_type_JavaLangString = paramString2;
  }
  
  public void run()
  {
    JSONArray localJSONArray = new JSONArray();
    try
    {
      j = this.jdField_a_of_type_ArrayOfJavaLangString.length;
      i = 0;
    }
    catch (OutOfMemoryError localOutOfMemoryError1)
    {
      for (;;)
      {
        int j;
        int i;
        System.gc();
        this.jdField_b_of_type_JavaLangString = "3";
        this.jdField_c_of_type_JavaLangString = "[]";
        if ((this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.a != null) && (this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.a.isShowing())) {
          this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.a.dismiss();
        }
        if (!this.jdField_a_of_type_Boolean) {
          break;
        }
        this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.callJs4OpenApiIfNeeded(this.jdField_d_of_type_JavaLangString, 0, this.jdField_c_of_type_JavaLangString);
        return;
        localOutOfMemoryError1.put(MediaApiPlugin.a(this.jdField_a_of_type_ArrayOfJavaLangString[i], this.jdField_c_of_type_Int, this.jdField_d_of_type_Int, this.jdField_a_of_type_Int, this.jdField_b_of_type_Int));
        i += 1;
      }
      if (!isInterrupted()) {
        break label231;
      }
      throw new InterruptedException();
    }
    catch (IOException localIOException)
    {
      this.jdField_b_of_type_JavaLangString = "2";
      this.jdField_c_of_type_JavaLangString = "[]";
      if ((this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.a == null) || (!this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.a.isShowing())) {
        break label207;
      }
      this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.a.dismiss();
      if (!this.jdField_a_of_type_Boolean) {
        break label454;
      }
      this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.callJs4OpenApiIfNeeded(this.jdField_d_of_type_JavaLangString, 0, this.jdField_c_of_type_JavaLangString);
      return;
      this.jdField_b_of_type_JavaLangString = "0";
      this.jdField_c_of_type_JavaLangString = localIOException.toString();
      if ((this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.a == null) || (!this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.a.isShowing())) {
        break label278;
      }
      this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.a.dismiss();
      if (!this.jdField_a_of_type_Boolean) {
        break label302;
      }
      this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.callJs4OpenApiIfNeeded(this.jdField_d_of_type_JavaLangString, 0, this.jdField_c_of_type_JavaLangString);
      return;
      try
      {
        this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.callJs(this.jdField_a_of_type_JavaLangString, new String[] { this.jdField_b_of_type_JavaLangString, this.jdField_c_of_type_JavaLangString });
        return;
      }
      catch (OutOfMemoryError localOutOfMemoryError2)
      {
        System.gc();
        this.jdField_b_of_type_JavaLangString = "3";
        this.jdField_c_of_type_JavaLangString = "[]";
        this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.callJs(this.jdField_a_of_type_JavaLangString, new String[] { this.jdField_b_of_type_JavaLangString, this.jdField_c_of_type_JavaLangString });
        return;
      }
      try
      {
        this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.callJs(this.jdField_a_of_type_JavaLangString, new String[] { this.jdField_b_of_type_JavaLangString, this.jdField_c_of_type_JavaLangString });
        return;
      }
      catch (OutOfMemoryError localOutOfMemoryError3)
      {
        System.gc();
        this.jdField_b_of_type_JavaLangString = "3";
        this.jdField_c_of_type_JavaLangString = "[]";
        this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.callJs(this.jdField_a_of_type_JavaLangString, new String[] { this.jdField_b_of_type_JavaLangString, this.jdField_c_of_type_JavaLangString });
        return;
      }
      try
      {
        this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.callJs(this.jdField_a_of_type_JavaLangString, new String[] { this.jdField_b_of_type_JavaLangString, this.jdField_c_of_type_JavaLangString });
        return;
      }
      catch (OutOfMemoryError localOutOfMemoryError4)
      {
        System.gc();
        this.jdField_b_of_type_JavaLangString = "3";
        this.jdField_c_of_type_JavaLangString = "[]";
        this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.callJs(this.jdField_a_of_type_JavaLangString, new String[] { this.jdField_b_of_type_JavaLangString, this.jdField_c_of_type_JavaLangString });
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      this.jdField_b_of_type_JavaLangString = "2";
      this.jdField_c_of_type_JavaLangString = "[]";
      if ((this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.a == null) || (!this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.a.isShowing())) {
        break label576;
      }
      this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.a.dismiss();
      if (!this.jdField_a_of_type_Boolean) {
        break label600;
      }
      this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.callJs4OpenApiIfNeeded(this.jdField_d_of_type_JavaLangString, 0, this.jdField_c_of_type_JavaLangString);
      return;
      try
      {
        this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.callJs(this.jdField_a_of_type_JavaLangString, new String[] { this.jdField_b_of_type_JavaLangString, this.jdField_c_of_type_JavaLangString });
        return;
      }
      catch (OutOfMemoryError localOutOfMemoryError5)
      {
        System.gc();
        this.jdField_b_of_type_JavaLangString = "3";
        this.jdField_c_of_type_JavaLangString = "[]";
        this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.callJs(this.jdField_a_of_type_JavaLangString, new String[] { this.jdField_b_of_type_JavaLangString, this.jdField_c_of_type_JavaLangString });
        return;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      Activity localActivity = this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.mRuntime.a();
      if ((localActivity == null) || (localActivity.isFinishing())) {
        break label711;
      }
      this.jdField_b_of_type_JavaLangString = "1";
      this.jdField_c_of_type_JavaLangString = "[]";
      if ((this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.a == null) || (!this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.a.isShowing())) {
        break label744;
      }
      this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.a.dismiss();
      if (!this.jdField_a_of_type_Boolean) {
        break label768;
      }
      this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.callJs4OpenApiIfNeeded(this.jdField_d_of_type_JavaLangString, 0, this.jdField_c_of_type_JavaLangString);
      return;
      try
      {
        this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.callJs(this.jdField_a_of_type_JavaLangString, new String[] { this.jdField_b_of_type_JavaLangString, this.jdField_c_of_type_JavaLangString });
        return;
      }
      catch (OutOfMemoryError localOutOfMemoryError6)
      {
        System.gc();
        this.jdField_b_of_type_JavaLangString = "3";
        this.jdField_c_of_type_JavaLangString = "[]";
        this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.callJs(this.jdField_a_of_type_JavaLangString, new String[] { this.jdField_b_of_type_JavaLangString, this.jdField_c_of_type_JavaLangString });
        return;
      }
    }
    finally
    {
      if ((this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.a == null) || (!this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.a.isShowing())) {
        break label878;
      }
      this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.a.dismiss();
      if (!this.jdField_a_of_type_Boolean) {
        break label903;
      }
    }
    if (i < j) {
      if (isInterrupted()) {
        throw new InterruptedException();
      }
    }
    label207:
    label231:
    label744:
    label878:
    this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.callJs4OpenApiIfNeeded(this.jdField_d_of_type_JavaLangString, 0, this.jdField_c_of_type_JavaLangString);
    for (;;)
    {
      label278:
      label302:
      label454:
      label600:
      throw localObject;
      try
      {
        label576:
        label711:
        this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.callJs(this.jdField_a_of_type_JavaLangString, new String[] { this.jdField_b_of_type_JavaLangString, this.jdField_c_of_type_JavaLangString });
      }
      catch (OutOfMemoryError localOutOfMemoryError7)
      {
        label768:
        label903:
        System.gc();
        this.jdField_b_of_type_JavaLangString = "3";
        this.jdField_c_of_type_JavaLangString = "[]";
        this.jdField_a_of_type_ComTencentMobileqqJspMediaApiPlugin.callJs(this.jdField_a_of_type_JavaLangString, new String[] { this.jdField_b_of_type_JavaLangString, this.jdField_c_of_type_JavaLangString });
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     aeer
 * JD-Core Version:    0.7.0.1
 */
package com.tencent.mobileqq.profile.view;

import android.text.TextUtils;
import com.tencent.mobileqq.util.Utils;
import com.tencent.qphone.base.util.MD5;
import java.util.Map;

public class QzonePhotoView$PhotoInfo
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 100;
  public static final int e = 101;
  public static final int f = 102;
  public String a;
  public Map a;
  public int g = 0;
  public int h;
  public int i;
  public int j;
  
  public QzonePhotoView$PhotoInfo(QzonePhotoView paramQzonePhotoView, int paramInt1, int paramInt2, Map paramMap)
  {
    this.jdField_a_of_type_JavaUtilMap = paramMap;
    this.jdField_a_of_type_JavaLangString = null;
    this.j = paramInt2;
    if (this.jdField_a_of_type_JavaUtilMap != null)
    {
      paramQzonePhotoView = new StringBuilder();
      paramQzonePhotoView.append(paramInt1);
      paramInt1 = 0;
      while (paramInt1 <= 4)
      {
        paramMap = (String)this.jdField_a_of_type_JavaUtilMap.get(Integer.valueOf(paramInt1));
        if (paramMap != null) {
          paramQzonePhotoView.append(paramMap);
        }
        paramInt1 += 1;
      }
      this.jdField_a_of_type_JavaLangString = paramQzonePhotoView.toString();
      if (!TextUtils.isEmpty(this.jdField_a_of_type_JavaLangString)) {
        this.jdField_a_of_type_JavaLangString = MD5.toMD5(this.jdField_a_of_type_JavaLangString);
      }
    }
  }
  
  private String b(int paramInt)
  {
    Object localObject = null;
    int k = 1;
    while ((TextUtils.isEmpty((CharSequence)localObject)) && (k < 5))
    {
      localObject = (String)this.jdField_a_of_type_JavaUtilMap.get(Integer.valueOf((paramInt + k) % 5));
      k += 1;
    }
    return localObject;
  }
  
  public String a()
  {
    Object localObject = null;
    if (this.jdField_a_of_type_JavaUtilMap != null)
    {
      String str = (String)this.jdField_a_of_type_JavaUtilMap.get(Integer.valueOf(1));
      localObject = str;
      if (TextUtils.isEmpty(str)) {
        localObject = b(1);
      }
    }
    return localObject;
  }
  
  public String a(int paramInt)
  {
    Object localObject = null;
    if (this.jdField_a_of_type_JavaUtilMap != null) {
      if (paramInt > 100) {
        break label51;
      }
    }
    label51:
    for (paramInt = 3;; paramInt = 2)
    {
      String str = (String)this.jdField_a_of_type_JavaUtilMap.get(Integer.valueOf(paramInt));
      localObject = str;
      if (TextUtils.isEmpty(str)) {
        localObject = b(paramInt);
      }
      return localObject;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    if ((paramObject instanceof PhotoInfo)) {
      bool = Utils.a(((PhotoInfo)paramObject).jdField_a_of_type_JavaLangString, this.jdField_a_of_type_JavaLangString);
    }
    return bool;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes3.jar
 * Qualified Name:     com.tencent.mobileqq.profile.view.QzonePhotoView.PhotoInfo
 * JD-Core Version:    0.7.0.1
 */
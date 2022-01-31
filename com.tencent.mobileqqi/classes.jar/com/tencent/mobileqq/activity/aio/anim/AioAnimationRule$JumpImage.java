package com.tencent.mobileqq.activity.aio.anim;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.text.EmotcationConstants;
import com.tencent.mobileqq.text.TextUtils;
import com.tencent.qphone.base.util.QLog;

public class AioAnimationRule$JumpImage
{
  public static final int a = 0;
  public static final String a = "Emoji";
  public static final int b = 1;
  public static final String b = "Face";
  public static final int c = 2;
  public static final String c = "Image";
  public static final int d;
  String d;
  int e;
  
  static
  {
    jdField_d_of_type_Int = (int)(32.0F * BaseApplicationImpl.getContext().getResources().getDisplayMetrics().density + 0.5F);
  }
  
  public static int a(String paramString)
  {
    if (paramString.equalsIgnoreCase("Emoji")) {
      return 0;
    }
    if (paramString.equalsIgnoreCase("Face")) {
      return 1;
    }
    if (paramString.equalsIgnoreCase("Image")) {
      return 2;
    }
    return -1;
  }
  
  public static Drawable a(Context paramContext, JumpImage paramJumpImage)
  {
    switch (paramJumpImage.e)
    {
    default: 
      return null;
    case 0: 
      paramContext = TextUtils.a(Integer.valueOf(paramJumpImage.jdField_d_of_type_JavaLangString).intValue());
      paramContext.setBounds(new Rect(0, 0, jdField_d_of_type_Int, jdField_d_of_type_Int));
      return paramContext;
    case 1: 
      paramContext = a(paramJumpImage.jdField_d_of_type_JavaLangString);
      paramContext.setBounds(new Rect(0, 0, jdField_d_of_type_Int, jdField_d_of_type_Int));
      return paramContext;
    }
    paramJumpImage = BitmapFactory.decodeFile(AioAnimationConfigHelper.o + paramJumpImage.jdField_d_of_type_JavaLangString);
    paramContext = new BitmapDrawable(paramContext.getResources(), paramJumpImage);
    paramContext.setBounds(new Rect(0, 0, jdField_d_of_type_Int, jdField_d_of_type_Int));
    return paramContext;
  }
  
  public static Drawable a(String paramString)
  {
    int j = EmotcationConstants.a.length;
    int i = 0;
    if (i < j) {
      if (paramString.equals(EmotcationConstants.a[i]))
      {
        j = i;
        if (QLog.isColorLevel()) {
          QLog.d("AioAnimationRule", 2, "find str = " + paramString + ", index = " + i);
        }
      }
    }
    for (j = i;; j = -1)
    {
      return TextUtils.a(j, false);
      i += 1;
      break;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     com.tencent.mobileqq.activity.aio.anim.AioAnimationRule.JumpImage
 * JD-Core Version:    0.7.0.1
 */
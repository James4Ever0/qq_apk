package com.tencent.mobileqq.richmedia.capture.data;

public class SubtitleItem
{
  public int a;
  public SubtitleItem.FontItem a;
  public String a;
  public boolean a;
  public int b;
  public String b;
  public boolean b;
  public String c = "";
  
  public SubtitleItem()
  {
    this.jdField_a_of_type_Int = 0;
  }
  
  public boolean a()
  {
    return this.jdField_a_of_type_Int == 0;
  }
  
  public boolean b()
  {
    return (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureDataSubtitleItem$FontItem == null) || (this.jdField_a_of_type_ComTencentMobileqqRichmediaCaptureDataSubtitleItem$FontItem.d == 2);
  }
  
  public String toString()
  {
    return "SubtitleItem{id=" + this.jdField_a_of_type_Int + " name=" + this.jdField_b_of_type_JavaLangString + " isShow=" + this.jdField_a_of_type_Boolean + " pos=" + this.jdField_b_of_type_Int + "}";
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     com.tencent.mobileqq.richmedia.capture.data.SubtitleItem
 * JD-Core Version:    0.7.0.1
 */
package com.tencent.mobileqq.shortvideo;

public class ShortVideoUploadInfo
  extends ShortVideoBaseInfo
{
  public ShortVideoUploadInfo.RetryInfo a;
  public Object a;
  public boolean a = true;
  public long b;
  public boolean b;
  public int c;
  public boolean c;
  public int d;
  public boolean d;
  public int e;
  public boolean e;
  public int f;
  public boolean f;
  public int g;
  public boolean g;
  public int h;
  public String h;
  public int i;
  public String i;
  public int j;
  public String j;
  public int k;
  public String k;
  public int l;
  public String l;
  public String m = "";
  public String n = "";
  public String o = "";
  public String p = "";
  public String q = "";
  public String r;
  
  public String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\nShortVideoUploadInfo");
    localStringBuilder.append("\n |-").append("localPath:").append(this.jdField_h_of_type_JavaLangString);
    localStringBuilder.append("\n |-").append("md5:").append(this.jdField_e_of_type_JavaLangString);
    localStringBuilder.append("\n |-").append("thumbPath:").append(this.j);
    localStringBuilder.append("\n |-").append("thumbWidth:").append(this.c);
    localStringBuilder.append("\n |-").append("thumbHeight:").append(this.d);
    localStringBuilder.append("\n |-").append("sendSizeSpec:").append(this.jdField_e_of_type_Int);
    localStringBuilder.append("\n |-").append("fileTime:").append(this.f);
    localStringBuilder.append("\n |-").append("fileSource:").append(this.l);
    localStringBuilder.append("\n |-").append("supportProgressive:").append(this.b);
    localStringBuilder.append("\n |-").append("fileWidth:").append(this.jdField_h_of_type_Int);
    localStringBuilder.append("\n |-").append("fileHeight:").append(this.i);
    return localStringBuilder.toString();
  }
  
  public boolean a()
  {
    return super.a();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a());
    localStringBuilder.append(super.toString());
    return localStringBuilder.toString();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     com.tencent.mobileqq.shortvideo.ShortVideoUploadInfo
 * JD-Core Version:    0.7.0.1
 */
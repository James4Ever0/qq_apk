package com.tencent.biz.pubaccount.readinjoy.biu;

import com.tencent.mobileqq.text.QQText.EmoticonSpan;
import com.tencent.mobileqq.text.QQTextBuilder;

public class BiuTextBuilder
  extends QQTextBuilder
{
  public BiuTextBuilder(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    super(paramCharSequence, paramInt1, paramInt2);
  }
  
  public int a()
  {
    int j = 0;
    QQText.EmoticonSpan[] arrayOfEmoticonSpan = (QQText.EmoticonSpan[])getSpans(0, super.length(), QQText.EmoticonSpan.class);
    if ((arrayOfEmoticonSpan == null) || (arrayOfEmoticonSpan.length <= 0)) {
      return super.length();
    }
    int k = arrayOfEmoticonSpan.length;
    int i = 0;
    if (i < k)
    {
      QQText.EmoticonSpan localEmoticonSpan = arrayOfEmoticonSpan[i];
      switch (localEmoticonSpan.c)
      {
      }
      for (;;)
      {
        i += 1;
        break;
        int m = getSpanStart(localEmoticonSpan);
        j += getSpanEnd(localEmoticonSpan) - m - 1;
      }
    }
    return super.length() - j;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.biz.pubaccount.readinjoy.biu.BiuTextBuilder
 * JD-Core Version:    0.7.0.1
 */
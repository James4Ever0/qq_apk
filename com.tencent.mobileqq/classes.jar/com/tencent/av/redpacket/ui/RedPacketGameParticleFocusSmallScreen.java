package com.tencent.av.redpacket.ui;

import android.graphics.Rect;

public class RedPacketGameParticleFocusSmallScreen
  extends RedPacketGameParticleFrame
{
  public RedPacketGameParticleEmojiSmallScreen a;
  public int b;
  public int c;
  
  public RedPacketGameParticleFocusSmallScreen(RedPacketGameParticleEmojiSmallScreen paramRedPacketGameParticleEmojiSmallScreen)
  {
    this.jdField_b_of_type_Long = 1800L;
    this.a = paramRedPacketGameParticleEmojiSmallScreen;
  }
  
  public void a(long paramLong)
  {
    super.a(paramLong);
    Rect localRect = this.a.a();
    int i = (localRect.left + localRect.right - this.jdField_b_of_type_Int) / 2;
    int j = (localRect.top + localRect.bottom - this.c) / 2;
    int k = (localRect.left + localRect.right + this.jdField_b_of_type_Int) / 2;
    int m = localRect.top;
    a(i, j, k, (localRect.bottom + m + this.c) / 2);
    if (this.a.a != null) {
      a(this.a.a());
    }
    for (;;)
    {
      b(this.a.a());
      return;
      a(0);
    }
  }
  
  public void b()
  {
    super.b();
    this.a = null;
  }
  
  public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.jdField_b_of_type_Int = (paramInt1 * 152 / 160);
    this.c = (paramInt1 * 152 / 160);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.av.redpacket.ui.RedPacketGameParticleFocusSmallScreen
 * JD-Core Version:    0.7.0.1
 */
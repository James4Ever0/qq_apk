package com.tencent.ttpic.filter;

import com.tencent.filter.Param.TextureParam;
import com.tencent.ttpic.model.StickerItem;
import com.tencent.ttpic.model.WMGroup;

public class WatermarkFilter
  extends DynamicStickerFilter
{
  public WatermarkFilter(StickerItem paramStickerItem, String paramString)
  {
    super(paramStickerItem, paramString);
  }
  
  public void ApplyGLSLFilter()
  {
    super.ApplyGLSLFilter();
    this.item.wmGroup.init();
  }
  
  public void clearGLSLSelf()
  {
    super.clearGLSLSelf();
    this.item.wmGroup.clear();
  }
  
  protected void updateTextureParam(int paramInt, long paramLong)
  {
    this.item.wmGroup.updateTexture(paramLong);
    addParam(new Param.TextureParam("inputImageTexture2", this.item.wmGroup.getTexture(), 33986));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     com.tencent.ttpic.filter.WatermarkFilter
 * JD-Core Version:    0.7.0.1
 */
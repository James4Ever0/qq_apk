package com.tencent.filter.ttpic;

import com.tencent.filter.Param.TextureResParam;

public class QiangWeiFilter
  extends GPUImageLookupFilter
{
  public QiangWeiFilter()
  {
    addParam(new Param.TextureResParam("inputImageTexture2", "sh/qiangwei_lf.png", 33986));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     com.tencent.filter.ttpic.QiangWeiFilter
 * JD-Core Version:    0.7.0.1
 */
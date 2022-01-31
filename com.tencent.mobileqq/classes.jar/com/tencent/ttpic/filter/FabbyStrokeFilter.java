package com.tencent.ttpic.filter;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.Param.Float4fParam;
import com.tencent.filter.Param.FloatParam;
import com.tencent.filter.Param.IntParam;
import com.tencent.filter.Param.TextureParam;

public class FabbyStrokeFilter
  extends BaseFilter
{
  public static final String FRAGMENT_SHADER = "precision mediump float; \nvarying mediump vec2 textureCoordinate; \nuniform sampler2D inputImageTexture; \nuniform sampler2D inputImageTexture2; \nuniform float stepX; \nuniform float stepY; \nuniform float strokeGapInPixel; \nuniform float strokeWidthInPixel; \nuniform vec4 strokeColor; \nuniform int feather; \nfloat alphaForStep(float step_x, float step_y, float weight) { \n   float step_x45 = step_x * 0.7071; \n   float step_y45 = step_y * 0.7071; \n   vec4 v3_10 = texture2D(inputImageTexture2, vec2(textureCoordinate.x, textureCoordinate.y+step_y)); \n   vec4 v3_11 = texture2D(inputImageTexture2, vec2(textureCoordinate.x+step_x45, textureCoordinate.y+step_y45)); \n   vec4 v3_12 = texture2D(inputImageTexture2, vec2(textureCoordinate.x+step_x, textureCoordinate.y)); \n   vec4 v3_13 = texture2D(inputImageTexture2, vec2(textureCoordinate.x+step_x45, textureCoordinate.y-step_y45)); \n   vec4 v3_14 = texture2D(inputImageTexture2, vec2(textureCoordinate.x, textureCoordinate.y-step_y)); \n   vec4 v3_15 = texture2D(inputImageTexture2, vec2(textureCoordinate.x-step_x45, textureCoordinate.y-step_y45)); \n   vec4 v3_16 = texture2D(inputImageTexture2, vec2(textureCoordinate.x-step_x, textureCoordinate.y)); \n   vec4 v3_17 = texture2D(inputImageTexture2, vec2(textureCoordinate.x-step_x45, textureCoordinate.y+step_y45)); \n   float temp = step(0.3, v3_10.r); \n   temp = step(0.3, v3_11.r + temp); \n   temp = step(0.3, v3_12.r + temp); \n   temp = step(0.3, v3_13.r + temp); \n   temp = step(0.3, v3_14.r + temp); \n   temp = step(0.3, v3_15.r + temp); \n   temp = step(0.3, v3_16.r + temp); \n   float alpha = step(0.3, v3_17.r + temp); \n   return alpha * weight; \n} \nvoid main() \n{ \n   vec4 v1 = texture2D(inputImageTexture, textureCoordinate); \n   vec4 v2 = texture2D(inputImageTexture2, textureCoordinate); \n   vec4 bg = vec4(0.0, 0.0, 0.0, 0.0); \n   float mask = v2.r; \n   if (mask < 0.3) { \n       float x = stepX * strokeGapInPixel; \n       float y = stepY * strokeGapInPixel; \n       float innerAlpha = alphaForStep(x, y, 1.0); \n       if (innerAlpha > 0.3) { \n           gl_FragColor = bg; \n       } else { \n           x += stepX * strokeWidthInPixel; \n           y += stepY * strokeWidthInPixel; \n           float outterAlpha = alphaForStep(x, y, 1.0); \n           if (outterAlpha > 0.3) { \n               if (feather > 0) { \n                   float minA = 0.0; \n                   float maxA = 1.0; \n                   float alpha = 1.0; \n                   float maxD = strokeWidthInPixel + strokeGapInPixel; \n                   float minD = strokeGapInPixel; \n                   for (int i = 0; i < 100; i++) { \n                       float mid = (minD + maxD) * 0.5; \n                       float midA = (minA + maxA) * 0.5; \n                       float xMid = stepX * mid; \n                       float yMid = stepY * mid; \n                       float aMid = alphaForStep(xMid, yMid, 1.0); \n                       if (aMid > 0.3) { \n                            maxD = mid; \n                           minA = midA; \n                       } else { \n                           minD = mid; \n                           maxA = midA; \n                       } \n                       if (maxD - minD <= 1.0) { \n                           alpha = midA; \n                           break; \n                       } \n                   } \n                   if (strokeColor.a > 0.0) { \n                       gl_FragColor = vec4(strokeColor.rgb, alpha); \n                   } else { \n                       gl_FragColor = vec4(v1.rgb, alpha); \n                   } \n               } else { \n                   gl_FragColor = strokeColor; \n               } \n           } else { \n               gl_FragColor = bg; \n           } \n       } \n   } else { \n       gl_FragColor = v1; \n   } \n }";
  
  public FabbyStrokeFilter()
  {
    super("precision mediump float; \nvarying mediump vec2 textureCoordinate; \nuniform sampler2D inputImageTexture; \nuniform sampler2D inputImageTexture2; \nuniform float stepX; \nuniform float stepY; \nuniform float strokeGapInPixel; \nuniform float strokeWidthInPixel; \nuniform vec4 strokeColor; \nuniform int feather; \nfloat alphaForStep(float step_x, float step_y, float weight) { \n   float step_x45 = step_x * 0.7071; \n   float step_y45 = step_y * 0.7071; \n   vec4 v3_10 = texture2D(inputImageTexture2, vec2(textureCoordinate.x, textureCoordinate.y+step_y)); \n   vec4 v3_11 = texture2D(inputImageTexture2, vec2(textureCoordinate.x+step_x45, textureCoordinate.y+step_y45)); \n   vec4 v3_12 = texture2D(inputImageTexture2, vec2(textureCoordinate.x+step_x, textureCoordinate.y)); \n   vec4 v3_13 = texture2D(inputImageTexture2, vec2(textureCoordinate.x+step_x45, textureCoordinate.y-step_y45)); \n   vec4 v3_14 = texture2D(inputImageTexture2, vec2(textureCoordinate.x, textureCoordinate.y-step_y)); \n   vec4 v3_15 = texture2D(inputImageTexture2, vec2(textureCoordinate.x-step_x45, textureCoordinate.y-step_y45)); \n   vec4 v3_16 = texture2D(inputImageTexture2, vec2(textureCoordinate.x-step_x, textureCoordinate.y)); \n   vec4 v3_17 = texture2D(inputImageTexture2, vec2(textureCoordinate.x-step_x45, textureCoordinate.y+step_y45)); \n   float temp = step(0.3, v3_10.r); \n   temp = step(0.3, v3_11.r + temp); \n   temp = step(0.3, v3_12.r + temp); \n   temp = step(0.3, v3_13.r + temp); \n   temp = step(0.3, v3_14.r + temp); \n   temp = step(0.3, v3_15.r + temp); \n   temp = step(0.3, v3_16.r + temp); \n   float alpha = step(0.3, v3_17.r + temp); \n   return alpha * weight; \n} \nvoid main() \n{ \n   vec4 v1 = texture2D(inputImageTexture, textureCoordinate); \n   vec4 v2 = texture2D(inputImageTexture2, textureCoordinate); \n   vec4 bg = vec4(0.0, 0.0, 0.0, 0.0); \n   float mask = v2.r; \n   if (mask < 0.3) { \n       float x = stepX * strokeGapInPixel; \n       float y = stepY * strokeGapInPixel; \n       float innerAlpha = alphaForStep(x, y, 1.0); \n       if (innerAlpha > 0.3) { \n           gl_FragColor = bg; \n       } else { \n           x += stepX * strokeWidthInPixel; \n           y += stepY * strokeWidthInPixel; \n           float outterAlpha = alphaForStep(x, y, 1.0); \n           if (outterAlpha > 0.3) { \n               if (feather > 0) { \n                   float minA = 0.0; \n                   float maxA = 1.0; \n                   float alpha = 1.0; \n                   float maxD = strokeWidthInPixel + strokeGapInPixel; \n                   float minD = strokeGapInPixel; \n                   for (int i = 0; i < 100; i++) { \n                       float mid = (minD + maxD) * 0.5; \n                       float midA = (minA + maxA) * 0.5; \n                       float xMid = stepX * mid; \n                       float yMid = stepY * mid; \n                       float aMid = alphaForStep(xMid, yMid, 1.0); \n                       if (aMid > 0.3) { \n                            maxD = mid; \n                           minA = midA; \n                       } else { \n                           minD = mid; \n                           maxA = midA; \n                       } \n                       if (maxD - minD <= 1.0) { \n                           alpha = midA; \n                           break; \n                       } \n                   } \n                   if (strokeColor.a > 0.0) { \n                       gl_FragColor = vec4(strokeColor.rgb, alpha); \n                   } else { \n                       gl_FragColor = vec4(v1.rgb, alpha); \n                   } \n               } else { \n                   gl_FragColor = strokeColor; \n               } \n           } else { \n               gl_FragColor = bg; \n           } \n       } \n   } else { \n       gl_FragColor = v1; \n   } \n }");
    initParam();
  }
  
  private void initParam()
  {
    addParam(new Param.TextureParam("inputImageTexture2", 0, 33986));
    addParam(new Param.FloatParam("stepX", 0.0F));
    addParam(new Param.FloatParam("stepY", 0.0F));
    addParam(new Param.FloatParam("strokeGapInPixel", 0.0F));
    addParam(new Param.FloatParam("strokeWidthInPixel", 0.0F));
    addParam(new Param.Float4fParam("strokeColor", 0.0F, 0.0F, 0.0F, 0.0F));
    addParam(new Param.IntParam("feather", 0));
  }
  
  public void setFeather(int paramInt)
  {
    addParam(new Param.IntParam("feather", paramInt));
  }
  
  public void setStepX(float paramFloat)
  {
    addParam(new Param.FloatParam("stepX", paramFloat));
  }
  
  public void setStepY(float paramFloat)
  {
    addParam(new Param.FloatParam("stepY", paramFloat));
  }
  
  public void setStrokeColor(float[] paramArrayOfFloat)
  {
    addParam(new Param.Float4fParam("strokeColor", paramArrayOfFloat[0], paramArrayOfFloat[1], paramArrayOfFloat[2], paramArrayOfFloat[3]));
  }
  
  public void setStrokeGapInPixel(float paramFloat)
  {
    addParam(new Param.FloatParam("strokeGapInPixel", paramFloat));
  }
  
  public void setStrokeWidthInPixel(float paramFloat)
  {
    addParam(new Param.FloatParam("strokeWidthInPixel", paramFloat));
  }
  
  public void setmMaskTex(int paramInt)
  {
    addParam(new Param.TextureParam("inputImageTexture2", paramInt, 33986));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     com.tencent.ttpic.filter.FabbyStrokeFilter
 * JD-Core Version:    0.7.0.1
 */
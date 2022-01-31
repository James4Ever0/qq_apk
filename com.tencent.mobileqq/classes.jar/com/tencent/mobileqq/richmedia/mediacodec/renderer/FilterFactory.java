package com.tencent.mobileqq.richmedia.mediacodec.renderer;

public class FilterFactory
{
  public static GPUBaseFilter a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return new GPUBaseFilter();
    case 101: 
      return new GPUBaseFilter();
    case 102: 
      return new GPUOESBaseFilter();
    case 0: 
      return new GPUDrawPartFilter();
    case 7: 
      return new GPUImageGrayFilter();
    case 5: 
      return new GPULordKelvinFilter();
    case 6: 
      return new GPUNashvilleFilter();
    case 4: 
      return new GPUImageBrightnessFilter();
    case 106: 
      return new GPUImagePixelationFilter();
    }
    return new GPUAlphaBlendFilter();
  }
  
  public static boolean a(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
    case 2: 
    case 3: 
    default: 
      return false;
    }
    return true;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     com.tencent.mobileqq.richmedia.mediacodec.renderer.FilterFactory
 * JD-Core Version:    0.7.0.1
 */
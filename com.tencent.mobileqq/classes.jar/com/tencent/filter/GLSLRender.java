package com.tencent.filter;

import android.graphics.Bitmap;

public class GLSLRender
{
  public static int FILTER_2D_CURVE;
  public static int FILTER_ALPHAREVERT;
  public static int FILTER_ALPHA_ADJUST;
  public static int FILTER_ALPHA_ADJUST_REAL;
  public static int FILTER_BACKGROUNDTEXUL_SHADER;
  public static int FILTER_BEAUTY_SMOOTH_NEW;
  public static int FILTER_BEAUTY_WHITEN_NEW;
  public static int FILTER_BILATERALFILTER2_NEW;
  public static int FILTER_BILATERALFILTER_NEW;
  public static int FILTER_CHANNELSTRECH2_SHADER;
  public static int FILTER_CHANNELSTRECH3_SHADER;
  public static int FILTER_CHANNEL_SATURATION;
  public static int FILTER_CHANNEL_SHARPEN_FR;
  public static int FILTER_CHANNEL_STRECH;
  public static int FILTER_COLORPENCIL;
  public static int FILTER_DAMPING_GAUSS_H_FRAG;
  public static int FILTER_DARKCORNER_CURVE;
  public static int FILTER_DIRECTIONFILTERP;
  public static int FILTER_DOF_SHADER;
  public static int FILTER_EGL_IMAGE;
  public static int FILTER_FACE_ALPHABLENDCROSS_SHADER;
  public static int FILTER_FACE_ALPHABLEND_SHADER;
  public static int FILTER_FACE_ATTACHCROSS_EX_SHADER;
  public static int FILTER_FACE_LENSFLARE_SHADER;
  public static int FILTER_FACE_RGB2YCBCR_SHADER;
  public static int FILTER_FACE_YCBCR2RGB_SHADER;
  public static int FILTER_FENNEN_BEAUTY;
  public static int FILTER_FLARES;
  public static int FILTER_FLOWBASEDBL;
  public static int FILTER_FLOWBASEDBLFORPOSTER;
  public static int FILTER_FLOWBASEDBLUR;
  public static int FILTER_FLOWBASEDBLURFORPOSTER;
  public static int FILTER_FLOWBASEDBLURFORPOSTER_Tegra;
  public static int FILTER_FLOWBASEDDOG;
  public static int FILTER_FLOWBASEDDOGFOREDGE;
  public static int FILTER_FLOWBASEDDOGFORPOSTER;
  public static int FILTER_FRAME_SHADER;
  public static int FILTER_GAUSSBLURH;
  public static int FILTER_GAUSSBLURV;
  public static int FILTER_GAUSSBLUR_H;
  public static int FILTER_GAUSSBLUR_V;
  public static int FILTER_GAUSS_INNER_H_FRAG;
  public static int FILTER_GAUSS_INNER_V_FRAG;
  public static int FILTER_GLOWCENTER_BEAUTY;
  public static int FILTER_GPULEVELS1_SHADER;
  public static int FILTER_GPULEVELSEX_SHADER;
  public static int FILTER_GPULEVELS_SHADER;
  public static int FILTER_GRAYFILTERP;
  public static int FILTER_GRAYFORMANGA_SHADER;
  public static int FILTER_HARDLIGHTBLEND2_SHADER;
  public static int FILTER_HARDLIGHTBLEND_SHADER;
  public static int FILTER_HIGHTLIGHT_SHADOW_SHADER;
  public static int FILTER_HIPASS_BEAUTY;
  public static int FILTER_HISTOGRAMS_STRCTCH;
  public static int FILTER_HONGRUN_BEAUTYP2;
  public static int FILTER_HORIZONTAL_BEAUTY;
  public static int FILTER_HSVADJUSTER2_SHADER;
  public static int FILTER_HSVADJUSTER_SHADER;
  public static int FILTER_HSVNCHANNEL_SHARPEN_SHADER;
  public static int FILTER_HSVTORGB;
  public static int FILTER_INPUT2_SHADER;
  public static int FILTER_LAB2RGB_SHADER;
  public static int FILTER_LIEYANHONGCHUN_BEAUTY;
  public static int FILTER_LUMINOSITY_BLEND_SHADER;
  public static int FILTER_MANGAFORSAVE_SHADER;
  public static int FILTER_MANGA_SHADER;
  public static int FILTER_MARK;
  public static int FILTER_MEIFU_BEAUTY;
  public static int FILTER_MIC_CURE_NEW_SHADER;
  public static int FILTER_MIC_CURE_SHADER;
  public static int FILTER_MIXEDGEFILTEREDIT;
  public static int FILTER_MIXEDGENOSTAGE;
  public static int FILTER_NEW_SKETCH;
  public static int FILTER_NIGHT_BOKEH;
  public static int FILTER_NIGHT_BOKEH_EX;
  public static int FILTER_NIGHT_RGBSTRETCH;
  public static int FILTER_NONMAXSUPRESS_SHADER;
  public static int FILTER_NONMAXSUPRESS_SHADER_LOWDEVICE;
  public static int FILTER_OVERLAP_BEAUTY;
  public static int FILTER_OVERLAY_BLEND2_SHADER;
  public static int FILTER_QINXINMEIBAI_BEAUTY;
  public static int FILTER_RGB2LAB_SHADER;
  public static int FILTER_RGB2YUV_SHADER;
  public static int FILTER_RGBTOHSV;
  public static int FILTER_SELECTIVECOLOR_SHADER;
  public static int FILTER_SHADER_AUTOLEVEL_HIS;
  public static int FILTER_SHADER_BEAUTY;
  public static int FILTER_SHADER_BEAUTY_HIPASS_REAL;
  public static int FILTER_SHADER_BEAUTY_HORIZONTAL_REAL;
  public static int FILTER_SHADER_BEAUTY_VERTICAL_REAL;
  public static int FILTER_SHADER_CHANNEL_MIXER;
  public static int FILTER_SHADER_COLORBURN_BLEND;
  public static int FILTER_SHADER_COLOR_BALANCE;
  public static int FILTER_SHADER_COLOR_TEMP;
  public static int FILTER_SHADER_DARKEN_BLEND;
  public static int FILTER_SHADER_EXPOSURE;
  public static int FILTER_SHADER_HSVCOLOR_0;
  public static int FILTER_SHADER_HSVCOLOR_1;
  public static int FILTER_SHADER_HSVCOLOR_2;
  public static int FILTER_SHADER_HSVCOLOR_3;
  public static int FILTER_SHADER_HSVCOLOR_ALL;
  public static int FILTER_SHADER_MIC_CURE_MASK;
  public static int FILTER_SHADER_MULTIPLY_BLEND;
  public static int FILTER_SHADER_MULTIPLY_BLEND_3;
  public static int FILTER_SHADER_MULTIPLY_BLEND_4;
  public static int FILTER_SHADER_MULTIPLY_BLEND_RSS;
  public static int FILTER_SHADER_NONE = 0;
  public static int FILTER_SHADER_SCREEN_BLEND;
  public static int FILTER_SHADER_SCREEN_BLEND_OLD;
  public static int FILTER_SHADER_SELECTIVECOLOR;
  public static int FILTER_SHADER_VIVID_LIGHT_BLEND;
  public static int FILTER_SHADER_YUV;
  public static int FILTER_SHADER_YUV420P;
  public static int FILTER_SHENDUMEIBAI_BEAUTY;
  public static int FILTER_SHENDUMEIBAI_BEAUTY_SHUIYIN;
  public static int FILTER_SOBELBLUR_SHADER;
  public static int FILTER_SOBELFORMANGA_SHADER;
  public static int FILTER_SOFTLIGHTBLEND2_SHADER;
  public static int FILTER_SOFTLIGHTBLEND_SHADER;
  public static int FILTER_SPRING_MORPH_SHADER;
  public static int FILTER_STRUCTTENSORFILTER;
  public static int FILTER_STRUCTTENSORFORPOSTER;
  public static int FILTER_TEXTREPET_SHADER;
  public static int FILTER_TIANMEIKEREN_BEAUTY;
  public static int FILTER_TIANMEIKEREN_BEAUTYP2;
  public static int FILTER_TIANSHENLIZHI_BEAUTY;
  public static int FILTER_TILT_TOUCH_CIRCLE_NEW;
  public static int FILTER_TILT_TOUCH_ECLIPSE_NEW;
  public static int FILTER_TILT_TOUCH_GAUSS;
  public static int FILTER_TILT_TOUCH_LINE_NEW;
  public static int FILTER_TILT_TOUCH_MASK;
  public static int FILTER_TILT_TOUCH_MASK2;
  public static int FILTER_TONEADJUST_SHADER;
  public static int FILTER_VERTICAL_BEAUTY;
  public static int FILTER_VIBRANCE;
  public static int FILTER_YANGGUANG_BEAUTYP2;
  public static int FILTER_YUV2RGB_SHADER;
  public static int GL_TEXTURE_2D;
  public static int GL_TEXTURE_EXTERNAL_OES_ENUM;
  public static int SHARE_SHADER_FILM_1;
  public static int SHARE_SHADER_FILM_2;
  public static int VERTEXT_DAMPING_GAUSS_H;
  public static int VERTEXT_FRAMEORIGIN_SHADER;
  public static int VERTEXT_FRAMESTRETCH_SHADER;
  public static int VERTEXT_FRAME_SHADER;
  public static int VERTEXT_GAUSS_INNER_H;
  public static int VERTEXT_GAUSS_INNER_V;
  public static int VERTEXT_GRAYFORMANGA_SHADER;
  public static int VERTEXT_HSVCHANNELSHARPEN_SHADER = VERTEXT_LENSFLARE_SHADER + 1;
  public static int VERTEXT_LENSFLARE_SHADER;
  public static int VERTEXT_SHADER_DEFAULT;
  public static int VERTEXT_SHADER_JNI;
  public static int VERTEXT_SHADER_SHARPEN;
  public static int VERTEXT_SOBELBLUR_SHADER;
  public static int VERTEXT_SOBELFORMANGA_SHADER;
  
  static
  {
    FILTER_FACE_RGB2YCBCR_SHADER = 1;
    FILTER_FACE_YCBCR2RGB_SHADER = 2;
    FILTER_ALPHA_ADJUST = 3;
    FILTER_ALPHA_ADJUST_REAL = 4;
    SHARE_SHADER_FILM_1 = FILTER_ALPHA_ADJUST_REAL + 1;
    SHARE_SHADER_FILM_2 = SHARE_SHADER_FILM_1 + 1;
    FILTER_2D_CURVE = SHARE_SHADER_FILM_2 + 1;
    FILTER_DARKCORNER_CURVE = FILTER_2D_CURVE + 1;
    FILTER_EGL_IMAGE = FILTER_DARKCORNER_CURVE + 1;
    FILTER_COLORPENCIL = FILTER_EGL_IMAGE + 1;
    FILTER_SHADER_YUV = FILTER_COLORPENCIL + 1;
    FILTER_SHADER_BEAUTY = FILTER_SHADER_YUV + 1;
    FILTER_VIBRANCE = FILTER_SHADER_BEAUTY + 1;
    FILTER_FLARES = FILTER_VIBRANCE + 1;
    FILTER_HORIZONTAL_BEAUTY = FILTER_FLARES + 1;
    FILTER_VERTICAL_BEAUTY = FILTER_HORIZONTAL_BEAUTY + 1;
    FILTER_HIPASS_BEAUTY = FILTER_VERTICAL_BEAUTY + 1;
    FILTER_OVERLAP_BEAUTY = FILTER_HIPASS_BEAUTY + 1;
    FILTER_GLOWCENTER_BEAUTY = FILTER_OVERLAP_BEAUTY + 1;
    FILTER_QINXINMEIBAI_BEAUTY = FILTER_GLOWCENTER_BEAUTY + 1;
    FILTER_TIANMEIKEREN_BEAUTY = FILTER_QINXINMEIBAI_BEAUTY + 1;
    FILTER_SHENDUMEIBAI_BEAUTY = FILTER_TIANMEIKEREN_BEAUTY + 1;
    FILTER_LIEYANHONGCHUN_BEAUTY = FILTER_SHENDUMEIBAI_BEAUTY + 1;
    FILTER_TIANSHENLIZHI_BEAUTY = FILTER_LIEYANHONGCHUN_BEAUTY + 1;
    FILTER_MEIFU_BEAUTY = FILTER_TIANSHENLIZHI_BEAUTY + 1;
    FILTER_FENNEN_BEAUTY = FILTER_MEIFU_BEAUTY + 1;
    FILTER_NIGHT_BOKEH = FILTER_FENNEN_BEAUTY + 1;
    FILTER_RGBTOHSV = FILTER_NIGHT_BOKEH + 1;
    FILTER_HSVTORGB = FILTER_RGBTOHSV + 1;
    FILTER_CHANNEL_STRECH = FILTER_HSVTORGB + 1;
    FILTER_CHANNEL_SATURATION = FILTER_CHANNEL_STRECH + 1;
    FILTER_HISTOGRAMS_STRCTCH = FILTER_CHANNEL_SATURATION + 1;
    FILTER_CHANNEL_SHARPEN_FR = FILTER_HISTOGRAMS_STRCTCH + 1;
    FILTER_TILT_TOUCH_CIRCLE_NEW = FILTER_CHANNEL_SHARPEN_FR + 1;
    FILTER_TILT_TOUCH_ECLIPSE_NEW = FILTER_TILT_TOUCH_CIRCLE_NEW + 1;
    FILTER_TILT_TOUCH_LINE_NEW = FILTER_TILT_TOUCH_ECLIPSE_NEW + 1;
    FILTER_TILT_TOUCH_GAUSS = FILTER_TILT_TOUCH_LINE_NEW + 1;
    FILTER_TILT_TOUCH_MASK = FILTER_TILT_TOUCH_GAUSS + 1;
    FILTER_NIGHT_BOKEH_EX = FILTER_TILT_TOUCH_MASK + 1;
    FILTER_TIANMEIKEREN_BEAUTYP2 = FILTER_NIGHT_BOKEH_EX + 1;
    FILTER_YANGGUANG_BEAUTYP2 = FILTER_TIANMEIKEREN_BEAUTYP2 + 1;
    FILTER_HONGRUN_BEAUTYP2 = FILTER_YANGGUANG_BEAUTYP2 + 1;
    FILTER_SHENDUMEIBAI_BEAUTY_SHUIYIN = FILTER_HONGRUN_BEAUTYP2 + 1;
    FILTER_RGB2YUV_SHADER = FILTER_SHENDUMEIBAI_BEAUTY_SHUIYIN + 1;
    FILTER_YUV2RGB_SHADER = FILTER_RGB2YUV_SHADER + 1;
    FILTER_GAUSS_INNER_H_FRAG = FILTER_YUV2RGB_SHADER + 1;
    FILTER_GAUSS_INNER_V_FRAG = FILTER_GAUSS_INNER_H_FRAG + 1;
    FILTER_DAMPING_GAUSS_H_FRAG = FILTER_GAUSS_INNER_V_FRAG + 1;
    FILTER_ALPHAREVERT = FILTER_DAMPING_GAUSS_H_FRAG + 1;
    FILTER_FRAME_SHADER = FILTER_ALPHAREVERT + 1;
    FILTER_TEXTREPET_SHADER = FILTER_FRAME_SHADER + 1;
    FILTER_DOF_SHADER = FILTER_TEXTREPET_SHADER + 1;
    FILTER_TILT_TOUCH_MASK2 = FILTER_DOF_SHADER + 1;
    FILTER_MIC_CURE_NEW_SHADER = FILTER_TILT_TOUCH_MASK2 + 1;
    FILTER_SHADER_COLOR_TEMP = FILTER_MIC_CURE_NEW_SHADER + 1;
    FILTER_SHADER_SCREEN_BLEND = FILTER_SHADER_COLOR_TEMP + 1;
    FILTER_SHADER_COLOR_BALANCE = FILTER_SHADER_SCREEN_BLEND + 1;
    FILTER_SHADER_CHANNEL_MIXER = FILTER_SHADER_COLOR_BALANCE + 1;
    FILTER_SHADER_MULTIPLY_BLEND = FILTER_SHADER_CHANNEL_MIXER + 1;
    FILTER_HSVADJUSTER_SHADER = FILTER_SHADER_MULTIPLY_BLEND + 1;
    FILTER_SOFTLIGHTBLEND_SHADER = FILTER_HSVADJUSTER_SHADER + 1;
    FILTER_HARDLIGHTBLEND_SHADER = FILTER_SOFTLIGHTBLEND_SHADER + 1;
    FILTER_SHADER_DARKEN_BLEND = FILTER_HARDLIGHTBLEND_SHADER + 1;
    FILTER_SHADER_EXPOSURE = FILTER_SHADER_DARKEN_BLEND + 1;
    FILTER_SHADER_AUTOLEVEL_HIS = FILTER_SHADER_EXPOSURE + 1;
    FILTER_MARK = FILTER_SHADER_AUTOLEVEL_HIS + 1;
    FILTER_NEW_SKETCH = FILTER_MARK + 1;
    FILTER_GAUSSBLUR_V = FILTER_NEW_SKETCH + 1;
    FILTER_GAUSSBLUR_H = FILTER_GAUSSBLUR_V + 1;
    FILTER_BILATERALFILTER2_NEW = FILTER_GAUSSBLUR_H + 1;
    FILTER_BILATERALFILTER_NEW = FILTER_BILATERALFILTER2_NEW + 1;
    FILTER_DIRECTIONFILTERP = FILTER_BILATERALFILTER_NEW + 1;
    FILTER_FLOWBASEDBL = FILTER_DIRECTIONFILTERP + 1;
    FILTER_FLOWBASEDBLUR = FILTER_FLOWBASEDBL + 1;
    FILTER_FLOWBASEDDOG = FILTER_FLOWBASEDBLUR + 1;
    FILTER_FLOWBASEDDOGFOREDGE = FILTER_FLOWBASEDDOG + 1;
    FILTER_GAUSSBLURH = FILTER_FLOWBASEDDOGFOREDGE + 1;
    FILTER_GAUSSBLURV = FILTER_GAUSSBLURH + 1;
    FILTER_GRAYFILTERP = FILTER_GAUSSBLURV + 1;
    FILTER_MIXEDGEFILTEREDIT = FILTER_GRAYFILTERP + 1;
    FILTER_MIXEDGENOSTAGE = FILTER_MIXEDGEFILTEREDIT + 1;
    FILTER_STRUCTTENSORFILTER = FILTER_MIXEDGENOSTAGE + 1;
    FILTER_STRUCTTENSORFORPOSTER = FILTER_STRUCTTENSORFILTER + 1;
    FILTER_FLOWBASEDBLFORPOSTER = FILTER_STRUCTTENSORFORPOSTER + 1;
    FILTER_FLOWBASEDDOGFORPOSTER = FILTER_FLOWBASEDBLFORPOSTER + 1;
    FILTER_FLOWBASEDBLURFORPOSTER = FILTER_FLOWBASEDDOGFORPOSTER + 1;
    FILTER_FLOWBASEDBLURFORPOSTER_Tegra = FILTER_FLOWBASEDBLURFORPOSTER + 1;
    FILTER_NIGHT_RGBSTRETCH = FILTER_FLOWBASEDBLURFORPOSTER_Tegra + 1;
    FILTER_GRAYFORMANGA_SHADER = FILTER_NIGHT_RGBSTRETCH + 1;
    FILTER_NONMAXSUPRESS_SHADER = FILTER_GRAYFORMANGA_SHADER + 1;
    FILTER_SOBELBLUR_SHADER = FILTER_NONMAXSUPRESS_SHADER + 1;
    FILTER_MANGA_SHADER = FILTER_SOBELBLUR_SHADER + 1;
    FILTER_BACKGROUNDTEXUL_SHADER = FILTER_MANGA_SHADER + 1;
    FILTER_SOBELFORMANGA_SHADER = FILTER_BACKGROUNDTEXUL_SHADER + 1;
    FILTER_MANGAFORSAVE_SHADER = FILTER_SOBELFORMANGA_SHADER + 1;
    FILTER_NONMAXSUPRESS_SHADER_LOWDEVICE = FILTER_MANGAFORSAVE_SHADER + 1;
    FILTER_MIC_CURE_SHADER = FILTER_NONMAXSUPRESS_SHADER_LOWDEVICE + 1;
    FILTER_SELECTIVECOLOR_SHADER = FILTER_MIC_CURE_SHADER + 1;
    FILTER_TONEADJUST_SHADER = FILTER_SELECTIVECOLOR_SHADER + 1;
    FILTER_FACE_LENSFLARE_SHADER = FILTER_TONEADJUST_SHADER + 1;
    FILTER_FACE_ALPHABLEND_SHADER = FILTER_FACE_LENSFLARE_SHADER + 1;
    FILTER_FACE_ALPHABLENDCROSS_SHADER = FILTER_FACE_ALPHABLEND_SHADER + 1;
    FILTER_FACE_ATTACHCROSS_EX_SHADER = FILTER_FACE_ALPHABLENDCROSS_SHADER + 1;
    FILTER_SPRING_MORPH_SHADER = FILTER_FACE_ATTACHCROSS_EX_SHADER + 1;
    FILTER_SHADER_YUV420P = FILTER_SPRING_MORPH_SHADER + 1;
    FILTER_SHADER_SELECTIVECOLOR = FILTER_SHADER_YUV420P + 1;
    FILTER_SHADER_MIC_CURE_MASK = FILTER_SHADER_SELECTIVECOLOR + 1;
    FILTER_HSVADJUSTER2_SHADER = FILTER_SHADER_MIC_CURE_MASK + 1;
    FILTER_GPULEVELS_SHADER = FILTER_HSVADJUSTER2_SHADER + 1;
    FILTER_LUMINOSITY_BLEND_SHADER = FILTER_GPULEVELS_SHADER + 1;
    FILTER_HIGHTLIGHT_SHADOW_SHADER = FILTER_LUMINOSITY_BLEND_SHADER + 1;
    FILTER_HSVNCHANNEL_SHARPEN_SHADER = FILTER_HIGHTLIGHT_SHADOW_SHADER + 1;
    FILTER_CHANNELSTRECH2_SHADER = FILTER_HSVNCHANNEL_SHARPEN_SHADER + 1;
    FILTER_CHANNELSTRECH3_SHADER = FILTER_CHANNELSTRECH2_SHADER + 1;
    FILTER_OVERLAY_BLEND2_SHADER = FILTER_CHANNELSTRECH3_SHADER + 1;
    FILTER_SOFTLIGHTBLEND2_SHADER = FILTER_OVERLAY_BLEND2_SHADER + 1;
    FILTER_SHADER_MULTIPLY_BLEND_RSS = FILTER_SOFTLIGHTBLEND2_SHADER + 1;
    FILTER_SHADER_SCREEN_BLEND_OLD = FILTER_SHADER_MULTIPLY_BLEND_RSS + 1;
    FILTER_SHADER_BEAUTY_HORIZONTAL_REAL = FILTER_SHADER_SCREEN_BLEND_OLD + 1;
    FILTER_SHADER_BEAUTY_VERTICAL_REAL = FILTER_SHADER_BEAUTY_HORIZONTAL_REAL + 1;
    FILTER_SHADER_BEAUTY_HIPASS_REAL = FILTER_SHADER_BEAUTY_VERTICAL_REAL + 1;
    FILTER_GPULEVELSEX_SHADER = FILTER_SHADER_BEAUTY_HIPASS_REAL + 1;
    FILTER_RGB2LAB_SHADER = FILTER_GPULEVELSEX_SHADER + 1;
    FILTER_LAB2RGB_SHADER = FILTER_RGB2LAB_SHADER + 1;
    FILTER_GPULEVELS1_SHADER = FILTER_LAB2RGB_SHADER + 1;
    FILTER_INPUT2_SHADER = FILTER_GPULEVELS1_SHADER + 1;
    FILTER_SHADER_MULTIPLY_BLEND_3 = FILTER_INPUT2_SHADER + 1;
    FILTER_SHADER_COLORBURN_BLEND = FILTER_SHADER_MULTIPLY_BLEND_3 + 1;
    FILTER_SHADER_HSVCOLOR_0 = FILTER_SHADER_COLORBURN_BLEND + 1;
    FILTER_SHADER_HSVCOLOR_1 = FILTER_SHADER_HSVCOLOR_0 + 1;
    FILTER_SHADER_HSVCOLOR_2 = FILTER_SHADER_HSVCOLOR_1 + 1;
    FILTER_SHADER_HSVCOLOR_3 = FILTER_SHADER_HSVCOLOR_2 + 1;
    FILTER_SHADER_HSVCOLOR_ALL = FILTER_SHADER_HSVCOLOR_3 + 1;
    FILTER_HARDLIGHTBLEND2_SHADER = FILTER_SHADER_HSVCOLOR_ALL + 1;
    FILTER_SHADER_MULTIPLY_BLEND_4 = FILTER_HARDLIGHTBLEND2_SHADER + 1;
    FILTER_SHADER_VIVID_LIGHT_BLEND = FILTER_SHADER_MULTIPLY_BLEND_4 + 1;
    FILTER_BEAUTY_SMOOTH_NEW = FILTER_SHADER_VIVID_LIGHT_BLEND + 1;
    FILTER_BEAUTY_WHITEN_NEW = FILTER_BEAUTY_SMOOTH_NEW + 1;
    GL_TEXTURE_EXTERNAL_OES_ENUM = 36197;
    GL_TEXTURE_2D = 3553;
    VERTEXT_SHADER_JNI = 0;
    VERTEXT_SHADER_DEFAULT = 1;
    VERTEXT_SHADER_SHARPEN = 2;
    VERTEXT_GAUSS_INNER_H = 3;
    VERTEXT_GAUSS_INNER_V = 4;
    VERTEXT_DAMPING_GAUSS_H = 5;
    VERTEXT_FRAME_SHADER = 6;
    VERTEXT_FRAMEORIGIN_SHADER = 7;
    VERTEXT_FRAMESTRETCH_SHADER = 8;
    VERTEXT_GRAYFORMANGA_SHADER = 9;
    VERTEXT_SOBELFORMANGA_SHADER = 10;
    VERTEXT_SOBELBLUR_SHADER = 11;
    VERTEXT_LENSFLARE_SHADER = VERTEXT_SOBELBLUR_SHADER + 1;
  }
  
  public static native long nativeAllocBuffer(int paramInt);
  
  public static native void nativeBeginUseEglImage(int paramInt1, int paramInt2, int paramInt3);
  
  public static native void nativeCalHistogramFromGPU(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, int paramInt5, int paramInt6, float paramFloat3, float paramFloat4);
  
  public static native int nativeCheckMagicEngine(int paramInt1, int paramInt2);
  
  public static native int nativeCopyPixelToBitmap(Bitmap paramBitmap);
  
  public static native int nativeCopyPixelToBitmapWithShare(Bitmap paramBitmap, int paramInt1, int paramInt2);
  
  public static native void nativeCopyTexturToDataWithShare(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4);
  
  public static native QImage nativeCopyTexture(int paramInt1, int paramInt2);
  
  public static native void nativeCopyTexture2(QImage paramQImage);
  
  public static native QImage nativeCopyTextureWithShare(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public static native int nativeDeinitMagicEngine(int paramInt);
  
  public static native void nativeEndUseEglImage(int paramInt1, int paramInt2, int paramInt3);
  
  public static native void nativeFreeBuffer(long paramLong);
  
  public static native int nativeInitMagicEngine(int paramInt1, int paramInt2);
  
  public static native void nativePickJepgToTexture(QImage paramQImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfInt);
  
  public static native void nativePreprocessJepg(QImage paramQImage, int[] paramArrayOfInt);
  
  public static native void nativePreviewData(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3);
  
  public static native void nativePreviewYuvData(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3);
  
  public static native void nativePushBitmapFromTexture(Bitmap paramBitmap, int paramInt);
  
  public static native void nativePushDataFromTexture(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3);
  
  public static native void nativePushJepgFromTexture(QImage paramQImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  public static native int nativeRenderPixelToBitmap(Bitmap paramBitmap, int paramInt1, int paramInt2);
  
  public static native int nativeSnap(Bitmap paramBitmap);
  
  public static native void nativeTextCure(int[] paramArrayOfInt, int paramInt);
  
  public static native void nativeTextImage(QImage paramQImage, int paramInt);
  
  public static native void nativeToRGBData(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public static native void nativeUpdateScaleBitmap(Bitmap paramBitmap1, Bitmap paramBitmap2, Bitmap paramBitmap3, int paramInt1, int paramInt2);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     com.tencent.filter.GLSLRender
 * JD-Core Version:    0.7.0.1
 */
package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class sb
  extends c
{
  private final int height = 72;
  private final int width = 72;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 72;
      return 72;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      Object localObject2 = c.e(paramVarArgs);
      Paint localPaint1 = c.i(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.i(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-8355712);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 11.0F, 0.0F, 1.0F, 11.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(22.190649F, 1.994894F);
      ((Path)localObject2).cubicTo(22.902634F, -0.6716383F, 27.13443F, -0.661614F, 27.836386F, 2.004919F);
      ((Path)localObject2).cubicTo(28.277615F, 8.6512F, 27.886526F, 15.33758F, 28.01689F, 21.993885F);
      ((Path)localObject2).cubicTo(34.414722F, 22.074081F, 40.812557F, 21.843517F, 47.200359F, 22.074081F);
      ((Path)localObject2).cubicTo(50.379223F, 21.903666F, 51.091206F, 26.956041F, 48.082821F, 27.798105F);
      ((Path)localObject2).cubicTo(41.414234F, 28.309357F, 34.705532F, 27.858252F, 28.01689F, 28.008621F);
      ((Path)localObject2).cubicTo(27.876497F, 34.664925F, 28.297672F, 41.351307F, 27.826357F, 47.997589F);
      ((Path)localObject2).cubicTo(27.164513F, 50.66412F, 22.882578F, 50.66412F, 22.190649F, 48.017635F);
      ((Path)localObject2).cubicTo(21.719336F, 41.371357F, 22.140509F, 34.67495F, 22.000118F, 28.008621F);
      ((Path)localObject2).cubicTo(15.33153F, 27.868277F, 8.632857F, 28.289309F, 1.974298F, 27.808128F);
      ((Path)localObject2).cubicTo(-0.6730819F, 27.116434F, -0.6530259F, 22.866022F, 2.004381F, 22.184353F);
      ((Path)localObject2).cubicTo(8.652913F, 21.723223F, 15.33153F, 22.13423F, 22.000118F, 21.993885F);
      ((Path)localObject2).cubicTo(22.140509F, 15.327556F, 21.729362F, 8.641175F, 22.190649F, 1.994894F);
      ((Path)localObject2).lineTo(22.190649F, 1.994894F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mm\classes5.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.sb
 * JD-Core Version:    0.7.0.1
 */
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

public final class ux
  extends c
{
  private final int height = 96;
  private final int width = 96;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 96;
      return 96;
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
      localPaint1.setColor(-7368817);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 11.0F, 0.0F, 1.0F, 21.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 15.269435F);
      ((Path)localObject2).cubicTo(9.816649F, 5.600911F, 23.567987F, -0.08761817F, 37.479923F, 0.001265102F);
      ((Path)localObject2).cubicTo(51.411938F, -0.09749408F, 65.173317F, 5.591035F, 75.0F, 15.269435F);
      ((Path)localObject2).cubicTo(73.404045F, 16.839706F, 71.798042F, 18.419853F, 70.212128F, 20.0F);
      ((Path)localObject2).cubicTo(61.650162F, 11.536338F, 49.65538F, 6.539123F, 37.5F, 6.628007F);
      ((Path)localObject2).cubicTo(25.354658F, 6.548999F, 13.349839F, 11.526462F, 4.80795F, 20.0F);
      ((Path)localObject2).cubicTo(3.222029F, 18.400101F, 1.565846F, 16.869333F, 0.0F, 15.269435F);
      ((Path)localObject2).lineTo(0.0F, 15.269435F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(10.0F, 26.154007F);
      ((Path)localObject2).cubicTo(17.026365F, 19.148605F, 26.678946F, 14.890619F, 36.529732F, 15.002138F);
      ((Path)localObject2).cubicTo(46.360695F, 14.910895F, 55.983543F, 19.168882F, 63.0F, 26.143867F);
      ((Path)localObject2).cubicTo(61.424271F, 27.765959F, 59.848541F, 29.377911F, 58.272812F, 31.0F);
      ((Path)localObject2).cubicTo(52.505047F, 25.271996F, 44.616493F, 21.693258F, 36.519821F, 21.804777F);
      ((Path)localObject2).cubicTo(28.413239F, 21.683121F, 20.504862F, 25.251719F, 14.727188F, 31.0F);
      ((Path)localObject2).cubicTo(13.151459F, 29.388048F, 11.575729F, 27.776096F, 10.0F, 26.154007F);
      ((Path)localObject2).lineTo(10.0F, 26.154007F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(21.0F, 36.39119F);
      ((Path)localObject2).cubicTo(26.481159F, 31.299276F, 34.513546F, 28.796799F, 41.967922F, 30.564959F);
      ((Path)localObject2).cubicTo(46.163502F, 31.386234F, 49.840858F, 33.676147F, 53.0F, 36.39119F);
      ((Path)localObject2).cubicTo(51.425411F, 37.917797F, 49.880722F, 39.46373F, 48.296169F, 40.990337F);
      ((Path)localObject2).cubicTo(42.246964F, 35.086811F, 31.763002F, 35.086811F, 25.713797F, 41.0F);
      ((Path)localObject2).cubicTo(24.13921F, 39.473392F, 22.584553F, 37.917797F, 21.0F, 36.39119F);
      ((Path)localObject2).lineTo(21.0F, 36.39119F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(31.0F, 47.010326F);
      ((Path)localObject1).cubicTo(34.274048F, 44.367195F, 38.805809F, 44.26062F, 42.0F, 47.106247F);
      ((Path)localObject1).cubicTo(40.193283F, 49.088593F, 38.356625F, 51.038967F, 36.529945F, 53.0F);
      ((Path)localObject1).cubicTo(34.61343F, 51.070942F, 32.826679F, 49.013988F, 31.0F, 47.010326F);
      ((Path)localObject1).lineTo(31.0F, 47.010326F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mm\classes5.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ux
 * JD-Core Version:    0.7.0.1
 */
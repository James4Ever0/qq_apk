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

public final class aui
  extends c
{
  private final int height = 60;
  private final int width = 108;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 108;
      return 60;
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
      localPaint1.setColor(-3355444);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 22.0F, 0.0F, 1.0F, 17.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(6.095757F, 5.777769F);
      ((Path)localObject2).cubicTo(22.562868F, -1.94629F, 42.458115F, -1.905529F, 58.93528F, 5.777769F);
      ((Path)localObject2).cubicTo(64.454475F, 8.08072F, 64.404213F, 14.979384F, 63.620064F, 20.023458F);
      ((Path)localObject2).cubicTo(63.137508F, 21.694628F, 63.54969F, 24.11986F, 61.699905F, 24.975822F);
      ((Path)localObject2).cubicTo(56.512463F, 24.36442F, 51.314968F, 23.528835F, 46.23811F, 22.36717F);
      ((Path)localObject2).cubicTo(45.956623F, 22.071659F, 45.41375F, 21.460257F, 45.142315F, 21.164745F);
      ((Path)localObject2).cubicTo(45.464016F, 17.649178F, 46.80109F, 14.357791F, 47.97731F, 11.066404F);
      ((Path)localObject2).cubicTo(45.293114F, 9.833408F, 42.548595F, 8.671742F, 39.592957F, 8.366041F);
      ((Path)localObject2).cubicTo(32.032967F, 7.418367F, 23.950207F, 7.499887F, 17.013512F, 11.056214F);
      ((Path)localObject2).cubicTo(17.958511F, 14.561592F, 20.491913F, 18.454191F, 19.34585F, 22.000328F);
      ((Path)localObject2).cubicTo(14.580642F, 23.763206F, 9.322828F, 23.946629F, 4.33645F, 24.904493F);
      ((Path)localObject2).cubicTo(1.843261F, 25.597416F, 1.833208F, 22.34679F, 1.481346F, 20.736763F);
      ((Path)localObject2).cubicTo(0.6167728F, 15.509267F, 0.295071F, 8.213191F, 6.095757F, 5.777769F);
      ((Path)localObject2).lineTo(6.095757F, 5.777769F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mm\classes7.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aui
 * JD-Core Version:    0.7.0.1
 */
package com.tencent.mapsdk.rastercore.g;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.mapsdk.rastercore.d.a.1;
import com.tencent.mapsdk.rastercore.d.f;
import com.tencent.mapsdk.rastercore.tile.MapTile.MapSource;

public final class b
  extends View
{
  private f a;
  private Bitmap b;
  private Paint c = new Paint();
  private int d = 0;
  private int e = 10;
  private int f = 10;
  private final int g;
  private int h = 0;
  private int i = 0;
  private float j = 1.4E-45F;
  private float k = 1.0F;
  
  public b(f paramf)
  {
    super(f.a());
    this.a = paramf;
    this.k = getResources().getDisplayMetrics().density;
    paramf.f().b();
    this.c.setAntiAlias(true);
    this.c.setColor(-16777216);
    this.c.setStyle(Paint.Style.STROKE);
    this.g = ((int)(3.0F * this.k));
    this.i = this.g;
    this.h = this.g;
  }
  
  public final void a()
  {
    if (this.b != null) {
      this.b.recycle();
    }
  }
  
  public final void a(float paramFloat)
  {
    float f1 = 1.3F;
    float f2 = 0.7F;
    if (paramFloat < 0.7F) {
      paramFloat = f2;
    }
    for (;;)
    {
      if (paramFloat > 1.3F) {
        paramFloat = f1;
      }
      for (;;)
      {
        this.j = paramFloat;
        return;
      }
    }
  }
  
  public final void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public final void a(Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      paramBitmap = com.tencent.mapsdk.rastercore.f.b.a(paramBitmap, this.k / 3.0F);
      if (paramBitmap == null) {
        return;
      }
      this.b = paramBitmap;
      setVisibility(0);
      invalidate();
      return;
    }
    setVisibility(0);
  }
  
  public final void a(int[] paramArrayOfInt)
  {
    this.d = 1;
    if ((paramArrayOfInt != null) && (paramArrayOfInt.length >= 2))
    {
      if (paramArrayOfInt[0] >= 0) {
        break label48;
      }
      this.h = this.g;
      if (paramArrayOfInt[1] >= 0) {
        break label58;
      }
    }
    label48:
    label58:
    for (this.i = this.g;; this.i = paramArrayOfInt[1])
    {
      invalidate();
      return;
      this.h = paramArrayOfInt[0];
      break;
    }
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    Bitmap localBitmap2 = this.b;
    Bitmap localBitmap1 = localBitmap2;
    if (this.j != 1.4E-45F) {
      localBitmap1 = com.tencent.mapsdk.rastercore.f.b.a(localBitmap2, this.j);
    }
    if (localBitmap1 == null) {
      return;
    }
    int m = localBitmap1.getWidth();
    int n = localBitmap1.getHeight();
    int i1 = this.d;
    int i2 = this.a.c().getWidth();
    int i3 = this.a.c().getHeight();
    switch (i1)
    {
    default: 
      this.e = ((i2 - m - this.g) / 2);
      this.f = this.g;
      if (this.a.f().c() != MapTile.MapSource.WORLD) {
        break;
      }
    }
    for (this.f -= 2;; this.f -= 8)
    {
      paramCanvas.drawBitmap(localBitmap1, this.e - 5, this.f, this.c);
      return;
      this.e = 10;
      this.f = (i3 - (this.g + n));
      break;
      if (this.i + m > i2) {}
      for (this.e = (i2 - m - this.g);; this.e = (i2 - m - this.i))
      {
        if (this.h + n <= i3) {
          break label277;
        }
        this.f = (i3 - n - this.g);
        break;
      }
      label277:
      this.f = (i3 - n - this.h);
      break;
      this.e = (i2 - (m + this.g));
      this.f = this.g;
      break;
      this.e = this.g;
      this.f = this.g;
      break;
      this.e = ((i2 - m - this.g) / 2);
      this.f = (i3 - (this.g + n));
      break;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     com.tencent.mapsdk.rastercore.g.b
 * JD-Core Version:    0.7.0.1
 */
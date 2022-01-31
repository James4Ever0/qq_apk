package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.google.zxing.qrcode.encoder.Encoder;
import com.google.zxing.qrcode.encoder.QRCode;
import java.util.Map;

public final class QRCodeWriter
  implements Writer
{
  private static final int a = 4;
  
  private static BitMatrix a(QRCode paramQRCode, int paramInt1, int paramInt2, int paramInt3)
  {
    paramQRCode = paramQRCode.a();
    if (paramQRCode == null) {
      throw new IllegalStateException();
    }
    int k = paramQRCode.b();
    int m = paramQRCode.a();
    int i = (paramInt3 << 1) + k;
    int j = (paramInt3 << 1) + m;
    paramInt1 = Math.max(paramInt1, i);
    paramInt3 = Math.max(paramInt2, j);
    int n = Math.min(paramInt1 / i, paramInt3 / j);
    j = (paramInt1 - k * n) / 2;
    paramInt2 = (paramInt3 - m * n) / 2;
    BitMatrix localBitMatrix = new BitMatrix(paramInt1, paramInt3);
    paramInt1 = 0;
    while (paramInt1 < m)
    {
      i = 0;
      paramInt3 = j;
      while (i < k)
      {
        if (paramQRCode.a(i, paramInt1) == 1) {
          localBitMatrix.a(paramInt3, paramInt2, n, n);
        }
        i += 1;
        paramInt3 += n;
      }
      paramInt2 += n;
      paramInt1 += 1;
    }
    return localBitMatrix;
  }
  
  public BitMatrix a(String paramString, BarcodeFormat paramBarcodeFormat, int paramInt1, int paramInt2)
  {
    return a(paramString, paramBarcodeFormat, paramInt1, paramInt2, null);
  }
  
  public BitMatrix a(String paramString, BarcodeFormat paramBarcodeFormat, int paramInt1, int paramInt2, Map paramMap)
  {
    if (paramString.length() == 0) {
      throw new IllegalArgumentException("Found empty contents");
    }
    if (paramBarcodeFormat != BarcodeFormat.QR_CODE) {
      throw new IllegalArgumentException("Can only encode QR_CODE, but got " + paramBarcodeFormat);
    }
    if ((paramInt1 < 0) || (paramInt2 < 0)) {
      throw new IllegalArgumentException("Requested dimensions are too small: " + paramInt1 + 'x' + paramInt2);
    }
    paramBarcodeFormat = ErrorCorrectionLevel.L;
    Object localObject = paramBarcodeFormat;
    int i;
    if (paramMap != null)
    {
      localObject = (ErrorCorrectionLevel)paramMap.get(EncodeHintType.ERROR_CORRECTION);
      if (localObject != null) {
        paramBarcodeFormat = (BarcodeFormat)localObject;
      }
      Integer localInteger = (Integer)paramMap.get(EncodeHintType.MARGIN);
      localObject = paramBarcodeFormat;
      if (localInteger != null) {
        i = localInteger.intValue();
      }
    }
    for (;;)
    {
      return a(Encoder.a(paramString, paramBarcodeFormat, paramMap), paramInt1, paramInt2, i);
      i = 4;
      paramBarcodeFormat = (BarcodeFormat)localObject;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes3.jar
 * Qualified Name:     com.google.zxing.qrcode.QRCodeWriter
 * JD-Core Version:    0.7.0.1
 */
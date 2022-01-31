package c.t.m.g;

import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import org.eclipse.jdt.annotation.NonNull;

public final class er
{
  public static boolean a = false;
  
  public static int a(CellLocation paramCellLocation)
  {
    if ((paramCellLocation instanceof CdmaCellLocation)) {
      return ((CdmaCellLocation)paramCellLocation).getBaseStationId();
    }
    try
    {
      int i = ((GsmCellLocation)paramCellLocation).getCid();
      return i;
    }
    catch (Exception paramCellLocation) {}
    return -1;
  }
  
  public static CellLocation a(de paramde)
  {
    boolean bool2 = false;
    TelephonyManager localTelephonyManager = paramde.f;
    if (localTelephonyManager != null) {
      try
      {
        CellLocation localCellLocation = localTelephonyManager.getCellLocation();
        int i = localTelephonyManager.getSimState();
        int j;
        if (i == 5) {
          j = 1;
        }
        for (;;)
        {
          try
          {
            bool1 = TextUtils.isEmpty(localTelephonyManager.getSubscriberId());
            if (bool1) {
              continue;
            }
            i = 1;
          }
          catch (Exception localException)
          {
            boolean bool1;
            i = 1;
            continue;
          }
          if ((j != 0) && (i != 0))
          {
            if ((localCellLocation != null) && (!b(localCellLocation)))
            {
              bool1 = bool2;
              if (a(localCellLocation) >= 0) {}
            }
            else
            {
              bool1 = bool2;
              if (!a(paramde.a)) {
                bool1 = true;
              }
            }
            a = bool1;
          }
          if (a) {
            ev.a("Cells", 6, "location permission denied!");
          }
          return localCellLocation;
          j = 0;
          continue;
          i = 0;
        }
        return CellLocation.getEmpty();
      }
      catch (Exception paramde)
      {
        ev.a("Cells", "cannot get cell location", paramde);
        a = true;
      }
    }
  }
  
  public static void a(@NonNull TelephonyManager paramTelephonyManager, @NonNull int[] paramArrayOfInt)
  {
    paramTelephonyManager = paramTelephonyManager.getNetworkOperator();
    if ((paramTelephonyManager != null) && (paramTelephonyManager.length() >= 5)) {
      try
      {
        paramArrayOfInt[0] = Integer.parseInt(paramTelephonyManager.substring(0, 3));
        paramArrayOfInt[1] = Integer.parseInt(paramTelephonyManager.substring(3, 5));
        return;
      }
      catch (Throwable paramTelephonyManager)
      {
        ev.a("Cells", 6, paramTelephonyManager.toString());
      }
    }
    paramArrayOfInt[0] = 460;
    paramArrayOfInt[1] = 0;
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt == 1;
  }
  
  public static boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    boolean bool2 = true;
    boolean bool1;
    if (b(paramInt1)) {
      if ((paramInt2 >= 0) && (paramInt3 >= 0) && (paramInt4 >= 0) && (paramInt4 <= 65535) && (paramInt5 >= 0) && (paramInt5 <= 65535))
      {
        bool1 = bool2;
        if (paramInt3 == 0)
        {
          bool1 = bool2;
          if (paramInt4 == 0)
          {
            bool1 = bool2;
            if (paramInt5 != 0) {}
          }
        }
      }
      else
      {
        bool1 = false;
      }
    }
    do
    {
      return bool1;
      if ((paramInt2 < 0) || (paramInt3 < 0) || (paramInt4 <= 0) || (paramInt4 >= 65535)) {
        return false;
      }
      if ((paramInt5 == 268435455) || (paramInt5 == 2147483647) || (paramInt5 == 50594049) || (paramInt5 == 65535) || (paramInt5 <= 0)) {
        return false;
      }
      if (paramInt5 == 65535) {
        break;
      }
      bool1 = bool2;
    } while (paramInt5 > 0);
    return false;
  }
  
  public static boolean a(int paramInt, SignalStrength paramSignalStrength1, SignalStrength paramSignalStrength2)
  {
    if ((paramSignalStrength1 == null) || (paramSignalStrength2 == null)) {}
    int i;
    do
    {
      do
      {
        return true;
        i = b(paramInt, paramSignalStrength1, paramSignalStrength2);
        if (!a(paramInt)) {
          break;
        }
      } while (i > 3);
      return false;
      if (!b(paramInt)) {
        break;
      }
    } while (i > 6);
    return false;
    return false;
  }
  
  /* Error */
  @android.annotation.SuppressLint({"NewApi"})
  public static boolean a(android.content.Context paramContext)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iconst_1
    //   3: istore_2
    //   4: getstatic 133	android/os/Build$VERSION:SDK_INT	I
    //   7: bipush 17
    //   9: if_icmplt +25 -> 34
    //   12: aload_0
    //   13: invokevirtual 139	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   16: ldc 141
    //   18: invokestatic 147	android/provider/Settings$Global:getInt	(Landroid/content/ContentResolver;Ljava/lang/String;)I
    //   21: istore_1
    //   22: iload_1
    //   23: iconst_1
    //   24: if_icmpne +5 -> 29
    //   27: iload_2
    //   28: ireturn
    //   29: iconst_0
    //   30: istore_2
    //   31: goto -4 -> 27
    //   34: aload_0
    //   35: invokevirtual 139	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   38: ldc 141
    //   40: invokestatic 150	android/provider/Settings$System:getInt	(Landroid/content/ContentResolver;Ljava/lang/String;)I
    //   43: istore_1
    //   44: iload_1
    //   45: iconst_1
    //   46: if_icmpne +7 -> 53
    //   49: iload_3
    //   50: istore_2
    //   51: iload_2
    //   52: ireturn
    //   53: iconst_0
    //   54: istore_2
    //   55: goto -4 -> 51
    //   58: astore_0
    //   59: iconst_0
    //   60: ireturn
    //   61: astore_0
    //   62: iconst_0
    //   63: ireturn
    //   64: astore_0
    //   65: iconst_0
    //   66: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	67	0	paramContext	android.content.Context
    //   21	26	1	i	int
    //   3	52	2	bool1	boolean
    //   1	49	3	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   34	44	58	java/lang/Exception
    //   12	22	61	java/lang/Error
    //   12	22	64	java/lang/Exception
  }
  
  public static boolean a(CellLocation paramCellLocation1, CellLocation paramCellLocation2)
  {
    int i;
    if ((paramCellLocation1 == null) || (paramCellLocation2 == null))
    {
      i = 1;
      if (i == 0) {
        break label21;
      }
    }
    label21:
    label62:
    do
    {
      do
      {
        do
        {
          do
          {
            return false;
            i = 0;
            break;
          } while (paramCellLocation1.getClass() != paramCellLocation2.getClass());
          if (!(paramCellLocation1 instanceof GsmCellLocation)) {
            break label62;
          }
          paramCellLocation1 = (GsmCellLocation)paramCellLocation1;
          paramCellLocation2 = (GsmCellLocation)paramCellLocation2;
        } while (paramCellLocation1.getCid() != paramCellLocation2.getCid());
        return true;
      } while (!(paramCellLocation1 instanceof CdmaCellLocation));
      paramCellLocation1 = (CdmaCellLocation)paramCellLocation1;
      paramCellLocation2 = (CdmaCellLocation)paramCellLocation2;
    } while (paramCellLocation1.getBaseStationId() != paramCellLocation2.getBaseStationId());
    return true;
  }
  
  public static boolean a(ee paramee)
  {
    if (paramee == null) {}
    for (int i = 1; i != 0; i = 0) {
      return false;
    }
    return a(paramee.a, paramee.b, paramee.c, paramee.d, paramee.e);
  }
  
  private static int b(int paramInt, SignalStrength paramSignalStrength1, SignalStrength paramSignalStrength2)
  {
    try
    {
      if (a(paramInt)) {
        return paramSignalStrength1.getGsmSignalStrength() - paramSignalStrength2.getGsmSignalStrength();
      }
      if (b(paramInt))
      {
        paramInt = paramSignalStrength1.getCdmaDbm();
        int i = paramSignalStrength2.getCdmaDbm();
        return paramInt - i;
      }
    }
    catch (NoSuchMethodError paramSignalStrength1) {}
    return 0;
  }
  
  public static List<NeighboringCellInfo> b(de paramde)
  {
    paramde = paramde.f;
    if (paramde != null) {
      try
      {
        paramde = paramde.getNeighboringCellInfo();
        return paramde;
      }
      catch (Exception paramde)
      {
        ev.a("Cells", "cannot get NeighboringCellInfo", paramde);
      }
    }
    return Collections.emptyList();
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt == 2;
  }
  
  private static boolean b(CellLocation paramCellLocation)
  {
    try
    {
      paramCellLocation = (GsmCellLocation)paramCellLocation;
      if (paramCellLocation.getCid() == 0)
      {
        int i = paramCellLocation.getLac();
        if (i == 0) {
          return true;
        }
      }
    }
    catch (ClassCastException paramCellLocation) {}
    return false;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     c.t.m.g.er
 * JD-Core Version:    0.7.0.1
 */
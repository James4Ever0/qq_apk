package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract interface l
  extends IInterface
{
  public abstract void a(int paramInt1, int paramInt2, int paramInt3, String paramString, r paramr, byte[] paramArrayOfByte);
  
  public static abstract class a
    extends Binder
    implements l
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.network.IOnGYNetEnd_AIDL");
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.network.IOnGYNetEnd_AIDL");
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.network.IOnGYNetEnd_AIDL");
      a(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString(), r.a.p(paramParcel1.readStrongBinder()), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      return true;
    }
    
    private static final class a
      implements l
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }
      
      /* Error */
      public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, r paramr, byte[] paramArrayOfByte)
      {
        // Byte code:
        //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 7
        //   5: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 8
        //   10: aload 7
        //   12: ldc 28
        //   14: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload 7
        //   19: iload_1
        //   20: invokevirtual 36	android/os/Parcel:writeInt	(I)V
        //   23: aload 7
        //   25: iload_2
        //   26: invokevirtual 36	android/os/Parcel:writeInt	(I)V
        //   29: aload 7
        //   31: iload_3
        //   32: invokevirtual 36	android/os/Parcel:writeInt	(I)V
        //   35: aload 7
        //   37: aload 4
        //   39: invokevirtual 39	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: aload 5
        //   44: ifnull +58 -> 102
        //   47: aload 5
        //   49: invokeinterface 45 1 0
        //   54: astore 4
        //   56: aload 7
        //   58: aload 4
        //   60: invokevirtual 48	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   63: aload 7
        //   65: aload 6
        //   67: invokevirtual 52	android/os/Parcel:writeByteArray	([B)V
        //   70: aload_0
        //   71: getfield 18	com/tencent/mm/network/l$a$a:mRemote	Landroid/os/IBinder;
        //   74: iconst_1
        //   75: aload 7
        //   77: aload 8
        //   79: iconst_0
        //   80: invokeinterface 58 5 0
        //   85: pop
        //   86: aload 8
        //   88: invokevirtual 61	android/os/Parcel:readException	()V
        //   91: aload 8
        //   93: invokevirtual 64	android/os/Parcel:recycle	()V
        //   96: aload 7
        //   98: invokevirtual 64	android/os/Parcel:recycle	()V
        //   101: return
        //   102: aconst_null
        //   103: astore 4
        //   105: goto -49 -> 56
        //   108: astore 4
        //   110: aload 8
        //   112: invokevirtual 64	android/os/Parcel:recycle	()V
        //   115: aload 7
        //   117: invokevirtual 64	android/os/Parcel:recycle	()V
        //   120: aload 4
        //   122: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	123	0	this	a
        //   0	123	1	paramInt1	int
        //   0	123	2	paramInt2	int
        //   0	123	3	paramInt3	int
        //   0	123	4	paramString	String
        //   0	123	5	paramr	r
        //   0	123	6	paramArrayOfByte	byte[]
        //   3	113	7	localParcel1	Parcel
        //   8	103	8	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   10	42	108	finally
        //   47	56	108	finally
        //   56	91	108	finally
      }
      
      public final IBinder asBinder()
      {
        return this.mRemote;
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mm\classes.jar
 * Qualified Name:     com.tencent.mm.network.l
 * JD-Core Version:    0.7.0.1
 */
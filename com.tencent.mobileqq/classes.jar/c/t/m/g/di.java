package c.t.m.g;

import android.location.Location;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

final class di
  extends dh
{
  private SparseArray<Pair<Double, Double>> a = new SparseArray();
  
  public di(String paramString)
  {
    super(paramString, "check cell");
  }
  
  public final void a()
  {
    super.a();
    this.a.clear();
  }
  
  protected final boolean a(Bundle paramBundle)
  {
    int i = paramBundle.getInt("lac");
    int j = paramBundle.getInt("cid");
    paramBundle = (Location)paramBundle.getParcelable("location");
    if ((i == 0) || (j == 0) || (paramBundle == null)) {
      return false;
    }
    i <<= j + 16;
    Pair localPair = (Pair)this.a.get(i);
    if (localPair == null)
    {
      paramBundle = Pair.create(Double.valueOf(paramBundle.getLatitude()), Double.valueOf(paramBundle.getLongitude()));
      this.a.put(i, paramBundle);
      if (this.a.size() > 320) {
        this.a.delete(this.a.keyAt(0));
      }
      return true;
    }
    return ev.a(paramBundle.getLatitude(), paramBundle.getLongitude(), ((Double)localPair.first).doubleValue(), ((Double)localPair.second).doubleValue()) < 6000.0D;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     c.t.m.g.di
 * JD-Core Version:    0.7.0.1
 */
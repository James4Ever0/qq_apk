package com.tencent.mm.plugin.fts.ui.d;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.k;
import com.tencent.mm.plugin.fts.a.a.m;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.a.q;
import com.tencent.mm.sdk.platformtools.MMHandler;
import java.util.HashSet;
import java.util.List;

public final class b
  extends com.tencent.mm.plugin.fts.ui.a
{
  public b(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }
  
  public final com.tencent.mm.plugin.fts.a.a.a a(MMHandler paramMMHandler, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(112168);
    j localj = new j();
    localj.nRn = 32;
    localj.query = getQuery();
    localj.BIS = paramHashSet;
    localj.BIT = com.tencent.mm.plugin.fts.a.c.a.BJt;
    localj.BIU = this;
    localj.handler = paramMMHandler;
    paramMMHandler = ((n)com.tencent.mm.kernel.h.ag(n.class)).search(2, localj);
    AppMethodBeat.o(112168);
    return paramMMHandler;
  }
  
  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    AppMethodBeat.i(112170);
    int i = paramInt - parama.BJz - 1;
    m localm = null;
    Object localObject = localm;
    if (i < parama.pWR.size())
    {
      localObject = localm;
      if (i >= 0)
      {
        localm = (m)parama.pWR.get(i);
        if (!localm.BHS.equals("create_chatroom​")) {
          break label110;
        }
        localObject = new com.tencent.mm.plugin.fts.ui.a.h(paramInt);
        ((com.tencent.mm.plugin.fts.ui.a.h)localObject).BHY = parama.BHY;
      }
    }
    for (;;)
    {
      if (localObject != null) {
        ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).BJI = (i + 1);
      }
      AppMethodBeat.o(112170);
      return localObject;
      label110:
      localObject = new q(paramInt);
      ((q)localObject).olG = localm;
      ((q)localObject).BHY = parama.BHY;
      ((q)localObject).hx(localm.type, localm.BHR);
    }
  }
  
  public final void a(k paramk, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(112169);
    if (ff(paramk.BIW))
    {
      paramHashSet = new e.a();
      paramHashSet.businessType = -3;
      paramHashSet.pWR = paramk.BIW;
      paramHashSet.BHY = paramk.BHY;
      paramHashSet.xcp = false;
      this.BLN.add(paramHashSet);
    }
    AppMethodBeat.o(112169);
  }
  
  public final int getType()
  {
    return 4128;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mm\classes5.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.d.b
 * JD-Core Version:    0.7.0.1
 */
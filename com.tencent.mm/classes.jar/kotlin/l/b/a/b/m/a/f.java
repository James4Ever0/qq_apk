package kotlin.l.b.a.b.m.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.a.j;
import kotlin.g.b.p;
import kotlin.l.b.a.b.m.ab;
import kotlin.l.b.a.b.m.ac;
import kotlin.l.b.a.b.m.ad;
import kotlin.l.b.a.b.m.aj;
import kotlin.l.b.a.b.m.bg;
import kotlin.l.b.a.b.m.s;
import kotlin.l.b.a.b.m.u;
import kotlin.l.b.a.b.m.v;
import kotlin.m;

public final class f
{
  public static final bg lI(List<? extends bg> paramList)
  {
    AppMethodBeat.i(61045);
    p.k(paramList, "types");
    int i;
    int j;
    switch (paramList.size())
    {
    default: 
      localObject1 = (Iterable)paramList;
      localObject2 = (Collection)new ArrayList(j.a((Iterable)localObject1, 10));
      Iterator localIterator = ((Iterable)localObject1).iterator();
      i = 0;
      j = 0;
      if (!localIterator.hasNext()) {
        break label231;
      }
      localObject1 = (bg)localIterator.next();
      if ((i != 0) || (ad.ap((ab)localObject1)))
      {
        i = 1;
        label112:
        if (!(localObject1 instanceof aj)) {
          break label179;
        }
        localObject1 = (aj)localObject1;
      }
      break;
    }
    for (;;)
    {
      ((Collection)localObject2).add(localObject1);
      break;
      paramList = (Throwable)new IllegalStateException("Expected some types".toString());
      AppMethodBeat.o(61045);
      throw paramList;
      paramList = (bg)j.ls(paramList);
      AppMethodBeat.o(61045);
      return paramList;
      i = 0;
      break label112;
      label179:
      if (!(localObject1 instanceof v)) {
        break label216;
      }
      if (s.aj((ab)localObject1))
      {
        AppMethodBeat.o(61045);
        return localObject1;
      }
      localObject1 = ((v)localObject1).abqv;
      j = 1;
    }
    label216:
    paramList = new m();
    AppMethodBeat.o(61045);
    throw paramList;
    label231:
    Object localObject1 = (List)localObject2;
    if (i != 0)
    {
      paramList = u.bHp("Intersection of error types: ".concat(String.valueOf(paramList)));
      p.j(paramList, "ErrorUtils.createErrorTy… of error types: $types\")");
      paramList = (bg)paramList;
      AppMethodBeat.o(61045);
      return paramList;
    }
    if (j == 0)
    {
      paramList = (bg)y.abse.lJ((List)localObject1);
      AppMethodBeat.o(61045);
      return paramList;
    }
    Object localObject2 = (Iterable)paramList;
    paramList = (Collection)new ArrayList(j.a((Iterable)localObject2, 10));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      paramList.add(kotlin.l.b.a.b.m.y.ao((ab)((Iterator)localObject2).next()));
    }
    paramList = (List)paramList;
    paramList = ac.a(y.abse.lJ((List)localObject1), y.abse.lJ(paramList));
    AppMethodBeat.o(61045);
    return paramList;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mm\classes6.jar
 * Qualified Name:     kotlin.l.b.a.b.m.a.f
 * JD-Core Version:    0.7.0.1
 */
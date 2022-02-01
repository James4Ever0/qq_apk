package com.tencent.mm.plugin.finder.feed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.finder.b.g;
import com.tencent.mm.plugin.finder.model.bu;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.view.RefreshLoadMoreLayout;
import java.util.ArrayList;
import kotlin.g.b.p;
import kotlin.l;
import kotlin.t;

@l(iBK={1, 1, 16}, iBL={""}, iBM={"Lcom/tencent/mm/plugin/finder/feed/FinderAtTimelineUIContract$ViewCallback;", "Lcom/tencent/mm/plugin/finder/feed/FinderLoaderFeedUIContract$ViewCallback;", "context", "Lcom/tencent/mm/ui/MMActivity;", "presenter", "Lcom/tencent/mm/plugin/finder/feed/FinderAtTimelineUIContract$Presenter;", "scene", "", "commentScene", "isAutoRefresh", "", "(Lcom/tencent/mm/ui/MMActivity;Lcom/tencent/mm/plugin/finder/feed/FinderAtTimelineUIContract$Presenter;IIZ)V", "()Z", "getEmptyView", "Landroid/view/View;", "initRecyclerView", "", "data", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/finder/model/RVFeed;", "onLoadInitDataError", "errCode", "errMsg", "", "onLoadMoreError", "onRefreshError", "onViewPrepared", "plugin-finder_release"})
public final class a$c
  extends aa.b
{
  private final boolean xvi;
  
  public a$c(MMActivity paramMMActivity, a.b paramb, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramMMActivity, (aa.a)paramb, paramInt1, paramInt2);
    AppMethodBeat.i(287894);
    this.xvi = paramBoolean;
    AppMethodBeat.o(287894);
  }
  
  public final void aa(ArrayList<bu> paramArrayList)
  {
    AppMethodBeat.i(287893);
    p.k(paramArrayList, "data");
    super.aa(paramArrayList);
    paramArrayList = this.xvJ;
    Object localObject = ad.kS((Context)this.iXq);
    if (dsA()) {}
    for (int i = b.g.load_more_footer_dark;; i = b.g.load_more_footer)
    {
      localObject = ((LayoutInflater)localObject).inflate(i, null);
      p.j(localObject, "MMLayoutInflater.getInfl…t.load_more_footer, null)");
      paramArrayList.setLoadMoreFooter((View)localObject);
      AppMethodBeat.o(287893);
      return;
    }
  }
  
  public final void dsm()
  {
    AppMethodBeat.i(287892);
    Object localObject = this.xvP;
    if (localObject == null)
    {
      localObject = new t("null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderLoaderFeedUIContract.Presenter");
      AppMethodBeat.o(287892);
      throw ((Throwable)localObject);
    }
    ((aa.a)localObject).dsF();
    if (this.xvi)
    {
      localObject = this.xvP;
      if (localObject == null)
      {
        localObject = new t("null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderLoaderFeedUIContract.Presenter");
        AppMethodBeat.o(287892);
        throw ((Throwable)localObject);
      }
      ((aa.a)localObject).requestRefresh();
    }
    AppMethodBeat.o(287892);
  }
  
  public final View getEmptyView()
  {
    return null;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mm\classes2.jar
 * Qualified Name:     com.tencent.mm.plugin.finder.feed.a.c
 * JD-Core Version:    0.7.0.1
 */
package com.tencent.mm.plugin.hld.view;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.hld.a.l;
import kotlin.g.b.p;
import kotlin.l;

@l(iBK={1, 1, 16}, iBL={""}, iBM={"Lcom/tencent/mm/plugin/hld/view/ImeNoPaddingText;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "plugin-hld_release"})
public final class ImeNoPaddingText
  extends AppCompatTextView
{
  public static final a DIO;
  
  static
  {
    AppMethodBeat.i(215146);
    DIO = new a((byte)0);
    AppMethodBeat.o(215146);
  }
  
  public ImeNoPaddingText(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ImeNoPaddingText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(215144);
    if (paramContext == null) {
      p.iCn();
    }
    paramContext = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, a.l.NoPaddingTextView, 0, 0);
    p.j(paramContext, "context!!.theme.obtainSt….NoPaddingTextView, 0, 0)");
    float f = paramContext.getDimension(a.l.NoPaddingTextView_textSize, 0.0F);
    paramAttributeSet = new Paint();
    paramAttributeSet.setTextSize(f);
    paramAttributeSet = paramAttributeSet.getFontMetricsInt();
    p.j(paramAttributeSet, "paint.fontMetricsInt");
    setTextSize(0, paramContext.getDimension(a.l.NoPaddingTextView_textSize, 0.0F));
    setPadding(0, -((int)Math.ceil(Math.abs((paramAttributeSet.top - paramAttributeSet.ascent) / 2.0D)) + Math.abs(paramAttributeSet.top - paramAttributeSet.ascent)), 0, paramAttributeSet.top - paramAttributeSet.ascent);
    paramContext.recycle();
    AppMethodBeat.o(215144);
  }
  
  @l(iBK={1, 1, 16}, iBL={""}, iBM={"Lcom/tencent/mm/plugin/hld/view/ImeNoPaddingText$Companion;", "", "()V", "TAG", "", "plugin-hld_release"})
  public static final class a {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mm\classes3.jar
 * Qualified Name:     com.tencent.mm.plugin.hld.view.ImeNoPaddingText
 * JD-Core Version:    0.7.0.1
 */
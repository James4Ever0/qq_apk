package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bu;
import com.tencent.mm.ui.tools.f;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MMTagPanel
  extends FlowLayout
{
  private View.OnClickListener JIA;
  public boolean JIk;
  private boolean JIl;
  public boolean JIm;
  public boolean JIn;
  public boolean JIo;
  private int JIp;
  private int JIq;
  private int JIr;
  private int JIs;
  private MMTagPanel.d JIt;
  private LinkedList<MMTagPanel.d> JIu;
  private a JIv;
  private int JIw;
  private View JIx;
  MMEditText JIy;
  private boolean JIz;
  public boolean mClickable;
  private boolean rGs;
  private int rHQ;
  private int rHR;
  private LinkedList<MMTagPanel.d> uda;
  private int vdE;
  private int vdF;
  
  public MMTagPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(142188);
    this.rGs = false;
    this.JIk = true;
    this.JIl = false;
    this.JIm = true;
    this.JIn = false;
    this.JIo = false;
    this.JIp = 2131234288;
    this.JIq = 0;
    this.rHR = 2131234298;
    this.rHQ = 2131100711;
    this.vdE = 2131234292;
    this.vdF = 2131101171;
    this.JIr = 2131234295;
    this.JIs = 2131101182;
    this.JIt = null;
    this.uda = new LinkedList();
    this.JIu = new LinkedList();
    this.JIz = false;
    this.JIA = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        AppMethodBeat.i(142179);
        com.tencent.mm.hellhoundlib.b.b localb = new com.tencent.mm.hellhoundlib.b.b();
        localb.bd(paramAnonymousView);
        com.tencent.mm.hellhoundlib.a.a.b("com/tencent/mm/ui/base/MMTagPanel$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, localb.ahF());
        if (((Integer)paramAnonymousView.getTag()).intValue() == 0)
        {
          MMTagPanel.this.a((TextView)paramAnonymousView, true, false);
          if (MMTagPanel.e(MMTagPanel.this) != null) {
            paramAnonymousView.post(new Runnable()
            {
              public final void run()
              {
                AppMethodBeat.i(142176);
                MMTagPanel.e(MMTagPanel.this).acU(((TextView)paramAnonymousView).getText().toString());
                AppMethodBeat.o(142176);
              }
            });
          }
        }
        for (;;)
        {
          com.tencent.mm.hellhoundlib.a.a.a(this, "com/tencent/mm/ui/base/MMTagPanel$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
          AppMethodBeat.o(142179);
          return;
          if ((!MMTagPanel.f(MMTagPanel.this)) || (MMTagPanel.c(MMTagPanel.this)))
          {
            MMTagPanel.this.a((TextView)paramAnonymousView, false, false);
            if (MMTagPanel.e(MMTagPanel.this) != null) {
              paramAnonymousView.post(new Runnable()
              {
                public final void run()
                {
                  AppMethodBeat.i(142177);
                  MMTagPanel.e(MMTagPanel.this).acT(((TextView)paramAnonymousView).getText().toString());
                  AppMethodBeat.o(142177);
                }
              });
            }
          }
          else if (MMTagPanel.d(MMTagPanel.this) == null)
          {
            MMTagPanel.a(MMTagPanel.this, MMTagPanel.a(MMTagPanel.this, ((TextView)paramAnonymousView).getText().toString()));
            if (MMTagPanel.d(MMTagPanel.this) != null) {
              MMTagPanel.this.a(MMTagPanel.d(MMTagPanel.this).JIM, false, true);
            }
          }
          else if (MMTagPanel.d(MMTagPanel.this).JIM == paramAnonymousView)
          {
            MMTagPanel.a(MMTagPanel.this, null);
            MMTagPanel.this.a((TextView)paramAnonymousView, false, false);
            if (MMTagPanel.e(MMTagPanel.this) != null) {
              paramAnonymousView.post(new Runnable()
              {
                public final void run()
                {
                  AppMethodBeat.i(142178);
                  MMTagPanel.e(MMTagPanel.this).acT(((TextView)paramAnonymousView).getText().toString());
                  AppMethodBeat.o(142178);
                }
              });
            }
          }
          else
          {
            MMTagPanel.this.fDf();
            MMTagPanel.a(MMTagPanel.this, MMTagPanel.a(MMTagPanel.this, ((TextView)paramAnonymousView).getText().toString()));
            if (MMTagPanel.d(MMTagPanel.this) != null) {
              MMTagPanel.this.a(MMTagPanel.d(MMTagPanel.this).JIM, false, true);
            }
          }
        }
      }
    };
    this.mClickable = true;
    init();
    AppMethodBeat.o(142188);
  }
  
  public MMTagPanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(142187);
    this.rGs = false;
    this.JIk = true;
    this.JIl = false;
    this.JIm = true;
    this.JIn = false;
    this.JIo = false;
    this.JIp = 2131234288;
    this.JIq = 0;
    this.rHR = 2131234298;
    this.rHQ = 2131100711;
    this.vdE = 2131234292;
    this.vdF = 2131101171;
    this.JIr = 2131234295;
    this.JIs = 2131101182;
    this.JIt = null;
    this.uda = new LinkedList();
    this.JIu = new LinkedList();
    this.JIz = false;
    this.JIA = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        AppMethodBeat.i(142179);
        com.tencent.mm.hellhoundlib.b.b localb = new com.tencent.mm.hellhoundlib.b.b();
        localb.bd(paramAnonymousView);
        com.tencent.mm.hellhoundlib.a.a.b("com/tencent/mm/ui/base/MMTagPanel$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, localb.ahF());
        if (((Integer)paramAnonymousView.getTag()).intValue() == 0)
        {
          MMTagPanel.this.a((TextView)paramAnonymousView, true, false);
          if (MMTagPanel.e(MMTagPanel.this) != null) {
            paramAnonymousView.post(new Runnable()
            {
              public final void run()
              {
                AppMethodBeat.i(142176);
                MMTagPanel.e(MMTagPanel.this).acU(((TextView)paramAnonymousView).getText().toString());
                AppMethodBeat.o(142176);
              }
            });
          }
        }
        for (;;)
        {
          com.tencent.mm.hellhoundlib.a.a.a(this, "com/tencent/mm/ui/base/MMTagPanel$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
          AppMethodBeat.o(142179);
          return;
          if ((!MMTagPanel.f(MMTagPanel.this)) || (MMTagPanel.c(MMTagPanel.this)))
          {
            MMTagPanel.this.a((TextView)paramAnonymousView, false, false);
            if (MMTagPanel.e(MMTagPanel.this) != null) {
              paramAnonymousView.post(new Runnable()
              {
                public final void run()
                {
                  AppMethodBeat.i(142177);
                  MMTagPanel.e(MMTagPanel.this).acT(((TextView)paramAnonymousView).getText().toString());
                  AppMethodBeat.o(142177);
                }
              });
            }
          }
          else if (MMTagPanel.d(MMTagPanel.this) == null)
          {
            MMTagPanel.a(MMTagPanel.this, MMTagPanel.a(MMTagPanel.this, ((TextView)paramAnonymousView).getText().toString()));
            if (MMTagPanel.d(MMTagPanel.this) != null) {
              MMTagPanel.this.a(MMTagPanel.d(MMTagPanel.this).JIM, false, true);
            }
          }
          else if (MMTagPanel.d(MMTagPanel.this).JIM == paramAnonymousView)
          {
            MMTagPanel.a(MMTagPanel.this, null);
            MMTagPanel.this.a((TextView)paramAnonymousView, false, false);
            if (MMTagPanel.e(MMTagPanel.this) != null) {
              paramAnonymousView.post(new Runnable()
              {
                public final void run()
                {
                  AppMethodBeat.i(142178);
                  MMTagPanel.e(MMTagPanel.this).acT(((TextView)paramAnonymousView).getText().toString());
                  AppMethodBeat.o(142178);
                }
              });
            }
          }
          else
          {
            MMTagPanel.this.fDf();
            MMTagPanel.a(MMTagPanel.this, MMTagPanel.a(MMTagPanel.this, ((TextView)paramAnonymousView).getText().toString()));
            if (MMTagPanel.d(MMTagPanel.this) != null) {
              MMTagPanel.this.a(MMTagPanel.d(MMTagPanel.this).JIM, false, true);
            }
          }
        }
      }
    };
    this.mClickable = true;
    init();
    AppMethodBeat.o(142187);
  }
  
  private void a(MMTagPanel.d paramd)
  {
    AppMethodBeat.i(142204);
    paramd.JIM.setOnClickListener(null);
    if (this.JIu.size() >= 16)
    {
      AppMethodBeat.o(142204);
      return;
    }
    this.JIu.add(paramd);
    AppMethodBeat.o(142204);
  }
  
  private void init()
  {
    AppMethodBeat.i(142189);
    this.JIw = getContext().getResources().getDimensionPixelSize(2131165466);
    this.JIx = LayoutInflater.from(getContext()).inflate(2131494907, null);
    this.JIy = ((MMEditText)this.JIx.findViewById(2131299306));
    this.JIy.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        AppMethodBeat.i(142169);
        com.tencent.mm.hellhoundlib.b.b localb = new com.tencent.mm.hellhoundlib.b.b();
        localb.bd(paramAnonymousView);
        localb.mu(paramAnonymousInt);
        localb.bd(paramAnonymousKeyEvent);
        com.tencent.mm.hellhoundlib.a.a.b("com/tencent/mm/ui/base/MMTagPanel$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, localb.ahF());
        if ((paramAnonymousKeyEvent.getAction() == 0) && (67 == paramAnonymousInt))
        {
          ae.d("MicroMsg.MMTagPanel", "on del click, selection[%d, %d]", new Object[] { Integer.valueOf(MMTagPanel.a(MMTagPanel.this).getSelectionStart()), Integer.valueOf(MMTagPanel.a(MMTagPanel.this).getSelectionEnd()) });
          if ((MMTagPanel.a(MMTagPanel.this).getSelectionStart() == 0) && (MMTagPanel.a(MMTagPanel.this).getSelectionStart() == MMTagPanel.a(MMTagPanel.this).getSelectionEnd())) {}
          for (paramAnonymousInt = 1; paramAnonymousInt == 0; paramAnonymousInt = 0)
          {
            com.tencent.mm.hellhoundlib.a.a.a(false, this, "com/tencent/mm/ui/base/MMTagPanel$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            AppMethodBeat.o(142169);
            return false;
          }
          MMTagPanel.this.cyQ();
          if ((MMTagPanel.b(MMTagPanel.this) == null) || (MMTagPanel.b(MMTagPanel.this).isEmpty()))
          {
            com.tencent.mm.hellhoundlib.a.a.a(false, this, "com/tencent/mm/ui/base/MMTagPanel$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            AppMethodBeat.o(142169);
            return false;
          }
          if ((MMTagPanel.c(MMTagPanel.this)) || (MMTagPanel.d(MMTagPanel.this) != null)) {
            break label313;
          }
          MMTagPanel.a(MMTagPanel.this, (MMTagPanel.d)MMTagPanel.b(MMTagPanel.this).getLast());
          MMTagPanel.this.a(MMTagPanel.d(MMTagPanel.this).JIM, false, true);
          MMTagPanel.a(MMTagPanel.this).setCursorVisible(false);
        }
        for (;;)
        {
          com.tencent.mm.hellhoundlib.a.a.a(false, this, "com/tencent/mm/ui/base/MMTagPanel$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
          AppMethodBeat.o(142169);
          return false;
          label313:
          if ((MMTagPanel.d(MMTagPanel.this) != null) && (MMTagPanel.b(MMTagPanel.this) != null) && (MMTagPanel.b(MMTagPanel.this).getLast() != null) && (!bu.isNullOrNil(MMTagPanel.d(MMTagPanel.this).JIL)) && (!bu.isNullOrNil(((MMTagPanel.d)MMTagPanel.b(MMTagPanel.this).getLast()).JIL)) && (!MMTagPanel.d(MMTagPanel.this).JIL.equals(((MMTagPanel.d)MMTagPanel.b(MMTagPanel.this).getLast()).JIL)))
          {
            ae.i("MicroMsg.MMTagPanel", "change hight");
            MMTagPanel.this.fDf();
            MMTagPanel.a(MMTagPanel.this, (MMTagPanel.d)MMTagPanel.b(MMTagPanel.this).getLast());
            MMTagPanel.this.a(MMTagPanel.d(MMTagPanel.this).JIM, false, true);
            MMTagPanel.a(MMTagPanel.this).setCursorVisible(false);
          }
          else
          {
            paramAnonymousView = ((MMTagPanel.d)MMTagPanel.b(MMTagPanel.this).getLast()).JIL;
            MMTagPanel.this.removeTag(paramAnonymousView);
            if (MMTagPanel.e(MMTagPanel.this) != null) {
              MMTagPanel.e(MMTagPanel.this).acV(paramAnonymousView);
            }
            MMTagPanel.this.fDf();
          }
        }
      }
    });
    this.JIy.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        AppMethodBeat.i(142170);
        paramAnonymousEditable = paramAnonymousEditable.toString();
        if (MMTagPanel.e(MMTagPanel.this) != null) {
          MMTagPanel.e(MMTagPanel.this).acW(paramAnonymousEditable);
        }
        if (paramAnonymousEditable.length() > 0) {
          MMTagPanel.this.fDf();
        }
        AppMethodBeat.o(142170);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
    });
    this.JIy.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(142171);
        ae.d("MicroMsg.MMTagPanel", "on edittext focus changed %B", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if ((paramAnonymousBoolean) && (MMTagPanel.e(MMTagPanel.this) != null)) {
          MMTagPanel.e(MMTagPanel.this).cki();
        }
        AppMethodBeat.o(142171);
      }
    });
    this.JIy.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(142172);
        com.tencent.mm.hellhoundlib.b.b localb = new com.tencent.mm.hellhoundlib.b.b();
        localb.bd(paramAnonymousView);
        com.tencent.mm.hellhoundlib.a.a.b("com/tencent/mm/ui/base/MMTagPanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, localb.ahF());
        ae.d("MicroMsg.MMTagPanel", "on edittext click");
        MMTagPanel.this.fDf();
        if (MMTagPanel.e(MMTagPanel.this) != null) {
          MMTagPanel.e(MMTagPanel.this).cki();
        }
        com.tencent.mm.hellhoundlib.a.a.a(this, "com/tencent/mm/ui/base/MMTagPanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        AppMethodBeat.o(142172);
      }
    });
    this.JIy.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        AppMethodBeat.i(142173);
        ae.d("MicroMsg.MMTagPanel", "on action %d, %s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousKeyEvent });
        AppMethodBeat.o(142173);
        return false;
      }
    });
    final c localc = new c();
    b localb = new b();
    this.JIy.setFilters(new InputFilter[] { localc, localb });
    fDd();
    setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(142174);
        com.tencent.mm.hellhoundlib.b.b localb = new com.tencent.mm.hellhoundlib.b.b();
        localb.bd(paramAnonymousView);
        com.tencent.mm.hellhoundlib.a.a.b("com/tencent/mm/ui/base/MMTagPanel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, localb.ahF());
        ae.d("MicroMsg.MMTagPanel", "on panel click, enableEditMode %B", new Object[] { Boolean.valueOf(MMTagPanel.f(MMTagPanel.this)) });
        if (MMTagPanel.f(MMTagPanel.this))
        {
          MMTagPanel.this.fDf();
          MMTagPanel.a(MMTagPanel.this).requestFocus();
          MMTagPanel.a(MMTagPanel.this).setSelection(MMTagPanel.a(MMTagPanel.this).getText().length());
          ((InputMethodManager)MMTagPanel.this.getContext().getSystemService("input_method")).showSoftInput(MMTagPanel.a(MMTagPanel.this), 0);
          ae.d("MicroMsg.MMTagPanel", "on content click");
          if (MMTagPanel.e(MMTagPanel.this) != null) {
            MMTagPanel.e(MMTagPanel.this).cki();
          }
        }
        com.tencent.mm.hellhoundlib.a.a.a(this, "com/tencent/mm/ui/base/MMTagPanel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        AppMethodBeat.o(142174);
      }
    });
    setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        AppMethodBeat.i(142175);
        com.tencent.mm.hellhoundlib.b.b localb = new com.tencent.mm.hellhoundlib.b.b();
        localb.bd(paramAnonymousView);
        localb.bd(paramAnonymousMotionEvent);
        com.tencent.mm.hellhoundlib.a.a.b("com/tencent/mm/ui/base/MMTagPanel$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, localb.ahF());
        if (MMTagPanel.g(MMTagPanel.this))
        {
          paramAnonymousMotionEvent = MMTagPanel.this.getEditText();
          if (!bu.isNullOrNil(paramAnonymousMotionEvent))
          {
            paramAnonymousView = paramAnonymousMotionEvent;
            if (localc != null)
            {
              paramAnonymousView = paramAnonymousMotionEvent;
              if (f.aYK(paramAnonymousMotionEvent) > localc.JIH)
              {
                int i = localc.JIH - f.aYM(paramAnonymousMotionEvent);
                paramAnonymousView = paramAnonymousMotionEvent;
                if (i < paramAnonymousMotionEvent.length()) {
                  paramAnonymousView = paramAnonymousMotionEvent.substring(0, i);
                }
              }
            }
            MMTagPanel.this.cR(paramAnonymousView, true);
            if (MMTagPanel.e(MMTagPanel.this) != null) {
              MMTagPanel.e(MMTagPanel.this).acX(paramAnonymousView);
            }
            MMTagPanel.this.fDb();
          }
        }
        com.tencent.mm.hellhoundlib.a.a.a(false, this, "com/tencent/mm/ui/base/MMTagPanel$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        AppMethodBeat.o(142175);
        return false;
      }
    });
    AppMethodBeat.o(142189);
  }
  
  public final void a(TextView paramTextView, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(142207);
    paramTextView.setTextSize(0, getContext().getResources().getDimension(2131165466) * com.tencent.mm.cb.a.ef(getContext()));
    if (paramBoolean2)
    {
      paramTextView.setBackgroundResource(this.JIr);
      paramTextView.setTextColor(getResources().getColor(this.JIs));
      paramTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, this.JIp, 0);
      AppMethodBeat.o(142207);
      return;
    }
    if (paramBoolean1)
    {
      paramTextView.setTag(Integer.valueOf(1));
      paramTextView.setBackgroundResource(this.vdE);
      paramTextView.setTextColor(getResources().getColor(this.vdF));
      paramTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      AppMethodBeat.o(142207);
      return;
    }
    paramTextView.setTag(Integer.valueOf(0));
    paramTextView.setBackgroundResource(this.rHR);
    paramTextView.setTextColor(getResources().getColor(this.rHQ));
    paramTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    AppMethodBeat.o(142207);
  }
  
  protected final void a(MMTagPanel.d paramd, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(142205);
    paramd.JIL = paramString;
    paramd.JIM.setText(com.tencent.mm.ui.f.c.b.h(getContext(), paramString, this.JIw));
    TextView localTextView = paramd.JIM;
    if (this.JIk) {}
    for (paramString = this.JIA;; paramString = null)
    {
      localTextView.setOnClickListener(paramString);
      a(paramd.JIM, paramBoolean, false);
      AppMethodBeat.o(142205);
      return;
    }
  }
  
  public final void a(Collection<String> paramCollection, List<String> paramList)
  {
    AppMethodBeat.i(142202);
    fCU();
    if (this.JIl) {
      addView(this.JIx);
    }
    if ((paramList == null) || (paramList.isEmpty()))
    {
      AppMethodBeat.o(142202);
      return;
    }
    paramList = paramList.iterator();
    if (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (paramCollection == null) {}
      for (boolean bool = false;; bool = paramCollection.contains(str))
      {
        cR(str, bool);
        break;
      }
    }
    AppMethodBeat.o(142202);
  }
  
  public final void cR(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(142208);
    if (bu.isNullOrNil(paramString))
    {
      ae.w("MicroMsg.MMTagPanel", "want to add tag, but it is null or empty");
      AppMethodBeat.o(142208);
      return;
    }
    paramString = paramString.trim();
    ae.d("MicroMsg.MMTagPanel", "want to add tag %s, do remove tag first", new Object[] { paramString });
    removeTag(paramString);
    Object localObject = this.uda.iterator();
    while (((Iterator)localObject).hasNext()) {
      if (paramString.equals(((MMTagPanel.d)((Iterator)localObject).next()).JIL))
      {
        ae.w("MicroMsg.MMTagPanel", "want to add tag %s, but it exsited!", new Object[] { paramString });
        AppMethodBeat.o(142208);
        return;
      }
    }
    localObject = fDe();
    a((MMTagPanel.d)localObject, paramString, paramBoolean);
    this.uda.add(localObject);
    if (this.JIl) {
      addView(((MMTagPanel.d)localObject).JIM, getChildCount() - 1);
    }
    for (;;)
    {
      fDf();
      AppMethodBeat.o(142208);
      return;
      addView(((MMTagPanel.d)localObject).JIM);
    }
  }
  
  public final void cS(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(142211);
    if (bu.isNullOrNil(paramString))
    {
      ae.w("MicroMsg.MMTagPanel", "want to update tag status, but it is null or empty");
      AppMethodBeat.o(142211);
      return;
    }
    Iterator localIterator = this.uda.iterator();
    while (localIterator.hasNext())
    {
      MMTagPanel.d locald = (MMTagPanel.d)localIterator.next();
      if (paramString.equals(locald.JIL))
      {
        a(locald, paramString, paramBoolean);
        fDf();
        AppMethodBeat.o(142211);
        return;
      }
    }
    ae.w("MicroMsg.MMTagPanel", "want to update tag %s status, but it not exsited!", new Object[] { paramString });
    AppMethodBeat.o(142211);
  }
  
  protected void cyQ() {}
  
  public void fCU()
  {
    AppMethodBeat.i(142201);
    this.uda.clear();
    removeAllViews();
    Iterator localIterator = this.uda.iterator();
    while (localIterator.hasNext()) {
      a((MMTagPanel.d)localIterator.next());
    }
    AppMethodBeat.o(142201);
  }
  
  public final void fDb()
  {
    AppMethodBeat.i(142194);
    if (this.JIy != null) {
      this.JIy.setText("");
    }
    AppMethodBeat.o(142194);
  }
  
  public final void fDc()
  {
    AppMethodBeat.i(142195);
    if ((this.JIy == null) || (this.JIy.isFocused()))
    {
      AppMethodBeat.o(142195);
      return;
    }
    this.JIy.requestFocus();
    AppMethodBeat.o(142195);
  }
  
  public final void fDd()
  {
    AppMethodBeat.i(142196);
    if ((this.JIy != null) && (this.JIy.isFocused()))
    {
      ae.d("MicroMsg.MMTagPanel", "do clear edit focus");
      InputMethodManager localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
      if (localInputMethodManager == null)
      {
        AppMethodBeat.o(142196);
        return;
      }
      IBinder localIBinder = this.JIy.getWindowToken();
      if (localIBinder == null)
      {
        AppMethodBeat.o(142196);
        return;
      }
      localInputMethodManager.hideSoftInputFromWindow(localIBinder, 0);
      this.JIy.clearFocus();
    }
    AppMethodBeat.o(142196);
  }
  
  protected final MMTagPanel.d fDe()
  {
    AppMethodBeat.i(142203);
    if (!this.JIu.isEmpty())
    {
      localObject = (MMTagPanel.d)this.JIu.removeFirst();
      AppMethodBeat.o(142203);
      return localObject;
    }
    MMTagPanel.d locald = new MMTagPanel.d();
    TextView localTextView = new TextView(getContext());
    localTextView.setBackgroundResource(this.rHR);
    localTextView.setTextColor(getResources().getColor(this.rHQ));
    localTextView.setTag(Integer.valueOf(0));
    localTextView.setGravity(17);
    localTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, this.JIp, 0);
    if (this.JIk) {}
    for (Object localObject = this.JIA;; localObject = null)
    {
      localTextView.setOnClickListener((View.OnClickListener)localObject);
      localTextView.setEllipsize(TextUtils.TruncateAt.END);
      localTextView.setSingleLine();
      locald.JIM = localTextView;
      AppMethodBeat.o(142203);
      return locald;
    }
  }
  
  protected final void fDf()
  {
    AppMethodBeat.i(142206);
    if (this.JIy != null)
    {
      ae.d("MicroMsg.MMTagPanel", "do clear high light info, edittext is focus %B", new Object[] { Boolean.valueOf(this.JIy.isFocused()) });
      this.JIy.setCursorVisible(true);
    }
    if (this.JIt == null)
    {
      AppMethodBeat.o(142206);
      return;
    }
    TextView localTextView = this.JIt.JIM;
    if (((Integer)this.JIt.JIM.getTag()).intValue() == 1) {}
    for (boolean bool = true;; bool = false)
    {
      a(localTextView, bool, false);
      this.JIt = null;
      AppMethodBeat.o(142206);
      return;
    }
  }
  
  public final void fDg()
  {
    AppMethodBeat.i(142210);
    Iterator localIterator = this.uda.iterator();
    while (localIterator.hasNext())
    {
      MMTagPanel.d locald = (MMTagPanel.d)localIterator.next();
      removeView(locald.JIM);
      a(locald);
    }
    this.uda.clear();
    fDf();
    AppMethodBeat.o(142210);
  }
  
  public String getEditText()
  {
    AppMethodBeat.i(142193);
    if (this.JIy != null)
    {
      String str = this.JIy.getText().toString();
      AppMethodBeat.o(142193);
      return str;
    }
    AppMethodBeat.o(142193);
    return "";
  }
  
  public int getTagCount()
  {
    AppMethodBeat.i(142200);
    int i = this.uda.size();
    AppMethodBeat.o(142200);
    return i;
  }
  
  public ArrayList<String> getTagList()
  {
    AppMethodBeat.i(142199);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.uda.iterator();
    while (localIterator.hasNext())
    {
      MMTagPanel.d locald = (MMTagPanel.d)localIterator.next();
      if (!bu.isNullOrNil(locald.JIL)) {
        localArrayList.add(locald.JIL);
      }
    }
    AppMethodBeat.o(142199);
    return localArrayList;
  }
  
  public Set<String> getTagSet()
  {
    AppMethodBeat.i(142198);
    TreeSet localTreeSet = new TreeSet();
    Iterator localIterator = this.uda.iterator();
    while (localIterator.hasNext())
    {
      MMTagPanel.d locald = (MMTagPanel.d)localIterator.next();
      if (!bu.isNullOrNil(locald.JIL)) {
        localTreeSet.add(locald.JIL);
      }
    }
    AppMethodBeat.o(142198);
    return localTreeSet;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(142212);
    if (this.mClickable)
    {
      boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(142212);
      return bool;
    }
    AppMethodBeat.o(142212);
    return true;
  }
  
  public final void removeTag(String paramString)
  {
    AppMethodBeat.i(142209);
    if (bu.isNullOrNil(paramString))
    {
      ae.w("MicroMsg.MMTagPanel", "want to remove tag, but it is null or empty");
      AppMethodBeat.o(142209);
      return;
    }
    Iterator localIterator = this.uda.iterator();
    while (localIterator.hasNext())
    {
      MMTagPanel.d locald = (MMTagPanel.d)localIterator.next();
      if (paramString.equals(locald.JIL))
      {
        this.uda.remove(locald);
        removeView(locald.JIM);
        a(locald);
        fDf();
        AppMethodBeat.o(142209);
        return;
      }
    }
    ae.w("MicroMsg.MMTagPanel", "want to remove tag %s, but it not exsited!", new Object[] { paramString });
    AppMethodBeat.o(142209);
  }
  
  public void setCallBack(a parama)
  {
    this.JIv = parama;
  }
  
  public void setEditHint(String paramString)
  {
    AppMethodBeat.i(142192);
    if (this.JIy != null) {
      this.JIy.setHint(paramString);
    }
    AppMethodBeat.o(142192);
  }
  
  public void setEditTextColor(int paramInt)
  {
    AppMethodBeat.i(142191);
    if (this.JIy != null) {
      this.JIy.setTextColor(paramInt);
    }
    AppMethodBeat.o(142191);
  }
  
  public void setEditTextHit(boolean paramBoolean)
  {
    AppMethodBeat.i(142213);
    if (this.JIy != null)
    {
      if (paramBoolean)
      {
        this.JIy.setHint(2131755158);
        AppMethodBeat.o(142213);
        return;
      }
      this.JIy.setHint("");
    }
    AppMethodBeat.o(142213);
  }
  
  public void setIsAllowEnterCharacter(boolean paramBoolean)
  {
    this.JIz = paramBoolean;
  }
  
  public void setPanelClickable(boolean paramBoolean)
  {
    this.mClickable = paramBoolean;
  }
  
  public void setTagEditTextBG(int paramInt)
  {
    AppMethodBeat.i(142190);
    this.JIq = paramInt;
    if (this.JIy != null)
    {
      com.tencent.mm.cb.a.fromDPToPix(getContext(), 6);
      getResources().getDimensionPixelSize(2131165516);
      this.JIy.setBackgroundResource(this.JIq);
    }
    AppMethodBeat.o(142190);
  }
  
  public void setTagHighlineBG(int paramInt)
  {
    this.JIr = paramInt;
  }
  
  public void setTagNormalBG(int paramInt)
  {
    this.rHR = paramInt;
  }
  
  public void setTagNormalTextColorRes(int paramInt)
  {
    this.rHQ = paramInt;
  }
  
  public void setTagSelectedBG(int paramInt)
  {
    this.vdE = paramInt;
  }
  
  public void setTagSelectedTextColorRes(int paramInt)
  {
    this.vdF = paramInt;
  }
  
  public void setTagTipsDrawable(int paramInt)
  {
    this.JIp = paramInt;
  }
  
  public void setTaghighlineTextColorRes(int paramInt)
  {
    this.JIs = paramInt;
  }
  
  public final void xK(boolean paramBoolean)
  {
    AppMethodBeat.i(142197);
    if (paramBoolean == this.JIl)
    {
      AppMethodBeat.o(142197);
      return;
    }
    this.JIl = paramBoolean;
    removeView(this.JIx);
    if (this.JIl)
    {
      addView(this.JIx);
      fDd();
    }
    AppMethodBeat.o(142197);
  }
  
  public static abstract interface a
  {
    public abstract void D(boolean paramBoolean, int paramInt);
    
    public abstract void acT(String paramString);
    
    public abstract void acU(String paramString);
    
    public abstract void acV(String paramString);
    
    public abstract void acW(String paramString);
    
    public abstract void acX(String paramString);
    
    public abstract void cki();
  }
  
  public final class b
    implements InputFilter
  {
    List<String> JIE;
    int mark;
    
    public b()
    {
      AppMethodBeat.i(142183);
      this.JIE = new LinkedList();
      AppMethodBeat.o(142183);
    }
    
    public final CharSequence filter(final CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
    {
      AppMethodBeat.i(142184);
      ae.d("MicroMsg.MMTagPanel", "on create tag filter, %s [%d, %d) %s [%d, %d), maxlength[%B]", new Object[] { paramCharSequence, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramSpanned, Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Boolean.valueOf(MMTagPanel.i(MMTagPanel.this)) });
      this.mark = -1;
      this.JIE.clear();
      Object localObject = new char[paramInt2 - paramInt1];
      TextUtils.getChars(paramCharSequence, paramInt1, paramInt2, (char[])localObject, 0);
      if (!MMTagPanel.j(MMTagPanel.this))
      {
        i = 0;
        paramCharSequence = new StringBuilder();
        if (paramInt1 < paramInt2)
        {
          if (localObject[paramInt1] == '\n') {
            i = 1;
          }
          for (;;)
          {
            paramInt1 += 1;
            break;
            paramCharSequence.append(localObject[paramInt1]);
          }
        }
        if (i != 0)
        {
          localObject = paramCharSequence.toString();
          paramCharSequence.insert(0, paramSpanned.subSequence(0, paramInt3));
          paramCharSequence.append(paramSpanned.subSequence(paramInt4, paramSpanned.length()));
          MMTagPanel.this.post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(142180);
              MMTagPanel.e(MMTagPanel.this).acX(paramCharSequence.toString());
              AppMethodBeat.o(142180);
            }
          });
          AppMethodBeat.o(142184);
          return localObject;
        }
        AppMethodBeat.o(142184);
        return null;
      }
      int i = paramInt1;
      if (i < paramInt2)
      {
        if ((localObject[i] == '\n') || (localObject[i] == ',') || (localObject[i] == ';') || (localObject[i] == '、') || (localObject[i] == 65292) || (localObject[i] == 65307))
        {
          if (-1 != this.mark) {
            break label385;
          }
          this.JIE.add((paramSpanned.subSequence(0, paramInt3).toString() + paramCharSequence.subSequence(paramInt1, i)).trim());
        }
        for (;;)
        {
          this.mark = (i + 1);
          i += 1;
          break;
          label385:
          this.JIE.add(paramCharSequence.subSequence(this.mark, i).toString().trim());
        }
      }
      if (MMTagPanel.h(MMTagPanel.this))
      {
        paramInt1 = f.aYK(paramSpanned.toString());
        if ((MMTagPanel.i(MMTagPanel.this)) && (paramCharSequence.equals("\n")) && (36 < paramInt1)) {
          this.JIE.clear();
        }
      }
      if (this.JIE.isEmpty())
      {
        AppMethodBeat.o(142184);
        return null;
      }
      if (MMTagPanel.e(MMTagPanel.this) != null)
      {
        localObject = this.JIE.iterator();
        while (((Iterator)localObject).hasNext())
        {
          final String str = (String)((Iterator)localObject).next();
          if (str.length() > 0) {
            MMTagPanel.this.post(new Runnable()
            {
              public final void run()
              {
                AppMethodBeat.i(142181);
                MMTagPanel.e(MMTagPanel.this).acX(str.trim());
                AppMethodBeat.o(142181);
              }
            });
          }
        }
      }
      if (this.mark >= paramInt2) {
        paramSpanned.length();
      }
      for (paramCharSequence = paramSpanned.subSequence(paramInt4, paramSpanned.length()).toString();; paramCharSequence = paramCharSequence.subSequence(this.mark, paramInt2).toString() + paramSpanned.subSequence(paramInt4, paramSpanned.length()))
      {
        MMTagPanel.this.post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(142182);
            MMTagPanel.a(MMTagPanel.this).setText("");
            MMTagPanel.a(MMTagPanel.this).append(paramCharSequence);
            AppMethodBeat.o(142182);
          }
        });
        AppMethodBeat.o(142184);
        return "";
      }
    }
  }
  
  public final class c
    implements InputFilter
  {
    int JIH = 36;
    private int JII = 256;
    private int JIJ;
    
    public c() {}
    
    public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
    {
      AppMethodBeat.i(142186);
      paramInt1 = f.aYK(paramSpanned.toString()) + f.aYK(paramCharSequence.toString());
      if (paramInt4 > paramInt3) {
        if (paramInt1 - (paramInt4 - paramInt3) > this.JIH)
        {
          MMTagPanel.a(MMTagPanel.this, true);
          this.JIJ = (paramInt1 - (paramInt4 - paramInt3) - this.JIH);
        }
      }
      for (;;)
      {
        if ((MMTagPanel.h(MMTagPanel.this)) && (1 == this.JIJ) && (paramCharSequence.equals("\n"))) {
          this.JIJ = 0;
        }
        if (MMTagPanel.e(MMTagPanel.this) != null) {
          MMTagPanel.this.post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(142185);
              MMTagPanel.e(MMTagPanel.this).D(MMTagPanel.i(MMTagPanel.this), f.cU(MMTagPanel.c.a(MMTagPanel.c.this), ""));
              AppMethodBeat.o(142185);
            }
          });
        }
        if (paramInt1 <= this.JII) {
          break;
        }
        AppMethodBeat.o(142186);
        return "";
        MMTagPanel.a(MMTagPanel.this, false);
        continue;
        if (paramInt1 > this.JIH)
        {
          MMTagPanel.a(MMTagPanel.this, true);
          this.JIJ = (paramInt1 - this.JIH);
        }
        else
        {
          MMTagPanel.a(MMTagPanel.this, false);
        }
      }
      AppMethodBeat.o(142186);
      return paramCharSequence;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mm\classes7.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMTagPanel
 * JD-Core Version:    0.7.0.1
 */
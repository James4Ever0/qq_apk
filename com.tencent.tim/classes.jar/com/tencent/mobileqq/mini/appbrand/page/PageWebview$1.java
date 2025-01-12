package com.tencent.mobileqq.mini.appbrand.page;

import Override;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.mini.appbrand.AppBrandRuntime;
import com.tencent.qphone.base.util.QLog;
import com.tencent.qqlive.module.videoreport.inject.webview.jsbridge.JsBridgeController;
import com.tencent.qqlive.module.videoreport.inject.webview.jsinject.JsInjector;
import com.tencent.smtt.export.external.interfaces.ConsoleMessage;
import com.tencent.smtt.export.external.interfaces.ConsoleMessage.MessageLevel;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.CustomViewCallback;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebView;

class PageWebview$1
  extends WebChromeClient
{
  PageWebview$1(PageWebview paramPageWebview) {}
  
  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    if (paramConsoleMessage != null)
    {
      if (paramConsoleMessage.messageLevel() != ConsoleMessage.MessageLevel.ERROR) {
        break label96;
      }
      QLog.e("miniapp-chromium", 1, "PageWebView: " + paramConsoleMessage.message() + " line:" + paramConsoleMessage.lineNumber() + "  page:" + this.this$0.mRouteUrl + "  pagewebid:" + this.this$0.pageWebviewId);
    }
    for (;;)
    {
      return super.onConsoleMessage(paramConsoleMessage);
      label96:
      if (paramConsoleMessage.messageLevel() == ConsoleMessage.MessageLevel.WARNING) {
        QLog.w("miniapp-chromium", 1, "PageWebView: " + paramConsoleMessage.message() + " line:" + paramConsoleMessage.lineNumber() + "  page:" + this.this$0.mRouteUrl + "  pagewebid:" + this.this$0.pageWebviewId);
      } else {
        QLog.i("miniapp-chromium", 2, "PageWebView: " + paramConsoleMessage.message() + "  pagewebid:" + this.this$0.pageWebviewId);
      }
    }
  }
  
  public void onHideCustomView()
  {
    QLog.d("miniapp-embedded", 2, "onHideCustomView " + Thread.currentThread());
    if (this.this$0.customViewCallback == null) {
      return;
    }
    QLog.d("miniapp-embedded", 1, "onHideCustomView begin");
    this.this$0.customContainer.setVisibility(8);
    this.this$0.customViewCallback.onCustomViewHidden();
    try
    {
      this.this$0.customContainer.removeAllViews();
      label80:
      this.this$0.customContainer = null;
      this.this$0.mFullscreenView = null;
      this.this$0.customViewCallback = null;
      QLog.d("miniapp-embedded", 1, "onHideCustomView end");
      return;
    }
    catch (Exception localException)
    {
      break label80;
    }
  }
  
  @Override
  public boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    if (JsBridgeController.getInstance().shouldIntercept(paramWebView, paramString2, paramString1, paramJsPromptResult)) {
      return true;
    }
    return super.onJsPrompt(paramWebView, paramString1, paramString2, paramString3, paramJsPromptResult);
  }
  
  @Override
  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    JsInjector.getInstance().onProgressChanged(paramWebView, paramInt);
    super.onProgressChanged(paramWebView, paramInt);
  }
  
  public void onShowCustomView(View paramView, IX5WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    QLog.d("miniapp-embedded", 2, "onShowCustomView ： " + paramView + "; " + Thread.currentThread());
    if (this.this$0.customViewCallback != null)
    {
      paramCustomViewCallback.onCustomViewHidden();
      return;
    }
    QLog.d("miniapp-embedded", 1, "onShowCustomView begin");
    if (this.this$0.customContainer == null)
    {
      this.this$0.customContainer = new FrameLayout(BaseApplicationImpl.getApplication());
      this.this$0.customContainer.setBackgroundColor(-16777216);
      ((ViewGroup)this.this$0.appBrandRuntime.activity.getWindow().getDecorView()).addView(this.this$0.customContainer, new ViewGroup.LayoutParams(-1, -1));
    }
    this.this$0.customContainer.addView(paramView);
    this.this$0.mFullscreenView = paramView;
    this.this$0.customViewCallback = paramCustomViewCallback;
    this.this$0.isFullScreen = true;
    this.this$0.customContainer.setVisibility(0);
    QLog.d("miniapp-embedded", 1, "onShowCustomView end");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.tim\classes9.jar
 * Qualified Name:     com.tencent.mobileqq.mini.appbrand.page.PageWebview.1
 * JD-Core Version:    0.7.0.1
 */
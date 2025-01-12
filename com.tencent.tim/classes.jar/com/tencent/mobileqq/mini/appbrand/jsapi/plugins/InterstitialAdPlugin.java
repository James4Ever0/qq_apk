package com.tencent.mobileqq.mini.appbrand.jsapi.plugins;

import NS_MINI_AD.MiniAppAd.StGetAdReq;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.gdtad.aditem.GdtAd;
import com.tencent.gdtad.aditem.GdtHandler.Options;
import com.tencent.mobileqq.mini.apkg.ApkgInfo;
import com.tencent.mobileqq.mini.apkg.MiniAppConfig;
import com.tencent.mobileqq.mini.apkg.MiniAppInfo;
import com.tencent.mobileqq.mini.appbrand.BaseAppBrandRuntime;
import com.tencent.mobileqq.mini.appbrand.jsapi.AdFrequencyLimit;
import com.tencent.mobileqq.mini.appbrand.jsapi.PluginConst.AdConst;
import com.tencent.mobileqq.mini.appbrand.utils.AppBrandTask;
import com.tencent.mobileqq.mini.reuse.MiniAppCmdUtil;
import com.tencent.mobileqq.mini.sdk.LaunchParam;
import com.tencent.mobileqq.mini.util.AdUtils;
import com.tencent.mobileqq.mini.util.ApiUtil;
import com.tencent.mobileqq.mini.webview.JsRuntime;
import com.tencent.mobileqq.minigame.ui.GameActivity;
import com.tencent.qphone.base.util.QLog;
import common.config.service.QzoneConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import mqq.app.AppRuntime;
import org.json.JSONObject;
import tencent.gdt.qq_ad_get.QQAdGetRsp.AdInfo;
import thm;
import tkv;

public class InterstitialAdPlugin
  extends BaseJsPlugin
{
  public static final String API_OPERATE_DESTROY = "destroy";
  public static final String API_OPERATE_INTERSTITIAL_AD = "operateInterstitialAd";
  public static final String API_OPERATE_LOAD = "load";
  public static final String API_OPERATE_SHOW = "show";
  private static final String ERRCODE = "errCode";
  private static final String ERRMSG = "errMsg";
  public static final String EVENT_INTERSTITIAL_CLOSE = "onInterstitialAdClose";
  public static final HashMap<Integer, String> S_CodeMsg_Map = PluginConst.AdConst.CodeMsgMap;
  private static final Set<String> S_EVENT_MAP = new InterstitialAdPlugin.1();
  private static final String TAG = "[minigame] InterstitialAdPlugin";
  private Map<Integer, MiniInterstitialAd> mInterstitialMap = new HashMap();
  
  MiniInterstitialAd getMiniInterstitialAd(int paramInt, String paramString, BaseJsPluginEngine paramBaseJsPluginEngine, JsRuntime paramJsRuntime)
  {
    if (this.mInterstitialMap.containsKey(Integer.valueOf(paramInt))) {
      return (MiniInterstitialAd)this.mInterstitialMap.get(Integer.valueOf(paramInt));
    }
    paramString = new MiniInterstitialAd(paramInt, paramString, paramBaseJsPluginEngine, paramJsRuntime);
    this.mInterstitialMap.put(Integer.valueOf(paramInt), paramString);
    return paramString;
  }
  
  public String handleNativeRequest(String paramString1, String paramString2, JsRuntime paramJsRuntime, int paramInt)
  {
    QLog.i("[minigame] InterstitialAdPlugin", 1, "handleNativeRequest jsonParams : " + paramString2 + " event:" + paramString1);
    if ("operateInterstitialAd".equals(paramString1)) {}
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString2);
      int j = localJSONObject.optInt("id", -1);
      Object localObject = localJSONObject.optString("adUnitId", null);
      if (!MiniInterstitialAd.isAdUnitIdValid((String)localObject))
      {
        paramString2 = ApiUtil.wrapCallbackFail(paramString1, localJSONObject, PluginConst.AdConst.ERROR_MSG_INVALID_ADUNITID);
        paramString2.put("errCode", 1002);
        paramString2 = paramString2.toString();
        paramJsRuntime.evaluateCallbackJs(paramInt, paramString2);
        return paramString2;
      }
      localObject = getMiniInterstitialAd(j, (String)localObject, this.jsPluginEngine, paramJsRuntime);
      String str = localJSONObject.optString("type");
      int i = localJSONObject.optInt("compId", -1);
      if ("load".equals(str)) {
        if (!((MiniInterstitialAd)localObject).load(i, paramInt))
        {
          localJSONObject = ApiUtil.wrapCallbackFail(paramString1, localJSONObject, PluginConst.AdConst.ERROR_MSG_INNER_ERROR);
          localJSONObject.put("errCode", 1003);
          paramJsRuntime.evaluateCallbackJs(paramInt, localJSONObject.toString());
        }
      }
      for (;;)
      {
        return super.handleNativeRequest(paramString1, paramString2, paramJsRuntime, paramInt);
        if ("show".equals(str))
        {
          j = AdFrequencyLimit.canShowInterstitialAdNow();
          if (j != 0)
          {
            paramString2 = ApiUtil.wrapCallbackFail(paramString1, localJSONObject, PluginConst.AdConst.ERROR_MSG_INNER_ERROR);
            paramString2.put("errCode", j);
            paramJsRuntime.evaluateCallbackJs(paramInt, paramString2.toString());
            QLog.i("[minigame] InterstitialAdPlugin", 1, "show error, code = " + j);
            return paramString2.toString();
          }
          if (((MiniInterstitialAd)localObject).show(i, paramInt)) {
            continue;
          }
          localJSONObject = ApiUtil.wrapCallbackFail(paramString1, localJSONObject, PluginConst.AdConst.ERROR_MSG_INNER_ERROR);
          localJSONObject.put("errCode", 1003);
          paramJsRuntime.evaluateCallbackJs(paramInt, localJSONObject.toString());
          continue;
        }
        try
        {
          paramString1.put("errCode", 1003);
          paramJsRuntime.evaluateCallbackJs(paramInt, paramString1.toString());
          return paramString1.toString();
          if (!"destroy".equals(str)) {
            continue;
          }
          if (((MiniInterstitialAd)localObject).destroy()) {}
          for (localJSONObject = ApiUtil.wrapCallbackOk(paramString1, localJSONObject);; localJSONObject = ApiUtil.wrapCallbackFail(paramString1, localJSONObject, PluginConst.AdConst.ERROR_MSG_INNER_ERROR).put("errCode", 1003).put("errMsg", PluginConst.AdConst.ERROR_MSG_INNER_ERROR))
          {
            paramJsRuntime.evaluateCallbackJs(paramInt, localJSONObject.toString());
            this.mInterstitialMap.remove(Integer.valueOf(j));
            break;
          }
        }
        catch (Throwable paramString2)
        {
          break label391;
        }
      }
    }
    catch (Throwable paramString2)
    {
      QLog.e("[minigame] InterstitialAdPlugin", 1, "operateInterstitialAdfailed e:", paramString2);
      paramString1 = ApiUtil.wrapCallbackFail(paramString1, null, PluginConst.AdConst.ERROR_MSG_INNER_ERROR);
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    Iterator localIterator = this.mInterstitialMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      MiniInterstitialAd localMiniInterstitialAd = (MiniInterstitialAd)((Map.Entry)localIterator.next()).getValue();
      if (localMiniInterstitialAd != null) {
        localMiniInterstitialAd.destroy();
      }
    }
  }
  
  public Set<String> supportedEvents()
  {
    return S_EVENT_MAP;
  }
  
  static class MiniInterstitialAd
  {
    private static final String ADUNIT_ID = "adUnitId";
    private static final String APP_Interstitial_ID = "id";
    private static final String COMP_ID = "compId";
    private static final String OPERATION_TYPE = "type";
    private static final String TAG = "[minigame] MiniInterstitialAd";
    private thm adInterstitial;
    private String adUnitId;
    private int appInterstitialId;
    private BaseJsPluginEngine jsPluginEngine;
    private JsRuntime jsRuntime;
    private volatile boolean mIsRequestingAd;
    
    MiniInterstitialAd(int paramInt, String paramString, BaseJsPluginEngine paramBaseJsPluginEngine, JsRuntime paramJsRuntime)
    {
      this.appInterstitialId = paramInt;
      this.adUnitId = paramString;
      this.jsPluginEngine = paramBaseJsPluginEngine;
      this.jsRuntime = paramJsRuntime;
    }
    
    private void callbackJs(boolean paramBoolean, String paramString, int paramInt1, int paramInt2, int paramInt3)
    {
      if (this.jsRuntime != null) {
        if (!paramBoolean) {
          break label76;
        }
      }
      label76:
      for (paramString = ApiUtil.wrapCallbackOk(paramString, getResultObj(paramInt1, paramInt2));; paramString = ApiUtil.wrapCallbackFail(paramString, getResultObj(paramInt1, paramInt2), (String)InterstitialAdPlugin.S_CodeMsg_Map.get(Integer.valueOf(paramInt2))))
      {
        paramString = paramString.toString();
        QLog.i("[minigame] MiniInterstitialAd", 1, "evaluateCallbackJs callbackId: " + paramInt3 + " content:" + paramString);
        this.jsRuntime.evaluateCallbackJs(paramInt3, paramString);
        return;
      }
    }
    
    private MiniAppAd.StGetAdReq generateAdReq()
    {
      if ((this.jsPluginEngine == null) || (this.jsPluginEngine.appBrandRuntime == null)) {
        return null;
      }
      String str3 = BaseApplicationImpl.getApplication().getRuntime().getAccount();
      Object localObject1 = null;
      if ((this.jsPluginEngine.activityContext instanceof GameActivity)) {
        localObject1 = ((GameActivity)this.jsPluginEngine.activityContext).getMiniGameAppId();
      }
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = localObject1;
        if (this.jsPluginEngine.appBrandRuntime != null) {
          localObject2 = this.jsPluginEngine.appBrandRuntime.appId;
        }
      }
      if (TextUtils.isEmpty((CharSequence)localObject2))
      {
        QLog.e("[minigame] MiniInterstitialAd", 1, "TextUtils.isEmpty(appid)");
        return null;
      }
      boolean bool;
      int i;
      label150:
      ApkgInfo localApkgInfo;
      if ((this.jsPluginEngine.activityContext instanceof GameActivity))
      {
        bool = ((GameActivity)this.jsPluginEngine.activityContext).getIsOrientationLandscape();
        if (!bool) {
          break label538;
        }
        i = 90;
        QLog.i("[minigame] MiniInterstitialAd", 1, "handle initAdParam appId = " + (String)localObject2 + "， deviceOrient = " + i);
        localApkgInfo = this.jsPluginEngine.appBrandRuntime.getApkgInfo();
        if ((localApkgInfo == null) || (!localApkgInfo.isEngineTypeMiniApp())) {
          break label543;
        }
        j = 0;
        label212:
        if (j != 0) {
          break label548;
        }
      }
      label538:
      label543:
      label548:
      for (int j = 10;; j = 11)
      {
        Object localObject3 = "";
        Object localObject5 = "";
        String str2 = "";
        String str1 = "";
        localObject1 = localObject3;
        if (localApkgInfo != null)
        {
          localObject1 = localObject3;
          if (localApkgInfo.appConfig != null)
          {
            localObject1 = localObject3;
            if (localApkgInfo.appConfig.launchParam != null)
            {
              localObject1 = localObject3;
              if (localApkgInfo.appConfig.launchParam.entryPath != null) {
                localObject1 = localApkgInfo.appConfig.launchParam.entryPath;
              }
            }
          }
        }
        Object localObject4 = localObject5;
        localObject3 = str2;
        if (localApkgInfo != null)
        {
          localObject4 = localObject5;
          localObject3 = str2;
          if (localApkgInfo.appConfig != null)
          {
            localObject4 = localObject5;
            localObject3 = str2;
            if (localApkgInfo.appConfig.launchParam != null)
            {
              localObject4 = localApkgInfo.appConfig.launchParam.reportData;
              localObject3 = String.valueOf(localApkgInfo.appConfig.launchParam.scene);
            }
          }
        }
        localObject5 = str1;
        if (localApkgInfo != null)
        {
          localObject5 = str1;
          if (localApkgInfo.appConfig != null)
          {
            localObject5 = str1;
            if (localApkgInfo.appConfig.config != null) {
              localObject5 = localApkgInfo.appConfig.config.via;
            }
          }
        }
        str1 = AdUtils.getSpAdGdtCookie(j);
        int k = QzoneConfig.getInstance().getConfig("QZoneSetting", "MiniGameShareRate", 53);
        localObject1 = AdUtils.createAdRequest(this.jsPluginEngine.activityContext, Long.parseLong(str3), this.adUnitId, (String)localObject2, k, j, i, str1, (String)localObject1, (String)localObject4, (String)localObject3, (String)localObject5, 1);
        QLog.i("[minigame] MiniInterstitialAd", 1, "generateAdReq account= " + str3 + " adUnitId=" + this.adUnitId);
        return localObject1;
        bool = isOrientationLandscape();
        break;
        i = 0;
        break label150;
        j = 1;
        break label212;
      }
    }
    
    private GdtHandler.Options getClickOption(JSONObject paramJSONObject)
    {
      Object localObject = (qq_ad_get.QQAdGetRsp.AdInfo)qq_ad_get.QQAdGetRsp.AdInfo.class.cast(tkv.pbFromJson(new qq_ad_get.QQAdGetRsp.AdInfo(), paramJSONObject));
      paramJSONObject = new GdtHandler.Options();
      paramJSONObject.ad = new GdtAd((qq_ad_get.QQAdGetRsp.AdInfo)localObject);
      paramJSONObject.reportForClick = true;
      paramJSONObject.aOV = true;
      localObject = new Bundle();
      ((Bundle)localObject).putString("big_brother_ref_source_key", "biz_src_miniapp");
      paramJSONObject.extra = ((Bundle)localObject);
      return paramJSONObject;
    }
    
    private JSONObject getResultObj(int paramInt1, int paramInt2)
    {
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("id", this.appInterstitialId);
        localJSONObject.put("compId", paramInt1);
        localJSONObject.put("adUnitId", this.adUnitId);
        localJSONObject.put("errCode", paramInt2);
        return localJSONObject;
      }
      catch (Throwable localThrowable)
      {
        localThrowable = localThrowable;
        QLog.e("[minigame] MiniInterstitialAd", 2, "getResultObj e:", localThrowable);
        return localJSONObject;
      }
      finally {}
      return localJSONObject;
    }
    
    private boolean initAdParam(int paramInt1, int paramInt2)
    {
      MiniAppAd.StGetAdReq localStGetAdReq = generateAdReq();
      if (localStGetAdReq == null) {
        return false;
      }
      getInterstitialADInfo(this.jsPluginEngine.activityContext, localStGetAdReq, paramInt1, paramInt2);
      return true;
    }
    
    static boolean isAdUnitIdValid(String paramString)
    {
      return !TextUtils.isEmpty(paramString);
    }
    
    private boolean isOrientationLandscape()
    {
      Resources localResources = BaseApplicationImpl.getApplication().getResources();
      return (localResources != null) && (localResources.getConfiguration().orientation == 2);
    }
    
    private void saveAdCookie(String paramString, int paramInt)
    {
      try
      {
        Object localObject = new JSONObject(paramString);
        if (((JSONObject)localObject).has("gdt_cookie"))
        {
          localObject = ((JSONObject)localObject).getString("gdt_cookie");
          if (TextUtils.isEmpty((CharSequence)localObject)) {
            return;
          }
          AdUtils.putSpAdGdtCookie(paramInt, (String)localObject);
          QLog.i("[minigame] MiniInterstitialAd", 2, "parseAndSaveCookie save key success, adType = " + paramInt + ", value = " + (String)localObject);
          return;
        }
      }
      catch (Exception localException)
      {
        QLog.i("[minigame] MiniInterstitialAd", 2, "parseAndSaveCookie error" + paramString, localException);
      }
    }
    
    boolean destroy()
    {
      if (this.adInterstitial != null) {
        this.adInterstitial = null;
      }
      return true;
    }
    
    public void getInterstitialADInfo(Activity paramActivity, MiniAppAd.StGetAdReq paramStGetAdReq, int paramInt1, int paramInt2)
    {
      MiniAppCmdUtil.getInstance().getRewardedVideoADInfo(paramStGetAdReq, new InterstitialAdPlugin.MiniInterstitialAd.2(this, paramInt1, paramInt2, paramActivity, paramStGetAdReq));
    }
    
    boolean load(int paramInt1, int paramInt2)
    {
      boolean bool = true;
      if (!this.mIsRequestingAd)
      {
        this.mIsRequestingAd = true;
        bool = initAdParam(paramInt1, paramInt2);
      }
      return bool;
    }
    
    boolean show(int paramInt1, int paramInt2)
    {
      if (this.adInterstitial == null)
      {
        if (QLog.isColorLevel()) {
          QLog.i("[minigame] MiniInterstitialAd", 1, "ad is null");
        }
        return false;
      }
      AppBrandTask.runTaskOnUiThread(new InterstitialAdPlugin.MiniInterstitialAd.1(this, paramInt1, paramInt2));
      return true;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.tim\classes9.jar
 * Qualified Name:     com.tencent.mobileqq.mini.appbrand.jsapi.plugins.InterstitialAdPlugin
 * JD-Core Version:    0.7.0.1
 */
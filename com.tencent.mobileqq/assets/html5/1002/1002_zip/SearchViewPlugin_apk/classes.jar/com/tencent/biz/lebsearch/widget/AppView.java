package com.tencent.biz.lebsearch.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.biz.lebsearch.Statics;
import com.tencent.image.URLImageView;
import org.json.JSONException;
import org.json.JSONObject;

public class AppView
  extends LinearLayout
{
  public static final String KEY_APP_DOWNLOAD_COUNT = "down_num";
  public static final String KEY_APP_SIZE = "size";
  public static final String KEY_APP_STARS = "star";
  URLImageView appImg;
  TextView appInfoText;
  TextView appNameText;
  LinearLayout appStarsContainer;
  private Context mContext;
  View rootView;
  
  public AppView(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    init();
  }
  
  public AppView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    init();
  }
  
  public AppView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    init();
  }
  
  private void init()
  {
    View localView = LayoutInflater.from(this.mContext).inflate(2114125824, null);
    this.appNameText = ((TextView)localView.findViewById(2114453505));
    this.appStarsContainer = ((LinearLayout)localView.findViewById(2114453506));
    this.appInfoText = ((TextView)localView.findViewById(2114453507));
    this.appImg = ((URLImageView)localView.findViewById(2114453504));
    addView(localView);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
    localLayoutParams.width = -1;
    localView.setLayoutParams(localLayoutParams);
    this.rootView = localView;
  }
  
  public void setData(String paramString)
  {
    try
    {
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append(this.mContext.getString(2114322441)).append(";");
      Object localObject = new JSONObject(paramString);
      paramString = ((JSONObject)localObject).optString("name");
      double d1 = ((JSONObject)localObject).optDouble("star");
      long l = ((JSONObject)localObject).optLong("down_num");
      double d2 = ((JSONObject)localObject).optDouble("size");
      String str2 = ((JSONObject)localObject).optString("keyword");
      String str1 = ((JSONObject)localObject).optString("pic_url");
      if (((JSONObject)localObject).optBoolean("clickable", false))
      {
        setBackgroundResource(2114060291);
        setClickable(true);
      }
      localObject = new HighlightModel(((JSONObject)localObject).optJSONArray("highlight"), str2).getHighlightWords(paramString);
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        this.appNameText.setText((CharSequence)localObject);
      }
      localStringBuffer.append(paramString).append(",");
      SearchViewBuilder.setStars(this.appStarsContainer, d1);
      localStringBuffer.append(this.mContext.getString(2114322454, new Object[] { Double.valueOf(d1) })).append(";");
      if (l >= 10000L)
      {
        paramString = l / 10000L + "万";
        if (d2 <= 1048576.0D) {
          break label414;
        }
      }
      label414:
      for (localObject = String.format("%.2f", new Object[] { Double.valueOf(d2 / 1024.0D / 1024.0D) }) + "M";; localObject = String.format("%.2f", new Object[] { Double.valueOf(d2 / 1024.0D) }) + "K")
      {
        str2 = this.mContext.getString(2114322437, new Object[] { paramString, localObject });
        this.appInfoText.setText(str2);
        localStringBuffer.append(this.mContext.getString(2114322456, new Object[] { paramString, localObject })).append(".");
        Statics.setImage(this.appImg, str1, SearchViewBuilder.getImageWidthInPixels(this.mContext), SearchViewBuilder.getImageHeightInPixels(this.mContext));
        this.rootView.setContentDescription(localStringBuffer);
        return;
        paramString = "" + l;
        break;
      }
      return;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\assets\html5\1002\1002_zip\SearchViewPlugin_apk\classes.jar
 * Qualified Name:     com.tencent.biz.lebsearch.widget.AppView
 * JD-Core Version:    0.7.0.1
 */
package com.tencent.mobileqq.troop.data;

import NearbyGroup.GroupInfo;
import NearbyGroup.GroupLabel;
import ainx;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.biz.common.util.HttpUtil;
import com.tencent.common.app.AppInterface;
import com.tencent.common.config.AppSetting;
import com.tencent.mobileqq.activity.aio.AIOUtils;
import com.tencent.mobileqq.app.HotChatManager;
import com.tencent.mobileqq.troop.widget.TroopLabelLayout;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;
import java.util.Iterator;

public class NearbyTroops
{
  public static final boolean a = AppSetting.b;
  
  public static View a(Context paramContext, ViewGroup paramViewGroup, int paramInt)
  {
    return a(paramContext, paramViewGroup, paramInt, 2130971543);
  }
  
  public static View a(Context paramContext, ViewGroup paramViewGroup, int paramInt1, int paramInt2)
  {
    paramContext = LayoutInflater.from(paramContext).inflate(paramInt2, paramViewGroup, false);
    paramViewGroup = new NearbyTroops.CustomViewHolder();
    paramViewGroup.jdField_c_of_type_AndroidWidgetImageView = ((ImageView)paramContext.findViewById(2131366560));
    paramViewGroup.jdField_a_of_type_AndroidWidgetTextView = ((TextView)paramContext.findViewById(2131363667));
    paramViewGroup.jdField_b_of_type_AndroidWidgetTextView = ((TextView)paramContext.findViewById(2131366564));
    paramViewGroup.jdField_a_of_type_ComTencentMobileqqTroopWidgetTroopLabelLayout = ((TroopLabelLayout)paramContext.findViewById(2131370721));
    paramViewGroup.jdField_a_of_type_ComTencentMobileqqTroopWidgetTroopLabelLayout.setLabelType(paramInt1);
    paramViewGroup.jdField_b_of_type_ComTencentMobileqqTroopWidgetTroopLabelLayout = ((TroopLabelLayout)paramContext.findViewById(2131371108));
    paramViewGroup.jdField_b_of_type_ComTencentMobileqqTroopWidgetTroopLabelLayout.setLabelType(2);
    paramViewGroup.e = ((TextView)paramContext.findViewById(2131371107));
    paramViewGroup.jdField_a_of_type_ComTencentMobileqqTroopWidgetTroopLabelLayout.setDistanceTextView(paramViewGroup.e);
    paramViewGroup.jdField_c_of_type_AndroidWidgetTextView = ((TextView)paramContext.findViewById(2131371106));
    paramViewGroup.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)paramContext.findViewById(2131366563));
    paramViewGroup.jdField_b_of_type_AndroidWidgetImageView = ((ImageView)paramContext.findViewById(2131370720));
    paramViewGroup.jdField_c_of_type_AndroidWidgetImageView.setImageBitmap(null);
    paramViewGroup.jdField_a_of_type_AndroidWidgetLinearLayout = ((LinearLayout)paramContext.findViewById(2131362731));
    paramViewGroup.jdField_b_of_type_AndroidWidgetLinearLayout = ((LinearLayout)paramContext.findViewById(2131371109));
    paramViewGroup.jdField_d_of_type_AndroidWidgetTextView = ((TextView)paramContext.findViewById(2131371110));
    paramViewGroup.jdField_a_of_type_AndroidViewView = paramContext.findViewById(2131365532);
    paramViewGroup.jdField_d_of_type_Int = paramInt1;
    paramContext.setTag(paramViewGroup);
    return paramContext;
  }
  
  public static void a(Context paramContext, AppInterface paramAppInterface)
  {
    HotChatManager.a(paramContext, false);
  }
  
  public static void a(View paramView, GroupInfo paramGroupInfo, Context paramContext, boolean paramBoolean)
  {
    a(paramView, paramGroupInfo, paramContext, paramBoolean, true);
  }
  
  public static void a(View paramView, GroupInfo paramGroupInfo, Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    NearbyTroops.CustomViewHolder localCustomViewHolder = (NearbyTroops.CustomViewHolder)paramView.getTag();
    localCustomViewHolder.jdField_a_of_type_JavaLangString = String.valueOf(paramGroupInfo.lCode);
    localCustomViewHolder.jdField_a_of_type_AndroidWidgetTextView.setText(paramGroupInfo.strName);
    localCustomViewHolder.jdField_a_of_type_AndroidWidgetTextView.setTextColor(paramContext.getResources().getColor(2131494250));
    Object localObject1;
    Object localObject2;
    int i;
    if ((paramBoolean2) && (paramGroupInfo.labels != null))
    {
      localObject1 = paramGroupInfo.labels.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (GroupLabel)((Iterator)localObject1).next();
        if (((GroupLabel)localObject2).type == 2001L)
        {
          i = android.graphics.Color.rgb((int)((GroupLabel)localObject2).text_color.R, (int)((GroupLabel)localObject2).text_color.G, (int)((GroupLabel)localObject2).text_color.B);
          localCustomViewHolder.jdField_a_of_type_AndroidWidgetTextView.setTextColor(i);
        }
      }
    }
    localCustomViewHolder.jdField_c_of_type_AndroidWidgetTextView.setVisibility(0);
    if (TextUtils.isEmpty(paramGroupInfo.strIntro))
    {
      localCustomViewHolder.jdField_c_of_type_AndroidWidgetTextView.setText(2131430411);
      localCustomViewHolder.jdField_a_of_type_NearbyGroupGroupInfo = paramGroupInfo;
      if ((paramGroupInfo.labels != null) && (paramGroupInfo.labels.size() != 0)) {
        break label680;
      }
      if ((localCustomViewHolder.jdField_a_of_type_JavaUtilArrayList == null) || (localCustomViewHolder.jdField_a_of_type_JavaUtilArrayList.size() == 0))
      {
        localObject1 = new ArrayList(1);
        ((ArrayList)localObject1).add(new GroupLabel(paramGroupInfo.iMemberCnt + "", new NearbyGroup.Color(175L, 195L, 213L), 1L, new NearbyGroup.Color(190L, 206L, 220L)));
        localCustomViewHolder.jdField_a_of_type_JavaUtilArrayList = ((ArrayList)localObject1);
      }
      ((GroupLabel)localCustomViewHolder.jdField_a_of_type_JavaUtilArrayList.get(0)).strWording = (paramGroupInfo.iMemberCnt + "");
      paramGroupInfo.labels = localCustomViewHolder.jdField_a_of_type_JavaUtilArrayList;
      a(paramContext, localCustomViewHolder, paramGroupInfo);
      if ((paramGroupInfo.dwGroupFlagExt & 0x800) == 0L) {
        break label774;
      }
      if (paramGroupInfo.dwCertType != 2L) {
        break label729;
      }
      localCustomViewHolder.jdField_a_of_type_AndroidWidgetImageView.setVisibility(0);
      localCustomViewHolder.jdField_a_of_type_AndroidWidgetImageView.setBackgroundResource(2130841393);
      label401:
      if ((paramGroupInfo.dwExtFlag & 1L) == 0L) {
        break label787;
      }
      localCustomViewHolder.jdField_b_of_type_AndroidWidgetImageView.setBackgroundResource(2130840548);
      localCustomViewHolder.jdField_b_of_type_AndroidWidgetImageView.setVisibility(0);
    }
    label680:
    for (;;)
    {
      label432:
      if (a)
      {
        localObject1 = "" + paramGroupInfo.strName;
        paramContext = paramGroupInfo.iMemberCnt + "人  ";
        if (paramGroupInfo.labels == null) {
          break label869;
        }
        localObject2 = new StringBuffer();
        int j = paramGroupInfo.labels.size();
        i = 0;
        for (;;)
        {
          if (i < j)
          {
            GroupLabel localGroupLabel = (GroupLabel)paramGroupInfo.labels.get(i);
            if ((localGroupLabel != null) && (!TextUtils.isEmpty(localGroupLabel.strWording))) {
              ((StringBuffer)localObject2).append(localGroupLabel.strWording).append(" ");
            }
            i += 1;
            continue;
            i = paramContext.getResources().getDisplayMetrics().widthPixels;
            if (localCustomViewHolder.jdField_b_of_type_Int == 1) {
              i -= AIOUtils.a(110.0F, paramContext.getResources());
            }
            for (;;)
            {
              localObject1 = HttpUtil.b(HttpUtil.c(paramGroupInfo.strIntro));
              TextUtils.ellipsize((CharSequence)localObject1, localCustomViewHolder.jdField_c_of_type_AndroidWidgetTextView.getPaint(), i, TextUtils.TruncateAt.END, false, new ainx(localCustomViewHolder, (String)localObject1));
              break;
              i = (i - AIOUtils.a(137.0F, paramContext.getResources())) * 2;
            }
            if ((a(paramContext, localCustomViewHolder, paramGroupInfo)) || (!QLog.isColorLevel())) {
              break;
            }
            QLog.e("NearbyTroops", 2, "fillTroopLabels failed:" + paramGroupInfo.strName);
            break;
            label729:
            if (paramGroupInfo.dwCertType == 1L)
            {
              localCustomViewHolder.jdField_a_of_type_AndroidWidgetImageView.setVisibility(0);
              localCustomViewHolder.jdField_a_of_type_AndroidWidgetImageView.setBackgroundResource(2130841393);
              break label401;
            }
            localCustomViewHolder.jdField_a_of_type_AndroidWidgetImageView.setVisibility(8);
            break label401;
            localCustomViewHolder.jdField_a_of_type_AndroidWidgetImageView.setVisibility(8);
            break label401;
            localCustomViewHolder.jdField_b_of_type_AndroidWidgetImageView.setVisibility(8);
            break label432;
          }
        }
        if (((StringBuffer)localObject2).length() <= 0) {
          break label869;
        }
        paramContext = ((StringBuffer)localObject2).toString();
      }
    }
    label774:
    label787:
    label869:
    for (;;)
    {
      localCustomViewHolder.jdField_b_of_type_AndroidWidgetTextView.setContentDescription(paramContext);
      paramContext = (String)localObject1 + paramContext;
      paramView.setContentDescription(paramContext + paramGroupInfo.strIntro);
      return;
    }
  }
  
  protected static boolean a(Context paramContext, NearbyTroops.CustomViewHolder paramCustomViewHolder, GroupInfo paramGroupInfo)
  {
    if ((paramContext == null) || (paramCustomViewHolder == null) || (paramGroupInfo == null) || (paramGroupInfo.labels == null) || (paramGroupInfo.labels.size() == 0)) {
      return false;
    }
    paramCustomViewHolder.jdField_b_of_type_AndroidWidgetTextView.setVisibility(8);
    paramCustomViewHolder.jdField_a_of_type_ComTencentMobileqqTroopWidgetTroopLabelLayout.setVisibility(0);
    paramContext = paramGroupInfo.labels;
    paramCustomViewHolder.jdField_b_of_type_ComTencentMobileqqTroopWidgetTroopLabelLayout.a(paramContext);
    return paramCustomViewHolder.jdField_a_of_type_ComTencentMobileqqTroopWidgetTroopLabelLayout.a(paramContext);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\tmp2\com34.jar
 * Qualified Name:     com.tencent.mobileqq.troop.data.NearbyTroops
 * JD-Core Version:    0.7.0.1
 */
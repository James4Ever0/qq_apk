package com.tencent.mobileqq.troop.utils;

import com.tencent.mobileqq.troop.data.TroopFileInfo;

public class TroopFileManager$NormalFileFilter
  implements TroopFileManager.Filter
{
  public boolean a(TroopFileInfo paramTroopFileInfo)
  {
    if (paramTroopFileInfo.b) {
      return false;
    }
    switch (paramTroopFileInfo.e)
    {
    }
    return true;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\b.jar
 * Qualified Name:     com.tencent.mobileqq.troop.utils.TroopFileManager.NormalFileFilter
 * JD-Core Version:    0.7.0.1
 */
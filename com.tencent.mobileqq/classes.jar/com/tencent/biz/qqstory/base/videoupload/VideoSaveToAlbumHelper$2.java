package com.tencent.biz.qqstory.base.videoupload;

import java.util.ArrayList;

class VideoSaveToAlbumHelper$2
  extends ArrayList
{
  VideoSaveToAlbumHelper$2(VideoSaveToAlbumHelper paramVideoSaveToAlbumHelper, VideoSaveToAlbumHelper.VideoSaveToAlbumTaskInfo paramVideoSaveToAlbumTaskInfo, int paramInt, String paramString)
  {
    add(this.val$taskInfo.c);
    if ((this.val$rotation != 0) && (this.val$rotation != -1)) {}
    for (paramVideoSaveToAlbumHelper = this.val$hflipPath;; paramVideoSaveToAlbumHelper = this.val$taskInfo.jdField_b_of_type_JavaLangString)
    {
      add(paramVideoSaveToAlbumHelper);
      add(this.val$taskInfo.d);
      add(Integer.valueOf(this.val$taskInfo.a));
      add(Integer.valueOf(this.val$taskInfo.jdField_b_of_type_Int));
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.biz.qqstory.base.videoupload.VideoSaveToAlbumHelper.2
 * JD-Core Version:    0.7.0.1
 */
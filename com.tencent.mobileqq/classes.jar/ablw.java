import android.graphics.Bitmap;
import android.support.v4.util.MQLruCache;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.bubble.AnimationConfig;
import com.tencent.mobileqq.bubble.BubbleManager;
import com.tencent.mobileqq.bubble.BubbleNewAIOAnim;
import com.tencent.mobileqq.bubble.BubbleNewAnimConf;
import com.tencent.qphone.base.util.QLog;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ablw
  implements Runnable
{
  public ablw(BubbleNewAIOAnim paramBubbleNewAIOAnim) {}
  
  public void run()
  {
    if ((this.a.jdField_a_of_type_JavaUtilArrayList != null) && (this.a.jdField_a_of_type_JavaUtilArrayList.size() > 0))
    {
      Iterator localIterator = this.a.jdField_a_of_type_JavaUtilArrayList.iterator();
      if (localIterator.hasNext())
      {
        BubbleNewAnimConf localBubbleNewAnimConf = (BubbleNewAnimConf)localIterator.next();
        File localFile = new File(this.a.jdField_a_of_type_ComTencentMobileqqBubbleBubbleManager.a(this.a.jdField_b_of_type_Int, false), this.a.jdField_a_of_type_ComTencentMobileqqBubbleAnimationConfig.a);
        int i = 0;
        label93:
        Object localObject1;
        String str;
        if (i < localBubbleNewAnimConf.jdField_b_of_type_Int)
        {
          localObject1 = localFile.getAbsolutePath() + File.separatorChar + localBubbleNewAnimConf.jdField_b_of_type_JavaLangString + String.format("%04d.png", new Object[] { Integer.valueOf(i + 1) });
          str = localBubbleNewAnimConf.a + (String)localObject1;
          if (this.a.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.containsKey(str)) {
            break label310;
          }
          Object localObject3 = BaseApplicationImpl.sImageCache.get(str);
          if ((localObject3 == null) || (!(localObject3 instanceof Bitmap))) {
            break label259;
          }
          localObject1 = (Bitmap)localObject3;
        }
        for (;;)
        {
          if (localObject1 != null)
          {
            BaseApplicationImpl.sImageCache.put(str, localObject1);
            this.a.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.put(str, localObject1);
          }
          i += 1;
          break label93;
          break;
          try
          {
            label259:
            localObject1 = BubbleManager.a((String)localObject1, null);
          }
          catch (Exception localException)
          {
            if (QLog.isColorLevel()) {
              QLog.e("BubbleNewAIOAnim", 4, "decode error!", localException);
            }
            Object localObject2 = null;
          }
          catch (OutOfMemoryError localOutOfMemoryError)
          {
            if (QLog.isColorLevel()) {
              QLog.e("BubbleNewAIOAnim", 4, "decode error!", localOutOfMemoryError);
            }
            localBitmap = null;
          }
          continue;
          label310:
          Bitmap localBitmap = (Bitmap)this.a.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.get(str);
        }
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     ablw
 * JD-Core Version:    0.7.0.1
 */
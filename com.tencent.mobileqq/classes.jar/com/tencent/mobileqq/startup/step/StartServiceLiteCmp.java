package com.tencent.mobileqq.startup.step;

import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.automator.Automator;
import com.tencent.mobileqq.app.automator.StepFactory;

public class StartServiceLiteCmp
  extends Step
{
  protected boolean a()
  {
    Object localObject = BaseApplicationImpl.sApplication.getRuntime();
    if ((localObject instanceof QQAppInterface))
    {
      localObject = (QQAppInterface)localObject;
      if (((QQAppInterface)localObject).e()) {
        ((QQAppInterface)localObject).a.a(StepFactory.a(((QQAppInterface)localObject).a, "{{4,3,5,6},44,45,[100,79,65,25,10,26,27,28,29,30,32,34,35,39,40,41,42,43,47,48,50,55,107,69,93,70,71,72,73,{91},53,54,61,104,63,77,81,67,80,74,36,37,38,87,88,78,82,84,98,86,102,103],57}"));
      }
    }
    return true;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     com.tencent.mobileqq.startup.step.StartServiceLiteCmp
 * JD-Core Version:    0.7.0.1
 */
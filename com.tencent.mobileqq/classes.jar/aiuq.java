import com.tencent.mobileqq.app.soso.SosoInterface.OnLocationListener;
import com.tencent.mobileqq.app.soso.SosoInterface.SosoLbsInfo;
import com.tencent.mobileqq.app.soso.SosoInterface.SosoLocation;
import com.tencent.mobileqq.troop.activity.QLifeCommentActivity;
import com.tencent.qphone.base.util.QLog;

public class aiuq
  extends SosoInterface.OnLocationListener
{
  public aiuq(QLifeCommentActivity paramQLifeCommentActivity, int paramInt, boolean paramBoolean1, boolean paramBoolean2, long paramLong, boolean paramBoolean3, boolean paramBoolean4, String paramString)
  {
    super(paramInt, paramBoolean1, paramBoolean2, paramLong, paramBoolean3, paramBoolean4, paramString);
  }
  
  public void a(int paramInt, SosoInterface.SosoLbsInfo paramSosoLbsInfo)
  {
    if (QLog.isColorLevel()) {
      QLog.d("QLifeCommentActivity", 2, "onLocationFinish() errCode=" + paramInt);
    }
    if (paramSosoLbsInfo != null)
    {
      this.a.a = paramSosoLbsInfo.a.a;
      this.a.b = paramSosoLbsInfo.a.b;
    }
    QLifeCommentActivity.a(this.a, this.a.a, this.a.b);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     aiuq
 * JD-Core Version:    0.7.0.1
 */
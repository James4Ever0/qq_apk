import com.tencent.biz.qqstory.takevideo.EditDoodleExport;
import com.tencent.biz.qqstory.takevideo.EditVideoGuide;

public class ojp
  implements Runnable
{
  public ojp(EditVideoGuide paramEditVideoGuide) {}
  
  public void run()
  {
    EditDoodleExport localEditDoodleExport = (EditDoodleExport)this.a.a(EditDoodleExport.class);
    if (localEditDoodleExport != null) {
      localEditDoodleExport.c();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     ojp
 * JD-Core Version:    0.7.0.1
 */
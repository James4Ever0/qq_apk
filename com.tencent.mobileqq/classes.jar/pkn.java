import com.tencent.component.media.gif.NewGifDecoder;
import com.tencent.component.media.gif.NewGifDrawable;
import com.tencent.component.media.utils.ImageManagerLog;

class pkn
  extends pkv
{
  pkn(pkm parampkm, NewGifDrawable paramNewGifDrawable)
  {
    super(paramNewGifDrawable);
  }
  
  public void doWork()
  {
    ImageManagerLog.e("NewGifDrawable", "reset");
    if (this.a.a.a.reset()) {
      this.a.a.start();
    }
    NewGifDrawable.a(this.a.a, false);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     pkn
 * JD-Core Version:    0.7.0.1
 */
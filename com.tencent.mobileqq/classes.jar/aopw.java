import dov.com.tencent.mobileqq.shortvideo.hwcodec.SVHwEncoder;

class aopw
{
  int jdField_a_of_type_Int = 0;
  long jdField_a_of_type_Long;
  long[] jdField_a_of_type_ArrayOfLong = new long[3];
  int jdField_b_of_type_Int = 0;
  long jdField_b_of_type_Long;
  long[] jdField_b_of_type_ArrayOfLong = new long[3];
  int jdField_c_of_type_Int = 0;
  long jdField_c_of_type_Long;
  int jdField_d_of_type_Int = 0;
  long jdField_d_of_type_Long;
  long e;
  long f;
  long g;
  long h;
  long i;
  long j;
  long k;
  long l;
  long m;
  long n;
  long o;
  long p;
  long q = 9223372036854775807L;
  long r = 0L;
  long s = 9223372036854775807L;
  long t = 0L;
  
  aopw(aopu paramaopu) {}
  
  long a()
  {
    return System.currentTimeMillis() - this.jdField_a_of_type_Long;
  }
  
  void a()
  {
    this.jdField_a_of_type_Long = System.currentTimeMillis();
  }
  
  void a(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.jdField_a_of_type_Int < 3))
    {
      arrayOfLong = this.jdField_a_of_type_ArrayOfLong;
      i1 = this.jdField_a_of_type_Int;
      this.jdField_a_of_type_Int = (i1 + 1);
      arrayOfLong[i1] = System.currentTimeMillis();
    }
    while (this.jdField_b_of_type_Int >= 3) {
      return;
    }
    long[] arrayOfLong = this.jdField_b_of_type_ArrayOfLong;
    int i1 = this.jdField_b_of_type_Int;
    this.jdField_b_of_type_Int = (i1 + 1);
    arrayOfLong[i1] = System.currentTimeMillis();
  }
  
  long b()
  {
    if (this.jdField_c_of_type_Int < 3) {
      return 0L;
    }
    return this.jdField_a_of_type_ArrayOfLong[0];
  }
  
  void b(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.jdField_c_of_type_Int < 3))
    {
      this.jdField_a_of_type_ArrayOfLong[this.jdField_c_of_type_Int] = (System.currentTimeMillis() - this.jdField_a_of_type_ArrayOfLong[this.jdField_c_of_type_Int]);
      this.jdField_c_of_type_Int += 1;
      if (this.jdField_c_of_type_Int == 3)
      {
        this.jdField_a_of_type_Aopu.a.a("hw_video_time_used_msg", "videoEncodeTime:cnt20=" + this.jdField_a_of_type_ArrayOfLong[0] + " cnt1=" + this.jdField_a_of_type_ArrayOfLong[1] + " cnt2" + this.jdField_a_of_type_ArrayOfLong[2]);
        this.jdField_a_of_type_ArrayOfLong[0] = ((this.jdField_a_of_type_ArrayOfLong[0] + this.jdField_a_of_type_ArrayOfLong[1] + this.jdField_a_of_type_ArrayOfLong[2]) / 3L * 1000L / 2L);
        this.jdField_a_of_type_Aopu.a.a("hw_video_time_used_msg", "videoEncodeTime:timeout=" + this.jdField_a_of_type_ArrayOfLong[0]);
      }
    }
    do
    {
      do
      {
        return;
      } while (this.jdField_d_of_type_Int >= 3);
      this.jdField_b_of_type_ArrayOfLong[this.jdField_d_of_type_Int] = (System.currentTimeMillis() - this.jdField_b_of_type_ArrayOfLong[this.jdField_d_of_type_Int]);
      this.jdField_d_of_type_Int += 1;
    } while (this.jdField_d_of_type_Int != 3);
    this.jdField_a_of_type_Aopu.a.a("hw_video_time_used_msg", "audioEncodeTime:cnt20=" + this.jdField_b_of_type_ArrayOfLong[0] + " cnt1=" + this.jdField_b_of_type_ArrayOfLong[1] + " cnt2" + this.jdField_b_of_type_ArrayOfLong[2]);
    this.jdField_b_of_type_ArrayOfLong[0] = ((this.jdField_b_of_type_ArrayOfLong[0] + this.jdField_b_of_type_ArrayOfLong[1] + this.jdField_b_of_type_ArrayOfLong[2]) / 3L * 1000L / 2L);
    this.jdField_a_of_type_Aopu.a.a("hw_video_time_used_msg", "audioEncodeTime:timeout=" + this.jdField_b_of_type_ArrayOfLong[0]);
  }
  
  long c()
  {
    if (this.jdField_d_of_type_Int < 3) {
      return 0L;
    }
    return this.jdField_b_of_type_ArrayOfLong[0];
  }
  
  void c(boolean paramBoolean)
  {
    long l1 = a();
    if (paramBoolean)
    {
      if (l1 > this.r) {
        this.r = l1;
      }
      if (l1 < this.q) {
        this.q = l1;
      }
    }
    do
    {
      return;
      if (l1 > this.t) {
        this.t = l1;
      }
    } while (l1 >= this.s);
    this.s = l1;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("mThumbGen=").append(this.l).append(" ");
    localStringBuilder.append("mThumbGenFunc=").append(this.m).append(" ");
    localStringBuilder.append("mMuxerCreate=").append(this.n).append(" ");
    localStringBuilder.append("mMuxerAdd=").append(this.o).append(" ");
    localStringBuilder.append("mMuxerStart=").append(this.p).append(" ");
    localStringBuilder.append("mWriteVideoMax=").append(this.r).append(" ");
    localStringBuilder.append("mWriteVideoMIn=").append(this.q).append(" ");
    localStringBuilder.append("mWriteAudioMax=").append(this.t).append(" ");
    localStringBuilder.append("mWriteAudioMIn=").append(this.s).append(" ");
    localStringBuilder.append("vConfig=").append(this.jdField_b_of_type_Long).append(" ");
    localStringBuilder.append("vInit=").append(this.jdField_c_of_type_Long).append(" ");
    localStringBuilder.append("vStart=").append(this.jdField_d_of_type_Long).append(" ");
    localStringBuilder.append("vStop=").append(this.e).append(" ");
    localStringBuilder.append("vRelease=").append(this.f).append(" ");
    localStringBuilder.append("aConfig=").append(this.g).append(" ");
    localStringBuilder.append("aInit=").append(this.h).append(" ");
    localStringBuilder.append("aStart=").append(this.i).append(" ");
    localStringBuilder.append("aStop=").append(this.j).append(" ");
    localStringBuilder.append("aRelease=").append(this.k).append(" ");
    return localStringBuilder.toString();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     aopw
 * JD-Core Version:    0.7.0.1
 */
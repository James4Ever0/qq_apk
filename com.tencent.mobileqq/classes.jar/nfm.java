import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tencent.biz.qqstory.network.handler.DateCollectionListPageLoader;
import com.tencent.biz.qqstory.network.handler.DateCollectionListPageLoader.CacheContext;
import com.tribe.async.async.JobContext;
import com.tribe.async.async.SimpleJob;

public class nfm
  extends SimpleJob
{
  public nfm(DateCollectionListPageLoader paramDateCollectionListPageLoader) {}
  
  protected Object a(@NonNull JobContext paramJobContext, @Nullable Void... paramVarArgs)
  {
    if (this.a.jdField_a_of_type_ComTencentBizQqstoryNetworkHandlerDateCollectionListPageLoader$CacheContext == null) {
      this.a.jdField_a_of_type_ComTencentBizQqstoryNetworkHandlerDateCollectionListPageLoader$CacheContext = new DateCollectionListPageLoader.CacheContext(this.a, this.a.d);
    }
    this.a.jdField_a_of_type_JavaLangString = this.a.jdField_a_of_type_ComTencentBizQqstoryNetworkHandlerDateCollectionListPageLoader$CacheContext.jdField_a_of_type_JavaLangString;
    DateCollectionListPageLoader.a(this.a);
    return null;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     nfm
 * JD-Core Version:    0.7.0.1
 */
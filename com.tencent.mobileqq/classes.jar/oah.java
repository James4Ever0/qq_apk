import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tencent.biz.qqstory.base.ErrorMessage;
import com.tencent.biz.qqstory.channel.CmdTaskManger.CommandCallback;
import com.tencent.biz.qqstory.network.request.square.GetSquareFeedIdListRequest;
import com.tencent.biz.qqstory.network.request.square.GetSquareFeedIdListRequest.GetSquareFeedIdListResponse;
import com.tencent.biz.qqstory.storyHome.model.FeedListPageLoaderBase.FeedIdListCache;
import com.tencent.biz.qqstory.support.logging.SLog;
import com.tribe.async.async.JobContext;

class oah
  implements CmdTaskManger.CommandCallback
{
  oah(oag paramoag, JobContext paramJobContext, Integer paramInteger) {}
  
  public void a(@NonNull GetSquareFeedIdListRequest paramGetSquareFeedIdListRequest, @Nullable GetSquareFeedIdListRequest.GetSquareFeedIdListResponse paramGetSquareFeedIdListResponse, @NonNull ErrorMessage paramErrorMessage)
  {
    if (this.jdField_a_of_type_ComTribeAsyncAsyncJobContext.isJobCancelled())
    {
      SLog.d("Q.qqstory.discover.SquareFeedListPageLoader", "feedId pull segment cancel on net respond");
      return;
    }
    if ((paramErrorMessage.isFail()) || (paramGetSquareFeedIdListResponse == null))
    {
      SLog.a("Q.qqstory.discover.SquareFeedListPageLoader", "pull feedId list fail %s", paramErrorMessage.toString());
      oag.a(this.jdField_a_of_type_Oag, paramErrorMessage);
      return;
    }
    oag.a(this.jdField_a_of_type_Oag).a(paramGetSquareFeedIdListResponse.jdField_a_of_type_JavaUtilList, paramGetSquareFeedIdListResponse.jdField_a_of_type_JavaLangString, paramGetSquareFeedIdListResponse.jdField_a_of_type_Boolean);
    paramGetSquareFeedIdListRequest = oag.a(this.jdField_a_of_type_Oag).a(this.jdField_a_of_type_JavaLangInteger.intValue(), 5);
    oag.a(this.jdField_a_of_type_Oag, paramGetSquareFeedIdListRequest);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     oah
 * JD-Core Version:    0.7.0.1
 */
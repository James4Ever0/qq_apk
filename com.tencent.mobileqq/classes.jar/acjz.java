import android.os.Bundle;
import com.tencent.mobileqq.activity.Conversation;
import com.tencent.mobileqq.apollo.ApolloGameManager;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.emosm.web.MessengerService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import mqq.os.MqqHandler;
import org.json.JSONArray;
import org.json.JSONObject;

class acjz
  implements Runnable
{
  acjz(acjg paramacjg, String paramString, Bundle paramBundle, MessengerService paramMessengerService, QQAppInterface paramQQAppInterface) {}
  
  public void run()
  {
    try
    {
      Object localObject2 = new JSONObject(this.jdField_a_of_type_JavaLangString).getJSONArray("gameList");
      Object localObject1 = new ArrayList();
      if ((localObject2 != null) && (((JSONArray)localObject2).length() > 0))
      {
        int i = 0;
        while (i < ((JSONArray)localObject2).length())
        {
          ((ArrayList)localObject1).add(Integer.valueOf(((JSONArray)localObject2).getInt(i)));
          i += 1;
        }
        localObject2 = new acka(this);
        ApolloGameManager localApolloGameManager = (ApolloGameManager)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(210);
        localApolloGameManager.a = new WeakReference(localObject2);
        localApolloGameManager.a("android.web", "apollo_aio_game.del_games_from_user_gamepanel", (ArrayList)localObject1);
        localObject1 = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getHandler(Conversation.class);
        ((MqqHandler)localObject1).sendMessage(((MqqHandler)localObject1).obtainMessage(1134054));
      }
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     acjz
 * JD-Core Version:    0.7.0.1
 */
package com.tencent.token;

import android.content.Context;
import com.tencent.token.global.RqdApplication;
import com.tencent.token.global.b;
import com.tencent.token.global.d;
import com.tencent.token.global.e;
import com.tencent.token.global.g;
import com.tencent.token.utils.s;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class dk
  extends bm
{
  private long c;
  private int d;
  private ba e = ba.a();
  
  protected final String a()
  {
    Object localObject1 = null;
    ae.a();
    if (ax.a().p()) {
      ax.a();
    }
    for (String str = ax.c; str == null; str = null)
    {
      this.a.a(104, null, null);
      return null;
    }
    try
    {
      Object localObject2 = new JSONObject();
      ((JSONObject)localObject2).put("uin", this.c);
      int i = af.a + 1;
      af.a = i;
      this.d = i;
      ((JSONObject)localObject2).put("seq_id", this.d);
      ((JSONObject)localObject2).put("op_time", ag.c().r() / 1000L);
      localObject2 = ((JSONObject)localObject2).toString();
      e.a("plain:" + (String)localObject2);
      localObject2 = s.b(((String)localObject2).getBytes());
      localObject1 = localObject2;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        e.c("JSONException:" + localJSONException.getMessage());
      }
    }
    str = "?aq_base_sid=" + str + "&data=" + localObject1;
    return b.c() + "/cn/mbtoken3/mbtoken3_get_game_lock_status_v2" + str;
  }
  
  protected final void a(fs paramfs)
  {
    this.c = ((Long)paramfs.c.get("param.uinhash")).longValue();
  }
  
  protected final void a(JSONObject paramJSONObject)
  {
    int i = paramJSONObject.getInt("err");
    if (i != 0)
    {
      a(i, null);
      return;
    }
    Object localObject = s.d(paramJSONObject.getString("data"));
    if (localObject != null)
    {
      localObject = new JSONObject(new String((byte[])localObject));
      i = ((JSONObject)localObject).getInt("seq_id");
      if (i != this.d)
      {
        this.a.a(10030, null, null);
        paramJSONObject = new StringBuilder().append("parseJSON error seq is wrong seq=").append(i).append(",right = ");
        af.a();
        e.c(af.b());
        return;
      }
      long l = ((JSONObject)localObject).getLong("uin");
      if (l != this.c)
      {
        this.a.a(10000, "uin not match=" + l + ":" + this.c, null);
        return;
      }
      localObject = ((JSONObject)localObject).getJSONArray("result");
      if (!this.e.b((JSONArray)localObject))
      {
        this.a.a(10000, "update conf list failed:" + ((JSONArray)localObject).toString(), null);
        return;
      }
      g.a("game_lock", new String(paramJSONObject.toString()));
      this.e.c.e = true;
      this.e.c.f = false;
      this.a.a = 0;
      return;
    }
    e.c("parseJSON error decodeData=" + localObject);
    a(10022, RqdApplication.i().getString(2131361799));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.token\classes.jar
 * Qualified Name:     com.tencent.token.dk
 * JD-Core Version:    0.7.0.1
 */
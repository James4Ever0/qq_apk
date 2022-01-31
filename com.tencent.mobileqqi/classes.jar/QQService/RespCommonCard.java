package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class RespCommonCard
  extends JceStruct
{
  static CommonCard cache_stCommonCard;
  static RespHead cache_stHeader;
  static ArrayList cache_vFaceInfo;
  static byte[] cache_vQQFaceID;
  static ArrayList cache_vVisitors;
  static ArrayList cache_vVoter;
  public byte bShareLBS = 0;
  public byte cSqqLevel = 0;
  public int iVoteIncrement = 0;
  public int lListVoterTime = 0;
  public CommonCard stCommonCard = null;
  public RespHead stHeader = null;
  public ArrayList vFaceInfo = null;
  public byte[] vQQFaceID = null;
  public ArrayList vVisitors = null;
  public ArrayList vVoter = null;
  
  public RespCommonCard() {}
  
  public RespCommonCard(RespHead paramRespHead, CommonCard paramCommonCard, byte[] paramArrayOfByte, ArrayList paramArrayList1, int paramInt1, ArrayList paramArrayList2, ArrayList paramArrayList3, int paramInt2, byte paramByte1, byte paramByte2)
  {
    this.stHeader = paramRespHead;
    this.stCommonCard = paramCommonCard;
    this.vQQFaceID = paramArrayOfByte;
    this.vFaceInfo = paramArrayList1;
    this.iVoteIncrement = paramInt1;
    this.vVisitors = paramArrayList2;
    this.vVoter = paramArrayList3;
    this.lListVoterTime = paramInt2;
    this.bShareLBS = paramByte1;
    this.cSqqLevel = paramByte2;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    if (cache_stHeader == null) {
      cache_stHeader = new RespHead();
    }
    this.stHeader = ((RespHead)paramJceInputStream.read(cache_stHeader, 0, true));
    if (cache_stCommonCard == null) {
      cache_stCommonCard = new CommonCard();
    }
    this.stCommonCard = ((CommonCard)paramJceInputStream.read(cache_stCommonCard, 1, true));
    if (cache_vQQFaceID == null)
    {
      cache_vQQFaceID = (byte[])new byte[1];
      ((byte[])cache_vQQFaceID)[0] = 0;
    }
    this.vQQFaceID = ((byte[])paramJceInputStream.read(cache_vQQFaceID, 2, true));
    Object localObject;
    if (cache_vFaceInfo == null)
    {
      cache_vFaceInfo = new ArrayList();
      localObject = new FaceInfo();
      cache_vFaceInfo.add(localObject);
    }
    this.vFaceInfo = ((ArrayList)paramJceInputStream.read(cache_vFaceInfo, 3, false));
    this.iVoteIncrement = paramJceInputStream.read(this.iVoteIncrement, 4, false);
    if (cache_vVisitors == null)
    {
      cache_vVisitors = new ArrayList();
      localObject = new Visitor();
      cache_vVisitors.add(localObject);
    }
    this.vVisitors = ((ArrayList)paramJceInputStream.read(cache_vVisitors, 5, false));
    if (cache_vVoter == null)
    {
      cache_vVoter = new ArrayList();
      localObject = new Visitor();
      cache_vVoter.add(localObject);
    }
    this.vVoter = ((ArrayList)paramJceInputStream.read(cache_vVoter, 6, false));
    this.lListVoterTime = paramJceInputStream.read(this.lListVoterTime, 7, false);
    this.bShareLBS = paramJceInputStream.read(this.bShareLBS, 8, false);
    this.cSqqLevel = paramJceInputStream.read(this.cSqqLevel, 9, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.stHeader, 0);
    paramJceOutputStream.write(this.stCommonCard, 1);
    paramJceOutputStream.write(this.vQQFaceID, 2);
    if (this.vFaceInfo != null) {
      paramJceOutputStream.write(this.vFaceInfo, 3);
    }
    paramJceOutputStream.write(this.iVoteIncrement, 4);
    if (this.vVisitors != null) {
      paramJceOutputStream.write(this.vVisitors, 5);
    }
    if (this.vVoter != null) {
      paramJceOutputStream.write(this.vVoter, 6);
    }
    paramJceOutputStream.write(this.lListVoterTime, 7);
    paramJceOutputStream.write(this.bShareLBS, 8);
    paramJceOutputStream.write(this.cSqqLevel, 9);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     QQService.RespCommonCard
 * JD-Core Version:    0.7.0.1
 */
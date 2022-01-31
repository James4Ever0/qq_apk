package tencent.im.s2c.msgtype0x210.submsgtype0x44;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class submsgtype0x44$GroupSyncMsg
  extends MessageMicro
{
  public static final int BYTES_AUTH_KEY_FIELD_NUMBER = 8;
  public static final int BYTES_MSG_BUF_FIELD_NUMBER = 7;
  public static final int UINT32_CUR_MAX_MEM_COUNT_FIELD_NUMBER = 12;
  public static final int UINT32_CUR_MEM_COUNT_FIELD_NUMBER = 14;
  public static final int UINT32_EXT_ADMIN_NUM_FIELD_NUMBER = 18;
  public static final int UINT32_INVITER_ROLE_FIELD_NUMBER = 17;
  public static final int UINT32_MSG_STATUS_FIELD_NUMBER = 9;
  public static final int UINT32_MSG_TYPE_FIELD_NUMBER = 1;
  public static final int UINT32_NEXT_MAX_MEM_COUNT_FIELD_NUMBER = 13;
  public static final int UINT32_PROCESSFLAG_FIELD_NUMBER = 19;
  public static final int UINT32_REQ_SRC_ID_FIELD_NUMBER = 15;
  public static final int UINT32_REQ_SRC_SUB_ID_FIELD_NUMBER = 16;
  public static final int UINT64_ACTION_TIME_FIELD_NUMBER = 11;
  public static final int UINT64_ACTION_UIN_FIELD_NUMBER = 10;
  public static final int UINT64_GA_CODE_FIELD_NUMBER = 4;
  public static final int UINT64_GRP_CODE_FIELD_NUMBER = 3;
  public static final int UINT64_MSG_SEQ_FIELD_NUMBER = 2;
  public static final int UINT64_OPT_UIN1_FIELD_NUMBER = 5;
  public static final int UINT64_OPT_UIN2_FIELD_NUMBER = 6;
  static final MessageMicro.FieldMap __fieldMap__;
  public static final GroupSyncMsg __repeatHelper__ = new GroupSyncMsg();
  public final PBBytesField bytes_auth_key = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_msg_buf = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_cur_max_mem_count = PBField.initUInt32(0);
  public final PBUInt32Field uint32_cur_mem_count = PBField.initUInt32(0);
  public final PBUInt32Field uint32_ext_admin_num = PBField.initUInt32(0);
  public final PBUInt32Field uint32_inviter_role = PBField.initUInt32(0);
  public final PBUInt32Field uint32_msg_status = PBField.initUInt32(0);
  public final PBUInt32Field uint32_msg_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_next_max_mem_count = PBField.initUInt32(0);
  public final PBUInt32Field uint32_processflag = PBField.initUInt32(0);
  public final PBUInt32Field uint32_req_src_id = PBField.initUInt32(0);
  public final PBUInt32Field uint32_req_src_sub_id = PBField.initUInt32(0);
  public final PBUInt64Field uint64_action_time = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_action_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_ga_code = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_grp_code = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_msg_seq = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_opt_uin1 = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_opt_uin2 = PBField.initUInt64(0L);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 40, 48, 58, 66, 72, 80, 88, 96, 104, 112, 120, 128, 136, 144, 152 }, new String[] { "uint32_msg_type", "uint64_msg_seq", "uint64_grp_code", "uint64_ga_code", "uint64_opt_uin1", "uint64_opt_uin2", "bytes_msg_buf", "bytes_auth_key", "uint32_msg_status", "uint64_action_uin", "uint64_action_time", "uint32_cur_max_mem_count", "uint32_next_max_mem_count", "uint32_cur_mem_count", "uint32_req_src_id", "uint32_req_src_sub_id", "uint32_inviter_role", "uint32_ext_admin_num", "uint32_processflag" }, new Object[] { Integer.valueOf(0), Long.valueOf(0L), Long.valueOf(0L), Long.valueOf(0L), Long.valueOf(0L), Long.valueOf(0L), localByteStringMicro1, localByteStringMicro2, Integer.valueOf(0), Long.valueOf(0L), Long.valueOf(0L), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, GroupSyncMsg.class);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     tencent.im.s2c.msgtype0x210.submsgtype0x44.submsgtype0x44.GroupSyncMsg
 * JD-Core Version:    0.7.0.1
 */
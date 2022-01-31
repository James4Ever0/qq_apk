package com.tencent.smtt.sdk;

public abstract interface TbsListener
{
  public static final String tag_load_error = "loaderror";
  
  public abstract void onDownloadFinish(int paramInt);
  
  public abstract void onDownloadProgress(int paramInt);
  
  public abstract void onInstallFinish(int paramInt);
  
  public static abstract interface ErrorCode
  {
    public static final int APK_INVALID = 204;
    public static final int APK_PATH_ERROR = 202;
    public static final int APK_VERSION_ERROR = 203;
    public static final int COPY_EXCEPTION = 215;
    public static final int COPY_FAIL = 212;
    public static final int COPY_INSTALL_SUCCESS = 220;
    public static final int COPY_SRCDIR_ERROR = 213;
    public static final int COPY_TMPDIR_ERROR = 214;
    public static final int CREATE_TEMP_CONF_ERROR = 225;
    public static final int DEXOAT_EXCEPTION = 226;
    public static final int DEXOPT_EXCEPTION = 209;
    public static final int DISK_FULL = 105;
    public static final int DOWNLOAD_FILE_CONTENTLENGTH_NOT_MATCH = 113;
    public static final int DOWNLOAD_HAS_COPY_TBS_ERROR = 122;
    public static final int DOWNLOAD_HAS_LOCAL_TBS_ERROR = 120;
    public static final int DOWNLOAD_INSTALL_SUCCESS = 200;
    public static final int DOWNLOAD_OVER_FLOW = 112;
    public static final int DOWNLOAD_REDIRECT_EMPTY = 124;
    public static final int DOWNLOAD_RETRYTIMES302_EXCEED = 123;
    public static final int DOWNLOAD_SUCCESS = 100;
    public static final int DOWNLOAD_THROWABLE = 125;
    public static final int ERROR_CANLOADVIDEO_RETURN_FALSE = 313;
    public static final int ERROR_CANLOADVIDEO_RETURN_NULL = 314;
    public static final int ERROR_CANLOADX5_RETURN_FALSE = 307;
    public static final int ERROR_CANLOADX5_RETURN_NULL = 308;
    public static final int ERROR_CODE_DOWNLOAD_BASE = 100;
    public static final int ERROR_CODE_INSTALL_BASE = 200;
    public static final int ERROR_CODE_LOAD_BASE = 300;
    public static final int ERROR_GETSTRINGARRAY_JARFILE = 329;
    public static final int ERROR_HOST_UNAVAILABLE = 304;
    public static final int ERROR_QBSDK_INIT_CANLOADX5 = 319;
    public static final int ERROR_QBSDK_INIT_ERROR_EMPTY_BUNDLE = 331;
    public static final int ERROR_QBSDK_INIT_ERROR_RET_TYPE_NOT_BUNDLE = 330;
    public static final int ERROR_QBSDK_INIT_ISSUPPORT = 318;
    public static final int ERROR_TBSCORE_SHARE_DIR = 312;
    public static final int ERROR_TBSINSTALLER_ISTBSCORELEGAL_01 = 321;
    public static final int ERROR_TBSINSTALLER_ISTBSCORELEGAL_02 = 322;
    public static final int ERROR_TBSINSTALLER_ISTBSCORELEGAL_03 = 323;
    public static final int ERROR_UNMATCH_TBSCORE_VER = 303;
    public static final int ERROR_UNMATCH_TBSCORE_VER_THIRDPARTY = 302;
    public static final int EXCEED_COPY_RETRY_NUM = 211;
    public static final int EXCEED_DEXOPT_RETRY_NUM = 208;
    public static final int EXCEED_INCR_UPDATE = 224;
    public static final int EXCEED_LZMA_RETRY_NUM = 223;
    public static final int EXCEED_UNZIP_RETRY_NUM = 201;
    public static final int FILE_DELETED = 106;
    public static final int FILE_RENAME_ERROR = 109;
    public static final int HOST_CONTEXT_IS_NULL = 227;
    public static final int INCRUPDATE_INSTALL_SUCCESS = 221;
    public static final int INCR_UPDATE_ERROR = 216;
    public static final int INCR_UPDATE_EXCEPTION = 218;
    public static final int INCR_UPDATE_FAIL = 217;
    public static final int INFO_CAN_NOT_DISABLED_BY_CRASH = 408;
    public static final int INFO_CAN_NOT_LOAD_TBS = 405;
    public static final int INFO_CAN_NOT_LOAD_X5 = 407;
    public static final int INFO_CAN_NOT_USE_X5_FINAL_REASON = 411;
    public static final int INFO_CAN_NOT_USE_X5_TBS_AVAILABLE = 409;
    public static final int INFO_CAN_NOT_USE_X5_TBS_NOTAVAILABLE = 410;
    public static final int INFO_CODE_BASE = 400;
    public static final int INFO_CODE_FILEREADER_OPENFILEREADER_APKFILE = 506;
    public static final int INFO_CODE_FILEREADER_OPENFILEREADER_COUNTS = 505;
    public static final int INFO_CODE_FILEREADER_OPENFILEREADER_FILEPATHISNULL = 509;
    public static final int INFO_CODE_FILEREADER_OPENFILEREADER_MINIQBFAILED = 511;
    public static final int INFO_CODE_FILEREADER_OPENFILEREADER_MINIQBSUCCESS = 510;
    public static final int INFO_CODE_FILEREADER_OPENFILEREADER_NOTSUPPORT = 507;
    public static final int INFO_CODE_FILEREADER_OPENFILEREADER_OPENINQB = 508;
    public static final int INFO_CODE_MINIQB = 500;
    public static final int INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_COUNTS = 501;
    public static final int INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_FAILED = 504;
    public static final int INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_ISNOTX5CORE = 502;
    public static final int INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_SUCCESS = 503;
    public static final int INFO_COOKIE_SWITCH_NONEED = 703;
    public static final int INFO_COOKIE_SWITCH_NO_KEYS = 701;
    public static final int INFO_COOKIE_SWITCH_REPORT_BASE = 700;
    public static final int INFO_COOKIE_SWITCH_TRANSFER = 704;
    public static final int INFO_COOKIE_SWITCH_VERSION_ERROR = 702;
    public static final int INFO_CORE_EXIST_NOT_LOAD = 418;
    public static final int INFO_DISABLE_X5 = 404;
    public static final int INFO_FORCE_SYSTEM_WEBVIEW_INNER = 401;
    public static final int INFO_FORCE_SYSTEM_WEBVIEW_OUTER = 402;
    public static final int INFO_INFO_MISS_SDKEXTENSION_JAR_WITHOUT_FUSION_DEX_WITHOUT_CORE = 4122;
    public static final int INFO_INFO_MISS_SDKEXTENSION_JAR_WITHOUT_FUSION_DEX_WITH_CORE = 4121;
    public static final int INFO_INITX5_FALSE_DEFAULT = 415;
    public static final int INFO_MISS_SDKEXTENSION_JAR = 403;
    public static final int INFO_MISS_SDKEXTENSION_JAR_OLD = 406;
    public static final int INFO_MISS_SDKEXTENSION_JAR_WITHOUT_FUSION_DEX = 412;
    public static final int INFO_MISS_SDKEXTENSION_JAR_WITH_FUSION_DEX = 413;
    public static final int INFO_MISS_SDKEXTENSION_JAR_WITH_FUSION_DEX_WITHOUT_CORE = 4132;
    public static final int INFO_MISS_SDKEXTENSION_JAR_WITH_FUSION_DEX_WITH_CORE = 4131;
    public static final int INFO_SDKINIT_IS_SYS_FORCED = 414;
    public static final int INFO_TEMP_CORE_EXIST_CONF_ERROR = 417;
    public static final int INFO_USE_BACKUP_FILE_INSTALL_BY_SERVER = 416;
    public static final int NETWORK_NOT_WIFI_ERROR = 111;
    public static final int NETWORK_UNAVAILABLE = 101;
    public static final int NONEEDTODOWN_ERROR = 110;
    public static final int READ_RESPONSE_ERROR = 103;
    public static final int RENAME_EXCEPTION = 219;
    public static final int ROM_NOT_ENOUGH = 210;
    public static final int SERVER_ERROR = 102;
    public static final int TEST_THROWABLE_ISNOT_NULL = 327;
    public static final int TEST_THROWABLE_IS_NULL = 326;
    public static final int THREAD_INIT_ERROR = 121;
    public static final int THROWABLE_INITTESRUNTIMEENVIRONMENT = 328;
    public static final int THROWABLE_INITX5CORE = 325;
    public static final int THROWABLE_QBSDK_INIT = 306;
    public static final int UNKNOWN_ERROR = 107;
    public static final int UNLZMA_FAIURE = 222;
    public static final int UNZIP_DIR_ERROR = 205;
    public static final int UNZIP_IO_ERROR = 206;
    public static final int UNZIP_OTHER_ERROR = 207;
    public static final int VERIFY_ERROR = 108;
    public static final int WRITE_DISK_ERROR = 104;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     com.tencent.smtt.sdk.TbsListener
 * JD-Core Version:    0.7.0.1
 */
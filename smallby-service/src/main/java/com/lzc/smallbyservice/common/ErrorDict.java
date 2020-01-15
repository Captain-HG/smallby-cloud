package com.lzc.smallbyservice.common;

import com.lzc.smallbyservice.config.ErrorCode;

/**
 * @AUTHOR HG-captain
 * @Data 2019/6/14
 * @Description
 */
public class ErrorDict {
    /**
     * 基础错误
     */
    public static final String LOGIN_ERROR = "登录失败";
    public static final String LOGIN_REQUIRED = "请先登录";
    public static final String TOKEN_TIMEOUT = "登录超时";
    public static final String LOGIN_AGAIN = "非法登录，重新登录";
    public static final String PARAMS_REQURIED = "参数缺失";
    public static final String REGISTER_REQUIRED = "请先完成注册";
    public static final String REGISTER_ERROR = "注册失败";
    public static final String PHONE_EXIST = "手机号已被占用";
}

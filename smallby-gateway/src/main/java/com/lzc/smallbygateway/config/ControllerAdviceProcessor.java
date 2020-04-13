package com.lzc.smallbygateway.config;


import com.lzc.smallbygateway.vo.ResultVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.ServletWebRequest;

import java.nio.file.AccessDeniedException;

/**
 * @AUTHOR HG-captain
 * @Data 2019/12/30
 * @Description
 */
@ControllerAdvice
public class ControllerAdviceProcessor {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected MessageSource messageSource;

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultVO<?> handleException(ServletWebRequest request, Exception ex) {

//        String code = BaseResultCode.SYSTEM_ERROR;
//        if (ex instanceof HttpMessageNotReadableException) {
//            code = BaseResultCode.PARAM_ERROR;
//        } else if (ex instanceof HttpRequestMethodNotSupportedException) {
//            code = BaseResultCode.HTTP_METHOD_NOT_SURPPORT;
//        }
//        String msg = null;
          String code =null;
          String msg ="";

        if (ex instanceof MyException) {
            MyException myException = (MyException) ex;
            msg = myException.getMessage();
            code = myException.errorCode.getCode();

        } else if (ex instanceof AccessDeniedException) {
            msg = "无权限访问";
            code = "403";
        }
        if (msg == null) {
            msg = ex.getMessage();
        }
        ResultVO<?> resp = new ResultVO<>();
        resp.setCode(code);
        resp.setMessage(msg);
        logger.error("code: " + code + "  msg: " + msg, ex);
        return resp;
    }
}

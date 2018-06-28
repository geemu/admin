package com.chenfangming.admin.core.exception;

import com.chenfangming.admin.core.constant.HeaderConstantEnum;
import com.chenfangming.admin.core.model.ErrorResponse;
import com.chenfangming.admin.core.util.UnicodeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

/**
 * @author fangming.chen
 * @since 2018-06-15 13：39
 * Email cfmmail@sina.com
 * Description 全局异常拦截 带有@RequestMapping注解的方法都会拦截
 */
@Slf4j
@RestControllerAdvice
public class ExceptionHandle {

    /**
     * 处理请求参数异常 http状态码400
     * @param ie           异常
     * @param httpResponse 返回
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    public ErrorResponse handleIllegalArgumentException(IllegalArgumentException ie, HttpServletResponse httpResponse) {
        log.warn("请求参数异常:{}", ie);
        httpResponse.setIntHeader(HeaderConstantEnum.X_DIALOG_CODE.getHeader(), HttpStatus.BAD_REQUEST.value());
        httpResponse.setHeader(HeaderConstantEnum.X_DIALOG_MESSAGE.getHeader(), UnicodeUtil.toUnicode(ie.getMessage()));
        ErrorResponse response = new ErrorResponse();
        response.setCode(HttpStatus.BAD_REQUEST.value());
        response.setMessage(ie.getMessage());
        return response;
    }

    /**
     * 自定义异常处理 http状态码406 请求的资源的内容特性无法满足请求头中的条件，因而无法生成响应实体
     * @param be           异常
     * @param httpResponse 返回
     */
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    @ExceptionHandler(BusinessException.class)
    public ErrorResponse handleBusinessException(BusinessException be, HttpServletResponse httpResponse) {
        log.warn("自定义异常:{}", be);
        httpResponse.setIntHeader(HeaderConstantEnum.X_DIALOG_CODE.getHeader(), be.getCode());
        httpResponse.setHeader(HeaderConstantEnum.X_DIALOG_MESSAGE.getHeader(), UnicodeUtil.toUnicode(be.getMessage()));
        ErrorResponse response = new ErrorResponse();
        response.setCode(be.getCode());
        response.setMessage(be.getMessage());
        return response;
    }

    /**
     * 服务器未知异常处理 http状态码500
     * @param e            异常
     * @param httpResponse 返回
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ErrorResponse handleException(Exception e, HttpServletResponse httpResponse) {
        log.error("服务器未知Exception异常:{}", e);
        httpResponse.setIntHeader(HeaderConstantEnum.X_DIALOG_CODE.getHeader(), HttpStatus.INTERNAL_SERVER_ERROR.value());
        httpResponse.setHeader(HeaderConstantEnum.X_DIALOG_MESSAGE.getHeader(), UnicodeUtil.toUnicode(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase()));
        ErrorResponse response = new ErrorResponse();
        response.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        response.setMessage(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        return response;
    }
}

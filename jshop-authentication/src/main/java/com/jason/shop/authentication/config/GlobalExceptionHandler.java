package com.jason.shop.authentication.config;

import com.jason.shop.common.base.exception.JshopException;
import com.jason.shop.common.base.model.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(value = JshopException.class)
    @ResponseBody
    public Result defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        return Result.createError(e.getMessage());
    }

}
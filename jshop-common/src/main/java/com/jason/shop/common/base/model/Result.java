package com.jason.shop.common.base.model;

import java.beans.Transient;
import java.util.Map;

public class Result<T> {
    public static final int SUCCESS = 0;
    public static final int VALIDATOR = 1;
    public static final int ERROR = 2;
    public static final int ACCOUNT_ERROR = -1;
    public static final int CLIENT_ERROR = -2;
    public static final int CLIENT_CANCEL = -3;
    public static final String FIELD_STATUS = "status";
    public static final String FIELD_MSG = "msg";
    public static final String FIELD_DATA = "data";
    private int status;
    private String msg;
    private T data;
    private Map<String, Object> msgMap;
    private transient Exception exception;

    public static <T> Result<T> createSuccess() {
        return new Result();
    }

    public static <T> Result<T> createSuccess(T data) {
        return new Result(0, (String)null, data);
    }

    public static <T> Result<T> createError(Exception ex) {
        Result<T> result = new Result();
        result.setStatus(2);
        result.setException(ex);
        return result;
    }

    public static <T> Result<T> createError(Exception ex, String msg) {
        Result<T> result = createError(ex);
        result.setMsg(msg);
        return result;
    }

    public static <T> Result<T> createError(int status, String msg) {
        return new Result(status, msg, (Object)null);
    }

    public static <T> Result<T> createError(String msg) {
        return new Result(2, msg, (Object)null);
    }

    public static <T> Result<T> createCancel() {
        Result<T> result = new Result();
        result.setStatus(-3);
        return result;
    }

    public Result() {
    }

    public Result(int status) {
        this.status = status;
    }

    public Result(int status, T data) {
        this.status = status;
        this.data = data;
    }

    public Result(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Transient
    public boolean isSuccess() {
        return this.status == 0;
    }

    @Transient
    public boolean isClientError() {
        return this.status == 0;
    }

    @Transient
    public Exception getException() {
        return this.exception;
    }

    @Transient
    public void setException(Exception exception) {
        this.exception = exception;
    }

    public String toString() {
        return "Result{status=" + this.status + ", msg='" + this.msg + '\'' + ", data=" + this.data + ", msgMap=" + this.msgMap + '}';
    }

    public Map<String, Object> getMsgMap() {
        return this.msgMap;
    }

    public void setMsgMap(Map<String, Object> msgMap) {
        this.msgMap = msgMap;
    }
}

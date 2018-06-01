package com.jason.shop.common.base.exception;

/**
 * @author qiang on 2018/06/01.
 */
public class JshopException extends RuntimeException {
    public JshopException(String msg) {
        super(msg);
    }

    public static JshopException message(String msg){
        return new JshopException(msg);
    }
}

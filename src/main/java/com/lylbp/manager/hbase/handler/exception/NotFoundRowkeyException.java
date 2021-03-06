package com.lylbp.manager.hbase.handler.exception;

/**
 * 未找到rowKey异常
 * @author weiwenbin
 */
public class NotFoundRowkeyException extends RuntimeException {

    public NotFoundRowkeyException(final String message) {
        super(message);
    }

    public NotFoundRowkeyException(final Class<?> clazz) {
        this("not found rowkey in class " + clazz.getName());
    }

}

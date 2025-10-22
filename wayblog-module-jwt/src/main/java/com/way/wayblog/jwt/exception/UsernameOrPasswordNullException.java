package com.way.wayblog.jwt.exception;


import org.springframework.security.core.AuthenticationException;

/**
 *@Author: way
 *@CreateTime: 2025-09-28  15:35
 *@Description: TODO
 */
public class UsernameOrPasswordNullException extends AuthenticationException {
    public UsernameOrPasswordNullException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public UsernameOrPasswordNullException(String msg) {
        super(msg);
    }
}

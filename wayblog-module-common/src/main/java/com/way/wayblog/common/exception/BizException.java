package com.way.wayblog.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @BelongsProject: wayblog-springboot
 * @BelongsPackage: com.way.wayblog.common.exception
 * @Author: way
 * @CreateTime: 2025-09-24 22:21
 * @Description: TODO
 * @Version: 1.0
 **/
@Setter
@Getter
public class BizException extends RuntimeException {
    // 异常码
    private String errorCode;
    // 错误信息
    private String errorMessage;

    public BizException(BaseExceptionInterface baseExceptionInterface) {
        this.errorCode = baseExceptionInterface.getErrorCode();
        this.errorMessage = baseExceptionInterface.getErrorMessage();
    }
}
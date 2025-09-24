package com.way.wayblog.web.controller;

import com.way.wayblog.common.aspect.ApiOperationLog;
import com.way.wayblog.common.utils.Response;
import com.way.wayblog.web.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

/**
 * @BelongsProject: wayblog-springboot
 * @BelongsPackage: com.way.wayblog.web.controller
 * @Author: way
 * @CreateTime: 2025-09-22 22:19
 * @Description: TODO
 * @Version: 1.0
 **/
@RestController
@Slf4j
public class TestController {
    @PostMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public Response test(@RequestBody @Validated User user) {
//        // 是否存在校验错误
//        if (bindingResult.hasErrors()) {
//            // 获取校验不通过字段的提示信息
//            String errorMsg = bindingResult.getFieldErrors()
//                    .stream()
//                    .map(FieldError::getDefaultMessage)
//                    .collect(Collectors.joining(", "));
//
//            return Response.fail(errorMsg);
//        }
        // 返参
        return Response.success();
    }
}
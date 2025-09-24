package com.way.wayblog.web.controller;

import com.way.wayblog.common.aspect.ApiOperationLog;
import com.way.wayblog.common.utils.JsonUtil;
import com.way.wayblog.common.utils.Response;
import com.way.wayblog.web.model.User;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
    @ApiOperation(value = "测试接口")
    public Response test(@RequestBody @Validated User user) {
        // 打印入参
        log.info(JsonUtil.toJsonString(user));

        // 设置三种日期字段值
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateDate(LocalDate.now());
        user.setTime(LocalTime.now());

        return Response.success(user);
    }
}
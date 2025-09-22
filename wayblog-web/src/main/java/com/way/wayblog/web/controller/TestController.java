package com.way.wayblog.web.controller;

import com.way.wayblog.common.aspect.ApiOperationLog;
import com.way.wayblog.web.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    public User test(@RequestBody User user) {
        // 返参
        return user;
    }
}
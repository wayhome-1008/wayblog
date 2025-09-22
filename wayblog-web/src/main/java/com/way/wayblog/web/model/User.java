package com.way.wayblog.web.model;

import lombok.Data;

/**
 * @BelongsProject: wayblog-springboot
 * @BelongsPackage: com.way.wayblog.web.model
 * @Author: way
 * @CreateTime: 2025-09-22 22:20
 * @Description: TODO
 * @Version: 1.0
 **/
@Data
public class User {
    // 用户名
    private String username;
    // 性别
    private Integer sex;
}
package com.way.wayblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 *@Author: way
 *@CreateTime: 2025-09-28  11:46
 *@Description: Mybatis Plus 配置文件
 */
@Configuration
@MapperScan("com.way.wayblog.common.domain.mapper")
public class MybatisPlusConfig {
}

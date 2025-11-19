package com.way.wayblog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan({"com.way.wayblog.*"}) // 多模块项目中，必需手动指定扫描 com.way.wayblog 包下面的所有类
@EnableScheduling
public class WayblogWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WayblogWebApplication.class, args);
    }

}

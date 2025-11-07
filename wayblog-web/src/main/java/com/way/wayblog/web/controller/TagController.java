package com.way.wayblog.web.controller;

import com.way.wayblog.common.aspect.ApiOperationLog;
import com.way.wayblog.common.utils.Response;
import com.way.wayblog.web.service.TagService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/tag")
@Api(tags = "标签")
public class TagController {

    @Autowired
    private TagService tagService;

    @PostMapping("/list")
    @ApiOperation(value = "前台获取标签列表")
    @ApiOperationLog(description = "前台获取标签列表")
    public Response findTagList() {
        return tagService.findTagList();
    }

}

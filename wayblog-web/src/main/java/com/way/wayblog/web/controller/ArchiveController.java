package com.way.wayblog.web.controller;

import com.way.wayblog.common.aspect.ApiOperationLog;
import com.way.wayblog.common.utils.Response;
import com.way.wayblog.web.model.vo.archive.FindArchiveArticlePageListReqVO;
import com.way.wayblog.web.service.ArchiveService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author: way
 *@CreateTime: 2025-11-10  13:46
 *@Description: TODO
 */
@RestController
@Api(tags = "文章归档")
public class ArchiveController {

    @Autowired
    private ArchiveService archiveService;

    @PostMapping("/archive/list")
    @ApiOperation(value = "获取文章归档分页数据")
    @ApiOperationLog(description = "获取文章归档分页数据")
    public Response findArchivePageList(@RequestBody FindArchiveArticlePageListReqVO findArchiveArticlePageListReqVO) {
        return archiveService.findArchivePageList(findArchiveArticlePageListReqVO);
    }

}


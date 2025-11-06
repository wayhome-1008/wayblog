package com.way.wayblog.admin.controller;

import com.way.wayblog.admin.model.vo.tag.AddTagReqVO;
import com.way.wayblog.admin.model.vo.tag.DeleteTagReqVO;
import com.way.wayblog.admin.model.vo.tag.FindTagPageListReqVO;
import com.way.wayblog.admin.model.vo.tag.SearchTagReqVO;
import com.way.wayblog.admin.service.AdminTagService;
import com.way.wayblog.common.aspect.ApiOperationLog;
import com.way.wayblog.common.utils.PageResponse;
import com.way.wayblog.common.utils.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: wayblog
 * @BelongsPackage: com.way.wayblog.admin.controller
 * @Author: way
 * @CreateTime: 2025-11-06 01:59
 * @Description: TODO
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/admin")
@Api(tags = "Tag 标签 模块")
public class AdminTagController {
    @Autowired
    private AdminTagService adminTagService;

    @PostMapping("/tag/list")
    @ApiOperation(value = "标签分页数据获取")
    @ApiOperationLog(description = "标签分页数据获取")
    public PageResponse findTagList(@RequestBody @Validated FindTagPageListReqVO findTagPageListReqVO) {
        return adminTagService.findTagList(findTagPageListReqVO);
    }


    @PostMapping("/tag/add")
    @ApiOperation(value = "添加标签")
    @ApiOperationLog(description = "添加标签")
    public Response addTag(@RequestBody @Validated AddTagReqVO addTagReqVO) {
        return adminTagService.addTag(addTagReqVO);
    }

    @PostMapping("/tag/delete")
    @ApiOperation(value = "删除分类")
    @ApiOperationLog(description = "删除分类")
    public Response deleteCategory(@RequestBody @Validated DeleteTagReqVO deleteTagReqVO) {
        return adminTagService.deleteTag(deleteTagReqVO);
    }

    @PostMapping("/tag/search")
    @ApiOperation(value = "标签模糊查询")
    @ApiOperationLog(description = "标签模糊查询")
    public Response searchTag(@RequestBody @Validated SearchTagReqVO searchTagReqVO) {
        return adminTagService.searchTag(searchTagReqVO);
    }

    @PostMapping("/tag/select/list")
    @ApiOperation(value = "查询标签 Select 列表数据")
    @ApiOperationLog(description = "查询标签 Select 列表数据")
    public Response findTagSelectList() {
        return adminTagService.findTagSelectList();
    }

}
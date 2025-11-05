package com.way.wayblog.admin.controller;

import com.way.wayblog.admin.model.vo.category.AddCategoryReqVO;
import com.way.wayblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.way.wayblog.admin.model.vo.category.FindCategoryPageListReqVO;
import com.way.wayblog.admin.model.vo.tag.AddTagReqVO;
import com.way.wayblog.admin.service.AdminCategoryService;
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

//    @PostMapping("/category/list")
//    @ApiOperation(value = "分类分页数据获取")
//    @ApiOperationLog(description = "分类分页数据获取")
//    public PageResponse findCategoryList(@RequestBody @Validated FindCategoryPageListReqVO findCategoryPageListReqVO) {
//        return categoryService.findCategoryList(findCategoryPageListReqVO);
//    }


    @PostMapping("/tag/add")
    @ApiOperation(value = "添加标签")
    @ApiOperationLog(description = "添加标签")
    public Response addTag(@RequestBody @Validated AddTagReqVO addTagReqVO) {
        return adminTagService.addTag(addTagReqVO);
    }

//    @PostMapping("/category/delete")
//    @ApiOperation(value = "删除分类")
//    @ApiOperationLog(description = "删除分类")
//    public Response deleteCategory(@RequestBody @Validated DeleteCategoryReqVO deleteCategoryReqVO) {
//        return categoryService.deleteCategory(deleteCategoryReqVO);
//    }
//
//    @PostMapping("/category/select/list")
//    @ApiOperation(value = "分类 Select 下拉列表数据获取")
//    @ApiOperationLog(description = "分类 Select 下拉列表数据获取")
//    public Response findCategorySelectList() {
//        return categoryService.findCategorySelectList();
//    }

}
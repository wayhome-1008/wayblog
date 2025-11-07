package com.way.wayblog.web.model.vo.article;

import com.way.wayblog.common.model.BasePageQuery;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

/**
 *@Author: way
 *@CreateTime: 2025-11-07  10:08
 *@Description: TODO
 */
@Data
@Builder
@ApiModel(value = "首页查询文章分页 VO")
public class FindIndexArticlePageListReqVO extends BasePageQuery {
}


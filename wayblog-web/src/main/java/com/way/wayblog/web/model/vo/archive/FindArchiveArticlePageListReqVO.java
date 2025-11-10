package com.way.wayblog.web.model.vo.archive;

import com.way.wayblog.common.model.BasePageQuery;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

/**
 *@Author: way
 *@CreateTime: 2025-11-10  13:43
 *@Description: TODO
 */
@Data
@Builder
@ApiModel(value = "文章归档分页 VO")
public class FindArchiveArticlePageListReqVO extends BasePageQuery {
}


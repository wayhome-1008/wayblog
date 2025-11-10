package com.way.wayblog.web.model.vo.category;

import com.way.wayblog.common.model.BasePageQuery;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 *@Author: way
 *@CreateTime: 2025-11-10  14:26
 *@Description: TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindCategoryArticlePageListReqVO extends BasePageQuery {
    /**
     * 分类 ID
     */
    @NotNull(message = "分类 ID 不能为空")
    private Long id;

}


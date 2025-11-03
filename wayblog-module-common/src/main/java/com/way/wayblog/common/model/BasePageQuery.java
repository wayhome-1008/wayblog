package com.way.wayblog.common.model;

import lombok.Data;

/**
 *@Author: way
 *@CreateTime: 2025-11-03  14:55
 *@Description: TODO
 */
@Data
public class BasePageQuery {
    /**
     * 当前页码, 默认第一页
     */
    private Long current = 1L;
    /**
     * 每页展示的数据数量，默认每页展示 10 条数据
     */
    private Long size = 10L;
}



package com.way.wayblog.web.service;

import com.way.wayblog.common.utils.Response;

public interface CategoryService {
    /**
     * 获取分类列表
     * @return
     */
    Response findCategoryList();
}


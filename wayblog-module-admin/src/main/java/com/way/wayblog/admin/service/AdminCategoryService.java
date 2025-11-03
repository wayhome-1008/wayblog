package com.way.wayblog.admin.service;

import com.way.wayblog.admin.model.vo.category.AddCategoryReqVO;
import com.way.wayblog.common.utils.Response;

public interface AdminCategoryService {
    /**
     * 添加分类
     * @param addCategoryReqVO
     * @return
     */
    Response addCategory(AddCategoryReqVO addCategoryReqVO);
}

package com.way.wayblog.web.service;

import com.way.wayblog.common.utils.Response;

public interface TagService {
    /**
     * 获取标签列表
     * @return
     */
    Response findTagList();
}


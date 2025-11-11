package com.way.wayblog.web.service;

import com.way.wayblog.common.utils.Response;
import com.way.wayblog.web.model.vo.tag.FindTagArticlePageListReqVO;

public interface TagService {
    /**
     * 获取标签列表
     * @return
     */
    Response findTagList();

    /**
     * 获取标签下文章分页列表
     * @param findTagArticlePageListReqVO
     * @return
     */
    Response findTagPageList(FindTagArticlePageListReqVO findTagArticlePageListReqVO);
}


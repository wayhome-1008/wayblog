package com.way.wayblog.admin.service;

import com.way.wayblog.admin.model.vo.article.PublishArticleReqVO;
import com.way.wayblog.common.utils.Response;

public interface AdminArticleService {
    /**
     * 发布文章
     * @param publishArticleReqVO
     * @return
     */
    Response publishArticle(PublishArticleReqVO publishArticleReqVO);
}


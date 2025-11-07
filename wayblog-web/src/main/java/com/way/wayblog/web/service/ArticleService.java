package com.way.wayblog.web.service;

import com.way.wayblog.common.utils.Response;
import com.way.wayblog.web.model.vo.article.FindIndexArticlePageListReqVO;

public interface ArticleService {
    /**
     * 获取首页文章分页数据
     * @param findIndexArticlePageListReqVO
     * @return
     */
    Response findArticlePageList(FindIndexArticlePageListReqVO findIndexArticlePageListReqVO);
}


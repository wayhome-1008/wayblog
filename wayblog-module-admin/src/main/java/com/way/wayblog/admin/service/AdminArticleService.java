package com.way.wayblog.admin.service;

import com.way.wayblog.admin.model.vo.article.DeleteArticleReqVO;
import com.way.wayblog.admin.model.vo.article.FindArticleDetailReqVO;
import com.way.wayblog.admin.model.vo.article.FindArticlePageListReqVO;
import com.way.wayblog.admin.model.vo.article.PublishArticleReqVO;
import com.way.wayblog.common.utils.Response;

public interface AdminArticleService {
    /**
     * 发布文章
     * @param publishArticleReqVO
     * @return
     */
    Response publishArticle(PublishArticleReqVO publishArticleReqVO);

    /**
     * 删除文章
     * @param deleteArticleReqVO
     * @return
     */
    Response deleteArticle(DeleteArticleReqVO deleteArticleReqVO);

    /**
     * 查询文章分页数据
     * @param findArticlePageListReqVO
     * @return
     */
    Response findArticlePageList(FindArticlePageListReqVO findArticlePageListReqVO);

    /**
     * 查询文章详情
     * @param findArticleDetailReqVO
     * @return
     */
    Response findArticleDetail(FindArticleDetailReqVO findArticleDetailReqVO);
}


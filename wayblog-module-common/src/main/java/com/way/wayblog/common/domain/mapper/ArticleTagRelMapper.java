package com.way.wayblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.way.wayblog.common.config.InsertBatchMapper;
import com.way.wayblog.common.domain.dos.ArticleTagRelDO;

public interface ArticleTagRelMapper extends InsertBatchMapper<ArticleTagRelDO> {
    /**
     * 根据文章 ID 删除关联记录
     * @param articleId
     * @return
     */
    default int deleteByArticleId(Long articleId) {
        return delete(Wrappers.<ArticleTagRelDO>lambdaQuery()
                .eq(ArticleTagRelDO::getArticleId, articleId));
    }
}


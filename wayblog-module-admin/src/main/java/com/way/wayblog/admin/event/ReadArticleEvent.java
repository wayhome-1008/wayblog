package com.way.wayblog.admin.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 *@Author: way
 *@CreateTime: 2025-11-19  16:21
 *@Description: TODO
 */
@Getter
public class ReadArticleEvent extends ApplicationEvent {

    /**
     * 文章 ID
     */
    private Long articleId;

    public ReadArticleEvent(Object source, Long articleId) {
        super(source);
        this.articleId = articleId;
    }
}

package com.way.wayblog.web.model.vo.blogSettings;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *@Author: way
 *@CreateTime: 2025-11-07  11:05
 *@Description: TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindBlogSettingsDetailRspVO {
    private String logo;
    private String name;
    private String author;
    private String introduction;
    private String avatar;
    private String githubHomepage;
    private String csdnHomepage;
    private String giteeHomepage;
    private String zhihuHomepage;
}


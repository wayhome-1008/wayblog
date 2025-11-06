package com.way.wayblog.admin.service;

import com.way.wayblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.way.wayblog.common.utils.Response;

public interface AdminBlogSettingsService {
    /**
     * 更新博客设置信息
     * @param updateBlogSettingsReqVO
     * @return
     */
    Response updateBlogSettings(UpdateBlogSettingsReqVO updateBlogSettingsReqVO);
}


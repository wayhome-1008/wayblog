package com.way.wayblog.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.way.wayblog.admin.convert.BlogSettingsConvert;
import com.way.wayblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.way.wayblog.admin.service.AdminBlogSettingsService;
import com.way.wayblog.common.domain.dos.BlogSettingsDO;
import com.way.wayblog.common.domain.mapper.BlogSettingsMapper;
import com.way.wayblog.common.utils.Response;
import org.springframework.stereotype.Service;

/**
 *@Author: way
 *@CreateTime: 2025-11-06  13:57
 *@Description: TODO
 */
@Service
public class AdminBlogSettingsServiceImpl extends ServiceImpl<BlogSettingsMapper, BlogSettingsDO> implements AdminBlogSettingsService {

    @Override
    public Response updateBlogSettings(UpdateBlogSettingsReqVO updateBlogSettingsReqVO) {
        // VO 转 DO
        BlogSettingsDO blogSettingsDO = BlogSettingsConvert.INSTANCE.convertVO2DO(updateBlogSettingsReqVO);
        blogSettingsDO.setId(1L);

        // 保存或更新（当数据库中存在 ID 为 1 的记录时，则执行更新操作，否则执行插入操作）
        saveOrUpdate(blogSettingsDO);
        return Response.success();
    }
}


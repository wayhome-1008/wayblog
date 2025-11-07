package com.way.wayblog.web.service.impl;


import com.way.wayblog.common.domain.dos.BlogSettingsDO;
import com.way.wayblog.common.domain.mapper.BlogSettingsMapper;
import com.way.wayblog.common.utils.Response;
import com.way.wayblog.web.convert.BlogSettingsConvert;
import com.way.wayblog.web.model.vo.blogSettings.FindBlogSettingsDetailRspVO;
import com.way.wayblog.web.service.BlogSettingsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *@Author: way
 *@CreateTime: 2025-11-07  11:06
 *@Description: TODO
 */
@Service
@Slf4j
public class BlogSettingsServiceImpl implements BlogSettingsService {

    @Autowired
    private BlogSettingsMapper blogSettingsMapper;

    /**
     * 获取博客设置信息
     *
     * @return
     */
    @Override
    public Response findDetail() {
        // 查询博客设置信息（约定的 ID 为 1）
        BlogSettingsDO blogSettingsDO = blogSettingsMapper.selectById(1L);
        // DO 转 VO
        FindBlogSettingsDetailRspVO vo = BlogSettingsConvert.INSTANCE.convertDO2VO(blogSettingsDO);

        return Response.success(vo);
    }
}


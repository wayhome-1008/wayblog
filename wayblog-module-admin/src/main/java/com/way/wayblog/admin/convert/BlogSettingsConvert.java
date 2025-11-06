package com.way.wayblog.admin.convert;

import com.way.wayblog.admin.model.vo.blogsettings.FindBlogSettingsRspVO;
import com.way.wayblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.way.wayblog.common.domain.dos.BlogSettingsDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 *@Author: way
 *@CreateTime: 2025-11-06  14:12
 *@Description: TODO
 */
@Mapper
public interface BlogSettingsConvert {
    /**
     * 初始化 convert 实例
     */
    BlogSettingsConvert INSTANCE = Mappers.getMapper(BlogSettingsConvert.class);

    /**
     * 将 VO 转化为 DO
     * @param bean
     * @return
     */
    BlogSettingsDO convertVO2DO(UpdateBlogSettingsReqVO bean);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    FindBlogSettingsRspVO convertDO2VO(BlogSettingsDO bean);
}


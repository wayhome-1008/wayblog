package com.way.wayblog.admin.service;

import com.way.wayblog.admin.model.vo.tag.AddTagReqVO;
import com.way.wayblog.common.utils.Response;

/**
 * @BelongsProject: wayblog
 * @BelongsPackage: com.way.wayblog.admin.service
 * @Author: way
 * @CreateTime: 2025-11-06 02:01
 * @Description: TODO
 * @Version: 1.0
 **/
public interface AdminTagService {
    Response addTag(AddTagReqVO addTagReqVO);
}
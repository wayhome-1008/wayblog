package com.way.wayblog.admin.service;

import com.way.wayblog.admin.model.vo.UpdateAdminUserPasswordReqVO;
import com.way.wayblog.common.utils.Response;

public interface AdminUserService {
    /**
     * 修改密码
     * @param updateAdminUserPasswordReqVO
     * @return
     */
    Response updatePassword(UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO);
}

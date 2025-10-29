package com.way.wayblog.admin.service;

import com.way.wayblog.admin.model.vo.user.UpdateAdminUserPasswordReqVO;
import com.way.wayblog.common.utils.Response;

public interface AdminUserService {
    /**
     * 修改密码
     * @param updateAdminUserPasswordReqVO
     * @return
     */
    Response updatePassword(UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO);
    /**
     * 获取当前登录用户信息
     * @return
     */
    Response findUserInfo();
}

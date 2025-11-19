package com.way.wayblog.admin.service;

import com.way.wayblog.common.utils.Response;

public interface AdminDashboardService {
    /**
     * 获取仪表盘基础统计信息
     * @return
     */
    Response findDashboardStatistics();
}

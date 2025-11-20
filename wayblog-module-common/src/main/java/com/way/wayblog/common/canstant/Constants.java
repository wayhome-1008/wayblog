package com.way.wayblog.common.canstant;

import java.time.format.DateTimeFormatter;

/**
 *@Author: way
 *@CreateTime: 2025-11-20  10:06
 *@Description: TODO
 */
public interface Constants {
    /**
     * 月-日 格式
     */
    DateTimeFormatter MONTH_DAY_FORMATTER = DateTimeFormatter.ofPattern("MM-dd");
}

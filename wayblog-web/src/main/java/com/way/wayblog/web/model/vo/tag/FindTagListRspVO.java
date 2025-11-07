package com.way.wayblog.web.model.vo.tag;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *@Author: way
 *@CreateTime: 2025-11-07  10:08
 *@Description: TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindTagListRspVO {
    private Long id;
    private String name;
}

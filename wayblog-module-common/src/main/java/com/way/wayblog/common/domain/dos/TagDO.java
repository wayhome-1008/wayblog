package com.way.wayblog.common.domain.dos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @BelongsProject: wayblog
 * @BelongsPackage: com.way.wayblog.common.domain.dos
 * @Author: way
 * @CreateTime: 2025-11-06 01:57
 * @Description: TODO
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("t_tag")
public class TagDO {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Boolean isDeleted;
}
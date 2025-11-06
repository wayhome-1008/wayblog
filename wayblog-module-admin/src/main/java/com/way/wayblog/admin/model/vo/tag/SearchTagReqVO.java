package com.way.wayblog.admin.model.vo.tag;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @BelongsProject: wayblog
 * @BelongsPackage: com.way.wayblog.admin.model.vo.tag
 * @Author: way
 * @CreateTime: 2025-11-06 02:48
 * @Description: TODO
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "标签模糊查询 VO")
public class SearchTagReqVO {
    @NotBlank(message = "关键字不能为空")
    private String key;
}
package com.way.wayblog.admin.model.vo.tag;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @BelongsProject: wayblog
 * @BelongsPackage: com.way.wayblog.admin.model.vo.tag
 * @Author: way
 * @CreateTime: 2025-11-06 02:41
 * @Description: TODO
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "删除标签 VO")
public class DeleteTagReqVO {
    @NotNull(message = "标签 ID 不能为空")
    private Long id;
}
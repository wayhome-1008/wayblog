package com.way.wayblog.admin.model.vo.tag;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @BelongsProject: wayblog
 * @BelongsPackage: com.way.wayblog.admin.model.vo.tag
 * @Author: way
 * @CreateTime: 2025-11-06 02:04
 * @Description: TODO
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "添加标签 VO")
public class AddTagReqVO {
    @NotEmpty(message = "标签不能为空")
    private List<String> tags;
}
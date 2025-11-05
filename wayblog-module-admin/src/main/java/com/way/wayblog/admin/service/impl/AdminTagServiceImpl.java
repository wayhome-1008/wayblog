package com.way.wayblog.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.way.wayblog.admin.model.vo.tag.AddTagReqVO;
import com.way.wayblog.admin.service.AdminTagService;
import com.way.wayblog.common.domain.dos.TagDO;
import com.way.wayblog.common.domain.mapper.TagMapper;
import com.way.wayblog.common.utils.Response;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @BelongsProject: wayblog
 * @BelongsPackage: com.way.wayblog.admin.service.impl
 * @Author: way
 * @CreateTime: 2025-11-06 02:01
 * @Description: TODO
 * @Version: 1.0
 **/
@Service
@Slf4j
public class AdminTagServiceImpl extends ServiceImpl<TagMapper, TagDO> implements AdminTagService {
    @Autowired
    private TagMapper tagMapper;

    @Override
    public Response addTag(AddTagReqVO addTagReqVO) {
        List<TagDO> tagDOS = addTagReqVO.getTags()
                .stream()
                .map(tagName -> TagDO.builder()
                        .name(tagName.trim())
                        .createTime(LocalDateTime.now())
                        .updateTime(LocalDateTime.now()).build())
                .collect(Collectors.toList());
        try {
            this.saveBatch(tagDOS);
        } catch (Exception e) {
            log.error("add tag error", e);
        }
        return Response.success();
    }
}
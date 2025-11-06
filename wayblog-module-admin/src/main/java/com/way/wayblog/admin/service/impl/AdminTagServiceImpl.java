package com.way.wayblog.admin.service.impl;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.way.wayblog.admin.model.vo.tag.*;
import com.way.wayblog.admin.service.AdminTagService;
import com.way.wayblog.common.domain.dos.TagDO;
import com.way.wayblog.common.domain.mapper.TagMapper;
import com.way.wayblog.common.enums.ResponseCodeEnum;
import com.way.wayblog.common.model.vo.SelectRspVO;
import com.way.wayblog.common.utils.PageResponse;
import com.way.wayblog.common.utils.Response;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

    @Override
    public PageResponse findTagList(FindTagPageListReqVO findTagPageListReqVO) {
        Long current = findTagPageListReqVO.getCurrent();
        Long size = findTagPageListReqVO.getSize();
        String name = findTagPageListReqVO.getName();
        LocalDate startDate = findTagPageListReqVO.getStartDate();
        LocalDate endDate = findTagPageListReqVO.getEndDate();
        Page<TagDO> tagDOPage = tagMapper.selectPageList(current, size, name, startDate, endDate);
        List<TagDO> tagDOS = tagDOPage.getRecords();
        //do->vo
        List<FindTagPageListRspVO> vos = null;
        if (!CollectionUtils.isEmpty(tagDOS)) {
            vos = tagDOS.stream().map(tagDO -> FindTagPageListRspVO.builder()
                    .id(tagDO.getId())
                    .name(tagDO.getName())
                    .createTime(tagDO.getCreateTime())
                    .build()).collect(Collectors.toList());
        }
        return PageResponse.success(tagDOPage, vos);
    }

    @Override
    public Response deleteTag(DeleteTagReqVO deleteTagReqVO) {
        Long id = deleteTagReqVO.getId();
        int count = tagMapper.deleteById(id);
        return count == 1 ? Response.success() : Response.fail(ResponseCodeEnum.TAG_NOT_EXIST);
    }

    @Override
    public Response searchTag(SearchTagReqVO searchTagReqVO) {
        String key = searchTagReqVO.getKey();
        List<TagDO> tagDOS = tagMapper.selectByKey(key);
        //do->vo
        List<SelectRspVO> vos = null;
        if (!CollectionUtils.isEmpty(tagDOS)) {
            vos = tagDOS.stream().map(tagDO -> SelectRspVO.builder()
                    .label(tagDO.getName())
                    .value(tagDO.getId())
                    .build()).collect(Collectors.toList());
        }
        return Response.success(vos);
    }
}
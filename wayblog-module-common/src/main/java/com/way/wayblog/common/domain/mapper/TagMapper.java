package com.way.wayblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.way.wayblog.common.domain.dos.TagDO;

import java.time.LocalDate;
import java.util.List;

public interface TagMapper extends BaseMapper<TagDO> {
    default Page<TagDO> selectPageList(long current, long size, String name, LocalDate createTime, LocalDate endTime) {
        Page<TagDO> page = new Page<>(current, size);
        LambdaQueryWrapper<TagDO> wrapper = new LambdaQueryWrapper<>();
        wrapper
                .like(name != null, TagDO::getName, name)
                .ge(createTime != null, TagDO::getCreateTime, createTime)
                .le(endTime != null, TagDO::getCreateTime, endTime)
                .orderByDesc(TagDO::getCreateTime);
        return this.selectPage(page, wrapper);
    }

    default List<TagDO> selectByKey(String key) {
        LambdaQueryWrapper<TagDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(TagDO::getName, key)
                .orderByDesc(TagDO::getCreateTime);
        return this.selectList(wrapper);
    }
}

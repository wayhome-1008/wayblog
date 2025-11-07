package com.way.wayblog.web.service.impl;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.way.wayblog.common.domain.dos.CategoryDO;
import com.way.wayblog.common.domain.mapper.CategoryMapper;
import com.way.wayblog.common.utils.Response;
import com.way.wayblog.web.model.vo.category.FindCategoryListRspVO;
import com.way.wayblog.web.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 *@Author: way
 *@CreateTime: 2025-11-07  11:01
 *@Description: TODO
 */
@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 获取分类列表
     *
     * @return
     */
    @Override
    public Response findCategoryList() {
        // 查询所有分类
        List<CategoryDO> categoryDOS = categoryMapper.selectList(Wrappers.emptyWrapper());

        // DO 转 VO
        List<FindCategoryListRspVO> vos = null;
        if (!CollectionUtils.isEmpty(categoryDOS)) {
            vos = categoryDOS.stream()
                    .map(categoryDO -> FindCategoryListRspVO.builder()
                            .id(categoryDO.getId())
                            .name(categoryDO.getName())
                            .build())
                    .collect(Collectors.toList());
        }

        return Response.success(vos);
    }
}


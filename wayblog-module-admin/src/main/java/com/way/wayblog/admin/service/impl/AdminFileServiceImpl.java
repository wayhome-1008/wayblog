package com.way.wayblog.admin.service.impl;

import com.way.wayblog.admin.model.vo.file.UploadFileRspVO;
import com.way.wayblog.admin.service.AdminFileService;
import com.way.wayblog.admin.utils.MinioUtil;
import com.way.wayblog.common.enums.ResponseCodeEnum;
import com.way.wayblog.common.exception.BizException;
import com.way.wayblog.common.utils.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *@Author: way
 *@CreateTime: 2025-11-06  13:46
 *@Description: TODO
 */
@Service
@Slf4j
public class AdminFileServiceImpl implements AdminFileService {

    @Autowired
    private MinioUtil minioUtil;

    /**
     * 上传文件
     *
     * @param file
     * @return
     */
    @Override
    public Response uploadFile(MultipartFile file) {
        try {
            // 上传文件
            String url = minioUtil.uploadFile(file);

            // 构建成功返参，将图片的访问链接返回
            return Response.success(UploadFileRspVO.builder().url(url).build());
        } catch (Exception e) {
            log.error("==> 上传文件至 Minio 错误: ", e);
            // 手动抛出业务异常，提示 “文件上传失败”
            throw new BizException(ResponseCodeEnum.FILE_UPLOAD_FAILED);
        }
    }
}


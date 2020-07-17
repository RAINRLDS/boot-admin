package com.hb0730.boot.admin.oss.configuration.properties.impl;

import com.hb0730.boot.admin.model.enums.AttachmentTypeEnum;
import com.hb0730.boot.admin.oss.configuration.properties.OssProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 阿里云oss
 * </P>
 *
 * @author bing_huang
 * @since V1.0
 */
@Data
@ConfigurationProperties(prefix = "boot.admin.oss.aliyun")
@Configuration
public class AliOssProperties implements OssProperties {
    /**
     * Endpoint
     */
    private String endPoint;
    /**
     * AccessKey
     */
    private String accessKey;
    /**
     * accessKeySecret
     */
    private String accessSecret;

    /**
     *
     */
    private String bucketName;

    /**
     * 设置图片处理样式
     */
    private String styleRule;

    /**
     * 缩略样式
     */
    private String thumbnailStyleRule;

    @Override
    public boolean supportType(AttachmentTypeEnum type) {
        return AttachmentTypeEnum.ALIOSS.equals(type);
    }
}

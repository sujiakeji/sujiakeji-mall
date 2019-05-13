package com.sujiakeji.mall.util.common;

import com.sujiakeji.mall.config.StorageConfig;
import com.sujiakeji.mall.dto.common.StorageUriDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StorageUtils {

    @Autowired
    private StorageConfig storageConfig;

    public StorageUriDto convertToDto(String path) {
        StorageUriDto dto = null;
        if (path != null && path.length() > 0) {
            dto = new StorageUriDto();
            dto.setPath(path);
            dto.setUrl(storageConfig.getBaseUrl() + path);
        }
        return dto;
    }

}
package com.sujiakeji.mall.service;

import com.sujiakeji.mall.constant.ApiConstants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(name = "${merService.baseUrl}")
public interface MerService {

    @RequestMapping(method = RequestMethod.GET, value = ApiConstants.MER_GET_BY_ID)
    String getById(@RequestParam(value = "id") Long id);

}
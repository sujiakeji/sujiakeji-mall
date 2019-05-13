package com.sujiakeji.mall.controller;

import com.sujiakeji.mall.service.MerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mer")
public class MerController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MerService merService;

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public String get(@RequestParam(value = "id") Long id) {
        return merService.getById(id);
    }

}

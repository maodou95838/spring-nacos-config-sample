package com.jackie.nacos.config.service.a.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * NacosConfigController
 *
 * @author Jackie Hou
 * @date 2024/7/31 16:41
 * @version 1.0
 */
@RestController
@Slf4j
public class NacosConfigController {

    @GetMapping("/config")
    public String get() {
        log.info("------config controller-------, info = {}", info);
        log.info("databaseString = {}", dataBaseString);
        return dataBaseString + "----" + info;
    }

    @Value("${info:localData}")
    private String info;

    @Value("${spring.datasource.url:No database connection string found.}")
    private String dataBaseString;
}

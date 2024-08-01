package com.jackie.nacos.config.sample.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import lombok.extern.slf4j.Slf4j;
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
@NacosPropertySource(dataId = "example", autoRefreshed = true)
@Slf4j
public class NacosConfigController {

    @GetMapping("/config")
    public String get() {
        log.info("------config controller-------, info = {}", info);
        return info;
    }

    //注意这个默认值的写法，":"前后不能有空格
    @NacosValue(value="${info:local data}", autoRefreshed = true)
    private String info;
}

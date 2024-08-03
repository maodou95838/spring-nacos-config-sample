package com.jackie.nacos.config.service.b.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * NacosConfigController
 *
 * @author Jackie Hou
 * @date 2024/8/2 19:39
 * @version 1.0
 */
@RestController
@RequestMapping("/b")
public class NacosConfigController {

    @GetMapping("/getData")
    public String getData() {
        System.out.println("info = " + info);
        return info;
    }


    @Value("${info:Not get!")
    private String info;
}

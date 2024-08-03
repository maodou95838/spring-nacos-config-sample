package com.jackie.nacos.config.service.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Application
 *
 * @author Jackie Hou
 * @date 2024/7/31 16:34
 * @version 1.0
 */
@SpringBootApplication
public class ServiceaApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ServiceaApplication.class, args);
        String info = context.getEnvironment().getProperty("info");
        System.out.println(info);
    }
}

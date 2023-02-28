package com.ryxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.5.1以后版本可以跳过此步，不需要 @ForestScan 注解来指定扫描的包范围
 */
//@ForestScan(basePackages = "com.ryxx.controller")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

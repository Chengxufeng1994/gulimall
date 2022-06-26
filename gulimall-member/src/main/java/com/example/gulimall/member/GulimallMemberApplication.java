package com.example.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1. 想要遠程調用別的服務
 * 1. 引入 open-feign
 * 2. 編寫一個 interface,告訴 SpringCloud 這個 interface 需要調用遠程服務
 * 3. 開啟遠程調用功能
 */
@EnableFeignClients(basePackages = "com.example.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}

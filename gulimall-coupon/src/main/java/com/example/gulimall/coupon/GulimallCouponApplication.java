package com.example.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1. 如何使用 Nacos 作為配置中心統一管理配置
 *
 *  1. 引入依賴
 *         <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 *
 *         <dependency>
 *             <groupId>org.springframework.cloud</groupId>
 *             <artifactId>spring-cloud-starter-bootstrap</artifactId>
 *         </dependency>
 *   2. 創建 bootstrap.properties
 *      spring.application.name=gulimall-coupon
 *      spring.cloud.nacos.config.server-addr=192.168.56.10:8848
 *   3. 需要給配置中心默認添加一個叫 數據集 (Data Id) gulimall-coupon.properties 默認規則. 應用名.properties
 *   4. 給應用名.properties 添加任何配置
 *   5. 動態獲取配置
 *      @RefresScope
 *      @Valur
 *  2. 細節
 *      1. 命名空間, 配置隔離
 *      2. 配置集
 *      3. 配置集 ID
 *      4. 配置分組
 *  3. 同時加載多個配置集
 *      1. 微服務任何配置訊息, 任何配置文件都可以放在配置中心
 *      2. 只需在 bootstrap.properties 配置即可
 *      3. @Value, @ConfigurationProperties...
 */


@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}

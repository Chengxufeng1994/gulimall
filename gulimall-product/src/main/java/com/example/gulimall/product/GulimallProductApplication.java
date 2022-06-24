package com.example.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 整合 MyBatis-Plus
 *  1. 導入依賴
 *          <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 *  2. 配置
 *      1. 配置數據源
 *          1. 導入數據庫驅動
 *          2. application.yml 配置數據源相關訊息
 *      2. 配置 MyBatis-Plus
 *          1. 使用 @MapperScan
 *          2. 告訴 MyBatisPlus, sql 映射文件
 */

@MapperScan("com.example.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}

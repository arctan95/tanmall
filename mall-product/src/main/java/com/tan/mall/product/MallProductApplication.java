package com.tan.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description 1、整合MyBatis-Plus
 *                  1）导入依赖
 *                 <dependency>
 *                     <groupId>com.baomidou</groupId>
 *                     <artifactId>mybatis-plus-boot-starter</artifactId>
 *                     <version>3.2.0</version>
 *                 </dependency>
 *                  2）配置
 *                  i.配置数据源
 *                      -导入数据库驱动
 *                      -在application.yml配置数据源相关信息
 *                  ii.配置MyBatis-Plus
 *                      -使用@MapperScan
 *                      -告诉MyBatis-Plus，sql映射文件位置
 *              2、逻辑删除
 *                  1）配置全局的逻辑删除规则（省略）
 *                  2）配置逻辑删除的组件Bean（3.1.1开始可以省略）
 *                  3）给Bean字段加上逻辑删除注解@TableLogic
 * @author tan
 * @date 2020/10/10 21:32
 * @param null
 * @return
 **/
@MapperScan("com.tan.mall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}

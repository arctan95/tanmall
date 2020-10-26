package com.tan.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @param null
 * @author tan
 * @description
 * 1、整合MyBatis-Plus
 * 1）导入依赖
 *      <dependency>
 *          <groupId>com.baomidou</groupId>
 *          <artifactId>mybatis-plus-boot-starter</artifactId>
 *          <version>3.2.0</version>
 *      </dependency>
 * 2）配置
 *      i.配置数据源
 *          -导入数据库驱动
 *          -在application.yml配置数据源相关信息
 *      ii.配置MyBatis-Plus
 *          -使用@MapperScan
 *          -告诉MyBatis-Plus，sql映射文件位置
 * 2、逻辑删除
 *      1）配置全局的逻辑删除规则（省略）
 *      2）配置逻辑删除的组件Bean（3.1.1开始可以省略）
 *      3）给Bean字段加上逻辑删除注解@TableLogic
 *
 * 3、JSR303
 *      1）给Bean添加校验注解，并定义自己的message提示
 *      2）开启校验功能@Valid
 *      3) 给校验的bean后紧跟一个BindingResult即可获取到校验结果
 * @date 2020/10/10 21:32
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

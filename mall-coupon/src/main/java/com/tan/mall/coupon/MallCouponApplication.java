package com.tan.mall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description 1.使用Nacos作为配置中心统一管理配置
 *                  1）引入依赖
 *                          <dependency>
 *                             <groupId>com.alibaba.cloud</groupId>
 *                             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *                         </dependency>
 *                  2）创建一个bootstrap.properties
 *                      spring.application.name=mall-coupon
 *                      spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *                  3)给配置中心添加一个默认叫 数据集（Data Id） mall-coupon.properties的默认规则，应用名.propertites
 *                  4）给 应用名.propertites 添加任何配置
 *                  5）动态获取配置
 *                      @RefreshScope：动态获取并刷新配置
 *                      @Value("${配置项的名}")：获取到配置
 *                      如果配置中心和当前应用的配置文件都配置了相同的项，优先使用配置中心的配置
 *              2.细节
 *                  1）命名空间：配置隔离：
 *                      默认：public(保留空间)：默认新增的所有配置都在public空间
 *                      i.开发、测试、生成：利用命名空间做环境隔离
 *                          注意：在bootstrap.properties:配置上需要使用哪个命名空间下的配置
 *                          spring.cloud.nacos.config.namespace=5c3caedb-77eb-4807-97fe-bf2bb1fd8058
 *                      ii.每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
 *                  2）配置集：所有配置的集合
 *                  3）配置集ID：类似配置文件名
 *                      Data ID：文件名，例：mall-coupon.properties
 *                  4）配置分组
 *                      默认所有的配置集都属于DEFAULT_GROUP
 *                  本项目中，每个微服务创建自己的命名空间，使用配置分组区分环境:dev、test、prod
 *              3.同时加载多个配置集
 *                  1）微服务任何配置信息，任何配置文件都可以放在配置中心中
 *                  2）只需要在bootstrap.properties说明加载哪些配置文件即可
 *                  3）@Value,@ConfigurationProperties...以前SpringBoot任何方法从配置文件中获取值，都能使用
 *                  配置中心有的优先使用配置中心的
 *
 * @author tan
 * @date 2020/10/12 12:47
 * @param null
 * @return
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class MallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCouponApplication.class, args);
    }

}

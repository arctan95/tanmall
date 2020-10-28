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
 *      4）分组校验（多场景的复杂校验）
 *          i.@NotBlank(message = "品牌名不能为空",groups = {AddGroup.class,UpdateGroup.class})
 *          给校验注解标注什么情况需要进行校验
 *          ii.@Validated({AddGroup.class})
 *          iii.默认没有指定分组的校验注解@NotBlank，在分组校验情况下@Validated({AddGroup.class})不生效，只会在@Validated下生效
 *
 *      5) 自定义校验
 *          i.编写一个自定义的校验注解
 *          ii.编写一个自定义的校验器 ConstraintValidator
 *          iii.关联自定义的校验器和自定义的校验注解
 *              @Documented
 *              @Constraint(validatedBy = {ListValueConstraintValidator.class}) // 可以指定多个不同的校验器，适配不同类型的校验
 *              @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
 *              @Retention(RUNTIME)
 * 4、统一异常处理
 *      1) 编写异常处理类，使用@ControllerAdvice
 *      2）使用@ExceptionHandler标注方法可以处理的异常类型
 *
 *
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

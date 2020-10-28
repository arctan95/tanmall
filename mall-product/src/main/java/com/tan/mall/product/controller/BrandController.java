package com.tan.mall.product.controller;

import com.tan.common.utils.PageUtils;
import com.tan.common.utils.R;
import com.tan.common.valid.AddGroup;
import com.tan.common.valid.UpdateGroup;
import com.tan.common.valid.UpdateStatusGroup;
import com.tan.mall.product.entity.BrandEntity;
import com.tan.mall.product.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 品牌
 *
 * @author arctan95
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 20:59:31
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:brand:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    //@RequiresPermissions("product:brand:info")
    public R info(@PathVariable("brandId") Long brandId) {
        BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:brand:save")
    public R save(@Validated({AddGroup.class}) @RequestBody BrandEntity brand/*,BindingResult result*/) {

//        if (result.hasErrors()) {
//            Map<String, String> map = new HashMap<>();
//            // 获取校验的错误结果
//            result.getFieldErrors().forEach((item) -> {
//                //FieldError  获取到错误提示
//                String message = item.getDefaultMessage();
//                //获取错误对应的属性名
//                String field = item.getField();
//                map.put(field, message);
//            });
//            return R.error(400, "提交的数据不合法").put("data",map);
//        } else {
//
//        }
        brandService.save(brand);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:brand:update")
    public R update(@Validated({UpdateGroup.class}) @RequestBody BrandEntity brand) {
        brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 修改状态
     */
    @RequestMapping("/update/status")
    //@RequiresPermissions("product:brand:update")
    public R updateStatus(@Validated({UpdateStatusGroup.class}) @RequestBody BrandEntity brand) {
        brandService.updateById(brand);

        return R.ok();
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:brand:delete")
    public R delete(@RequestBody Long[] brandIds) {
        brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}

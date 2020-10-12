package com.tan.mall.member.feign;

import com.tan.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName CouponFeignService
 * @Description TODO
 * @Author tan
 * @Date 2020/10/12 10:01
 * @Version 1.0
 **/
@FeignClient("mall-coupon")
public interface CouponFeignService {
    @RequestMapping("coupon/coupon/member/list")
    public R memberCoupons();
}

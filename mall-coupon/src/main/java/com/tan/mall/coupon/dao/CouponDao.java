package com.tan.mall.coupon.dao;

import com.tan.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author arctan95
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 22:20:49
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

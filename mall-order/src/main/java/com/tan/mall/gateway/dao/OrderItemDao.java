package com.tan.mall.gateway.dao;

import com.tan.mall.gateway.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 *
 * @author arctan95
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 22:52:41
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}

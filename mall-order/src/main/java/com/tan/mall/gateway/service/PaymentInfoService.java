package com.tan.mall.gateway.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tan.common.utils.PageUtils;
import com.tan.mall.gateway.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author arctan95
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 22:52:41
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.tan.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tan.common.utils.PageUtils;
import com.tan.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author arctan95
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 09:45:59
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);
}


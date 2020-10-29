package com.tan.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tan.common.utils.PageUtils;
import com.tan.mall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author arctan95
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 09:45:58
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveDetail(CategoryBrandRelationEntity categoryBrandRelation);

    void updateBrand(Long brandId, String name);

    void updateCategory(Long catId, String name);
}


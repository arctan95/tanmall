package com.tan.mall.product.dao;

import com.tan.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author arctan95
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 09:45:58
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}

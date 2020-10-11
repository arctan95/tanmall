package com.tan.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tan.common.utils.PageUtils;
import com.tan.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author arctan95
 * @email tanzhq1995@gmail.com
 * @date 2020-10-11 15:34:43
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


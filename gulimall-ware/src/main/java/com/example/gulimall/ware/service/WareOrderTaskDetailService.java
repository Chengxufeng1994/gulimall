package com.example.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * ��湤����
 *
 * @author bennycheng
 * @email bennycheng@gmail.com
 * @date 2022-06-25 10:21:15
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


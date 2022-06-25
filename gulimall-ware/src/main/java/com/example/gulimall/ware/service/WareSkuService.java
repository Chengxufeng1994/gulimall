package com.example.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * ��Ʒ���
 *
 * @author bennycheng
 * @email bennycheng@gmail.com
 * @date 2022-06-25 10:21:15
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


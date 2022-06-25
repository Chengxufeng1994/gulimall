package com.example.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * �˿���Ϣ
 *
 * @author bennycheng
 * @email bennycheng@gmail.com
 * @date 2022-06-25 10:14:29
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


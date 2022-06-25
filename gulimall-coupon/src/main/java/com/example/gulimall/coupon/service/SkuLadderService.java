package com.example.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * ��Ʒ���ݼ۸�
 *
 * @author bennycheng
 * @email bennycheng@gmail.com
 * @date 2022-06-25 09:29:59
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


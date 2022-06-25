package com.example.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * �ɳ�ֵ�仯��ʷ��¼
 *
 * @author bennycheng
 * @email bennycheng@gmail.com
 * @date 2022-06-25 10:05:29
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


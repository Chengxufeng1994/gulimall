package com.example.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * ���ֱ仯��ʷ��¼
 *
 * @author bennycheng
 * @email bennycheng@gmail.com
 * @date 2022-06-25 10:05:29
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


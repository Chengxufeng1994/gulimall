package com.example.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * ��Ա�ղص���Ʒ
 *
 * @author bennycheng
 * @email bennycheng@gmail.com
 * @date 2022-06-25 10:05:29
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


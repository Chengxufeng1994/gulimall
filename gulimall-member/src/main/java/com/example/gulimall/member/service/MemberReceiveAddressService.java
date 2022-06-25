package com.example.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * ��Ա�ջ���ַ
 *
 * @author bennycheng
 * @email bennycheng@gmail.com
 * @date 2022-06-25 10:05:29
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


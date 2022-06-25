package com.example.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * ��ҳר���jd��ҳ����ܶ�ר�⣬ÿ��ר�������µ�ҳ�棬չʾר����Ʒ��Ϣ��
 *
 * @author bennycheng
 * @email bennycheng@gmail.com
 * @date 2022-06-25 09:29:59
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


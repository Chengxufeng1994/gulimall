package com.example.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku��������&ֵ
 * 
 * @author bennycheng
 * @email bennycheng@gmail.com
 * @date 2022-06-24 21:19:11
 */
@Data
@TableName("pms_sku_sale_attr_value")
public class SkuSaleAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * attr_id
	 */
	private Long attrId;
	/**
	 * ����������
	 */
	private String attrName;
	/**
	 * ��������ֵ
	 */
	private String attrValue;
	/**
	 * ˳��
	 */
	private Integer attrSort;

}

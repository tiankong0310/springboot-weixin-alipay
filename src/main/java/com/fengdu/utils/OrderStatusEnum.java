package com.fengdu.utils;

/**
 * 订单状态
* <p>Title: OrderStatusEnum.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author tiankong 
* @email 2366207000@qq.com
* @date 2018年6月26日  
* @version 1.0
 */
public enum OrderStatusEnum {

	WAIT_PAY("10", "待付款"),			// 代付款		
	PAID("20", "已付款"),				// 已付款
	CANCELED("30", "已取消"),			// 已取消
	CLOSED("40", "交易关闭");			// 超时未支付, 交易关闭
	
	public final String key;
	public final String value;
	
	OrderStatusEnum(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public static String getName(String key) {
		for (OrderStatusEnum status : OrderStatusEnum.values()) {
			if (status.getKey().equals(key)) {
				return status.value;
			}
		}
		return null;
	}
	 
	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}
}

package com.fengdu.config;

/**
 * 
* <p>Title: WeChatConfig.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author tiankong 
* @email 2366207000@qq.com
* @date 2018年6月26日  
* @version 1.0
 */
public class WeChatConfig {
	
//	public static final String APPID = "xxxxxxxxxxxxxxxx";						// 公众账号ID
//	public static final String MCH_ID = "yyyyyyyyyyyyyyy";						// 商户号
//	public static final String KEY = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";		// 商户密钥
	
	// APP和网页支付提交用户端ip, Native支付填调用微信支付API的机器IP, 即：服务器ip地址
	public static final String SPBILL_CREATE_IP = "127.0.0.1";
	// 接收微信支付异步通知回调地址，通知url必须为直接可访问的url，不能携带参数。（需要配置）
	public static final String NOTIFY_URL = "http://www.tianyanglife.com/wxpay/notify";
	// 支付方式，取值如下：JSAPI，NATIVE，APP
	public static final String TRADE_TYPE = "NATIVE";
	
	// 微信支付 - 统一下单地址
	public static final String PLACEANORDER_URL = "https://api.mch.weixin.qq.com/pay/unifiedorder";
	
}

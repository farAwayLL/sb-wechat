package com.lang.wechat.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 微信支付统一下单参数
 */
@Data
public class WxPayParam implements Serializable {

	private static final long serialVersionUID = 8013852287918156122L;

	// 订单号
	private String outTradeNo;

	// 订单描述
	private String body;

	// 订单金额 单位分
	private int totalFee;

	// 用户openid
	private String openid;

	// 终端ip
	private String spbillCreateIp;

	// 随机字符串，长度要求在32位以内
	private String nonceStr;

	// 异步接收微信支付结果通知的回调地址，通知url必须为外网可访问的url，不能携带参数
	private String notifyUrl;

	//商家数据包
	private String attach;

}

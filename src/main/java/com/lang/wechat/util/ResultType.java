package com.lang.wechat.util;

/**
 * @author faraway
 * @date 2019/5/24 14:16
 */
public enum ResultType {

	SUCCESS(200, "SUCCESS"),
	INVALID_PARAM(400, "非法参数"),
	FAIL(500, "FAIL"),
	TIMEOUT(501, "服务超时"),
	NULL(502, "数据为空"),
	LOW_STOCK(503, "库存不足");

	private Integer code;

	private String msg;

	ResultType(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}

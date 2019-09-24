package com.lang.wechat.config.ma;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.impl.WxMaServiceImpl;
import cn.binarywang.wx.miniapp.config.WxMaConfig;
import cn.binarywang.wx.miniapp.config.impl.WxMaRedisConfigImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 小程序模板消息配置类
 */
@Configuration
public class WxMaConfiguration {

	@Value("${wechat.ma.appId}")
	private String appId;

	@Value("${wechat.ma.secret}")
	private String secret;

	@Value("${wechat.ma.token}")
	private String token;

	@Value("${wechat.ma.aesKey}")
	private String aesKey;

	@Value("${wechat.ma.msgDataFormat}")
	private String msgDataFormat;

	@Autowired
	private WxMaRedisConfig maConfig;

	@Bean
	public WxMaService wxMaService() {
		maConfig.setAppid(appId);
		//maConfig.setSecret(secret);
		maConfig.setToken(token);
		maConfig.setAesKey(aesKey);
		maConfig.setMsgDataFormat(msgDataFormat);

		final WxMaService wxMaService = new WxMaServiceImpl();
		wxMaService.setWxMaConfig(maConfig);
		return wxMaService;
	}
}
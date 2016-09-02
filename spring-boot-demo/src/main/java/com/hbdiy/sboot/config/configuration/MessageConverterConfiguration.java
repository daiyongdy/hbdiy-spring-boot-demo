/**
 * <b>项目名：</b>spring-boot-demo<br/>
 * <b>包名：</b>com.hbdiy.sboot.config.configuration<br/>
 * <b>文件名：</b>MessageConverterConfiguration.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月2日-下午1:27:32<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sboot.config.configuration;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * <b>类名称：</b>MessageConverterConfiguration <br/>
 * <b>类描述：</b> 消息轉換器<br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月2日 下午1:27:32<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

@Configuration
public class MessageConverterConfiguration {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(MessageConverterConfiguration.class);

	public HttpMessageConverters hbdiyMessageConverters() {
		logger.debug("hbdiyMessageConverters init start");
		
		return null;
	}
	
}

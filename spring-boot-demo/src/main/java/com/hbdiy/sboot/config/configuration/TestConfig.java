/**
 * <b>项目名：</b>spring-boot-demo<br/>
 * <b>包名：</b>com.hbdiy.sboot.config.configuration<br/>
 * <b>文件名：</b>TestConfig.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月2日-下午12:38:56<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sboot.config.configuration;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hbdiy.sboot.model.Config;

/**
 * <b>类名称：</b>TestConfig <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月2日 下午12:38:56<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

@Configuration
public class TestConfig {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(TestConfig.class);

	@Bean(name="config")
	public Config getConfig() {
		logger.debug("config init...");
		Config config = new Config();
		config.setCt("kkkkk");
		return config;
	}
	
}

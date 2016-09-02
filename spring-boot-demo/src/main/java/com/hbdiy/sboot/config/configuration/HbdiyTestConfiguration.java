/**
 * <b>项目名：</b>spring-boot-demo<br/>
 * <b>包名：</b>com.hbdiy.sboot.config.configuration<br/>
 * <b>文件名：</b>HbdiyTestConfiguration.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月2日-上午11:24:50<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sboot.config.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.alibaba.fastjson.JSON;
import com.hbdiy.sboot.model.ConnectionSettings;

/**
 * <b>类名称：</b>HbdiyTestConfiguration <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月2日 上午11:24:50<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

@Configuration
@EnableConfigurationProperties(ConnectionSettings.class)	//没看明白这个注解
public class HbdiyTestConfiguration {
	
	ConnectionSettings connectionSettings = new ConnectionSettings();
	
	public HbdiyTestConfiguration() {
		System.out.println("HbdiyTestConfiguration init.....");
		
		System.out.println(JSON.toJSONString(connectionSettings));
	}
}

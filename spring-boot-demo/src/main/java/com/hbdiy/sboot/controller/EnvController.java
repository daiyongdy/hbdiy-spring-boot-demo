/**
 * <b>项目名：</b>spring-boot-demo<br/>
 * <b>包名：</b>com.hbdiy.sboot.controller<br/>
 * <b>文件名：</b>EnvController.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月2日-上午11:37:17<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>类名称：</b>EnvController <br/>
 * <b>类描述：</b> 使用profile 区分各个环境<br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月2日 上午11:37:17<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

@RestController
@RequestMapping("/env")
public class EnvController {

	@Autowired
	private Environment environment;
	
	@RequestMapping("/test")
	private String test() {
		return "current environment is : " + environment.getProperty("env");
	}
	
}

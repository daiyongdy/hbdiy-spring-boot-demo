/**
 * <b>项目名：</b>spring-boot-demo<br/>
 * <b>包名：</b>com.hbdiy.sboot.controller<br/>
 * <b>文件名：</b>ConfigController.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月2日-下午12:40:50<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hbdiy.sboot.model.Config;

/**
 * <b>类名称：</b>ConfigController <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月2日 下午12:40:50<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

@RestController
@RequestMapping("/config")
public class ConfigController {

	@Autowired
	private Config config;
	
	@RequestMapping("/test")
	public Config test() {
		return config;
	}
	
}

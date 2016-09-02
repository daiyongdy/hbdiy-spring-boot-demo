/**
 * <b>项目名：</b>spring-boot-demo<br/>
 * <b>包名：</b>com.hbdiy.sboot.controller<br/>
 * <b>文件名：</b>PeoperyController.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月2日-上午10:55:56<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hbdiy.sboot.model.ConnectionSettings;
import com.hbdiy.sboot.model.User;

/**
 * <b>类名称：</b>PeoperyController <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月2日 上午10:55:56<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

@RestController
@RequestMapping("/property")
public class PeoperyController{

	@Autowired
	private User user;
	
	@Autowired
	private ConnectionSettings connectionSettings;
	
	@RequestMapping("/test1")
	public User test1() {
		return user;
	}
	
	@RequestMapping("/test2")
	public ConnectionSettings test2() {
		return connectionSettings;
	}
	
}

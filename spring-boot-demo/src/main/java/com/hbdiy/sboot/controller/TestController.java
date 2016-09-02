/**
 * <b>项目名：</b>spring-boot-demo<br/>
 * <b>包名：</b>com.hbdiy.sboot.controller<br/>
 * <b>文件名：</b>TestController.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月1日-下午5:21:08<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <b>类名称：</b>TestController <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月1日 下午5:21:08<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

@Controller
@RequestMapping("/hello-sboot")
public class TestController {
	
	public TestController() {
		System.out.println("TestController init..");
	}

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello spring boot!";
	}
	
}

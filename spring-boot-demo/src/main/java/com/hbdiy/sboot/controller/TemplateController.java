/**
 * <b>项目名：</b>spring-boot-demo<br/>
 * <b>包名：</b>com.hbdiy.sboot.controller<br/>
 * <b>文件名：</b>TemplateController.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月2日-下午1:53:28<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <b>类名称：</b>TemplateController <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月2日 下午1:53:28<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

@Controller
@RequestMapping("/template")
public class TemplateController {

	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("name", "代勇");
		model.addAttribute("age", 26);
		return "/hbdiy/user";
	}
	
}

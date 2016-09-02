/**
 * <b>项目名：</b>spring-boot-demo<br/>
 * <b>包名：</b>com.hbdiy.sboot.config.banner<br/>
 * <b>文件名：</b>HbdiyBanner.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月2日-上午11:08:49<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sboot.config.banner;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

/**
 * <b>类名称：</b>HbdiyBanner <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月2日 上午11:08:49<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

public class HbdiyBanner implements Banner{

	/**
	 * @author daiyong
	 */
	@Override
	public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
		out.print("您现在访问的是hbdiy spring boot demo");
	}
	
}

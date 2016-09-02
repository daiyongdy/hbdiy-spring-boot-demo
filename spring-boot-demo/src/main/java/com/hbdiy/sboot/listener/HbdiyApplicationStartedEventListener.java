/**
 * <b>项目名：</b>spring-boot-demo<br/>
 * <b>包名：</b>com.hbdiy.sboot.listener<br/>
 * <b>文件名：</b>HbdiyApplicationStartedEventListener.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月2日-上午8:22:23<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sboot.listener;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * <b>类名称：</b>HbdiyApplicationStartedEventListener <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月2日 上午8:22:23<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

/**
 *   application启动listener
 */

public class HbdiyApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent>{

	/**
	 * @author daiyong
	 */
	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		SpringApplication application = event.getSpringApplication();
		//application启动的前置配置
//		application.setBannerMode(Mode.OFF);  //关闭banner
		System.out.println("application 启动前置配置......");
	}

}

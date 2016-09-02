/**
 * <b>项目名：</b>spring-boot-demo<br/>
 * <b>包名：</b>com.hbdiy.sboot<br/>
 * <b>文件名：</b>SpringBootApplication.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月2日-上午7:12:35<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sboot;

import org.springframework.boot.Banner;
import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;

import com.hbdiy.sboot.config.banner.HbdiyBanner;
import com.hbdiy.sboot.listener.HbdiyApplicationStartedEventListener;

/**
 * <b>类名称：</b>SpringBootApplication <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月2日 上午7:12:35<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */
/**
 *  我们的main方法通过调用run，将业务委托给了Spring Boot的SpringApplication类。SpringApplication将引导我们的应用，启动Spring，
 *  相应地启动被自动配置的Tomcat web服务器。我们需要将Example.class作为参数传递给run方法，以此告诉SpringApplication谁是主要的Spring组件，
 *  并传递args数组以暴露所有的命令行参数。
 * 
 *  手动启动spring boot application , 启动类必须在最根层目录, spring boot会自动加载当前类下的各个目录
 */

@SpringBootApplication  //same as @Configuration @EnableAutoConfiguration @ComponentScan 代替了这三个注解
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		//简单启动方式
		//SpringApplication.run(SpringBootDemoApplication.class, args);

		SpringApplication application = new SpringApplication(SpringBootDemoApplication.class);
		//添加监听器
		application.addListeners(new HbdiyApplicationStartedEventListener());
		//設置banner
		Banner banner = new HbdiyBanner();
		application.setBanner(banner);
		
		//禁止命令行参数
//		application.setAddCommandLineProperties(false);
		
		application.run(args);
	}
	
	/*private String getEnvironment(String[] args) {
		
		for (String arg : args) {
			if (arg.equals("--spring.config.name")) {
				
			}
		}
	}*/
	
}

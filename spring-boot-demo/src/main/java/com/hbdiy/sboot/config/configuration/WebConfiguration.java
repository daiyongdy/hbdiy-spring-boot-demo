/**
 * <b>项目名：</b>spring-boot-demo<br/>
 * <b>包名：</b>com.hbdiy.sboot.config.configuration<br/>
 * <b>文件名：</b>WebConfiguration.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月2日-下午1:40:41<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sboot.config.configuration;

import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

/**
 * <b>类名称：</b>WebConfiguration <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月2日 下午1:40:41<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * 
 * 手動方式修改web配置 下面这些编码配置其实也可以通过配置文件 解决
 * 
 */

@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {

	/********************freemakrer config start************************/
	
	@Bean
	public FreeMarkerConfigurer hbdiyFreeMarkerConfigurer() {
		FreeMarkerConfigurer configure = new FreeMarkerConfigurer();
		configure.setTemplateLoaderPaths("/WEB-INF/page");
		
		return configure;
	}
	
	/**
	 * @author daiyong
	 */
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		
		FreeMarkerViewResolver viewResolver = new FreeMarkerViewResolver();
		viewResolver.setCache(false);
		viewResolver.setSuffix(".ftl");
		viewResolver.setContentType("text/html;charset=UTF-8");
		viewResolver.setRequestContextAttribute("request");
		viewResolver.setExposeSpringMacroHelpers(true);
		viewResolver.setExposeRequestAttributes(true);
		viewResolver.setExposeSessionAttributes(true);
		
		registry.viewResolver(viewResolver);
		// FDY Auto-generated method stub
		super.configureViewResolvers(registry);
	}
	
	/********************freemakrer config end************************/
	
	
	/********************container config start************************/
	@Bean
	public EmbeddedServletContainerFactory hbdiyContainer() {
		JettyEmbeddedServletContainerFactory factory = new JettyEmbeddedServletContainerFactory	();
		
		factory.setPort(8080);
		
		return factory;
	}
	
	/********************container config end************************/

}

/**
 * <b>项目名：</b>spring-boot-demo<br/>
 * <b>包名：</b>com.hbdiy.sboot.service<br/>
 * <b>文件名：</b>CustomerServiceImpl.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月2日-下午2:58:50<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sboot.service;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hbdiy.sboot.model.Customer;

/**
 * <b>类名称：</b>CustomerServiceImpl <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月2日 下午2:58:50<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * @author daiyong1
	 */
	@Override
	public void add(Customer customer) {
		String sql = "insert into customer (username, password) values (\"" + customer.getUserName() + "\", \""+ customer.getPassword() +"\")";
		this.jdbcTemplate.execute(sql);
	}

}

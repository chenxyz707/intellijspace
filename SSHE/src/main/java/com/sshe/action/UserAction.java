package com.sshe.action;

import com.sshe.beans.TuserVo;
import com.sshe.service.UserService;
import com.sshe.utils.Encrypt;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.UUID;

/**
 * Created by chenxyz on 2014/4/27.
 */
@Namespace("/")
@Action(value="userAction")
public class UserAction extends BaseAction {

	@Autowired
	private UserService userService;

	public void addUser() {
		System.out.println("=====in action====");
		TuserVo user = new TuserVo();
		user.setId(UUID.randomUUID().toString());
		user.setName("name");
		user.setPwd(Encrypt.e("123"));
		user.setCreatedatetime(new Date());
		user.setModifydatetime(new Date());
		this.userService.addUser(user);
	}

	public void getUsers() {
		super.writeJson(userService.getUsers());
	}

	public void testForm(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String test = request.getParameter("test");
		System.out.println(test);
		String test2 = request.getParameter("test2");
		System.out.println(test2);

	}
}

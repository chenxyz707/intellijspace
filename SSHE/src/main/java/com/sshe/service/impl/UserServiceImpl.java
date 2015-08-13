package com.sshe.service.impl;

import com.sshe.beans.TuserVo;
import com.sshe.dao.BaseDao;
import com.sshe.dao.UserDao;
import com.sshe.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenxyz on 2014/4/26.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	Logger logger = Logger.getLogger("UserServiceImpl.clazz");
	@Autowired
	private BaseDao<TuserVo> userDao;
	@Override
	public void test() {
		logger.info("spring is ok");
	}

	@Override
	public void addUser(TuserVo user) {
		System.out.println("==in service==");
		logger.info(user.getName());
		this.userDao.save(user);
	}

	@Override
	public List<TuserVo> getUsers() {
		return this.userDao.find("from Tuser");
	}
}

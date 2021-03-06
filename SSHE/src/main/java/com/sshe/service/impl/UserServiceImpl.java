package com.sshe.service.impl;

import com.danga.MemCached.MemCachedClient;
import com.sshe.beans.TuserVo;
import com.sshe.dao.BaseDao;
import com.sshe.dao.UserDao;
import com.sshe.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by chenxyz on 2014/4/26.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	Logger logger = Logger.getLogger("UserServiceImpl.clazz");
	@Autowired
	private BaseDao<TuserVo> userDao;

	@Autowired
	private MemCachedClient memcachedClient;

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
		System.out.println("============");
		System.out.println(memcachedClient.get("test1"));
		memcachedClient.set("test1", "myTest");
		System.out.println(memcachedClient.get("test1"));
		memcachedClient.add("test1", "myTestChage");
		System.out.println(memcachedClient.get("test1"));
		memcachedClient.add("test2", "myTest2");
		System.out.println(memcachedClient.get("test2"));
		memcachedClient.set("test2", "myTest2Change");
		System.out.println(memcachedClient.get("test2"));

		List<TuserVo> list = this.userDao.find("from TuserVo");
		return list;
	}
}

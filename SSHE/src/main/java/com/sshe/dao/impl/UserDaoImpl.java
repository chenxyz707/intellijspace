package com.sshe.dao.impl;

import com.sshe.beans.TuserVo;
import com.sshe.dao.UserDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenxyz on 2014/4/27.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addUser(TuserVo user) {
		System.out.println("====in dao=====");
		this.sessionFactory.getCurrentSession().save(user);
		System.out.println("====save end====");
	}

	@Override
	public List<TuserVo> getUsers() {
		return null;//this.sessionFactory.getCurrentSession().get
	}
}

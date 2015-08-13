package com.sshe.service;

import com.sshe.beans.TuserVo;

import java.util.List;

/**
 * Created by chenxyz on 2014/4/26.
 */
public interface UserService {
	public void test();

	public void addUser(TuserVo user);

	public List<TuserVo> getUsers();
}

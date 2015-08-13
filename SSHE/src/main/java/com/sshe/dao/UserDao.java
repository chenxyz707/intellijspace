package com.sshe.dao;

import com.sshe.beans.TuserVo;

import java.util.List;

/**
 * Created by chenxyz on 2014/4/27.
 */
public interface UserDao {
	public void addUser(TuserVo user);
	public List<TuserVo> getUsers();
}

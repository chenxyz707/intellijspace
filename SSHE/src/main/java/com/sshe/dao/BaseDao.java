package com.sshe.dao;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by xyz on 2015/8/11.
 */
public interface BaseDao<T> {

    public Serializable save(T o);

    public void delete(T o);

    public void update(T o);

    public void saveOrUpdate(T o);

    public T get(Class<T> c, Serializable id);

    public T get(String hql);

    public T get(String hql, Map<String, Object> params);

    public List<T> find(String hql);

    public List<T> find(String hql, Map<String, Object> params);

    public List<T> find(String hql, int page, int rows);

    public List<T> find(String hql, Map<String, Object> params, int page, int rows);

    public Long count(String hql);

    public Long count(String hql, Map<String, Object> params);

    public int executeHql(String hql);
}

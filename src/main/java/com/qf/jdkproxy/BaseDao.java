package com.qf.jdkproxy;

import java.util.List;

public interface BaseDao<T> {
    public int addObj(T t);
    public int deleteObj(int id);
    public int update(T t);
    public T selectOne(T t);
    public List<T> selectList(T t);
}

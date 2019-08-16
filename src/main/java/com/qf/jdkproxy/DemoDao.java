package com.qf.jdkproxy;

import java.util.List;

public class DemoDao implements BaseDao {
    public int addObj(Object o) {
        System.out.println("display addObj");
        return 0;
    }

    public int deleteObj(int id) {
        System.out.println("display deleteObj");
        return 0;
    }

    public int update(Object o) {
        System.out.println("display update");
        return 0;
    }

    public Object selectOne(Object o) {
        System.out.println("display selectOne");
        return null;
    }

    public List selectList(Object o) {
        System.out.println("display selectList");
        return null;
    }
}

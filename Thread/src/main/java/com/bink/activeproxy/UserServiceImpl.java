package com.bink.activeproxy;

/**
 * 真实对象：完成CRUD操作
 *
 * @author yangbingkun
 * @Package com.bink.activeproxy
 * @date 2020/11/26 --9:41 上午
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("新增一个用户！");
    }

    @Override
    public void delete() {
        System.out.println("删除一个用户！");
    }

    @Override
    public void update() {
        System.out.println("更新一个用户！");
    }

    @Override
    public void query() {
        System.out.println("查询一个用户！");
    }
}

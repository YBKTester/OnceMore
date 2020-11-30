package com.bink.activeproxy;

/**
 * @author yangbingkun
 * @Package com.bink.activeproxy
 * @date 2020/11/26 --9:42 上午
 */
public class UserServiceProxy implements UserService {
    /**
     * 真实操作的对象，作为属性传入代理类
     */
    private UserServiceImpl userService;

    /**
     * 将操作对象传入
     *
     * @param userService 真实执行操作的对象
     */
    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    /**
     * 日志方法
     *
     * @param msg 操作类型
     */
    private void log(String msg) {
        System.out.println("执行了:" + msg + " 方法！");
    }

    /**
     * 增加日志方法后，再执行原CRUD操作方法
     */
    @Override
    public void add() {
        log("add");
        userService.add();
    }


    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }
}

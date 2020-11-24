package com.bink.staticProxy;

/**
 * @author yangbingkun
 * @Package com.bink.staticProxy
 * @date 2020/11/24 --2:14 下午
 */
public class TestCompany implements BaseTest {

    /**
     * 顶层接口类型
     */
    private final BaseTest target;

    public TestCompany(BaseTest target) {
        this.target = target;
    }

    @Override
    public void test() {
        before();
        this.target.test();
        after();
    }

    private void after() {
        System.out.println("测试执行后，清理环境！");
    }

    private void before() {
        System.out.println("测试执行前，准备环境！");
    }

}

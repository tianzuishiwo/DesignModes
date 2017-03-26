package com.wsh.designmodes.proxy;

import com.wsh.designmodes.proxy.practise1.ProxySubject;

/**
 * Created by laobai on 2017/3/26.
 */

public class ProxyTest {
    private ProxyTest() {
    }

    private static class SINGLETON{
        private static final ProxyTest INSTANCE = new ProxyTest();
    }

    public static ProxyTest getInstance(){
        return SINGLETON.INSTANCE;
    }

    public void test(){
        new ProxySubject().request();
    }
}

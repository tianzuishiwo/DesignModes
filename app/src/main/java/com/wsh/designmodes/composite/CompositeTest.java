package com.wsh.designmodes.composite;

import com.wsh.designmodes.composite.practise1.Client2;

/**
 * Created by laobai on 2017/3/26.
 */

public class CompositeTest {
    private CompositeTest() {
    }

    private static class SINGLETON{
        private static final CompositeTest INSTANCE = new CompositeTest();
    }

    public static CompositeTest getIntance(){
        return SINGLETON.INSTANCE;
    }

    public void test(){
        testPractise1();
    }

    private void testPractise1() {
        Client2 client2 = new Client2();
        client2.init();
    }
}

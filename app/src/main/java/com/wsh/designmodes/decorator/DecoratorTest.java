package com.wsh.designmodes.decorator;

import com.wsh.designmodes.decorator.practise1.Client3;

/**
 * Created by laobai on 2017/3/26.
 */

public class DecoratorTest {
    private DecoratorTest() {
    }

    private static class SINGLETON{
        private static final DecoratorTest INSTANCE = new DecoratorTest();
    }

    public static DecoratorTest getInstance(){
        return SINGLETON.INSTANCE;
    }

    public void test(){
        new Client3().use();
    }
}

package com.wsh.designmodes.template;

import com.wsh.designmodes.template.practise1.MyChart;

/**
 * Created by laobai on 2017/3/26.
 */

public class TemplateTest {
    private TemplateTest() {
    }

    private static class SINGLETON{
        private static final TemplateTest INSTANCE = new TemplateTest();
    }

    public static TemplateTest getInstance(){
        return SINGLETON.INSTANCE;
    }

    public void test(){
//        new MyChart().process();
//        new MyChart().display();
        new MyChart().process();
    }
}

package com.wsh.designmodes.template;

import com.wsh.designmodes.template.practise1.MyChart;
import com.wsh.designmodes.template.practise2.CurrentCount;
import com.wsh.designmodes.template.practise2.SavingCount;

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
//        testPractise1();
        testPractise2();
    }

    private void testPractise2() {
        CurrentCount zhang1 = new CurrentCount("张小凡", 123);
        zhang1.templateMethod();

        CurrentCount mrZhang = new CurrentCount("张小凡", 123456);
        mrZhang.templateMethod();

        SavingCount zhangdada = new SavingCount("张小凡", 123456);
        zhangdada.templateMethod();
    }

    private void testPractise1() {//        new MyChart().process();
        //        new MyChart().display();
        new MyChart().process();
    }
}

package com.wsh.designmodes.state;

import com.wsh.designmodes.state.practise1.MyAccount;
import com.wsh.designmodes.state.practise2.Switch;

/**
 * Created by laobai on 2017/4/2.
 */

public class StateTest {
    private StateTest() {
    }

    private static class SINGLETON{
        private static final StateTest INSTANCE = new StateTest();
    }

    public static StateTest getIntance(){
        return SINGLETON.INSTANCE;
    }

    public void test(){
//        testPractise1();// TODO 没有遵守开闭原则 体现在checkState()
        testPractise2();//TODO 共享状态 ，没搞懂 (同一个类不同实例，共享static参数)
    }

    private void testPractise2() {
        Switch s1,s2;
        s1=new Switch("开关1");
        s2=new Switch("开关2");

        s1.on();
        s2.on();
        s1.off();
        s2.off();
        s2.on();
        s1.on();
    }

    private void testPractise1() {
        MyAccount account = new MyAccount(0);
        account.dispoie(1000);
        account.withdraw(-1500);
        account.dispoie(2000);
        account.withdraw(-5000);
    }
}

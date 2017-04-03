package com.wsh.designmodes.strategy;

import com.wsh.designmodes.strategy.practise1.ChildrenDiscount;
import com.wsh.designmodes.strategy.practise1.Store;
import com.wsh.designmodes.strategy.practise1.StudentDiscount;
import com.wsh.designmodes.strategy.practise1.VIPDiscount;

/**
 * Created by laobai on 2017/4/3.
 */

public class StrategyTest {
    private StrategyTest() {
    }

    private static class SINGLETON{
        private static final StrategyTest INSTANCE = new StrategyTest();
    }

    public static StrategyTest getInstance(){
        return SINGLETON.INSTANCE;
    }

    public void test(){
        testPractise1();
    }

    private void testPractise1() {
        ChildrenDiscount childrenDiscount = new ChildrenDiscount();
        StudentDiscount  studentDiscount  = new StudentDiscount();
        VIPDiscount      vipDiscount      = new VIPDiscount();

        Store store = new Store(100);
        store.setDiscount(studentDiscount);
        store.getPrice();

        store.setDiscount(vipDiscount);
        store.getPrice();

        store.setDiscount(childrenDiscount);
        store.getPrice();

    }
}

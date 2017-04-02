package com.wsh.designmodes.observer;

import com.wsh.designmodes.observer.practise1.AllySubject;
import com.wsh.designmodes.observer.practise1.Person1;
import com.wsh.designmodes.observer.practise1.Person2;

/**
 * Created by laobai on 2017/4/2.
 */

public class ObserverTest {
    private ObserverTest() {
    }

    private static class SINGLETON{
        private static final ObserverTest INSTANCE = new ObserverTest();
    }

    public static ObserverTest getInstance(){
        return SINGLETON.INSTANCE;
    }

    public void test(){
        testPractise1();
    }

    private void testPractise1() {
        AllySubject tigerAlly = new AllySubject("猛虎军团");

        Person1 wansi = new Person1("万斯", tigerAlly);
        Person1 bie    = new Person1("别亚", tigerAlly);
        Person2 an = new Person2("安多里尔", tigerAlly);
        Person2 mi = new Person2("密尔顿", tigerAlly);

        wansi.attack();
    }
}

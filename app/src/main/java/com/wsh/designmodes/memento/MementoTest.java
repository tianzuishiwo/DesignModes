package com.wsh.designmodes.memento;

import com.wsh.designmodes.XLog;
import com.wsh.designmodes.memento.practise1.CareTaker;
import com.wsh.designmodes.memento.practise1.Oringinor;

/**
 * Created by laobai on 2017/4/3.
 */

public class MementoTest {
    private MementoTest() {
    }

    public static class SINGLETON {
        private static final MementoTest INSTANCE = new MementoTest();
    }

    public static MementoTest getInstance() {
        return SINGLETON.INSTANCE;
    }

    public void test() {
        testPractise1();
    }

    private void testPractise1() {
        CareTaker careTaker;
        Oringinor oringinor = new Oringinor("约炮", 1, 1);
        print(oringinor);
        careTaker = new CareTaker(oringinor.save());//记录

        oringinor.setX(6);
        print(oringinor);
//        careTaker = new CareTaker(oringinor.save());//记录
        careTaker.setMemento(oringinor.save());

        oringinor.restore(careTaker.getMemento(0));

        oringinor.setY(22);
        print(oringinor);
//        careTaker = new CareTaker(oringinor.save());//记录
        careTaker.setMemento(oringinor.save());

        oringinor.setX(10);
        print(oringinor);
        //        careTaker = new CareTaker(oringinor.save());//记录
        careTaker.setMemento(oringinor.save());

        oringinor.restore(careTaker.getMemento(0));
        print(oringinor);
    }

    private void print(Oringinor oringinor) {
        XLog.i("表现状态："+oringinor.toString());
    }
}

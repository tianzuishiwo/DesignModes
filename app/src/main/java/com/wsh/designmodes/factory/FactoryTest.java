package com.wsh.designmodes.factory;

import com.wsh.designmodes.XLog;
import com.wsh.designmodes.factory.practise1.BaseCar;
import com.wsh.designmodes.factory.practise1.CarFactory;
import com.wsh.designmodes.factory.practise2.BenzFactory;
import com.wsh.designmodes.factory.practise2.BmwFactory;
import com.wsh.designmodes.factory.practise2.ICarFactory;
import com.wsh.designmodes.factory.practise3.BaseTv;
import com.wsh.designmodes.factory.practise3.IStyleFactory;
import com.wsh.designmodes.factory.practise3.SpringStyleFactory;
import com.wsh.designmodes.factory.practise3.SummerStyleFactory;

/**
 * Created by laobai on 2017/3/25.
 */

public class FactoryTest {
    private FactoryTest() {
    }

    private static class SINGLETON{
        private static final FactoryTest INSTANCE = new FactoryTest();
    }

    public static FactoryTest getInstance(){
        return SINGLETON.INSTANCE;
    }

    public void test(){
        XLog.d("工厂模式测试");
//        testPractise1();// 简单工厂模式
//        testPractise2();// 工厂方法模式（多态工厂模式）
        testPractise3();// 抽象工厂模式
    }

    private void testPractise3() {
        IStyleFactory iStyleFactory;
        com.wsh.designmodes.factory.practise3.BaseCar baseCar;
        BaseTv baseTv;

        iStyleFactory = new SpringStyleFactory();
        baseCar=iStyleFactory.creatCar();
        baseTv=iStyleFactory.creatTv();

        baseCar.display();
        baseTv.display();

        iStyleFactory=new SummerStyleFactory();
        baseCar=iStyleFactory.creatCar();
        baseTv=iStyleFactory.creatTv();

        baseCar.display();
        baseTv.display();
    }

    private void testPractise2() {
        ICarFactory iCarFactory;
        com.wsh.designmodes.factory.practise2.BaseCar baseCar;

        iCarFactory = new BmwFactory();
        baseCar = iCarFactory.creatCar();
        baseCar.setName("宝马");
        baseCar.display();

        iCarFactory=new BenzFactory();
        baseCar=iCarFactory.creatCar();
        baseCar.setName("奔驰");
        baseCar.display();
    }

    private void testPractise1() {
        BaseCar bmw = CarFactory.creatCar("bmw");
        bmw.display();
        BaseCar benz = CarFactory.creatCar("benz");
        benz.display();
    }
}

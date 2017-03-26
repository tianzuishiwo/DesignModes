package com.wsh.designmodes.decorator.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/26.
 */

public class Client3 {
    public void use(){
        Component car;
        Component pen;
        Component tv;

        Component mouthDecorator;
//        Component flyDecorator;
//        ConcreteFlyDecorator flyDecorator;
//        ConcretePointDecorator pointDecorator;
//        Component pointDecorator;

        car = new Car();
        pen = new Pen();
        tv = new Tv();

//        mouthDecorator=new ConcreteMouthDecorator(car);
//        mouthDecorator=new ConcreteMouthDecorator(pen);
        mouthDecorator=new ConcreteMouthDecorator(tv);
        XLog.i("===============1================");
        mouthDecorator=new ConcreteFlyDecorator(mouthDecorator);
        mouthDecorator=new ConcretePointDecorator(mouthDecorator);
        XLog.i("===============2================");
        mouthDecorator.function();
        XLog.i("===============3================");
//        car.function();
        XLog.i("===============4================");
//        mouthDecorator.function();
        XLog.i("===============5================");
//        mouthDecorator.function();
    }
}

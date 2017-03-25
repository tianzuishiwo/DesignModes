package com.wsh.designmodes.factory.practise2;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/25.
 */

public abstract class BaseCar {
    private String name;

    public static void testCar(){
        XLog.e("车是高危产品！");
    }

    public void userOil(){
        XLog.i(name+"需要加油！");
    }

    public abstract String getColor();

    public void setName(String name){
        this.name=name;
    }

    public void display(){
        userOil();
        XLog.i(name+"颜色为："+getColor());
//        testCar();
    }
}

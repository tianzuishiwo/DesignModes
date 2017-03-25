package com.wsh.designmodes.factory.practise2;

/**
 * Created by laobai on 2017/3/25.
 */

public class BmwCar extends com.wsh.designmodes.factory.practise2.BaseCar{
    @Override
    public String getColor() {
        testCar();
        return "白色（金丝雀必备）";
    }

//    public static void testCar(){
//        XLog.w("testCar");
//    }

}

package com.wsh.designmodes.factory.practise2;

/**
 * Created by laobai on 2017/3/25.
 */

public class BenzCar extends com.wsh.designmodes.factory.practise2.BaseCar{
    @Override
    public String getColor() {
        testCar();
        return "黑色（上位者标配）";
    }
}

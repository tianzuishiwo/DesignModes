package com.wsh.designmodes.factory.practise2;

/**
 * Created by laobai on 2017/3/25.
 */

public class BmwFactory implements ICarFactory{
    @Override
    public BaseCar creatCar() {
        return new BmwCar();
    }
}

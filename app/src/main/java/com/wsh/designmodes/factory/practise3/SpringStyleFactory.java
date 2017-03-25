package com.wsh.designmodes.factory.practise3;

/**
 * Created by laobai on 2017/3/25.
 */

public class SpringStyleFactory implements IStyleFactory{
    @Override
    public BaseCar creatCar() {
        return new BmwCar();
    }

    @Override
    public BaseTv creatTv() {
        return new VCLTv();
    }
}

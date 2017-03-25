package com.wsh.designmodes.factory.practise1;

/**
 * Created by laobai on 2017/3/25.
 */

public class CarFactory {
    public static BaseCar creatCar(String type){
        BaseCar baseCar = null;
        switch (type){
            case "bmw":
                baseCar = new BmwCar();
                break;
            case "benz":
                baseCar = new BenzCar();
                break;
        }
        return baseCar;
    }
}

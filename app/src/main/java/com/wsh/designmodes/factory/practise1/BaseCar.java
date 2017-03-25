package com.wsh.designmodes.factory.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/25.
 */

public abstract class BaseCar {
    public void run(){
        XLog.i("汽车都会跑");
    }

    public abstract String getColor();

    public void display(){
        XLog.i("这辆车的颜色是："+getColor());
    }
}

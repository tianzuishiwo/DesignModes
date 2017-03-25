package com.wsh.designmodes.factory.practise3;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/25.
 */

public abstract class BaseCar {
    public void run(){
        XLog.i("汽车可以跑路");
    }

    public abstract String getColor();

    public void display(){
        run();
        XLog.i("颜色代表个性："+getColor());
    }
}

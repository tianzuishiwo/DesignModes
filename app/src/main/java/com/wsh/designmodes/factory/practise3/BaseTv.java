package com.wsh.designmodes.factory.practise3;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/25.
 */

public abstract class BaseTv {
    public void show(){
        XLog.i("电视可以播放节目");
    }

    public abstract String getBrand();

    public void display(){
        show();
        XLog.i("这个电视品牌："+getBrand());
    }
}

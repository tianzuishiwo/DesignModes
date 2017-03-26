package com.wsh.designmodes.template.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/26.
 */

public class MyChart extends BaseChart{
    @Override
    protected void getData() {
        XLog.i("好好好，给你数据。。。");
    }

    @Override
    protected void display() {
        XLog.i("你赢了，让他展示在广场上吧");
    }

//    @Override
//    protected boolean isChangeToXML() {
//        return false;
//    }

    //    @Override
//    protected void getData() {
//        XLog.i("好好好，给你数据。。。");
//    }
//
//    @Override
//    protected void process() {
//        XLog.i("你赢了，让他展示在广场上吧");
//    }
}

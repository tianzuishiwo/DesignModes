package com.wsh.designmodes.state.practise2;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/4/3.
 */

public class OffState extends State{
    public void on(Switch s) {
        XLog.e("打开！");
        s.setState(Switch.getState("on"));
    }

    public void off(Switch s) {
        XLog.e("已经关闭！");
    }
}

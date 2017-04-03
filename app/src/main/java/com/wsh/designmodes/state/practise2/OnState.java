package com.wsh.designmodes.state.practise2;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/4/3.
 */

public class OnState extends State {
    public void on(Switch s) {
       XLog.e("已经打开！");
    }

    public void off(Switch s) {
       XLog.e("关闭！");
        s.setState(Switch.getState("off"));
    }
}

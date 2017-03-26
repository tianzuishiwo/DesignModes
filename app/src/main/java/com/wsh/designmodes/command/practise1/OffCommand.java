package com.wsh.designmodes.command.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/27.
 */

public class OffCommand implements Command{
    @Override
    public void excute() {
        XLog.i("接收者执行关闭操作！");
    }
}

package com.wsh.designmodes.command.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/26.
 */

public class OpenCommand implements Command{
    @Override
    public void excute() {
        XLog.i("接收者执行打开操作！");
    }
}

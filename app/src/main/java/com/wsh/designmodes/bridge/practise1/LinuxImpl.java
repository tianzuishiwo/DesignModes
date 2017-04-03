package com.wsh.designmodes.bridge.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/4/3.
 */

public class LinuxImpl implements ImplInfter{
    @Override
    public void doPain(Matrx matrx) {
        XLog.i("Linux操作系统，展示图片");
    }
}

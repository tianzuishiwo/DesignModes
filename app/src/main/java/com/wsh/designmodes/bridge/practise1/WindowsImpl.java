package com.wsh.designmodes.bridge.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/4/3.
 */

public class WindowsImpl implements ImplInfter{
    @Override
    public void doPain(Matrx matrx) {
        XLog.i("windows系统，展示图片");
    }
}

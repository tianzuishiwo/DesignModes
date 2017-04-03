package com.wsh.designmodes.bridge.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/4/3.
 */

public class MacImpl implements ImplInfter{
    @Override
    public void doPain(Matrx matrx) {
        XLog.i("Mac系统，展示图片");
    }
}

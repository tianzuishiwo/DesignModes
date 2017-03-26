package com.wsh.designmodes.proxy.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/26.
 */

public class RealSubject implements Subject{
    @Override
    public void request() {
        XLog.e("真是请求......");
    }
}

package com.wsh.designmodes.proxy.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/26.
 */

public class ProxySubject implements Subject{
    private RealSubject mRealSubject = new RealSubject();

    @Override
    public void request() {
        requestPrepare();
        mRealSubject.request();
        requestPost();
    }

    private void requestPost() {
        XLog.i("真是请求后操作...");
    }

    private void requestPrepare() {
        XLog.i("真实请求前操作。。。");
    }
}

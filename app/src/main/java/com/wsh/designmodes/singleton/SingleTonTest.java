package com.wsh.designmodes.singleton;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/25.
 */

public class SingleTonTest {
    private SingleTonTest() {
    }

    private static class SINGLETON{
        private static final SingleTonTest INSTANCE = new SingleTonTest();
    }

    public static SingleTonTest getInstance(){
        return SINGLETON.INSTANCE;
    }

    public void test(){
        XLog.i("单例模式");

    }
}

package com.wsh.designmodes.facade.practise2;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/26.
 */

public class FacadeSecond implements IFacade{
    @Override
    public void method() {
        XLog.w("使用方式二");
        new Sub1().method1();
        new Sub3().method3();
        new Sub4().method4();
    }
}

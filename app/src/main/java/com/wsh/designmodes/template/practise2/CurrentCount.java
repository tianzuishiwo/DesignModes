package com.wsh.designmodes.template.practise2;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/4/3.
 */

public class CurrentCount extends AbstractCount{
    public CurrentCount(String countName, int password) {
        super(countName, password);
    }

    @Override
    protected void calculateInterest() {
        XLog.w("这个嘛，可以给活期利息！");
    }

    @Override
    protected boolean isHook() {
        XLog.i("不装逼了，妥妥的！");
        return false;
    }
}

package com.wsh.designmodes.template.practise2;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/4/3.
 */

public class SavingCount extends AbstractCount{
    public SavingCount(String countName, int password) {
        super(countName, password);
    }

    @Override
    protected void calculateInterest() {
        XLog.e("计算定期利息，吓死你，一年利息一百万！");
    }

    @Override
    protected boolean isHook() {
        XLog.e("不能低调，一定要装X, 去，找个显眼位置摆出来！！！");
        return  true;
    }
}

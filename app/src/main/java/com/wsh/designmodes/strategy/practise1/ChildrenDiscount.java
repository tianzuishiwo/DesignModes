package com.wsh.designmodes.strategy.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/4/3.
 */

public class ChildrenDiscount implements Discount{
    @Override
    public void calculate(int price) {
        int count = price/2;
        XLog.w("孩子打折后："+count);
    }
}

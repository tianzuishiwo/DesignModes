package com.wsh.designmodes.strategy.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/4/3.
 */

public class VIPDiscount implements Discount{
    @Override
    public void calculate(int price) {
        int count = price/5*3;
        XLog.w("VIP打折后："+count);
    }
}

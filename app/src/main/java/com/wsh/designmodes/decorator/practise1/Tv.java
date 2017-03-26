package com.wsh.designmodes.decorator.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/26.
 */

public class Tv extends com.wsh.designmodes.decorator.practise1.Component{
    @Override
    public void function() {
        XLog.i("电视可以播放节目");
    }
}

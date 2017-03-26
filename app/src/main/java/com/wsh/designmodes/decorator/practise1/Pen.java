package com.wsh.designmodes.decorator.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/26.
 */

public class Pen extends Component{
    @Override
    public void function() {
        XLog.i("笔可以写字");
    }
}

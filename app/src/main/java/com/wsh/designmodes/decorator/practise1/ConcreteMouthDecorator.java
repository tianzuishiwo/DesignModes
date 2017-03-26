package com.wsh.designmodes.decorator.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/26.
 */

public class ConcreteMouthDecorator extends ComponentDecorator{
    public ConcreteMouthDecorator(Component component) {
        super(component);

    }

    @Override
    public void function() {
        super.function();
        addFunctionMouth();
    }

    private void addFunctionMouth() {
        XLog.w("添加功能：给张嘴，就可以吹牛了");
    }
}

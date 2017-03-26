package com.wsh.designmodes.decorator.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/26.
 */

public class ConcreteFlyDecorator extends ComponentDecorator{
    public ConcreteFlyDecorator(Component component) {
        super(component);

    }

    private void addFunctionFly() {
        XLog.w("添加功能：给个翅膀可以飞哦！");
    }

    @Override
    public void function() {
        super.function();
        addFunctionFly();
    }
}

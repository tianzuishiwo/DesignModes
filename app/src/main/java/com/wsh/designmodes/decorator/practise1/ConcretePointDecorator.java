package com.wsh.designmodes.decorator.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/26.
 */

public class ConcretePointDecorator extends ComponentDecorator{
    public ConcretePointDecorator(Component component) {
        super(component);

    }

    private void addFunctionPoint() {
        XLog.w("增加功能： 给个支点，撬动地球！");
    }

    @Override
    public void function() {
        super.function();
        addFunctionPoint();
    }
}

package com.wsh.designmodes.decorator.practise1;

/**
 * Created by laobai on 2017/3/26.
 */

public class ComponentDecorator extends Component{
    private Component mComponent;

    public ComponentDecorator(Component component) {
        mComponent = component;
    }

    @Override
    public void function() {
        mComponent.function();
    }


}

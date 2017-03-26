package com.wsh.designmodes.composite.practise1;

/**
 * Created by laobai on 2017/3/26.
 */

public interface Component {
    void addComponent(Component component);
    void removeComponent(Component component);
    void opration();
    Component  getChild(int i);
}

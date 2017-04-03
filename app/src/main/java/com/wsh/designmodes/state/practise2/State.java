package com.wsh.designmodes.state.practise2;

/**
 * Created by laobai on 2017/4/3.
 */

abstract class State {
    public abstract void on(Switch s);

    public abstract void off(Switch s);
}

package com.wsh.designmodes.state.practise1;

/**
 * Created by laobai on 2017/4/3.
 */

public interface State {
    void dispoie(int fee);
    void withdraw(int fee);
    void calculateInterest();
    void checkState();
}

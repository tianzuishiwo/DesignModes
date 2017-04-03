package com.wsh.designmodes.state.practise1;

/**
 * Created by laobai on 2017/4/3.
 */

public class MyAccount extends Account{
    public MyAccount(int balance) {
        super( balance);
    }

    public void dispoie(int fee) {
        mState.dispoie(fee);
        calculateInterest();
//        checkState();
    }

    public void withdraw(int fee) {
        mState.withdraw(fee);
        calculateInterest();
//        checkState();
    }

    public void calculateInterest() {
        mState.calculateInterest();
    }


}

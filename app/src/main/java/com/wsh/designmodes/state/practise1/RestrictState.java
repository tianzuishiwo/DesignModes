package com.wsh.designmodes.state.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/4/3.
 */

public class RestrictState implements State{
    private Account mAccount;

    public RestrictState(Account account) {
        mAccount = account;
    }

    @Override
    public void dispoie(int fee) {
        mAccount.setBalance(fee);
        checkState();
    }

    @Override
    public void withdraw(int fee) {
        mAccount.setBalance(fee);
        checkState();
    }

    @Override
    public void calculateInterest() {
        XLog.e("受限状态，计算利息！");
    }

    public void checkState() {
        int balance = mAccount.getBalance();
        if (balance > 0) {
            mAccount.setState(new NormalState(mAccount));
        } else if
                (balance < 0 && balance > -2000) {
            mAccount.setState(new OverState(mAccount));
        } else if (balance<-2000){
            mAccount.setState(new RestrictState(mAccount));
        }
    }
}

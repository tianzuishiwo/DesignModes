package com.wsh.designmodes.state.practise1;

/**
 * Created by laobai on 2017/4/3.
 */

public abstract class Account {
    protected State mState;

    protected int balance;

    public Account(int balance) {
        mState = new NormalState(this);
        this.balance = balance;
    }

    public abstract void dispoie(int fee);

    public abstract void withdraw(int fee);

    public abstract void calculateInterest();

    //    public void dispoie(int fee) {
    //        mState.dispoie(fee);
    //        checkState();
    //    }
    //
    //    public void withdraw(int fee) {
    //        mState.withdraw(fee);
    //        checkState();
    //    }
    //
    //    public void calculateInterest() {
    //        mState.calculateInterest();
    //    }
    //
    //    public void checkState() {
    //        //TODO 通过余额检查状态
    //        if (balance > 0) {
    //            mState = new NormalState(this);
    //        } else if
    //            (balance < 0 && balance > -2000) {
    //            mState = new OverState(this);
    //        } else if (balance<-2000){
    //            mState = new RestrictState(this);
    //        }
    //
    //        XLog.w("当前状态："+mState.getClass().getName());
    //        calculateInterest();
    //    }
    public void setState(State state) {
        mState = state;
    }

    public void setBalance(int fee) {
        this.balance = balance + fee;
    }

    public int getBalance() {
        return balance;
    }
}

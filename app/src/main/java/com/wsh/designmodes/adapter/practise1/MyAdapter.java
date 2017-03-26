package com.wsh.designmodes.adapter.practise1;

/**
 * Created by laobai on 2017/3/26.
 */

public class MyAdapter implements Target {
    private Adaptee mAdaptee;

    public void setAdaptee(Adaptee adaptee) {
        mAdaptee = adaptee;
    }

    @Override
    public int[] sort(int[] aars) {
        return mAdaptee.quickSort(aars);
    }
}

package com.wsh.designmodes.bridge.practise1;

/**
 * Created by laobai on 2017/4/3.
 */

public abstract class AbstractPic {
    protected ImplInfter mImplInfter;

    public void setImplInfter(ImplInfter implInfter) {
        mImplInfter = implInfter;
    }

    public abstract void parseFile(String fileName);

}

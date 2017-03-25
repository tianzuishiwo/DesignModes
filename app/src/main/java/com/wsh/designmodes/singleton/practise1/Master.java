package com.wsh.designmodes.singleton.practise1;

/**
 * Created by laobai on 2017/3/25.
 */

public class Master {
    private Master() {
    }

    private static Master instance = new Master();

    public static Master getInstance(){
        return instance;
    }
}

package com.wsh.designmodes.facade.practise1;

/**
 * Created by laobai on 2017/3/26.
 */

public class FacadeManager {
    private FacadeManager() {
    }

    private static class SINGLETON{
        private static final FacadeManager INSTANCE = new FacadeManager();
    }

    public static FacadeManager getInstance(){
        return SINGLETON.INSTANCE;
    }

    public void method(){
        new Sub1().method1();
        new Sub2().method2();
        new Sub3().method3();
    }
}

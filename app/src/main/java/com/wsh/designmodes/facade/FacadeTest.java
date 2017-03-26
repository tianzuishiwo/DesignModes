package com.wsh.designmodes.facade;

import com.wsh.designmodes.XLog;
import com.wsh.designmodes.facade.practise1.FacadeManager;
import com.wsh.designmodes.facade.practise2.FacadeFirst;
import com.wsh.designmodes.facade.practise2.FacadeSecond;
import com.wsh.designmodes.facade.practise2.IFacade;

/**
 * Created by laobai on 2017/3/26.
 */

public class FacadeTest {
    private FacadeTest() {
    }

    private static class SINGLETON {
        private static final FacadeTest INSTANCE = new FacadeTest();
    }

    public static FacadeTest getInstance() {
        return SINGLETON.INSTANCE;
    }

    public void test() {
//        testPractise1();// 普通外观模式
        testPractise2();// 抽象外观模式
    }

    private void testPractise2() {
        IFacade iFacade;

        iFacade = new FacadeFirst();
        iFacade.method();
        XLog.i("-=================================-");
        iFacade = new FacadeSecond();
        iFacade.method();
    }

    private void testPractise1() {
        FacadeManager.getInstance().method();
    }
}

package com.wsh.designmodes.bridge;

import com.wsh.designmodes.bridge.practise1.GIFPic;
import com.wsh.designmodes.bridge.practise1.JPGPic;
import com.wsh.designmodes.bridge.practise1.LinuxImpl;
import com.wsh.designmodes.bridge.practise1.MacImpl;
import com.wsh.designmodes.bridge.practise1.PNGPic;
import com.wsh.designmodes.bridge.practise1.WindowsImpl;

/**
 * Created by laobai on 2017/4/3.
 */

public class BridgeTest {
    private BridgeTest() {
    }

    private static class SINGLETON{
        private static final BridgeTest INSTANCE = new BridgeTest();
    }

    public static BridgeTest getInstance(){
        return SINGLETON.INSTANCE;
    }

    public void test(){
        testPractise1();
    }

    private void testPractise1() {
        LinuxImpl linux = new LinuxImpl();
        MacImpl   mac   = new MacImpl();
        WindowsImpl windows = new WindowsImpl();

        JPGPic jpgPic = new JPGPic();
        jpgPic.setImplInfter(linux);
        jpgPic.parseFile("美女");
        jpgPic.setImplInfter(mac);
        jpgPic.parseFile("美女");
        jpgPic.setImplInfter(windows);
        jpgPic.parseFile("美女");


        GIFPic gifPic = new GIFPic();
        gifPic.setImplInfter(linux);
        gifPic.parseFile("车模");
        gifPic.setImplInfter(mac);
        gifPic.parseFile("车模");
        gifPic.setImplInfter(windows);
        gifPic.parseFile("车模");

        PNGPic pngPic = new PNGPic();
        pngPic.setImplInfter(linux);
        pngPic.parseFile("女明星");
        pngPic.setImplInfter(mac);
        pngPic.parseFile("女明星");
        pngPic.setImplInfter(windows);
        pngPic.parseFile("女明星");
    }
}

package com.wsh.designmodes.bridge.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/4/3.
 */

public class JPGPic extends AbstractPic{
    @Override
    public void parseFile(String fileName) {
        XLog.w("这是jpg图片："+fileName);
        mImplInfter.doPain(new Matrx());
        XLog.i("==============================");
    }
}

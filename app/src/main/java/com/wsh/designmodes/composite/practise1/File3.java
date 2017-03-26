package com.wsh.designmodes.composite.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/26.
 */

public class File3 extends BaseFile implements Component{
    public File3(String name) {
        super(name);
    }

    @Override
    public void addComponent(Component component) {
        throw new RuntimeException("非法操作！！！");
    }

    @Override
    public void removeComponent(Component component) {
        throw new RuntimeException("非法操作！！！");
    }

    @Override
    public void opration() {
        XLog.i("---- 干活了 " + name);
    }

    @Override
    public Component getChild(int i) {
        throw new RuntimeException("非法操作！！！");
    }
}

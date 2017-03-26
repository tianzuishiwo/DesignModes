package com.wsh.designmodes.composite.practise1;

import com.wsh.designmodes.XLog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by laobai on 2017/3/26.
 */

public class Folder2 extends BaseFile implements Component{
    public Folder2(String name) {
        super(name);
    }

    private List<Component> mComponentList = new ArrayList<>();

    @Override
    public void addComponent(Component component) {
        mComponentList.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        mComponentList.remove(component);
    }

    @Override
    public void opration() {
        XLog.e("---- 干活了 " + name);
        for (Component component: mComponentList) {
            component.opration();
        }
    }

    @Override
    public Component getChild(int i) {
        return mComponentList.get(i);
    }
}

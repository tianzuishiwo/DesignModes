package com.wsh.designmodes.prototype.practise3;

/**
 * Created by laobai on 2017/3/25.
 */

public class ZhaoMin implements IBeauty{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ZhaoMin{" +
               "name='" + name + '\'' +
               '}';
    }

    @Override
    public IBeauty clone() {
        Object object = null;
        try {
            object= super.clone();
            return (IBeauty) object;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

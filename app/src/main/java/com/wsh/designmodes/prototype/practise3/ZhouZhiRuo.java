package com.wsh.designmodes.prototype.practise3;

/**
 * Created by laobai on 2017/3/25.
 */

public class ZhouZhiRuo implements IBeauty{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "ZhouZhiRuo{" +
               "name='" + name + '\'' +
               '}';
    }

    @Override
    public IBeauty clone() {
        Object object = null;
        try {
            object=super.clone();
            return (IBeauty) object;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

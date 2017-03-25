package com.wsh.designmodes.prototype.practise2;

import java.io.Serializable;

/**
 * Created by laobai on 2017/3/25.
 */

public class AttachMent implements Serializable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AttachMent{" +
               "name='" + name + '\'' +
               '}';
    }
}

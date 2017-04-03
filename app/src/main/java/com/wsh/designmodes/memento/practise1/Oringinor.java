package com.wsh.designmodes.memento.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/4/3.
 */

public class Oringinor {
    private String name;
    private int    x;
    private int    y;

    public Oringinor(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Memento save() {
        return new Memento(this);
    }

    public void restore(Memento memento) {
        this.name = memento.getName();
        this.x = memento.getX();
        this.y = memento.getY();
        XLog.e("现在吃后悔药！");
    }

    @Override
    public String toString() {
        return "Oringinor{" +
               "name='" + name + '\'' +
               ", x=" + x +
               ", y=" + y +
               '}';
    }
}

package com.wsh.designmodes.memento.practise1;

/**
 * Created by laobai on 2017/4/3.
 */

public class Memento {
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

    private String name;
    private int    x;
    private int    y;

    private Oringinor mOringinor;

    public Memento(Oringinor oringinor) {
        mOringinor = oringinor;
        this.name = oringinor.getName();
        this.x = oringinor.getX();
        this.y = oringinor.getY();
    }
}

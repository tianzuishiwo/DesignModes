package com.wsh.designmodes.memento.practise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by laobai on 2017/4/3.
 */

public class CareTaker {
//    private Memento mMemento;
    private List<Memento> mList = new ArrayList<>();

    public Memento getMemento(int i) {
        return mList.get(i);
    }

    public void setMemento(Memento memento) {
//        mMemento = memento;
        mList.add(memento);
    }

    public CareTaker(Memento memento) {

//        mMemento = memento;
        mList.add(memento);
    }
}

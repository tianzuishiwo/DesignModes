package com.wsh.designmodes.observer.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/4/2.
 */

public class Person2 implements Observer{
    private String name;
    private Subject mSubject;

    public Person2(String name, Subject subject) {
        this.name = name;
        mSubject = subject;
        attach();
    }

    public Person2(String name) {
        this.name = name;
    }

    @Override
    public void notifyObserver() {
        help();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void help() {
        XLog.i("敢伤我兄弟，留下狗命，"+name+"在此！");
    }

    public void attach(){
        mSubject.addObserver(this);
    }

    public void dettach(){
        mSubject.removeObserver(this);
    }

    @Override
    public void attack() {
        mSubject.notifyObservers(name);
    }

}

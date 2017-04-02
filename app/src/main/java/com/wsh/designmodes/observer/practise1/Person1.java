package com.wsh.designmodes.observer.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/4/2.
 */

public class Person1 implements Observer{
    private String name;
    private Subject mSubject;

    public Person1(String name, Subject subject) {
        this.name = name;
        mSubject = subject;
        attach();
    }

    public Person1(String name) {
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

    public void help(){
        XLog.i("兄弟撑住！ "+name+"赶来支援！");
    }

    @Override
    public void attack() {
        mSubject.notifyObservers(name);
    }

    public void attach(){
        mSubject.addObserver(this);
    }

    public void dettach(){
        mSubject.removeObserver(this);
    }
}

package com.wsh.designmodes.observer.practise1;

import com.wsh.designmodes.XLog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by laobai on 2017/4/2.
 */

public class AllySubject implements com.wsh.designmodes.observer.practise1.Subject{
    private List<Observer> mList = new ArrayList<>();
    private String allyName;

    public AllySubject(String allyName) {
        this.allyName = allyName;
        XLog.w("大陆历贰零零柒年："+allyName+" , 正式成立，从此大陆格局进入战国时代！");
    }

    @Override
    public void addObserver(Observer observer) {
        XLog.i(observer.getName()+" , 加入"+allyName);
        mList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        XLog.i(observer.getName()+" , 退出"+allyName);
        mList.remove(observer);
    }

    @Override
    public void notifyObservers(String name) {
        XLog.e("十万火急！ "+name+"遭到围殴，请求支援！！！");
        for (Observer observer: mList) {
            observer.notifyObserver();
        }
    }

    @Override
    public String getName() {
        return allyName;
    }


}

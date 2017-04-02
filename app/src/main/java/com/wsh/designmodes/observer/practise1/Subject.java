package com.wsh.designmodes.observer.practise1;

/**
 * Created by laobai on 2017/4/2.
 */

public interface  Subject {
    /*private List<Observer> mList = new ArrayList<>();

    public void add(Observer observer){
        if (mList!=null){
            mList.add(observer);
        }
    }

    public void remove(Observer observer){
        if (mList!=null){
            mList.remove(observer);
        }
    }*/

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String name);
    String getName();
}

package com.wsh.designmodes.iterator.practise1;

import java.util.List;

/**
 * Created by laobai on 2017/4/2.
 */

public abstract class AbstractObjectList {
    public abstract MyIterator creatIterator();

    protected List<Object> lists;

    public AbstractObjectList(List<Object> lists) {
        this.lists = lists;
    }

    public List<Object> getObjects(){
        return lists;
    }

    public void addObject(Object object){
        if (lists!=null){
            lists.add(object);
        }
    }

    public void removeObject(Object object){
        if (lists!=null){
            lists.remove(object);
        }
    }

    public int size(){
        if (lists!=null){
            return lists.size();
        }
        return 0;
    }
}

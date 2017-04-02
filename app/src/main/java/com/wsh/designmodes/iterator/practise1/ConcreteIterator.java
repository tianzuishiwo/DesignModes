package com.wsh.designmodes.iterator.practise1;

import java.util.List;

/**
 * Created by laobai on 2017/4/2.
 */

public class ConcreteIterator implements MyIterator{
    private AbstractObjectList mAbstractObjectList;
    private List<Object>       mList;

    private int cursor1 = 0;
    private int cursor2 = -1;

    public ConcreteIterator(AbstractObjectList abstractObjectList) {
        mAbstractObjectList = abstractObjectList;
        mList = abstractObjectList.getObjects();
        cursor2 = mList.size()-1;
    }

    @Override
    public void first() {
        cursor1=0;
    }

    @Override
    public void last() {
        cursor2=mList.size()-1;
    }

    @Override
    public void next() {
//        if (cursor1<mList.size()-1){
        if (cursor1<mList.size()){
            cursor1++;
        }
    }

    @Override
    public void previous() {
        if (cursor2>-1){
            cursor2--;
        }
    }

    @Override
    public Object currentItem() {
        return mList.get(cursor1);
    }

    @Override
    public Object previousItem() {
        return mList.get(cursor2);
    }

    @Override
    public Object nextItem() {
        return mList.get(cursor1+1);
    }

    @Override
    public boolean hasNext() {
        return cursor1<mList.size();
    }

    @Override
    public boolean isLast() {
        return cursor1==(mList.size()-1);
    }

    @Override
    public boolean hasPrevious() {
        return cursor2>-1;
    }
}

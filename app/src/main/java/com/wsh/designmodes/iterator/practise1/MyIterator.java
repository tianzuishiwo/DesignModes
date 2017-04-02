package com.wsh.designmodes.iterator.practise1;

/**
 * Created by laobai on 2017/4/2.
 */

public interface MyIterator {
    void first();
    void last();
    void next();
    void previous();
    Object currentItem();
    Object previousItem();
    Object nextItem();
    boolean hasNext();
    boolean isLast();
    boolean hasPrevious();
}

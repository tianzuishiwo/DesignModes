package com.wsh.designmodes.iterator;

import com.wsh.designmodes.XLog;
import com.wsh.designmodes.iterator.practise1.MyIterator;
import com.wsh.designmodes.iterator.practise1.ProductList;

import java.util.ArrayList;

/**
 * Created by laobai on 2017/4/2.
 */

public class IteratorTest {
    private IteratorTest() {
    }

    private static class SINGLETON{
        private static final IteratorTest INSTANCE = new IteratorTest();
    }

    public static IteratorTest getInstance(){
        return SINGLETON.INSTANCE;
    }

    public void test(){
        testPractise1();
    }

    private void testPractise1() {ArrayList<Object> lists = new ArrayList<>();
        lists.add("九阳神功");
        lists.add("九阴真经");
        lists.add("独孤九剑");
        lists.add("一阳指");
        lists.add("北冥神功");
        lists.add("爱的代价");

        ProductList productList = new ProductList(lists);
        MyIterator  iterator    = productList.creatIterator();

        while (iterator.hasNext()){
            String currentItem = (String) iterator.currentItem();
            iterator.next();
            XLog.e("currentItem=" + currentItem);
        }

        while (iterator.hasPrevious()){
            String previousItem = (String) iterator.previousItem();
            iterator.previous();
            XLog.w("previousItem="+previousItem);
        }

        XLog.e("=====================分割线============================");
        productList.removeObject("一阳指");
        productList.addObject("大自然的叹息");
        productList.addObject("雅典娜之怒");

        iterator.first();
        iterator.last();

        while (iterator.hasNext()){
            String currentItem = (String) iterator.currentItem();
            iterator.next();
            XLog.e("currentItem="+currentItem);
        }

        while (iterator.hasPrevious()){
            String previousItem = (String) iterator.previousItem();
            iterator.previous();
            XLog.w("previousItem="+previousItem);
        }
    }
}

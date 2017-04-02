package com.wsh.designmodes.iterator.practise1;

import java.util.ArrayList;

/**
 * Created by laobai on 2017/4/2.
 */

public class ProductList extends AbstractObjectList{

    public ProductList(ArrayList<Object> lists) {
        super(lists);
    }

    @Override
    public MyIterator creatIterator() {
        return new ConcreteIterator(this);
    }


}

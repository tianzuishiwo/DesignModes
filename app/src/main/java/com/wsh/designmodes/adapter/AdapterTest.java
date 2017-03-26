package com.wsh.designmodes.adapter;

import com.wsh.designmodes.XLog;
import com.wsh.designmodes.adapter.practise1.Adaptee;
import com.wsh.designmodes.adapter.practise1.Client2;
import com.wsh.designmodes.adapter.practise1.MyAdapter;

/**
 * Created by laobai on 2017/3/26.
 */

public class AdapterTest {
    private AdapterTest() {
    }

    private static class SINGLETON{
        private static final AdapterTest INSTANCE = new AdapterTest();
    }

    public static AdapterTest getInstance(){
        return SINGLETON.INSTANCE;
    }

    public void test(){
        testPractise1();// 对象适配器
        // 类适配器，java不支持多继承，很难使用
        // 单接口适配  大接口--》小接口


    }

    private void testPractise1() {Adaptee adaptee = new Adaptee();
        MyAdapter                         adapter = new MyAdapter();
        adapter.setAdaptee(adaptee);

        Client2 client2 = new Client2();
        client2.operate(adapter);
        XLog.w(client2.toString());
    }

    //    class My extends BaseAdapter{
//
//        @Override
//        public int getCount() {
//            return 0;
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return null;
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return 0;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            return null;
//        }
//    }
}

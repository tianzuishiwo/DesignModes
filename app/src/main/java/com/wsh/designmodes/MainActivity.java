package com.wsh.designmodes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wsh.designmodes.adapter.AdapterTest;
import com.wsh.designmodes.factory.FactoryTest;
import com.wsh.designmodes.prototype.PrototypeTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        XLog.i("设计模式学习");
        XLog.d("设计模式学习");
        XLog.v("设计模式学习");
        XLog.w("设计模式学习");
        XLog.e("设计模式学习");
//        XLog.w("设计模式学习");
        test();
    }

    private void test() {
//        testSingleTon();
//        testFactory();
//        testPrototype();
        testAdapter();
    }

    private void testAdapter() {
        AdapterTest.getInstance().test();
    }

    private void testPrototype() {
        PrototypeTest.getInstance().test();
    }

    private void testFactory() {
        FactoryTest.getInstance().test();
    }

    private void testSingleTon() {
//        SingleTonTest.getInstance().test();

    }
}

package com.wsh.designmodes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wsh.designmodes.adapter.AdapterTest;
import com.wsh.designmodes.command.CommandTest;
import com.wsh.designmodes.composite.CompositeTest;
import com.wsh.designmodes.decorator.DecoratorTest;
import com.wsh.designmodes.facade.FacadeTest;
import com.wsh.designmodes.factory.FactoryTest;
import com.wsh.designmodes.iterator.IteratorTest;
import com.wsh.designmodes.prototype.PrototypeTest;
import com.wsh.designmodes.proxy.ProxyTest;
import com.wsh.designmodes.template.TemplateTest;

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
//        testAdapter();
//        testComposite();
//        testDecorator();
//        testFacade();
//        testTemplateTest();
//        testProxy();
//        testCommand();
        testIterator();
    }

    private void testIterator() {
        IteratorTest.getInstance().test();
    }

    private void testCommand() {
        CommandTest.getInstance().test();
    }

    private void testProxy() {
        ProxyTest.getInstance().test();
    }

    private void testTemplateTest() {
        TemplateTest.getInstance().test();
    }

    private void testFacade() {
        FacadeTest.getInstance().test();
    }

    private void testDecorator() {
        DecoratorTest.getInstance().test();
    }

    private void testComposite() {
        CompositeTest.getIntance().test();
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

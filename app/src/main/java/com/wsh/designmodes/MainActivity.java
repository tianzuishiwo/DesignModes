package com.wsh.designmodes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wsh.designmodes.adapter.AdapterTest;
import com.wsh.designmodes.bridge.BridgeTest;
import com.wsh.designmodes.command.CommandTest;
import com.wsh.designmodes.composite.CompositeTest;
import com.wsh.designmodes.decorator.DecoratorTest;
import com.wsh.designmodes.facade.FacadeTest;
import com.wsh.designmodes.factory.FactoryTest;
import com.wsh.designmodes.iterator.IteratorTest;
import com.wsh.designmodes.memento.MementoTest;
import com.wsh.designmodes.observer.ObserverTest;
import com.wsh.designmodes.prototype.PrototypeTest;
import com.wsh.designmodes.proxy.ProxyTest;
import com.wsh.designmodes.singleton.SingleTonTest;
import com.wsh.designmodes.state.StateTest;
import com.wsh.designmodes.strategy.StrategyTest;
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

    //排序
    //三星  桥接3
    //二星  备忘录2 中介者3 职责连3 建造者4
    //一星  享元4 访问者4 解释器5
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
//        testIterator();
//        testObserver();
//        testState();
//        testStrategy();
//        testBridge();
        testMemento();
    }

    private void testMemento() {
        MementoTest.getInstance().test();
    }

    private void testBridge() {
        BridgeTest.getInstance().test();
    }

    private void testStrategy() {
        StrategyTest.getInstance().test();
    }

    private void testState() {
        StateTest.getIntance().test();
    }

    private void testObserver() {
        ObserverTest.getInstance().test();
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
        SingleTonTest.getInstance().test();
    }
}

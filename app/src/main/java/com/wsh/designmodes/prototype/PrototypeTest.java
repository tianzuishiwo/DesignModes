package com.wsh.designmodes.prototype;

import com.wsh.designmodes.XLog;
import com.wsh.designmodes.prototype.practise1.DailyWeek;
import com.wsh.designmodes.prototype.practise2.AttachMent;
import com.wsh.designmodes.prototype.practise2.DailWeekV2;

/**
 * Created by laobai on 2017/3/25.
 */

public class PrototypeTest {
    private PrototypeTest() {
    }

    private static class SINGLETON {
        private static final PrototypeTest INSTANCE = new PrototypeTest();
    }

    public static PrototypeTest getInstance() {
        return SINGLETON.INSTANCE;
    }

    public void test() {
        //        testPractise1();// 浅克隆
//        testPractise2();// 深克隆
        testPractise3();// 克隆管理器
    }

    private void testPractise3() {
        // 略
    }

    private void testPractise2() {
        DailWeekV2 dailWeekV2 = new DailWeekV2();
        dailWeekV2.setName("周芷若");
        dailWeekV2.setDate("4月份");
        AttachMent attachMent = new AttachMent();
        attachMent.setName("附件：机关算尽");
        dailWeekV2.setAttachMent(attachMent);
        dailWeekV2.setContent("排除异己，一战功成，成就武林盟主！");

        XLog.w(dailWeekV2.toString());

        DailWeekV2 v2=dailWeekV2.clone();
        AttachMent attachMent1 = v2.getAttachMent();
        XLog.e("一致否？ "+(attachMent==attachMent1));
        XLog.w("一致否？ "+(attachMent==attachMent));
    }

    private void testPractise1() {
        DailyWeek dailyWeek = new DailyWeek();
        dailyWeek.setName("赵敏");
        dailyWeek.setDate("3月份");
        dailyWeek.setContent("血洗江湖很卖力，效果良好");
        XLog.w(dailyWeek.toString());

        DailyWeek newPerson;
        newPerson = (DailyWeek) dailyWeek.clone();
        XLog.e(newPerson.toString());
    }


}

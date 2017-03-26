package com.wsh.designmodes.template.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/26.
 */

public  abstract class BaseChart {
    public void process(){
        getData();
        if (isChangeToXML()){
            changeData();
        }
        display();
    }

    protected abstract  void getData();

    protected boolean isChangeToXML(){// 钩子方法
        return true;
    }

    protected abstract void display();

    protected void changeData(){
        XLog.w("进行数据转换！！！");
    }
}

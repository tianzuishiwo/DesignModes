package com.wsh.designmodes.template.practise2;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/4/3.
 */

public  abstract class AbstractCount {
    private String countName;
    private int password;

    public AbstractCount(String countName, int password) {
        this.countName = countName;
        this.password = password;
    }

    public void templateMethod(){
        if (validate(countName,password)){
            calculateInterest();
            if (isHook()){
                display();
            }
        }
    }

    protected boolean validate(String countName,int password){
        if ("张小凡".equals(countName) && 123456==password){
            XLog.w("张小凡登录成功！");
            return true;
        }
        XLog.e("账户错误，登录失败");
        return false;
    }

    protected abstract void calculateInterest();

    protected void display(){
        XLog.i("来吧，开始炫富！");
    }

    protected boolean isHook(){
        XLog.i("考虑，要不要装逼？");
        return false;
    }
}

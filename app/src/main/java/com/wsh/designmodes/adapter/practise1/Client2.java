package com.wsh.designmodes.adapter.practise1;

/**
 * Created by laobai on 2017/3/26.
 */

public class Client2 {
    public Client2() {
    }

    private int[] arrs = {23, 12, 15, 18};

    public void operate(Target target) {
        target.sort(arrs);
    }

    public String toString(){
        return ""+arrs[0]+" "+arrs[1]+" "+arrs[2]+" "+arrs[3];
    }
}

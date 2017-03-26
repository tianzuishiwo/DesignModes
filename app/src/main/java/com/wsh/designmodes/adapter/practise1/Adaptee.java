package com.wsh.designmodes.adapter.practise1;

import java.util.Arrays;

/**
 * Created by laobai on 2017/3/26.
 */

public class Adaptee {
    public int[] quickSort(int[] arrs) {
        if (arrs != null && arrs.length > 0) {
            Arrays.sort(arrs);
            return arrs;
        }
        return arrs;
    }
}

package com.wsh.designmodes.strategy.practise1;

/**
 * Created by laobai on 2017/4/3.
 */

public class Store {
    private int oringinalPrice;
//    private String  type;

    private Discount mDiscount;

    public Store(int oringinalPrice) {
        this.oringinalPrice = oringinalPrice;
    }

//    public void setType(String type) {
//        this.type = type;
//    }

    public void setDiscount(Discount discount) {
        mDiscount = discount;
    }

    public void getPrice(){
        mDiscount.calculate(oringinalPrice);
    }
}

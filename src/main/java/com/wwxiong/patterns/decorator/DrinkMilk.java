package com.wwxiong.patterns.decorator;

/**
 * �����װ����
 */
public class DrinkMilk extends Decorator {

    /**
     * ������
     *
     * @param obj
     */
    public DrinkMilk(Drink obj) {
        super(obj);
        setDes("DrinkMilk");
        setPrice(2.0f);
    }

}

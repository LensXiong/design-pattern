package com.wwxiong.patterns.decorator;

/**
 * �����װ����
 */
public class DrinkSoy extends Decorator {

    /**
     * ������
     *
     * @param obj
     */
    public DrinkSoy(Drink obj) {
        super(obj);
        setDes("DrinkSoy ");
        setPrice(1.5f);
    }

}

package com.wwxiong.patterns.decorator;

/**
 * 具体的装饰者
 */
public class DrinkSoy extends Decorator {

    /**
     * 构造器
     *
     * @param obj
     */
    public DrinkSoy(Drink obj) {
        super(obj);
        setDes("DrinkSoy ");
        setPrice(1.5f);
    }

}

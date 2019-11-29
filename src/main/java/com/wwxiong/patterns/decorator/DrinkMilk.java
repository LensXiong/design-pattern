package com.wwxiong.patterns.decorator;

/**
 * 具体的装饰者
 */
public class DrinkMilk extends Decorator {

    /**
     * 构造器
     *
     * @param obj
     */
    public DrinkMilk(Drink obj) {
        super(obj);
        setDes("DrinkMilk");
        setPrice(2.0f);
    }

}
